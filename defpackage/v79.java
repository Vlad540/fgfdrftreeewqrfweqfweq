package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v79  reason: default package */
public final class v79 implements x29 {
    public static final Parcelable.Creator<v79> CREATOR = new vf7(28);
    public final long a;
    public final long b;
    public final long c;

    public v79(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v79)) {
            return false;
        }
        v79 v79 = (v79) obj;
        return this.a == v79.a && this.b == v79.b && this.c == v79.c;
    }

    public final int hashCode() {
        int w = js.w(this.b);
        return js.w(this.c) + ((w + ((js.w(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public v79(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
