package defpackage;

/* renamed from: btc  reason: default package */
public final class btc implements dtc {
    public final String X;
    public final boolean Y;
    public final int Z = 0;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final long w0;
    public final int x0;

    public btc(long j, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = str4;
        this.Y = z;
        this.w0 = j >= 0 ? -j : j;
        this.x0 = rca.r;
    }

    public final int a() {
        return this.Z;
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int l() {
        return this.x0;
    }
}
