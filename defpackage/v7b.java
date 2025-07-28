package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: v7b  reason: default package */
public final class v7b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v7b(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.Y = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v7b v7b = new v7b(continuation, this.Y);
        v7b.X = obj;
        return v7b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        v6b v6b = (v6b) this.X;
        boolean z = v6b instanceof t6b;
        rr3 rr3 = this.Y;
        if (z) {
            bm3.p(rr3);
            k77[] k77Arr = BottomSheetWidget.B0;
            t6b t6b = (t6b) v6b;
            sgc sgc = null;
            jc3 a = a24.a(t6b.a, (Bundle) null, 6);
            a.f(t6b.b);
            t6b.c.forEach(new nl2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9), 1));
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
        } else if (v6b instanceof u6b) {
            gba gba = rr3.A0;
            if (gba != null) {
                gba.a();
            }
            hba hba = new hba((Widget) rr3);
            u6b u6b = (u6b) v6b;
            hba.h(u6b.a);
            Integer num = u6b.b;
            if (num != null) {
                hba.f(new vba(num.intValue()));
            }
            rr3.A0 = hba.j();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
