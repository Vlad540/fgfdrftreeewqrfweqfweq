package defpackage;

/* renamed from: qx4  reason: default package */
public final /* synthetic */ class qx4 implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx4 b;

    public /* synthetic */ qx4(tx4 tx4, int i) {
        this.a = i;
        this.b = tx4;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                tx4 tx4 = this.b;
                tx4.o.h.execute(new rx4(tx4, sn1, 0));
                return "fetchData";
            default:
                tx4 tx42 = this.b;
                tx42.o.h.execute(new rx4(tx42, sn1, 1));
                return "acquireBuffer";
        }
    }
}
