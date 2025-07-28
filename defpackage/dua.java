package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* renamed from: dua  reason: default package */
public final class dua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dua(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((dua) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dua dua = new dua(this.Y, continuation);
        dua.X = obj;
        return dua;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [gra, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.Y.E((List) this.X);
        return jue.a;
    }
}
