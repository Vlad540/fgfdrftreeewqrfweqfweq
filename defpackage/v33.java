package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v33  reason: default package */
public final class v33 implements Parcelable {
    public static final Parcelable.Creator<v33> CREATOR = new h6(28);
    public final int a;
    public final int b;

    public v33(int i) {
        this.a = 1;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v33.class != obj.getClass()) {
            return false;
        }
        v33 v33 = (v33) obj;
        if (this.b != v33.b) {
            return false;
        }
        return this.a == v33.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? hr1.t(i) : 0) * 31) + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a == 1) {
            parcel.writeString("ADD");
            return;
        }
        throw null;
    }

    public v33(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            throw new NullPointerException("Name is null");
        } else if (readString.equals("ADD")) {
            this.a = 1;
        } else {
            throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.CommandState.Type.".concat(readString));
        }
    }
}
