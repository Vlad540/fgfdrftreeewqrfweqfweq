package defpackage;

/* renamed from: qw1  reason: default package */
public final /* synthetic */ class qw1 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j54 b;

    public /* synthetic */ qw1(j54 j54, int i) {
        this.a = i;
        this.b = j54;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.J((s4b) obj);
                return;
            case 1:
                s4b s4b = (s4b) obj;
                j54 j54 = this.b;
                j54.J(s4b);
                qe4 qe4 = (qe4) j54.X;
                e07.p("Pending request should be null", ((s4b) qe4.c) == null);
                qe4.c = s4b;
                return;
            default:
                this.b.K((eb0) obj);
                return;
        }
    }
}
