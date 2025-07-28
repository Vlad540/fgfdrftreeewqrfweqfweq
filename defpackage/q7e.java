package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: q7e  reason: default package */
public final class q7e extends p7e {
    public final ScheduledExecutorService n;
    public final Object o = new Object();
    public List p;
    public og7 q;
    public final z40 r;
    public final e3 s;
    public final pb8 t;
    public final ga3 u;
    public final AtomicBoolean v;

    /* JADX WARNING: type inference failed for: r3v3, types: [z40, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, e3] */
    public q7e(xe6 xe6, xe6 xe62, s30 s30, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(s30, executor, scheduledExecutorService, handler);
        boolean z = false;
        this.v = new AtomicBoolean(false);
        ? obj = new Object();
        obj.a = xe62.i(TextureViewIsClosedQuirk.class);
        obj.b = xe6.i(PreviewOrientationIncorrectQuirk.class);
        obj.c = xe6.i(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = obj;
        this.t = new pb8((xe6.i(CaptureSessionStuckQuirk.class) || xe6.i(IncorrectCaptureStateQuirk.class)) ? true : z);
        ? obj2 = new Object();
        obj2.a = (CaptureSessionOnClosedNotCalledQuirk) xe62.j(CaptureSessionOnClosedNotCalledQuirk.class);
        this.s = obj2;
        this.u = new ga3(xe62, 4);
        this.n = scheduledExecutorService;
    }

    public final void c(p7e p7e) {
        vn1 vn1;
        synchronized (this.o) {
            this.r.b(this.p);
        }
        synchronized (this.a) {
            try {
                if (!this.k) {
                    this.k = true;
                    e07.o(this.g, "Need to call openCaptureSession before using this API.");
                    vn1 = this.g;
                } else {
                    vn1 = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.a) {
            try {
                List<xc4> list = this.j;
                if (list != null) {
                    for (xc4 b : list) {
                        b.b();
                    }
                    this.j = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.t.d();
        if (vn1 != null) {
            vn1.b.c(new o7e(this, p7e, 1), pa2.j());
        }
    }

    public final void e(q7e q7e) {
        ArrayList arrayList;
        p7e p7e;
        p7e p7e2;
        p7e p7e3;
        e3 e3Var = this.s;
        s30 s30 = this.b;
        synchronized (s30.b) {
            arrayList = new ArrayList((LinkedHashSet) s30.X);
        }
        ArrayList j = this.b.j();
        if (((CaptureSessionOnClosedNotCalledQuirk) e3Var.a) != null) {
            LinkedHashSet<p7e> linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (p7e3 = (p7e) it.next()) != q7e) {
                linkedHashSet.add(p7e3);
            }
            for (p7e p7e4 : linkedHashSet) {
                p7e4.getClass();
                p7e4.d(p7e4);
            }
        }
        Objects.requireNonNull(this.e);
        s30 s302 = this.b;
        synchronized (s302.b) {
            ((LinkedHashSet) s302.c).add(this);
            ((LinkedHashSet) s302.X).remove(this);
        }
        Iterator it2 = s302.l().iterator();
        while (it2.hasNext() && (p7e2 = (p7e) it2.next()) != this) {
            q7e q7e2 = (q7e) p7e2;
            synchronized (q7e2.a) {
                try {
                    List<xc4> list = q7e2.j;
                    if (list != null) {
                        for (xc4 b : list) {
                            b.b();
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
        this.e.e(q7e);
        if (((CaptureSessionOnClosedNotCalledQuirk) e3Var.a) != null) {
            LinkedHashSet<p7e> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it3 = j.iterator();
            while (it3.hasNext() && (p7e = (p7e) it3.next()) != q7e) {
                linkedHashSet2.add(p7e);
            }
            for (p7e p7e5 : linkedHashSet2) {
                p7e5.getClass();
                p7e5.c(p7e5);
            }
        }
    }

    public final int i(ArrayList arrayList, xq1 xq1) {
        CameraCaptureSession.CaptureCallback a = this.t.a(xq1);
        e07.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((b2b) this.f.b).b).captureBurstRequests(arrayList, this.c, a);
    }

    public final void j() {
        if (this.v.compareAndSet(false, true)) {
            if (this.u.b) {
                try {
                    e07.o(this.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((b2b) this.f.b).b).abortCaptures();
                } catch (Exception e) {
                    e.toString();
                }
            }
            this.t.c().c(new pzb(24, this), this.c);
        }
    }

    public final ch7 m(CameraDevice cameraDevice, e2d e2d, List list) {
        ch7 A;
        synchronized (this.o) {
            try {
                ArrayList j = this.b.j();
                ArrayList arrayList = new ArrayList();
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    q7e q7e = (q7e) ((p7e) it.next());
                    arrayList.add(hwf.f(new b52(q7e.t.c(), q7e.n, 1500, 7)));
                }
                og7 K = ct0.K(arrayList);
                this.q = K;
                j36 a = j36.a(K);
                nc4 nc4 = new nc4(this, cameraDevice, e2d, list);
                Executor executor = this.c;
                a.getClass();
                A = ct0.A(ct0.N(a, nc4, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
        return A;
    }

    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a = this.t.a(captureCallback);
        e07.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((b2b) this.f.b).b).setSingleRepeatingRequest(captureRequest, this.c, a);
    }

    public final ch7 o(ArrayList arrayList) {
        ch7 o2;
        synchronized (this.o) {
            this.p = arrayList;
            o2 = super.o(arrayList);
        }
        return o2;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.o) {
            try {
                if (l()) {
                    this.r.b(this.p);
                } else {
                    og7 og7 = this.q;
                    if (og7 != null) {
                        og7.cancel(true);
                    }
                }
                j36 j36 = null;
                try {
                    synchronized (this.a) {
                        if (!this.l) {
                            j36 j362 = this.i;
                            if (j362 != null) {
                                j36 = j362;
                            }
                            this.l = true;
                        }
                        z = !l();
                    }
                    if (j36 != null) {
                        j36.cancel(true);
                    }
                } catch (Throwable th) {
                    if (j36 != null) {
                        j36.cancel(true);
                    }
                    throw th;
                }
            } finally {
            }
        }
        return z;
    }
}
