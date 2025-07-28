package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: uc8  reason: default package */
public final class uc8 implements Parcelable {
    public static final Parcelable.Creator<uc8> CREATOR = new vf7(14);
    public final Object a = new Object();
    public final Object b;
    public mn6 c;
    public i1f o;

    public uc8(Object obj, mn6 mn6) {
        this.b = obj;
        this.c = mn6;
        this.o = null;
    }

    public final mn6 a() {
        mn6 mn6;
        synchronized (this.a) {
            mn6 = this.c;
        }
        return mn6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc8)) {
            return false;
        }
        uc8 uc8 = (uc8) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return uc8.b == null;
        }
        Object obj3 = uc8.b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
