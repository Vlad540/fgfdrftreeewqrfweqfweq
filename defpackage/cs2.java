package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: cs2  reason: default package */
public final class cs2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cs2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((cs2) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cs2 cs2 = new cs2(continuation, this.Y);
        cs2.X = obj;
        return cs2;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [rr3, one.me.chats.search.ChatsListSearchScreen] */
    public final Object o(Object obj) {
        wx3.H(obj);
        gfa gfa = (sg9) this.X;
        bm3.p(this.Y);
        if (gfa instanceof gfa) {
            zu2 zu2 = zu2.c;
            long longValue = ((Number) gfa.a).longValue();
            d34 P1 = zu2.P1();
            P1.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (gfa instanceof s69) {
            zu2.c.P1().b(us8.j(((Number) ((s69) gfa).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), (Bundle) null);
        } else if (gfa instanceof a34) {
            zu2.c.R1((a34) gfa);
        }
        return jue.a;
    }
}
