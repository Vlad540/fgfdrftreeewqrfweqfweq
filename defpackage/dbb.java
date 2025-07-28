package defpackage;

import android.os.Bundle;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: dbb  reason: default package */
public final class dbb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((abb) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dbb dbb = new dbb(this.Y, continuation);
        dbb.X = obj;
        return dbb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        abb abb = (abb) this.X;
        boolean z = abb instanceof zab;
        jue jue = jue.a;
        rr3 rr3 = this.Y;
        if (z) {
            zab zab = (zab) abb;
            CharSequence a = zab.a.a(rr3.getContext());
            if (a == null) {
                return jue;
            }
            hba hba = new hba((Widget) rr3);
            hba.f(new vba(zab.b));
            hba.i(a);
            hba.j();
        } else if (abb instanceof wab) {
            hhd.q(rr3.getContext(), ((wab) abb).a);
        } else if (abb instanceof yab) {
            mq3 e = pfa.a(1).e(((yab) abb).a);
            k77[] k77Arr = ProfileInviteScreen.Y;
            rr3.getClass();
            e.j((ImageView) rr3.X.T0(rr3, ProfileInviteScreen.Y[0])).build().q(rr3);
        } else if (abb instanceof xab) {
            k77[] k77Arr2 = BottomSheetWidget.B0;
            xab xab = (xab) abb;
            sgc sgc = null;
            jc3 a2 = a24.a(xab.a, (Bundle) null, 6);
            a2.f(xab.b);
            xab.c.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11), 9));
            ConfirmationBottomSheet e2 = a2.e();
            e2.setTargetController(rr3);
            rr3 rr32 = rr3;
            while (rr32.getParentController() != null) {
                rr32 = rr32.getParentController();
            }
            ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
            if (ygc != null) {
                sgc = ygc.S();
            }
            e2.y0(rr3);
            if (sgc != null) {
                vgc vgc = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue;
    }
}
