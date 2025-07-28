package defpackage;

/* renamed from: p21  reason: default package */
public final class p21 implements r21 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public p21(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p21)) {
            return false;
        }
        p21 p21 = (p21) obj;
        return hhd.f(this.a, p21.a) && this.b == p21.b && this.c == p21.c && this.d == p21.d && this.e == p21.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + th2.f(th2.f(th2.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", isNewLink=");
        sb.append(this.b);
        sb.append(", isFrontCameraEnabled=");
        sb.append(this.c);
        sb.append(", isVideoEnabled=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        return hr1.j(sb, this.e, ")");
    }
}
