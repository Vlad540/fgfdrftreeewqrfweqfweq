package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: q3d  reason: default package */
public final class q3d extends lbe {
    public String c;

    public q3d(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals(ApiProtocol.KEY_TOKEN)) {
            ws8.z();
        } else {
            this.c = ws8.z0();
        }
    }

    public final String toString() {
        return wn6.i("{token='", r1g.v(this.c), "'}");
    }
}
