package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: gw5  reason: default package */
public final class gw5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gw5(ForwardPickerScreen forwardPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gw5) n((Set) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gw5 gw5 = new gw5(this.Y, this.Z, continuation);
        gw5.X = obj;
        return gw5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Set set = (Set) this.X;
        k77[] k77Arr = ForwardPickerScreen.M0;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        boolean A0 = forwardPickerScreen.A0();
        jue jue = jue.a;
        if (A0 || set.size() != 1) {
            int size = set.size();
            boolean z = forwardPickerScreen.x0().getVisibility() == 0;
            AutoTransition autoTransition = forwardPickerScreen.D0;
            View view = this.Z;
            if (!z && size > 0) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
                ((pv5) forwardPickerScreen.u0().c).f();
                forwardPickerScreen.y0().setVisibility(0);
                forwardPickerScreen.x0().setVisibility(0);
            } else if (z && size == 0) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
                forwardPickerScreen.y0().setVisibility(8);
                nl0 nl0 = forwardPickerScreen.E0;
                if (nl0.a()) {
                    ((jq8) nl0.getValue()).setVisibility(8);
                }
                sgc sgc = forwardPickerScreen.I0;
                if (sgc == null || !sgc.n()) {
                    int i = e87.a;
                    if (e87.b(e87.c)) {
                        forwardPickerScreen.J0.m();
                    }
                } else {
                    ((pv5) forwardPickerScreen.u0().c).r.K(1);
                }
            }
            return jue;
        }
        ((pv5) forwardPickerScreen.u0().c).h((CharSequence) null, set, forwardPickerScreen.A0());
        return jue;
    }
}
