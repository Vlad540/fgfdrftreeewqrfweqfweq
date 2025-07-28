package defpackage;

import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: x61  reason: default package */
public final /* synthetic */ class x61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ x61(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    public final void onClick(View view) {
        CallHistoryScreen callHistoryScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallHistoryScreen.G0;
                e71 m0 = callHistoryScreen.m0();
                a01 a01 = new a01(10);
                we1 we1 = m0.o;
                we1.c();
                we1.j = true;
                qna e = we1.e();
                jrf jrf = we1.a;
                if (!e.a(false, jrf)) {
                    we1.l = a01;
                    we1.h = null;
                    we1.i = false;
                    return;
                } else if (!((ed3) we1.d.getValue()).f()) {
                    jrf.b();
                    return;
                } else {
                    a01.invoke();
                    return;
                }
            default:
                ((qna) callHistoryScreen.b.getValue()).f(new jrf(callHistoryScreen, 0), qna.h, 160);
                return;
        }
    }
}
