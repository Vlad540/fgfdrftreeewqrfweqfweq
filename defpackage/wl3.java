package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: wl3  reason: default package */
public final class wl3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wl3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wl3) n((bk3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wl3 wl3 = new wl3(this.Y, continuation);
        wl3.X = obj;
        return wl3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bk3 bk3 = (bk3) this.X;
        k77[] k77Arr = ContactListWidget.S0;
        ContactListWidget contactListWidget = this.Y;
        contactListWidget.r0();
        CharSequence m0 = contactListWidget.m0();
        jue jue = jue.a;
        cpf cpf = contactListWidget.Z;
        cpf cpf2 = contactListWidget.Y;
        cpf cpf3 = contactListWidget.X;
        if (m0 == null || m0.length() == 0) {
            cpf3.E(((bk3) contactListWidget.o0().B0.a.getValue()).a);
            cpf2.E(hw4.a);
            cpf.E(((bk3) contactListWidget.o0().B0.a.getValue()).c);
            return jue;
        }
        cpf3.E(bk3.a);
        cpf2.E(bk3.b);
        cpf.E(bk3.c);
        return jue;
    }
}
