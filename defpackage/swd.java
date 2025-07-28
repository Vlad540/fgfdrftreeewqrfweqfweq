package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: swd  reason: default package */
public final class swd extends chd implements ftc {
    public dtc J0;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, n7d] */
    public swd(Context context) {
        super(new n7d(context, (AttributeSet) null));
    }

    public final void A(pg7 pg7) {
        if (pg7 instanceof ctc) {
            this.J0 = (dtc) pg7;
            ((n7d) this.a).setModelItem(((ctc) pg7).a);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, n7d] */
    public final void d(u16 u16) {
        View view = this.a;
        if (u16 != null) {
            a24.a0(view, new p7d(this, 9, u16));
        } else {
            ((n7d) view).setOnClickListener((View.OnClickListener) null);
        }
    }
}
