package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: pw2  reason: default package */
public final class pw2 extends AppCompatCheckBox {
    public int w0;

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.w0;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.w0;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.w0 = i;
        invalidate();
        requestLayout();
    }
}
