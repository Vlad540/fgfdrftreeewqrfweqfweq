package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: gf1  reason: default package */
public final class gf1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ CallRateBottomSheet Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gf1(Continuation continuation, View view, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = view;
        this.Z = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gf1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gf1 gf1 = new gf1(continuation, this.Y, this.Z);
        gf1.X = obj;
        return gf1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List<nf1> list = (List) this.X;
        CallRateBottomSheet callRateBottomSheet = this.Z;
        TransitionManager.beginDelayedTransition((ViewGroup) this.Y, callRateBottomSheet.F0);
        xxb z0 = callRateBottomSheet.z0();
        z0.E0.clear();
        z0.removeAllViews();
        callRateBottomSheet.z0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        for (nf1 nf1 : list) {
            callRateBottomSheet.z0().a(nf1.a, String.valueOf(nf1.b.a(callRateBottomSheet.getContext())));
        }
        return jue.a;
    }
}
