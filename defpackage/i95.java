package defpackage;

/* renamed from: i95  reason: default package */
public final /* synthetic */ class i95 implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ i95(long j) {
        this.a = 2;
        this.b = 10000;
        this.c = j;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new w63(((p95) obj).a(), 2, new i95(this.b, this.c, 1));
            case 1:
                return new y63(1, new ci3(1, this.b, this.c, (y95) obj));
            case 2:
                Throwable th = (Throwable) obj;
                long j = this.b;
                return (j <= 0 || System.currentTimeMillis() - this.c <= j) ? dhd.f(th) : dhd.f(new Exception("timeout reached", th));
            default:
                Throwable th2 = (Throwable) obj;
                long j2 = this.b;
                return (j2 <= 0 || System.currentTimeMillis() - this.c <= j2) ? ms9.g(th2) : ms9.g(new Exception("timeout reached", th2));
        }
    }

    public /* synthetic */ i95(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }
}
