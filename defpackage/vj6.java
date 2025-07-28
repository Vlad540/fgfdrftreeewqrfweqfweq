package defpackage;

import android.net.Uri;

/* renamed from: vj6  reason: default package */
public final class vj6 implements v2f {
    public final String a;
    public final xx b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Uri j;
    public final long k;

    public vj6(int i2, int i3, long j2, long j3, long j4, xx xxVar, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = xxVar;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = Uri.parse(str);
        this.k = j3;
    }

    public final v2f a(long j2) {
        String str = this.a;
        xx xxVar = this.b;
        return new vj6(this.h, this.i, this.c, this.d, j2, xxVar, str, this.f, this.g);
    }

    public final xx b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final boolean c0() {
        return this.f;
    }

    public final long d() {
        return this.e;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj6)) {
            return false;
        }
        vj6 vj6 = (vj6) obj;
        return hhd.f(this.a, vj6.a) && hhd.f(this.b, vj6.b) && this.c == vj6.c && this.d == vj6.d && this.e == vj6.e && this.f == vj6.f && this.g == vj6.g && this.h == vj6.h && this.i == vj6.i;
    }

    public final int getHeight() {
        return this.i;
    }

    public final int getWidth() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xx xxVar = this.b;
        return Integer.hashCode(this.i) + c3d.d(this.h, th2.f(th2.f(sxe.m(sxe.m(sxe.m((hashCode + (xxVar == null ? 0 : xxVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final long k() {
        return this.k;
    }

    public final Uri l() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", initSeekPos=");
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return wn6.j(sb, this.i, ")");
    }
}
