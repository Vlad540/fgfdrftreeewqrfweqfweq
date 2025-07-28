package defpackage;

import android.os.Bundle;
import android.util.AttributeSet;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: gu2  reason: default package */
public final /* synthetic */ class gu2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ gu2(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                if (hhd.f(widget.b, "all.chat.folder")) {
                    return (ok3) co3.a.getAccessor().c(ok3.class);
                }
                ok3.a.getClass();
                return nk3.b;
            case 1:
                k77[] k77Arr = ChatsListWidget.O0;
                return widget.getRouter();
            case 2:
                k77[] k77Arr2 = ChatsListWidget.O0;
                hk2 hk2 = new hk2(9);
                ((p54) zf0.a.getAccessor().c(p54.class)).getClass();
                return new fw2(widget.b, hk2);
            case 3:
                k77[] k77Arr3 = ChatsListWidget.O0;
                if (((hq2) widget.o0().J0.getValue()).b && !widget.n0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                k77[] k77Arr4 = ChatsListWidget.O0;
                return new fu2((ok3) widget.X.getValue(), widget.b, (we1) widget.L0.getValue());
            case 5:
                k77[] k77Arr5 = ChatsListWidget.O0;
                return new xf0(new r7e(new gu2(widget, 2)), false, (ll3) null, 62);
            case 6:
                k77[] k77Arr6 = ChatsListWidget.O0;
                p4a p4a = new p4a(widget.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.A0);
                p4a.setTitle(new hge(jtb.chats_list_empty_state_title));
                afa.a(p4a, new re(10, p4a, widget));
                return p4a;
            case 7:
                k77[] k77Arr7 = ChatsListWidget.O0;
                zu2.c.P1().b(":settings/folder/members-picker?folder_id=".concat(widget.b), (Bundle) null);
                return jue.a;
            case 8:
                k77[] k77Arr8 = ChatsListWidget.O0;
                return new we1(new r7e(new gu2(widget, 1)), new jrf(widget, 0));
            default:
                k77[] k77Arr9 = ChatsListWidget.O0;
                return new sr2(widget.n0(), new gu2(widget, 3));
        }
    }
}
