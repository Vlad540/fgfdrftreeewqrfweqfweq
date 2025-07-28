package defpackage;

/* renamed from: a6a  reason: default package */
public final /* synthetic */ class a6a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6a b;

    public /* synthetic */ a6a(i6a i6a, int i) {
        this.a = i;
        this.b = i6a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return n1g.a((hu3) this.b.b.d.invoke());
            default:
                mg5 mg5 = (mg5) this.b.b.b.getValue();
                mg5.getClass();
                return new rp7(mg5.g(mg5.b(), "upload").getAbsolutePath());
        }
    }
}
