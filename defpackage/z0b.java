package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: z0b  reason: default package */
public final class z0b extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public t0b a;
    public x0b b = x0b.a;
    public boolean c = true;
    public boolean o;
    public ValueAnimator w0;
    public final iaf x0 = new iaf(getContext(), this, new y0b(this));
    public final t97 y0 = ez3.O(3, new r0b(this, 2));
    public int z0 = -1;

    public z0b(Context context) {
        super(context, (AttributeSet) null);
        a24.a0(this, new eu5(25, this));
    }

    public static void a(z0b z0b, float f) {
        z0b.setBackgroundAlpha(f);
    }

    public static void b(z0b z0b, float f) {
        z0b.setBackgroundAlpha(f);
    }

    public static void c(z0b z0b, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            z0b.setBackgroundAlpha(((float) 1) - f);
        }
    }

    public static void d(z0b z0b, i26 i26, float f, ValueAnimator valueAnimator) {
        t0b t0b = z0b.a;
        if (t0b != null) {
            t0b.f().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - t0b.f().getTop());
            z0b.getHalfExpandedViewHelper().a(t0b.f().getTop());
            t0b.m(t0b.f().getTop());
            i26.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(f));
        }
    }

    /* access modifiers changed from: private */
    public final q0b getHalfExpandedViewHelper() {
        return (q0b) this.y0.getValue();
    }

    /* access modifiers changed from: private */
    public final int getScrollStateOffset() {
        int ordinal = this.b.ordinal();
        Integer num = null;
        if (ordinal == 0) {
            t0b t0b = this.a;
            if (t0b != null) {
                num = Integer.valueOf(t0b.e());
            }
        } else if (ordinal == 1) {
            t0b t0b2 = this.a;
            if (t0b2 != null) {
                num = Integer.valueOf(t0b2.c());
            }
        } else if (ordinal == 2) {
            t0b t0b3 = this.a;
            if (t0b3 != null) {
                num = Integer.valueOf(t0b3.a());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getViewDragHeight() {
        View f;
        t0b t0b = this.a;
        if (t0b == null || (f = t0b.f()) == null) {
            return 0;
        }
        return f.getHeight();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [qga] */
    /* JADX WARNING: type inference failed for: r3v2, types: [qga] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void i(defpackage.z0b r1, int r2, defpackage.r0b r3, defpackage.r0b r4, i26 r5, int r6) {
        /*
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000b
            qga r3 = new qga
            r0 = 20
            r3.<init>(r0)
        L_0x000b:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0016
            qga r4 = new qga
            r6 = 20
            r4.<init>(r6)
        L_0x0016:
            r1.h(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0b.i(z0b, int, r0b, r0b, i26, int):void");
    }

    /* access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (gwf.i(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.x0.f()) {
            WeakHashMap weakHashMap = eaf.a;
            postInvalidateOnAnimation();
        }
    }

    public final t0b getCallback() {
        return this.a;
    }

    public final x0b getScrollState() {
        return this.b;
    }

    public final boolean getStackFromBottom() {
        return this.c;
    }

    public final void h(int i, s16 s16, s16 s162, i26 i26) {
        View f;
        ValueAnimator valueAnimator = this.w0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.w0;
        if (valueAnimator2 != null) {
            vx3.f(valueAnimator2);
        }
        t0b t0b = this.a;
        if (t0b != null && (f = t0b.f()) != null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{f.getTop(), i});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new jf(this, i26, animatedFraction, 1));
            ofInt.addListener(new sg(s162, this, s16, 1));
            ofInt.start();
            this.w0 = ofInt;
        }
    }

    public final void j(boolean z) {
        View f;
        this.b = x0b.a;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            t0b t0b = this.a;
            if (t0b != null) {
                t0b.i();
            }
            if (z) {
                i(this, scrollStateOffset, new r0b(this, 1), (r0b) null, new s0b(this, 1), 4);
            } else {
                t0b t0b2 = this.a;
                if (!(t0b2 == null || (f = t0b2.f()) == null)) {
                    f.offsetTopAndBottom(scrollStateOffset);
                }
                t0b t0b3 = this.a;
                if (t0b3 != null) {
                    t0b3.h();
                }
                setBackgroundAlpha(0.0f);
            }
        }
        invalidate();
    }

    public final void k() {
        this.b = x0b.c;
        if (getViewDragHeight() > 0) {
            i(this, getScrollStateOffset(), (r0b) null, new r0b(this, 0), new s0b(this, 0), 2);
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r0.n(r4.getX(), r4.getY()) == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 2
            if (r0 != r1) goto L_0x001b
            t0b r0 = r3.a
            if (r0 == 0) goto L_0x001b
            float r1 = r4.getX()
            float r2 = r4.getY()
            boolean r0 = r0.n(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            r3.o = r1
            iaf r3 = r3.x0     // Catch:{ all -> 0x0029 }
            boolean r3 = r3.o(r4)     // Catch:{ all -> 0x0029 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0030
        L_0x0029:
            r3 = move-exception
            kcc r4 = new kcc
            r4.<init>(r3)
            r3 = r4
        L_0x0030:
            java.lang.Throwable r4 = mcc.a(r3)
            if (r4 == 0) goto L_0x003d
            java.lang.String r0 = "PopupLayout"
            java.lang.String r1 = "onInterceptTouchEvent fail, issue ONEME-9645"
            udd.s(r0, r1, r4)
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r3 instanceof kcc
            if (r0 == 0) goto L_0x0044
            r3 = r4
        L_0x0044:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View f;
        t0b t0b = this.a;
        if (t0b != null && (f = t0b.f()) != null) {
            int scrollStateOffset = (this.w0 == null && this.x0.a == 0) ? getScrollStateOffset() : f.getTop();
            super.onLayout(z, i, i2, i3, i4);
            ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i5 = scrollStateOffset - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            f.offsetTopAndBottom(i5);
            q0b halfExpandedViewHelper = getHalfExpandedViewHelper();
            halfExpandedViewHelper.b = 0;
            halfExpandedViewHelper.a(i5);
            if (this.z0 != f.getMeasuredHeight()) {
                this.z0 = f.getMeasuredHeight();
                if (this.w0 != null) {
                    int ordinal = this.b.ordinal();
                    if (ordinal == 0) {
                        j(true);
                    } else if (ordinal == 1) {
                        setHalfScreen((i26) null);
                    } else if (ordinal == 2) {
                        k();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof w0b) {
            w0b w0b = (w0b) parcelable;
            super.onRestoreInstanceState(w0b.getSuperState());
            x0b x0b = (x0b) x0b.X.get(w0b.a);
            this.b = x0b;
            this.c = w0b.b;
            int ordinal = x0b.ordinal();
            if (ordinal == 0) {
                j(false);
            } else if (ordinal == 1) {
                setHalfScreen((i26) null);
            } else if (ordinal == 2) {
                k();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState() {
        return new w0b(super.onSaveInstanceState(), this.b.ordinal(), this.c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        iaf iaf = this.x0;
        if (iaf.r == null) {
            super.onTouchEvent(motionEvent);
        }
        this.o = true;
        try {
            iaf.i(motionEvent);
            bool = Boolean.TRUE;
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Throwable a2 = mcc.a(bool);
        if (a2 != null) {
            udd.s("PopupLayout", "onTouchEvent fail, issue ONEME-9645", a2);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        iaf iaf = this.x0;
        int i = iaf.a;
        if (i != 2 && i != 1) {
            iaf.a();
            if (iaf.a == 2) {
                OverScroller overScroller = iaf.p;
                overScroller.getCurrX();
                overScroller.getCurrY();
                overScroller.abortAnimation();
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                iaf.q.L(iaf.r, currX, currY);
            }
            iaf.m(0);
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.b == x0b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final void setCallback(t0b t0b) {
        this.a = t0b;
    }

    public final void setHalfScreen(s0b s0b) {
        this.b = x0b.b;
        if (getViewDragHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            if (s0b == null) {
                s0b = new s0b(this, 2);
            }
            h(scrollStateOffset, new qga(20), new r0b(this, 3), s0b);
        } else if (this.b == x0b.a) {
            setBackgroundAlpha(0.0f);
        } else {
            setBackgroundAlpha(1.0f);
        }
        invalidate();
    }

    public final void setScrollState(x0b x0b) {
        this.b = x0b;
    }

    public final void setStackFromBottom(boolean z) {
        this.c = z;
    }
}
