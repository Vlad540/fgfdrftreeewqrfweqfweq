package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zxc  reason: default package */
public final class zxc {
    public final ViewGroup a;
    public final t97 b = ez3.O(3, new u5b(19, this));

    public zxc(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final int a() {
        return ((xxc) this.b.getValue()).getMeasuredHeight();
    }

    public final int b() {
        return ((xxc) this.b.getValue()).getMeasuredWidth();
    }

    public final void c(int i, int i2) {
        n1g.D((View) this.b.getValue(), i, i2, 0, 12);
    }

    public final void d(int i, int i2) {
        ((xxc) this.b.getValue()).measure(i, i2);
    }

    public final void e(Layout layout) {
        t97 t97 = this.b;
        if (layout != null) {
            xxc xxc = (xxc) t97.getValue();
            xxc.a = layout;
            TextPaint paint = layout.getPaint();
            if (paint != null) {
                paint.setColor(xxc.b);
            }
            xxc.requestLayout();
            xxc.invalidate();
            if (xxc.getParent() == null) {
                this.a.addView(xxc, new ViewGroup.LayoutParams(-2, -2));
            }
            xxc.setVisibility(0);
        } else if (t97.a()) {
            ((xxc) t97.getValue()).setVisibility(8);
        }
    }

    public final void f(int i) {
        TextPaint paint;
        t97 t97 = this.b;
        if (t97.a()) {
            xxc xxc = (xxc) t97.getValue();
            xxc.b = i;
            Layout layout = xxc.a;
            if (!(layout == null || (paint = layout.getPaint()) == null)) {
                paint.setColor(i);
            }
            xxc.invalidate();
        }
    }
}
