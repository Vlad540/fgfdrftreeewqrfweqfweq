package defpackage;

/* renamed from: dv2  reason: default package */
public final /* synthetic */ class dv2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pae b;

    public /* synthetic */ dv2(pae pae, int i) {
        this.a = i;
        this.b = pae;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return n1g.a(this.b.b());
            default:
                return new ja6(n1g.a(this.b.a()));
        }
    }
}
