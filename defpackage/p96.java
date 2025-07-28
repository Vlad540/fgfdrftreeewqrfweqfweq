package defpackage;

import android.opengl.GLES20;

/* renamed from: p96  reason: default package */
public final class p96 {
    public static final p96 e = new p96(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public p96(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a() {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            gt0.g();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            gt0.g();
        }
    }
}
