package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: fn3  reason: default package */
public final class fn3 extends nrc {
    public final long A0;
    public final CharSequence X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final CharSequence o;
    public final List w0;
    public final Uri x0;
    public final CharSequence y0;
    public final int z0 = f2a.m;

    public fn3(long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, List list, Uri uri, CharSequence charSequence3) {
        super(3, list);
        this.c = j;
        this.o = charSequence;
        this.X = charSequence2;
        this.Y = z;
        this.Z = z2;
        this.w0 = list;
        this.x0 = uri;
        this.y0 = charSequence3;
        this.A0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn3)) {
            return false;
        }
        fn3 fn3 = (fn3) obj;
        return this.c == fn3.c && hhd.f(this.o, fn3.o) && hhd.f(this.X, fn3.X) && this.Y == fn3.Y && this.Z == fn3.Z && hhd.f(this.w0, fn3.w0) && hhd.f(this.x0, fn3.x0) && hhd.f(this.y0, fn3.y0);
    }

    public final long getItemId() {
        return this.A0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.o;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.X;
        int f = c3d.f(this.w0, th2.f(th2.f((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.Y), 31, this.Z), 31);
        Uri uri = this.x0;
        return this.y0.hashCode() + th2.f((f + (uri == null ? 0 : uri.hashCode())) * 31, 31, false);
    }

    public final boolean k(nrc nrc) {
        return equals((fn3) nrc);
    }

    public final int l() {
        return this.z0;
    }

    public final boolean m(nrc nrc) {
        return this.A0 == nrc.getItemId();
    }

    public final String toString() {
        return "ContactSearchModel(id=" + this.c + ", title=" + this.o + ", subtitle=" + this.X + ", isOnline=" + this.Y + ", isVerified=" + this.Z + ", contactHighlights=" + this.w0 + ", avatar=" + this.x0 + ", selected=false, abbreviation=" + this.y0 + ")";
    }
}
