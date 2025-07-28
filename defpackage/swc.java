package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: swc  reason: default package */
public final /* synthetic */ class swc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ twc b;

    public /* synthetic */ swc(twc twc, int i) {
        this.a = i;
        this.b = twc;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                twc twc = this.b;
                qwc qwc = twc.M0;
                if (qwc != null) {
                    i08 i08 = twc.J0;
                    i08.x0.n(new bz7(qwc, ((List) i08.B0.getValue()).indexOf(qwc)));
                    return;
                }
                return;
            default:
                twc twc2 = this.b;
                qwc qwc2 = twc2.M0;
                if (qwc2 != null) {
                    twc2.J0.x0.n(new xy7(qwc2));
                    return;
                }
                return;
        }
    }
}
