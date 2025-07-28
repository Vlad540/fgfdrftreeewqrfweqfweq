package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z79  reason: default package */
public final class z79 implements v2f {
    public final List a;
    public final xx b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final Uri i;

    public z79(ArrayList arrayList, xx xxVar, long j, long j2, boolean z, int i2, int i3) {
        this.a = arrayList;
        this.b = xxVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = j2;
        this.i = arrayList.isEmpty() ? Uri.EMPTY : Uri.parse(((x79) arrayList.get(0)).a);
    }

    public final xx b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final boolean c0() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z79)) {
            return false;
        }
        z79 z79 = (z79) obj;
        return hhd.f(this.a, z79.a) && hhd.f(this.b, z79.b) && this.c == z79.c && this.d == z79.d && this.e == z79.e && this.f == z79.f && this.g == z79.g;
    }

    public final int getHeight() {
        return this.g;
    }

    public final int getWidth() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xx xxVar = this.b;
        return Integer.hashCode(this.g) + c3d.d(this.f, th2.f(sxe.m(sxe.m((hashCode + (xxVar == null ? 0 : xxVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final long k() {
        return this.h;
    }

    public final Uri l() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", isMute=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        return wn6.j(sb, this.g, ")");
    }
}
