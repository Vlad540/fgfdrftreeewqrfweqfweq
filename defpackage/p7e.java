package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: p7e  reason: default package */
public abstract class p7e extends n7e {
    public final Object a = new Object();
    public final s30 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public n7e e;
    public ea6 f;
    public vn1 g;
    public sn1 h;
    public j36 i;
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public p7e(s30 s30, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = s30;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    public final void a(q7e q7e) {
        Objects.requireNonNull(this.e);
        this.e.a(q7e);
    }

    public final void b(q7e q7e) {
        Objects.requireNonNull(this.e);
        this.e.b(q7e);
    }

    public abstract void c(p7e p7e);

    public final void d(p7e p7e) {
        p7e p7e2;
        Objects.requireNonNull(this.e);
        q7e q7e = (q7e) this;
        synchronized (q7e.a) {
            try {
                List<xc4> list = q7e.j;
                if (list != null) {
                    for (xc4 b2 : list) {
                        b2.b();
                    }
                    q7e.j = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        q7e.t.d();
        s30 s30 = this.b;
        Iterator it = s30.l().iterator();
        while (it.hasNext() && (p7e2 = (p7e) it.next()) != this) {
            q7e q7e2 = (q7e) p7e2;
            synchronized (q7e2.a) {
                try {
                    List<xc4> list2 = q7e2.j;
                    if (list2 != null) {
                        for (xc4 b3 : list2) {
                            b3.b();
                        }
                        q7e2.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            q7e2.t.d();
        }
        synchronized (s30.b) {
            ((LinkedHashSet) s30.X).remove(this);
        }
        this.e.d(p7e);
    }

    public final void f(q7e q7e) {
        Objects.requireNonNull(this.e);
        this.e.f(q7e);
    }

    public final void g(p7e p7e) {
        vn1 vn1;
        synchronized (this.a) {
            try {
                if (!this.m) {
                    this.m = true;
                    e07.o(this.g, "Need to call openCaptureSession before using this API.");
                    vn1 = this.g;
                } else {
                    vn1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (vn1 != null) {
            vn1.b.c(new o7e(this, p7e, 0), pa2.j());
        }
    }

    public final void h(q7e q7e, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(q7e, surface);
    }

    public abstract int i(ArrayList arrayList, xq1 xq1);

    public abstract void j();

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new ea6(cameraCaptureSession);
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.g != null;
        }
        return z;
    }

    public abstract ch7 m(CameraDevice cameraDevice, e2d e2d, List list);

    public abstract int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    public ch7 o(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    as6 as6 = new as6(1, new CancellationException("Opener is disabled"));
                    return as6;
                }
                j36 a2 = j36.a(at7.T(arrayList, this.c, this.d));
                joc joc = new joc(this, 5, arrayList);
                Executor executor = this.c;
                a2.getClass();
                oy1 N = ct0.N(a2, joc, executor);
                this.i = N;
                ch7 A = ct0.A(N);
                return A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean p();

    public final ea6 q() {
        this.f.getClass();
        return this.f;
    }
}
