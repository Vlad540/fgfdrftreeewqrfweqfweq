package defpackage;

/* renamed from: p0b  reason: default package */
public final class p0b extends o0b {
    public final Object c = new Object();

    public p0b(int i) {
        super(i);
    }

    public final boolean g(Object obj) {
        boolean g;
        synchronized (this.c) {
            g = super.g(obj);
        }
        return g;
    }

    public final Object h() {
        Object h;
        synchronized (this.c) {
            h = super.h();
        }
        return h;
    }
}
