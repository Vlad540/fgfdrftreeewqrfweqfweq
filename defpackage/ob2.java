package defpackage;

/* renamed from: ob2  reason: default package */
public final class ob2 {
    public final long a;
    public final long b;
    public final String c;
    public final ak4 d;
    public final boolean e;

    public ob2(long j, long j2, String str, ak4 ak4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = ak4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob2)) {
            return false;
        }
        ob2 ob2 = (ob2) obj;
        return this.a == ob2.a && this.b == ob2.b && hhd.f(this.c, ob2.c) && this.d == ob2.d && this.e == ob2.e;
    }

    public final int hashCode() {
        int d2 = me4.d(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadData(msgId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", localAttachId=");
        sb.append(this.c);
        sb.append(", cause=");
        sb.append(this.d);
        sb.append(", completed=");
        return hr1.j(sb, this.e, ")");
    }
}
