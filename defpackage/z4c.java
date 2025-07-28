package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;

/* renamed from: z4c  reason: default package */
public final class z4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordExitBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z4c(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.Y = recordExitBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((z4c) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z4c z4c = new z4c(continuation, this.Y);
        z4c.X = obj;
        return z4c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((sg9) this.X, eh1.C)) {
            this.Y.r0(true);
        }
        return jue.a;
    }
}
