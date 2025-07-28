package defpackage;

import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* renamed from: ux6  reason: default package */
public final /* synthetic */ class ux6 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ ux6(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    public final Object invoke() {
        rr3 rr3 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = InputPhoneScreen.I0;
                return new sz6(rr3.getRouter());
            default:
                k77[] k77Arr2 = InputPhoneScreen.I0;
                k77[] k77Arr3 = BottomSheetWidget.B0;
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(jjd.j(new wia[]{new wia("is_narnia_available", Boolean.FALSE)}));
                selectCountryBottomSheet.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                sgc sgc = null;
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                sgc sgc2 = sgc;
                selectCountryBottomSheet.y0(rr3);
                if (sgc2 != null) {
                    vgc vgc = new vgc(selectCountryBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc2.G(vgc);
                }
                return jue.a;
        }
    }
}
