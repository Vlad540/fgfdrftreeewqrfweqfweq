package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: nx3  reason: default package */
public final class nx3 implements h9e {
    public final ViewPager2 a;
    public final boolean b;
    public final boolean c;

    public nx3(ViewPager2 viewPager2, boolean z, boolean z2) {
        this.a = viewPager2;
        this.b = z;
        this.c = z2;
    }

    public final void a(j9e j9e) {
        int[] b2;
        int i;
        boolean z = this.b;
        ViewPager2 viewPager2 = this.a;
        if (z) {
            int i2 = j9e.d;
            int currentItem = viewPager2.getCurrentItem() - i2;
            if (Math.abs(currentItem) > 1) {
                int abs = (Math.abs(currentItem) - 1) * Integer.signum(currentItem) * viewPager2.getWidth();
                c85 c85 = viewPager2.F0;
                dpc dpc = c85.b;
                if (!(dpc.f == 1)) {
                    c85.g = 0;
                    c85.f = (float) 0;
                    c85.h = SystemClock.uptimeMillis();
                    VelocityTracker velocityTracker = c85.d;
                    if (velocityTracker == null) {
                        c85.d = VelocityTracker.obtain();
                        c85.e = ViewConfiguration.get(c85.a.getContext()).getScaledMaximumFlingVelocity();
                    } else {
                        velocityTracker.clear();
                    }
                    dpc.e = 4;
                    dpc.f(true);
                    if (dpc.f != 0) {
                        c85.c.E0();
                    }
                    long j = c85.h;
                    MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                    c85.d.addMovement(obtain);
                    obtain.recycle();
                }
                float f = (float) abs;
                c85 c852 = viewPager2.F0;
                if (c852.b.m) {
                    float f2 = c852.f - f;
                    c852.f = f2;
                    int round = Math.round(f2 - ((float) c852.g));
                    c852.g += round;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z2 = c852.a.getOrientation() == 0;
                    int i3 = z2 ? round : 0;
                    if (z2) {
                        round = 0;
                    }
                    float f3 = z2 ? c852.f : 0.0f;
                    float f4 = z2 ? 0.0f : c852.f;
                    c852.c.scrollBy(i3, round);
                    MotionEvent obtain2 = MotionEvent.obtain(c852.h, uptimeMillis, 2, f3, f4, 0);
                    c852.d.addMovement(obtain2);
                    obtain2.recycle();
                }
                c85 c853 = viewPager2.F0;
                dpc dpc2 = c853.b;
                boolean z3 = dpc2.m;
                if (z3) {
                    if (!(dpc2.f == 1) || z3) {
                        dpc2.m = false;
                        dpc2.g();
                        cpc cpc = dpc2.g;
                        if (cpc.c == 0) {
                            int i4 = cpc.b;
                            if (i4 != dpc2.h) {
                                dpc2.c(i4);
                            }
                            dpc2.d(0);
                            dpc2.e();
                        } else {
                            dpc2.d(2);
                        }
                    }
                    VelocityTracker velocityTracker2 = c853.d;
                    velocityTracker2.computeCurrentVelocity(1000, (float) c853.e);
                    if (!c853.c.O((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                        ViewPager2 viewPager22 = c853.a;
                        View i5 = viewPager22.C0.i(viewPager22.y0);
                        if (!(i5 == null || ((i = b2[0]) == 0 && b2[1] == 0))) {
                            viewPager22.B0.A0(i, (b2 = viewPager22.C0.b(viewPager22.y0, i5))[1], false);
                        }
                    }
                }
            }
            viewPager2.e(i2, true);
            return;
        }
        viewPager2.e(j9e.d, this.c);
    }
}
