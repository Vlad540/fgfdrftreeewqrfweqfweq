package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: nf2  reason: default package */
public final class nf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((nf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nf2 nf2 = new nf2(continuation, this.Y);
        nf2.X = obj;
        return nf2;
    }

    public final Object o(Object obj) {
        sf8 sf8;
        wx3.H(obj);
        j05 j05 = (j05) this.X;
        k77[] k77Arr = ChatMediaViewerScreen.O0;
        Widget widget = this.Y;
        widget.getClass();
        if (j05 instanceof d05) {
            qod qod = widget.M0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            if (((d05) j05).a instanceof i68) {
                widget.y0().a((yf2) widget.B0().W0.a.getValue());
                sf8 sf82 = widget.E0;
                if (sf82 != null) {
                    ek8.e(sf82.a(), (ViewGroup) sf82.b);
                }
                if (widget.y0().getVisibility() == 0 && (sf8 = widget.E0) != null) {
                    sf8.c(true);
                }
                k7f z0 = widget.z0();
                if (widget.K0 < 0.0f && z0.e() == 0.0f) {
                    z0.g(1.0f);
                }
                widget.D0();
            } else {
                cw6 y0 = widget.y0();
                t97 t97 = y0.A0;
                if (t97.a()) {
                    ((mya) t97.getValue()).setVisibility(8);
                }
                t97 t972 = y0.B0;
                if (t972.a()) {
                    ((ImageView) t972.getValue()).setVisibility(8);
                }
            }
        } else if (!(j05 instanceof e05)) {
            if (j05 instanceof b05) {
                b05 b05 = (b05) j05;
                if (b05.a != null) {
                    hba hba = new hba(widget);
                    hba.i(widget.getContext().getString(b05.a.intValue()));
                    hba.f(new vba(phc.J));
                    hba.j();
                }
                ex9 onBackPressedDispatcher = widget.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
            } else if (j05 instanceof c05) {
                c05 c05 = (c05) j05;
                int i = c05.a;
                if (i == 5) {
                    sf8 sf83 = widget.E0;
                    if ((sf83 != null ? sf83.a : 0) != i) {
                        widget.C0(c05.b);
                    }
                }
                sf8 sf84 = widget.E0;
                if (sf84 != null) {
                    sf84.b(c05.a);
                }
            } else if (!(j05 instanceof f05)) {
                if (j05 instanceof g05) {
                    hf2 hf2 = hf2.c;
                    g05 g05 = (g05) j05;
                    long j = g05.a;
                    int u0 = widget.u0();
                    d34 P1 = hf2.P1();
                    mn mnVar = new mn(12);
                    mnVar.b = ":dialogs/share-media";
                    mnVar.T(Long.valueOf(j), "msg_id");
                    mnVar.T(Long.valueOf(g05.b), "attach_id");
                    mnVar.T(g05.c, "local_attach_id");
                    mnVar.T(Integer.valueOf(g05.d.ordinal()), "cause_ordinal");
                    mnVar.T(Integer.valueOf(u0), "snack_bot_margin");
                    mnVar.T(Boolean.TRUE, "force_dark");
                    P1.c(mnVar.u(), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return jue.a;
    }
}
