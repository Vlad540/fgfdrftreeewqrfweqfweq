package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gje  reason: default package */
public final class gje extends omd {
    public static final Parcelable.Creator<gje> CREATOR = new xkd(17);
    public final long a;
    public final long b;

    public gje(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, yze yze) {
        long v = (long) yze.v();
        if ((128 & v) != 0) {
            return 8589934591L & ((((v & 1) << 32) | yze.w()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
