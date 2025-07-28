package defpackage;

/* renamed from: uf4  reason: default package */
public final class uf4 {
    public static final uf4 e = new mu0(0).b();
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        int i2 = oze.a;
    }

    public uf4(mu0 mu0) {
        this.a = mu0.b;
        this.b = mu0.c;
        this.c = mu0.d;
        this.d = (String) mu0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf4)) {
            return false;
        }
        uf4 uf4 = (uf4) obj;
        return this.a == uf4.a && this.b == uf4.b && this.c == uf4.c && oze.a(this.d, uf4.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
