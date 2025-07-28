package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ot  reason: default package */
public final class ot extends pg0 {
    public final long X;
    public final long Y;
    public final int Z;

    public ot(long j, int i, long j2, long j3, int i2) {
        super(j, i);
        this.X = j2;
        this.Y = j3;
        this.Z = i2;
    }

    public final byte[] g() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = b.o(this.o);
        assetsMove.id = this.X;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.Y;
        assetsMove.position = this.Z;
        return gr8.toByteArray(assetsMove);
    }

    public final una getType() {
        return una.TYPE_ASSETS_MOVE;
    }

    public final ibe i() {
        dt dtVar = new dt((dfa) null, 4);
        int i = this.o;
        if (i != 0) {
            long j = this.X;
            if (j != 0) {
                long j2 = this.Y;
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                int i3 = this.Z;
                if (i2 > 0 || i3 >= 0) {
                    dtVar.s("type", hr1.d(i));
                    dtVar.n(j, ApiProtocol.KEY_ID);
                    if (i2 > 0) {
                        dtVar.n(j2, "prevId");
                    } else {
                        dtVar.g(i3, "position");
                    }
                    return dtVar;
                }
                throw new IllegalArgumentException("prevId or position must be set");
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final void u(lbe lbe) {
        pt ptVar = (pt) lbe;
        pl plVar = null;
        if (ptVar.c) {
            v(ptVar.o);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            plVar.b().c(new kh0(this.a));
            return;
        }
        d(new uae("asset.task.failed", "failed to move asset", (String) null));
    }
}
