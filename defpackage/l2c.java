package defpackage;

/* renamed from: l2c  reason: default package */
public final /* synthetic */ class l2c implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2c b;

    public /* synthetic */ l2c(n2c n2c, int i) {
        this.a = i;
        this.b = n2c;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                f2c f2c = (f2c) obj;
                n2c n2c = this.b;
                return new w63(new o73(new jx7(n2c.b(), 2, new w48(n2c, 23, f2c)), 2, j2c.a(f2c, 0)), 2, new l2c(n2c, 1));
            default:
                c2c c2c = (c2c) obj;
                n2c n2c2 = this.b;
                c2c.c = ((lqc) n2c2.b).m();
                return new w63(n2c2.b(), 2, new ss8(26, (Object) c2c));
        }
    }
}
