package defpackage;

/* renamed from: go5  reason: default package */
public final class go5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final boolean o = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go5(an5 an5, Object obj, int i) {
        super(an5);
        this.c = i;
        this.X = obj;
    }

    public final void g(b1e b1e) {
        switch (this.c) {
            case 0:
                this.b.d(new fo5(b1e, this.X, this.o));
                return;
            default:
                omc a = ((qmc) this.X).a();
                jo5 jo5 = new jo5(b1e, a, this.b, this.o);
                b1e.e(jo5);
                a.b(jo5);
                return;
        }
    }
}
