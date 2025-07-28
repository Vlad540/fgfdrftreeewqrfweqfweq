package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: s85  reason: default package */
public final class s85 extends l6c implements q6c {
    public static final int[] R0 = {16842919};
    public static final int[] S0 = new int[0];
    public int A0;
    public float B0;
    public int C0;
    public int D0;
    public float E0;
    public int F0 = 0;
    public int G0 = 0;
    public final RecyclerView H0;
    public boolean I0 = false;
    public boolean J0 = false;
    public int K0 = 0;
    public int L0 = 0;
    public final int[] M0 = new int[2];
    public final int[] N0 = new int[2];
    public final ValueAnimator O0;
    public int P0;
    public final re Q0;
    public final int X;
    public final int Y;
    public final StateListDrawable Z;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable o;
    public final Drawable w0;
    public final int x0;
    public final int y0;
    public int z0;

    public s85(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.O0 = ofFloat;
        this.P0 = 0;
        re reVar = new re(20, this);
        this.Q0 = reVar;
        my4 my4 = new my4(1, this);
        this.c = stateListDrawable;
        this.o = drawable;
        this.Z = stateListDrawable2;
        this.w0 = drawable2;
        this.X = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.Y = Math.max(i, drawable.getIntrinsicWidth());
        this.x0 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.y0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new qs3(this));
        ofFloat.addUpdateListener(new ti0(4, this));
        RecyclerView recyclerView2 = this.H0;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.p0(this);
                this.H0.r0(this);
                this.H0.s0(my4);
                this.H0.removeCallbacks(reVar);
            }
            this.H0 = recyclerView;
            if (recyclerView != null) {
                recyclerView.j(this);
                this.H0.l(this);
                this.H0.m(my4);
            }
        }
    }

    public static int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.K0 != 0) {
            if (motionEvent.getAction() == 0) {
                boolean j = j(motionEvent.getX(), motionEvent.getY());
                boolean i = i(motionEvent.getX(), motionEvent.getY());
                if (j || i) {
                    if (i) {
                        this.L0 = 1;
                        this.E0 = (float) ((int) motionEvent.getX());
                    } else if (j) {
                        this.L0 = 2;
                        this.B0 = (float) ((int) motionEvent.getY());
                    }
                    l(2);
                }
            } else if (motionEvent.getAction() == 1 && this.K0 == 2) {
                this.B0 = 0.0f;
                this.E0 = 0.0f;
                l(1);
                this.L0 = 0;
            } else if (motionEvent.getAction() == 2 && this.K0 == 2) {
                m();
                int i2 = this.L0;
                int i3 = this.b;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.N0;
                    iArr[0] = i3;
                    int i4 = this.F0 - i3;
                    iArr[1] = i4;
                    float max = Math.max((float) i3, Math.min((float) i4, x));
                    if (Math.abs(((float) this.D0) - max) >= 2.0f) {
                        int k = k(this.E0, max, iArr, this.H0.computeHorizontalScrollRange(), this.H0.computeHorizontalScrollOffset(), this.F0);
                        if (k != 0) {
                            this.H0.scrollBy(k, 0);
                        }
                        this.E0 = max;
                    }
                }
                if (this.L0 == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.M0;
                    iArr2[0] = i3;
                    int i5 = this.G0 - i3;
                    iArr2[1] = i5;
                    float max2 = Math.max((float) i3, Math.min((float) i5, y));
                    if (Math.abs(((float) this.A0) - max2) >= 2.0f) {
                        int k2 = k(this.B0, max2, iArr2, this.H0.computeVerticalScrollRange(), this.H0.computeVerticalScrollOffset(), this.G0);
                        if (k2 != 0) {
                            this.H0.scrollBy(0, k2);
                        }
                        this.B0 = max2;
                    }
                }
            }
        }
    }

    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.K0;
        if (i == 1) {
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            boolean i2 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!j && !i2) {
                return false;
            }
            if (i2) {
                this.L0 = 1;
                this.E0 = (float) ((int) motionEvent.getX());
            } else if (j) {
                this.L0 = 2;
                this.B0 = (float) ((int) motionEvent.getY());
            }
            l(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void e(boolean z) {
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int i = this.F0;
        RecyclerView recyclerView2 = this.H0;
        if (i != recyclerView2.getWidth() || this.G0 != recyclerView2.getHeight()) {
            this.F0 = recyclerView2.getWidth();
            this.G0 = recyclerView2.getHeight();
            l(0);
        } else if (this.P0 != 0) {
            if (this.I0) {
                int i2 = this.F0;
                int i3 = this.X;
                int i4 = i2 - i3;
                int i5 = this.A0;
                int i6 = this.z0;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.G0;
                int i9 = this.Y;
                Drawable drawable = this.o;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = eaf.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i3, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i3), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.J0) {
                int i10 = this.G0;
                int i11 = this.x0;
                int i12 = i10 - i11;
                int i13 = this.D0;
                int i14 = this.C0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.Z;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.F0;
                int i17 = this.y0;
                Drawable drawable2 = this.w0;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, (float) i12);
                drawable2.draw(canvas);
                canvas.translate((float) i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i15), (float) (-i12));
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 >= ((float) (this.G0 - this.x0))) {
            int i = this.D0;
            int i2 = this.C0;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    public final boolean j(float f, float f2) {
        RecyclerView recyclerView = this.H0;
        WeakHashMap weakHashMap = eaf.a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.X;
        if (z) {
            if (f > ((float) i)) {
                return false;
            }
        } else if (f < ((float) (this.F0 - i))) {
            return false;
        }
        int i2 = this.A0;
        int i3 = this.z0 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void l(int i) {
        re reVar = this.Q0;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.K0 != 2) {
            stateListDrawable.setState(R0);
            this.H0.removeCallbacks(reVar);
        }
        if (i == 0) {
            this.H0.invalidate();
        } else {
            m();
        }
        if (this.K0 == 2 && i != 2) {
            stateListDrawable.setState(S0);
            this.H0.removeCallbacks(reVar);
            this.H0.postDelayed(reVar, (long) 1200);
        } else if (i == 1) {
            this.H0.removeCallbacks(reVar);
            this.H0.postDelayed(reVar, (long) 1500);
        }
        this.K0 = i;
    }

    public final void m() {
        int i = this.P0;
        ValueAnimator valueAnimator = this.O0;
        if (i != 0) {
            if (i == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.P0 = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
