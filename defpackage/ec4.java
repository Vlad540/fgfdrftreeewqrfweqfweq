package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* renamed from: ec4  reason: default package */
public final /* synthetic */ class ec4 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc4 b;

    public /* synthetic */ ec4(jc4 jc4, int i) {
        this.a = i;
        this.b = jc4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jc4 jc4 = this.b;
                jc4.getClass();
                EGLDisplay x = gt0.x();
                jc4.m = x;
                int[] iArr = gt0.b;
                h96 h96 = jc4.c;
                jc4.n = h96.p(h96.j(x, 2, iArr), jc4.m);
                return;
            case 1:
                jc4 jc42 = this.b;
                h96 h962 = jc42.c;
                try {
                    w4g w4g = jc42.e;
                    w4g.getClass();
                    try {
                        k96 k96 = (k96) w4g.o;
                        if (k96 != null) {
                            GLES20.glDeleteProgram(k96.a);
                            gt0.g();
                        }
                    } catch (GlUtil$GlException e) {
                        ez3.B("Error releasing GL Program", e);
                    }
                    jc42.i.d();
                    EGLDisplay eGLDisplay = jc42.m;
                    EGLSurface eGLSurface = jc42.n;
                    if (eGLDisplay != null) {
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                            gt0.f("Error destroying surface");
                        }
                    }
                    try {
                        EGLDisplay eGLDisplay2 = jc42.m;
                        eGLDisplay2.getClass();
                        h962.v(eGLDisplay2);
                        return;
                    } catch (GlUtil$GlException e2) {
                        ez3.B("Error releasing GL objects", e2);
                        return;
                    }
                } catch (GlUtil$GlException e3) {
                    ez3.B("Error releasing GL resources", e3);
                    EGLDisplay eGLDisplay3 = jc42.m;
                    eGLDisplay3.getClass();
                    h962.v(eGLDisplay3);
                    return;
                } catch (Throwable th) {
                    try {
                        EGLDisplay eGLDisplay4 = jc42.m;
                        eGLDisplay4.getClass();
                        h962.v(eGLDisplay4);
                    } catch (GlUtil$GlException e4) {
                        ez3.B("Error releasing GL objects", e4);
                    }
                    throw th;
                }
            default:
                this.b.b();
                return;
        }
    }
}
