package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: js4  reason: default package */
public final class js4 implements Parcelable {
    public static final Parcelable.Creator<js4> CREATOR = new w33(16);
    public final List a;
    public final List b;
    public final Rect c;
    public final boolean o;

    public js4(ArrayList arrayList, ArrayList arrayList2, Rect rect, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = rect;
        this.o = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || js4.class != obj.getClass()) {
            return false;
        }
        js4 js4 = (js4) obj;
        List list = js4.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = js4.b;
        List list4 = this.b;
        if (list4 == null ? list3 != null : !list4.equals(list3)) {
            return false;
        }
        if (this.o != js4.o) {
            return false;
        }
        Rect rect = js4.c;
        Rect rect2 = this.c;
        return rect2 != null ? rect2.equals(rect) : rect == null;
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Rect rect = this.c;
        if (rect != null) {
            i = rect.hashCode();
        }
        return Boolean.valueOf(this.o).hashCode() + ((hashCode2 + i) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public js4(Parcel parcel) {
        this.a = parcel.createTypedArrayList(o97.CREATOR);
        this.b = parcel.createTypedArrayList(v33.CREATOR);
        this.c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.o = parcel.readInt() != 1 ? false : true;
    }
}
