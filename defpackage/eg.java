package defpackage;

import android.view.Choreographer;
import org.webrtc.RenderSynchronizer;

/* renamed from: eg  reason: default package */
public final /* synthetic */ class eg implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                ((Runnable) this.b).run();
                return;
            default:
                RenderSynchronizer.b((RenderSynchronizer) this.b, j);
                return;
        }
    }
}
