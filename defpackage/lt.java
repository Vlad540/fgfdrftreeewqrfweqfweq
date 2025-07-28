package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: lt  reason: default package */
public final class lt extends pg0 {
    public final long[] X;
    public final long Y;

    public lt(long j, int i, long[] jArr, long j2) {
        super(j, i);
        this.X = jArr;
        this.Y = j2;
    }

    public final byte[] g() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = b.o(this.o);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.X;
        assetsListModify.modifyTime = this.Y;
        return gr8.toByteArray(assetsListModify);
    }

    public final una getType() {
        return una.TYPE_ASSETS_LIST_MODIFY;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 3);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.X;
            if (jArr != null) {
                dtVar.s("type", hr1.d(i));
                dtVar.i("ids", jArr);
                long j = this.Y;
                if (j >= 0) {
                    dtVar.n(j, "updateTime");
                }
                return dtVar;
            }
            throw new IllegalArgumentException("ids must not be null");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(lbe lbe) {
        mt mtVar = (mt) lbe;
        pl plVar = null;
        if (mtVar.c) {
            v(mtVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new kh0(this.a));
            return;
        }
        d(new uae("asset.task.failed", "failed to modify asset list", (String) null));
    }
}
