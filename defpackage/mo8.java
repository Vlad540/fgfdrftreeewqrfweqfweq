package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: mo8  reason: default package */
public final class mo8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mo8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mo8 mo8 = new mo8(continuation, this.Y);
        mo8.X = obj;
        return mo8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = MessageContextMenuBottomSheet.d1;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
        List f = bundle != null ? kjd.f(bundle) : null;
        if (f == null) {
            f = hw4.a;
        }
        messageContextMenuBottomSheet.a1.E(o23.i0(Collections.singletonList(new qq3(f)), list));
        return jue.a;
    }
}
