package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* renamed from: xs6  reason: default package */
public final class xs6 extends n1 implements ss6 {
    public final long a;

    public xs6(long j) {
        this.a = j;
    }

    public final String a() {
        return Long.toString(this.a);
    }

    public final long b() {
        return this.a;
    }

    public final int d() {
        long j = this.a;
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
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
        ss6 f = n1Var.f();
        if (!f.j()) {
            return false;
        }
        return this.a == f.b();
    }

    public final ss6 f() {
        return this;
    }

    public final BigInteger h() {
        return BigInteger.valueOf(this.a);
    }

    public final int hashCode() {
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    public final long i() {
        return this.a;
    }

    public final boolean j() {
        return true;
    }

    public final ss6 k() {
        return this;
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
