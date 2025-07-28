package defpackage;

import java.util.Objects;

/* renamed from: au9  reason: default package */
public final class au9 extends w2 {
    public final /* synthetic */ int b;
    public final j26 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au9(nv9 nv9, j26 j26, int i) {
        super(nv9);
        this.b = i;
        this.c = j26;
    }

    public final void q(bw9 bw9) {
        switch (this.b) {
            case 0:
                this.a.a(new zt9(bw9, this.c, 0));
                return;
            case 1:
                this.a.a(new zt9(bw9, this.c, 1));
                return;
            case 2:
                this.a.a(new bu9(bw9, this.c, 0));
                return;
            case 3:
                this.a.a(new st9(bw9, this.c, 1));
                return;
            case 4:
                lga lga = new lga(bw9, this.c);
                bw9.d((bw1) lga.X);
                this.a.a(lga);
                return;
            case 5:
                this.a.a(new bu9(bw9, this.c, 1));
                return;
            default:
                czc czc = new czc(new ajb());
                try {
                    Object apply = this.c.apply(czc);
                    Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
                    nv9 nv9 = (nv9) apply;
                    gv9 gv9 = new gv9(bw9, czc, this.a);
                    bw9.d(gv9);
                    nv9.a(gv9.X);
                    gv9.a();
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    cw4.b(th, bw9);
                    return;
                }
        }
    }
}
