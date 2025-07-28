package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: rt  reason: default package */
public final class rt extends pg0 {
    public final long[] X;

    public rt(int i, long j, long[] jArr) {
        super(j, i);
        this.X = jArr;
    }

    public final byte[] g() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = b.o(this.o);
        assetsRemove.ids = this.X;
        assetsRemove.requestId = this.a;
        return gr8.toByteArray(assetsRemove);
    }

    public final una getType() {
        return una.TYPE_ASSETS_REMOVE;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 5);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.X;
            if (jArr == null || jArr.length == 0) {
                throw new IllegalArgumentException("ids must not be null or empty");
            }
            dtVar.s("type", hr1.d(i));
            dtVar.i("ids", jArr);
            return dtVar;
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(lbe lbe) {
        st stVar = (st) lbe;
        pl plVar = null;
        if (stVar.c) {
            v(stVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new kh0(this.a));
            return;
        }
        d(new uae("asset.task.failed", "failed to remove asset", (String) null));
    }
}
