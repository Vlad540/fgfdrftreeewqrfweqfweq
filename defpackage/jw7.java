package defpackage;

import android.content.res.ColorStateList;

/* renamed from: jw7  reason: default package */
public final class jw7 extends nn {
    public static final int y0 = kvb.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] z0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList w0;
    public boolean x0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.w0 == null) {
            int r = vx3.r(this, wlb.colorControlActivated);
            int r2 = vx3.r(this, wlb.colorOnSurface);
            int r3 = vx3.r(this, wlb.colorSurface);
            this.w0 = new ColorStateList(z0, new int[]{vx3.C(r3, 1.0f, r), vx3.C(r3, 0.54f, r2), vx3.C(r3, 0.38f, r2), vx3.C(r3, 0.38f, r2)});
        }
        return this.w0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x0 && l93.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.x0 = z;
        if (z) {
            l93.c(this, getMaterialThemeColorsTintList());
        } else {
            l93.c(this, (ColorStateList) null);
        }
    }
}
