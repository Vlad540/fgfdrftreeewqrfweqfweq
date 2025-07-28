package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: zr2  reason: default package */
public final class zr2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zr2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zr2 zr2 = new zr2(continuation, this.Y);
        zr2.X = obj;
        return zr2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.H0.E((List) this.X);
        return jue.a;
    }
}
