package com.fivebb.selfcare.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import com.fivebb.selfcare.R
import kotlinx.android.synthetic.main.fragment_ads_slider.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [AdsSliderFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AdsSliderFragment : Fragment() {

    companion object {

        const val IMAGE = "Image"
        const val IMAGE_URL = "Image Url"

//        fun newInstance(image: Int) : AdsSliderFragment {
//            val fragment = AdsSliderFragment()
//            val args = Bundle()
//            args.putInt(IMAGE, image)
//            fragment.arguments = args
//
//            return fragment
//        }

        fun newInstance(imageUrl: String) : AdsSliderFragment {
            val fragment = AdsSliderFragment()
            val args = Bundle()
            args.putString(IMAGE_URL, imageUrl)
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ads_slider, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
//            Glide.with(view.context)
//                .load(it.getInt(IMAGE))
//                .into(view.ivAdsSlide)

            it.getString(IMAGE_URL)?.let { url ->
                Glide.with(view.context)
                    .load(url)
                    .into(view.ivAdsSlide)
            }
        }

    }
}
