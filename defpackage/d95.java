package defpackage;

import java.util.List;

/* renamed from: d95  reason: default package */
public final /* synthetic */ class d95 implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l95 b;

    public /* synthetic */ d95(l95 l95, int i) {
        this.a = i;
        this.b = l95;
    }

    public void accept(Object obj) {
        l95 l95 = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                l95.getClass();
                udd.p("l95", "onNotifUpdated: updated ids: %s", new Object[]{list});
                l95.Z.c(list);
                return;
            case 1:
                List list2 = (List) obj;
                l95.getClass();
                udd.p("l95", "on next favorite ids from obs: %s", new Object[]{list2});
                l95.Z.c(list2);
                return;
            case 3:
                List list3 = (List) obj;
                l95.getClass();
                udd.p("l95", "on next favorite sticker sets: %s", new Object[]{list3});
                l95.w0.c(list3);
                return;
            default:
                q95 q95 = (q95) obj;
                l95.getClass();
                long j = q95.b;
                if (j != 0) {
                    udd.p("l95", "loadFromMarker: new marker in response=%d", new Object[]{Long.valueOf(j)});
                    l95.c(q95.b);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((lud) this.b.b.getValue()).c((List) obj);
            case 4:
                l95 l95 = this.b;
                l95.getClass();
                return new y63(1, new sz(l95, 3, (Long) obj));
            default:
                return new w63(((p95) this.b.a.getValue()).a(), 2, new d52(13, (List) obj));
        }
    }
}
