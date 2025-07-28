package defpackage;

/* renamed from: c48  reason: default package */
public final /* synthetic */ class c48 implements m48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o48 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ c48(o48 o48, int i, int i2, int i3) {
        this.a = i3;
        this.b = o48;
        this.c = i;
        this.o = i2;
    }

    public final void f(nn6 nn6, int i) {
        switch (this.a) {
            case 0:
                nn6.K(this.b.c, i, this.c, this.o);
                return;
            case 1:
                nn6.s(this.b.c, i, this.c, this.o);
                return;
            default:
                nn6.C0(this.b.c, i, this.c, this.o);
                return;
        }
    }
}
