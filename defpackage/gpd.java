package defpackage;

/* renamed from: gpd  reason: default package */
public final class gpd {
    public final fpd a;
    public final boolean b;
    public final boolean c;
    public final s16 d;

    public gpd(fpd fpd, boolean z, boolean z2, s16 s16) {
        this.a = fpd;
        this.b = z;
        this.c = z2;
        this.d = s16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpd)) {
            return false;
        }
        gpd gpd = (gpd) obj;
        return hhd.f(this.a, gpd.a) && this.b == gpd.b && this.c == gpd.c && hhd.f(this.d, gpd.d);
    }

    public final int hashCode() {
        int f = th2.f(th2.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        s16 s16 = this.d;
        return f + (s16 == null ? 0 : s16.hashCode());
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ")";
    }
}
