package defpackage;

import android.os.Parcelable;

/* renamed from: ph8  reason: default package */
public final class ph8 extends rh8 {
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int w0 = 2;

    public ph8(long j, long j2, long j3, String str, String str2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = charSequence;
        this.Z = charSequence2;
        Parcelable.Creator<ie2> creator = ie2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph8)) {
            return false;
        }
        ph8 ph8 = (ph8) obj;
        return this.a == ph8.a && this.b == ph8.b && this.c == ph8.c && hhd.f(this.o, ph8.o) && hhd.f(this.X, ph8.X) && hhd.f(this.Y, ph8.Y) && hhd.f(this.Z, ph8.Z);
    }

    public final long getItemId() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int d = me4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.X);
        CharSequence charSequence = this.Y;
        int hashCode = (d + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.Z;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode + i;
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return this.w0;
    }

    public final String toString() {
        return "Link(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", previewUrl=" + this.o + ", title=" + this.X + ", subtitle=" + this.Y + ", link=" + this.Z + ")";
    }
}
