package defpackage;

import javax.inject.Provider;

/* renamed from: v94  reason: default package */
public final class v94 extends mw9 {
    public final /* synthetic */ int b = 2;
    public final jic c;
    public final uk d;
    public final nw9 e;

    /* JADX WARNING: type inference failed for: r0v1, types: [nw9, java.lang.Object] */
    public v94(g1b g1b) {
        super(g1b);
        this.e = new Object();
        uk ukVar = g1b.l;
        if (ukVar != null) {
            this.d = ukVar;
            this.c = new jic(ukVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final uk a() {
        switch (this.b) {
            case 0:
                return (te4) this.d;
            case 1:
                return (te4) this.d;
            default:
                return this.d;
        }
    }

    public final nw9 b() {
        switch (this.b) {
            case 0:
                return (ydc) this.e;
            case 1:
                return this.e;
            default:
                return (om3) this.e;
        }
    }

    public final jic c() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return this.c;
        }
    }

    public v94(l83 l83, nl nlVar, rl rlVar, jj7 jj7) {
        super(l83);
        ew ewVar = new ew(nlVar, 2, jj7);
        ql6 ql6 = new ql6(new qr4(18));
        ql6.e = (hl) l83.d;
        ql6.b.b = new iu(new mod(10, ewVar));
        te4 te4 = new te4(ql6, ewVar, rlVar, (Provider) l83.c);
        this.e = new ydc(ewVar, te4, ql6, 11);
        this.d = te4;
        this.c = new jic(te4);
    }

    public v94(l83 l83, ya3 ya3, mle mle) {
        super(l83);
        fq3 fq3 = new fq3(ya3);
        ql6 ql6 = new ql6(new qr4(18));
        ql6.e = (hl) l83.d;
        ql6.b.b = new iu(new mod(10, fq3));
        te4 te4 = new te4(ql6, fq3, mle, (Provider) l83.c);
        this.e = new jj7(fq3, te4, ql6);
        this.d = te4;
        this.c = new jic(te4);
    }
}
