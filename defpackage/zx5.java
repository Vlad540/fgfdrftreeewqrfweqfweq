package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* renamed from: zx5  reason: default package */
public final class zx5 implements Parcelable {
    public static final Parcelable.Creator<zx5> CREATOR = new w33(24);
    public final int A0;
    public final String B0;
    public final int C0;
    public final boolean D0;
    public final int X;
    public final int Y;
    public final String Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean o;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    public zx5(a aVar) {
        this.a = aVar.getClass().getName();
        this.b = aVar.Y;
        this.c = aVar.D0;
        this.o = aVar.F0;
        this.X = aVar.N0;
        this.Y = aVar.O0;
        this.Z = aVar.P0;
        this.w0 = aVar.S0;
        this.x0 = aVar.B0;
        this.y0 = aVar.R0;
        this.z0 = aVar.Q0;
        this.A0 = aVar.g1.ordinal();
        this.B0 = aVar.x0;
        this.C0 = aVar.y0;
        this.D0 = aVar.a1;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.o) {
            sb.append(" dynamicContainer");
        }
        int i = this.Y;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.Z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.w0) {
            sb.append(" retainInstance");
        }
        if (this.x0) {
            sb.append(" removing");
        }
        if (this.y0) {
            sb.append(" detached");
        }
        if (this.z0) {
            sb.append(" hidden");
        }
        String str2 = this.B0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.C0);
        }
        if (this.D0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.w0 ? 1 : 0);
        parcel.writeInt(this.x0 ? 1 : 0);
        parcel.writeInt(this.y0 ? 1 : 0);
        parcel.writeInt(this.z0 ? 1 : 0);
        parcel.writeInt(this.A0);
        parcel.writeString(this.B0);
        parcel.writeInt(this.C0);
        parcel.writeInt(this.D0 ? 1 : 0);
    }

    public zx5(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = false;
        this.c = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.w0 = parcel.readInt() != 0;
        this.x0 = parcel.readInt() != 0;
        this.y0 = parcel.readInt() != 0;
        this.z0 = parcel.readInt() != 0;
        this.A0 = parcel.readInt();
        this.B0 = parcel.readString();
        this.C0 = parcel.readInt();
        this.D0 = parcel.readInt() != 0 ? true : z;
    }
}
