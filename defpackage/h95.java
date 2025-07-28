package defpackage;

/* renamed from: h95  reason: default package */
public final /* synthetic */ class h95 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h95(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        boolean z = this.c;
        long j = this.b;
        switch (this.a) {
            case 0:
                udd.p("l95", "markAsFavorite: complete for setId=%d favorite=%b", new Object[]{Long.valueOf(j), Boolean.valueOf(z)});
                return;
            default:
                udd.p("fa5", "markAsFavorite: complete for stickerId=%d favorite=%b", new Object[]{Long.valueOf(j), Boolean.valueOf(z)});
                return;
        }
    }
}
