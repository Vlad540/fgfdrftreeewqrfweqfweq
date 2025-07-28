package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: quc  reason: default package */
public final class quc extends muc {
    public final ul7 j;
    public final ul7 k;
    public final long l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public quc(nxb nxb, long j2, long j3, long j4, long j5, long j6, List list, long j7, ul7 ul7, ul7 ul72, long j8, long j9) {
        super(nxb, j2, j3, j4, j6, list, j7, j8, j9);
        this.j = ul7;
        this.k = ul72;
        this.l = j5;
    }

    public final nxb b(kac kac) {
        ul7 ul7 = this.j;
        if (ul7 == null) {
            return (nxb) this.c;
        }
        xu5 xu5 = kac.a;
        return new nxb(0, ul7.r(xu5.i, 0, 0, xu5.a), -1);
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

    public final nxb i(long j2, kac kac) {
        long j3 = this.d;
        List list = this.f;
        long j4 = list != null ? ((suc) list.get((int) (j2 - j3))).a : (j2 - j3) * this.e;
        xu5 xu5 = kac.a;
        return new nxb(0, this.k.r(xu5.i, j2, j4, xu5.a), -1);
    }
}
