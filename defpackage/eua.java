package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: eua  reason: default package */
public final class eua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eua(Continuation continuation, PickerMembersListWidget pickerMembersListWidget, View view) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((eua) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eua eua = new eua(continuation, this.Y, this.Z);
        eua.X = obj;
        return eua;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [gra, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        pickerMembersListWidget.Z.E(list);
        View view = this.Z;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        nl0 nl0 = pickerMembersListWidget.w0;
        if (viewGroup != null) {
            jjd.f(viewGroup, (View) nl0.getValue(), -1);
        }
        EndlessRecyclerView2 o0 = pickerMembersListWidget.o0();
        int i = 0;
        o0.setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
        p4a p4a = (p4a) nl0.getValue();
        if (list == null || !list.isEmpty()) {
            i = 4;
        }
        p4a.setVisibility(i);
        return jue.a;
    }
}
