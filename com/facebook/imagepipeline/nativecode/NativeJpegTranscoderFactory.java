package com.facebook.imagepipeline.nativecode;

@lj4
public class NativeJpegTranscoderFactory implements wr6 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @lj4
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, java.lang.Object, vr6] */
    @lj4
    public vr6 createImageTranscoder(lq6 lq6, boolean z) {
        if (lq6 != o84.a) {
            return null;
        }
        ? obj = new Object();
        obj.a = z;
        obj.b = this.a;
        obj.c = this.b;
        if (this.c) {
            jjd.l();
        }
        return obj;
    }
}
