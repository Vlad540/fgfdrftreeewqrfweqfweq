package defpackage;

import java.util.List;

/* renamed from: oh6  reason: default package */
public final class oh6 extends vh0 {
    public final List X;
    public final long Y;

    public oh6(long j, List list) {
        super(0, (long) (list.size() - 1), 0);
        this.Y = j;
        this.X = list;
    }

    public final long a() {
        c();
        return this.Y + ((ji6) this.X.get((int) this.o)).X;
    }

    public final long b() {
        c();
        ji6 ji6 = (ji6) this.X.get((int) this.o);
        return this.Y + ji6.X + ji6.c;
    }
}
