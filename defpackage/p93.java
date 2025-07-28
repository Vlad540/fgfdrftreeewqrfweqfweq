package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: p93  reason: default package */
public final class p93 {
    public final int a;
    public final q93[] b;
    public long c;

    public p93(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new q93[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new uj9(threadFactory);
        }
    }

    public final q93 a() {
        int i = this.a;
        if (i == 0) {
            return r93.g;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % ((long) i))];
    }
}
