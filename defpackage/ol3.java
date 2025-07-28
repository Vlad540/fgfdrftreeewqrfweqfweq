package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ol3  reason: default package */
public final class ol3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ol3) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ol3 ol3 = new ol3(this.Y, continuation);
        ol3.X = obj;
        return ol3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        Widget widget = this.Y;
        bm3.p(widget);
        if (a34 instanceof a34) {
            qo3.c.R1(a34);
        } else if (a34 instanceof hfa) {
            hba hba = new hba(widget);
            hba.i("Ещё не реализовано");
            hba.j();
        } else if (a34 instanceof apd) {
            k77[] k77Arr = ContactListWidget.S0;
            apd apd = (apd) a34;
            ((iq1) widget.c.getValue()).e(gq1.Z, apd.c);
            bm3.p(widget);
            long j = apd.b;
            boolean z = apd.c;
            ((we1) widget.G0.getValue()).l(j, z, new nl3(j, z));
        }
        return jue.a;
    }
}
