package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: wbf  reason: default package */
public final class wbf extends View.BaseSavedState {
    public static final Parcelable.Creator<wbf> CREATOR = new y(13);
    public int a;
    public int b;
    public Parcelable c;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
