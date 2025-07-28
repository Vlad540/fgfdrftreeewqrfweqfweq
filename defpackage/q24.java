package defpackage;

import android.text.TextUtils;

/* renamed from: q24  reason: default package */
public final class q24 {
    public final String a;
    public final xu5 b;
    public final xu5 c;
    public final int d;
    public final int e;

    public q24(String str, xu5 xu5, xu5 xu52, int i, int i2) {
        oyb.d(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            xu5.getClass();
            this.b = xu5;
            xu52.getClass();
            this.c = xu52;
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
        if (obj == null || q24.class != obj.getClass()) {
            return false;
        }
        q24 q24 = (q24) obj;
        return this.d == q24.d && this.e == q24.e && this.a.equals(q24.a) && this.b.equals(q24.b) && this.c.equals(q24.c);
    }

    public final int hashCode() {
        int d2 = me4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
