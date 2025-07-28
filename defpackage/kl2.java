package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: kl2  reason: default package */
public final class kl2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pj5 Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ChatScreen w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kl2(t0c t0c, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = t0c;
        this.w0 = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kl2) n((i05) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kl2 kl2 = new kl2((t0c) this.Y, continuation, this.w0);
        kl2.X = obj;
        return kl2;
    }

    public final Object o(Object obj) {
        Object obj2;
        wx3.H(obj);
        Object a = ((i05) this.X).a();
        Throwable a2 = mcc.a(a);
        jue jue = jue.a;
        if (a2 == null) {
            try {
                jue jue2 = (jue) a;
                ChatScreen chatScreen = this.w0;
                k77[] k77Arr = ChatScreen.n1;
                chatScreen.O0();
                obj2 = jue;
            } catch (Throwable th) {
                obj2 = new kcc(th);
            }
            if (!this.Z) {
                wx3.H(obj2);
            }
        }
        return jue;
    }
}
