package defpackage;

import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: i11  reason: default package */
public final /* synthetic */ class i11 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ i11(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final Object invoke() {
        long j = this.b;
        switch (this.a) {
            case 0:
                return new gg1(j);
            case 1:
                return new wj1(j);
            case 2:
                return new e31(j);
            case 3:
                k77[] k77Arr = ChatScreen.n1;
                ul2.c.Z1(j, true);
                return jue.a;
            default:
                k77[] k77Arr2 = MessagesListWidget.b1;
                return new k0c(j);
        }
    }
}
