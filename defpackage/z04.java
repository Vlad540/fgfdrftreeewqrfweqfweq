package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: z04  reason: default package */
public final class z04 extends ig7 {
    public final long k(int i) {
        return ((v04) C(i)).a;
    }

    public final void r(b7c b7c, int i) {
        ((y04) b7c).J0.setText(((v04) C(i)).X);
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(qrb.day_item, viewGroup, false);
        inflate.setPivotX(0.0f);
        return new y04(inflate);
    }
}
