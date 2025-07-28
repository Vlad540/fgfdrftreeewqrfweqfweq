package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sw2  reason: default package */
public final class sw2 extends z {
    public static final Parcelable.Creator<sw2> CREATOR = new y(3);
    public boolean c;

    public sw2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
