package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* renamed from: hc1  reason: default package */
public final class hc1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallMoreBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hc1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.Y = callMoreBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hc1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hc1 hc1 = new hc1(continuation, this.Y);
        hc1.X = obj;
        return hc1;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [ec1, b7c] */
    public final Object o(Object obj) {
        wx3.H(obj);
        CharSequence charSequence = (CharSequence) this.X;
        k77[] k77Arr = CallMoreBottomSheet.B0;
        w4c w4c = (w4c) this.Y.z0.getValue();
        w4c.b = charSequence;
        for (v4c v4c : w4c.a) {
            ((ec1) v4c).a.setDescription(charSequence);
        }
        return jue.a;
    }
}
