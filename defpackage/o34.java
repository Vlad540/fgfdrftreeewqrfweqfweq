package defpackage;

/* renamed from: o34  reason: default package */
public final /* synthetic */ class o34 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ String c;

    public /* synthetic */ o34(gd gdVar, String str, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = str;
    }

    public final void invoke(Object obj) {
        hd hdVar = (hd) obj;
        switch (this.a) {
            case 0:
                hdVar.getClass();
                hdVar.D(this.b, this.c);
                return;
            case 1:
                hdVar.g0(this.b, this.c);
                return;
            case 2:
                hdVar.getClass();
                hdVar.w0(this.b, this.c);
                return;
            default:
                hdVar.y(this.b, this.c);
                return;
        }
    }

    public /* synthetic */ o34(gd gdVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = gdVar;
        this.c = str;
    }
}
