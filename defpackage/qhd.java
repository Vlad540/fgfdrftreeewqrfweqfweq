package defpackage;

/* renamed from: qhd  reason: default package */
public final class qhd implements sy7 {
    public final long a;
    public final String b;
    public final tp6 c;
    public final boolean d;

    public qhd(long j, String str, tp6 tp6, boolean z) {
        this.a = j;
        this.b = str;
        this.c = tp6;
        this.d = z;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhd)) {
            return false;
        }
        qhd qhd = (qhd) obj;
        return this.a == qhd.a && hhd.f(this.b, qhd.b) && hhd.f(this.c, qhd.c) && this.d == qhd.d;
    }

    public final int hashCode() {
        int d2 = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleImageAttach(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", imageAttach=");
        sb.append(this.c);
        sb.append(", isMediaOrderedFirst=");
        return hr1.j(sb, this.d, ")");
    }
}
