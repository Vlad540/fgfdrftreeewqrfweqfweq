package defpackage;

import android.graphics.Insets;

/* renamed from: qy6  reason: default package */
public final class qy6 {
    public static final qy6 e = new qy6(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public qy6(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static qy6 a(qy6 qy6, qy6 qy62) {
        return b(Math.max(qy6.a, qy62.a), Math.max(qy6.b, qy62.b), Math.max(qy6.c, qy62.c), Math.max(qy6.d, qy62.d));
    }

    public static qy6 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new qy6(i, i2, i3, i4);
    }

    public static qy6 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return py6.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy6.class != obj.getClass()) {
            return false;
        }
        qy6 qy6 = (qy6) obj;
        return this.d == qy6.d && this.a == qy6.a && this.c == qy6.c && this.b == qy6.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return hr1.h(sb, this.d, '}');
    }
}
