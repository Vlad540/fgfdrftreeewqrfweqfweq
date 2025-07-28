package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* renamed from: o55  reason: default package */
public final class o55 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final z23 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ExportException p;
    public final ws6 q;

    public o55(e8c e8c, long j2, long j3, int i2, int i3, int i4, String str, String str2, int i5, z23 z23, int i6, int i7, int i8, String str3, String str4, int i9, ExportException exportException) {
        String str5 = str2;
        String str6 = str4;
        int i10 = i9;
        this.q = e8c;
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str5;
        this.h = i5;
        this.i = z23;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = str3;
        this.n = str6;
        this.o = i10;
        this.p = exportException;
        a(str5, i10, e8c, 1);
        a(str6, i10, e8c, 2);
    }

    public static void a(String str, int i2, e8c e8c, int i3) {
        if (str != null && i2 != 1) {
            boolean z = false;
            po5 l2 = e8c.listIterator(0);
            while (l2.hasNext()) {
                n55 n55 = (n55) l2.next();
                if ((i3 == 1 ? n55.a : n55.b) == null) {
                    if (!z) {
                        z = true;
                    } else {
                        return;
                    }
                } else if (!z) {
                    z = true;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o55)) {
            return false;
        }
        o55 o55 = (o55) obj;
        return Objects.equals(this.q, o55.q) && this.a == o55.a && this.b == o55.b && this.c == o55.c && this.d == o55.d && this.e == o55.e && Objects.equals(this.f, o55.f) && Objects.equals(this.g, o55.g) && this.h == o55.h && Objects.equals(this.i, o55.i) && this.j == o55.j && this.k == o55.k && this.l == o55.l && Objects.equals(this.m, o55.m) && Objects.equals(this.n, o55.n) && this.o == o55.o && Objects.equals(this.p, o55.p);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.f);
        int hashCode2 = Objects.hashCode(this.g);
        int hashCode3 = Objects.hashCode(this.i);
        int hashCode4 = Objects.hashCode(this.m);
        int hashCode5 = Objects.hashCode(this.n);
        return Objects.hashCode(this.p) + ((((hashCode5 + ((hashCode4 + ((((((((hashCode3 + ((((hashCode2 + ((hashCode + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
