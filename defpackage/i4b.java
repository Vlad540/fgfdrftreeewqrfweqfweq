package defpackage;

import android.app.Activity;

/* renamed from: i4b  reason: default package */
public final class i4b extends aw4 {
    final /* synthetic */ k4b this$0;

    public i4b(k4b k4b) {
        this.this$0 = k4b;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity activity) {
        k4b k4b = this.this$0;
        int i = k4b.a + 1;
        k4b.a = i;
        if (i == 1 && k4b.o) {
            k4b.Y.d(nb7.ON_START);
            k4b.o = false;
        }
    }
}
