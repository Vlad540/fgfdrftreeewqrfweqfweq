package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: h4c  reason: default package */
public final class h4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h4c h4c = new h4c(continuation, this.Y);
        h4c.X = obj;
        return h4c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long longValue = ((Number) this.X).longValue();
        k77[] k77Arr = RecordControlsWidget.m1;
        RecordControlsWidget recordControlsWidget = this.Y;
        recordControlsWidget.A0().setText(d8.b(longValue));
        recordControlsWidget.x0().setText(d8.b(longValue));
        return jue.a;
    }
}
