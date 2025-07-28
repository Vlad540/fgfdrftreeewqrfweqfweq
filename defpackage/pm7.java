package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pm7  reason: default package */
public final class pm7 extends o3 {
    public static final Parcelable.Creator<pm7> CREATOR = new udf(22);
    public final List a;
    public final boolean b;
    public final boolean c;

    public pm7(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.m0(parcel, Collections.unmodifiableList(this.a), 1);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ek8.o0(parcel, n0);
    }
}
