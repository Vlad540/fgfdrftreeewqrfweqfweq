package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* renamed from: vs5  reason: default package */
public final /* synthetic */ class vs5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ vs5(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    public final Object invoke() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = FoldersPickerScreen.w0;
                return xy6.n(recyclerView.getContext());
            default:
                k77[] k77Arr2 = PickerContactsListWidget.C0;
                return xy6.n(recyclerView.getContext());
        }
    }
}
