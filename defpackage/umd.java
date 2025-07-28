package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: umd  reason: default package */
public final class umd extends omd {
    public static final Parcelable.Creator<umd> CREATOR = new xkd(2);
    public final int A0;
    public final int B0;
    public final boolean X;
    public final long Y;
    public final long Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final List w0;
    public final boolean x0;
    public final long y0;
    public final int z0;

    public umd(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = z4;
        this.Y = j2;
        this.Z = j3;
        this.w0 = Collections.unmodifiableList(list);
        this.x0 = z5;
        this.y0 = j4;
        this.z0 = i;
        this.A0 = i2;
        this.B0 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeByte(this.X ? (byte) 1 : 0);
        parcel.writeLong(this.Y);
        parcel.writeLong(this.Z);
        List list = this.w0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            smd smd = (smd) list.get(i2);
            parcel.writeInt(smd.a);
            parcel.writeLong(smd.b);
            parcel.writeLong(smd.c);
        }
        parcel.writeByte(this.x0 ? (byte) 1 : 0);
        parcel.writeLong(this.y0);
        parcel.writeInt(this.z0);
        parcel.writeInt(this.A0);
        parcel.writeInt(this.B0);
    }

    public umd(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = true;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.o = parcel.readByte() == 1;
        this.X = parcel.readByte() == 1;
        this.Y = parcel.readLong();
        this.Z = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new smd(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.w0 = Collections.unmodifiableList(arrayList);
        this.x0 = parcel.readByte() != 1 ? false : z;
        this.y0 = parcel.readLong();
        this.z0 = parcel.readInt();
        this.A0 = parcel.readInt();
        this.B0 = parcel.readInt();
    }
}
