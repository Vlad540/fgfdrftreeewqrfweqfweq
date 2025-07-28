package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: vz3  reason: default package */
public final class vz3 implements zz3 {
    public final /* synthetic */ n4 a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ n4 c;

    public vz3(n4 n4Var, CountDownLatch countDownLatch, n4 n4Var2) {
        this.a = n4Var;
        this.b = countDownLatch;
        this.c = n4Var2;
    }

    public final void a(g0 g0Var) {
        CountDownLatch countDownLatch = this.b;
        if (g0Var.h()) {
            try {
                this.a.a = g0Var.e();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public final void b(g0 g0Var) {
    }

    public final void c(g0 g0Var) {
        CountDownLatch countDownLatch = this.b;
        try {
            this.c.a = g0Var.c();
        } finally {
            countDownLatch.countDown();
        }
    }

    public final void d() {
        this.b.countDown();
    }
}
