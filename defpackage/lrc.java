package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lrc  reason: default package */
public final class lrc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mrc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lrc(mrc mrc, Continuation continuation) {
        super(2, continuation);
        this.Y = mrc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((lrc) n((cg6) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lrc lrc = new lrc(this.Y, continuation);
        lrc.X = obj;
        return lrc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long j = ((cg6) this.X).b;
        mrc mrc = this.Y;
        mrc.getClass();
        orc orc = orc.c;
        boolean z = mrc.c == s62.LOCAL_ID;
        orc.getClass();
        String str = z ? "local" : "server";
        taf.o(mrc.w0, new a34(":chats?id=" + mrc.b + "&type=" + str + "&message_id=" + j));
        return jue.a;
    }
}
