package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.a;

/* renamed from: hw8  reason: default package */
public final class hw8 extends hd7 {
    public final boolean p;

    public hw8(int i, Context context, boolean z) {
        super(context);
        this.p = z;
        if (i >= 0) {
            this.a = i;
        }
    }

    public final void j(View view, l34 l34) {
        int i;
        int h = h();
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            i = 0;
        } else {
            n6c layoutParams = view.getLayoutParams();
            i = l(a.F(view) - layoutParams.topMargin, a.z(view) + layoutParams.bottomMargin, aVar.L(), aVar.o - aVar.I(), h);
        }
        int e = e(i);
        if (e > 0) {
            int i2 = -i;
            if (e > 300) {
                e = 300;
            }
            l34.e(0, i2, e, this.i);
        }
    }

    public final int l(int i, int i2, int i3, int i4, int i5) {
        int l;
        if (i5 != -1) {
            boolean z = this.p;
            if (i5 != 0) {
                if (i5 == 1) {
                    int i6 = i4 - i2;
                    return (i6 - (i2 - i) >= i3 || z) ? i6 : i3 - i;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            } else if (!z && (l = l(i, i2, i3, i4, -1)) > 0) {
                return l;
            } else {
                int l2 = l(i, i2, i3, i4, 1);
                if (l2 < 0) {
                    return l2;
                }
                return 0;
            }
        } else {
            return me4.c((float) 30, dh4.c().getDisplayMetrics().density, i3 - i);
        }
    }
}
