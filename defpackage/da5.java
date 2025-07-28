package defpackage;

import java.util.List;

/* renamed from: da5  reason: default package */
public final /* synthetic */ class da5 implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;

    public /* synthetic */ da5(fa5 fa5, int i) {
        this.a = i;
        this.b = fa5;
    }

    public void accept(Object obj) {
        fa5 fa5 = this.b;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                fa5.getClass();
                udd.p("fa5", "onNotifUpdated: updated ids: %s", new Object[]{list});
                fa5.i.c(list);
                return;
            case 1:
                List list2 = (List) obj;
                fa5.getClass();
                udd.p("fa5", "on next favorite sticker ids from obs: %s", new Object[]{list2});
                fa5.i.c(list2);
                return;
            case 3:
                List list3 = (List) obj;
                fa5.getClass();
                udd.p("fa5", "on next favorite sticker: %s", new Object[]{list3});
                fa5.j.c(list3);
                return;
            default:
                fa5.getClass();
                long j = ((z95) obj).b;
                if (j != 0) {
                    fa5.b(j);
                    return;
                }
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((zsd) this.b.b.get()).b((List) obj);
            case 4:
                fa5 fa5 = this.b;
                fa5.getClass();
                return new y63(1, new sz(fa5, 4, (Long) obj));
            default:
                return new w63(((a95) this.b.a.get()).a(), 2, new d52(7, (List) obj));
        }
    }
}
