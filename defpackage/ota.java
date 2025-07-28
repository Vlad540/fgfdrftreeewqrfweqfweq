package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: ota  reason: default package */
public final /* synthetic */ class ota implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ ota(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    public final Object invoke() {
        PickerContactsListWidget pickerContactsListWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickerContactsListWidget.C0;
                p4a p4a = new p4a(pickerContactsListWidget.getContext(), (AttributeSet) null);
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d));
                p4a.setSubtitle(new hge(rhc.c));
                return p4a;
            default:
                k77[] k77Arr2 = PickerContactsListWidget.C0;
                RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(f2a.h0);
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipToOutline(false);
                recyclerView.setItemAnimator((k6c) null);
                recyclerView.setHasFixedSize(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(pickerContactsListWidget.w0);
                recyclerView.j(new tw2(new vs5(recyclerView, 1), new nta(pickerContactsListWidget, 2), new qq9(18), new nta(pickerContactsListWidget, 1)));
                pickerContactsListWidget.l0(recyclerView);
                pickerContactsListWidget.z0 = gp0.l(recyclerView);
                return recyclerView;
        }
    }
}
