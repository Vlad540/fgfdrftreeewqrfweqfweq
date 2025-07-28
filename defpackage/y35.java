package defpackage;

/* renamed from: y35  reason: default package */
public final /* synthetic */ class y35 implements lh7, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z78 b;

    public /* synthetic */ y35(z78 z78, int i) {
        this.a = i;
        this.b = z78;
    }

    public void accept(Object obj) {
        ((qza) obj).n0(this.b);
    }

    public void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 0:
                hya.b0(this.b);
                return;
            default:
                hya.c0(this.b);
                return;
        }
    }
}
