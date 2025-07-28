package defpackage;

/* renamed from: g2e  reason: default package */
public final /* synthetic */ class g2e implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g2e(pb5 pb5, String str, int i) {
        this.a = i;
        this.b = pb5;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        tf3 tf3 = (tf3) obj;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((gsc) this.b.b).g(tf3, this.c));
            case 1:
                return ((gsc) this.b.b).b(tf3, this.c);
            default:
                return this.b.e(tf3, this.c);
        }
    }
}
