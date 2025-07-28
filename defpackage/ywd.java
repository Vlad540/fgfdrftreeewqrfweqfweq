package defpackage;

import android.content.Intent;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.protocol.HTTP;

/* renamed from: ywd  reason: default package */
public final class ywd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ywd(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.Y = stickersSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ywd ywd = new ywd(continuation, this.Y);
        ywd.X = obj;
        return ywd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        q6d q6d = (q6d) this.X;
        k77[] k77Arr = StickersSettingsScreen.Y;
        rr3 rr3 = this.Y;
        rr3.getClass();
        if (q6d instanceof o6d) {
            pfa.a(2).e(((o6d) q6d).a).k().build().q(rr3);
        } else {
            String str = null;
            if (q6d instanceof l6d) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((l6d) q6d).a);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                vgc vgc = (vgc) o23.f0(rr3.getRouter().e());
                if (vgc != null) {
                    str = vgc.b;
                }
                vwd.c.Z1(intent, str);
            } else if (q6d instanceof m6d) {
                String str2 = oyb.g;
                oyb.R(rr3.getContext(), ((m6d) q6d).a);
            } else if (q6d instanceof n6d) {
                n6d n6d = (n6d) q6d;
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 a = a24.a(n6d.a, (Bundle) null, 6);
                a.f(n6d.b);
                n6d.c.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 13), 11));
                ConfirmationBottomSheet e = a.e();
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
                    vgc vgc2 = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc2, true, "BottomSheetWidget");
                    str.G(vgc2);
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
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
