package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: oo3  reason: default package */
public final class oo3 {
    public final tt0 a;
    public final qmc b;
    public final di3 c;
    public final kn3 d;
    public final gsc e;
    public volatile List f = Collections.emptyList();
    public volatile List g = Collections.emptyList();
    public final qmc h;
    public final ajb i;
    public final HashSet j = new HashSet();
    public volatile String k = "";
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(true);

    public oo3(g15 g15, tt0 tt0, qmc qmc, qmc qmc2, di3 di3, kn3 kn3, gsc gsc) {
        this.a = tt0;
        this.b = qmc;
        this.c = di3;
        this.d = kn3;
        this.e = gsc;
        this.h = qmc2;
        ajb ajb = new ajb();
        this.i = ajb;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        qmc a2 = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        g15 g152 = g15;
        new kv9(ajb, 1, timeUnit, a2, false).n(qmc2).a(new c97(new zx1(22, this), new zx1(23, g15), z3d.i));
        a();
    }

    public final void a() {
        if (!this.l.get()) {
            String str = this.k;
            if (!r1g.c(this.k, str)) {
                this.n.set(true);
            }
            this.k = str;
            tic.a(new f5(5, this), this.h, (j6) null, new no3(0), (qmc) null);
            this.l.set(true);
            return;
        }
        this.i.c(0);
    }

    public final void b() {
        udd.q("oo3", "updateDataWorker: start");
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b();
        long currentTimeMillis2 = System.currentTimeMillis();
        long currentTimeMillis3 = System.currentTimeMillis();
        List k2 = this.c.k();
        long currentTimeMillis4 = System.currentTimeMillis();
        if (r1g.p(this.k)) {
            kn3 kn3 = this.d;
            kn3.getClass();
            Collections.sort(k2, new i63(2, kn3));
            udd.p("oo3", "updateDataWorker: update %d contacts. fetchTime=%dms, sortTime=%dms", new Object[]{Integer.valueOf(k2.size()), Long.valueOf(currentTimeMillis4 - currentTimeMillis3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis4)});
            this.f = k2;
        } else if (this.n.compareAndSet(true, false)) {
            String str = this.k;
            gsc gsc = this.e;
            if (!r1g.p(str)) {
                if (!(k2 instanceof Collection) || !k2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : k2) {
                        try {
                            if (gsc.g((tf3) next, str)) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    k2 = arrayList;
                } else {
                    k2 = Collections.emptyList();
                }
            }
            this.d.b(k2);
            this.g = k2;
        }
        long currentTimeMillis5 = System.currentTimeMillis();
        udd.p("oo3", "updateDataWorker: done. awaitLoading=%dms, update=%dms, total=%dms", new Object[]{Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis5 - currentTimeMillis2), Long.valueOf(currentTimeMillis5 - currentTimeMillis)});
        this.m.set(true);
        this.b.b(new ds1(17, this));
    }

    @a1e
    public void onEvent(to7 to7) {
        a();
    }

    @a1e
    public void onEvent(lp3 lp3) {
        this.n.set(true);
        a();
    }

    @a1e
    public void onEvent(fve fve) {
        a();
    }
}
