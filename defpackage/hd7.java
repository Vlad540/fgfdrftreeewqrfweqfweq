package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: hd7  reason: default package */
public class hd7 {
    public int a = -1;
    public RecyclerView b;
    public a c;
    public boolean d;
    public boolean e;
    public View f;
    public final l34 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public hd7(Context context) {
        l34 l34 = new l34(2);
        l34.f = -1;
        l34.b = false;
        l34.c = 0;
        l34.d = 0;
        l34.e = Integer.MIN_VALUE;
        l34.g = null;
        this.g = l34;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i2) {
        a aVar = this.c;
        if (aVar == null || !aVar.e()) {
            return 0;
        }
        n6c n6c = (n6c) view.getLayoutParams();
        return a(a.B(view) - n6c.leftMargin, a.E(view) + n6c.rightMargin, aVar.J(), aVar.n - aVar.K(), i2);
    }

    public int c(View view, int i2) {
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            return 0;
        }
        n6c n6c = (n6c) view.getLayoutParams();
        return a(a.F(view) - n6c.topMargin, a.z(view) + n6c.bottomMargin, aVar.L(), aVar.o - aVar.I(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public final int e(int i2) {
        return (int) Math.ceil(((double) f(i2)) / 0.3356d);
    }

    public int f(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil((double) (abs * this.m));
    }

    public PointF g(int i2) {
        a aVar = this.c;
        if (aVar instanceof w6c) {
            return ((w6c) aVar).a(i2);
        }
        return null;
    }

    public int h() {
        PointF pointF = this.j;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public final void i(int i2, int i3) {
        PointF g2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            k();
        }
        if (this.d && this.f == null && this.c != null && (g2 = g(this.a)) != null) {
            float f2 = g2.x;
            if (!(f2 == 0.0f && g2.y == 0.0f)) {
                recyclerView.w0((int) Math.signum(f2), (int) Math.signum(g2.y), (int[]) null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        l34 l34 = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                x6c x6c = recyclerView.w1;
                j(view2, l34);
                l34.b(recyclerView);
                k();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            x6c x6c2 = recyclerView.w1;
            if (this.b.F0.w() == 0) {
                k();
            } else {
                int i4 = this.n;
                int i5 = i4 - i2;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.n = i5;
                int i6 = this.o;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.o = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF g3 = g(this.a);
                    if (g3 != null) {
                        float f3 = g3.x;
                        if (!(f3 == 0.0f && g3.y == 0.0f)) {
                            float f4 = g3.y;
                            float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                            float f5 = g3.x / sqrt;
                            g3.x = f5;
                            float f6 = g3.y / sqrt;
                            g3.y = f6;
                            this.j = g3;
                            this.n = (int) (f5 * 10000.0f);
                            this.o = (int) (f6 * 10000.0f);
                            l34.e((int) (((float) this.n) * 1.2f), (int) (((float) this.o) * 1.2f), (int) (((float) f(10000)) * 1.2f), this.h);
                        }
                    }
                    l34.f = this.a;
                    k();
                }
            }
            if (l34.f >= 0) {
                z = true;
            }
            l34.b(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.t1.b();
            }
        }
    }

    public void j(View view, l34 l34) {
        int i2;
        PointF pointF = this.j;
        int b2 = b(view, (pointF == null || pointF.x == 0.0f) ? 0 : i2 > 0 ? 1 : -1);
        int c2 = c(view, h());
        int e2 = e((int) Math.sqrt((double) ((c2 * c2) + (b2 * b2))));
        if (e2 > 0) {
            l34.e(-b2, -c2, e2, this.i);
        }
    }

    public final void k() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.w1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            a aVar = this.c;
            if (aVar.e == this) {
                aVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
