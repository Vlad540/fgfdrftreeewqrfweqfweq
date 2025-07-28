package defpackage;

import android.view.View;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: dxb  reason: default package */
public final /* synthetic */ class dxb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RaiseHandActionBottomSheet b;

    public /* synthetic */ dxb(RaiseHandActionBottomSheet raiseHandActionBottomSheet, int i) {
        this.a = i;
        this.b = raiseHandActionBottomSheet;
    }

    public final void onClick(View view) {
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RaiseHandActionBottomSheet.F0;
                raiseHandActionBottomSheet.r0(true);
                return;
            default:
                k77[] k77Arr2 = RaiseHandActionBottomSheet.F0;
                fxb fxb = (fxb) raiseHandActionBottomSheet.C0.getValue();
                po1 po1 = fxb.c;
                le1 id = po1.d().a.getId();
                le1 le1 = fxb.b;
                boolean f = hhd.f(le1, id);
                vx0 vx0 = po1.l;
                if (f) {
                    py0 py0 = (py0) vx0;
                    ParticipantStatesManager f2 = py0.f();
                    if (f2 != null) {
                        f2.setOwnHandRaised(false);
                    }
                    py0.x0.set(false);
                } else {
                    py0 py02 = (py0) vx0;
                    ParticipantStatesManager f3 = py02.f();
                    if (f3 != null) {
                        f3.lowerHandParticipant(xja.d(le1));
                    }
                    py02.C0.g(hb.a);
                }
                raiseHandActionBottomSheet.r0(true);
                return;
        }
    }
}
