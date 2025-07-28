package defpackage;

import android.view.View;

/* renamed from: ue9  reason: default package */
public final /* synthetic */ class ue9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze9 b;

    public /* synthetic */ ue9(ze9 ze9, int i) {
        this.a = i;
        this.b = ze9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.o(new ai0(29));
                return;
            default:
                this.b.o(new xe9(5));
                return;
        }
    }
}
