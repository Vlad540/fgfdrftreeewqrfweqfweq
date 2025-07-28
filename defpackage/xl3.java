package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* renamed from: xl3  reason: default package */
public final class xl3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl3(ContactListWidget contactListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = j;
        this.w0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xl3(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        List list = null;
        long j = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ContactListWidget.S0;
            kl3 o0 = contactListWidget.o0();
            this.X = 1;
            obj = xs7.U(o0.c.a(), new dl3(o0, j, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((List) obj).isEmpty()) {
            list = obj;
        }
        List list2 = list;
        if (list2 != null) {
            Long l = new Long(j);
            k77[] k77Arr2 = ContactListWidget.S0;
            contactListWidget.getClass();
            k77 k77 = ContactListWidget.S0[4];
            contactListWidget.M0.b(contactListWidget, l);
            pfa.a(2).e(list2).j(this.w0).g(dh4.c().getDisplayMetrics().density * 12.0f).build().q(contactListWidget);
        }
        return jue.a;
    }
}
