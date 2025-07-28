package defpackage;

/* renamed from: v34  reason: default package */
public final /* synthetic */ class v34 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ xu5 c;

    public /* synthetic */ v34(gd gdVar, xu5 xu5, q24 q24, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = xu5;
    }

    public final void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 0:
                hdVar.V(this.b, this.c);
                return;
            default:
                hdVar.I(this.b, this.c);
                return;
        }
    }
}
