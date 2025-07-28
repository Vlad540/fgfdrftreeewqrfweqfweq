package defpackage;

/* renamed from: k95  reason: default package */
public final /* synthetic */ class k95 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ k95(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                udd.p("l95", "onNotifMoved: success move id=%d to position=%d", new Object[]{Long.valueOf(j), Integer.valueOf(i)});
                return;
            default:
                udd.p("fa5", "onNotifMoved: success move id=%d to position=%d", new Object[]{Long.valueOf(j), Integer.valueOf(i)});
                return;
        }
    }
}
