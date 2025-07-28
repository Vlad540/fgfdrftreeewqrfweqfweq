package defpackage;

import org.webrtc.PeerConnectionFactory;

/* renamed from: zw0  reason: default package */
public final /* synthetic */ class zw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ zw0(gx0 gx0, Runnable runnable, int i) {
        this.a = i;
        this.b = gx0;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gx0 gx0 = this.b;
                gx0.w0.post(new zw0(gx0, this.c, 1));
                return;
            default:
                gx0 gx02 = this.b;
                gx02.Z0.log("OKRTCCall", "disabling enhancer");
                if (!gx02.E0) {
                    gx02.e1 = true;
                    gx02.F(new rk9(false, true, true, false, (PeerConnectionFactory.EnhancerKind) null, (String) null, 0, 0, 0, 0, 0, false, (tg0) null, 0));
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
