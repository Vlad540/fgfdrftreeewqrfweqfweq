package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: jo8  reason: default package */
public final /* synthetic */ class jo8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ jo8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.getClass();
                k77[] k77Arr2 = MessageContextMenuBottomSheet.d1;
                k77 k77 = k77Arr2[9];
                jr jrVar = messageContextMenuBottomSheet.O0;
                if (!((Boolean) jrVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    k77 k772 = k77Arr2[9];
                    jrVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    tq3 targetController = messageContextMenuBottomSheet.getTargetController();
                    tq3 tq3 = targetController instanceof tq3 ? targetController : null;
                    if (tq3 != null) {
                        tq3.onDismiss();
                    }
                }
                return jue.a;
            case 1:
                k77[] k77Arr3 = MessageContextMenuBottomSheet.d1;
                k77[] k77Arr4 = MessageContextMenuBottomSheet.d1;
                k77 k773 = k77Arr4[6];
                long longValue = ((Number) messageContextMenuBottomSheet.L0.a(messageContextMenuBottomSheet)).longValue();
                k77 k774 = k77Arr4[7];
                long longValue2 = ((Number) messageContextMenuBottomSheet.M0.a(messageContextMenuBottomSheet)).longValue();
                k77 k775 = k77Arr4[8];
                return new cl8(longValue, longValue2, ((Number) messageContextMenuBottomSheet.N0.a(messageContextMenuBottomSheet)).longValue());
            default:
                k77[] k77Arr5 = MessageContextMenuBottomSheet.d1;
                return Boolean.valueOf(messageContextMenuBottomSheet.D0().w());
        }
    }
}
