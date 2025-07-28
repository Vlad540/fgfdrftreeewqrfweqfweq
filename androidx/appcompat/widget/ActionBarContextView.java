package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends ViewGroup {
    public CharSequence A0;
    public CharSequence B0;
    public View C0;
    public View D0;
    public View E0;
    public LinearLayout F0;
    public TextView G0;
    public TextView H0;
    public final int I0;
    public final int J0;
    public boolean K0;
    public final int L0;
    public final w a;
    public final Context b;
    public ActionMenuView c;
    public i7 o;
    public int w0;
    public zbf x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r1v0, types: [w, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r1 = r7.getResourceId(r0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.ylb.actionModeStyle
            r5.<init>(r6, r7, r0)
            w r1 = new w
            r1.<init>()
            r1.c = r5
            r2 = 0
            r1.b = r2
            r5.a = r1
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            int r3 = defpackage.ylb.actionBarPopupTheme
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r1, r4)
            if (r2 == 0) goto L_0x0031
            int r2 = r1.resourceId
            if (r2 == 0) goto L_0x0031
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r1 = r1.resourceId
            r2.<init>(r6, r1)
            r5.b = r2
            goto L_0x0033
        L_0x0031:
            r5.b = r6
        L_0x0033:
            int[] r1 = defpackage.nwb.ActionMode
            r2 = 0
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1, r0, r2)
            int r0 = defpackage.nwb.ActionMode_background
            boolean r1 = r7.hasValue(r0)
            if (r1 == 0) goto L_0x004d
            int r1 = r7.getResourceId(r0, r2)
            if (r1 == 0) goto L_0x004d
            android.graphics.drawable.Drawable r6 = defpackage.am7.n(r6, r1)
            goto L_0x0051
        L_0x004d:
            android.graphics.drawable.Drawable r6 = r7.getDrawable(r0)
        L_0x0051:
            r5.setBackground(r6)
            int r6 = defpackage.nwb.ActionMode_titleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.I0 = r6
            int r6 = defpackage.nwb.ActionMode_subtitleTextStyle
            int r6 = r7.getResourceId(r6, r2)
            r5.J0 = r6
            int r6 = defpackage.nwb.ActionMode_height
            int r6 = r7.getLayoutDimension(r6, r2)
            r5.w0 = r6
            int r6 = defpackage.nwb.ActionMode_closeItemLayout
            int r0 = defpackage.asb.abc_action_mode_close_item_material
            int r6 = r7.getResourceId(r6, r0)
            r5.L0 = r6
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(n7 n7Var) {
        View view = this.C0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.L0, this, false);
            this.C0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.C0);
        }
        View findViewById = this.C0.findViewById(pob.action_mode_close_button);
        this.D0 = findViewById;
        findViewById.setOnClickListener(new jsc(1, n7Var));
        pl8 c2 = n7Var.c();
        i7 i7Var = this.o;
        if (i7Var != null) {
            i7Var.g();
            f7 f7Var = i7Var.I0;
            if (f7Var != null && f7Var.b()) {
                f7Var.j.dismiss();
            }
        }
        i7 i7Var2 = new i7(getContext());
        this.o = i7Var2;
        i7Var2.A0 = true;
        i7Var2.B0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.o, this.b);
        i7 i7Var3 = this.o;
        jm8 jm8 = i7Var3.w0;
        if (jm8 == null) {
            jm8 jm82 = (jm8) i7Var3.o.inflate(i7Var3.Y, this, false);
            i7Var3.w0 = jm82;
            jm82.b(i7Var3.c);
            i7Var3.i();
        }
        jm8 jm83 = i7Var3.w0;
        if (jm8 != jm83) {
            ((ActionMenuView) jm83).setPresenter(i7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jm83;
        this.c = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.F0 == null) {
            LayoutInflater.from(getContext()).inflate(asb.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.F0 = linearLayout;
            this.G0 = (TextView) linearLayout.findViewById(pob.action_bar_title);
            this.H0 = (TextView) this.F0.findViewById(pob.action_bar_subtitle);
            int i = this.I0;
            if (i != 0) {
                this.G0.setTextAppearance(getContext(), i);
            }
            int i2 = this.J0;
            if (i2 != 0) {
                this.H0.setTextAppearance(getContext(), i2);
            }
        }
        this.G0.setText(this.A0);
        this.H0.setText(this.B0);
        boolean z = !TextUtils.isEmpty(this.A0);
        boolean z2 = !TextUtils.isEmpty(this.B0);
        int i3 = 8;
        this.H0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.F0;
        if (z || z2) {
            i3 = 0;
        }
        linearLayout2.setVisibility(i3);
        if (this.F0.getParent() == null) {
            addView(this.F0);
        }
    }

    public final void e() {
        removeAllViews();
        this.E0 = null;
        this.c = null;
        this.o = null;
        View view = this.D0;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.x0 != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.w0;
    }

    public CharSequence getSubtitle() {
        return this.B0;
    }

    public CharSequence getTitle() {
        return this.A0;
    }

    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            zbf zbf = this.x0;
            if (zbf != null) {
                zbf.b();
            }
            super.setVisibility(i);
        }
    }

    public final zbf i(int i, long j) {
        zbf zbf = this.x0;
        if (zbf != null) {
            zbf.b();
        }
        w wVar = this.a;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            zbf a2 = eaf.a(this);
            a2.a(1.0f);
            a2.c(j);
            ((ActionBarContextView) wVar.c).x0 = a2;
            wVar.a = i;
            a2.d(wVar);
            return a2;
        }
        zbf a3 = eaf.a(this);
        a3.a(0.0f);
        a3.c(j);
        ((ActionBarContextView) wVar.c).x0 = a3;
        wVar.a = i;
        a3.d(wVar);
        return a3;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, nwb.ActionBar, ylb.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(nwb.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        i7 i7Var = this.o;
        if (i7Var != null) {
            Configuration configuration2 = i7Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            i7Var.E0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            pl8 pl8 = i7Var.c;
            if (pl8 != null) {
                pl8.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i7 i7Var = this.o;
        if (i7Var != null) {
            i7Var.g();
            f7 f7Var = this.o.I0;
            if (f7Var != null && f7Var.b()) {
                f7Var.j.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.z0 = false;
        }
        if (!this.z0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.z0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.z0 = false;
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.C0;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C0.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int g = g(i7, paddingTop, paddingTop2, this.C0, z2) + i7;
            paddingRight = z2 ? g - i6 : g + i6;
        }
        LinearLayout linearLayout = this.F0;
        if (!(linearLayout == null || this.E0 != null || linearLayout.getVisibility() == 8)) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.F0, z2);
        }
        View view2 = this.E0;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.w0;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.C0;
            if (view != null) {
                int f = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C0.getLayoutParams();
                paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.F0;
            if (linearLayout != null && this.E0 == null) {
                if (this.K0) {
                    this.F0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.F0.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.F0.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.E0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.E0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.w0 <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y0 = false;
        }
        if (!this.y0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.y0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.y0 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.w0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.E0;
        if (view2 != null) {
            removeView(view2);
        }
        this.E0 = view;
        if (!(view == null || (linearLayout = this.F0) == null)) {
            removeView(linearLayout);
            this.F0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.A0 = charSequence;
        d();
        eaf.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.K0) {
            requestLayout();
        }
        this.K0 = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
