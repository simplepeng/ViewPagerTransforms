package com.simple.transformslibrary;

import android.view.View;

public class RotationTransform extends TransformAdapter {


    @Override
    public void onLeftScorlling(View view, float position) {
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight());
        view.setRotation(position * 90f);
    }

}
