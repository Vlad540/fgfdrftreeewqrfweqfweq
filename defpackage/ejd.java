package defpackage;

/* renamed from: ejd  reason: default package */
public final class ejd extends gt6 {
    public final transient Object o;

    public ejd(Object obj) {
        obj.getClass();
        this.o = obj;
    }

    public final ws6 a() {
        return ws6.n(this.o);
    }

    public final int b(int i, Object[] objArr) {
        objArr[i] = this.o;
        return i + 1;
    }

    public final boolean contains(Object obj) {
        return this.o.equals(obj);
    }

    public final boolean f() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rue, y27] */
    public final rue g() {
        ? rue = new rue(0);
        rue.b = this.o;
        return rue;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.o.toString() + ']';
    }
}
