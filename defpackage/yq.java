package defpackage;

/* renamed from: yq  reason: default package */
public final /* synthetic */ class yq implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr b;
    public final /* synthetic */ g32 c;

    public /* synthetic */ yq(dr drVar, g32 g32, int i) {
        this.a = i;
        this.b = drVar;
        this.c = g32;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                dr drVar = this.b;
                drVar.D0 = this.c.b;
                drVar.w();
                return jue.a;
            default:
                dr drVar2 = this.b;
                drVar2.C0 = this.c.b;
                drVar2.x();
                return jue.a;
        }
    }
}
