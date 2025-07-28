package defpackage;

/* renamed from: n34  reason: default package */
public final /* synthetic */ class n34 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n34(gd gdVar, boolean z, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = z;
    }

    public final void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 0:
                hdVar.t(this.b, this.c);
                return;
            case 1:
                hdVar.A(this.b, this.c);
                return;
            case 2:
                hdVar.r(this.b, this.c);
                return;
            default:
                hdVar.getClass();
                hdVar.y0(this.b, this.c);
                return;
        }
    }
}
