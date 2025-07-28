package defpackage;

import android.view.View;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: kh2  reason: default package */
public final /* synthetic */ class kh2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ kh2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = ChatMembersScreen.y0;
                chatMembersScreen.getRouter().C();
                return jue;
            case 1:
                ((Long) obj).getClass();
                k77[] k77Arr2 = ChatMembersScreen.y0;
                return chatMembersScreen.m0().r();
            default:
                View view2 = (View) obj;
                k77[] k77Arr3 = ChatMembersScreen.y0;
                lj8 n0 = chatMembersScreen.n0();
                n0.Z.m((Object) null, qw4.a);
                return jue;
        }
    }
}
