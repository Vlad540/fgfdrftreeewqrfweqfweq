package defpackage;

import android.net.Uri;

/* renamed from: ira  reason: default package */
public final class ira implements pg7 {
    public final Uri X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final mge o;
    public final zta w0;
    public final CharSequence x0;
    public final boolean y0;
    public final long z0;

    public ira(long j, long j2, CharSequence charSequence, mge mge, Uri uri, boolean z, boolean z2, zta zta, CharSequence charSequence2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = mge;
        this.X = uri;
        this.Y = z;
        this.Z = z2;
        this.w0 = zta;
        this.x0 = charSequence2;
        this.y0 = z3;
        this.z0 = zta.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ira)) {
            return false;
        }
        ira ira = (ira) obj;
        return this.a == ira.a && this.b == ira.b && hhd.f(this.c, ira.c) && hhd.f(this.o, ira.o) && hhd.f(this.X, ira.X) && this.Y == ira.Y && this.Z == ira.Z && hhd.f(this.w0, ira.w0) && hhd.f(this.x0, ira.x0) && this.y0 == ira.y0;
    }

    public final boolean g(pg7 pg7) {
        return this.z0 == pg7.getItemId();
    }

    public final long getItemId() {
        return this.z0;
    }

    public final int hashCode() {
        int f = me4.f(this.c, sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31);
        int i = 0;
        mge mge = this.o;
        int hashCode = (f + (mge == null ? 0 : mge.hashCode())) * 31;
        Uri uri = this.X;
        if (uri != null) {
            i = uri.hashCode();
        }
        return Boolean.hashCode(this.y0) + me4.f(this.x0, (this.w0.hashCode() + th2.f(th2.f((hashCode + i) * 31, 31, this.Y), 31, this.Z)) * 31, 31);
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        boolean z;
        ira ira = (pg7) obj;
        ira ira2 = ira instanceof ira ? ira : null;
        if (ira2 == null || this.Y == (z = ira2.Y)) {
            return null;
        }
        return new hra(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerChatListItem(id=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", avatar=");
        sb.append(this.X);
        sb.append(", isOnline=");
        sb.append(this.Y);
        sb.append(", isVerified=");
        sb.append(this.Z);
        sb.append(", entity=");
        sb.append(this.w0);
        sb.append(", abbreviation=");
        sb.append(this.x0);
        sb.append(", isEnabled=");
        return hr1.j(sb, this.y0, ")");
    }
}
