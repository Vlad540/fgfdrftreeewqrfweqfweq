package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* renamed from: g96  reason: default package */
public final class g96 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ GifViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g96(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.Y = gifViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((g96) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g96 g96 = new g96(continuation, this.Y);
        g96.X = obj;
        return g96;
    }

    public final Object o(Object obj) {
        v2f v2f;
        wx3.H(obj);
        cg2 cg2 = (cg2) this.X;
        GifViewerWidget gifViewerWidget = this.Y;
        String str = gifViewerWidget.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            boolean z = cg2.b != null;
            k68 k68 = cg2.a;
            long m0 = gifViewerWidget.m0();
            String l0 = gifViewerWidget.l0();
            fn6.d(tn7, str, i0e.E("Media viewer. Video page state changed, \n                        |hasContent:" + z + ", \n                        |item:" + k68 + ", curMsgId:" + m0 + ", \n                        |curAttachId:" + l0 + "\n                        |"), (Throwable) null);
        }
        k68 k682 = cg2.a;
        if (k682 != null && k682.j() == gifViewerWidget.m0() && hhd.f(cg2.a.x(), gifViewerWidget.l0()) && (v2f = cg2.b) != null) {
            gifViewerWidget.w0 = v2f;
            k7f o0 = gifViewerWidget.o0();
            if (o0 != null) {
                o0.g(0.0f);
            }
            k7f o02 = gifViewerWidget.o0();
            if (o02 != null) {
                o02.K0(true);
            }
            k7f o03 = gifViewerWidget.o0();
            if (o03 != null) {
                o03.H0(cg2.b);
            }
            ydc ydc = gifViewerWidget.Z;
            if (ydc != null) {
                ydc.p();
            }
            gifViewerWidget.p0().a(gifViewerWidget.x0);
        }
        return jue.a;
    }
}
