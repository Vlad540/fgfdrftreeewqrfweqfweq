package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rsc  reason: default package */
public final class rsc extends z {
    public static final Parcelable.Creator<rsc> CREATOR = new y(8);
    public boolean c;

    public rsc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return hr1.j(sb, this.c, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.c));
    }
}
