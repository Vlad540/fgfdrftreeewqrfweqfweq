package defpackage;

import android.graphics.Bitmap;

/* renamed from: vy5  reason: default package */
public final class vy5 {
    public final Bitmap a;
    public final int b;
    public final int c;

    public vy5(int i, int i2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy5)) {
            return false;
        }
        vy5 vy5 = (vy5) obj;
        return hhd.f(this.a, vy5.a) && this.b == vy5.b && this.c == vy5.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Integer.hashCode(this.c) + c3d.d(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultFrame(bitmap=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wn6.j(sb, this.c, ")");
    }
}
