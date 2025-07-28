package defpackage;

/* renamed from: o81  reason: default package */
public final class o81 extends sg9 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public o81(String str, boolean z, boolean z2, boolean z3) {
        super(jue.a);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o81)) {
            return false;
        }
        o81 o81 = (o81) obj;
        return hhd.f(this.b, o81.b) && this.c == o81.c && this.d == o81.d && this.e == o81.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + th2.f(th2.f(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "OpenLink(link=" + this.b + ", isVideoEnabled=" + this.c + ", isAudioEnabled=" + this.d + ", isFront=" + this.e + ")";
    }
}
