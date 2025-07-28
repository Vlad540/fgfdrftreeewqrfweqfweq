package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.BitSet;

/* renamed from: q7d  reason: default package */
public final class q7d extends chd {
    public f7d J0;

    public final void A(pg7 pg7) {
        ((n7d) this.a).setModelItem((e7d) pg7);
    }

    public final void D() {
        this.J0 = null;
    }

    /* renamed from: F */
    public final void B(e7d e7d, Object obj) {
        c7d c7d = obj instanceof c7d ? (c7d) obj : null;
        View view = this.a;
        if (c7d != null) {
            BitSet bitSet = (BitSet) c7d.b;
            bitSet.get(0);
            if (bitSet.get(1)) {
                ((n7d) view).setTitle(e7d.getTitle());
            }
            if (bitSet.get(2)) {
                ((n7d) view).setType(e7d.getType());
            }
            if (bitSet.get(3)) {
                ((n7d) view).setDescription(e7d.c());
            }
            if (bitSet.get(4)) {
                Integer b = e7d.b();
                if (b != null) {
                    ((n7d) view).setStartIcon(b.intValue());
                } else {
                    ((n7d) view).setStartIcon((Drawable) null);
                }
            }
            if (bitSet.get(5)) {
                n7d n7d = (n7d) view;
                n7d.setOnSwitchListener((k7d) null);
                n7d.setEndView(e7d.f());
                if (e7d.f() instanceof z6d) {
                    n7d.setOnSwitchCheckedListener(new bk(14, this));
                }
            }
            if (bitSet.get(6)) {
                ((n7d) view).setCounter(e7d.d());
            }
            if (bitSet.get(7)) {
                ((n7d) view).setUpperText(e7d.e());
            }
            if (bitSet.get(8)) {
                ((n7d) view).setStartIconPadding(e7d.q());
                return;
            }
            return;
        }
        ((n7d) view).setModelItem(e7d);
    }
}
