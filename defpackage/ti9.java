package defpackage;

import android.os.Bundle;
import android.view.View;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ti9  reason: default package */
public final /* synthetic */ class ti9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ti9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final void onClick(View view) {
        rr3 rr3 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = NeuroAvatarsScreen.Q0;
                rr3.getClass();
                OneMeButton oneMeButton = (OneMeButton) rr3.A0.T0(rr3, NeuroAvatarsScreen.Q0[7]);
                oneMeButton.setProgressEnabled(true);
                oneMeButton.setClickable(false);
                rj9 q0 = rr3.q0();
                q0.c.b(((kwc) q0.y0.a.getValue()).a);
                return;
            default:
                k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
                if (rr3.n0() != null) {
                    bm3.p(rr3);
                    rj9 q02 = rr3.q0();
                    q02.getClass();
                    lg7 c = hwf.c();
                    c.add(new kc3(jpb.oneme_login_neuro_avatars_load_from_gallery_action, new hge(utb.oneme_login_neuro_avatars_load_from_gallery_action), 3, false));
                    c.add(new kc3(jpb.oneme_login_neuro_avatars_take_photo_action, new hge(utb.oneme_login_neuro_avatars_take_photo_action), 3, false));
                    if (((kwc) q02.y0.a.getValue()).a != null) {
                        c.add(new kc3(jpb.oneme_login_neuro_avatars_remove_photo_action, new hge(utb.oneme_login_neuro_avatars_remove_photo_action), 1, false));
                    }
                    c.add(new kc3(jpb.oneme_login_neuro_avatars_cancel_action, new hge(utb.oneme_login_neuro_avatars_cancel_action), 2, false));
                    lg7 a2 = hwf.a(c);
                    sgc sgc = null;
                    jc3 c2 = rf0.c(utb.oneme_login_neuro_avatars_bottomsheet_title, 6, (Bundle) null);
                    jg7 listIterator = a2.listIterator(0);
                    while (true) {
                        jg7 jg7 = listIterator;
                        if (jg7.hasNext()) {
                            c2.a((kc3) jg7.next());
                        } else {
                            k77[] k77Arr3 = BottomSheetWidget.B0;
                            ConfirmationBottomSheet e = c2.e();
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
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
