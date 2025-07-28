package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ule  reason: default package */
public final class ule extends z {
    public static final Parcelable.Creator<ule> CREATOR = new y(11);
    public int c;
    public boolean o;

    public ule(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public ule(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }
}
