package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: c9e  reason: default package */
public final class c9e {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final Set n;

    public c9e(String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = map;
        this.n = set;
    }

    public static c9e a(c9e c9e, boolean z, Map map, int i2) {
        c9e c9e2 = c9e;
        int i3 = i2;
        String str = c9e2.a;
        long j2 = c9e2.b;
        String str2 = c9e2.c;
        String str3 = c9e2.d;
        String str4 = c9e2.e;
        String str5 = c9e2.f;
        String str6 = c9e2.g;
        String str7 = c9e2.h;
        String str8 = c9e2.i;
        String str9 = c9e2.j;
        boolean z2 = (i3 & 1024) != 0 ? c9e2.k : z;
        boolean z3 = c9e2.l;
        Map map2 = (i3 & 4096) != 0 ? c9e2.m : map;
        Set set = c9e2.n;
        c9e.getClass();
        return new c9e(str, j2, str2, str3, str4, str5, str6, str7, str8, str9, z2, z3, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9e)) {
            return false;
        }
        c9e c9e = (c9e) obj;
        return hhd.f(this.a, c9e.a) && this.b == c9e.b && hhd.f(this.c, c9e.c) && hhd.f(this.d, c9e.d) && hhd.f(this.e, c9e.e) && hhd.f(this.f, c9e.f) && hhd.f(this.g, c9e.g) && hhd.f(this.h, c9e.h) && hhd.f(this.i, c9e.i) && hhd.f(this.j, c9e.j) && this.k == c9e.k && this.l == c9e.l && hhd.f(this.m, c9e.m) && hhd.f(this.n, c9e.n);
    }

    public final int hashCode() {
        int d2 = me4.d(sxe.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int d3 = me4.d(me4.d(me4.d(me4.d(me4.d((hashCode + i2) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = true;
        boolean z2 = this.k;
        if (z2) {
            z2 = true;
        }
        int i3 = (d3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.l;
        if (!z3) {
            z = z3;
        }
        return this.n.hashCode() + ((this.m.hashCode() + ((i3 + (z ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SystemState(versionName=" + this.a + ", versionCode=" + this.b + ", packageName=" + this.c + ", environment=" + this.d + ", buildUuid=" + this.e + ", sessionUuid=" + this.f + ", device=" + this.g + ", deviceId=" + this.h + ", vendor=" + this.i + ", osVersion=" + this.j + ", isInBackground=" + this.k + ", isRooted=" + this.l + ", properties=" + this.m + ", hostedLibrariesInfo=" + this.n + ')';
    }
}
