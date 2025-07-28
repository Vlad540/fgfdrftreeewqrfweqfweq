package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: yd6  reason: default package */
public final class yd6 extends qmc {
    public final Handler c;
    public final boolean d = true;

    public yd6(Handler handler) {
        this.c = handler;
    }

    public final omc a() {
        return new wd6(this.c, this.d);
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.c;
            xd6 xd6 = new xd6(handler, runnable);
            Message obtain = Message.obtain(handler, xd6);
            if (this.d) {
                obtain.setAsynchronous(true);
            }
            handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return xd6;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
