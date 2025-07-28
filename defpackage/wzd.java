package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: wzd  reason: default package */
public final class wzd extends CharacterStyle implements uu7, UpdateAppearance {
    public final /* synthetic */ int a;
    public final int b;

    public wzd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 4;
                return;
            default:
                this.b = 7;
                return;
        }
    }

    public final qt3 copy() {
        switch (this.a) {
            case 0:
                return new wzd(0);
            default:
                return new wzd(1);
        }
    }

    public final int getType() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setStrikeThruText(true);
                return;
            default:
                textPaint.setUnderlineText(true);
                return;
        }
    }
}
