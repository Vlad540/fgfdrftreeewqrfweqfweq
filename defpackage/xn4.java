package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: xn4  reason: default package */
public final class xn4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<xn4> CREATOR = new w33(13);
    public final vn4[] a;
    public int b;
    public final String c;
    public final int o;

    public xn4(String str, ArrayList arrayList) {
        this(str, false, (vn4[]) arrayList.toArray(new vn4[0]));
    }

    public final xn4 a(String str) {
        return oze.a(this.c, str) ? this : new xn4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        vn4 vn4 = (vn4) obj;
        vn4 vn42 = (vn4) obj2;
        UUID uuid = yu0.a;
        return uuid.equals(vn4.b) ? uuid.equals(vn42.b) ? 0 : 1 : vn4.b.compareTo(vn42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xn4.class != obj.getClass()) {
            return false;
        }
        xn4 xn4 = (xn4) obj;
        return oze.a(this.c, xn4.c) && Arrays.equals(this.a, xn4.a);
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: vn4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xn4(java.lang.String r1, boolean r2, defpackage.vn4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            vn4[] r3 = (defpackage.vn4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn4.<init>(java.lang.String, boolean, vn4[]):void");
    }

    public xn4(Parcel parcel) {
        this.c = parcel.readString();
        vn4[] vn4Arr = (vn4[]) parcel.createTypedArray(vn4.CREATOR);
        int i = oze.a;
        this.a = vn4Arr;
        this.o = vn4Arr.length;
    }
}
