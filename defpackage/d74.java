package defpackage;

import ru.ok.tamtam.nano.Protos;

/* renamed from: d74  reason: default package */
public final /* synthetic */ class d74 implements j6 {
    public final /* synthetic */ int a;

    public /* synthetic */ d74(int i) {
        this.a = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                udd.n("e74", "clear: cleared repository");
                return;
            case 1:
                udd.n("l95", "onAssetsUpdate: stored fav sticker sets");
                return;
            case 2:
                udd.n("l95", "clear: cleared fav stickers repository");
                return;
            case 3:
                udd.n("fa5", "clear: cleared repository");
                return;
            case 4:
                udd.n("i2c", "clearRecentSearch: success");
                return;
            case 5:
                udd.q("v2c", "RECENT ADDED update handle success");
                return;
            case 6:
                udd.q("v2c", "RECENT REMOVED update handle success");
                return;
            case 7:
                udd.q("v2c", "Add to recents success");
                return;
            case 8:
                wwc wwc = tic.a;
                return;
            case 9:
                udd.n("zsd", "Success update recents");
                return;
            case 10:
                udd.n("zsd", "clear: cleared repository");
                return;
            case 11:
                udd.n("lud", "clear: repository cleared");
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                udd.n("ewe", "clear: cleared upload repository");
                return;
            default:
                udd.n("j3f", "clear: success");
                return;
        }
    }
}
