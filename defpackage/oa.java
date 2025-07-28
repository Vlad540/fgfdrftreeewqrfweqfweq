package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: oa  reason: default package */
public final class oa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminWaitingRoomScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oa(AdminWaitingRoomScreen adminWaitingRoomScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = adminWaitingRoomScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((oa) n((qa) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oa oaVar = new oa(this.Y, continuation);
        oaVar.X = obj;
        return oaVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        qa qaVar = (qa) this.X;
        List list = qaVar.b;
        AdminWaitingRoomScreen adminWaitingRoomScreen = this.Y;
        adminWaitingRoomScreen.Z.E(list);
        k77[] k77Arr = AdminWaitingRoomScreen.w0;
        mt0.k((OneMeButton) adminWaitingRoomScreen.o.T0(adminWaitingRoomScreen, k77Arr[2]), !list.isEmpty(), 0, (u16) null, 6);
        mt0.k((OneMeButton) adminWaitingRoomScreen.X.T0(adminWaitingRoomScreen, k77Arr[3]), !list.isEmpty(), 0, (u16) null, 6);
        mt0.k((RecyclerView) adminWaitingRoomScreen.c.T0(adminWaitingRoomScreen, k77Arr[1]), !list.isEmpty(), 0, (u16) null, 6);
        mt0.k((p4a) adminWaitingRoomScreen.Y.T0(adminWaitingRoomScreen, k77Arr[4]), qaVar.b.isEmpty() && qaVar != qa.c, 0, (u16) null, 6);
        ((nea) adminWaitingRoomScreen.b.T0(adminWaitingRoomScreen, k77Arr[0])).setSubtitle(qaVar.a.a(adminWaitingRoomScreen.getContext()));
        return jue.a;
    }
}
