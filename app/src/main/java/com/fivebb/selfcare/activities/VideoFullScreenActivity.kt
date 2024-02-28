package com.fivebb.selfcare.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageButton
import com.fivebb.selfcare.R
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.source.dash.DashMediaSource
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import kotlinx.android.synthetic.main.activity_video_full_screen.*

class VideoFullScreenActivity : BaseActivity() {

    companion object {

        const val VIDEO_URL = "VIDEO_URL"

        const val VIDEO_CURRENT_POSITION = "VIDEO_CURRENT_POSITION"

        const val VIDEO_CURRENT_POSITION_REQUEST_CODE = 400

        fun newIntent(context: Context, url: String, videoPosition: Long) : Intent {
            val intent = Intent(context, VideoFullScreenActivity::class.java)
            intent.putExtra(VIDEO_CURRENT_POSITION, videoPosition)
            intent.putExtra(VIDEO_URL, url)
            return  intent
        }
    }

    private lateinit var mFullScreenShinkImageButton: ImageButton

    private var videoUrl = ""

    private var currentVideoPosition = 0L

    private var player: ExoPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_full_screen)

        setUpFullScreen()
        getIntentExtraData()
        initListeners()
    }

    private fun setUpFullScreen() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    private fun getIntentExtraData() {
        intent.extras?.let {
            videoUrl = it.getString(VIDEO_URL, "")
            currentVideoPosition = it.getLong(VIDEO_CURRENT_POSITION, 0L)

            initializePlayer(videoUrl)
            player?.seekTo(currentVideoPosition)
            player?.playWhenReady = true
        }
    }

    private fun initListeners() {
        mFullScreenShinkImageButton = playerView.findViewById(R.id.exo_fullscreen_button)
        mFullScreenShinkImageButton.setImageDrawable(resources.getDrawable(R.drawable.ic_fullscreen_exit_white_32dp))

        mFullScreenShinkImageButton.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onPause() {
        super.onPause()
        releasePlayer()
    }

    override fun onDestroy() {
        super.onDestroy()
        releasePlayer()
    }

    private fun initializePlayer(uri: String) {
        if (player == null) {
            player = ExoPlayerFactory.newSimpleInstance(
                DefaultRenderersFactory(applicationContext),
                DefaultTrackSelector(),
                DefaultLoadControl()
            )
            playerView?.player = player
        }
        val mediaSource =
            buildMediaSource(Uri.parse(uri))

        player!!.prepare(mediaSource, true, false)

        player!!.addListener(object : Player.EventListener {
            override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters?) {

            }

            override fun onSeekProcessed() {

            }

            override fun onTracksChanged(trackGroups: TrackGroupArray?, trackSelections: TrackSelectionArray?) {

            }

            override fun onLoadingChanged(isLoading: Boolean) {
                if (isLoading) {
                    pbPlayer.visibility = View.VISIBLE
                } else pbPlayer.visibility = View.GONE
            }

            override fun onPositionDiscontinuity(reason: Int) {

            }

            override fun onRepeatModeChanged(repeatMode: Int) {

            }

            override fun onShuffleModeEnabledChanged(shuffleModeEnabled: Boolean) {

            }

            override fun onTimelineChanged(timeline: Timeline?, manifest: Any?, reason: Int) {

            }

            override fun onPlayerError(error: ExoPlaybackException?) {

            }

            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {

            }

        })

    }

    private fun buildMediaSource(uri: Uri): MediaSource {

        val userAgent = FIVEBB

        return when {
            uri.lastPathSegment?.contains(SharedConstants.MEDIA_TYPE_MP4)!! -> ExtractorMediaSource.Factory(
                DefaultHttpDataSourceFactory(userAgent)
            )
                .createMediaSource(uri)
            uri.lastPathSegment!!.contains(SharedConstants.MEDIA_TYPE_M3U8) -> HlsMediaSource.Factory(
                DefaultHttpDataSourceFactory(userAgent)
            )
                .createMediaSource(uri)
            else -> {
                val dashChunkSourceFactory = DefaultDashChunkSource.Factory(
                    DefaultHttpDataSourceFactory(userAgent)
                )
                val manifestDataSourceFactory = DefaultHttpDataSourceFactory(userAgent)
                DashMediaSource.Factory(dashChunkSourceFactory, manifestDataSourceFactory).createMediaSource(uri)
            }
        }
    }

    private fun releasePlayer() {
        if (player != null) {

            player!!.release()
            player = null
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra(VIDEO_CURRENT_POSITION, player?.currentPosition ?: 0L)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}
