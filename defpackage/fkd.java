package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: fkd  reason: default package */
public final class fkd implements ck8 {
    public final long a;
    public final ch2 b;
    public final pae c;
    public final long d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final AtomicInteger h;
    public final grd i;
    public final grd j;
    public final t0c k;
    public final t0c l;

    public fkd(long j2, ch2 ch2, f03 f03, t97 t97, t97 t972, t97 t973, pae pae, t97 t974) {
        t97 t975 = t97;
        pae pae2 = pae;
        this.a = j2;
        this.b = ch2;
        this.c = pae2;
        this.d = ((lqc) f03).s();
        this.e = t975;
        this.f = t972;
        this.g = t973;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.h = atomicInteger;
        grd a2 = hrd.a(Integer.valueOf(atomicInteger.get()));
        this.i = a2;
        n3a n3a = (n3a) pae2;
        ContextScope a3 = n1g.a(n3a.a());
        grd a4 = hrd.a((Object) null);
        this.j = a4;
        grd a5 = hrd.a((Object) null);
        this.k = new t0c(a5);
        this.l = ez3.d0(ez3.h0(a2, new zl5((Continuation) null, this, 8)), a3, ucd.a, hw4.a);
        xs7.E(a3, (hu3) null, (ru3) null, new dkd(t975, this, t974, (Continuation) null), 3);
        ez3.N(ez3.J(new ck5(new w09(ez3.z(ez3.x(a4, 200)), this, 9), new tg9(2, a5, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), 5), n3a.b()), a3);
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final pj5 b() {
        return this.k;
    }

    public final boolean c() {
        return false;
    }

    public final t0c d() {
        return this.l;
    }

    public final void e() {
        this.i.m((Object) null, Integer.valueOf(this.h.incrementAndGet()));
    }
}
