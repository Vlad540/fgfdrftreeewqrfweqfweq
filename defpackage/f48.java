package defpackage;

/* renamed from: f48  reason: default package */
public final /* synthetic */ class f48 implements lh7, m48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o48 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f48(o48 o48, boolean z, int i) {
        this.a = i;
        this.b = o48;
        this.c = z;
    }

    public void f(nn6 nn6, int i) {
        switch (this.a) {
            case 1:
                nn6.E0(this.b.c, i, this.c);
                return;
            case 2:
                nn6.w0(this.b.c, i, this.c);
                return;
            default:
                nn6.c0(this.b.c, i, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 0:
                hya.i(this.b.n.r, this.c);
                return;
            default:
                hya.i(this.b.n.r, this.c);
                return;
        }
    }
}
