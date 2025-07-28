package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* renamed from: e6d  reason: default package */
public final class e6d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsBlacklistScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e6d(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.Y = settingsBlacklistScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e6d e6d = new e6d(continuation, this.Y);
        e6d.X = obj;
        return e6d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof a34) {
            c9d.c.R1(a34);
        } else {
            boolean z = a34 instanceof v5d;
            rr3 rr3 = this.Y;
            if (z) {
                v5d v5d = (v5d) a34;
                k77[] k77Arr = SettingsBlacklistScreen.Z;
                rr3.getClass();
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 a = a24.a(v5d.b, v5d.e, 4);
                for (u5d u5d : v5d.c) {
                    boolean z2 = u5d.c;
                    mge mge = u5d.a;
                    int i = u5d.b;
                    if (z2) {
                        a.d(i, (hge) mge);
                    } else {
                        a.c(i, (hge) mge);
                    }
                }
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                sgc sgc = null;
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
            } else if (a34 instanceof w5d) {
                hba hba = new hba((Widget) rr3);
                hba.h(((w5d) a34).b);
                hba.j();
            } else if (a34 instanceof x5d) {
                hba hba2 = new hba((Widget) rr3);
                hba2.f(new vba(uaa.b));
                hba2.h(((x5d) a34).b);
                hba2.j();
            }
        }
        return jue.a;
    }
}
