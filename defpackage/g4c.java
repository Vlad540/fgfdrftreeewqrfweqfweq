package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: g4c  reason: default package */
public final class g4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g4c g4c = new g4c(continuation, this.Y);
        g4c.X = obj;
        return g4c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = RecordControlsWidget.m1;
        RecordControlsWidget recordControlsWidget = this.Y;
        View I0 = recordControlsWidget.I0();
        na1 na1 = new na1((p3c) this.X, 4, recordControlsWidget);
        if (I0.isLaidOut()) {
            na1.invoke();
        } else if (!I0.isLaidOut() || I0.isLayoutRequested()) {
            I0.addOnLayoutChangeListener(new mp0(12, na1));
        } else {
            na1.invoke();
        }
        return jue.a;
    }
}
