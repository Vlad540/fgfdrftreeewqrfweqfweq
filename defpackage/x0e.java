package defpackage;

import java.util.Iterator;

/* renamed from: x0e  reason: default package */
public final class x0e implements dyc, ip4 {
    public final dyc a;
    public final int b;
    public final int c;

    public x0e(dyc dyc, int i, int i2) {
        this.a = dyc;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(wn6.h(i, "startIndex should be non-negative, but is ").toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException(wn6.h(i2, "endIndex should be non-negative, but is ").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(me4.g("endIndex should be not less than startIndex, but was ", i2, i, " < ").toString());
        }
    }

    public final dyc a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return this;
        }
        return new x0e(this.a, i3, i + i3);
    }

    public final dyc b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return pw4.a;
        }
        return new x0e(this.a, i3 + i, i2);
    }

    public final Iterator iterator() {
        return new v66(this);
    }
}
