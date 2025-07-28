package defpackage;

import java.util.Collections;

/* renamed from: cn3  reason: default package */
public final class cn3 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public cn3(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
    }

    public final void a(long j) {
        String name = cn3.class.getName();
        udd.q(name, "remove, id = " + j);
        t97 t97 = this.a;
        di3 di3 = (di3) t97.getValue();
        mi3 mi3 = mi3.b;
        li3 li3 = li3.b;
        di3.getClass();
        di3.c(j, new j9(mi3, 20, li3));
        ((di3) t97.getValue()).r(j, true);
        int i = zp4.o;
        q2b q2b = (q2b) this.d.getValue();
        l2b l2b = new l2b(0, (int) zp4.i(mt0.Q(((lqc) ((f03) this.c.getValue())).m(), eq4.c), eq4.o));
        q2b.getClass();
        q2b.k(Collections.singletonMap(Long.valueOf(j), l2b));
        gy9 gy9 = (gy9) ((pk) this.e.getValue());
        gy9.w(gy9, new on3(3, ((j2b) gy9.z()).a.n(), j, (String) null, (String) null, (String) null, (String) null));
        ((nae) this.b.getValue()).f(hr1.o(j));
        di3 di32 = (di3) t97.getValue();
        di32.getClass();
        tic.a(new ci3(0, j, 0, di32), di32.m, (j6) null, new ak0(28), (qmc) null);
        ((tt0) this.f.getValue()).c(new lp3(j));
    }
}
