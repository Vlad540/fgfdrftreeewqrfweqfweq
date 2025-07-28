package defpackage;

import android.net.Uri;

/* renamed from: x79  reason: default package */
public final class x79 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;

    public x79(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = Uri.parse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x79)) {
            return false;
        }
        x79 x79 = (x79) obj;
        return hhd.f(this.a, x79.a) && this.b == x79.b && this.c == x79.c && this.d == x79.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(url=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return wn6.j(sb, this.d, ")");
    }
}
