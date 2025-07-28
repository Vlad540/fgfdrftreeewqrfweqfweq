package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@lj4
public class NativeRoundingFilter {
    static {
        kjd.D("native-filters");
    }

    @lj4
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @lj4
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @lj4
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @lj4
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @lj4
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @lj4
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
