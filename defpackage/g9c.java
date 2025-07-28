package defpackage;

import org.webrtc.RenderSynchronizer;

/* renamed from: g9c  reason: default package */
public final /* synthetic */ class g9c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderSynchronizer b;

    public /* synthetic */ g9c(RenderSynchronizer renderSynchronizer, int i) {
        this.a = i;
        this.b = renderSynchronizer;
    }

    public final void run() {
        int i = this.a;
        RenderSynchronizer renderSynchronizer = this.b;
        switch (i) {
            case 0:
                renderSynchronizer.lambda$registerListener$1();
                return;
            default:
                renderSynchronizer.lambda$new$0();
                return;
        }
    }
}
