package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: keb  reason: default package */
public final class keb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public keb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        keb keb = new keb(continuation, this.Y);
        keb.X = obj;
        return keb;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [android.view.View, n7d] */
    public final Object o(Object obj) {
        wx3.H(obj);
        cfb cfb = (cfb) this.X;
        boolean z = cfb instanceof xeb;
        sgc sgc = null;
        rr3 rr3 = this.Y;
        if (z) {
            xeb xeb = (xeb) cfb;
            k77[] k77Arr = ProfileScreen.H0;
            rr3.getClass();
            k77[] k77Arr2 = BottomSheetWidget.B0;
            jc3 a = a24.a(xeb.a, xeb.d, 4);
            a.f(xeb.b);
            kc3[] kc3Arr = (kc3[]) xeb.c.toArray(new kc3[0]);
            a.a((kc3[]) Arrays.copyOf(kc3Arr, kc3Arr.length));
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
        } else if (cfb instanceof web) {
            CharSequence a2 = ((web) cfb).a.a(rr3.getContext());
            if (a2 != null) {
                hba hba = new hba((Widget) rr3);
                hba.f(yba.a);
                hba.g(aca.a);
                hba.i(a2);
                hba.d(new x3a(21, cfb));
                hba.j();
            }
        } else if (cfb instanceof yeb) {
            CharSequence a3 = ((yeb) cfb).a.a(rr3.getContext());
            if (a3 != null) {
                hba hba2 = new hba((Widget) rr3);
                hba2.f(new vba(zhc.v0));
                hba2.i(a3);
                hba2.j();
            }
        } else if (cfb instanceof bfb) {
            hba hba3 = new hba((Widget) rr3);
            bfb bfb = (bfb) cfb;
            Integer num = bfb.a;
            if (num != null) {
                hba3.f(new vba(num.intValue()));
            }
            hba3.h(bfb.b);
            hba3.j();
        } else if (cfb instanceof teb) {
            String str = oyb.g;
            Context context = rr3.getContext();
            CharSequence a4 = ((teb) cfb).a.a(rr3.getContext());
            if (a4 == null) {
                a4 = "";
            }
            oyb.R(context, a4);
        } else if (cfb instanceof afb) {
            k77[] k77Arr3 = ProfileScreen.H0;
            rr3.getClass();
            pfa.a(1).e(((afb) cfb).a).j((n7d) rr3.C0.T0(rr3, ProfileScreen.H0[9])).build().q(rr3);
        } else if (cfb instanceof zeb) {
            zeb zeb = (zeb) cfb;
            Bundle j = jjd.j(new wia[]{new wia("profile:participant_id_for_action", new Long(zeb.a))});
            k77[] k77Arr4 = ProfileScreen.H0;
            b7c M = rr3.p0().M(zeb.c);
            if (M != null) {
                sgc = M.a;
            }
            if (sgc != null) {
                pfa.a(2).h(j).e(zeb.b).j(sgc).g(dh4.c().getDisplayMetrics().density * 12.0f).build().q(rr3);
            }
        } else if (hhd.f(cfb, ueb.a)) {
            k77[] k77Arr5 = ProfileScreen.H0;
            ((qna) rr3.E0.getValue()).g(new jrf(rr3, 1));
        } else if (cfb instanceof veb) {
            try {
                rr3.startActivityForResult(((veb) cfb).a, 333);
                xg9.g((xg9) rr3.F0.getValue(), mnc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                k77[] k77Arr6 = ProfileScreen.H0;
                rr3.q0().z();
                udd.s(ProfileScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
