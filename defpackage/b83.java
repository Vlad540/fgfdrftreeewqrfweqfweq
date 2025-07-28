package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.b;
import java.util.concurrent.Executor;

/* renamed from: b83  reason: default package */
public final class b83 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = (SystemClock.uptimeMillis() + ((long) 10000));
    public Runnable b;
    public boolean c;
    public final /* synthetic */ e83 o;

    public b83(b bVar) {
        this.o = bVar;
    }

    public final void a(View view) {
        if (!this.c) {
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.o.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new ds1(12, this));
        } else if (hhd.f(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            r16 r16 = (r16) this.o.Z.getValue();
            synchronized (r16.b) {
                z = r16.c;
            }
            if (z) {
                this.c = false;
                this.o.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.a) {
            this.c = false;
            this.o.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
