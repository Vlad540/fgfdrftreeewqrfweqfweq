package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: dt9  reason: default package */
public final class dt9 extends w2 {
    public final /* synthetic */ int b;
    public final TimeUnit c;
    public final qmc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt9(ajb ajb, TimeUnit timeUnit, qmc qmc, int i) {
        super(ajb);
        this.b = i;
        this.c = timeUnit;
        this.o = qmc;
    }

    public final void q(bw9 bw9) {
        switch (this.b) {
            case 0:
                this.a.a(new ct9(new zyc(bw9), this.c, this.o.a()));
                return;
            default:
                this.a.a(new tv9(bw9, this.c, this.o.a()));
                return;
        }
    }
}
