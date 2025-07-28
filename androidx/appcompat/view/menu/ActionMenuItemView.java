package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements im8, View.OnClickListener, j7 {
    public Drawable A0;
    public ol8 B0;
    public d7 C0;
    public e7 D0;
    public boolean E0 = j();
    public boolean F0;
    public final int G0;
    public int H0;
    public final int I0;
    public ul8 y0;
    public CharSequence z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nwb.ActionMenuItemView, 0, 0);
        this.G0 = obtainStyledAttributes.getDimensionPixelSize(nwb.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.I0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.H0 = -1;
        setSaveEnabled(false);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public final void d(ul8 ul8) {
        this.y0 = ul8;
        setIcon(ul8.getIcon());
        setTitle(ul8.getTitleCondensed());
        setId(ul8.a);
        setVisibility(ul8.isVisible() ? 0 : 8);
        setEnabled(ul8.isEnabled());
        if (ul8.hasSubMenu() && this.C0 == null) {
            this.C0 = new d7(this);
        }
    }

    public final boolean e() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.y0.getIcon() == null;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public ul8 getItemData() {
        return this.y0;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.z0);
        if (this.A0 != null && ((this.y0.N0 & 4) != 4 || (!this.E0 && !this.F0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.z0 : null);
        CharSequence charSequence2 = this.y0.F0;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z3 ? null : this.y0.X);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.y0.G0;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.y0.X;
            }
            dme.a(this, charSequence);
            return;
        }
        dme.a(this, charSequence3);
    }

    public final void onClick(View view) {
        ol8 ol8 = this.B0;
        if (ol8 != null) {
            ol8.a(this.y0);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E0 = j();
        k();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.H0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.G0;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!z && this.A0 != null) {
            super.setPadding((getMeasuredWidth() - this.A0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d7 d7Var;
        if (!this.y0.hasSubMenu() || (d7Var = this.C0) == null || !d7Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.F0 != z) {
            this.F0 = z;
            ul8 ul8 = this.y0;
            if (ul8 != null) {
                pl8 pl8 = ul8.C0;
                pl8.z0 = true;
                pl8.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.I0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        k();
    }

    public void setItemInvoker(ol8 ol8) {
        this.B0 = ol8;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.H0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(e7 e7Var) {
        this.D0 = e7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.z0 = charSequence;
        k();
    }
}
