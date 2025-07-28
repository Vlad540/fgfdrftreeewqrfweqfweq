package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
    public final int A0;
    public boolean a;
    public View b;
    public View c;
    public Drawable o;
    public Drawable w0;
    public Drawable x0;
    public final boolean y0;
    public boolean z0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new k6(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nwb.ActionBar);
        this.o = obtainStyledAttributes.getDrawable(nwb.ActionBar_background);
        this.w0 = obtainStyledAttributes.getDrawable(nwb.ActionBar_backgroundStacked);
        this.A0 = obtainStyledAttributes.getDimensionPixelSize(nwb.ActionBar_height, -1);
        boolean z = true;
        if (getId() == pob.split_action_bar) {
            this.y0 = true;
            this.x0 = obtainStyledAttributes.getDrawable(nwb.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.y0 ? !(this.o == null && this.w0 == null) : this.x0 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            this.o.setState(getDrawableState());
        }
        Drawable drawable2 = this.w0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.w0.setState(getDrawableState());
        }
        Drawable drawable3 = this.x0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.x0.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.w0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.x0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(pob.action_bar);
        this.c = findViewById(pob.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.y0) {
            Drawable drawable = this.x0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.o == null) {
                z2 = false;
            } else if (this.b.getVisibility() == 0) {
                this.o.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            } else {
                View view = this.c;
                if (view == null || view.getVisibility() != 0) {
                    this.o.setBounds(0, 0, 0, 0);
                } else {
                    this.o.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                }
            }
            this.z0 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.A0) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.o);
        }
        this.o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.b;
            if (view != null) {
                this.o.setBounds(view.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        boolean z = false;
        if (!this.y0 ? this.o == null && this.w0 == null : this.x0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.x0;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.x0);
        }
        this.x0 = drawable;
        boolean z = this.y0;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.x0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? this.o == null && this.w0 == null : this.x0 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.w0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.w0);
        }
        this.w0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.z0 && this.w0 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.y0 ? this.o == null && this.w0 == null : this.x0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(npc npc) {
    }

    public void setTransitioning(boolean z) {
        this.a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.w0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.x0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.o;
        boolean z = this.y0;
        return (drawable == drawable2 && !z) || (drawable == this.w0 && this.z0) || ((drawable == this.x0 && z) || super.verifyDrawable(drawable));
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
