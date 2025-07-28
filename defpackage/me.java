package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: me  reason: default package */
public final class me extends Animatable2.AnimationCallback {
    public final /* synthetic */ ne a;

    public me(ne neVar) {
        this.a = neVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
