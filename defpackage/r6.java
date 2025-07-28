package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: r6  reason: default package */
public final class r6 extends w9b {
    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, n7d] */
    public r6(Context context) {
        super(new n7d(context, (AttributeSet) null));
    }

    public final void A(pg7 pg7) {
        ((n7d) this.a).setModelItem(((b7) pg7).b);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, n7d] */
    public final void D() {
        View view = this.a;
        ((n7d) view).setOnClickListener((View.OnClickListener) null);
        ((n7d) view).setOnSwitchListener((k7d) null);
    }
}
