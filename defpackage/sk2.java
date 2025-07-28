package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: sk2  reason: default package */
public final class sk2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sk2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sk2(continuation, this.Y);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.chatscreen.ChatScreen] */
    public final Object o(Object obj) {
        Object obj2;
        Object obj3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        ? r5 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (r5.getView() != null && !r5.E0().n()) {
                nn2 L0 = r5.L0();
                this.X = 1;
                obj2 = L0.y(this);
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return jue;
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj2).longValue();
        k77[] k77Arr = ChatScreen.n1;
        sgc E0 = r5.E0();
        String str = r5.O0;
        long j = r5.getArgs().getLong("load_mark");
        long j2 = r5.getArgs().getLong("message_id");
        Object obj4 = r5.getArgs().get("highlights");
        List list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null) {
            list = hw4.a;
        }
        rr3 messagesListWidget = new MessagesListWidget(str, longValue, j, list, j2, r5.getArgs().getBoolean("highlight_message"), r5.getArgs().getBoolean("from_forward"), (x54) null);
        messagesListWidget.M0 = r5.c1;
        E0.R(new vgc(messagesListWidget, (String) null, (wr3) null, (wr3) null, false, -1));
        return jue;
    }
}
