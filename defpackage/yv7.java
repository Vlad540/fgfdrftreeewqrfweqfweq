package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yv7  reason: default package */
public final class yv7 extends z {
    public static final Parcelable.Creator<yv7> CREATOR = new y(6);
    public boolean c;

    public yv7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            yv7.class.getClassLoader();
        }
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
