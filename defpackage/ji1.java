package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ji1  reason: default package */
public final class ji1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ji1) n((foc) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ji1 ji1 = new ji1(this.Y, continuation);
        ji1.X = obj;
        return ji1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int ordinal = ((foc) this.X).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                taf.o(this.Y.Q0, wh1.q);
            } else if (!(ordinal == 2 || ordinal == 3)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
