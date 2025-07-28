package defpackage;

import java.util.Set;

/* renamed from: if3  reason: default package */
public final class if3 {
    public static final if3 i = new if3(1, false, false, false, false, -1, -1, qw4.a);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public if3(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!if3.class.equals(obj.getClass())) {
            return false;
        }
        if3 if3 = (if3) obj;
        if (this.b == if3.b && this.c == if3.c && this.d == if3.d && this.e == if3.e && this.f == if3.f && this.g == if3.g && this.a == if3.a) {
            return hhd.f(this.h, if3.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((hr1.t(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
