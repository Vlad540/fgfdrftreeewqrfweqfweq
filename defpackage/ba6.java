package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: ba6  reason: default package */
public final class ba6 extends nrc {
    public final List A0;
    public final int B0 = f2a.p;
    public final long C0;
    public final q1b X;
    public final q1b Y;
    public final boolean Z;
    public final long c;
    public final CharSequence o;
    public final boolean w0;
    public final Uri x0;
    public final l2b y0;
    public final uj3 z0;

    public ba6(long j, String str, q1b q1b, q1b q1b2, boolean z, boolean z2, Uri uri, l2b l2b, uj3 uj3, List list) {
        super(4, list);
        this.c = j;
        this.o = str;
        this.X = q1b;
        this.Y = q1b2;
        this.Z = z;
        this.w0 = z2;
        this.x0 = uri;
        this.y0 = l2b;
        this.z0 = uj3;
        this.A0 = list;
        this.C0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba6)) {
            return false;
        }
        ba6 ba6 = (ba6) obj;
        return this.c == ba6.c && hhd.f(this.o, ba6.o) && hhd.f(this.X, ba6.X) && hhd.f(this.Y, ba6.Y) && this.Z == ba6.Z && this.w0 == ba6.w0 && hhd.f(this.x0, ba6.x0) && hhd.f(this.y0, ba6.y0) && hhd.f(this.z0, ba6.z0) && hhd.f(this.A0, ba6.A0);
    }

    public final long getItemId() {
        return this.C0;
    }

    public final int hashCode() {
        int f = th2.f(th2.f((this.Y.hashCode() + ((this.X.hashCode() + me4.f(this.o, Long.hashCode(this.c) * 31, 31)) * 31)) * 31, 31, this.Z), 31, this.w0);
        Uri uri = this.x0;
        int hashCode = uri == null ? 0 : uri.hashCode();
        int hashCode2 = this.y0.hashCode();
        return Boolean.hashCode(false) + c3d.f(this.A0, (this.z0.hashCode() + ((hashCode2 + ((f + hashCode) * 31)) * 31)) * 31, 31);
    }

    public final boolean k(nrc nrc) {
        return equals((ba6) nrc);
    }

    public final int l() {
        return this.B0;
    }

    public final boolean m(nrc nrc) {
        return this.C0 == nrc.getItemId();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalContactSearchModel(id=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.X);
        sb.append(", subtitle=");
        sb.append(this.Y);
        sb.append(", isOnline=");
        sb.append(this.Z);
        sb.append(", isVerified=");
        sb.append(this.w0);
        sb.append(", avatar=");
        sb.append(this.x0);
        sb.append(", presence=");
        sb.append(this.y0);
        sb.append(", contactInfo=");
        sb.append(this.z0);
        sb.append(", contactHighlights=");
        return hr1.i(sb, this.A0, ", selected=false)");
    }
}
