package com.simple.transformslibrary;

import android.view.View;

public class RotateDownTransformer extends TransformAdapter {

    private static final float ROT_MOD = -15f;

    @Override
    public void onTransform(View view, float position) {
        final float width = view.getWidth();
        final float height = view.getHeight();
        final float rotation = ROT_MOD * position * -1.25f;

        view.setPivotX(width * 0.5f);
        view.setPivotY(height);
        view.setRotation(rotation);
    }


}
