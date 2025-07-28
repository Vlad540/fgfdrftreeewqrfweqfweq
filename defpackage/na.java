package defpackage;

import android.view.View;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;

/* renamed from: na  reason: default package */
public final /* synthetic */ class na implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdminWaitingRoomScreen b;

    public /* synthetic */ na(AdminWaitingRoomScreen adminWaitingRoomScreen, int i) {
        this.a = i;
        this.b = adminWaitingRoomScreen;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [rr3, one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen] */
    public final void onClick(View view) {
        ? r1 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = AdminWaitingRoomScreen.w0;
                ((sa) r1.a.getValue()).q(true);
                return;
            case 1:
                k77[] k77Arr2 = AdminWaitingRoomScreen.w0;
                ((sa) r1.a.getValue()).q(false);
                return;
            default:
                k77[] k77Arr3 = AdminWaitingRoomScreen.w0;
                r1.getRouter().B(r1);
                return;
        }
    }
}
