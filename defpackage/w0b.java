package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: w0b  reason: default package */
public final class w0b extends View.BaseSavedState {
    public static final v0b CREATOR = new Object();
    public final int a;
    public final boolean b;

    public w0b(Parcelable parcelable, int i, boolean z) {
        super(parcelable);
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
    }

    public w0b(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() > 0;
    }
}
