package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class SlideOutLayout extends FrameLayout {
    public static final /* synthetic */ int G0 = 0;
    public boolean A0 = false;
    public boolean B0 = false;
    public ojd C0;
    public final ArrayList D0 = new ArrayList();
    public final int[] E0 = new int[2];
    public VelocityTracker F0;
    public final zg4 a;
    public int b = 0;
    public int c = 0;
    public float o = -1.0f;
    public float w0 = -1.0f;
    public float x0 = 0.0f;
    public float y0 = 0.0f;
    public final float z0;

    public SlideOutLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zvb.SlideOutLayout);
        this.b = obtainStyledAttributes.getInt(zvb.SlideOutLayout_chistyakov_orientation, 0);
        this.c = obtainStyledAttributes.getInt(zvb.SlideOutLayout_type, 0);
        xy6.c(this);
        if (xy6.w(this)) {
            if (this.c == 1 && xy6.w(this)) {
                this.c = 2;
            } else if (this.c == 2) {
                this.c = 1;
            }
        }
        obtainStyledAttributes.recycle();
        getContext();
        this.a = zg4.b();
        if (getBackground() != null) {
            getBackground().mutate();
            getBackground().setAlpha(255);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float max = (float) (Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2);
        this.z0 = max;
        if (max <= 0.0f) {
            this.z0 = (float) this.a.u;
        }
    }

    public final boolean a(View view) {
        float b2 = b(view);
        if (this.b != 0 || Math.abs(b2 / ((float) getMeasuredHeight())) <= 0.2f) {
            return this.b == 1 && Math.abs(b2 / ((float) getMeasuredWidth())) > 0.2f;
        }
        return true;
    }

    public final float b(View view) {
        return this.b == 0 ? view.getTranslationY() : view.getTranslationX();
    }

    public final void c(MotionEvent motionEvent) {
        float f;
        float x;
        float f2;
        float y;
        int i;
        int i2;
        if (this.w0 <= 0.0f || this.o <= 0.0f) {
            this.x0 = motionEvent.getY();
            this.y0 = motionEvent.getX();
        } else {
            if (this.b == 0) {
                f = this.x0;
                x = motionEvent.getY();
            } else {
                f = this.y0;
                x = motionEvent.getX();
            }
            float f3 = f - x;
            if (this.b == 0) {
                f2 = this.y0;
                y = motionEvent.getX();
            } else {
                f2 = this.x0;
                y = motionEvent.getY();
            }
            float abs = Math.abs(f2 - y);
            if (f3 > 0.0f && ((i2 = this.c) == 1 || i2 == 3)) {
                return;
            }
            if (f3 >= 0.0f || !((i = this.c) == 2 || i == 4)) {
                float abs2 = Math.abs(f3);
                if (abs2 > this.z0 && abs2 > abs * 2.0f) {
                    this.A0 = true;
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ojd ojd = this.C0;
                    if (ojd != null) {
                        ojd.Q();
                    }
                }
            } else {
                return;
            }
        }
        this.o = motionEvent.getY();
        this.w0 = motionEvent.getX();
    }

    public final void d(float f) {
        View childAt = getChildAt(0);
        long j = 150;
        long abs = f != 0.0f ? Math.abs((long) (b(childAt) / f)) : 150;
        if (abs <= 150) {
            j = abs;
        }
        if (this.b == 0) {
            childAt.animate().translationY(0.0f).setDuration(j).start();
        } else {
            childAt.animate().translationX(0.0f).setDuration(j).start();
        }
    }

    public final void e() {
        float translationX;
        int measuredWidth;
        if (getBackground() != null && getChildCount() > 0) {
            int i = 0;
            if (this.b == 0) {
                translationX = getChildAt(0).getTranslationY();
                measuredWidth = getMeasuredHeight();
            } else {
                translationX = getChildAt(0).getTranslationX();
                measuredWidth = getMeasuredWidth();
            }
            int abs = (int) ((1.0f - Math.abs(translationX / ((float) measuredWidth))) * 255.0f);
            if (abs > 255) {
                abs = 255;
            }
            if (abs >= 0) {
                i = abs;
            }
            getBackground().setAlpha(i);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            this.A0 = false;
            d(0.0f);
            return false;
        }
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null && view.getVisibility() == 0) {
                int[] iArr = this.E0;
                view.getLocationInWindow(iArr);
                if (motionEvent.getRawX() > ((float) iArr[0])) {
                    if (motionEvent.getRawX() < ((float) (view.getWidth() + iArr[0])) && motionEvent.getRawY() > ((float) iArr[1])) {
                        if (motionEvent.getRawY() < ((float) (view.getHeight() + iArr[1]))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if (motionEvent.getAction() == 2 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            c(motionEvent);
        } else {
            this.o = -1.0f;
            this.w0 = -1.0f;
        }
        return this.A0;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int measuredWidth;
        int measuredWidth2;
        float xVelocity;
        float f2 = 0.0f;
        if (motionEvent.getPointerCount() > 1) {
            this.A0 = false;
            d(0.0f);
            return false;
        }
        int i = 3;
        if (motionEvent.getAction() == 2 || motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            if (this.A0) {
                int i2 = this.b;
                float f3 = i2 == 0 ? this.o : this.w0;
                if (f3 > 0.0f) {
                    float y = f3 - (i2 == 0 ? motionEvent.getY() : motionEvent.getX());
                    if (getChildCount() > 0) {
                        View childAt = getChildAt(0);
                        if (this.b == 0) {
                            float translationY = childAt.getTranslationY() - y;
                            int i3 = this.c;
                            if (i3 == 3 && translationY < 0.0f) {
                                translationY = 0.0f;
                            }
                            if (i3 != 4 || translationY <= 0.0f) {
                                f2 = translationY;
                            }
                            childAt.setTranslationY(f2);
                        } else {
                            float translationX = childAt.getTranslationX() - y;
                            int i4 = this.c;
                            if (i4 == 1 && translationX < 0.0f) {
                                translationX = 0.0f;
                            }
                            if (i4 != 2 || translationX <= 0.0f) {
                                f2 = translationX;
                            }
                            childAt.setTranslationX(f2);
                        }
                        boolean a2 = a(childAt);
                        if (this.B0 != a2) {
                            if (this.C0 != null) {
                                b(childAt);
                            }
                            this.B0 = a2;
                        }
                        e();
                    }
                }
                this.o = motionEvent.getY();
                this.w0 = motionEvent.getX();
            } else {
                c(motionEvent);
            }
            if (this.F0 == null) {
                this.F0 = VelocityTracker.obtain();
            }
            this.F0.addMovement(motionEvent);
        } else {
            if (this.A0 && getChildCount() > 0) {
                View childAt2 = getChildAt(0);
                VelocityTracker velocityTracker = this.F0;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1);
                    if (this.b == 0) {
                        VelocityTracker velocityTracker2 = this.F0;
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        Map map = u0f.a;
                        xVelocity = velocityTracker2.getYVelocity(pointerId);
                    } else {
                        VelocityTracker velocityTracker3 = this.F0;
                        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        Map map2 = u0f.a;
                        xVelocity = velocityTracker3.getXVelocity(pointerId2);
                    }
                    f = (float) ((int) xVelocity);
                    this.F0.recycle();
                    this.F0 = null;
                } else {
                    f = 0.0f;
                }
                float b2 = b(childAt2);
                boolean a3 = a(childAt2);
                int i5 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if ((i5 == 0 || Math.signum(b2) == Math.signum(f)) && (Math.abs(f) >= 2.0f || a3)) {
                    if (this.b != 0) {
                        i = b2 > 0.0f ? 2 : 1;
                    } else if (b2 > 0.0f) {
                        i = 4;
                    }
                    ojd ojd = this.C0;
                    if (ojd == null || ojd.D()) {
                        View childAt3 = getChildAt(0);
                        if (this.b == 0) {
                            measuredWidth = childAt3.getMeasuredHeight();
                            measuredWidth2 = (getMeasuredHeight() - childAt3.getMeasuredHeight()) / 2;
                        } else {
                            measuredWidth = childAt3.getMeasuredWidth();
                            measuredWidth2 = (getMeasuredWidth() - childAt3.getMeasuredWidth()) / 2;
                        }
                        int i6 = measuredWidth2 + measuredWidth;
                        if (b(childAt3) < 0.0f) {
                            i6 = -i6;
                        }
                        long j = 150;
                        long abs = i5 != 0 ? Math.abs((long) (((float) i6) / f)) : 150;
                        if (abs <= 150) {
                            j = abs;
                        }
                        ViewPropertyAnimator listener = childAt3.animate().setDuration(j).setListener(new njd(this, i));
                        listener.setUpdateListener(new c00(18, this));
                        if (this.b == 0) {
                            listener.translationY((float) i6);
                        } else {
                            listener.translationX((float) i6);
                        }
                        listener.start();
                    } else {
                        this.C0.N(i);
                    }
                } else {
                    if (getBackground() != null) {
                        getBackground().setAlpha(255);
                    }
                    d(f);
                    ojd ojd2 = this.C0;
                    if (ojd2 != null) {
                        ojd2.p();
                    }
                }
                boolean a4 = a(childAt2);
                if (this.B0 != a4) {
                    if (this.C0 != null) {
                        b(childAt2);
                    }
                    this.B0 = a4;
                }
            }
            this.o = -1.0f;
            this.w0 = -1.0f;
            this.A0 = false;
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.w0 = -1.0f;
        this.o = -1.0f;
        this.A0 = false;
    }

    public void setOrientation(int i) {
        this.b = i;
    }

    public void setSlideOutListener(ojd ojd) {
        this.C0 = ojd;
    }

    public void setType(int i) {
        this.c = i;
    }
}
