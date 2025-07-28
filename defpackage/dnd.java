package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dnd  reason: default package */
public final class dnd extends pmd {
    public static final Parcelable.Creator<dnd> CREATOR = new xkd(7);
    public final List a;

    public dnd(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new bnd(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            bnd bnd = (bnd) list.get(i2);
            parcel.writeLong(bnd.a);
            parcel.writeByte(bnd.b ? (byte) 1 : 0);
            parcel.writeByte(bnd.c ? (byte) 1 : 0);
            parcel.writeByte(bnd.d ? (byte) 1 : 0);
            List list2 = bnd.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                zmd zmd = (zmd) list2.get(i3);
                parcel.writeInt(zmd.a);
                parcel.writeLong(zmd.b);
            }
            parcel.writeLong(bnd.e);
            parcel.writeByte(bnd.g ? (byte) 1 : 0);
            parcel.writeLong(bnd.h);
            parcel.writeInt(bnd.i);
            parcel.writeInt(bnd.j);
            parcel.writeInt(bnd.k);
        }
    }

    public dnd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
