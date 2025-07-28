package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: qu2  reason: default package */
public final class qu2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qu2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qu2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qu2 qu2 = new qu2(continuation, this.Y);
        qu2.X = obj;
        return qu2;
    }

    public final Object o(Object obj) {
        View view;
        wx3.H(obj);
        jk3 jk3 = (jk3) this.X;
        boolean z = jk3 instanceof ced;
        ygc ygc = this.Y;
        if (z) {
            ced ced = (ced) jk3;
            k77[] k77Arr = ChatsListWidget.O0;
            ygc.getClass();
            k77[] k77Arr2 = BottomSheetWidget.B0;
            jc3 a = a24.a(ced.b, jjd.j(new wia("selected.contactId.Action", Long.valueOf(ced.a))), 4);
            a.f(ced.c);
            ced.d.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 4), 3));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(ygc);
            ygc ygc2 = ygc;
            while (ygc2.getParentController() != null) {
                ygc2 = ygc2.getParentController();
            }
            sgc sgc = null;
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
            k77[] k77Arr3 = ChatsListWidget.O0;
            ygc.getClass();
            CharSequence a2 = bed.a.a(ygc.getContext());
            if (a2 != null) {
                hba hba = new hba(ygc);
                hba.i(a2);
                hba.f(yba.a);
                hba.g(aca.a);
                rr3 parentController = ygc.getParentController();
                hba.c(new pba(0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                hba.d(new hu2(bed, 0));
                hba.j();
            }
        }
        return jue.a;
    }
}
