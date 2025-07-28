package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: a39  reason: default package */
public final class a39 implements Parcelable {
    public static final Parcelable.Creator<a39> CREATOR = new vf7(21);
    public final x29[] a;
    public final long b;

    public a39(x29... x29Arr) {
        this(-9223372036854775807L, x29Arr);
    }

    public final a39 a(x29... x29Arr) {
        if (x29Arr.length == 0) {
            return this;
        }
        int i = oze.a;
        x29[] x29Arr2 = this.a;
        Object[] copyOf = Arrays.copyOf(x29Arr2, x29Arr2.length + x29Arr.length);
        System.arraycopy(x29Arr, 0, copyOf, x29Arr2.length, x29Arr.length);
        return new a39(this.b, (x29[]) copyOf);
    }

    public final a39 b(a39 a39) {
        return a39 == null ? this : a(a39.a);
    }

    public final x29 c(int i) {
        return this.a[i];
    }

    public final int d() {
        return this.a.length;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a39.class != obj.getClass()) {
            return false;
        }
        a39 a39 = (a39) obj;
        return Arrays.equals(this.a, a39.a) && this.b == a39.b;
    }

    public final int hashCode() {
        return js.w(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        x29[] x29Arr = this.a;
        parcel.writeInt(x29Arr.length);
        for (x29 writeParcelable : x29Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.b);
    }

    public a39(long j, x29... x29Arr) {
        this.b = j;
        this.a = x29Arr;
    }

    public a39(List list) {
        this((x29[]) list.toArray(new x29[0]));
    }

    public a39(Parcel parcel) {
        this.a = new x29[parcel.readInt()];
        int i = 0;
        while (true) {
            x29[] x29Arr = this.a;
            if (i < x29Arr.length) {
                x29Arr[i] = (x29) parcel.readParcelable(x29.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
