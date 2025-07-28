package defpackage;

/* renamed from: e35  reason: default package */
public final /* synthetic */ class e35 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ f35 c;

    public /* synthetic */ e35(t97 t97, f35 f35, int i) {
        this.a = i;
        this.b = t97;
        this.c = f35;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                fv0 fv0 = new fv0();
                fv0.a = (bv0) this.b.getValue();
                fv0.c = (mz3) this.c.c.getValue();
                fv0.d = 2;
                return fv0;
            case 1:
                return new abe(((yae) this.b.getValue()).e(), (f54) this.c.b.getValue());
            default:
                fv0 fv02 = new fv0();
                fv02.a = (bv0) this.b.getValue();
                fv02.c = (mz3) this.c.e.getValue();
                fv02.d = 2;
                return fv02;
        }
    }
}
