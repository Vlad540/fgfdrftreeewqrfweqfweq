package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.CancellationSignal;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;

/* renamed from: av3  reason: default package */
public final class av3 extends b97 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av3(Object obj, int i, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((g37) this.c).cancel((CancellationException) null);
                return jue.a;
            case 1:
                agd agd = (agd) obj;
                oj1 oj1 = (oj1) this.b;
                boolean a2 = oj1.b.a.a();
                w2d w2d = (w2d) this.c;
                pe1 pe1 = oj1.b;
                if (a2 || hhd.f(pe1.k, w2d)) {
                    nu7 nu7 = agd.a;
                    pe1.g(w2d, (List) nu7.a);
                    for (ie1 ie1 : (List) nu7.b) {
                        oj1.e.n.onStateChanged(ie1.b, ie1);
                    }
                }
                return jue.a;
            case 2:
                ((pe0) this.b).d.b((xwb) this.c, "P2PNetworkStatusReporter", (String) obj);
                return jue.a;
            default:
                rc1 rc1 = (rc1) obj;
                sc1 sc1 = (sc1) this.b;
                rc1.e(sc1.a);
                Surface surface = (Surface) this.c;
                EGLSurface eGLSurface = null;
                if (!(!surface.isValid() || (eGLDisplay = rc1.e) == null || (eGLConfig = rc1.f) == null)) {
                    eGLSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        rc1.b(eGLSurface);
                        GLES20.glPixelStorei(3317, 1);
                        rc1.a.log(rc1.j, wn6.h(rc1.l.incrementAndGet(), "Surface created, total count is "));
                    } else {
                        throw new CallOpenGLContext.CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                }
                sc1.a = eGLSurface;
                return jue.a;
        }
    }
}
