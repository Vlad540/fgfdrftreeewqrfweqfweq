package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;

/* renamed from: n65  reason: default package */
public final class n65 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ExternalCallbackWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n65(Continuation continuation, ExternalCallbackWidget externalCallbackWidget) {
        super(2, continuation);
        this.Y = externalCallbackWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((n65) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n65 n65 = new n65(continuation, this.Y);
        n65.X = obj;
        return n65;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof a34;
        ExternalCallbackWidget externalCallbackWidget = this.Y;
        if (z) {
            sr7.c.R1(a34);
        } else if (a34 instanceof i65) {
            hba hba = new hba(externalCallbackWidget);
            hba.h(((i65) a34).b);
            hba.j();
        } else {
            boolean z2 = a34 instanceof h65;
        }
        externalCallbackWidget.r0(false);
        return jue.a;
    }
}
