package defpackage;

import android.view.View;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* renamed from: bb1  reason: default package */
public final /* synthetic */ class bb1 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CallLinkInfoScreen b;
    public final /* synthetic */ za1 c;

    public /* synthetic */ bb1(za1 za1, CallLinkInfoScreen callLinkInfoScreen) {
        this.c = za1;
        this.b = callLinkInfoScreen;
    }

    public final void onClick(View view) {
        za1 za1 = this.c;
        fq1 fq1 = fq1.a;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallLinkInfoScreen.F0;
                ya1 ya1 = za1.d;
                if (ya1 instanceof va1) {
                    callLinkInfoScreen.m0().q((long) i1a.b);
                    return;
                } else if (ya1 instanceof xa1) {
                    callLinkInfoScreen.l0().e(fq1, false);
                    callLinkInfoScreen.m0().q((long) i1a.e);
                    return;
                } else {
                    return;
                }
            default:
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                callLinkInfoScreen.l0().e(fq1, false);
                callLinkInfoScreen.m0().q(za1.h.getItemId());
                return;
        }
    }

    public /* synthetic */ bb1(CallLinkInfoScreen callLinkInfoScreen, za1 za1) {
        this.b = callLinkInfoScreen;
        this.c = za1;
    }
}
