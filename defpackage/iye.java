package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iye  reason: default package */
public final class iye extends xo6 {
    public static final Parcelable.Creator<iye> CREATOR = new xkd(21);
    public final String b;
    public final String c;

    public iye(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iye.class != obj.getClass()) {
            return false;
        }
        iye iye = (iye) obj;
        return this.a.equals(iye.a) && mze.a(this.b, iye.b) && mze.a(this.c, iye.c);
    }

    public final int hashCode() {
        int d = me4.d(527, 31, this.a);
        int i = 0;
        String str = this.b;
        int hashCode = (d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(6, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iye(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.mze.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.b = r0
            java.lang.String r3 = r3.readString()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iye.<init>(android.os.Parcel):void");
    }
}
