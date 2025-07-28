package defpackage;

import android.view.View;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: io8  reason: default package */
public final /* synthetic */ class io8 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ io8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.r0(true);
                return jue;
            case 1:
                k77[] k77Arr2 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.z0(((pq3) obj).a);
                return jue;
            default:
                k77[] k77Arr3 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.z0(((pq3) obj).a);
                return jue;
        }
    }
}
