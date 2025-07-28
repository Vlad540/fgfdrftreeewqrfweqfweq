package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@lj4
public class NativeBlurFilter {
    static {
        kjd.D("native-filters");
    }

    @lj4
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
