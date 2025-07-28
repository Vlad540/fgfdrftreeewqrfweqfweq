package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: n0f  reason: default package */
public final class n0f extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public n0f(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        o0f o0f = new o0f();
        o0f.a = (VectorDrawable) this.a.newDrawable();
        return o0f;
    }

    public final Drawable newDrawable(Resources resources) {
        o0f o0f = new o0f();
        o0f.a = (VectorDrawable) this.a.newDrawable(resources);
        return o0f;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o0f o0f = new o0f();
        o0f.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return o0f;
    }
}
