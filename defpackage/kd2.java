package defpackage;

import android.os.Parcelable;

/* renamed from: kd2  reason: default package */
public final class kd2 extends qd2 {
    public final Parcelable b;
    public final String c;
    public final boolean d;

    public kd2(nr8 nr8, String str, boolean z) {
        this.b = nr8;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2)) {
            return false;
        }
        kd2 kd2 = (kd2) obj;
        return hhd.f(this.b, kd2.b) && hhd.f(this.c, kd2.c) && this.d == kd2.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + me4.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImageLegacy(message=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", isSingleAttach=");
        return hr1.j(sb, this.d, ")");
    }
}
