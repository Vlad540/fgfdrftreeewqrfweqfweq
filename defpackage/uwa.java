package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: uwa  reason: default package */
public final class uwa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PipScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uwa(PipScreen pipScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pipScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((uwa) n((bga) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uwa uwa = new uwa(this.Y, continuation);
        uwa.X = obj;
        return uwa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bga bga = (bga) this.X;
        k77[] k77Arr = PipScreen.o;
        cf1 cf1 = ((nwa) this.Y.b.getValue()).c;
        if (cf1 != null) {
            cf1.d(bga);
        }
        return jue.a;
    }
}
