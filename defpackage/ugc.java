package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ugc  reason: default package */
public final class ugc implements Parcelable {
    public static final Parcelable.Creator<ugc> CREATOR = new x3b(14);
    public final List a;
    public final List b;
    public final List c;
    public final int o;

    public ugc(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.o = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugc)) {
            return false;
        }
        ugc ugc = (ugc) obj;
        return hhd.f(this.a, ugc.a) && hhd.f(this.b, ugc.b) && hhd.f(this.c, ugc.c) && this.o == ugc.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + c3d.f(this.c, c3d.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(savedPagesKeys=");
        sb.append(this.a);
        sb.append(", savedPagesValues=");
        sb.append(this.b);
        sb.append(", savedPageHistory=");
        sb.append(this.c);
        sb.append(", maxPagesToStateSave=");
        return hr1.h(sb, this.o, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List<Number> list = this.a;
        parcel.writeInt(list.size());
        for (Number longValue : list) {
            parcel.writeLong(longValue.longValue());
        }
        List<Bundle> list2 = this.b;
        parcel.writeInt(list2.size());
        for (Bundle writeBundle : list2) {
            parcel.writeBundle(writeBundle);
        }
        List<Number> list3 = this.c;
        parcel.writeInt(list3.size());
        for (Number longValue2 : list3) {
            parcel.writeLong(longValue2.longValue());
        }
        parcel.writeInt(this.o);
    }
}
