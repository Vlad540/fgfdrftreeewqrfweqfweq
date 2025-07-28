package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: sn8  reason: default package */
public final class sn8 extends ViewGroup {
    public final t97 A0;
    public long B0;
    public final RectF C0;
    public u16 D0;
    public boolean a;
    public final int b = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
    public final int c;
    public final int o;
    public final int w0;
    public final int x0;
    public View y0;
    public View z0;

    public sn8(Context context) {
        super(context);
        float f = (float) 6;
        this.c = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.o = a24.X(f * dh4.c().getDisplayMetrics().density);
        this.w0 = a24.X(((float) 38) * dh4.c().getDisplayMetrics().density);
        this.x0 = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        this.A0 = xv8.a.getAccessor().d(jr0.class);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.C0 = new RectF();
    }

    private final jr0 getBubbleUiOptions() {
        return (jr0) this.A0.getValue();
    }

    public final int a(int i, rn8 rn8) {
        if (this.a) {
            i -= this.w0;
        }
        int marginStart = rn8.getMarginStart();
        int paddingEnd = getPaddingEnd();
        return i - (rn8.getMarginEnd() + (paddingEnd + (getPaddingStart() + marginStart)));
    }

    public final long getAvatarId() {
        return this.B0;
    }

    public final View getContentView$message_list_release() {
        return this.y0;
    }

    public final int getContentViewTopMargin() {
        View view = this.y0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final int getMaxAvailableWidth$message_list_release() {
        View view = this.z0;
        View view2 = this.y0;
        if (view != null && view.getVisibility() == 0) {
            return a(getMeasuredWidth(), (rn8) view.getLayoutParams());
        } else if (view2 == null) {
            return getMeasuredWidth();
        } else {
            return a(getMeasuredWidth(), (rn8) view2.getLayoutParams());
        }
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final u16 getOnAvatarClickListener$message_list_release() {
        return this.D0;
    }

    public final View getOutsideBubbleView$message_list_release() {
        return this.z0;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.y0;
        if (view != null) {
            int paddingStart = getPaddingStart();
            rn8 rn8 = (rn8) view.getLayoutParams();
            if (rn8.a) {
                if (this.a) {
                    paddingStart += this.b + this.o;
                }
                i5 = rn8.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                i5 = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i6 = rn8.topMargin;
            n1g.D(view, i5, i6, 0, 12);
            View view2 = this.z0;
            if (view2 != null && view2.getVisibility() == 0) {
                n1g.D(view2, i5, view.getMeasuredHeight() + i6 + this.x0, 0, 12);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.a) {
            int i5 = this.b;
            i3 = this.c;
            i4 = i5 + i3;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        View view = this.y0;
        if (view != null) {
            View view2 = this.z0;
            int i6 = (view2 == null || view2.getVisibility() != 0) ? Integer.MIN_VALUE : 1073741824;
            rn8 rn8 = (rn8) view.getLayoutParams();
            int a2 = a(defaultSize, rn8);
            int intValue = ((Number) ((p0a) getBubbleUiOptions()).d.getValue()).intValue();
            if (intValue <= a2) {
                a2 = intValue;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(a2, i6), i2);
            i4 = Math.max(i4 + i3, view.getMeasuredHeight() + rn8.topMargin + rn8.bottomMargin);
            if (view2 != null && view2.getVisibility() == 0) {
                rn8 rn82 = (rn8) view2.getLayoutParams();
                int a3 = a(defaultSize, rn82);
                int intValue2 = ((Number) ((p0a) getBubbleUiOptions()).d.getValue()).intValue();
                if (intValue2 <= a3) {
                    a3 = intValue2;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(a3, 1073741824), i2);
                i4 = view2.getMeasuredHeight() + this.x0 + rn82.topMargin + rn82.bottomMargin + i4;
            }
        }
        setMeasuredDimension(defaultSize, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u16 u16;
        RectF rectF = this.C0;
        if (rectF.isEmpty() || this.B0 <= 0 || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (u16 = this.D0) != null) {
            u16.invoke(Long.valueOf(this.B0));
        }
        return true;
    }

    public final void setAvatarId(long j) {
        this.B0 = j;
    }

    public final void setListener(qn8 qn8) {
    }

    public final void setOffsetBubbleByAvatar(boolean z) {
        this.a = z;
    }

    public final void setOnAvatarClickListener$message_list_release(u16 u16) {
        this.D0 = u16;
    }
}
