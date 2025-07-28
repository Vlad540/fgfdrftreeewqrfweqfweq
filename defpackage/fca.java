package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: fca  reason: default package */
public final class fca implements Parcelable {
    public static final Parcelable.Creator<fca> CREATOR = new ch9(6);
    public static final fca Z = new fca(wba.a, "", (CharSequence) null, cca.a, new pba(0, 0, 7), rba.b);
    public final pba X;
    public final tba Y;
    public final zba a;
    public final CharSequence b;
    public final CharSequence c;
    public final eca o;

    public fca(zba zba, CharSequence charSequence, CharSequence charSequence2, eca eca, pba pba, tba tba) {
        this.a = zba;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = eca;
        this.X = pba;
        this.Y = tba;
    }

    public static fca a(fca fca, zba zba, CharSequence charSequence, CharSequence charSequence2, eca eca, pba pba, tba tba, int i) {
        if ((i & 1) != 0) {
            zba = fca.a;
        }
        zba zba2 = zba;
        if ((i & 2) != 0) {
            charSequence = fca.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = fca.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            eca = fca.o;
        }
        eca eca2 = eca;
        if ((i & 16) != 0) {
            pba = fca.X;
        }
        pba pba2 = pba;
        if ((i & 32) != 0) {
            tba = fca.Y;
        }
        fca.getClass();
        return new fca(zba2, charSequence3, charSequence4, eca2, pba2, tba);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fca)) {
            return false;
        }
        fca fca = (fca) obj;
        return hhd.f(this.a, fca.a) && hhd.f(this.b, fca.b) && hhd.f(this.c, fca.c) && hhd.f(this.o, fca.o) && hhd.f(this.X, fca.X) && hhd.f(this.Y, fca.Y);
    }

    public final int hashCode() {
        int f = me4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        int hashCode2 = this.o.hashCode();
        return this.Y.hashCode() + ((this.X.hashCode() + ((hashCode2 + ((f + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + this.b + ", caption=" + this.c + ", right=" + this.o + ", params=" + this.X + ", duration=" + this.Y + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.o, i);
        this.X.writeToParcel(parcel, i);
        parcel.writeParcelable(this.Y, i);
    }

    public /* synthetic */ fca(zba zba, String str, String str2, pba pba) {
        this(zba, str, str2, cca.a, pba, rba.b);
    }
}
