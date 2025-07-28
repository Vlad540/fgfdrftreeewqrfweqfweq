package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: bl2  reason: default package */
public final class bl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((bl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bl2 bl2 = new bl2(continuation, this.Y);
        bl2.X = obj;
        return bl2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ChatScreen.n1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        ((View) chatScreen.g1.T0(chatScreen, ChatScreen.n1[20])).setBackground((Drawable) this.X);
        return jue.a;
    }
}
