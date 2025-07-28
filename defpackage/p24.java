package defpackage;

import android.text.TextUtils;

/* renamed from: p24  reason: default package */
public final class p24 {
    public final String a;
    public final vu5 b;
    public final vu5 c;
    public final int d;
    public final int e;

    public p24(String str, vu5 vu5, vu5 vu52, int i, int i2) {
        swb.e(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            vu5.getClass();
            this.b = vu5;
            vu52.getClass();
            this.c = vu52;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p24.class != obj.getClass()) {
            return false;
        }
        p24 p24 = (p24) obj;
        return this.d == p24.d && this.e == p24.e && this.a.equals(p24.a) && this.b.equals(p24.b) && this.c.equals(p24.c);
    }

    public final int hashCode() {
        int d2 = me4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
