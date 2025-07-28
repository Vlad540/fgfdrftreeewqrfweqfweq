package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* renamed from: hs6  reason: default package */
public final class hs6 extends n1 implements ss6 {
    public static final BigInteger X = BigInteger.valueOf(Long.MAX_VALUE);
    public static final BigInteger b = BigInteger.valueOf(-2147483648L);
    public static final BigInteger c = BigInteger.valueOf(2147483647L);
    public static final BigInteger o = BigInteger.valueOf(Long.MIN_VALUE);
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128);
        BigInteger.valueOf(127);
        BigInteger.valueOf(-32768);
        BigInteger.valueOf(32767);
    }

    public hs6(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public final String a() {
        return this.a.toString();
    }

    public final long b() {
        return this.a.longValue();
    }

    public final int d() {
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(c) <= 0) {
            return bigInteger2.intValue();
        }
        throw new MessageIntegerOverflowException(bigInteger2);
    }

    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        n1 n1Var = (n1) ((uze) obj);
        if (n1Var.e() != 3) {
            return false;
        }
        return this.a.equals(n1Var.f().h());
    }

    public final ss6 f() {
        return this;
    }

    public final BigInteger h() {
        return this.a;
    }

    public final int hashCode() {
        long j;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            j = bigInteger2.longValue();
        } else if (o.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(X) > 0) {
            return bigInteger2.hashCode();
        } else {
            long longValue = bigInteger2.longValue();
            j = longValue ^ (longValue >>> 32);
        }
        return (int) j;
    }

    public final long i() {
        boolean j = j();
        BigInteger bigInteger = this.a;
        if (j) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    public final boolean j() {
        BigInteger bigInteger = o;
        BigInteger bigInteger2 = this.a;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(X) <= 0;
    }

    public final ss6 k() {
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
