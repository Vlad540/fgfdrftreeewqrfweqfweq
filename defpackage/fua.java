package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* renamed from: fua  reason: default package */
public final class fua extends l5e implements i26 {
    public final /* synthetic */ PickerMembersListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fua(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((fua) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fua(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = PickerMembersListWidget.B0;
        this.X.o0().Y();
        return jue.a;
    }
}
