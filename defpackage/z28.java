package defpackage;

import android.text.TextUtils;

/* renamed from: z28  reason: default package */
public final class z28 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public z28(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != z28.class) {
            return false;
        }
        z28 z28 = (z28) obj;
        return TextUtils.equals(this.a, z28.a) && this.b == z28.b && this.c == z28.c;
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
