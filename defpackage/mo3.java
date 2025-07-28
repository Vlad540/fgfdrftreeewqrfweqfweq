package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: mo3  reason: default package */
public final class mo3 extends chd {
    /* JADX WARNING: type inference failed for: r2v0, types: [mo3, b7c] */
    /* renamed from: F */
    public final void A(lo3 lo3) {
        p4a p4a = this.a;
        lo3.getClass();
        p4a.setIcon(phc.J0);
        p4a.setTitle(new hge(q2a.r));
        p4a.setSubtitle(new hge(lo3.a));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [mo3, b7c] */
    public final void G(Integer num, s16 s16) {
        p4a p4a = this.a;
        if (num != null) {
            p4a p4a2 = p4a;
            p4a2.x(p4a2.getContext().getString(num.intValue()), new q6(7, s16));
            return;
        }
        OneMeButton oneMeButton = p4a.N0;
        oneMeButton.setText((CharSequence) null);
        oneMeButton.setOnClickListener((View.OnClickListener) null);
        oneMeButton.setVisibility(8);
    }
}
