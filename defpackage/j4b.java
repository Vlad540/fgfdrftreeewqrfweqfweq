package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: j4b  reason: default package */
public final class j4b extends aw4 {
    final /* synthetic */ k4b this$0;

    public j4b(k4b k4b) {
        this.this$0 = k4b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
        k4b k4b = this.this$0;
        int i = k4b.b - 1;
        k4b.b = i;
        if (i == 0) {
            k4b.X.postDelayed(k4b.Z, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        h4b.a(activity, new i4b(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        k4b k4b = this.this$0;
        int i = k4b.a - 1;
        k4b.a = i;
        if (i == 0 && k4b.c) {
            k4b.Y.d(nb7.ON_STOP);
            k4b.o = true;
        }
    }
}
