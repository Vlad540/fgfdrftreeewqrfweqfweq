package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.settings.MessagesSettingsScreen;

/* renamed from: n29  reason: default package */
public final class n29 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n29(Continuation continuation, MessagesSettingsScreen messagesSettingsScreen) {
        super(2, continuation);
        this.Y = messagesSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n29 n29 = new n29(continuation, this.Y);
        n29.X = obj;
        return n29;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            l29.c.R1(a34);
        }
        return jue.a;
    }
}
