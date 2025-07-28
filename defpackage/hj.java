package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: hj  reason: default package */
public final class hj implements Runnable {
    public static volatile long X = -1;
    public static final Handler o = new Handler(Looper.getMainLooper());
    public final long a;
    public final WeakReference b;
    public volatile boolean c;

    public hj(View view) {
        long j;
        Context context = view.getContext();
        if (X == -1) {
            Display l = Build.VERSION.SDK_INT >= 30 ? d4.l(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Long valueOf = l != null ? Long.valueOf((long) l.getRefreshRate()) : null;
            qq7 qq7 = new qq7(0, 30);
            if (valueOf == null || !qq7.a(valueOf.longValue())) {
                qq7 qq72 = new qq7((long) 31, 60);
                if (valueOf == null || !qq72.a(valueOf.longValue())) {
                    j = (valueOf == null || !new qq7((long) 61, 90).a(valueOf.longValue())) ? 6 : 9;
                } else {
                    j = 12;
                }
            } else {
                j = 16;
            }
            X = j;
        }
        this.a = X;
        this.b = new WeakReference(view);
    }

    public final void a() {
        this.c = false;
        if (this.b.get() != null) {
            o.postDelayed(this, this.a);
        }
    }

    public final void run() {
        if (this.c) {
            o.removeCallbacks(this);
            return;
        }
        View view = (View) this.b.get();
        if (view != null) {
            if (view.getParent() == null) {
                this.b.clear();
                return;
            }
            if (view.isAttachedToWindow()) {
                view.invalidate();
            }
            o.postDelayed(this, this.a);
        }
    }
}
