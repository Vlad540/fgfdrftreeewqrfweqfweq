package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: m4c  reason: default package */
public final class m4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m4c m4c = new m4c(continuation, this.Y);
        m4c.X = obj;
        return m4c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((a3c) this.X, a3c.a)) {
            k77[] k77Arr = RecordControlsWidget.m1;
            y3c L0 = this.Y.L0();
            if (L0.A0.getValue() instanceof n3c) {
                L0.x();
            }
            taf.o(L0.G0, k3c.a);
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
