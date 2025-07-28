package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: b68  reason: default package */
public final class b68 implements k68 {
    public final boolean X;
    public final String Y;
    public final long Z;
    public final long a;
    public final long b;
    public final rz c;
    public final tp6 o;
    public final int w0;

    public b68(long j, long j2, rz rzVar, tp6 tp6, String str, int i) {
        boolean z = tp6.e;
        if ((i & 32) != 0 && (str = tp6.k) == null) {
            str = BuildConfig.FLAVOR;
        }
        this.a = j;
        this.b = j2;
        this.c = rzVar;
        this.o = tp6;
        this.X = z;
        this.Y = str;
        String str2 = tp6.k;
        this.Z = str2 != null ? (long) str2.hashCode() : 0;
        this.w0 = a2a.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68 = (b68) obj;
        return this.a == b68.a && this.b == b68.b && hhd.f(this.c, b68.c) && hhd.f(this.o, b68.o) && this.X == b68.X && hhd.f(this.Y, b68.Y);
    }

    public final long getItemId() {
        return this.Z;
    }

    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        int m = sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
        return this.Y.hashCode() + th2.f((this.o.hashCode() + ((this.c.hashCode() + m) * 31)) * 31, 31, this.X);
    }

    public final long j() {
        return this.a;
    }

    public final int l() {
        return this.w0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", imageAttachConfig=");
        sb.append(this.o);
        sb.append(", isGif=");
        sb.append(this.X);
        sb.append(", localId=");
        return wn6.l(sb, this.Y, ")");
    }

    public final String x() {
        return this.Y;
    }
}
