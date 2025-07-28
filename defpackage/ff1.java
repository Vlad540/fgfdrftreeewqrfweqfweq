package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: ff1  reason: default package */
public final class ff1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallRateBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ff1(Continuation continuation, CallRateBottomSheet callRateBottomSheet) {
        super(2, continuation);
        this.Y = callRateBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ff1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ff1 ff1 = new ff1(continuation, this.Y);
        ff1.X = obj;
        return ff1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = CallRateBottomSheet.M0;
        CallRateBottomSheet callRateBottomSheet = this.Y;
        callRateBottomSheet.getClass();
        ((sxb) callRateBottomSheet.I0.T0(callRateBottomSheet, CallRateBottomSheet.M0[4])).setButtonToolDataList((List) this.X);
        return jue.a;
    }
}
