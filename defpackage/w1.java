package defpackage;

import java.util.RandomAccess;

/* renamed from: w1  reason: default package */
public final class w1 extends x1 implements RandomAccess {
    public final x1 a;
    public final int b;
    public final int c;

    public w1(x1 x1Var, int i, int i2) {
        this.a = x1Var;
        this.b = i;
        ete.m(i, i2, x1Var.getSize());
        this.c = i2 - i;
    }

    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(me4.g("index: ", i, i2, ", size: "));
        }
        return this.a.get(this.b + i);
    }

    public final int getSize() {
        return this.c;
    }
}
