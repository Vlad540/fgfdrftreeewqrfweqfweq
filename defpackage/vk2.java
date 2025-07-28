package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: vk2  reason: default package */
public final class vk2 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((vk2) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vk2 vk2 = new vk2(continuation, this.Y);
        vk2.X = ((Boolean) obj).booleanValue();
        return vk2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final Object o(Object obj) {
        wx3.H(obj);
        if (this.X) {
            ? r0 = this.Y;
            r0.getRouter().B(r0);
        }
        return jue.a;
    }
}
