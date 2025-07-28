package defpackage;

/* renamed from: z14  reason: default package */
public final class z14 {
    public final long a;
    public final mge b;
    public final int c;
    public final mge d;
    public final n06 e;

    public z14(long j, mge mge, int i, mge mge2, n06 n06) {
        this.a = j;
        this.b = mge;
        this.c = i;
        this.d = mge2;
        this.e = n06;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z14)) {
            return false;
        }
        z14 z14 = (z14) obj;
        return this.a == z14.a && hhd.f(this.b, z14.b) && this.c == z14.c && hhd.f(this.d, z14.d) && hhd.f(this.e, z14.e);
    }

    public final int hashCode() {
        int d2 = c3d.d(this.c, c3d.e(Long.hashCode(this.a) * 31, 31, this.b), 31);
        mge mge = this.d;
        return this.e.hashCode() + ((d2 + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        return "DebugSettingItem(itemId=" + this.a + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z14(long j, mge mge, int i, mge mge2, n06 n06, int i2) {
        this(j, mge, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : mge2, (i2 & 16) != 0 ? w14.f : n06);
    }
}
