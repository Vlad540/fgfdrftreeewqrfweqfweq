package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: pu2  reason: default package */
public final class pu2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pu2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pu2 pu2 = new pu2(continuation, this.Y);
        pu2.X = obj;
        return pu2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            qo3.c.R1(a34);
        } else if (a34 instanceof apd) {
            k77[] k77Arr = ChatsListWidget.O0;
            apd apd = (apd) a34;
            ((we1) this.Y.L0.getValue()).l(apd.b, apd.c, new uu2(a34, 0));
        } else {
            boolean z = a34 instanceof hfa;
        }
        return jue.a;
    }
}
