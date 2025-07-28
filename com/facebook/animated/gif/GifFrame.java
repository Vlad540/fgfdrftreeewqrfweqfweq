package com.facebook.animated.gif;

import android.graphics.Bitmap;

public class GifFrame {
    @lj4
    private long mNativeContext;

    @lj4
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @lj4
    private native void nativeDispose();

    @lj4
    private native void nativeFinalize();

    @lj4
    private native int nativeGetDisposalMode();

    @lj4
    private native int nativeGetDurationMs();

    @lj4
    private native int nativeGetHeight();

    @lj4
    private native int nativeGetTransparentPixelColor();

    @lj4
    private native int nativeGetWidth();

    @lj4
    private native int nativeGetXOffset();

    @lj4
    private native int nativeGetYOffset();

    @lj4
    private native boolean nativeHasTransparency();

    @lj4
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final void a() {
        nativeDispose();
    }

    public final int b() {
        return nativeGetDisposalMode();
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final int d() {
        return nativeGetWidth();
    }

    public final int e() {
        return nativeGetXOffset();
    }

    public final int f() {
        return nativeGetYOffset();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final void g(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
