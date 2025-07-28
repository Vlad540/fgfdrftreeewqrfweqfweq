package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: pta  reason: default package */
public final class pta extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pta(Continuation continuation, PickerContactsListWidget pickerContactsListWidget, View view) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pta) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pta pta = new pta(continuation, this.Y, this.Z);
        pta.X = obj;
        return pta;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [gra, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        pickerContactsListWidget.Y.E(list);
        boolean z = !h0e.c0((CharSequence) pickerContactsListWidget.m0().y0.a.getValue());
        nl0 nl0 = pickerContactsListWidget.x0;
        int i = 0;
        if (z) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                jjd.f(viewGroup, (View) nl0.getValue(), -1);
            }
            pickerContactsListWidget.n0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            p4a p4a = (p4a) nl0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            p4a.setVisibility(i);
        } else {
            pickerContactsListWidget.n0().setVisibility(0);
            ((p4a) nl0.getValue()).setVisibility(4);
        }
        return jue.a;
    }
}
