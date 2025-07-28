package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/* renamed from: kw0  reason: default package */
public final class kw0 implements Parcelable {
    public static final Parcelable.Creator<kw0> CREATOR = new h6(14);
    public final int X;
    public final int Y;
    public final int Z;
    public final e69 a;
    public final e69 b;
    public final t04 c;
    public final e69 o;

    public kw0(e69 e69, e69 e692, t04 t04, e69 e693, int i) {
        Objects.requireNonNull(e69, "start cannot be null");
        Objects.requireNonNull(e692, "end cannot be null");
        Objects.requireNonNull(t04, "validator cannot be null");
        this.a = e69;
        this.b = e692;
        this.o = e693;
        this.X = i;
        this.c = t04;
        if (e693 != null && e69.a.compareTo(e693.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (e693 != null && e693.a.compareTo(e692.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > jze.d((Calendar) null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.Z = e69.d(e692) + 1;
            this.Y = (e692.c - e69.c) + 1;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0)) {
            return false;
        }
        kw0 kw0 = (kw0) obj;
        return this.a.equals(kw0.a) && this.b.equals(kw0.b) && Objects.equals(this.o, kw0.o) && this.X == kw0.X && this.c.equals(kw0.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.o, Integer.valueOf(this.X), this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.X);
    }
}
