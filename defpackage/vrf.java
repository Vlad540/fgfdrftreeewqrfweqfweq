package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: vrf  reason: default package */
public final class vrf implements View.OnApplyWindowInsetsListener {
    public final u12 a;
    public nsf b;

    public vrf(View view, u12 u12) {
        nsf nsf;
        this.a = u12;
        WeakHashMap weakHashMap = eaf.a;
        nsf a2 = u9f.a(view);
        if (a2 != null) {
            nsf = (Build.VERSION.SDK_INT >= 30 ? new dsf(a2) : new csf(a2)).b();
        } else {
            nsf = null;
        }
        this.b = nsf;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        lsf lsf;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.b = nsf.f(view, windowInsets);
            return wrf.i(view, windowInsets);
        }
        nsf f = nsf.f(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = eaf.a;
            this.b = u9f.a(view);
        }
        if (this.b == null) {
            this.b = f;
            return wrf.i(view, windowInsets);
        }
        u12 j = wrf.j(view);
        if (j != null && Objects.equals((WindowInsets) j.b, windowInsets2)) {
            return wrf.i(view, windowInsets);
        }
        nsf nsf = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            lsf = f.a;
            if (i > 256) {
                break;
            }
            if (!lsf.f(i).equals(nsf.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return wrf.i(view, windowInsets);
        }
        nsf nsf2 = this.b;
        asf asf = new asf(i2, (i2 & 8) != 0 ? lsf.f(8).d > nsf2.a.f(8).d ? wrf.e : wrf.f : wrf.g, 160);
        asf.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(asf.a.a());
        qy6 f2 = lsf.f(i2);
        qy6 f3 = nsf2.a.f(i2);
        int min = Math.min(f2.a, f3.a);
        int i3 = f2.b;
        int i4 = f3.b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.c;
        int i6 = f3.c;
        int min3 = Math.min(i5, i6);
        ValueAnimator valueAnimator = duration;
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        s5c s5c = new s5c(qy6.b(min, min2, min3, Math.min(i7, i9)), qy6.b(Math.max(f2.a, f3.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), false, 11);
        wrf.f(view2, asf, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new urf(asf, f, nsf2, i8, view));
        valueAnimator2.addListener(new eh(asf, 6, view2));
        afa.a(view2, new kuf(6, view, asf, s5c, valueAnimator2, false));
        this.b = f;
        return wrf.i(view, windowInsets);
    }
}
