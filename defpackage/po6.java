package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: po6  reason: default package */
public final class po6 implements x29 {
    public static final Parcelable.Creator<po6> CREATOR = new ze6(6);
    public final boolean X;
    public final int Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    public po6(int i, int i2, String str, String str2, String str3, boolean z) {
        oyb.d(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = z;
        this.Y = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.po6 a(java.util.Map r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            int r6 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0034 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r3
            goto L_0x0032
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0035 }
            r7.<init>(r1)     // Catch:{ NumberFormatException -> 0x0035 }
            r7.append(r2)     // Catch:{ NumberFormatException -> 0x0035 }
            java.lang.String r1 = r7.toString()     // Catch:{ NumberFormatException -> 0x0035 }
            defpackage.ez3.j0(r1)     // Catch:{ NumberFormatException -> 0x0035 }
            r1 = r4
            r6 = r5
        L_0x0032:
            r7 = r6
            goto L_0x003e
        L_0x0034:
            r6 = r5
        L_0x0035:
            java.lang.String r1 = "Invalid bitrate header: "
            c3d.o(r1, r2)
            r1 = r4
            goto L_0x0032
        L_0x003c:
            r1 = r4
            r7 = r5
        L_0x003e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            r6 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r3
            goto L_0x0053
        L_0x0052:
            r9 = r6
        L_0x0053:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0066
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r3
            goto L_0x0067
        L_0x0066:
            r10 = r6
        L_0x0067:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x007a
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r3
            goto L_0x007b
        L_0x007a:
            r11 = r6
        L_0x007b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0094
            java.lang.Object r1 = r2.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r12 = r1
            r1 = r3
            goto L_0x0095
        L_0x0094:
            r12 = r4
        L_0x0095:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r13 = r13.get(r2)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00be
            java.lang.Object r13 = r13.get(r4)
            java.lang.String r13 = (java.lang.String) r13
            int r2 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00c1 }
            if (r2 <= 0) goto L_0x00ad
            r5 = r2
            goto L_0x00bd
        L_0x00ad:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00c0 }
            r3.<init>(r0)     // Catch:{ NumberFormatException -> 0x00c0 }
            r3.append(r13)     // Catch:{ NumberFormatException -> 0x00c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x00c0 }
            defpackage.ez3.j0(r3)     // Catch:{ NumberFormatException -> 0x00c0 }
            r3 = r1
        L_0x00bd:
            r1 = r3
        L_0x00be:
            r8 = r5
            goto L_0x00c5
        L_0x00c0:
            r5 = r2
        L_0x00c1:
            c3d.o(r0, r13)
            goto L_0x00be
        L_0x00c5:
            if (r1 == 0) goto L_0x00cd
            po6 r13 = new po6
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x00cd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po6.a(java.util.Map):po6");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po6.class != obj.getClass()) {
            return false;
        }
        po6 po6 = (po6) obj;
        return this.a == po6.a && oze.a(this.b, po6.b) && oze.a(this.c, po6.c) && oze.a(this.o, po6.o) && this.X == po6.X && this.Y == po6.Y;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.X ? 1 : 0)) * 31) + this.Y;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.Y;
    }

    public final void w(x78 x78) {
        String str = this.c;
        if (str != null) {
            x78.F = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            x78.D = str2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        int i2 = oze.a;
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y);
    }

    public po6(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readString();
        int i = oze.a;
        this.X = parcel.readInt() != 0;
        this.Y = parcel.readInt();
    }
}
