package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: el2  reason: default package */
public final class el2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((el2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        el2 el2 = new el2(continuation, this.Y);
        el2.X = obj;
        return el2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ut8 ut8 = (ut8) this.X;
        boolean z = true;
        if (!(ut8.b.getAction() == 3 || ut8.b.getAction() == 1)) {
            z = false;
        }
        this.Y.D0 = z;
        return jue.a;
    }
}
