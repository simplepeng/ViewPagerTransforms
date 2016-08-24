package com.simple.transformslibrary;

import android.view.View;

/**
 * #d翻转
 */
public class Like3DReversalTransform extends TransformAdapter {


    @Override
    public void onRightScorlling(View view, float position) {
        view.setPivotX(0);
        view.setRotationY(90f * position);
    }

    @Override
    public void onLeftScorlling(View view, float position) {
        view.setPivotX(view.getWidth());
        view.setRotationY(90f * position);
    }

    @Override
    public void onCenterIdle(View view) {

    }

}
