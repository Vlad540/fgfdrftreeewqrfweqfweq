package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: tl3  reason: default package */
public final class tl3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ z96 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl3(ContactListWidget contactListWidget, z96 z96, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = z96;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tl3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tl3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        z96 z96 = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ContactListWidget.S0;
            kl3 o0 = contactListWidget.o0();
            uj3 uj3 = z96.Y;
            this.X = 1;
            Object U = xs7.U(o0.c.b(), new el3(o0, uj3, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k77[] k77Arr2 = ContactListWidget.S0;
        int ordinal = contactListWidget.o0().b.ordinal();
        if (ordinal == 0) {
            contactListWidget.g(z96.a, false);
        } else if (ordinal == 1) {
            qo3 qo3 = qo3.c;
            long j = z96.a;
            qo3.getClass();
            qo3.P1().b(":profile?id=" + j + "&type=contact", (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
