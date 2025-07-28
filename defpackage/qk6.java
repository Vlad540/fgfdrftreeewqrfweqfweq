package defpackage;

import java.io.IOException;

/* renamed from: qk6  reason: default package */
public abstract class qk6 implements tld {
    public final bx5 a;
    public boolean b;
    public final /* synthetic */ b9 c;

    public qk6(b9 b9Var) {
        this.c = b9Var;
        this.a = new bx5(((at0) b9Var.Y).p());
    }

    public long c(wr0 wr0, long j) {
        b9 b9Var = this.c;
        try {
            return ((at0) b9Var.Y).c(wr0, j);
        } catch (IOException e) {
            ((c1c) b9Var.X).k();
            m();
            throw e;
        }
    }

    public final void m() {
        b9 b9Var = this.c;
        int i = b9Var.b;
        if (i != 6) {
            if (i == 5) {
                bx5 bx5 = this.a;
                xje xje = bx5.e;
                bx5.e = xje.d;
                xje.a();
                xje.b();
                b9Var.b = 6;
                return;
            }
            throw new IllegalStateException("state: " + b9Var.b);
        }
    }

    public final xje p() {
        return this.a;
    }
}
