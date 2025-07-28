package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: ro2  reason: default package */
public final /* synthetic */ class ro2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ ro2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final void onClick(View view) {
        String y;
        String str = null;
        rr3 rr3 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatTitleIconScreen.D0;
                bm3.p(rr3);
                rr3.q0().getClass();
                List<kc3> B = p23.B(new kc3[]{new kc3(kca.b, new hge(lca.j), 3, false), new kc3(kca.c, new hge(lca.k), 3, false), new kc3(kca.a, new hge(lca.i), 2, false)});
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 c = rf0.c(lca.h, 6, (Bundle) null);
                for (kc3 kc3 : B) {
                    c.a(kc3);
                }
                ConfirmationBottomSheet e = c.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    str = ygc.S();
                }
                e.y0(rr3);
                if (str != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    str.G(vgc);
                    return;
                }
                return;
            default:
                k77[] k77Arr3 = ChatTitleIconScreen.D0;
                bm3.p(rr3);
                rr3.o0().setProgressEnabled(true);
                gp2 q0 = rr3.q0();
                int ordinal = q0.c.ordinal();
                if (ordinal == 0) {
                    t52 t52 = (t52) q0.x0.getValue();
                    List f0 = cs.f0(q0.b);
                    String str2 = q0.K0;
                    String str3 = ((zo2) q0.C0.getValue()).b;
                    if (!(str3 == null || (y = at7.y(str3)) == null)) {
                        str = y;
                    }
                    zx1 zx1 = new zx1(13, q0);
                    t52.getClass();
                    r52 r52 = new r52(t52, f0, str2, str);
                    qmc b2 = cnc.b();
                    wwc wwc = tic.a;
                    new mv9(1, new sic(0, r52)).m(b2).i(t52.u).k(new pn1(zx1, 2, new lpa(15)));
                    return;
                } else if (ordinal == 1) {
                    q0.H0.o1(q0, gp2.M0[0], taf.n(q0, ((pae) q0.Z.getValue()).b(), (ru3) null, new ep2(q0, (Continuation) null), 2));
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
        }
    }
}
