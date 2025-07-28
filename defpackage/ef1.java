package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: ef1  reason: default package */
public final class ef1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ef1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ef1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ef1 ef1 = new ef1(continuation, this.Y);
        ef1.X = obj;
        return ef1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = CallRateBottomSheet.M0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((TextView) callRateBottomSheet.H0.T0(callRateBottomSheet, CallRateBottomSheet.M0[3])).setText(((mge) this.X).a(callRateBottomSheet.getContext()));
        return jue.a;
    }
}
