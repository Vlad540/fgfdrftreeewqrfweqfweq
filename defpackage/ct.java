package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ct  reason: default package */
public final class ct extends pg0 {
    public final long X;

    public ct(int i, long j, long j2) {
        super(j, i);
        this.X = j2;
    }

    public final byte[] g() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = b.o(this.o);
        assetsAdd.id = this.X;
        assetsAdd.requestId = this.a;
        return gr8.toByteArray(assetsAdd);
    }

    public final una getType() {
        return una.TYPE_ASSETS_ADD;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 0);
        int i = this.o;
        if (i != 0) {
            long j = this.X;
            if (j != 0) {
                dtVar.s("type", hr1.d(i));
                dtVar.n(j, ApiProtocol.KEY_ID);
                return dtVar;
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(lbe lbe) {
        et etVar = (et) lbe;
        pl plVar = null;
        if (etVar.c) {
            v(etVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new kh0(this.a));
            return;
        }
        d(new uae("asset.task.failed", "failed to add asset", (String) null));
    }
}
