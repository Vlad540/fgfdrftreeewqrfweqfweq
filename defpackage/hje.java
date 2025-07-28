package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hje  reason: default package */
public final class hje extends pmd {
    public static final Parcelable.Creator<hje> CREATOR = new xkd(18);
    public final long a;
    public final long b;

    public hje(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, ija ija) {
        long u = (long) ija.u();
        if ((128 & u) != 0) {
            return 8589934591L & ((((u & 1) << 32) | ija.w()) + j);
        }
        return -9223372036854775807L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return wn6.k(sb, this.b, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
