package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y4e  reason: default package */
public final class y4e {
    public static final Range p = va0.f;
    public final Object a = new Object();
    public final Size b;
    public final zq4 c;
    public final Range d;
    public final hu1 e;
    public final boolean f;
    public final vn1 g;
    public final sn1 h;
    public final vn1 i;
    public final sn1 j;
    public final sn1 k;
    public final cs6 l;
    public cb0 m;
    public x4e n;
    public Executor o;

    public y4e(Size size, hu1 hu1, boolean z, zq4 zq4, Range range, k4e k4e) {
        this.b = size;
        this.e = hu1;
        this.f = z;
        this.c = zq4;
        this.d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        vn1 f2 = hwf.f(new u4e(atomicReference, str, 0));
        sn1 sn1 = (sn1) atomicReference.get();
        sn1.getClass();
        this.k = sn1;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        vn1 f3 = hwf.f(new u4e(atomicReference2, str, 1));
        this.i = f3;
        ct0.a(f3, new j1c(sn1, 7, f2), pa2.j());
        sn1 sn12 = (sn1) atomicReference2.get();
        sn12.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        vn1 f4 = hwf.f(new u4e(atomicReference3, str, 2));
        this.g = f4;
        sn1 sn13 = (sn1) atomicReference3.get();
        sn13.getClass();
        this.h = sn13;
        cs6 cs6 = new cs6(this, size);
        this.l = cs6;
        ch7 A = ct0.A(cs6.e);
        ct0.a(f4, new duf((Object) A, (Object) sn12, (Object) str), pa2.j());
        A.c(new za4(this, 1), pa2.j());
        mh4 j2 = pa2.j();
        AtomicReference atomicReference4 = new AtomicReference((Object) null);
        ct0.a(hwf.f(new joc(this, 4, atomicReference4)), new mod(28, k4e), j2);
        sn1 sn14 = (sn1) atomicReference4.get();
        sn14.getClass();
        this.j = sn14;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(Surface surface, Executor executor, rf3 rf3) {
        if (!this.h.b(surface)) {
            vn1 vn1 = this.g;
            if (!vn1.isCancelled()) {
                e07.p((String) null, vn1.b.isDone());
                try {
                    vn1.get();
                    executor.execute(new v4e(rf3, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new v4e(rf3, surface, 1));
                    return;
                }
            }
        }
        ct0.a(this.i, new d4b(rf3, 9, surface), executor);
    }

    public final void c(Executor executor, x4e x4e) {
        cb0 cb0;
        synchronized (this.a) {
            this.n = x4e;
            this.o = executor;
            cb0 = this.m;
        }
        if (cb0 != null) {
            executor.execute(new t4e(x4e, cb0, 1));
        }
    }

    public final void d() {
        this.h.d(new Exception("Surface request will not complete."));
    }
}
