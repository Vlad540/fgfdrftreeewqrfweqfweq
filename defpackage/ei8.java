package defpackage;

import android.net.Uri;

/* renamed from: ei8  reason: default package */
public final class ei8 implements pg7 {
    public final int A0;
    public final mge B0;
    public final Uri X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final mge o;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    public ei8(long j, CharSequence charSequence, CharSequence charSequence2, mge mge, Uri uri, CharSequence charSequence3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, mge mge2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = mge;
        this.X = uri;
        this.Y = charSequence3;
        this.Z = z;
        this.w0 = z2;
        this.x0 = z3;
        this.y0 = z4;
        this.z0 = z5;
        this.A0 = i;
        this.B0 = mge2;
    }

    public static ei8 k(ei8 ei8, boolean z) {
        ei8 ei82 = ei8;
        return new ei8(ei82.a, ei82.b, ei82.c, ei82.o, ei82.X, ei82.Y, ei82.Z, ei82.w0, z, ei82.y0, ei82.z0, ei82.A0, ei82.B0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei8)) {
            return false;
        }
        ei8 ei8 = (ei8) obj;
        return this.a == ei8.a && hhd.f(this.b, ei8.b) && hhd.f(this.c, ei8.c) && hhd.f(this.o, ei8.o) && hhd.f(this.X, ei8.X) && hhd.f(this.Y, ei8.Y) && this.Z == ei8.Z && this.w0 == ei8.w0 && this.x0 == ei8.x0 && this.y0 == ei8.y0 && this.z0 == ei8.z0 && this.A0 == ei8.A0 && hhd.f(this.B0, ei8.B0);
    }

    public final boolean g(pg7 pg7) {
        return this.a == pg7.getItemId();
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = me4.f(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int e = c3d.e((f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o);
        Uri uri = this.X;
        int d = c3d.d(this.A0, th2.f(th2.f(th2.f(th2.f(th2.f(me4.f(this.Y, (e + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.Z), 31, this.w0), 31, this.x0), 31, this.y0), 31, this.z0), 31);
        mge mge = this.B0;
        if (mge != null) {
            i = mge.hashCode();
        }
        return d + i;
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", subtitle=" + this.o + ", avatar=" + this.X + ", abbreviation=" + this.Y + ", isVerified=" + this.Z + ", isSelf=" + this.w0 + ", isOwner=" + this.x0 + ", isEnabled=" + this.y0 + ", isSelectable=" + this.z0 + ", presence=" + this.A0 + ", alias=" + this.B0 + ")";
    }
}
