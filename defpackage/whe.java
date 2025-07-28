package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: whe  reason: default package */
public final class whe extends CharacterStyle implements UpdateAppearance, mhe {
    public final u16 a;
    public int b;

    public whe(pda pda, u16 u16) {
        this.a = u16;
        this.b = ((Number) u16.invoke(pda)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whe) && this.b == ((whe) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + whe.class.hashCode();
    }

    public final void onThemeChanged(pda pda) {
        this.b = ((Number) this.a.invoke(pda)).intValue();
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}
