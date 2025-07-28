package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: nu2  reason: default package */
public final class nu2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nu2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((nu2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nu2 nu2 = new nu2(continuation, this.Y);
        nu2.X = obj;
        return nu2;
    }

    public final Object o(Object obj) {
        View view;
        wx3.H(obj);
        oq2 oq2 = (oq2) this.X;
        boolean z = oq2 instanceof kpc;
        ygc ygc = this.Y;
        if (z) {
            k77[] k77Arr = ChatsListWidget.O0;
            ygc.n0().x0(0);
            ((kpc) oq2).getClass();
            tt6 tt6 = (tt6) tp2.a.getAccessor().e();
            if (tt6 != null) {
                tt6.f(Collections.singleton(new st6(qt6.MADE_2_PIN, 1)), mnc.A0);
            }
        } else if (oq2 instanceof med) {
            CharSequence a = ((med) oq2).a.a(ygc.getContext());
            if (a != null) {
                hba hba = new hba(ygc);
                hba.i(a);
                hba.j();
            }
        } else {
            sgc sgc = null;
            if (oq2 instanceof eed) {
                eed eed = (eed) oq2;
                k77[] k77Arr2 = ChatsListWidget.O0;
                ygc.getClass();
                k77[] k77Arr3 = BottomSheetWidget.B0;
                jc3 a2 = a24.a(eed.b, jjd.j(new wia("selected.chatId.Action", Long.valueOf(eed.a))), 4);
                a2.f(eed.c);
                eed.d.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3), 2));
                ConfirmationBottomSheet e = a2.e();
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
            } else if (oq2 instanceof aed) {
                CharSequence a3 = ((aed) oq2).a.a(ygc.getContext());
                if (a3 != null) {
                    hba hba2 = new hba(ygc);
                    hba2.f(yba.a);
                    hba2.i(a3);
                    hba2.g(aca.a);
                    rr3 parentController = ygc.getParentController();
                    hba2.c(new pba(0, (parentController == null || (view = parentController.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                    hba2.d(new wwc(8, oq2));
                    hba2.j();
                }
            } else if (oq2 instanceof sz2) {
                k77[] k77Arr4 = BottomSheetWidget.B0;
                jc3 c = rf0.c(jtb.chat_list_confirm_clear_saved_messages_history_title, 6, (Bundle) null);
                c.f(new hge(jtb.chat_list_confirm_clear_saved_messages_history_subtitle));
                c.b(xob.oneme_saved_messages_clear_history, new hge(jtb.chat_list_confirm_clear_saved_messages_history_negative_button));
                c.c(aic.a, new hge(cic.r));
                ConfirmationBottomSheet e2 = c.e();
                e2.setTargetController(ygc);
                ygc ygc4 = ygc;
                while (ygc4.getParentController() != null) {
                    ygc4 = ygc4.getParentController();
                }
                ygc ygc5 = ygc4 instanceof ygc ? ygc4 : null;
                if (ygc5 != null) {
                    sgc = ygc5.S();
                }
                e2.y0(ygc);
                if (sgc != null) {
                    vgc vgc2 = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc2, true, "BottomSheetWidget");
                    sgc.G(vgc2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
