package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vr1  reason: default package */
public final class vr1 implements vs1 {
    public final Executor a;
    public final yr1 b;
    public final int c;

    public vr1(yr1 yr1, Executor executor, int i) {
        this.b = yr1;
        this.a = executor;
        this.c = i;
    }

    public final ch7 a() {
        j36 a2 = j36.a(this.b.a(this.c));
        sr1 sr1 = new sr1(1);
        a2.getClass();
        return ct0.N(a2, new e3(sr1), this.a);
    }

    public final ch7 b() {
        return hwf.f(new rgc(25, this));
    }
}
