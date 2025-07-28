package defpackage;

/* renamed from: d44  reason: default package */
public final /* synthetic */ class d44 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ i78 c;

    public /* synthetic */ d44(gd gdVar, i78 i78, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = i78;
    }

    public final void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 0:
                hdVar.E0(this.b, this.c);
                return;
            default:
                hdVar.W(this.b, this.c);
                return;
        }
    }
}
