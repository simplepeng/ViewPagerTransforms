package com.simple.transformslibrary;

import android.view.View;

public class CardSlideTransformer extends TransformAdapter {

    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    @Override
    public void onTransform(View view, float position) {
        if (position >= -1 || position <= 1) {

            final float height = view.getHeight();
            final float width = view.getWidth();
            final float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
            final float vertMargin = height * (1 - scaleFactor) / 2;
            final float horzMargin = width * (1 - scaleFactor) / 2;


            view.setPivotY(0.5f * height);
            view.setPivotX(0.5f * width);

            if (position < 0) {
                view.setTranslationX(horzMargin - vertMargin / 2);
            } else {
                view.setTranslationX(-horzMargin + vertMargin / 2);
            }


            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);


            view.setAlpha(MIN_ALPHA + (scaleFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 - MIN_ALPHA));
        }
    }

}
