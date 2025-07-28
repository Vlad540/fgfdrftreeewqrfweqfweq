package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* renamed from: id0  reason: default package */
public final class id0 implements Parcelable {
    public static final Parcelable.Creator<id0> CREATOR = new h6(8);
    public final ArrayList A0;
    public final ArrayList B0;
    public final boolean C0;
    public final int X;
    public final String Y;
    public final int Z;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] o;
    public final int w0;
    public final CharSequence x0;
    public final int y0;
    public final CharSequence z0;

    public id0(hd0 hd0) {
        int size = hd0.a.size();
        this.a = new int[(size * 6)];
        if (hd0.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.o = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                dy5 dy5 = (dy5) hd0.a.get(i2);
                int i3 = i + 1;
                this.a[i] = dy5.a;
                ArrayList arrayList = this.b;
                a aVar = dy5.b;
                arrayList.add(aVar != null ? aVar.Y : null);
                int[] iArr = this.a;
                iArr[i3] = dy5.c;
                iArr[i + 2] = dy5.d;
                iArr[i + 3] = dy5.e;
                int i4 = i + 5;
                iArr[i + 4] = dy5.f;
                i += 6;
                iArr[i4] = dy5.g;
                this.c[i2] = dy5.h.ordinal();
                this.o[i2] = dy5.i.ordinal();
            }
            this.X = hd0.f;
            this.Y = hd0.h;
            this.Z = hd0.s;
            this.w0 = hd0.i;
            this.x0 = hd0.j;
            this.y0 = hd0.k;
            this.z0 = hd0.l;
            this.A0 = hd0.m;
            this.B0 = hd0.n;
            this.C0 = hd0.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.o);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.w0);
        TextUtils.writeToParcel(this.x0, parcel, 0);
        parcel.writeInt(this.y0);
        TextUtils.writeToParcel(this.z0, parcel, 0);
        parcel.writeStringList(this.A0);
        parcel.writeStringList(this.B0);
        parcel.writeInt(this.C0 ? 1 : 0);
    }

    public id0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.o = parcel.createIntArray();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.w0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.x0 = (CharSequence) creator.createFromParcel(parcel);
        this.y0 = parcel.readInt();
        this.z0 = (CharSequence) creator.createFromParcel(parcel);
        this.A0 = parcel.createStringArrayList();
        this.B0 = parcel.createStringArrayList();
        this.C0 = parcel.readInt() != 0;
    }
}
