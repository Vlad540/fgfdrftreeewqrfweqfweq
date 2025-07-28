package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: pi2  reason: default package */
public final class pi2 implements pg7, rg6 {
    public final oi2 A0;
    public final int B0;
    public final boolean C0;
    public final boolean D0;
    public final boolean E0;
    public final long F0;
    public final Long G0;
    public final long H0;
    public final CharSequence I0;
    public final boolean J0;
    public final boolean K0;
    public final int L0;
    public final long M0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence o;
    public final String w0;
    public final boolean x0;
    public final boolean y0;
    public final long z0;

    public pi2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str, boolean z, boolean z2, long j2, oi2 oi2, int i, boolean z3, boolean z4, boolean z5, long j3, Long l, long j4, CharSequence charSequence6, boolean z6, boolean z7) {
        long j5 = j;
        long j6 = j3;
        this.a = j5;
        this.b = uri;
        this.c = charSequence;
        this.o = charSequence2;
        this.X = charSequence3;
        this.Y = charSequence4;
        this.Z = charSequence5;
        this.w0 = str;
        this.x0 = z;
        this.y0 = z2;
        this.z0 = j2;
        this.A0 = oi2;
        this.B0 = i;
        this.C0 = z3;
        this.D0 = z4;
        this.E0 = z5;
        this.F0 = j6;
        this.G0 = l;
        this.H0 = j4;
        this.I0 = charSequence6;
        this.J0 = z6;
        this.K0 = z7;
        this.L0 = j6 != 0 ? qp2.b : qp2.a;
        this.M0 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2 = (pi2) obj;
        return this.a == pi2.a && hhd.f(this.b, pi2.b) && hhd.f(this.c, pi2.c) && hhd.f(this.o, pi2.o) && hhd.f(this.X, pi2.X) && hhd.f(this.Y, pi2.Y) && hhd.f(this.Z, pi2.Z) && hhd.f(this.w0, pi2.w0) && this.x0 == pi2.x0 && this.y0 == pi2.y0 && this.z0 == pi2.z0 && this.A0 == pi2.A0 && this.B0 == pi2.B0 && this.C0 == pi2.C0 && this.D0 == pi2.D0 && this.E0 == pi2.E0 && this.F0 == pi2.F0 && hhd.f(this.G0, pi2.G0) && this.H0 == pi2.H0 && hhd.f(this.I0, pi2.I0) && this.J0 == pi2.J0 && this.K0 == pi2.K0;
    }

    public final boolean g(pg7 pg7) {
        return this.M0 == pg7.getItemId();
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.M0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int f = me4.f(this.c, (hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        CharSequence charSequence = this.o;
        int f2 = me4.f(this.X, (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.Y;
        int hashCode2 = (f2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Z;
        int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        String str = this.w0;
        int m = sxe.m(th2.f(th2.f(th2.f(c3d.d(this.B0, (this.A0.hashCode() + sxe.m(th2.f(th2.f((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.x0), 31, this.y0), 31, this.z0)) * 31, 31), 31, this.C0), 31, this.D0), 31, this.E0), 31, this.F0);
        Long l = this.G0;
        if (l != null) {
            i = l.hashCode();
        }
        return Boolean.hashCode(this.K0) + th2.f(me4.f(this.I0, sxe.m((m + i) * 31, 31, this.H0), 31), 31, this.J0);
    }

    public final long k() {
        return this.z0;
    }

    public final int l() {
        return this.L0;
    }

    public final Object n(Object obj) {
        pi2 pi2 = (pg7) obj;
        u2 u2Var = null;
        pi2 pi22 = pi2 instanceof pi2 ? pi2 : null;
        if (pi22 != null) {
            u2Var = new u2(7);
            boolean z = false;
            boolean z2 = this.x0 != pi22.x0;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, z2);
            bitSet.set(1, !hhd.f(this.b, pi22.b) || this.H0 != pi22.H0 || !hhd.f(this.I0, pi22.I0));
            bitSet.set(2, !hhd.f(this.c, pi22.c));
            bitSet.set(3, !hhd.f(this.o, pi22.o));
            bitSet.set(4, !hhd.f(this.X, pi22.X) || !hhd.f(this.Y, pi22.Y));
            bitSet.set(5, !hhd.f(this.Z, pi22.Z));
            bitSet.set(6, !hhd.f(this.w0, pi22.w0));
            bitSet.set(7, this.z0 != pi22.z0);
            bitSet.set(8, this.A0 != pi22.A0);
            bitSet.set(9, this.B0 != pi22.B0);
            bitSet.set(10, this.C0 != pi22.C0);
            bitSet.set(11, this.D0 != pi22.D0);
            bitSet.set(12, this.E0 != pi22.E0);
            bitSet.set(13, this.F0 != pi22.F0);
            if (this.K0 != pi22.K0) {
                z = true;
            }
            bitSet.set(14, z);
        }
        return u2Var;
    }

    public final String toString() {
        String s = h2g.s(this.c);
        return "ChatModel(chatId=" + this.a + ", title=" + s + ", time=" + this.z0 + ")";
    }
}
