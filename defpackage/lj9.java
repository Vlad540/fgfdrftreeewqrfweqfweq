package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: lj9  reason: default package */
public final class lj9 extends LinearLayout {
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            if (i < getChildCount()) {
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt != null) {
                    ((add) childAt).b.d();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void setTabs(int i) {
        removeAllViews();
        for (int i2 = 0; i2 < i; i2++) {
            add add = new add(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a24.X(((float) 86) * dh4.c().getDisplayMetrics().density), a24.X(((float) 40) * dh4.c().getDisplayMetrics().density));
            float f = (float) 4;
            marginLayoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
            marginLayoutParams.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
            add.setLayoutParams(marginLayoutParams);
            add.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 8.0f));
            add.setBackgroundColor(km4.y0.r(add).b().i);
            urd.B(new z9(3, (Continuation) null, 24), add);
            addView(add, i2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (i2 < getChildCount()) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        ((add) childAt).b.c();
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        } else {
            int i4 = 0;
            while (true) {
                if (i4 < getChildCount()) {
                    int i5 = i4 + 1;
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != null) {
                        ((add) childAt2).b.d();
                        i4 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }
}
