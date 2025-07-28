package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: e69  reason: default package */
public final class e69 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e69> CREATOR = new vf7(24);
    public final int X;
    public final long Y;
    public String Z;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int o;

    public e69(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = jze.b(calendar);
        this.a = b2;
        this.b = b2.get(2);
        this.c = b2.get(1);
        this.o = b2.getMaximum(7);
        this.X = b2.getActualMaximum(5);
        this.Y = b2.getTimeInMillis();
    }

    public static e69 a(int i, int i2) {
        Calendar d = jze.d((Calendar) null);
        d.set(1, i);
        d.set(2, i2);
        return new e69(d);
    }

    public static e69 b(long j) {
        Calendar d = jze.d((Calendar) null);
        d.setTimeInMillis(j);
        return new e69(d);
    }

    public final String c() {
        if (this.Z == null) {
            this.Z = jze.a("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.Z;
    }

    public final int compareTo(Object obj) {
        return this.a.compareTo(((e69) obj).a);
    }

    public final int d(e69 e69) {
        if (this.a instanceof GregorianCalendar) {
            return (e69.b - this.b) + ((e69.c - this.c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e69)) {
            return false;
        }
        e69 e69 = (e69) obj;
        return this.b == e69.b && this.c == e69.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
