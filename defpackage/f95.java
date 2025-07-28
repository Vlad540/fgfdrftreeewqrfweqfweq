package defpackage;

/* renamed from: f95  reason: default package */
public final /* synthetic */ class f95 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ f95() {
        this.a = 3;
        this.b = 0;
    }

    public final void run() {
        long j = this.b;
        switch (this.a) {
            case 0:
                udd.p("l95", "onNotifAdded: added sticker set %d to cache", new Object[]{Long.valueOf(j)});
                return;
            case 1:
                udd.p("l95", "loadFromMarker: success marker=d", new Object[]{Long.valueOf(j)});
                return;
            case 2:
                udd.p("w95", "assetsUpdate: queued on api, sync=%d", new Object[]{Long.valueOf(j)});
                return;
            case 3:
                udd.p("aa5", "assetsUpdate: queued on api, sync=%d", new Object[]{Long.valueOf(j)});
                return;
            case 4:
                udd.p("fa5", "onNotifAdded: added sticker %d to cache", new Object[]{Long.valueOf(j)});
                return;
            case 5:
                udd.p("fa5", "loadFromMarker: success marker=d", new Object[]{Long.valueOf(j)});
                return;
            default:
                udd.p("be9", "Update track for message %d: track is empty", new Object[]{Long.valueOf(j)});
                return;
        }
    }

    public /* synthetic */ f95(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
