package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: pf  reason: default package */
public final class pf implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).invalidateSelf();
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            case 2:
                ((az9) this.b).invalidateSelf();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                jca jca = (jca) this.b;
                if (isCurrentThread) {
                    jca.invalidate();
                    return;
                }
                Handler handler = jca.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new ica(jca, 0));
                    return;
                } else {
                    jca.post(new ica(jca, 1));
                    return;
                }
            default:
                ((gye) this.b).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((sf) this.b).scheduleSelf(runnable, j);
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 2:
                ((az9) this.b).scheduleSelf(runnable, j);
                return;
            case 3:
                ((jca) this.b).postDelayed(runnable, j);
                return;
            default:
                ((gye) this.b).scheduleSelf(runnable, j);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((az9) this.b).unscheduleSelf(runnable);
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                jca jca = (jca) this.b;
                if (isCurrentThread) {
                    jca.removeCallbacks(runnable);
                    return;
                }
                Handler handler = jca.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new q36((Object) jca, 13, (Object) runnable));
                    return;
                } else {
                    jca.post(new p36((Object) jca, 16, (Object) runnable));
                    return;
                }
            default:
                ((gye) this.b).unscheduleSelf(runnable);
                return;
        }
    }
}
