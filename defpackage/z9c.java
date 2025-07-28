package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: z9c  reason: default package */
public final class z9c implements Application.ActivityLifecycleCallbacks {
    public static final y9c Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new z9c());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        int i = aac.a;
        pa2.k(activity, nb7.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
