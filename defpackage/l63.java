package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: l63  reason: default package */
public final class l63 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ComplaintBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l63(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Y = complaintBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((l63) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l63 l63 = new l63(continuation, this.Y);
        l63.X = obj;
        return l63;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((s63) this.X, s63.a)) {
            ((hba) this.Y.o.getValue()).j();
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
