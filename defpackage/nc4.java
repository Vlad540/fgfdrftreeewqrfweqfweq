package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: nc4  reason: default package */
public final /* synthetic */ class nc4 implements tn1, au {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ nc4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public void a() {
        rc4 rc4 = (rc4) this.a;
        Executor executor = (Executor) this.b;
        l4f l4f = (l4f) this.c;
        ew0 ew0 = (ew0) this.o;
        if (rc4.r) {
            Objects.requireNonNull(l4f);
            executor.execute(new oc4(0, l4f));
            b24.a();
            return;
        }
        synchronized (rc4.o) {
            try {
                jn jnVar = rc4.l;
                if (jnVar != null) {
                    ew0.v(new lc4(rc4, jnVar, 1));
                    rc4.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ch7 apply(Object obj) {
        ch7 ch7;
        q7e q7e = (q7e) this.a;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        e2d e2d = (e2d) this.c;
        List list = (List) this.o;
        List list2 = (List) obj;
        if (q7e.u.b) {
            Iterator it = q7e.b.j().iterator();
            while (it.hasNext()) {
                ((p7e) it.next()).j();
            }
        }
        synchronized (q7e.a) {
            try {
                if (q7e.l) {
                    ch7 = new as6(1, new CancellationException("Opener is disabled"));
                } else {
                    s30 s30 = q7e.b;
                    synchronized (s30.b) {
                        ((LinkedHashSet) s30.X).add(q7e);
                    }
                    vn1 f = hwf.f(new nc4(q7e, list, new wwc(cameraDevice), e2d));
                    q7e.g = f;
                    ct0.a(f, new nfc(29, (Object) q7e), pa2.j());
                    ch7 = ct0.A(q7e.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ch7;
    }

    public String z(sn1 sn1) {
        boolean z;
        String str;
        int i;
        p7e p7e = (p7e) this.a;
        List list = (List) this.b;
        wwc wwc = (wwc) this.c;
        e2d e2d = (e2d) this.o;
        synchronized (p7e.a) {
            try {
                synchronized (p7e.a) {
                    synchronized (p7e.a) {
                        try {
                            List<xc4> list2 = p7e.j;
                            if (list2 != null) {
                                for (xc4 b2 : list2) {
                                    b2.b();
                                }
                                p7e.j = null;
                            }
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((xc4) list.get(i2)).b();
                            }
                            throw e;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    z = false;
                    if (!list.isEmpty()) {
                        i = 0;
                        do {
                            ((xc4) list.get(i)).d();
                            i++;
                        } while (i < list.size());
                    }
                    p7e.j = list;
                }
                if (p7e.h == null) {
                    z = true;
                }
                e07.p("The openCaptureSessionCompleter can only set once!", z);
                p7e.h = sn1;
                tt1 tt1 = (tt1) wwc.b;
                tt1.getClass();
                SessionConfiguration sessionConfiguration = e2d.a.a;
                sessionConfiguration.getClass();
                ((CameraDevice) tt1.b).createCaptureSession(sessionConfiguration);
                str = "openCaptureSession[session=" + p7e + "]";
            } catch (CameraAccessException e2) {
                throw new CameraAccessExceptionCompat(e2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
