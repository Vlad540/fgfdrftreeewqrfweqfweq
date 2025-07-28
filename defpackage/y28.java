package defpackage;

import android.text.TextUtils;

/* renamed from: y28  reason: default package */
public final class y28 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public y28(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != y28.class) {
            return false;
        }
        y28 y28 = (y28) obj;
        return TextUtils.equals(this.a, y28.a) && this.b == y28.b && this.c == y28.c;
    }

    public final int hashCode() {
        int i = 1237;
        int d = (me4.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31;
        if (this.c) {
            i = 1231;
        }
        return d + i;
    }
}
