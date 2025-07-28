package defpackage;

/* renamed from: h34  reason: default package */
public final class h34 {
    public static final h34 c = new h34();
    public final s16 a;
    public final s16 b;

    public h34(s16 s16, s16 s162) {
        this.a = s16;
        this.b = s162;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h34)) {
            return false;
        }
        h34 h34 = (h34) obj;
        return hhd.f(this.a, h34.a) && hhd.f(this.b, h34.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Animations(push=" + this.a + ", pop=" + this.b + ")";
    }

    public /* synthetic */ h34() {
        this(yr3.X, yr3.Y);
    }
}
