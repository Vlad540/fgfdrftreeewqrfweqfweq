package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l23  reason: default package */
public final class l23 implements em {
    public final /* synthetic */ n23 a;

    public l23(n23 n23) {
        this.a = n23;
    }

    public final void U(fm fmVar, int i) {
        n23 n23 = this.a;
        n23.Q0 = i;
        nsf nsf = n23.S0;
        int d = nsf != null ? nsf.d() : 0;
        int childCount = n23.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = n23.getChildAt(i2);
            k23 k23 = (k23) childAt.getLayoutParams();
            gbf b = n23.b(childAt);
            int i3 = k23.a;
            if (i3 == 1) {
                b.b(xy6.j(-i, 0, ((n23.getHeight() - n23.b(childAt).b) - childAt.getHeight()) - ((k23) childAt.getLayoutParams()).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round(((float) (-i)) * k23.b));
            }
        }
        n23.d();
        if (n23.H0 != null && d > 0) {
            WeakHashMap weakHashMap = eaf.a;
            n23.postInvalidateOnAnimation();
        }
        int height = n23.getHeight();
        WeakHashMap weakHashMap2 = eaf.a;
        int minimumHeight = (height - n23.getMinimumHeight()) - d;
        float f = (float) minimumHeight;
        float min = Math.min(1.0f, ((float) (height - n23.getScrimVisibleHeightTrigger())) / f);
        j23 j23 = n23.C0;
        j23.d = min;
        j23.e = us8.g(1.0f, min, 0.5f, min);
        j23.f = n23.Q0 + minimumHeight;
        j23.p(((float) Math.abs(i)) / f);
    }
}
