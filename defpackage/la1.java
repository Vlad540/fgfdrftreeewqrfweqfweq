package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: la1  reason: default package */
public final class la1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public la1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((la1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        la1 la1 = new la1(continuation, this.Y);
        la1.X = obj;
        return la1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        o81 o81 = (sg9) this.X;
        if (o81 instanceof o81) {
            k77[] k77Arr = CallJoinLinkPreviewWidget.F0;
            CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
            ((we1) callJoinLinkPreviewWidget.c.getValue()).j(o81.b, true, false, true, new na1(o81, 0, callJoinLinkPreviewWidget));
        }
        return jue.a;
    }
}
