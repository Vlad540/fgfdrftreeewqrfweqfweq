package defpackage;

/* renamed from: g53  reason: default package */
public final class g53 implements h53 {
    public final i22 a;
    public final CharSequence b;
    public final CharSequence c;
    public final long d;

    static {
        g53.class.hashCode();
    }

    public g53(i22 i22, CharSequence charSequence, String str) {
        this.a = i22;
        this.b = charSequence;
        this.c = str;
        this.d = i22.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g53)) {
            return false;
        }
        g53 g53 = (g53) obj;
        return this.d == g53.d && hhd.f(this.b, g53.b) && hhd.f(this.c, g53.c);
    }

    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.f(this.b, sxe.m(g53.class.getName().hashCode() * 31, 31, this.d), 31);
    }
}
