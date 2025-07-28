package defpackage;

/* renamed from: rk6  reason: default package */
public final class rk6 implements fjd {
    public final bx5 a;
    public boolean b;
    public final /* synthetic */ b9 c;

    public rk6(b9 b9Var) {
        this.c = b9Var;
        this.a = new bx5(((zs0) b9Var.Z).p());
    }

    public final void N(wr0 wr0, long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j != 0) {
            b9 b9Var = this.c;
            ((zs0) b9Var.Z).P(j);
            zs0 zs0 = (zs0) b9Var.Z;
            zs0.L("\r\n");
            zs0.N(wr0, j);
            zs0.L("\r\n");
        }
    }

    public final synchronized void close() {
        if (!this.b) {
            this.b = true;
            ((zs0) this.c.Z).L("0\r\n\r\n");
            b9 b9Var = this.c;
            bx5 bx5 = this.a;
            b9Var.getClass();
            xje xje = bx5.e;
            bx5.e = xje.d;
            xje.a();
            xje.b();
            this.c.b = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.b) {
            ((zs0) this.c.Z).flush();
        }
    }

    public final xje p() {
        return this.a;
    }
}
