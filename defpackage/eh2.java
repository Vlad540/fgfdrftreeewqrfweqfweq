package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: eh2  reason: default package */
public final /* synthetic */ class eh2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ eh2(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    public final Object invoke() {
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatMembersCompactWidget.Z;
                return new MembersListWidget(chatMembersCompactWidget.b, new aj8(chatMembersCompactWidget.l0(), ch2.MEMBER, (Integer) 10, 4), (x54) null);
            case 1:
                k77[] k77Arr2 = ChatMembersCompactWidget.Z;
                return new di2(60, chatMembersCompactWidget.l0(), true);
            default:
                k77[] k77Arr3 = ChatMembersCompactWidget.Z;
                vz0 vz0 = new vz0(0, chatMembersCompactWidget.m0(), di2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 7);
                long l0 = chatMembersCompactWidget.l0();
                i6b i6b = i6b.a;
                return new lj8((u16) new l(22, chatMembersCompactWidget), (o94) new h9(l0, i6b.c(), i6b.getAccessor().d(o2b.class), i6b.d(), i6b.getAccessor().d(s2b.class), 1), (s16) vz0);
        }
    }
}
