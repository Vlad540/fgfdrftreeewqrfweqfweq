package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: np4  reason: default package */
public final class np4 extends vj4 {
    public int o = -1;
    public int p = -1;
    public final q97 q;
    public final q97 r;

    public np4(q97 q97, q97 q972) {
        this.q = q97;
        this.r = q972;
    }

    public final m90 n(zq4 zq4, Map map) {
        m90 n = super.n(zq4, map);
        this.o = w36.g();
        this.p = w36.g();
        return n;
    }

    public final void q() {
        super.q();
        this.o = -1;
        this.p = -1;
    }

    public final void w(long j, Surface surface, q4e q4e, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        w36.d((AtomicBoolean) this.c, true);
        w36.c((Thread) this.e);
        da0 l = l(surface);
        if (l == w36.j) {
            l = h(surface);
            if (l != null) {
                ((HashMap) this.d).put(surface, l);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = l.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        da0 da0 = l;
        q4e q4e2 = q4e;
        SurfaceTexture surfaceTexture3 = surfaceTexture;
        x(da0, q4e2, surfaceTexture3, this.q, this.o);
        SurfaceTexture surfaceTexture4 = surfaceTexture2;
        x(da0, q4e2, surfaceTexture4, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            s(surface, false);
        }
    }

    public final void x(da0 da0, q4e q4e, SurfaceTexture surfaceTexture, q97 q97, int i) {
        da0 da02 = da0;
        q97 q972 = q97;
        v(i);
        int i2 = da02.b;
        int i3 = da02.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        q4e.n(fArr2, fArr);
        u36 u36 = (u36) this.m;
        u36.getClass();
        if (u36 instanceof v36) {
            GLES20.glUniformMatrix4fv(((v36) u36).f, 1, false, fArr2, 0);
            w36.b("glUniformMatrix4fv");
        }
        float f = q972.e;
        Size size = new Size((int) (((float) i2) * q972.d), (int) (((float) i3) * f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, ((float) size.getWidth()) / ((float) size2.getWidth()), ((float) size.getHeight()) / ((float) size2.getHeight()), 1.0f);
        Matrix.translateM(fArr4, 0, q972.b / q972.d, q972.c / f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(u36.b, 1, false, fArr5, 0);
        w36.b("glUniformMatrix4fv");
        GLES20.glUniform1f(u36.c, q972.a);
        w36.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        w36.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
