package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;

/* renamed from: b8d  reason: default package */
public final class b8d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsListScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b8d(SettingsListScreen settingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = settingsListScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((sg9) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b8d b8d = new b8d(this.Y, continuation);
        b8d.X = obj;
        return b8d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof p8d;
        jue jue = jue.a;
        sgc sgc = null;
        if (z) {
            w7d.c.P1().b(us8.j(((p8d) a34).b, ":profile/edit?id=", "&type=contact"), (Bundle) null);
        } else if (a34 instanceof q8d) {
            w7d.c.P1().b(us8.j(((q8d) a34).b, ":profile/avatars?id=", "&type=contact"), (Bundle) null);
        } else {
            boolean f = hhd.f(a34, m8d.b);
            rr3 rr3 = this.Y;
            if (f) {
                k77[] k77Arr = SettingsListScreen.D0;
                rr3.getClass();
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 c = rf0.c(zaa.r, 6, (Bundle) null);
                c.a(new kc3(yaa.d, new hge(zaa.u), 3, false));
                c.a(new kc3(yaa.c, new hge(zaa.t), 3, false));
                c.a(new kc3(yaa.b, new hge(zaa.s), 3, false));
                c.a(new kc3(yaa.a, new hge(zaa.o), 2, false));
                ConfirmationBottomSheet e = c.e();
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
            } else if (hhd.f(a34, n8d.b)) {
                k77[] k77Arr3 = SettingsListScreen.D0;
                ((qna) rr3.x0.getValue()).g(new jrf(rr3, 1));
            } else if (a34 instanceof o8d) {
                rr3.startActivityForResult(((o8d) a34).b, 666);
            } else if (a34 instanceof r8d) {
                try {
                    rr3.startActivityForResult(((r8d) a34).b, 333);
                    xg9.g((xg9) rr3.y0.getValue(), mnc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    udd.s(rr3.getClass().getName(), "failed open camera", (Throwable) null);
                    rr3.p0().v();
                }
            } else if (hhd.f(a34, s8d.b)) {
                w7d.c.P1().b(":media-picker/select/photo", (Bundle) null);
            } else if (a34 instanceof t8d) {
                t8d t8d = (t8d) a34;
                CharSequence a = t8d.b.a(rr3.getContext());
                if (a == null) {
                    return jue;
                }
                hba hba = (hba) rr3.w0.getValue();
                hba.i(a);
                Integer num = t8d.c;
                hba.f(num != null ? new vba(num.intValue()) : wba.a);
                hba.j();
            } else if (a34 instanceof a34) {
                w7d.c.R1(a34);
            }
        }
        return jue;
    }
}
