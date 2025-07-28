package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: puc  reason: default package */
public final class puc extends luc {
    public final i6g j;
    public final i6g k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public puc(mxb mxb, long j2, long j3, long j4, long j5, long j6, List list, long j7, i6g i6g, i6g i6g2, long j8, long j9) {
        super(mxb, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = i6g;
        this.k = i6g2;
        this.l = j5;
    }

    public final mxb a(jac jac) {
        i6g i6g = this.j;
        if (i6g == null) {
            return (mxb) this.c;
        }
        vu5 vu5 = jac.a;
        return new mxb(0, i6g.a(vu5.w0, 0, 0, vu5.a), -1);
    }

    public final long e(long j2) {
        List list = this.f;
        if (list != null) {
            return (long) list.size();
        }
        long j3 = this.l;
        if (j3 != -1) {
            return (j3 - this.d) + 1;
        }
        if (j2 == -9223372036854775807L) {
            return -1;
        }
        BigInteger multiply = BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.a));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = al0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    public final mxb i(long j2, jac jac) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((ruc) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        vu5 vu5 = jac.a;
        return new mxb(0, this.k.a(vu5.w0, j2, j4, vu5.a), -1);
    }
}
