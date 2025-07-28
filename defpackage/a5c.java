package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* renamed from: a5c  reason: default package */
public final class a5c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a5c(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((a5c) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a5c a5c = new a5c(continuation, this.Y);
        a5c.X = obj;
        return a5c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = RecordExitBottomSheet.K0;
        this.Y.C0().setDescription((CharSequence) this.X);
        return jue.a;
    }
}
