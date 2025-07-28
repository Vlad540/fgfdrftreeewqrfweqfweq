package defpackage;

/* renamed from: hv7  reason: default package */
public final class hv7 extends zw5 {
    public static final Object X = new Object();
    public final Object c;
    public final Object o;

    public hv7(uje uje, Object obj, Object obj2) {
        super(uje);
        this.c = obj;
        this.o = obj2;
    }

    public final int b(Object obj) {
        Object obj2;
        if (X.equals(obj) && (obj2 = this.o) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    public final pje g(int i, pje pje, boolean z) {
        this.b.g(i, pje, z);
        if (mze.a(pje.b, this.o) && z) {
            pje.b = X;
        }
        return pje;
    }

    public final Object m(int i) {
        Object m = this.b.m(i);
        return mze.a(m, this.o) ? X : m;
    }

    public final sje n(int i, sje sje, long j) {
        this.b.n(i, sje, j);
        if (mze.a(sje.a, this.c)) {
            sje.a = sje.G0;
        }
        return sje;
    }
}
