package defpackage;

import android.view.View;

/* renamed from: bw6  reason: default package */
public final /* synthetic */ class bw6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw6 b;

    public /* synthetic */ bw6(cw6 cw6, int i) {
        this.a = i;
        this.b = cw6;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.F0.g(es3.a);
                return;
            default:
                this.b.F0.g(fs3.a);
                return;
        }
    }
}
