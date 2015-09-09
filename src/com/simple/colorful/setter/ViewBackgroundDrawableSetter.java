package com.simple.colorful.setter;

import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * 
 * @author mrsimple
 * 
 */
public final class ViewBackgroundDrawableSetter extends BaseSetter {

	public ViewBackgroundDrawableSetter(View targetView, int resId) {
		super(targetView, resId);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setValue(Theme newTheme, int themeId) {
		TypedArray a = newTheme.obtainStyledAttributes(themeId,
				new int[] { mResId });
		int attributeResourceId = a.getResourceId(0, 0);
		Drawable drawable = mView.getResources().getDrawable(
				attributeResourceId);
		a.recycle();
		mView.setBackgroundDrawable(drawable);
	}

}