package defpackage;

/* renamed from: q15  reason: default package */
public final class q15 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public q15(String str, int i, int i2, long j, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q15)) {
            return false;
        }
        q15 q15 = (q15) obj;
        return hhd.f(this.a, q15.a) && this.b == q15.b && this.c == q15.c && this.d == q15.d && this.e == q15.e && this.f == q15.f && this.g == q15.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + th2.f(th2.f(sxe.m(c3d.d(this.c, c3d.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutorConfig(threadName=");
        sb.append(this.a);
        sb.append(", corePoolSize=");
        sb.append(this.b);
        sb.append(", maxPoolSize=");
        sb.append(this.c);
        sb.append(", keepAliveTimeMs=");
        sb.append(this.d);
        sb.append(", allowCoreThreadTimeOut=");
        sb.append(this.e);
        sb.append(", prestartCoreThreads=");
        sb.append(this.f);
        sb.append(", threadPriority=");
        return wn6.j(sb, this.g, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q15(String str, int i, long j, boolean z, boolean z2, int i2, int i3) {
        this(str, 1, i, (i3 & 8) != 0 ? 0 : j, z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 5 : i2);
    }
}
