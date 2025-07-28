package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: no8  reason: default package */
public final class no8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        no8 no8 = new no8(continuation, this.Y);
        no8.X = obj;
        return no8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sg9 sg9 = (sg9) this.X;
        k77[] k77Arr = MessageContextMenuBottomSheet.d1;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        messageContextMenuBottomSheet.getClass();
        if (sg9 instanceof a34) {
            messageContextMenuBottomSheet.r0(true);
            hq0 hq0 = new hq0((rr3) messageContextMenuBottomSheet, (s16) new ko8(messageContextMenuBottomSheet, sg9));
            if (messageContextMenuBottomSheet.getRouter() != null) {
                messageContextMenuBottomSheet.getRouter().a(hq0);
            } else {
                messageContextMenuBottomSheet.addLifecycleListener(new s9(messageContextMenuBottomSheet, hq0, 7));
            }
        }
        return jue.a;
    }
}
