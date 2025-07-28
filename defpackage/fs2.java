package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: fs2  reason: default package */
public final class fs2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ChatsListSearchScreen Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fs2(ChatsListSearchScreen chatsListSearchScreen, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
        this.Z = j;
        this.w0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fs2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fs2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        long j = this.Z;
        ChatsListSearchScreen chatsListSearchScreen = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ChatsListSearchScreen.N0;
            bt2 m0 = chatsListSearchScreen.m0();
            this.X = 1;
            obj = xs7.U(m0.Z.a(), new ls2(m0, j, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = new Long(j);
        k77[] k77Arr2 = ChatsListSearchScreen.N0;
        chatsListSearchScreen.getClass();
        k77 k77 = ChatsListSearchScreen.N0[0];
        chatsListSearchScreen.o.b(chatsListSearchScreen, l);
        float f = (float) 6;
        pfa.a(2).e((List) obj).j(this.w0).c(new Rect(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0), dh4.c().getDisplayMetrics().density * 12.0f).build().q(chatsListSearchScreen);
        return jue.a;
    }
}
