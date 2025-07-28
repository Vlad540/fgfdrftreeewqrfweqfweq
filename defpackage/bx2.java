package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: bx2  reason: default package */
public final class bx2 extends hwf {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bx2(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    private final void A(int i) {
    }

    public final void p(int i) {
        switch (this.d) {
            case 0:
                return;
            default:
                ife ife = (ife) this.e;
                ife.e = true;
                hfe hfe = (hfe) ife.f.get();
                if (hfe != null) {
                    hfe.a();
                    return;
                }
                return;
        }
    }

    public final void q(Typeface typeface, boolean z) {
        switch (this.d) {
            case 0:
                Chip chip = (Chip) this.e;
                ex2 ex2 = chip.w0;
                chip.setText(ex2.T1 ? ex2.U0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    ife ife = (ife) this.e;
                    ife.e = true;
                    hfe hfe = (hfe) ife.f.get();
                    if (hfe != null) {
                        hfe.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
