package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: xsa  reason: default package */
public final class xsa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget2 Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xsa(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2, View view) {
        super(2, continuation);
        this.Y = pickerChatsListWidget2;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xsa) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xsa xsa = new xsa(continuation, this.Y, this.Z);
        xsa.X = obj;
        return xsa;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chats.picker.chats.PickerChatsListWidget2] */
    /* JADX WARNING: type inference failed for: r1v0, types: [gra, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        ? r0 = this.Y;
        r0.C0.E(list);
        int i = 0;
        if (r0.getView() != null) {
            r0.o0().setRefreshingNext(false);
        }
        if (hhd.f(r0.b, "all.chat.folder")) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            nl0 nl0 = r0.D0;
            if (viewGroup != null) {
                jjd.f(viewGroup, (View) nl0.getValue(), -1);
            }
            r0.o0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            p4a p4a = (p4a) nl0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            p4a.setVisibility(i);
        }
        return jue.a;
    }
}
