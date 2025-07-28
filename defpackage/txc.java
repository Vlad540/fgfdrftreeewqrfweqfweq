package defpackage;

import android.text.Layout;

/* renamed from: txc  reason: default package */
public final class txc extends ibe implements vxc {
    public txc() {
        super((u16) new u1c(5));
    }

    public final int h0() {
        if (!ek8.L((t97) this.c)) {
            return 0;
        }
        return me4.c((float) 4, dh4.c().getDisplayMetrics().density, L());
    }

    public final void setAlias(Layout layout) {
        if (layout == null) {
            t97 t97 = (t97) this.c;
            if (t97.a()) {
                ((uxc) t97.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ((uxc) Q()).setLayout(layout);
        Q().setVisibility(0);
        u();
    }

    public final void setAliasColor(int i) {
        t97 t97 = (t97) this.c;
        if (t97.a()) {
            ((uxc) t97.getValue()).setTextColor(i);
        }
    }
}
