package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: qb6  reason: default package */
public final class qb6 implements rmc, usf, p15 {
    public static final String y0 = a24.e0("GreedyScheduler");
    public final qd4 X;
    public boolean Y;
    public final Object Z;
    public final Context a;
    public final itf b;
    public final ydc c;
    public final HashSet o = new HashSet();
    public final f2b w0 = new f2b(8);
    public Boolean x0;

    public qb6(Context context, sa3 sa3, j8e j8e, itf itf) {
        this.a = context;
        this.b = itf;
        this.c = new ydc(j8e, this);
        this.X = new qd4(this, sa3.e);
        this.Z = new Object();
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            btf o2 = vx3.o((ztf) it.next());
            a24 B = a24.B();
            B.t(y0, "Constraints not met: Cancelling work ID " + o2);
            nqd k = this.w0.k(o2);
            if (k != null) {
                itf itf = this.b;
                itf.d.c(new uyd(itf, k, false));
            }
        }
    }

    public final void b(btf btf, boolean z) {
        this.w0.k(btf);
        synchronized (this.Z) {
            try {
                Iterator it = this.o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ztf ztf = (ztf) it.next();
                    if (vx3.o(ztf).equals(btf)) {
                        a24 B = a24.B();
                        String str = y0;
                        B.t(str, "Stopping tracking for " + btf);
                        this.o.remove(ztf);
                        this.c.G(this.o);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return false;
    }

    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.x0;
        itf itf = this.b;
        if (bool == null) {
            sa3 sa3 = itf.b;
            int i = o4b.a;
            this.x0 = Boolean.valueOf(hhd.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        boolean booleanValue = this.x0.booleanValue();
        String str2 = y0;
        if (!booleanValue) {
            a24.B().P(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.Y) {
            itf.f.a(this);
            this.Y = true;
        }
        a24 B = a24.B();
        B.t(str2, "Cancelling work ID " + str);
        qd4 qd4 = this.X;
        if (!(qd4 == null || (runnable = (Runnable) qd4.c.remove(str)) == null)) {
            ((Handler) qd4.b.b).removeCallbacks(runnable);
        }
        for (nqd uyd : this.w0.l(str)) {
            itf.d.c(new uyd(itf, uyd, false));
        }
    }

    public final void e(ztf... ztfArr) {
        boolean containsKey;
        boolean containsKey2;
        if (this.x0 == null) {
            sa3 sa3 = this.b.b;
            int i = o4b.a;
            this.x0 = Boolean.valueOf(hhd.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        if (!this.x0.booleanValue()) {
            a24.B().P(y0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.Y) {
            this.b.f.a(this);
            this.Y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ztf ztf : ztfArr) {
            btf o2 = vx3.o(ztf);
            f2b f2b = this.w0;
            synchronized (f2b.b) {
                containsKey = ((LinkedHashMap) f2b.c).containsKey(o2);
            }
            if (!containsKey) {
                long a2 = ztf.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (ztf.b != ctf.a) {
                    continue;
                } else if (currentTimeMillis < a2) {
                    qd4 qd4 = this.X;
                    if (qd4 != null) {
                        HashMap hashMap = qd4.c;
                        Runnable runnable = (Runnable) hashMap.remove(ztf.a);
                        gvf gvf = qd4.b;
                        if (runnable != null) {
                            ((Handler) gvf.b).removeCallbacks(runnable);
                        }
                        p36 p36 = new p36((Object) qd4, (Object) ztf, false, 5);
                        hashMap.put(ztf.a, p36);
                        ((Handler) gvf.b).postDelayed(p36, ztf.a() - System.currentTimeMillis());
                    }
                } else if (ztf.c()) {
                    if3 if3 = ztf.j;
                    if (if3.c) {
                        a24.B().t(y0, "Ignoring " + ztf + ". Requires device idle.");
                    } else if (!if3.h.isEmpty()) {
                        a24.B().t(y0, "Ignoring " + ztf + ". Requires ContentUri triggers.");
                    } else {
                        hashSet.add(ztf);
                        hashSet2.add(ztf.a);
                    }
                } else {
                    f2b f2b2 = this.w0;
                    btf o3 = vx3.o(ztf);
                    synchronized (f2b2.b) {
                        containsKey2 = ((LinkedHashMap) f2b2.c).containsKey(o3);
                    }
                    if (!containsKey2) {
                        a24.B().t(y0, "Starting work for " + ztf.a);
                        this.b.h(this.w0.m(vx3.o(ztf)), (w4g) null);
                    }
                }
            }
        }
        synchronized (this.Z) {
            try {
                if (!hashSet.isEmpty()) {
                    a24.B().t(y0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.o.addAll(hashSet);
                    this.c.G(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        boolean containsKey;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            btf o2 = vx3.o((ztf) it.next());
            f2b f2b = this.w0;
            synchronized (f2b.b) {
                containsKey = ((LinkedHashMap) f2b.c).containsKey(o2);
            }
            if (!containsKey) {
                a24 B = a24.B();
                B.t(y0, "Constraints met: Scheduling work ID " + o2);
                this.b.h(f2b.m(o2), (w4g) null);
            }
        }
    }
}
