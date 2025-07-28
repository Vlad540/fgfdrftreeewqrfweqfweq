package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: ma1  reason: default package */
public final class ma1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ma1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ma1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ma1 ma1 = new ma1(continuation, this.Y);
        ma1.X = obj;
        return ma1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        y91 y91 = (y91) this.X;
        k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
        callJoinLinkPreviewWidget.getClass();
        sm1 sm1 = (sm1) callJoinLinkPreviewWidget.z0.T0(callJoinLinkPreviewWidget, CallJoinLinkPreviewWidget.F0[6]);
        sm1.setAvatar(y91.a);
        hy7 hy7 = hy7.b;
        hy7 hy72 = y91.c;
        sm1.setButtonAction(hy72 == hy7 ? ize.b : ize.o);
        sm1.J(hy72 == hy7, y91.d);
        sm1.K((String) null, (CharSequence) null);
        callJoinLinkPreviewWidget.n0().setText(y91.e.a(callJoinLinkPreviewWidget.getContext()));
        Drawable drawable = (Drawable) callJoinLinkPreviewWidget.B0.getValue();
        hge hge = new hge(ftb.call_microphone_enabled_accessibility);
        hge hge2 = new hge(ftb.call_microphone_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.r0(callJoinLinkPreviewWidget.l0(), drawable, (Drawable) callJoinLinkPreviewWidget.A0.getValue(), y91.b, hge, hge2);
        Drawable drawable2 = (Drawable) callJoinLinkPreviewWidget.D0.getValue();
        hge hge3 = new hge(ftb.call_video_enabled_accessibility);
        hge hge4 = new hge(ftb.call_video_disabled_accessibility);
        callJoinLinkPreviewWidget.getClass();
        CallJoinLinkPreviewWidget.r0(callJoinLinkPreviewWidget.o0(), drawable2, (Drawable) callJoinLinkPreviewWidget.C0.getValue(), y91.c, hge3, hge4);
        jca m0 = callJoinLinkPreviewWidget.m0();
        m0.setAvatars(y91.f);
        m0.setTitle(y91.g);
        return jue.a;
    }
}
