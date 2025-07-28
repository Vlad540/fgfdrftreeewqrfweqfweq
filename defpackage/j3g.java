package defpackage;

/* renamed from: j3g  reason: default package */
public final class j3g extends k3g {
    public final /* synthetic */ k3g X;
    public final transient int c;
    public final transient int o;

    public j3g(k3g k3g, int i, int i2) {
        this.X = k3g;
        this.c = i;
        this.o = i2;
    }

    public final Object[] a() {
        return this.X.a();
    }

    public final int b() {
        return this.X.b() + this.c;
    }

    public final int c() {
        return this.X.b() + this.c + this.o;
    }

    public final boolean d() {
        return true;
    }

    /* renamed from: f */
    public final k3g subList(int i, int i2) {
        fja.G(i, i2, this.o);
        int i3 = this.c;
        return this.X.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        fja.F(i, this.o);
        return this.X.get(i + this.c);
    }

    public final int size() {
        return this.o;
    }
}
