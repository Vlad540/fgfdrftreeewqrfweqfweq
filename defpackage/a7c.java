package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: a7c  reason: default package */
public final class a7c implements Runnable {
    public boolean X = false;
    public boolean Y = false;
    public final /* synthetic */ RecyclerView Z;
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator o;

    public a7c(RecyclerView recyclerView) {
        this.Z = recyclerView;
        l27 l27 = RecyclerView.X1;
        this.o = l27;
        this.c = new OverScroller(recyclerView.getContext(), l27);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.Z;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.o;
        l27 l27 = RecyclerView.X1;
        if (interpolator != l27) {
            this.o = l27;
            this.c = new OverScroller(recyclerView.getContext(), l27);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.X) {
            this.Y = true;
            return;
        }
        RecyclerView recyclerView = this.Z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = eaf.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.Z;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.X1;
        }
        if (this.o != interpolator) {
            this.o = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.Z;
        if (recyclerView.F0 == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.Y = false;
        this.X = true;
        recyclerView.s();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int r = RecyclerView.r(currX - this.a, recyclerView.a1, recyclerView.c1, recyclerView.getWidth());
            int r2 = RecyclerView.r(i5, recyclerView.b1, recyclerView.d1, recyclerView.getHeight());
            int[] iArr = recyclerView.I1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean y = recyclerView.y(r, r2, 1, iArr, (int[]) null);
            int[] iArr2 = recyclerView.I1;
            if (y) {
                r -= iArr2[0];
                r2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.q(r, r2);
            }
            if (recyclerView.E0 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.w0(r, r2, iArr2);
                int i6 = iArr2[0];
                int i7 = iArr2[1];
                int i8 = r - i6;
                int i9 = r2 - i7;
                hd7 hd7 = recyclerView.F0.e;
                if (hd7 != null && !hd7.d && hd7.e) {
                    int b2 = recyclerView.w1.b();
                    if (b2 == 0) {
                        hd7.k();
                    } else if (hd7.a >= b2) {
                        hd7.a = b2 - 1;
                        hd7.i(i6, i7);
                    } else {
                        hd7.i(i6, i7);
                    }
                }
                i3 = i6;
                i2 = i8;
                i = i9;
                i4 = i7;
            } else {
                i2 = r;
                i = r2;
                i4 = 0;
                i3 = 0;
            }
            if (!recyclerView.H0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.I1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i10 = i4;
            recyclerView.z(i3, i4, i2, i, (int[]) null, 1, iArr3);
            int i11 = i2 - iArr2[0];
            int i12 = i - iArr2[1];
            if (!(i3 == 0 && i10 == 0)) {
                recyclerView.A(i3, i10);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            hd7 hd72 = recyclerView.F0.e;
            if ((hd72 == null || !hd72.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.C();
                        if (recyclerView.a1.isFinished()) {
                            recyclerView.a1.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.D();
                        if (recyclerView.c1.isFinished()) {
                            recyclerView.c1.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.E();
                        if (recyclerView.b1.isFinished()) {
                            recyclerView.b1.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.B();
                        if (recyclerView.d1.isFinished()) {
                            recyclerView.d1.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i13 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = eaf.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.V1) {
                    ry2 ry2 = recyclerView.v1;
                    int[] iArr4 = ry2.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    ry2.d = 0;
                }
            } else {
                b();
                p66 p66 = recyclerView.u1;
                if (p66 != null) {
                    p66.a(recyclerView, i3, i10);
                }
            }
        }
        hd7 hd73 = recyclerView.F0.e;
        if (hd73 != null && hd73.d) {
            hd73.i(0, 0);
        }
        this.X = false;
        if (this.Y) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = eaf.a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.a(1);
    }
}
