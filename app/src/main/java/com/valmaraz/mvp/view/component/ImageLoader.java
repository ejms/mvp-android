package com.valmaraz.mvp.view.component;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class ImageLoader {

    public static void loadImage(Context context, String url, ImageView iv) {
        Picasso.with(context).load(url).into(iv);
    }
}
