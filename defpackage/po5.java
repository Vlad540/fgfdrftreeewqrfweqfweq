package defpackage;

/* renamed from: po5  reason: default package */
public final class po5 extends o1 {
    public final Iterable X;
    public final /* synthetic */ int o = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public po5(qo5 qo5, int i) {
        super(i, 0);
        this.X = qo5;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((qo5) this.X).a[i].iterator();
            default:
                return ((ws6) this.X).get(i);
        }
    }

    public po5(ws6 ws6, int i) {
        super(ws6.size(), i);
        this.X = ws6;
    }
}
