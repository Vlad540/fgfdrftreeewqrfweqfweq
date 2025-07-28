package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: tb  reason: default package */
public final class tb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tb tbVar = new tb(continuation, this.Y);
        tbVar.X = obj;
        return tbVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = AdminsFromContactsScreen.y0;
        ((cc) this.Y.c.getValue()).Z.setValue((String) this.X);
        return jue.a;
    }
}
