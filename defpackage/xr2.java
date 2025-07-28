package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: xr2  reason: default package */
public final class xr2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ cs8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xr2(ChatsListSearchScreen chatsListSearchScreen, cs8 cs8, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = cs8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xr2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xr2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        cs8 cs8 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ChatsListSearchScreen.N0;
            bt2 m0 = this.Y.m0();
            long j = cs8.Y.a;
            this.X = 1;
            obj = xs7.U(m0.Z.b(), new ns2(m0, j, cs8.X, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = (Long) obj;
        if (l != null) {
            zu2.b2(zu2.c, cs8.Y.a, "local", new Long(l.longValue()), (Long) null, cs8.b, (String) null, 104);
        }
        return jue.a;
    }
}
