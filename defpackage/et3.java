package defpackage;

/* renamed from: et3  reason: default package */
public final /* synthetic */ class et3 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf3 b;

    public /* synthetic */ et3(pf3 pf3, int i) {
        this.a = i;
        this.b = pf3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        pf3 pf3 = this.b;
        switch (i) {
            case 0:
                pf3.accept((String) obj);
                return;
            default:
                pf3.accept((Throwable) obj);
                return;
        }
    }
}
