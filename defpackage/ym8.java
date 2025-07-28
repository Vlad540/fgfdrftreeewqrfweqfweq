package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: ym8  reason: default package */
public final class ym8 implements Serializable, co7 {
    public final int A0;
    public final long B0;
    public final int C0;
    public final int D0;
    public final long E0;
    public final i62 F0;
    public final List G0;
    public final nd4 H0;
    public final vr8 I0;
    public final ms8 X;
    public final long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final long o;
    public final zy w0;
    public final rq8 x0;
    public final vs8 y0;
    public final ks8 z0;

    public ym8(long j, long j2, long j3, long j4, ms8 ms8, long j5, String str, zy zyVar, rq8 rq8, vs8 vs8, ks8 ks8, int i, long j6, int i2, int i3, long j7, i62 i62, List list, nd4 nd4, vr8 vr8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = ms8;
        this.Y = j5;
        this.Z = str;
        this.w0 = zyVar;
        this.x0 = rq8;
        this.y0 = vs8;
        this.z0 = ks8;
        this.A0 = i;
        this.B0 = j6;
        this.C0 = i2;
        this.D0 = i3;
        this.E0 = j7;
        this.F0 = i62;
        this.G0 = list;
        this.H0 = nd4;
        this.I0 = vr8;
    }

    public final String a(boolean z, boolean z2) {
        String str = this.Z;
        if (str == null) {
            str = null;
        } else if (!z2) {
            str = "***";
        }
        String T = ez3.T(Long.valueOf(this.b));
        String A = gwf.A(this.G0, z, z2);
        return "Message{id=" + this.a + ", text=" + str + ", delayedAttrs=" + this.H0 + ", time=" + T + ", status=" + this.X + ", sender=" + this.o + ", cid=" + this.Y + ", attaches=" + this.w0 + ", type=" + this.y0 + ", elements=" + A + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym8)) {
            return false;
        }
        ym8 ym8 = (ym8) obj;
        return this.a == ym8.a && this.b == ym8.b && this.c == ym8.c && this.o == ym8.o && this.X == ym8.X && this.Y == ym8.Y && hhd.f(this.Z, ym8.Z) && hhd.f(this.w0, ym8.w0) && hhd.f(this.x0, ym8.x0) && this.y0 == ym8.y0 && hhd.f(this.z0, ym8.z0) && this.A0 == ym8.A0 && this.B0 == ym8.B0 && this.C0 == ym8.C0 && this.D0 == ym8.D0 && this.E0 == ym8.E0 && hhd.f(this.F0, ym8.F0) && hhd.f(this.G0, ym8.G0) && hhd.f(this.H0, ym8.H0) && hhd.f(this.I0, ym8.I0);
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
        int i = 0;
        ms8 ms8 = this.X;
        int m2 = sxe.m((m + (ms8 == null ? 0 : ms8.hashCode())) * 31, 31, this.Y);
        String str = this.Z;
        int hashCode = (this.w0.hashCode() + ((m2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        rq8 rq8 = this.x0;
        int hashCode2 = (this.y0.hashCode() + ((hashCode + (rq8 == null ? 0 : rq8.hashCode())) * 31)) * 31;
        ks8 ks8 = this.z0;
        int m3 = sxe.m(c3d.d(this.D0, c3d.d(this.C0, sxe.m(c3d.d(this.A0, (hashCode2 + (ks8 == null ? 0 : ks8.hashCode())) * 31, 31), 31, this.B0), 31), 31), 31, this.E0);
        i62 i62 = this.F0;
        int f = c3d.f(this.G0, (m3 + (i62 == null ? 0 : i62.hashCode())) * 31, 31);
        nd4 nd4 = this.H0;
        int hashCode3 = (f + (nd4 == null ? 0 : nd4.hashCode())) * 31;
        vr8 vr8 = this.I0;
        if (vr8 != null) {
            i = vr8.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return a(false, false);
    }
}
