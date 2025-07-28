package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: w96  reason: default package */
public final class w96 extends nrc {
    public final int A0 = f2a.o;
    public final long B0;
    public final Uri X;
    public final q1b Y;
    public final q1b Z;
    public final long c;
    public final CharSequence o;
    public final List w0;
    public final boolean x0;
    public final CharSequence y0;
    public final boolean z0;

    public w96(long j, String str, Uri uri, q1b q1b, q1b q1b2, List list, boolean z, CharSequence charSequence, boolean z2) {
        super(2, list);
        this.c = j;
        this.o = str;
        this.X = uri;
        this.Y = q1b;
        this.Z = q1b2;
        this.w0 = list;
        this.x0 = z;
        this.y0 = charSequence;
        this.z0 = z2;
        this.B0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w96)) {
            return false;
        }
        w96 w96 = (w96) obj;
        return this.c == w96.c && hhd.f(this.o, w96.o) && hhd.f(this.X, w96.X) && hhd.f(this.Y, w96.Y) && hhd.f(this.Z, w96.Z) && hhd.f(this.w0, w96.w0) && this.x0 == w96.x0 && hhd.f(this.y0, w96.y0) && this.z0 == w96.z0;
    }

    public final long getItemId() {
        return this.B0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.X;
        if (uri != null) {
            i = uri.hashCode();
        }
        int hashCode3 = this.Y.hashCode();
        return Boolean.hashCode(this.z0) + me4.f(this.y0, th2.f(c3d.f(this.w0, (this.Z.hashCode() + ((hashCode3 + ((hashCode2 + i) * 31)) * 31)) * 31, 31), 31, this.x0), 31);
    }

    public final boolean k(nrc nrc) {
        return equals((w96) nrc);
    }

    public final int l() {
        return this.A0;
    }

    public final boolean m(nrc nrc) {
        return nrc.getItemId() == this.B0;
    }

    public final String toString() {
        return "GlobalChatSearchModel(id=" + this.c + ", lastMessageTime=" + this.o + ", avatar=" + this.X + ", preProcessedTitle=" + this.Y + ", preProcessedSubtitle=" + this.Z + ", titleHighlights=" + this.w0 + ", isChannel=" + this.x0 + ", abbreviation=" + this.y0 + ", isVerified=" + this.z0 + ")";
    }
}
