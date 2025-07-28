package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: cl2  reason: default package */
public final class cl2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ChatScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cl2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Z = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cl2) n(obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cl2 cl2 = new cl2(continuation, this.Z);
        cl2.Y = obj;
        return cl2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ChatScreen.n1;
            ChatScreen chatScreen = this.Z;
            e3e e3e = (e3e) chatScreen.J0.getValue();
            Context context = chatScreen.getContext();
            this.X = 1;
            Object U = xs7.U(((pae) e3e.Y.getValue()).a(), new b3e((n62) this.Y, e3e, context, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
