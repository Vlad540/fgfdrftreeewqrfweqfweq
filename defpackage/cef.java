package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: cef  reason: default package */
public final /* synthetic */ class cef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eef b;
    public final /* synthetic */ String c;

    public /* synthetic */ cef(eef eef, String str, int i) {
        this.a = i;
        this.b = eef;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                eef eef = this.b;
                String str = this.c;
                synchronized (eef.b) {
                    try {
                        k1c k1c = eef.c;
                        if (k1c == null) {
                            eef.q.n("Socket is absent, waiting?");
                        } else {
                            k1c.g(str);
                            d4b d4b = eef.q;
                            if (((ywb) d4b.c).shouldHideSensitiveInformation()) {
                                String l = am7.l(str);
                                ((xwb) d4b.b).log("OKWSSignaling", " -> " + l);
                            } else {
                                ((xwb) d4b.b).log("OKWSSignaling", " -> ".concat(str));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                eef eef2 = this.b;
                String e = eef.e(eef.e(eef2.h, ApiProtocol.KEY_TOKEN, this.c), "tgt", "retry");
                if (eef2.k) {
                    long j = eef2.l;
                    if (j > 0) {
                        e = eef.e(e, "recoverTs", String.valueOf(j));
                    }
                }
                eef2.q.n("transport.restart");
                synchronized (eef2.b) {
                    eef2.h = e;
                }
                synchronized (eef2.e) {
                    eef2.f = false;
                    eef2.a("restart");
                }
                return;
        }
    }
}
