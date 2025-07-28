package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: pl3  reason: default package */
public final class pl3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pl3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pl3) n((jk3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pl3 pl3 = new pl3(this.Y, continuation);
        pl3.X = obj;
        return pl3;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jk3 jk3 = (jk3) this.X;
        boolean z = jk3 instanceof t9;
        jue jue = jue.a;
        sgc sgc = null;
        ygc ygc = this.Y;
        if (z) {
            k77[] k77Arr = ContactListWidget.S0;
            if (ygc.l0().b(qna.e)) {
                xg9.g((xg9) ygc.b.getValue(), mnc.x0);
                qo3 qo3 = qo3.c;
                qo3.getClass();
                qo3.P1().b(":contact-list/create-contact", (Bundle) null);
            } else {
                ygc.q0();
            }
        } else if (jk3 instanceof ced) {
            ced ced = (ced) jk3;
            k77[] k77Arr2 = ContactListWidget.S0;
            ygc.getClass();
            k77[] k77Arr3 = BottomSheetWidget.B0;
            jc3 a = a24.a(ced.b, jjd.j(new wia("selected.contactId.Action", Long.valueOf(ced.a))), 4);
            a.f(ced.c);
            ced.d.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 5), 4));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(ygc);
            ygc ygc2 = ygc;
            while (ygc2.getParentController() != null) {
                ygc2 = ygc2.getParentController();
            }
            ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
            if (ygc3 != null) {
                sgc = ygc3.S();
            }
            e.y0(ygc);
            if (sgc != null) {
                vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else if (jk3 instanceof bed) {
            bed bed = (bed) jk3;
            k77[] k77Arr4 = ContactListWidget.S0;
            ygc.getClass();
            CharSequence a2 = bed.a.a(ygc.getContext());
            if (a2 != null) {
                hba hba = new hba(ygc);
                hba.i(a2);
                hba.f(yba.a);
                hba.g(aca.a);
                hba.d(new hu2(bed, 1));
                hba.j();
            }
        } else if (jk3 instanceof zv3) {
            qo3 qo32 = qo3.c;
            qo32.getClass();
            qo32.P1().b(":start-conversation/chat", (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
