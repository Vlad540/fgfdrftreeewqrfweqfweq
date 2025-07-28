package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cnd  reason: default package */
public final class cnd extends omd {
    public static final Parcelable.Creator<cnd> CREATOR = new xkd(6);
    public final List a;

    public cnd(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new and(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            and and = (and) list.get(i2);
            parcel.writeLong(and.a);
            parcel.writeByte(and.b ? (byte) 1 : 0);
            parcel.writeByte(and.c ? (byte) 1 : 0);
            parcel.writeByte(and.d ? (byte) 1 : 0);
            List list2 = and.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ymd ymd = (ymd) list2.get(i3);
                parcel.writeInt(ymd.a);
                parcel.writeLong(ymd.b);
            }
            parcel.writeLong(and.e);
            parcel.writeByte(and.g ? (byte) 1 : 0);
            parcel.writeLong(and.h);
            parcel.writeInt(and.i);
            parcel.writeInt(and.j);
            parcel.writeInt(and.k);
        }
    }

    public cnd(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
