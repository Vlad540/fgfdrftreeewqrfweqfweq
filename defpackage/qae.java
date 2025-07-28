package defpackage;

/* renamed from: qae  reason: default package */
public final /* synthetic */ class qae implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nxc b;
    public final /* synthetic */ a06 c;

    public /* synthetic */ qae(nxc nxc, a06 a06, int i) {
        this.a = i;
        this.b = nxc;
        this.c = a06;
    }

    public final void accept(Object obj) {
        a06 a06 = this.c;
        nxc nxc = this.b;
        switch (this.a) {
            case 0:
                nxc.getClass();
                udd.n("tt5", "Tam emoji font loaded");
                a06.B((o39) obj);
                return;
            default:
                Throwable th = (Throwable) obj;
                ((g15) ((t97) nxc.c).getValue()).c(new Exception("Can't load emoji font", th), true);
                a06.A(th);
                return;
        }
    }
}
