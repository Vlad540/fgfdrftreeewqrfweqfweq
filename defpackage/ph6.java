package defpackage;

import java.util.List;

/* renamed from: ph6  reason: default package */
public final class ph6 extends vh0 {
    public final List X;
    public final long Y;

    public ph6(long j, List list) {
        super(0, (long) (list.size() - 1), 1);
        this.Y = j;
        this.X = list;
    }

    public final long a() {
        c();
        return this.Y + ((ki6) this.X.get((int) this.o)).X;
    }

    public final long b() {
        c();
        ki6 ki6 = (ki6) this.X.get((int) this.o);
        return this.Y + ki6.X + ki6.c;
    }
}
