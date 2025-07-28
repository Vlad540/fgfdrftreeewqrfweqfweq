package defpackage;

/* renamed from: h8c  reason: default package */
public final class h8c extends gt6 {
    public final transient ws6 X;
    public final transient zs6 o;

    public h8c(zs6 zs6, i8c i8c) {
        this.o = zs6;
        this.X = i8c;
    }

    public final ws6 a() {
        return this.X;
    }

    public final int b(int i, Object[] objArr) {
        return this.X.b(i, objArr);
    }

    public final boolean contains(Object obj) {
        return this.o.get(obj) != null;
    }

    public final boolean f() {
        return true;
    }

    public final rue g() {
        return this.X.listIterator(0);
    }

    public final int size() {
        return this.o.size();
    }
}
