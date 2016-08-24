package com.simple.transformslibrary;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * PageTransformer 基类
 */
public abstract class TransformAdapter implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {

        if (position > 0 && position <= 1) {
            onRightScorlling(page, position);
        } else if (position < 0 && position >= -1) {
            onLeftScorlling(page, position);
        } else if (position == 0) {
            onCenterIdle(page);
        }

    }

    public abstract void onRightScorlling(View view, float position);

    public abstract void onLeftScorlling(View view, float position);

    public abstract void onCenterIdle(View view);
}
