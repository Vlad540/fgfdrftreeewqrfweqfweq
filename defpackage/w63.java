package defpackage;

/* renamed from: w63  reason: default package */
public final class w63 extends v63 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w63(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void j(g73 g73) {
        switch (this.a) {
            case 0:
                ((v63) this.b).i(new pn1(g73, 1, (v63) this.c));
                return;
            case 1:
                ((v63) this.b).i(new mn((Object) this, 10, (Object) g73));
                return;
            default:
                pn1 pn1 = new pn1(g73, 7, (j26) this.c);
                g73.d(pn1);
                ((dhd) this.b).k(pn1);
                return;
        }
    }
}
