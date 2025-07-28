package defpackage;

import java.util.List;

/* renamed from: b95  reason: default package */
public final /* synthetic */ class b95 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ b95(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void run() {
        List list = this.b;
        switch (this.a) {
            case 0:
                udd.p("l95", "onNotifRemoved: removed sticker sets %s from cache", new Object[]{list});
                return;
            case 1:
                udd.p("l95", "onListUpdated: success store stickers sets=%s", new Object[]{list});
                return;
            case 2:
                udd.p("fa5", "onAssetsUpdate: success store stickers %s", new Object[]{list});
                return;
            case 3:
                udd.p("fa5", "removeFromFavorites: ids=%s", new Object[]{list});
                return;
            case 4:
                udd.p("fa5", "onListUpdated: success store stickers %s", new Object[]{list});
                return;
            case 5:
                udd.p("fa5", "onNotifRemoved: removed stickers %s from cache", new Object[]{list});
                return;
            case 6:
                udd.p("lud", "storeStickerSets: success for sets = %s", new Object[]{list});
                return;
            default:
                udd.p("jee", "awaitNoTasksByTypes: finished for types=%s", new Object[]{list});
                return;
        }
    }
}
