package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b0b  reason: default package */
public final class b0b extends o3 {
    public static final Parcelable.Creator<b0b> CREATOR = new o1g(19);
    public final List A0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final List a;
    public float b;
    public int c;
    public final float o;
    public final kw1 w0;
    public final kw1 x0;
    public int y0;
    public final List z0;

    public b0b() {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = 0.0f;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.w0 = new ut0();
        this.x0 = new ut0();
        this.y0 = 0;
        this.z0 = null;
        this.A0 = new ArrayList();
        this.a = new ArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.m0(parcel, this.a, 2);
        float f = this.b;
        ek8.p0(parcel, 3, 4);
        parcel.writeFloat(f);
        int i2 = this.c;
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(i2);
        ek8.p0(parcel, 5, 4);
        parcel.writeFloat(this.o);
        ek8.p0(parcel, 6, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ek8.p0(parcel, 7, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ek8.p0(parcel, 8, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        ek8.j0(parcel, 9, this.w0.b(), i);
        ek8.j0(parcel, 10, this.x0.b(), i);
        int i3 = this.y0;
        ek8.p0(parcel, 11, 4);
        parcel.writeInt(i3);
        ek8.m0(parcel, this.z0, 12);
        List<v0e> list = this.A0;
        ArrayList arrayList = new ArrayList(list.size());
        for (v0e v0e : list) {
            s0e s0e = v0e.a;
            float f2 = s0e.a;
            Pair pair = new Pair(Integer.valueOf(s0e.b), Integer.valueOf(s0e.c));
            arrayList.add(new v0e(new s0e(this.b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.X, s0e.X), v0e.b));
        }
        ek8.m0(parcel, arrayList, 13);
        ek8.o0(parcel, n0);
    }

    public b0b(ArrayList arrayList, float f, int i, float f2, boolean z, boolean z2, boolean z3, kw1 kw1, kw1 kw12, int i2, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = 0.0f;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.w0 = new ut0();
        this.x0 = new ut0();
        this.y0 = 0;
        this.z0 = null;
        this.A0 = new ArrayList();
        this.a = arrayList;
        this.b = f;
        this.c = i;
        this.o = f2;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        if (kw1 != null) {
            this.w0 = kw1;
        }
        if (kw12 != null) {
            this.x0 = kw12;
        }
        this.y0 = i2;
        this.z0 = arrayList2;
        if (arrayList3 != null) {
            this.A0 = arrayList3;
        }
    }
}
