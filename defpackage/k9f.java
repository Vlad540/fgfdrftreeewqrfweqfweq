package defpackage;

import android.view.Surface;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: k9f  reason: default package */
public final class k9f extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k9f(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((k9f) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k9f k9f = new k9f(continuation, this.Y);
        k9f.X = obj;
        return k9f;
    }

    public final Object o(Object obj) {
        k7f z0;
        wx3.H(obj);
        j05 j05 = (j05) this.X;
        k77[] k77Arr = VideoViewerWidget.y0;
        VideoViewerWidget videoViewerWidget = this.Y;
        videoViewerWidget.getClass();
        if (j05 instanceof e05) {
            e05 e05 = (e05) j05;
            if (e05.a.j() == videoViewerWidget.m0() && hhd.f(e05.a.x(), videoViewerWidget.l0())) {
                udd.p(videoViewerWidget.a, "Media viewer. Clear prev page", new Object[0]);
                v2f v2f = videoViewerWidget.w0;
                boolean z = v2f != null && v2f.c0();
                videoViewerWidget.w0 = null;
                i9f n0 = videoViewerWidget.n0();
                if (!(n0 == null || (z0 = ((ChatMediaViewerScreen) n0).z0()) == null)) {
                    ah2 ah2 = (ah2) videoViewerWidget.o.getValue();
                    long m0 = videoViewerWidget.m0();
                    String l0 = videoViewerWidget.l0();
                    long F0 = z0.F0();
                    long G0 = z0.G0();
                    ah2.getClass();
                    sk9 sk9 = sk9.a;
                    rg2 rg2 = r4;
                    rg2 rg22 = new rg2(ah2, m0, l0, F0, G0, z, (Continuation) null);
                    xs7.D(ah2.a, sk9, ru3.c, rg2);
                    z0.pause();
                    z0.L0((Surface) null);
                    z0.M0();
                }
                videoViewerWidget.o0().b();
            }
        }
        return jue.a;
    }
}
