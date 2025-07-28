package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: o09  reason: default package */
public final class o09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o09 o09 = new o09(continuation, this.Y);
        o09.X = obj;
        return o09;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        zw8 zw8 = (zw8) this.X;
        k77[] k77Arr = MessagesListWidget.b1;
        rr3 rr3 = this.Y;
        rr3.getClass();
        sgc sgc = null;
        if (zw8 instanceof ded) {
            ded ded = (ded) zw8;
            k77[] k77Arr2 = BottomSheetWidget.B0;
            jc3 a = a24.a(ded.b, jjd.j(new wia[]{new wia("selected.messageIds.Action", o23.t0(ded.a))}), 4);
            a.f(ded.c);
            ded.d.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6), 6));
            ConfirmationBottomSheet e = a.e();
            e.setTargetController(rr3);
            rr3 rr32 = rr3;
            while (rr32.getParentController() != null) {
                rr32 = rr32.getParentController();
            }
            ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
            if (ygc != null) {
                sgc = ygc.S();
            }
            e.y0(rr3);
            if (sgc != null) {
                vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else if (zw8 instanceof jed) {
            jed jed = (jed) zw8;
            k77[] k77Arr3 = BottomSheetWidget.B0;
            jc3 a2 = a24.a(jed.e, jjd.j(new wia[]{new wia("selected.messageIds.Action", new long[]{jed.a}), new wia("bot.shareContact.confirm.keyboardId", jed.b), new wia("bot.shareContact.confirm.button", jed.d), new wia("bot.shareContact.confirm.buttonPosition", jed.c)}), 4);
            a2.f(jed.f);
            jed.g.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 7), 5));
            ConfirmationBottomSheet e2 = a2.e();
            e2.setTargetController(rr3);
            rr3 rr33 = rr3;
            while (rr33.getParentController() != null) {
                rr33 = rr33.getParentController();
            }
            ygc ygc2 = rr33 instanceof ygc ? (ygc) rr33 : null;
            if (ygc2 != null) {
                sgc = ygc2.S();
            }
            e2.y0(rr3);
            if (sgc != null) {
                vgc vgc2 = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc2, true, "BottomSheetWidget");
                sgc.G(vgc2);
            }
        } else if (zw8 instanceof ied) {
            nx8 r0 = rr3.r0();
            long j = ((ied) zw8).a;
            r0.getClass();
            taf.o(r0.x0, new lx8(j));
        } else if (zw8 instanceof fed) {
            nx8 r02 = rr3.r0();
            long j2 = ((fed) zw8).a;
            r02.getClass();
            taf.o(r02.x0, new kx8(j2));
        } else if (zw8 instanceof ked) {
            ked ked = (ked) zw8;
            CharSequence a3 = ked.a.a(rr3.getContext());
            if (a3 != null) {
                hba hba = new hba((Widget) rr3);
                hba.i(a3);
                hba.a(ked.c);
                hba.f(new vba(ked.b));
                hba.j();
            }
        } else if (zw8 instanceof qr8) {
            tt6 tt6 = (tt6) xv8.a.getAccessor().e();
            if (tt6 != null) {
                tt6.f(Collections.singleton(new st6(qt6.w0, 1)), mnc.CHAT);
            }
        } else if (zw8 instanceof ba) {
            vzb vzb = rr3.a1;
            if (vzb != null) {
                ba baVar = (ba) zw8;
                vzb.e(baVar.c, baVar.a, baVar.b);
            }
        } else if (hhd.f(zw8, rma.a)) {
            View view = rr3.getView();
            if (view != null) {
                lp.K(view, ie6.CONFIRM);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
