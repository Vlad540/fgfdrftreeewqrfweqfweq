package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: pvd  reason: default package */
public final class pvd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pvd(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.Y = stickersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pvd pvd = new pvd(continuation, this.Y);
        pvd.X = obj;
        return pvd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        q6d q6d = (q6d) this.X;
        k77[] k77Arr = StickersScreen.z0;
        rr3 rr3 = this.Y;
        rr3.getClass();
        if (q6d instanceof n6d) {
            n6d n6d = (n6d) q6d;
            k77[] k77Arr2 = BottomSheetWidget.B0;
            sgc sgc = null;
            jc3 a = a24.a(n6d.a, (Bundle) null, 6);
            a.f(n6d.b);
            n6d.c.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12), 10));
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
        } else if (q6d instanceof p6d) {
            hba hba = new hba((Widget) rr3);
            p6d p6d = (p6d) q6d;
            hba.f(new vba(p6d.a));
            CharSequence a2 = p6d.b.a(rr3.getContext());
            if (a2 == null) {
                a2 = "";
            }
            hba.i(a2);
            hba.j();
        }
        return jue.a;
    }
}
