package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: cua  reason: default package */
public final /* synthetic */ class cua implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerMembersListWidget b;

    public /* synthetic */ cua(PickerMembersListWidget pickerMembersListWidget, int i) {
        this.a = i;
        this.b = pickerMembersListWidget;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [f6c, gra] */
    public final Object invoke() {
        PickerMembersListWidget pickerMembersListWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerMembersListWidget.B0;
                k77 k77 = PickerMembersListWidget.B0[0];
                long longValue = ((Number) pickerMembersListWidget.a.a(pickerMembersListWidget)).longValue();
                tp2 tp2 = tp2.a;
                return new kua(longValue, (dk8) tp2.getAccessor().c(dk8.class), (dl8) tp2.getAccessor().c(dl8.class), tp2.getAccessor().d(bv2.class));
            case 1:
                k77[] k77Arr2 = PickerMembersListWidget.B0;
                p4a p4a = new p4a(pickerMembersListWidget.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d));
                p4a.setSubtitle(new hge(rhc.c));
                return p4a;
            default:
                k77[] k77Arr3 = PickerMembersListWidget.B0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(f2a.h0);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                endlessRecyclerView2.setAdapter(pickerMembersListWidget.Y);
                endlessRecyclerView2.j(new tw2(new oy4(endlessRecyclerView2, 2), new ka(endlessRecyclerView2, 25, pickerMembersListWidget), new hd1(29), new hd1(29)));
                endlessRecyclerView2.l(new u24(endlessRecyclerView2));
                if (pickerMembersListWidget.m0()) {
                    pickerMembersListWidget.l0(endlessRecyclerView2);
                }
                pickerMembersListWidget.y0 = gp0.l(endlessRecyclerView2);
                return endlessRecyclerView2;
        }
    }
}
