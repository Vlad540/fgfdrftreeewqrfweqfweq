package defpackage;

import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: oy4  reason: default package */
public final /* synthetic */ class oy4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndlessRecyclerView2 b;

    public /* synthetic */ oy4(EndlessRecyclerView2 endlessRecyclerView2, int i) {
        this.a = i;
        this.b = endlessRecyclerView2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final Object invoke() {
        ? r0 = this.b;
        switch (this.a) {
            case 0:
                int i = EndlessRecyclerView2.m2;
                String name = EndlessRecyclerView2.class.getName();
                String resourceName = r0.getResources().getResourceName(r0.getId());
                return p0e.P(name + "-" + resourceName, ".", "_");
            case 1:
                k77[] k77Arr = PickerChatsListWidget.A0;
                return xy6.n(r0.getContext());
            default:
                k77[] k77Arr2 = PickerMembersListWidget.B0;
                return xy6.n(r0.getContext());
        }
    }
}
