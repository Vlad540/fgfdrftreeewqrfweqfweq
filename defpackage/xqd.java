package defpackage;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: xqd  reason: default package */
public final class xqd implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public final Object c;
    public final Object o;

    public xqd(pf8 pf8) {
        this.o = pf8;
        this.c = new wqd(pf8, this);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.o).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            return ((FirebaseMessaging) this.o).a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                pf8 pf8 = (pf8) this.o;
                ((u16) pf8.c).invoke((wqd) this.c);
                ((Handler) pf8.k).removeCallbacks(this);
                ((Handler) pf8.k).postDelayed(this, 1000);
                this.b++;
                return;
            case 1:
                b0d t = b0d.t();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.o;
                boolean w = t.w(firebaseMessaging.b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                if (w) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = true;
                    }
                    if (!firebaseMessaging.h.i()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                        }
                        if (!b0d.t().w(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else if (!b0d.t().v(firebaseMessaging.b) || a()) {
                        if (b()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                        } else {
                            firebaseMessaging.h(this.b);
                        }
                        if (!b0d.t().w(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else {
                        an anVar = new an();
                        anVar.b = this;
                        ((FirebaseMessaging) ((xqd) anVar.b).o).b.registerReceiver(anVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b0d.t().w(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                } catch (IOException e) {
                    try {
                        e.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!b0d.t().w(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (b0d.t().w(firebaseMessaging.b)) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (!((wpe) this.o).o) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ((wpe) this.o).getClass();
                    long a2 = omc.a(timeUnit);
                    long j = this.b;
                    if (j > a2) {
                        try {
                            Thread.sleep(j - a2);
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            xs7.F(e2);
                            return;
                        }
                    }
                    if (!((wpe) this.o).o) {
                        ((Runnable) this.c).run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xqd(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zf9("firebase-iid-executor", 0));
        this.o = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public xqd(Runnable runnable, wpe wpe, long j) {
        this.c = runnable;
        this.o = wpe;
        this.b = j;
    }
}
