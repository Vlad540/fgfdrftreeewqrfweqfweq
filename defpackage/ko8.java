package defpackage;

import android.os.Bundle;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: ko8  reason: default package */
public final /* synthetic */ class ko8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg9 b;

    public /* synthetic */ ko8(sg9 sg9, int i) {
        this.a = i;
        this.b = sg9;
    }

    public final Object invoke() {
        jue jue = jue.a;
        a34 a34 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MessageContextMenuBottomSheet.d1;
                bx8.c.R1(a34);
                return jue;
            case 1:
                k77[] k77Arr2 = MessagesListWidget.b1;
                rfa rfa = (rfa) a34;
                d34 P1 = bx8.c.P1();
                P1.b(":call-user?opponent_id=" + rfa.b + "&video_enabled=" + rfa.c, (Bundle) null);
                return jue;
            default:
                k77[] k77Arr3 = MessagesListWidget.b1;
                bx8.c.P1().b(":call-join-link?link=".concat(((ffa) a34).d), (Bundle) null);
                return jue;
        }
    }

    public /* synthetic */ ko8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, sg9 sg9) {
        this.a = 0;
        this.b = sg9;
    }
}
