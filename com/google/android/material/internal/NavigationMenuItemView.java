package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

public class NavigationMenuItemView extends iu5 implements im8 {
    public static final int[] J0 = {16842912};
    public boolean A0;
    public final boolean B0 = true;
    public final CheckedTextView C0;
    public FrameLayout D0;
    public ul8 E0;
    public ColorStateList F0;
    public boolean G0;
    public Drawable H0;
    public final cq0 I0;
    public int y0;
    public boolean z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cq0 cq0 = new cq0(4, this);
        this.I0 = cq0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(wrb.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(vmb.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(lob.design_menu_item_text);
        this.C0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        eaf.j(checkedTextView, cq0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D0 == null) {
                this.D0 = (FrameLayout) ((ViewStub) findViewById(lob.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.D0.removeAllViews();
            this.D0.addView(view);
        }
    }

    public final void d(ul8 ul8) {
        StateListDrawable stateListDrawable;
        this.E0 = ul8;
        int i = ul8.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(ul8.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ylb.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(J0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = eaf.a;
            setBackground(stateListDrawable);
        }
        setCheckable(ul8.isCheckable());
        setChecked(ul8.isChecked());
        setEnabled(ul8.isEnabled());
        setTitle(ul8.X);
        setIcon(ul8.getIcon());
        setActionView(ul8.getActionView());
        setContentDescription(ul8.F0);
        dme.a(this, ul8.G0);
        ul8 ul82 = this.E0;
        CharSequence charSequence = ul82.X;
        CheckedTextView checkedTextView = this.C0;
        if (charSequence == null && ul82.getIcon() == null && this.E0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.D0;
            if (frameLayout != null) {
                ad7 ad7 = (ad7) frameLayout.getLayoutParams();
                ad7.width = -1;
                this.D0.setLayoutParams(ad7);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.D0;
        if (frameLayout2 != null) {
            ad7 ad72 = (ad7) frameLayout2.getLayoutParams();
            ad72.width = -2;
            this.D0.setLayoutParams(ad72);
        }
    }

    public ul8 getItemData() {
        return this.E0;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        ul8 ul8 = this.E0;
        if (ul8 != null && ul8.isCheckable() && this.E0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.A0 != z) {
            this.A0 = z;
            this.I0.h(this.C0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.C0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z || !this.B0) ? 0 : 1);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                um4.h(drawable, this.F0);
            }
            int i = this.y0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.z0) {
            if (this.H0 == null) {
                Resources resources = getResources();
                int i2 = bob.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = ubc.a;
                Drawable a = obc.a(resources, i2, theme);
                this.H0 = a;
                if (a != null) {
                    int i3 = this.y0;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.H0;
        }
        this.C0.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.C0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.y0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = colorStateList != null;
        ul8 ul8 = this.E0;
        if (ul8 != null) {
            setIcon(ul8.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.C0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.z0 = z;
    }

    public void setTextAppearance(int i) {
        this.C0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C0.setText(charSequence);
    }
}
