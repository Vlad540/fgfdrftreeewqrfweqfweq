package defpackage;

/* renamed from: uy5  reason: default package */
public final class uy5 {
    public static final uy5 d = new uy5((v2f) null, 7);
    public final v2f a;
    public final int b;
    public final int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy5(v2f v2f, int i) {
        this((i & 1) != 0 ? null : v2f, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy5)) {
            return false;
        }
        uy5 uy5 = (uy5) obj;
        return hhd.f(this.a, uy5.a) && this.b == uy5.b && this.c == uy5.c;
    }

    public final int hashCode() {
        v2f v2f = this.a;
        return Integer.hashCode(this.c) + c3d.d(this.b, (v2f == null ? 0 : v2f.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return wn6.j(sb, this.c, ")");
    }

    public uy5(v2f v2f, int i, int i2) {
        this.a = v2f;
        this.b = i;
        this.c = i2;
    }
}
