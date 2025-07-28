package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: rta  reason: default package */
public final class rta extends l5e implements i26 {
    public final /* synthetic */ PickerContactsListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rta(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerContactsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((rta) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rta(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = PickerContactsListWidget.C0;
        PickerContactsListWidget pickerContactsListWidget = this.X;
        z3d.L(pickerContactsListWidget.n0(), new qta(pickerContactsListWidget.n0(), 0));
        return jue.a;
    }
}
