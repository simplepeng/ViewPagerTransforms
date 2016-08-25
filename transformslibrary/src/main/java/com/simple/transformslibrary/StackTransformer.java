package com.simple.transformslibrary;

import android.view.View;

public class StackTransformer extends TransformAdapter {

	@Override
	public void onTransform(View view, float position) {
		view.setTranslationX(position < 0 ? 0f : -view.getWidth() * position);
	}

}
