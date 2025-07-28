package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: yy4  reason: default package */
public final class yy4 implements Drawable.Callback {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public yy4(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
