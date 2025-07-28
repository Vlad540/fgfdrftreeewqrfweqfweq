package defpackage;

/* renamed from: cs1  reason: default package */
public final /* synthetic */ class cs1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((sn1) this.b).b((Object) null);
                return;
            default:
                wnc wnc = (wnc) this.b;
                synchronized (wnc.b) {
                    wnc.c();
                }
                return;
        }
    }
}
