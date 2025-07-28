package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: zn  reason: default package */
public final class zn extends xg7 implements bo {
    public CharSequence P0;
    public ListAdapter Q0;
    public final Rect R0 = new Rect();
    public int S0;
    public final /* synthetic */ co T0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn(co coVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.T0 = coVar;
        this.D0 = coVar;
        this.N0 = true;
        this.O0.setFocusable(true);
        this.E0 = new xn(0, this);
    }

    public final CharSequence f() {
        return this.P0;
    }

    public final void h(CharSequence charSequence) {
        this.P0 = charSequence;
    }

    public final void l(int i) {
        this.S0 = i;
    }

    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ln lnVar = this.O0;
        boolean isShowing = lnVar.isShowing();
        r();
        this.O0.setInputMethodMode(2);
        g();
        yo4 yo4 = this.c;
        yo4.setChoiceMode(1);
        yo4.setTextDirection(i);
        yo4.setTextAlignment(i2);
        co coVar = this.T0;
        int selectedItemPosition = coVar.getSelectedItemPosition();
        yo4 yo42 = this.c;
        if (lnVar.isShowing() && yo42 != null) {
            yo42.setListSelectionHidden(false);
            yo42.setSelection(selectedItemPosition);
            if (yo42.getChoiceMode() != 0) {
                yo42.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = coVar.getViewTreeObserver()) != null) {
            tn tnVar = new tn(1, this);
            viewTreeObserver.addOnGlobalLayoutListener(tnVar);
            this.O0.setOnDismissListener(new yn(this, tnVar));
        }
    }

    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.Q0 = listAdapter;
    }

    public final void r() {
        int i;
        ln lnVar = this.O0;
        Drawable background = lnVar.getBackground();
        co coVar = this.T0;
        if (background != null) {
            background.getPadding(coVar.z0);
            int layoutDirection = coVar.getLayoutDirection();
            Rect rect = coVar.z0;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = coVar.z0;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = coVar.getPaddingLeft();
        int paddingRight = coVar.getPaddingRight();
        int width = coVar.getWidth();
        int i2 = coVar.y0;
        if (i2 == -2) {
            int a = coVar.a((SpinnerAdapter) this.Q0, lnVar.getBackground());
            int i3 = coVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = coVar.z0;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a > i4) {
                a = i4;
            }
            q(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        this.Y = coVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.X) - this.S0) + i : paddingLeft + this.S0 + i;
    }
}
