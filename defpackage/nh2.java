package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: nh2  reason: default package */
public final class nh2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nh2 nh2 = new nh2(continuation, this.Y);
        nh2.X = obj;
        return nh2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Set set = (Set) this.X;
        ChatMembersScreen chatMembersScreen = this.Y;
        if (set != null) {
            k77[] k77Arr = ChatMembersScreen.y0;
            chatMembersScreen.o0().c(String.valueOf(set.size()), Collections.singletonList(new kea(10101, cic.w1, zhc.p0)), new oh2(0, chatMembersScreen), new ph2(set, 0, chatMembersScreen));
        } else {
            k77[] k77Arr2 = ChatMembersScreen.y0;
            chatMembersScreen.o0().a();
        }
        return jue.a;
    }
}
