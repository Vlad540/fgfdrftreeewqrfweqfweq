package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

/* renamed from: if1  reason: default package */
public final class if1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((if1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        if1 if1 = new if1(continuation, this.Y);
        if1.X = obj;
        return if1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mf1 mf1 = (mf1) this.X;
        boolean f = hhd.f(mf1, lf1.a);
        BaseBottomSheetWidget baseBottomSheetWidget = this.Y;
        if (f) {
            k77[] k77Arr = CallRateBottomSheet.M0;
            TransitionManager.beginDelayedTransition((ViewGroup) baseBottomSheetWidget.getView(), baseBottomSheetWidget.F0);
            k77[] k77Arr2 = CallRateBottomSheet.M0;
            ((jx3) baseBottomSheetWidget.L0.T0(baseBottomSheetWidget, k77Arr2[7])).setVisibility(0);
            ((sxb) baseBottomSheetWidget.I0.T0(baseBottomSheetWidget, k77Arr2[4])).setVisibility(8);
            baseBottomSheetWidget.z0().setVisibility(8);
        } else if (hhd.f(mf1, jf1.a)) {
            k77[] k77Arr3 = CallRateBottomSheet.M0;
            baseBottomSheetWidget.z0().z0.g();
        } else if (hhd.f(mf1, kf1.a)) {
            hba hba = new hba(baseBottomSheetWidget);
            hba.h(new hge(r1a.F0));
            hba.a(new hge(r1a.E0));
            hba.f(new vba(l9a.o));
            hba.j();
            baseBottomSheetWidget.r0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
