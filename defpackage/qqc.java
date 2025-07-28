package defpackage;

/* renamed from: qqc  reason: default package */
public final class qqc extends b97 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqc(ch7 ch7, int i) {
        super(1);
        this.a = i;
        this.b = ch7;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                this.b.cancel(false);
                return jue.a;
            default:
                Throwable th2 = (Throwable) obj;
                this.b.cancel(false);
                return jue.a;
        }
    }
}
