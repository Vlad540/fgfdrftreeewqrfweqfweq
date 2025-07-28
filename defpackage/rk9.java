package defpackage;

import org.webrtc.PeerConnectionFactory;

/* renamed from: rk9  reason: default package */
public final class rk9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PeerConnectionFactory.EnhancerKind e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Runnable m;
    public final int n;

    public rk9(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i2, int i3, int i4, int i5, int i6, boolean z5, tg0 tg0, int i7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = enhancerKind;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = z5;
        this.m = tg0;
        this.n = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk9)) {
            return false;
        }
        rk9 rk9 = (rk9) obj;
        rk9.getClass();
        return this.a == rk9.a && this.b == rk9.b && this.c == rk9.c && this.d == rk9.d && this.e == rk9.e && hhd.f(this.f, rk9.f) && this.g == rk9.g && this.h == rk9.h && this.i == rk9.i && this.j == rk9.j && this.k == rk9.k && this.l == rk9.l && hhd.f(this.m, rk9.m) && this.n == rk9.n;
    }

    public final int hashCode() {
        int i2 = 0;
        int f2 = th2.f(th2.f(th2.f(th2.f(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
        PeerConnectionFactory.EnhancerKind enhancerKind = this.e;
        int hashCode = (f2 + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.f;
        int f3 = th2.f(am7.a(this.k, am7.a(this.j, am7.a(this.i, am7.a(this.h, am7.a(this.g, (hashCode + (str == null ? 0 : str.hashCode())) * 31))))), 31, this.l);
        Runnable runnable = this.m;
        int hashCode2 = (f3 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        int i3 = this.n;
        if (i3 != 0) {
            i2 = hr1.t(i3);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoiseSuppressorActiveState(noiseSuppressorStuttering=false, serversideBasic=");
        sb.append(this.a);
        sb.append(", serversideAnn=");
        sb.append(this.b);
        sb.append(", clientsidePlatform=");
        sb.append(this.c);
        sb.append(", clientsideAnn=");
        sb.append(this.d);
        sb.append(", enhancerKind=");
        sb.append(this.e);
        sb.append(", filePath=");
        sb.append(this.f);
        sb.append(", inputSampleRate=");
        sb.append(this.g);
        sb.append(", outputSampleRate=");
        sb.append(this.h);
        sb.append(", fallbackTimeLimitMillis=");
        sb.append(this.i);
        sb.append(", fallbackStutterCountMillis=");
        sb.append(this.j);
        sb.append(", fallbackTimeframeMillis=");
        sb.append(this.k);
        sb.append(", logTimings=");
        sb.append(this.l);
        sb.append(", onNoiseSuppressorDisabledDueToStutter=");
        sb.append(this.m);
        sb.append(", kind=");
        int i2 = this.n;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "PIPELINE" : "BASELINE" : "NONE");
        sb.append(")");
        return sb.toString();
    }
}
