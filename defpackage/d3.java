package defpackage;

import java.util.Random;

/* renamed from: d3  reason: default package */
public abstract class d3 extends kxb {
    public final int a(int i) {
        return (k().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public final boolean b() {
        return k().nextBoolean();
    }

    public final byte[] c(byte[] bArr) {
        k().nextBytes(bArr);
        return bArr;
    }

    public final double d() {
        return k().nextDouble();
    }

    public final float e() {
        return k().nextFloat();
    }

    public final int f() {
        return k().nextInt();
    }

    public final int g(int i) {
        return k().nextInt(i);
    }

    public final long h() {
        return k().nextLong();
    }

    public abstract Random k();
}
