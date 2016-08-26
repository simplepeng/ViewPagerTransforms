package com.simple.transformslibrary;

import android.view.View;

public class ZoomBothTransform extends TransformAdapter {

    @Override
    public void onRightScorlling(View view, float position) {
        view.setScaleX(1 - position / 2);
        view.setScaleY(1 - position / 2);
    }

    @Override
    public void onLeftScorlling(View view, float position) {
        view.setScaleX(1 + position / 2);
        view.setScaleY(1 + position / 2);
    }

}
