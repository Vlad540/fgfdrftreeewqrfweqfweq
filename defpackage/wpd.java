package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: wpd  reason: default package */
public final class wpd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpd(StartConversationScreen startConversationScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((a34) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wpd wpd = new wpd(this.Y, continuation);
        wpd.X = obj;
        return wpd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        mpd.c.R1((a34) this.X);
        return jue.a;
    }
}
