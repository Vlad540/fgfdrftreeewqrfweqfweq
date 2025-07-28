package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: aq0  reason: default package */
public final class aq0 extends z {
    public static final Parcelable.Creator<aq0> CREATOR = new y(2);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final int c;
    public final int o;

    public aq0(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public aq0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        boolean z = false;
        this.X = parcel.readInt() == 1;
        this.Y = parcel.readInt() == 1;
        this.Z = parcel.readInt() == 1 ? true : z;
    }

    public aq0(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.c = bottomSheetBehavior.L;
        this.o = bottomSheetBehavior.e;
        this.X = bottomSheetBehavior.b;
        this.Y = bottomSheetBehavior.I;
        this.Z = bottomSheetBehavior.J;
    }
}
