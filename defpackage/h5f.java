package defpackage;

/* renamed from: h5f  reason: default package */
public final class h5f implements s1f {
    public final long a;
    public final String b;
    public final q1f c;
    public final zqd d;
    public final ez e;
    public final zqd f;

    public h5f(long j, String str, q1f q1f, t0c t0c, ez ezVar, t0c t0c2) {
        this.a = j;
        this.b = str;
        this.c = q1f;
        this.d = t0c;
        this.e = ezVar;
        this.f = t0c2;
    }

    public final boolean a() {
        return false;
    }

    public final q1f b() {
        return this.c;
    }

    public final boolean d() {
        zqd zqd = this.d;
        return (zqd.getValue() instanceof az) || (zqd.getValue() instanceof dz);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5f)) {
            return false;
        }
        h5f h5f = (h5f) obj;
        if (this.a != h5f.a) {
            return false;
        }
        if (!hhd.f(this.b, h5f.b)) {
            return false;
        }
        return hhd.f(this.c, h5f.c);
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final long j() {
        return this.a;
    }
}
