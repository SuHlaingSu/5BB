package com.fivebb.selfcare.services

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fivebb.selfcare.R
import ss.com.bannerslider.ImageLoadingService

class GlideImageLoadingService : ImageLoadingService {

    lateinit var context: Context

    constructor(context: Context)  {
        this.context = context
    }

    override fun loadImage(url: String?, imageView: ImageView) {
        Glide.with(context).load(url).into(imageView)
    }

    override fun loadImage(resource: Int, imageView: ImageView) {
        Glide.with(context).load(resource).into(imageView)
    }

    override fun loadImage(url: String?, placeHolder: Int, errorDrawable: Int, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .apply(RequestOptions().placeholder(R.drawable.ic_unchecked_border_primary).error(R.drawable.help))
            .into(imageView)
    }
}