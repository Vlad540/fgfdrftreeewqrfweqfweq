package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a3g  reason: default package */
public final class a3g extends o3 {
    public static final Parcelable.Creator<a3g> CREATOR = new o1g(9);
    public final k3g X;
    public final a3g Y;
    public final int a;
    public final String b;
    public final String c;
    public final String o;

    static {
        Process.myUid();
        Process.myPid();
    }

    public a3g(int i, String str, String str2, String str3, ArrayList arrayList, a3g a3g) {
        if (a3g == null || a3g.Y == null) {
            this.a = i;
            this.b = str;
            this.c = str2;
            AbstractCollection abstractCollection = null;
            this.o = str3 == null ? a3g != null ? a3g.o : null : str3;
            AbstractCollection abstractCollection2 = arrayList;
            if (arrayList == null) {
                AbstractCollection abstractCollection3 = a3g != null ? a3g.X : abstractCollection;
                abstractCollection2 = abstractCollection3;
                if (abstractCollection3 == null) {
                    i3g i3g = k3g.b;
                    abstractCollection2 = l3g.X;
                }
            }
            i3g i3g2 = k3g.b;
            Object[] array = abstractCollection2.toArray();
            int length = array.length;
            int i2 = 0;
            while (i2 < length) {
                if (array[i2] != null) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                    sb.append("at index ");
                    sb.append(i2);
                    throw new NullPointerException(sb.toString());
                }
            }
            this.X = length == 0 ? l3g.X : new l3g(length, array);
            this.Y = a3g;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (defpackage.a3g) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.a3g
            r1 = 0
            if (r0 == 0) goto L_0x0041
            a3g r4 = (defpackage.a3g) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0041
            java.lang.String r0 = r3.b
            java.lang.String r2 = r4.b
            boolean r0 = defpackage.hhd.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.c
            java.lang.String r2 = r4.c
            boolean r0 = defpackage.hhd.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.o
            java.lang.String r2 = r4.o
            boolean r0 = defpackage.hhd.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            a3g r0 = r3.Y
            a3g r2 = r4.Y
            boolean r0 = defpackage.hhd.f(r0, r2)
            if (r0 == 0) goto L_0x0041
            k3g r3 = r3.X
            k3g r4 = r4.X
            boolean r3 = defpackage.hhd.f(r3, r4)
            if (r3 == 0) goto L_0x0041
            r3 = 1
            return r3
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o, this.Y});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (p0e.Q(str2, str, false)) {
                sb.append(str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.o;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.k0(parcel, 3, this.b);
        ek8.k0(parcel, 4, this.c);
        ek8.k0(parcel, 6, this.o);
        ek8.j0(parcel, 7, this.Y, i);
        ek8.m0(parcel, this.X, 8);
        ek8.o0(parcel, n0);
    }
}
