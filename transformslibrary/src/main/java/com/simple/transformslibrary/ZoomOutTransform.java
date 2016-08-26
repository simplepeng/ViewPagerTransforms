package com.simple.transformslibrary;

import android.view.View;

/**
 * 缩放
 */
public class ZoomOutTransform extends TransformAdapter {

    @Override
    public void onRightScorlling(View view, float position) {

    }

    @Override
    public void onLeftScorlling(View view, float position) {
        view.setScaleX(1 + position);
        view.setScaleY(1 + position);
    }

    @Override
    public void onCenterIdle(View view) {

    }

}
