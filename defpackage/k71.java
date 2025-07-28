package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.sdk.arch.Widget;

/* renamed from: k71  reason: default package */
public final class k71 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIncomingScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k71(CallIncomingScreen callIncomingScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callIncomingScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((k71) n((n71) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k71 k71 = new k71(this.Y, continuation);
        k71.X = obj;
        return k71;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        n71 n71 = (n71) this.X;
        boolean z = n71 instanceof l71;
        Widget widget = this.Y;
        if (z) {
            mk9 mk9 = CallIncomingScreen.Z;
            widget.getClass();
            gm1 gm1 = (gm1) widget.c.T0(widget, CallIncomingScreen.w0[0]);
            l71 l71 = (l71) n71;
            mc0 mc0 = l71.a.c;
            ub0 ub0 = null;
            if (mc0 != null) {
                k77[] k77Arr = gm1.w1;
                gm1.getClass();
                str = mc0.b;
            } else {
                str = null;
            }
            mz9 mz9 = gm1.K0;
            mz9.setAvatarUrl(str);
            mz9.setCustomOverlay((oc0) null);
            if (mc0 != null) {
                ub0 = mc0.a;
            }
            mz9.g(ub0, true);
            gm1.setName(l71.a.b);
            gm1.setStatus(l71.c);
            gm1.Q(cnb.ic_cancel_call_25, ftb.call_incoming_decline_accessibility, new vz0(0, widget.l0(), p71.class, "declineCall", "declineCall()V", 0, 1));
            gm1.R(true, cnb.ic_call_22, ftb.call_incoming_accept_accessibility, new vz0(0, widget, CallIncomingScreen.class, "acceptCallIfPossible", "acceptCallIfPossible()V", 0, 2));
        } else if (n71 instanceof m71) {
            mk9 mk92 = CallIncomingScreen.Z;
            kjd.B(widget.requireActivity(), ((m71) n71).a);
            p71 l0 = widget.l0();
            l0.Y.c(l0);
            View requireView = widget.requireView();
            if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
                widget.requireView().post(new b(20, widget));
            } else {
                widget.getRouter().B(widget);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
