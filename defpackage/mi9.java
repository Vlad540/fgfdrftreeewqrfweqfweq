package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mi9  reason: default package */
public final class mi9 implements Parcelable, pg7 {
    public static final Parcelable.Creator<mi9> CREATOR = new ch9(1);
    public final long a;
    public final String b;
    public final int c;
    public final boolean o;

    public mi9(long j, String str, int i, boolean z) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.o = z;
    }

    public static mi9 y(mi9 mi9, boolean z) {
        long j = mi9.a;
        String str = mi9.b;
        int i = mi9.c;
        mi9.getClass();
        return new mi9(j, str, i, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi9)) {
            return false;
        }
        mi9 mi9 = (mi9) obj;
        return this.a == mi9.a && hhd.f(this.b, mi9.b) && this.c == mi9.c && this.o == mi9.o;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + c3d.d(this.c, me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatarModel(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", categoryId=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return hr1.j(sb, this.o, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
