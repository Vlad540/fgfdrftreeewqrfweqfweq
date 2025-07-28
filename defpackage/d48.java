package defpackage;

/* renamed from: d48  reason: default package */
public final /* synthetic */ class d48 implements m48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o48 b;
    public final /* synthetic */ float c;

    public /* synthetic */ d48(o48 o48, float f, int i) {
        this.a = i;
        this.b = o48;
        this.c = f;
    }

    public final void f(nn6 nn6, int i) {
        switch (this.a) {
            case 0:
                nn6.x(this.b.c, i, this.c);
                return;
            default:
                nn6.y(this.b.c, i, this.c);
                return;
        }
    }
}
