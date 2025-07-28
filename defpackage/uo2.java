package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: uo2  reason: default package */
public final class uo2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uo2 uo2 = new uo2(continuation, this.Y);
        uo2.X = obj;
        return uo2;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        zo2 zo2 = (zo2) this.X;
        String str2 = zo2.b;
        if (str2 == null || h0e.c0(str2)) {
            str = zo2.a;
            if (str == null || h0e.c0(str)) {
                str = null;
            }
        } else {
            str = zo2.b;
        }
        mz9 m0 = ChatTitleIconScreen.m0(this.Y);
        m0.setAvatarUrl(str);
        m0.setCloseBadgeVisibility(!(str == null || str.length() == 0));
        return jue.a;
    }
}
