package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: vi0  reason: default package */
public final class vi0 extends k55 {
    public final xi0 q;
    public final Rect r = new Rect();

    public vi0(pjd pjd) {
        super(pjd);
        this.q = pjd;
    }

    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            xi0 xi0 = this.q;
            if (i >= xi0.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            xi0.u(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final boolean s(int i, int i2, Bundle bundle) {
        xi0 xi0 = this.q;
        if (!xi0.isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            float f = xi0.n1;
            if (f == 0.0f) {
                f = 1.0f;
            }
            float f2 = (xi0.j1 - xi0.i1) / f;
            float f3 = (float) 20;
            if (f2 > f3) {
                f *= (float) Math.round(f2 / f3);
            }
            if (i2 == 8192) {
                f = -f;
            }
            if (xi0.k()) {
                f = -f;
            }
            if (!xi0.s(i, xy6.i(xi0.getValues().get(i).floatValue() + f, xi0.getValueFrom(), xi0.getValueTo()))) {
                return false;
            }
            xi0.v();
            xi0.postInvalidate();
            p(i);
            return true;
        } else if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !xi0.s(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
            return false;
        } else {
            xi0.v();
            xi0.postInvalidate();
            p(i);
            return true;
        }
    }

    public final void u(int i, l4 l4Var) {
        l4Var.b(g4.m);
        xi0 xi0 = this.q;
        List<Float> values = xi0.getValues();
        Float f = values.get(i);
        float floatValue = f.floatValue();
        float valueFrom = xi0.getValueFrom();
        float valueTo = xi0.getValueTo();
        if (xi0.isEnabled()) {
            if (floatValue > valueFrom) {
                l4Var.a(8192);
            }
            if (floatValue < valueTo) {
                l4Var.a(4096);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityNodeInfo.setRangeInfo(obtain);
        l4Var.h(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (xi0.getContentDescription() != null) {
            sb.append(xi0.getContentDescription());
            sb.append(",");
        }
        String format = String.format(((float) ((int) floatValue)) == floatValue ? "%.0f" : "%.2f", new Object[]{f});
        String string = xi0.getContext().getString(wsb.material_slider_value);
        if (values.size() > 1) {
            string = i == xi0.getValues().size() - 1 ? xi0.getContext().getString(wsb.material_slider_range_end) : i == 0 ? xi0.getContext().getString(wsb.material_slider_range_start) : BuildConfig.FLAVOR;
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + format);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        xi0.u(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
