package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: ilf  reason: default package */
public final class ilf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ilf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ilf ilf = new ilf(continuation, this.Y);
        ilf.X = obj;
        return ilf;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        cgf cgf = (cgf) this.X;
        k77[] k77Arr = WebAppRootScreen.K0;
        rr3 rr3 = this.Y;
        rr3.getClass();
        if (cgf instanceof yff) {
            mif mif = rr3.D0;
            if (mif != null) {
                yff yff = (yff) cgf;
                mif.c(yff.c, yff.a, yff.b);
            }
        } else {
            sgc sgc = null;
            if (hhd.f(cgf, zff.a)) {
                lkf lkf = lkf.c;
                k77 k77 = WebAppRootScreen.K0[1];
                long longValue = ((Number) rr3.x0.a(rr3)).longValue();
                lkf.P1().d();
                d34 P1 = lkf.P1();
                P1.b(":settings/webapp?bot_id=" + longValue, (Bundle) null);
            } else if (cgf instanceof agf) {
                Bundle g = wn6.g(4, "dialog_id");
                k77[] k77Arr2 = BottomSheetWidget.B0;
                agf agf = (agf) cgf;
                jc3 a = a24.a(agf.a, g, 4);
                a.f(agf.b);
                a.a.putInt("icon", phc.B);
                agf.c.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 14), 12));
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
            } else if (cgf instanceof bgf) {
                Bundle g2 = wn6.g(5, "dialog_id");
                k77[] k77Arr3 = BottomSheetWidget.B0;
                bgf bgf = (bgf) cgf;
                jc3 a2 = a24.a(bgf.a, g2, 4);
                bgf.b.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 15), 13));
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
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
