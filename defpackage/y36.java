package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: y36  reason: default package */
public final class y36 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float[] c;
    public final /* synthetic */ z36 o;

    public /* synthetic */ y36(z36 z36, int i, float[] fArr, int i2) {
        this.a = i2;
        this.o = z36;
        this.b = i;
        this.c = fArr;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z36 z36 = this.o;
                if (!z36.h) {
                    z36.a();
                }
                GLES20.glUniform2fv(this.b, 1, FloatBuffer.wrap(this.c));
                return;
            default:
                z36 z362 = this.o;
                if (!z362.h) {
                    z362.a();
                }
                GLES20.glUniform4fv(this.b, 1, FloatBuffer.wrap(this.c));
                return;
        }
    }
}
