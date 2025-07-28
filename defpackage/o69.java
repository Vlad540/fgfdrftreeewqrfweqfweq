package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o69  reason: default package */
public final class o69 implements w29 {
    public static final Parcelable.Creator<o69> CREATOR = new vf7(25);
    public final long X;
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public o69(long j, long j2, long j3, long j4, long j5) {
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
        if (obj == null || o69.class != obj.getClass()) {
            return false;
        }
        o69 o69 = (o69) obj;
        return this.a == o69.a && this.b == o69.b && this.c == o69.c && this.o == o69.o && this.X == o69.X;
    }

    public final int hashCode() {
        int w = js.w(this.b);
        int w2 = js.w(this.c);
        int w3 = js.w(this.o);
        return js.w(this.X) + ((w3 + ((w2 + ((w + ((js.w(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.a);
        sb.append(", photoSize=");
        sb.append(this.b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.c);
        sb.append(", videoStartPosition=");
        sb.append(this.o);
        sb.append(", videoSize=");
        sb.append(this.X);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
    }

    public o69(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
    }
}
