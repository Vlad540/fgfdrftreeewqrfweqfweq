package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;

/* renamed from: c0  reason: default package */
public final class c0 extends b97 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0() {
        super(1);
        this.a = 7;
        this.b = l8.b;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return obj == ((x1) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ((ArrayList) this.b).add((String) obj);
                return jue.a;
            case 2:
                Throwable th = (Throwable) obj;
                s37 s37 = (s37) this.b;
                if (th == null) {
                    if (!s37.a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    s37.a.cancel(true);
                } else {
                    b4d b4d = s37.a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    b4d.k(th);
                }
                return jue.a;
            case 3:
                return obj == ((ec9) this.b) ? "(this)" : String.valueOf(obj);
            case 4:
                e4b e4b = e4b.f;
                e4b.d = (hv1) obj;
                fja.g((Context) this.b);
                return e4b;
            case 5:
                Void voidR = (Void) obj;
                return ((hv1) this.b).j;
            case 6:
                return obj == ((kc9) this.b) ? "(this)" : String.valueOf(obj);
            case 7:
                return ((s16) this.b).invoke();
            case 8:
                ((u16) this.b).invoke(obj);
                return obj;
            case 9:
                fz6 fz6 = (fz6) obj;
                return ((CharSequence) this.b).subSequence(fz6.a, fz6.b + 1).toString();
            default:
                rc1 rc1 = (rc1) obj;
                EGLSurface eGLSurface = ((um1) this.b).a;
                if (!(eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE)) {
                    EGLDisplay eGLDisplay = rc1.e;
                    if (eGLDisplay != null) {
                        rc1.b(eGLSurface);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                        rc1.a("clearImage()");
                    } else {
                        throw new CallOpenGLContext.CallOpenGLContextNotInitialized();
                    }
                }
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }
}
