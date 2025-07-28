package defpackage;

import android.app.Activity;
import android.app.Application;

/* renamed from: h4b  reason: default package */
public abstract class h4b {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
