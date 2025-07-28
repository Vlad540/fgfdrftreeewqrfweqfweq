package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.view.View;
import java.io.IOException;

/* renamed from: zme  reason: default package */
public final class zme implements Runnable {
    public static final Object Z = new Object();
    public static Boolean w0;
    public static Boolean x0;
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object o;

    public zme(View view, vzb vzb, View view2, szb szb, ryb ryb, long j) {
        this.c = vzb;
        this.o = view2;
        this.X = szb;
        this.Y = ryb;
        this.b = j;
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (Z) {
            try {
                Boolean bool = x0;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                x0 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (Z) {
            try {
                Boolean bool = w0;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                w0 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [yme, android.content.BroadcastReceiver] */
    public final void run() {
        switch (this.a) {
            case 0:
                xme xme = (xme) this.Y;
                Context context = (Context) this.c;
                boolean b2 = b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.X;
                if (b2) {
                    wakeLock.acquire(ke3.a);
                }
                try {
                    xme.d(true);
                    if (!((z29) this.o).i()) {
                        xme.d(false);
                        if (!b(context)) {
                            return;
                        }
                    } else if (!a(context) || c()) {
                        if (xme.e()) {
                            xme.d(false);
                        } else {
                            xme.f(this.b);
                        }
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        ? broadcastReceiver = new BroadcastReceiver();
                        broadcastReceiver.a = this;
                        context.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                    xme.d(false);
                    if (!b(context)) {
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                    throw th;
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                Rect c2 = vzb.c((vzb) this.c, (View) this.o);
                if (c2 != null) {
                    String str = ((vzb) this.c).d;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        long j = this.b;
                        fn6.d(tn7, str, "Play reaction effect without pending, reaction:" + ((ryb) this.Y) + ", l:" + j, (Throwable) null);
                    }
                    szb szb = (szb) this.X;
                    vzb.d((vzb) this.c, szb.b, szb.a, c2);
                    return;
                }
                return;
        }
    }

    public zme(xme xme, Context context, z29 z29, long j) {
        this.Y = xme;
        this.c = context;
        this.b = j;
        this.o = z29;
        this.X = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
