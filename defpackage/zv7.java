package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* renamed from: zv7  reason: default package */
public final class zv7 {
    public final MaterialButton a;
    public ead b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public lw7 m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public boolean r = true;
    public RippleDrawable s;
    public int t;

    public zv7(MaterialButton materialButton, ead ead) {
        this.a = materialButton;
        this.b = ead;
    }

    public final pad a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (pad) this.s.getDrawable(2) : (pad) this.s.getDrawable(1);
    }

    public final lw7 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (lw7) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(ead ead) {
        this.b = ead;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(ead);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(ead);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(ead);
        }
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = eaf.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f;
        this.f = i3;
        this.e = i2;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public final void e() {
        lw7 lw7 = new lw7(this.b);
        MaterialButton materialButton = this.a;
        lw7.j(materialButton.getContext());
        um4.h(lw7, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            um4.i(lw7, mode);
        }
        ColorStateList colorStateList = this.k;
        lw7.a.k = (float) this.h;
        lw7.invalidateSelf();
        lw7.n(colorStateList);
        lw7 lw72 = new lw7(this.b);
        lw72.setTint(0);
        float f2 = (float) this.h;
        int r2 = this.n ? vx3.r(materialButton, wlb.colorSurface) : 0;
        lw72.a.k = f2;
        lw72.invalidateSelf();
        lw72.n(ColorStateList.valueOf(r2));
        lw7 lw73 = new lw7(this.b);
        this.m = lw73;
        um4.g(lw73, -1);
        ColorStateList colorStateList2 = this.l;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable(new LayerDrawable(new Drawable[]{lw72, lw7}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        lw7 b2 = b(false);
        if (b2 != null) {
            b2.k((float) this.t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i2 = 0;
        lw7 b2 = b(false);
        lw7 b3 = b(true);
        if (b2 != null) {
            ColorStateList colorStateList = this.k;
            b2.a.k = (float) this.h;
            b2.invalidateSelf();
            b2.n(colorStateList);
            if (b3 != null) {
                float f2 = (float) this.h;
                if (this.n) {
                    i2 = vx3.r(this.a, wlb.colorSurface);
                }
                b3.a.k = f2;
                b3.invalidateSelf();
                b3.n(ColorStateList.valueOf(i2));
            }
        }
    }
}
