package defpackage;

/* renamed from: w34  reason: default package */
public final /* synthetic */ class w34 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ z50 c;

    public /* synthetic */ w34(gd gdVar, z50 z50, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = z50;
    }

    public final void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 0:
                hdVar.P(this.b, this.c);
                return;
            default:
                hdVar.h0(this.b, this.c);
                return;
        }
    }
}
