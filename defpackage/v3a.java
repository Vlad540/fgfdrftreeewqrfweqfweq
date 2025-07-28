package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v3a  reason: default package */
public final class v3a implements Parcelable {
    public static final Parcelable.Creator<v3a> CREATOR = new ch9(3);
    public final String a;
    public final int b;
    public final int c;
    public final Integer o;

    public v3a(int i, int i2, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.o = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3a)) {
            return false;
        }
        v3a v3a = (v3a) obj;
        return hhd.f(this.a, v3a.a) && this.b == v3a.b && this.c == v3a.c && hhd.f(this.o, v3a.o);
    }

    public final int hashCode() {
        int d = c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.o;
        return d + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OneMeCountryModel(countryNameCode=" + this.a + ", countryPhoneCode=" + this.b + ", countryName=" + this.c + ", flagDrawable=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
