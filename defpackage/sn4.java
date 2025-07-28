package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: sn4  reason: default package */
public final class sn4 implements Parcelable {
    public static final Parcelable.Creator<sn4> CREATOR = new w33(11);
    public final int a;
    public final float[] b;

    public sn4(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn4.class != obj.getClass()) {
            return false;
        }
        sn4 sn4 = (sn4) obj;
        if (this.a != sn4.a) {
            return false;
        }
        return Arrays.equals(this.b, sn4.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? hr1.t(i) : 0) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloatArray(this.b);
        int i2 = this.a;
        if (i2 == 1) {
            str = "LINE";
        } else if (i2 == 2) {
            str = "CUBIC_BEZIER";
        } else {
            throw null;
        }
        parcel.writeString(str);
    }

    public sn4(Parcel parcel) {
        int i;
        this.b = parcel.createFloatArray();
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("LINE")) {
                i = 1;
            } else if (readString.equals("CUBIC_BEZIER")) {
                i = 2;
            } else {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.DrawingPrimitive.Type.".concat(readString));
            }
            this.a = i;
            return;
        }
        throw new NullPointerException("Name is null");
    }
}
