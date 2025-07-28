package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: xwa  reason: default package */
public final class xwa extends k0 {
    public final el8 A;
    public ov0 B;
    public o3e C;
    public boolean D;
    public zy E;
    public ur3 F;
    public HashSet G;
    public tr6 H;
    public tr6 I;
    public final q64 y;
    public final zy z;

    public xwa(Resources resources, bd4 bd4, h54 h54, ExecutorService executorService, qe4 qe4, zy zyVar) {
        super(bd4, executorService);
        this.y = new q64(resources, h54);
        this.z = zyVar;
        this.A = qe4;
    }

    public static glc s(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof glc) {
            return (glc) drawable;
        }
        if (drawable instanceof xm4) {
            return s(((xm4) drawable).j());
        }
        if (drawable instanceof nr) {
            nr nrVar = (nr) drawable;
            int length = nrVar.c.length;
            for (int i = 0; i < length; i++) {
                glc s = s(nrVar.a(i));
                if (s != null) {
                    return s;
                }
            }
        }
        return null;
    }

    public static Drawable u(zy zyVar, b13 b13) {
        Drawable a;
        if (zyVar == null) {
            return null;
        }
        Iterator it = zyVar.iterator();
        while (it.hasNext()) {
            wm4 wm4 = (wm4) it.next();
            if (wm4.b(b13) && (a = wm4.a(b13)) != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable b(Object obj) {
        e13 e13 = (e13) obj;
        try {
            n06.s();
            ez3.o(e13.n0(e13));
            b13 b13 = (b13) e13.e0();
            v(b13);
            Drawable u = u(this.E, b13);
            if (u == null) {
                u = u(this.z, b13);
                if (u == null) {
                    u = this.y.a(b13);
                    if (u == null) {
                        throw new UnsupportedOperationException("Unrecognized image class: " + b13);
                    }
                }
            }
            n06.s();
            return u;
        } catch (Throwable th) {
            n06.s();
            throw th;
        }
    }

    public final oq6 e(Object obj) {
        e13 e13 = (e13) obj;
        ez3.o(e13.n0(e13));
        return ((b13) e13.e0()).getImageInfo();
    }

    public final synchronized void t(ImagePerfDataListener imagePerfDataListener, n0 n0Var) {
        try {
            ur3 ur3 = this.F;
            if (ur3 != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ur3.h;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                ur3.v(false);
                ((d) ur3.d).Z1();
            }
            if (imagePerfDataListener != null) {
                if (this.F == null) {
                    this.F = new ur3(AwakeTimeSinceBootClock.get(), this);
                }
                ur3 ur32 = this.F;
                if (((CopyOnWriteArrayList) ur32.h) == null) {
                    ur32.h = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) ur32.h).add(imagePerfDataListener);
                this.F.v(true);
            }
            this.H = (tr6) n0Var.e;
            this.I = (tr6) n0Var.f;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final String toString() {
        jg8 X = at7.X(this);
        X.h(super.toString(), "super");
        X.h(this.C, "dataSourceSupplier");
        return X.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = s(r1.d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.b13 r4) {
        /*
            r3 = this;
            boolean r0 = r3.D
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.drawable.Drawable r0 = r3.i
            if (r0 != 0) goto L_0x0023
            r14 r0 = new r14
            r0.<init>()
            yq6 r1 = new yq6
            r1.<init>(r0)
            r3.a(r1)
            r3.i = r0
            y66 r1 = r3.h
            if (r1 == 0) goto L_0x0023
            lfc r1 = r1.d
            r1.X = r0
            r1.invalidateSelf()
        L_0x0023:
            android.graphics.drawable.Drawable r0 = r3.i
            boolean r1 = r0 instanceof defpackage.r14
            if (r1 == 0) goto L_0x007a
            r14 r0 = (defpackage.r14) r0
            java.lang.String r1 = r3.j
            r0.getClass()
            if (r1 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            java.lang.String r1 = "none"
        L_0x0035:
            r0.a = r1
            r0.invalidateSelf()
            y66 r1 = r3.h
            r2 = 0
            if (r1 == 0) goto L_0x004a
            lfc r1 = r1.d
            glc r1 = s(r1)
            if (r1 == 0) goto L_0x004a
            ilc r1 = r1.X
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            r0.X = r1
            java.lang.Object r3 = r3.k
            if (r3 != 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.String r2 = r3.toString()
        L_0x0056:
            if (r2 == 0) goto L_0x005f
            java.util.HashMap r3 = r0.Y
            java.lang.String r1 = "cc"
            r3.put(r1, r2)
        L_0x005f:
            if (r4 == 0) goto L_0x0077
            int r3 = r4.getWidth()
            int r1 = r4.getHeight()
            r0.b = r3
            r0.c = r1
            r0.invalidateSelf()
            int r3 = r4.getSizeInBytes()
            r0.o = r3
            goto L_0x007a
        L_0x0077:
            r0.b()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwa.v(b13):void");
    }

    public final void w(ln4 ln4) {
        if (m75.a.i(2)) {
            m75.f(k0.x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, ln4);
        }
        this.a.a(ln4 != null ? jn4.a : jn4.b);
        if (this.m) {
            this.b.b(this);
            n();
        }
        y66 y66 = this.h;
        if (y66 != null) {
            lfc lfc = y66.d;
            lfc.X = null;
            lfc.invalidateSelf();
            this.h = null;
        }
        if (ln4 != null) {
            if (ln4 instanceof y66) {
                y66 y662 = (y66) ln4;
                this.h = y662;
                lfc lfc2 = y662.d;
                lfc2.X = (r14) this.i;
                lfc2.invalidateSelf();
            } else {
                throw new IllegalArgumentException();
            }
        }
        v((b13) null);
    }
}
