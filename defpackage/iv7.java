package defpackage;

/* renamed from: iv7  reason: default package */
public final class iv7 extends ax5 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public iv7(vje vje, Object obj, Object obj2) {
        super(vje);
        this.f = obj;
        this.g = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    public final qje g(int i, qje qje, boolean z) {
        this.e.g(i, qje, z);
        if (oze.a(qje.b, this.g) && z) {
            qje.b = h;
        }
        return qje;
    }

    public final Object m(int i) {
        Object m = this.e.m(i);
        return oze.a(m, this.g) ? h : m;
    }

    public final tje n(int i, tje tje, long j) {
        this.e.n(i, tje, j);
        if (oze.a(tje.a, this.f)) {
            tje.a = tje.q;
        }
        return tje;
    }
}
