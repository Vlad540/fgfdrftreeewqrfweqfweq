package defpackage;

/* renamed from: un8  reason: default package */
public final /* synthetic */ class un8 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ un8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        pda pda = (pda) obj;
        switch (this.a) {
            case 0:
                return new a1f(0, this.b ? pda.a().c().c.n : pda.a().f().c.n);
            case 1:
                return new a1f(0, this.b ? pda.a().c().c.l : pda.a().f().c.l);
            default:
                return new a1f(0, this.b ? pda.getIcon().a.c : pda.a().o().b.a);
        }
    }
}
