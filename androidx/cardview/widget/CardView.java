package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final int[] x0 = {16842801};
    public static final zl3 y0 = new Object();
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect o = new Rect();
    public final afc w0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r0 = defpackage.qlb.cardViewStyle
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.c = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.o = r2
            afc r2 = new afc
            r2.<init>(r9)
            r9.w0 = r2
            int[] r3 = defpackage.fwb.CardView
            int r4 = defpackage.hvb.CardView
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            int r11 = defpackage.fwb.CardView_cardBackgroundColor
            boolean r11 = r10.hasValue(r11)
            r0 = 0
            if (r11 == 0) goto L_0x0032
            int r11 = defpackage.fwb.CardView_cardBackgroundColor
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L_0x006b
        L_0x0032:
            android.content.Context r11 = r9.getContext()
            int[] r3 = x0
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r3)
            int r3 = r11.getColor(r0, r0)
            r11.recycle()
            r11 = 3
            float[] r11 = new float[r11]
            android.graphics.Color.colorToHSV(r3, r11)
            r3 = 2
            r11 = r11[r3]
            r3 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x005d
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.emb.cardview_light_background
            int r11 = r11.getColor(r3)
            goto L_0x0067
        L_0x005d:
            android.content.res.Resources r11 = r9.getResources()
            int r3 = defpackage.emb.cardview_dark_background
            int r11 = r11.getColor(r3)
        L_0x0067:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L_0x006b:
            int r3 = defpackage.fwb.CardView_cardCornerRadius
            r4 = 0
            float r3 = r10.getDimension(r3, r4)
            int r5 = defpackage.fwb.CardView_cardElevation
            float r5 = r10.getDimension(r5, r4)
            int r6 = defpackage.fwb.CardView_cardMaxElevation
            float r4 = r10.getDimension(r6, r4)
            int r6 = defpackage.fwb.CardView_cardUseCompatPadding
            boolean r6 = r10.getBoolean(r6, r0)
            r9.a = r6
            int r6 = defpackage.fwb.CardView_cardPreventCornerOverlap
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.b = r6
            int r6 = defpackage.fwb.CardView_contentPadding
            int r6 = r10.getDimensionPixelSize(r6, r0)
            int r8 = defpackage.fwb.CardView_contentPaddingLeft
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            int r8 = defpackage.fwb.CardView_contentPaddingTop
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            int r8 = defpackage.fwb.CardView_contentPaddingRight
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            int r8 = defpackage.fwb.CardView_contentPaddingBottom
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ba
            r4 = r5
        L_0x00ba:
            int r1 = defpackage.fwb.CardView_android_minWidth
            r10.getDimensionPixelSize(r1, r0)
            int r1 = defpackage.fwb.CardView_android_minHeight
            r10.getDimensionPixelSize(r1, r0)
            r10.recycle()
            zl3 r10 = y0
            egc r0 = new egc
            r0.<init>(r11, r3)
            r2.a = r0
            r9.setBackgroundDrawable(r0)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            r10.k(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.CardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ColorStateList getCardBackgroundColor() {
        return ((egc) ((Drawable) this.w0.a)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.w0.b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((egc) ((Drawable) this.w0.a)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((egc) ((Drawable) this.w0.a)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        egc egc = (egc) ((Drawable) this.w0.a);
        if (valueOf == null) {
            egc.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        egc.h = valueOf;
        egc.b.setColor(valueOf.getColorForState(egc.getState(), egc.h.getDefaultColor()));
        egc.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.w0.b).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        y0.k(this.w0, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            zl3 zl3 = y0;
            afc afc = this.w0;
            zl3.k(afc, ((egc) ((Drawable) afc.a)).e);
        }
    }

    public void setRadius(float f) {
        egc egc = (egc) ((Drawable) this.w0.a);
        if (f != egc.a) {
            egc.a = f;
            egc.b((Rect) null);
            egc.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            zl3 zl3 = y0;
            afc afc = this.w0;
            zl3.k(afc, ((egc) ((Drawable) afc.a)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        egc egc = (egc) ((Drawable) this.w0.a);
        if (colorStateList == null) {
            egc.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        egc.h = colorStateList;
        egc.b.setColor(colorStateList.getColorForState(egc.getState(), egc.h.getDefaultColor()));
        egc.invalidateSelf();
    }
}
