package defpackage;

/* renamed from: v68  reason: default package */
public final /* synthetic */ class v68 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z68 b;

    public /* synthetic */ v68(z68 z68, int i) {
        this.a = i;
        this.b = z68;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                d87 d87 = (d87) this.b.d.invoke();
                if (d87 != null) {
                    d87.m();
                }
                return jue.a;
            default:
                z68 z68 = this.b;
                z68.a();
                z68.l = false;
                return jue.a;
        }
    }
}
