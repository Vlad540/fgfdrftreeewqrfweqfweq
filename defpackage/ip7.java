package defpackage;

/* renamed from: ip7  reason: default package */
public final class ip7 extends ol implements qce {
    public final String o;

    public ip7(long j, String str) {
        super(j);
        this.o = str;
    }

    public final void c(lbe lbe) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new wt(this.a, 8));
    }

    public final void d(uae uae) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new jh0(this.a, uae));
    }

    public final ibe i() {
        ibe ibe = new ibe(dfa.LOGOUT);
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            ibe.s("pushToken", str);
        }
        return ibe;
    }
}
