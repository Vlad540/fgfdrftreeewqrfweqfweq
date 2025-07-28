package defpackage;

/* renamed from: imc  reason: default package */
public final class imc extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imc(int i, t97 t97) {
        super(0);
        this.a = i;
        this.b = t97;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((cbf) this.b.getValue()).v();
            default:
                le6 le6 = (cbf) this.b.getValue();
                le6 le62 = le6 instanceof le6 ? le6 : null;
                return le62 != null ? le62.o() : fw3.b;
        }
    }
}
