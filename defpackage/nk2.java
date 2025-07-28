package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: nk2  reason: default package */
public final class nk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pj5 Y;
    public final /* synthetic */ boolean Z = false;
    public final /* synthetic */ ChatScreen w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk2(t0c t0c, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = t0c;
        this.w0 = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nk2) n((i05) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nk2 nk2 = new nk2((t0c) this.Y, continuation, this.w0);
        nk2.X = obj;
        return nk2;
    }

    public final Object o(Object obj) {
        Object obj2;
        it8 it8;
        ChatScreen chatScreen = this.w0;
        wx3.H(obj);
        Object a = ((i05) this.X).a();
        Throwable a2 = mcc.a(a);
        jue jue = jue.a;
        if (a2 == null) {
            try {
                jue jue2 = (jue) a;
                k77[] k77Arr = ChatScreen.n1;
                i05 i05 = (i05) chatScreen.B0().H0.a.getValue();
                if (i05 == null || (it8 = (it8) i05.a) == null || !it8.a) {
                    nu8.y(chatScreen.B0(), true, false, 2);
                    chatScreen.w0();
                } else {
                    nu8.z(chatScreen.B0(), 0, 3);
                }
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
