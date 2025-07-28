package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ed7  reason: default package */
public final class ed7 implements Parcelable {
    public static final Parcelable.Creator<ed7> CREATOR = new ze6(13);
    public int a;
    public int b;
    public boolean c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
