package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: k3e  reason: default package */
public final class k3e implements h3e {
    public final pk a;
    public final tt0 b;
    public final t52 c;
    public final zo0 d;
    public final k2e e;
    public final gvf f;
    public final qmc g;
    public final gsc h;
    public final f2b i;
    public final g2b j;
    public final o2b k;
    public final f3d l;
    public final t97 m;
    public i22 n;
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public pn1 q;
    public pn1 r;
    public final t97 s;

    public k3e(pk pkVar, tt0 tt0, t52 t52, zo0 zo0, i22 i22, qmc qmc, gsc gsc, w6a w6a, g2b g2b, o2b o2b, f3d f3d) {
        t97 t97 = mqc.z;
        t97 t972 = mqc.q;
        this.b = tt0;
        this.c = t52;
        this.d = zo0;
        n62 n62 = i22.b.b;
        this.f = new gvf(4, n62);
        this.n = i22;
        this.a = pkVar;
        this.e = new k2e(n62);
        this.g = qmc;
        this.h = gsc;
        this.j = g2b;
        this.k = o2b;
        this.l = f3d;
        this.i = new f2b(gsc, w6a, false, 9);
        this.s = t97;
        this.m = t972;
        tt0.d(this);
        d();
    }

    public final mv9 a(int i2, String str) {
        return new mv9(1, new ph0((Object) this, (Object) str, i2, 12));
    }

    public final List b(LinkedHashSet linkedHashSet) {
        j2e c2 = c();
        this.e.getClass();
        return c2.m(linkedHashSet);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, j2e, kd8] */
    public final j2e c() {
        if (((h3d) this.l).h != 3 || this.n.b.e.size() >= this.n.b.c()) {
            return new pb5(this.h, this.i, this.j, this.k, this.s, (h2e) new j3e(this));
        }
        long j2 = this.n.b.a;
        pk pkVar = this.a;
        f2b f2b = this.i;
        qmc qmc = this.g;
        t97 t97 = this.s;
        ? obj = new Object();
        obj.o = j2;
        obj.a = pkVar;
        obj.b = f2b;
        obj.c = qmc;
        obj.X = t97;
        return obj;
    }

    public final void clear() {
        this.o.clear();
        this.p.clear();
        try {
            this.b.f(this);
        } catch (Exception unused) {
        }
    }

    public final void d() {
        tic.b(this.r);
        if (e()) {
            long j2 = this.n.b.a;
            dt dtVar = new dt((dfa) null, 12);
            dtVar.n(j2, ApiProtocol.PARAM_CHAT_ID);
            yhd L = ((gy9) this.a).L(dtVar, cnc.b());
            pn1 pn1 = new pn1(new j3e(this), 2, new xsd(28));
            L.k(pn1);
            this.r = pn1;
        }
    }

    public final boolean e() {
        i22 i22 = this.n;
        return i22.b.a != 0 && i22.b0() && this.n.A() && this.n.k0();
    }

    @a1e
    public void onEvent(mw2 mw2) {
        i22 i22 = this.n;
        if (i22 != null && mw2.b.contains(Long.valueOf(i22.a))) {
            tic.b(this.q);
            this.q = tic.a(new f5(16, this), this.g, (j6) null, new xsd(27), (qmc) null);
        }
    }
}
