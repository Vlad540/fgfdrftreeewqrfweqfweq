package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@lj4
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        int i = jr6.a;
        kjd.D("imagepipeline");
    }

    @lj4
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = false;
        ez3.j(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        ez3.j(Boolean.valueOf(bitmap.isMutable()));
        ez3.j(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @lj4
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
