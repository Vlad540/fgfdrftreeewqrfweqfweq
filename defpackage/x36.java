package defpackage;

import android.opengl.GLES20;

/* renamed from: x36  reason: default package */
public final class x36 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ z36 c;

    public x36(z36 z36, int i, float f) {
        this.c = z36;
        this.a = i;
        this.b = f;
    }

    public final void run() {
        z36 z36 = this.c;
        if (!z36.h) {
            z36.a();
        }
        GLES20.glUniform1f(this.a, this.b);
    }
}
