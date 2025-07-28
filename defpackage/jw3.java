package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: jw3  reason: default package */
public final class jw3 implements Parcelable {
    public static final Parcelable.Creator<jw3> CREATOR = new w33(4);
    public final RectF a;
    public final float b;
    public final float[] c;

    public jw3(RectF rectF, float f, float[] fArr) {
        this.a = rectF;
        this.b = f;
        this.c = fArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jw3.class != obj.getClass()) {
            return false;
        }
        jw3 jw3 = (jw3) obj;
        if (Float.compare(jw3.b, this.b) == 0 && this.a.equals(jw3.a)) {
            return Arrays.equals(this.c, jw3.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return Arrays.hashCode(this.c) + ((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeFloat(this.b);
        parcel.writeFloatArray(this.c);
    }

    public jw3(Parcel parcel) {
        this.a = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.b = parcel.readFloat();
        float[] fArr = new float[9];
        this.c = fArr;
        parcel.readFloatArray(fArr);
    }
}
