package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: ife  reason: default package */
public final class ife {
    public final TextPaint a = new TextPaint(1);
    public final bx2 b = new bx2(1, this);
    public float c;
    public float d;
    public boolean e = true;
    public final WeakReference f = new WeakReference((Object) null);
    public afe g;

    public ife(hfe hfe) {
        this.f = new WeakReference(hfe);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        float f2 = 0.0f;
        this.c = str == null ? 0.0f : textPaint.measureText(str, 0, str.length());
        if (str != null) {
            f2 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f2;
        this.e = false;
    }

    public final void c(afe afe, Context context) {
        if (this.g != afe) {
            this.g = afe;
            if (afe != null) {
                TextPaint textPaint = this.a;
                bx2 bx2 = this.b;
                afe.f(context, textPaint, bx2);
                hfe hfe = (hfe) this.f.get();
                if (hfe != null) {
                    textPaint.drawableState = hfe.getState();
                }
                afe.e(context, textPaint, bx2);
                this.e = true;
            }
            hfe hfe2 = (hfe) this.f.get();
            if (hfe2 != null) {
                hfe2.a();
                hfe2.onStateChange(hfe2.getState());
            }
        }
    }
}
