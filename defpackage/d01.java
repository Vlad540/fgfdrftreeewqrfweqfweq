package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: d01  reason: default package */
public final /* synthetic */ class d01 implements agc {
    public final /* synthetic */ int a;
    public final /* synthetic */ f01 b;

    public /* synthetic */ d01(f01 f01, int i) {
        this.a = i;
        this.b = f01;
    }

    public final void b() {
        lv1 lv1;
        lv1 lv12;
        lv1 lv13;
        hy7 hy7 = hy7.a;
        hy7 hy72 = hy7.c;
        hy7 hy73 = hy7.o;
        hy7 hy74 = hy7.X;
        boolean z = true;
        hy7 hy75 = hy7.b;
        f01 f01 = this.b;
        switch (this.a) {
            case 0:
                f01.w(f01);
                return;
            case 1:
                hy7 hy76 = f01.S0;
                if (hy76 != null && (lv1 = f01.R0) != null) {
                    int ordinal = hy76.ordinal();
                    if (ordinal == 0) {
                        hy7 = hy75;
                    } else if (ordinal != 1) {
                        if (ordinal == 2) {
                            hy7 = hy72;
                        } else if (ordinal == 3) {
                            hy7 = hy73;
                        } else if (ordinal == 4) {
                            hy7 = hy74;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k77[] k77Arr = CallBottomPanelWidget.w0;
                    ((CallBottomPanelWidget) lv1.b).m0().s(hy7);
                    return;
                }
                return;
            case 2:
                hy7 hy77 = f01.U0;
                if (hy77 != null && (lv12 = f01.R0) != null) {
                    int ordinal2 = hy77.ordinal();
                    if (ordinal2 == 0) {
                        hy7 = hy75;
                    } else if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            hy7 = hy72;
                        } else if (ordinal2 == 3) {
                            hy7 = hy73;
                        } else if (ordinal2 == 4) {
                            hy7 = hy74;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k77[] k77Arr2 = CallBottomPanelWidget.w0;
                    ((CallBottomPanelWidget) lv12.b).m0().u(hy7);
                    return;
                }
                return;
            case 3:
                hy7 hy78 = f01.T0;
                if (hy78 != null && (lv13 = f01.R0) != null) {
                    int ordinal3 = hy78.ordinal();
                    if (ordinal3 == 0) {
                        hy7 = hy75;
                    } else if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            hy7 = hy72;
                        } else if (ordinal3 == 3) {
                            hy7 = hy73;
                        } else if (ordinal3 == 4) {
                            hy7 = hy74;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k77[] k77Arr3 = CallBottomPanelWidget.w0;
                    u01 m0 = ((CallBottomPanelWidget) lv13.b).m0();
                    m0.getClass();
                    if (hy7 != hy75) {
                        z = false;
                    }
                    iq1 iq1 = (iq1) m0.Y.getValue();
                    iq1.getClass();
                    iq1.c(iq1, "HAND_RAISED", (String) null, (String) null, Integer.valueOf(z ? 1 : 0), (String) null, (String) null, false, 118);
                    py0 py0 = (py0) m0.r().l;
                    ParticipantStatesManager f = py0.f();
                    if (f != null) {
                        f.setOwnHandRaised(z);
                    }
                    py0.x0.set(z);
                    return;
                }
                return;
            default:
                lv1 lv14 = f01.R0;
                if (lv14 != null) {
                    lv14.t();
                    return;
                }
                return;
        }
    }
}
