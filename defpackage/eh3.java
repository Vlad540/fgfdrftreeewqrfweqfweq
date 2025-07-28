package defpackage;

import android.view.View;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: eh3  reason: default package */
public final /* synthetic */ class eh3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh3 b;

    public /* synthetic */ eh3(fh3 fh3, int i) {
        this.a = i;
        this.b = fh3;
    }

    public final void onClick(View view) {
        fh3 fh3 = this.b;
        switch (this.a) {
            case 0:
                mod mod = fh3.T0;
                if (mod != null) {
                    long j = fh3.V0;
                    kk9 kk9 = CallHistoryPageScreen.y0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) mod.b;
                    if (((c71) callHistoryPageScreen.n0().w0.getValue()).a) {
                        wg6 q = callHistoryPageScreen.o0().q(j);
                        if (q != null) {
                            callHistoryPageScreen.n0().q(j, q);
                            return;
                        }
                        return;
                    }
                    wg6 q2 = callHistoryPageScreen.o0().q(j);
                    if (q2 != null) {
                        if (q2 instanceof ug6) {
                            ug6 ug6 = (ug6) q2;
                            j61.c.a2(ug6.b, ((Number) o23.V(ug6.c)).longValue());
                            return;
                        } else if (!((Boolean) callHistoryPageScreen.n0().Y.getValue()).booleanValue()) {
                            hge hge = new hge(j1a.p);
                            hba hba = new hba(callHistoryPageScreen);
                            hba.h(hge);
                            hba.j();
                            return;
                        } else if (q2 instanceof sg6) {
                            sg6 sg6 = (sg6) q2;
                            j61.c.a2(sg6.b, ((Number) o23.V(sg6.d)).longValue());
                            return;
                        } else if (q2 instanceof tg6) {
                            tg6 tg6 = (tg6) q2;
                            j61.c.Z1(Long.valueOf(tg6.b), tg6.a, tg6.c);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                mod mod2 = fh3.T0;
                if (mod2 != null) {
                    mod2.O(fh3.V0, false);
                    return;
                }
                return;
            default:
                mod mod3 = fh3.T0;
                if (mod3 != null) {
                    mod3.O(fh3.V0, true);
                    return;
                }
                return;
        }
    }
}
