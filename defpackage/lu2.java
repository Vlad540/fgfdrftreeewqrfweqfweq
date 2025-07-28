package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: lu2  reason: default package */
public final class lu2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ChatsListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lu2(ChatsListWidget chatsListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListWidget;
        this.Z = j;
        this.w0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lu2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lu2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        List list = null;
        long j = this.Z;
        ChatsListWidget chatsListWidget = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ChatsListWidget.O0;
            kl3 kl3 = (kl3) chatsListWidget.Y.getValue();
            this.X = 1;
            obj = xs7.U(kl3.c.a(), new dl3(kl3, j, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((List) obj).isEmpty()) {
            list = obj;
        }
        List list2 = list;
        if (list2 != null) {
            Long l = new Long(j);
            k77[] k77Arr2 = ChatsListWidget.O0;
            chatsListWidget.getClass();
            k77 k77 = ChatsListWidget.O0[1];
            chatsListWidget.o.b(chatsListWidget, l);
            mq3 j2 = pfa.a(2).e(list2).j(this.w0);
            ChatsListWidget.l0(chatsListWidget, j2);
            j2.build().q(chatsListWidget);
        }
        return jue.a;
    }
}
