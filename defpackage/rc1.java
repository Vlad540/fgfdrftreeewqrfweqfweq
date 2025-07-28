package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: rc1  reason: default package */
public final class rc1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final xwb a;
    public final u16 b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final bxf k;

    public rc1(xwb xwb, EGLContext eGLContext, int[] iArr, h87 h87, String str) {
        xwb xwb2 = xwb;
        this.a = xwb2;
        this.b = h87;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        String str2 = str == null ? "CallOpenGL" : str;
        this.j = str2;
        handlerThread.start();
        bxf bxf = new bxf(handlerThread.getLooper(), xwb2, str2.concat("_timings"), new h87(1, this, rc1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 20));
        this.k = bxf;
        xwb2.log(str2, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                xwb2.log(str2, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            bxf.postAtFrontOfQueue(new g5((Object) this, (Object) iArr, (Object) eGLContext, 9));
            xwb2.log(str2, "OpenGL context initialization task submitted");
        }
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(eglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                EGLDisplay eGLDisplay = this.e;
                if (eGLDisplay == null) {
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                } else if (hhd.f(EGL14.eglGetCurrentContext(), this.d) && hhd.f(this.g, eGLSurface)) {
                } else {
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        this.g = eGLSurface;
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
                }
            } else {
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
        } else {
            throw new RuntimeException("Wrong surface in makeCurrent()");
        }
    }

    public final boolean c(u16 u16) {
        try {
            return this.k.post(new qc1(u16, this, 0));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final boolean d(u16 u16) {
        try {
            return this.k.postAtFrontOfQueue(new qc1(u16, this, 1));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final void e(EGLSurface eGLSurface) {
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLDisplay eGLDisplay = this.e;
            if (eGLDisplay != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                int decrementAndGet = l.decrementAndGet();
                this.a.log(this.j, "Surface destroyed, total count is " + decrementAndGet);
                return;
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
