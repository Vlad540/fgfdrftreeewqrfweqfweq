package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* renamed from: xpa  reason: default package */
public final class xpa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickChatMembers Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xpa(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.Y = pickChatMembers;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xpa xpa = new xpa(continuation, this.Y);
        xpa.X = obj;
        return xpa;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [one.me.startconversation.chat.PickChatMembers, one.me.sdk.arch.Widget] */
    public final Object o(Object obj) {
        wx3.H(obj);
        if (((Boolean) this.X).booleanValue()) {
            k77[] k77Arr = PickChatMembers.B0;
            ? r2 = this.Y;
            ((qna) r2.y0.getValue()).e(new jrf(r2, 1));
        }
        return jue.a;
    }
}
