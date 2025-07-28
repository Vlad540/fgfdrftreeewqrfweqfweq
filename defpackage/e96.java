package defpackage;

import android.net.Uri;

/* renamed from: e96  reason: default package */
public final class e96 implements v2f {
    public final Uri a;
    public final int b;
    public final int c;

    public e96(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    public final long c() {
        return 0;
    }

    public final boolean c0() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e96)) {
            return false;
        }
        e96 e96 = (e96) obj;
        return hhd.f(this.a, e96.a) && this.b == e96.b && this.c == e96.c;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final long k() {
        return 0;
    }

    public final Uri l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifVideoContent(contentUri=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wn6.j(sb, this.c, ")");
    }
}
