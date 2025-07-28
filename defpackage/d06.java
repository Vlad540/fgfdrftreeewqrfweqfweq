package defpackage;

/* renamed from: d06  reason: default package */
public final /* synthetic */ class d06 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8e b;

    public /* synthetic */ d06(j8e j8e, int i) {
        this.a = i;
        this.b = j8e;
    }

    public final Object invoke() {
        j8e j8e = this.b;
        switch (this.a) {
            case 0:
                return ((x4a) ((t97) j8e.a).getValue()).b();
            case 1:
                return ((x4a) ((t97) j8e.a).getValue()).a();
            case 2:
                return ((x4a) ((t97) j8e.a).getValue()).a();
            default:
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                x4a x4a = (x4a) ((t97) j8e.a).getValue();
                k77[] k77Arr = x4a.p;
                return x4a.h(x4a.e(availableProcessors, "frsc-sch", availableProcessors, 5), "frsc-sch");
        }
    }
}
