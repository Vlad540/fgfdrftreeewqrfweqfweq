package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: wn4  reason: default package */
public final class wn4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<wn4> CREATOR = new w33(12);
    public final un4[] a;
    public int b;
    public final String c;
    public final int o;

    public wn4(String str, ArrayList arrayList) {
        this(str, false, (un4[]) arrayList.toArray(new un4[0]));
    }

    public final wn4 a(String str) {
        return mze.a(this.c, str) ? this : new wn4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        un4 un4 = (un4) obj;
        un4 un42 = (un4) obj2;
        UUID uuid = vu0.a;
        return uuid.equals(un4.b) ? uuid.equals(un42.b) ? 0 : 1 : un4.b.compareTo(un42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wn4.class != obj.getClass()) {
            return false;
        }
        wn4 wn4 = (wn4) obj;
        return mze.a(this.c, wn4.c) && Arrays.equals(this.a, wn4.a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: un4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wn4(java.lang.String r1, boolean r2, defpackage.un4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            un4[] r3 = (defpackage.un4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn4.<init>(java.lang.String, boolean, un4[]):void");
    }

    public wn4(Parcel parcel) {
        this.c = parcel.readString();
        un4[] un4Arr = (un4[]) parcel.createTypedArray(un4.CREATOR);
        int i = mze.a;
        this.a = un4Arr;
        this.o = un4Arr.length;
    }
}
