package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* renamed from: wy4  reason: default package */
public final class wy4 {
    public final Drawable a;
    public final AnimatorSet b;
    public final boolean c;

    public wy4(Drawable drawable, AnimatorSet animatorSet) {
        this.a = drawable;
        AnimatorSet clone = animatorSet.clone();
        this.b = clone;
        this.c = clone.getTotalDuration() == -1;
    }
}
