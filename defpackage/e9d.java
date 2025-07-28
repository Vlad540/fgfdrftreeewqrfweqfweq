package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: e9d  reason: default package */
public final class e9d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SettingsPrivacyScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e9d(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.Y = settingsPrivacyScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e9d e9d = new e9d(continuation, this.Y);
        e9d.X = obj;
        return e9d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof v5d;
        sgc sgc = null;
        rr3 rr3 = this.Y;
        if (z) {
            v5d v5d = (v5d) a34;
            k77[] k77Arr = SettingsPrivacyScreen.Z;
            rr3.getClass();
            k77[] k77Arr2 = BottomSheetWidget.B0;
            mge mge = v5d.b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("title", mge);
            bundle.putBundle(ApiProtocol.PARAM_PAYLOAD, (Bundle) null);
            mnc mnc = v5d.d;
            if (mnc != null) {
                bundle.putString("stat_screen", mnc.name());
            }
            for (u5d u5d : v5d.c) {
                boolean z2 = u5d.c;
                mge mge2 = u5d.a;
                int i = u5d.b;
                if (z2) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new kc3(i, mge2, 1, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                } else {
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList();
                    }
                    parcelableArrayList2.add(new kc3(i, mge2, 3, false));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheet = new ConfirmationBottomSheet(bundle);
            confirmationBottomSheet.setTargetController(rr3);
            rr3 rr32 = rr3;
            while (rr32.getParentController() != null) {
                rr32 = rr32.getParentController();
            }
            ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
            if (ygc != null) {
                sgc = ygc.S();
            }
            confirmationBottomSheet.y0(rr3);
            if (sgc != null) {
                vgc vgc = new vgc(confirmationBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc, true, "BottomSheetWidget");
                sgc.G(vgc);
            }
        } else if (a34 instanceof a34) {
            c9d.c.R1(a34);
        } else if (a34 instanceof w5d) {
            hba hba = new hba((Widget) rr3);
            hba.h(((w5d) a34).b);
            hba.j();
        } else if (a34 instanceof t5d) {
            EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
            enterPinCodeScreen.setTargetController(rr3);
            rr3.getRouter().G(n06.f(enterPinCodeScreen, new j1f(), new j1f()));
        } else if (a34 instanceof s5d) {
            k77[] k77Arr3 = BottomSheetWidget.B0;
            ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog();
            changeDisabledDialog.setTargetController(rr3);
            rr3 rr33 = rr3;
            while (rr33.getParentController() != null) {
                rr33 = rr33.getParentController();
            }
            ygc ygc2 = rr33 instanceof ygc ? (ygc) rr33 : null;
            if (ygc2 != null) {
                sgc = ygc2.S();
            }
            changeDisabledDialog.y0(rr3);
            if (sgc != null) {
                vgc vgc2 = new vgc(changeDisabledDialog, (String) null, (wr3) null, (wr3) null, false, -1);
                rf0.k(false, vgc2, true, "change-disabled");
                sgc.G(vgc2);
            }
        }
        k77[] k77Arr4 = SettingsPrivacyScreen.Z;
        rr3.l0().N0.f();
        return jue.a;
    }
}
