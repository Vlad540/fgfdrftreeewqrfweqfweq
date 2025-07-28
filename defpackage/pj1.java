package defpackage;

import android.view.View;

/* renamed from: pj1  reason: default package */
public final /* synthetic */ class pj1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj1 b;

    public /* synthetic */ pj1(rj1 rj1, int i) {
        this.a = i;
        this.b = rj1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qj1 qj1 = this.b.K0;
                if (qj1 != null) {
                    qj1.h();
                    return;
                }
                return;
            case 1:
                qj1 qj12 = this.b.K0;
                if (qj12 != null) {
                    qj12.d();
                    return;
                }
                return;
            case 2:
                qj1 qj13 = this.b.K0;
                if (qj13 != null) {
                    qj13.c();
                    return;
                }
                return;
            default:
                qj1 qj14 = this.b.K0;
                if (qj14 != null) {
                    qj14.l();
                    return;
                }
                return;
        }
    }
}
