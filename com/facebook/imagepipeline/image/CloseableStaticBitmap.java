package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import java.util.Map;

public interface CloseableStaticBitmap extends b13 {
    static CloseableStaticBitmap of(Bitmap bitmap, nbc nbc, tjb tjb, int i) {
        return of(bitmap, nbc, tjb, i, 0);
    }

    e13 cloneUnderlyingBitmapReference();

    /* synthetic */ void close();

    e13 convertToBitmapReference();

    int getExifOrientation();

    /* synthetic */ Map getExtras();

    /* synthetic */ int getHeight();

    /* synthetic */ oq6 getImageInfo();

    /* synthetic */ tjb getQualityInfo();

    int getRotationAngle();

    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    /* synthetic */ int getWidth();

    /* synthetic */ boolean isClosed();

    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(e13 e13, tjb tjb, int i) {
        return of(e13, tjb, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, nbc nbc, tjb tjb, int i, int i2) {
        int i3 = u54.x0;
        return new u54(bitmap, nbc, tjb, i, i2);
    }

    static CloseableStaticBitmap of(e13 e13, tjb tjb, int i, int i2) {
        int i3 = u54.x0;
        return new u54(e13, tjb, i, i2);
    }
}
