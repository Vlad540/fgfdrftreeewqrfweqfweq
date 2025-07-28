package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: xe0  reason: default package */
public final class xe0 implements Parcelable {
    public static final Parcelable.Creator<xe0> CREATOR = new h6(10);
    public int A0 = -2;
    public int B0 = -2;
    public Locale C0;
    public CharSequence D0;
    public CharSequence E0;
    public int F0;
    public int G0;
    public Integer H0;
    public Boolean I0 = Boolean.TRUE;
    public Integer J0;
    public Integer K0;
    public Integer L0;
    public Integer M0;
    public Integer N0;
    public Integer O0;
    public Integer P0;
    public Integer Q0;
    public Integer R0;
    public Boolean S0;
    public Integer X;
    public Integer Y;
    public Integer Z;
    public int a;
    public Integer b;
    public Integer c;
    public Integer o;
    public Integer w0;
    public int x0 = 255;
    public String y0;
    public int z0 = -2;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.w0);
        parcel.writeInt(this.x0);
        parcel.writeString(this.y0);
        parcel.writeInt(this.z0);
        parcel.writeInt(this.A0);
        parcel.writeInt(this.B0);
        CharSequence charSequence = this.D0;
        String str = null;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.E0;
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.F0);
        parcel.writeSerializable(this.H0);
        parcel.writeSerializable(this.J0);
        parcel.writeSerializable(this.K0);
        parcel.writeSerializable(this.L0);
        parcel.writeSerializable(this.M0);
        parcel.writeSerializable(this.N0);
        parcel.writeSerializable(this.O0);
        parcel.writeSerializable(this.R0);
        parcel.writeSerializable(this.P0);
        parcel.writeSerializable(this.Q0);
        parcel.writeSerializable(this.I0);
        parcel.writeSerializable(this.C0);
        parcel.writeSerializable(this.S0);
    }
}
