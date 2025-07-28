package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* renamed from: l9  reason: default package */
public final class l9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatAdminsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9(Continuation continuation, AddChatAdminsScreen addChatAdminsScreen) {
        super(2, continuation);
        this.Y = addChatAdminsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l9 l9Var = new l9(continuation, this.Y);
        l9Var.X = obj;
        return l9Var;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kj8 kj8 = (kj8) this.X;
        boolean z = kj8 instanceof gj8;
        jue jue = jue.a;
        if (z) {
            kdb kdb = kdb.c;
            k77[] k77Arr = AddChatAdminsScreen.B0;
            long l0 = this.Y.l0();
            long j = ((gj8) kj8).a;
            kdb.getClass();
            StringBuilder sb = new StringBuilder(":profile/edit/admin_permission?chat_id=");
            sb.append(l0);
            sb.append("&contact_id=");
            kdb.P1().b(wn6.k(sb, j, "&permissions_type=setup_new_admin"), (Bundle) null);
        }
        return jue;
    }
}
