package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p69  reason: default package */
public final class p69 implements x29 {
    public static final Parcelable.Creator<p69> CREATOR = new vf7(26);
    public final long X;
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public p69(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = j5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p69.class != obj.getClass()) {
            return false;
        }
        p69 p69 = (p69) obj;
        return this.a == p69.a && this.b == p69.b && this.c == p69.c && this.o == p69.o && this.X == p69.X;
    }

    public final int hashCode() {
        int w = js.w(this.b);
        int w2 = js.w(this.c);
        int w3 = js.w(this.o);
        return js.w(this.X) + ((w3 + ((w2 + ((w + ((js.w(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.o + ", videoSize=" + this.X;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
    }

    public p69(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
    }
}
