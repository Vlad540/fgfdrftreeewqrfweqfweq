package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: c6g  reason: default package */
public final class c6g {
    public static final Object h = new Object();
    public static c6g i;
    public static HandlerThread j;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile z59 c;
    public final nfc d;
    public final long e;
    public final long f;
    public volatile Executor g;

    public c6g(Context context, Looper looper) {
        ald ald = new ald(2, this);
        this.b = context.getApplicationContext();
        z59 z59 = new z59(looper, (Handler.Callback) ald, 5);
        Looper.getMainLooper();
        this.c = z59;
        this.d = nfc.p();
        this.e = 5000;
        this.f = 300000;
        this.g = null;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        k5g k5g = new k5g(str, z);
        a24.p(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                l5g l5g = (l5g) this.a.get(k5g);
                if (l5g == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(k5g.toString()));
                } else if (l5g.a.containsKey(serviceConnection)) {
                    l5g.a.remove(serviceConnection);
                    if (l5g.a.isEmpty()) {
                        this.c.sendMessageDelayed(this.c.obtainMessage(0, k5g), this.e);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(k5g.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(k5g k5g, y2g y2g, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                l5g l5g = (l5g) this.a.get(k5g);
                Executor executor = this.g;
                if (l5g == null) {
                    l5g = new l5g(this, k5g);
                    l5g.a.put(y2g, y2g);
                    l5g.a(str, executor);
                    this.a.put(k5g, l5g);
                } else {
                    this.c.removeMessages(0, k5g);
                    if (!l5g.a.containsKey(y2g)) {
                        l5g.a.put(y2g, y2g);
                        int i2 = l5g.b;
                        if (i2 == 1) {
                            y2g.onServiceConnected(l5g.Y, l5g.o);
                        } else if (i2 == 2) {
                            l5g.a(str, executor);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(k5g.toString()));
                    }
                }
                z = l5g.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
