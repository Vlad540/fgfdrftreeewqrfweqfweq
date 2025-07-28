package defpackage;

import android.os.Parcelable;

/* renamed from: jh8  reason: default package */
public final class jh8 extends rh8 {
    public final String X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String w0;
    public final zqd x0;
    public final int y0 = 3;

    public jh8(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, grd grd) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.w0 = str5;
        this.x0 = grd;
        Parcelable.Creator<ie2> creator = ie2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh8)) {
            return false;
        }
        jh8 jh8 = (jh8) obj;
        return this.a == jh8.a && this.b == jh8.b && this.c == jh8.c && hhd.f(this.o, jh8.o) && hhd.f(this.X, jh8.X) && hhd.f(this.Y, jh8.Y) && hhd.f(this.Z, jh8.Z) && hhd.f(this.w0, jh8.w0) && hhd.f(this.x0, jh8.x0);
    }

    public final long getItemId() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        return this.x0.hashCode() + me4.d(me4.d(me4.d(me4.d(me4.d(sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31, this.Z), 31, this.w0);
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return this.y0;
    }

    public final String toString() {
        return "Audio(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", attachLocalId=" + this.o + ", audioUrl=" + this.X + ", audioArtist=" + this.Y + ", subtitle=" + this.Z + ", playerTitle=" + this.w0 + ", state=" + this.x0 + ")";
    }
}
