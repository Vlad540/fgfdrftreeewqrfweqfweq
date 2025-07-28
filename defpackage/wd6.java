package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: wd6  reason: default package */
public final class wd6 extends omc {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public wd6(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            boolean z = this.c;
            cw4 cw4 = cw4.a;
            if (z) {
                return cw4;
            }
            Handler handler = this.a;
            xd6 xd6 = new xd6(handler, runnable);
            Message obtain = Message.obtain(handler, xd6);
            obtain.obj = this;
            if (this.b) {
                obtain.setAsynchronous(true);
            }
            this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.c) {
                return xd6;
            }
            this.a.removeCallbacks(xd6);
            return cw4;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final void f() {
        this.c = true;
        this.a.removeCallbacksAndMessages(this);
    }

    public final boolean h() {
        return this.c;
    }
}
