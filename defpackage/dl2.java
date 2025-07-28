package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: dl2  reason: default package */
public final class dl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((dl2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dl2 dl2 = new dl2(continuation, this.Y);
        dl2.X = obj;
        return dl2;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof v03) {
            this.Y.getRouter().C();
        } else if (a34 instanceof a34) {
            ul2.c.R1(a34);
        }
        return jue.a;
    }
}
