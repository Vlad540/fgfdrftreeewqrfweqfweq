package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: one  reason: default package */
public final class one implements Application.ActivityLifecycleCallbacks {
    public final i3d a;
    public int b;

    public one(i3d i3d) {
        this.a = i3d;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.a.e(true);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b == 0) {
            this.a.e(false);
        }
        this.b++;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
