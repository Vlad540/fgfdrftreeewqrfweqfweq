package defpackage;

/* renamed from: dn7  reason: default package */
public final /* synthetic */ class dn7 implements u16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t97 b;

    public /* synthetic */ dn7(t97 t97) {
        this.b = t97;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                udd.s("LogController", "Failed to store event", th);
                ((g15) this.b.getValue()).c(th, true);
                return jue.a;
            default:
                return Boolean.valueOf(((di3) this.b.getValue()).m(((Long) obj).longValue()));
        }
    }

    public /* synthetic */ dn7(in7 in7, t97 t97) {
        this.b = t97;
    }
}
