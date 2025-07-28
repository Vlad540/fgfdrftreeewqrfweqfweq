package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: jh2  reason: default package */
public final /* synthetic */ class jh2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ jh2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke() {
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMembersScreen.y0;
                return new di2(62, chatMembersScreen.l0(), false);
            case 1:
                k77[] k77Arr2 = ChatMembersScreen.y0;
                vz0 vz0 = new vz0(0, chatMembersScreen.m0(), di2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 8);
                long l0 = chatMembersScreen.l0();
                i6b i6b = i6b.a;
                return new lj8((u16) new kh2(chatMembersScreen, 1), (o94) new h9(l0, i6b.c(), i6b.getAccessor().d(o2b.class), i6b.d(), i6b.getAccessor().d(s2b.class), 1), (s16) vz0);
            default:
                k77[] k77Arr3 = ChatMembersScreen.y0;
                long l02 = chatMembersScreen.l0();
                String string = chatMembersScreen.getArgs().getString("profile:memberslist:type");
                if (string == null) {
                    string = "";
                }
                return new MembersListWidget(chatMembersScreen.o, new aj8(l02, ch2.valueOf(string), (Integer) null, 12), (x54) null);
        }
    }
}
