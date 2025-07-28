package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.SettingMediaScreen;

/* renamed from: x4d  reason: default package */
public final class x4d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingMediaScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x4d(Continuation continuation, SettingMediaScreen settingMediaScreen) {
        super(2, continuation);
        this.Y = settingMediaScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x4d x4d = new x4d(continuation, this.Y);
        x4d.X = obj;
        return x4d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        sgc sgc = null;
        if (a34 instanceof l8d) {
            l8d l8d = (l8d) a34;
            k77[] k77Arr = SettingMediaScreen.Y;
            rr3 rr3 = this.Y;
            rr3.getClass();
            k77[] k77Arr2 = BottomSheetWidget.B0;
            jc3 a = a24.a(l8d.b, (Bundle) null, 4);
            for (k8d k8d : l8d.c) {
                boolean z = k8d.c;
                mge mge = k8d.a;
                int i = k8d.b;
                if (z) {
                    a.b(i, (hge) mge);
                } else {
                    a.d(i, (hge) mge);
                }
            }
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
        } else if (a34 instanceof a34) {
            w4d.c.R1(a34);
        } else if (a34 instanceof j8d) {
            w4d.c.P1().b(":settings/caching", (Bundle) null);
        }
        return jue.a;
    }
}
