package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;

/* renamed from: j9f  reason: default package */
public final class j9f extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ VideoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j9f(Continuation continuation, VideoViewerWidget videoViewerWidget) {
        super(2, continuation);
        this.Y = videoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((j9f) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j9f j9f = new j9f(continuation, this.Y);
        j9f.X = obj;
        return j9f;
    }

    public final Object o(Object obj) {
        v2f v2f;
        k7f z0;
        wx3.H(obj);
        cg2 cg2 = (cg2) this.X;
        VideoViewerWidget videoViewerWidget = this.Y;
        String str = videoViewerWidget.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            boolean z = cg2.b != null;
            k68 k68 = cg2.a;
            long m0 = videoViewerWidget.m0();
            String l0 = videoViewerWidget.l0();
            fn6.d(tn7, str, i0e.E("Media viewer. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + k68 + ", curMsgId:" + m0 + ", \n                        |curAttachId:" + l0 + "\n                        |"), (Throwable) null);
        }
        k68 k682 = cg2.a;
        if (k682 != null && k682.j() == videoViewerWidget.m0() && hhd.f(cg2.a.x(), videoViewerWidget.l0()) && (v2f = cg2.b) != null) {
            videoViewerWidget.w0 = v2f;
            i9f n0 = videoViewerWidget.n0();
            if (!(n0 == null || (z0 = ((ChatMediaViewerScreen) n0).z0()) == null)) {
                z0.H0(cg2.b);
            }
            ydc ydc = videoViewerWidget.Z;
            if (ydc != null) {
                ydc.p();
            }
            videoViewerWidget.o0().a(videoViewerWidget.x0);
        }
        return jue.a;
    }
}
