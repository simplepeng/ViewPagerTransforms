package com.simple.transformslibrary;

import android.view.View;

public class StackZoomInTransform extends TransformAdapter {

    @Override
    public void onRightScorlling(View view, float position) {
        view.setTranslationX(view.getWidth() * -position);
        view.setScaleX(1 - position);
        view.setScaleY(1 - position);
    }

}
