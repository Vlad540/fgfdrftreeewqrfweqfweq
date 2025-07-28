package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: lh2  reason: default package */
public final class lh2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lh2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ih2) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lh2 lh2 = new lh2(continuation, this.Y);
        lh2.X = obj;
        return lh2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ih2 ih2 = (ih2) this.X;
        k77[] k77Arr = ChatMembersScreen.y0;
        ChatMembersScreen chatMembersScreen = this.Y;
        chatMembersScreen.o0().setTitle(ih2.a);
        chatMembersScreen.o0().setSubtitle(ih2.b.a(chatMembersScreen.getContext()));
        chatMembersScreen.o0().setRightActions(ih2.c ? new aea(new iea(chatMembersScreen), new gea(phc.G, new kh2(chatMembersScreen, 2))) : new aea((jea) null, new iea(chatMembersScreen)));
        String str = (String) chatMembersScreen.n0().y0.a.getValue();
        if (str != null) {
            raa searchView = chatMembersScreen.o0().getSearchView();
            if (searchView != null) {
                searchView.setExpandWithAnimation(false);
            }
            raa searchView2 = chatMembersScreen.o0().getSearchView();
            if (searchView2 != null && searchView2.A0) {
                searchView2.c(true);
                t97 t97 = searchView2.G0;
                if (t97.a()) {
                    ((AppCompatEditText) t97.getValue()).setText(str);
                }
            }
            raa searchView3 = chatMembersScreen.o0().getSearchView();
            if (searchView3 != null) {
                searchView3.setExpandWithAnimation(true);
            }
        }
        return jue.a;
    }
}
