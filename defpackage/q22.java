package defpackage;

import one.me.profile.screens.members.ChatAdminsScreen;

/* renamed from: q22  reason: default package */
public final /* synthetic */ class q22 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ q22(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    public final Object invoke() {
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatAdminsScreen.A0;
                return new y22(chatAdminsScreen.m0());
            default:
                k77[] k77Arr2 = ChatAdminsScreen.A0;
                f fVar = new f(1, chatAdminsScreen.l0(), y22.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 6);
                vz0 vz0 = new vz0(0, chatAdminsScreen.l0(), y22.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0, 5);
                long m0 = chatAdminsScreen.m0();
                i6b i6b = i6b.a;
                return new lj8((u16) fVar, (o94) new o22(m0, i6b.c(), i6b.e(), i6b.getAccessor().d(o2b.class), i6b.d(), i6b.getAccessor().d(s2b.class), i6b.g()), (s16) vz0);
        }
    }
}
