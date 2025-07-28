package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: hf1  reason: default package */
public final class hf1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hf1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hf1 hf1 = new hf1(continuation, this.Y);
        hf1.X = obj;
        return hf1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        k77[] k77Arr = CallRateBottomSheet.M0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((OneMeButton) callRateBottomSheet.K0.T0(callRateBottomSheet, CallRateBottomSheet.M0[6])).setVisibility(booleanValue ? 0 : 8);
        return jue.a;
    }
}
