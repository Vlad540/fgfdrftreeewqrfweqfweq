package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;

/* renamed from: rl4  reason: default package */
public abstract class rl4 extends Service {
    public static final HashMap x0 = new HashMap();
    public int X;
    public boolean Y;
    public boolean Z;
    public final String a = null;
    public final int b = 0;
    public final int c = 0;
    public ql4 o;
    public boolean w0;

    public static void a(rl4 rl4, List list) {
        rl4.getClass();
    }

    public static boolean b(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    public final void c() {
        ql4 ql4 = this.o;
        ql4.getClass();
        if (!ql4.b.k) {
            if (oze.a >= 28 || !this.Z) {
                this.w0 |= stopSelfResult(this.X);
                return;
            }
            stopSelf();
            this.w0 = true;
        }
    }

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        String str = this.a;
        if (str != null && oze.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.b), 2);
            int i = this.c;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap hashMap = x0;
        ql4 ql4 = (ql4) hashMap.get(cls);
        boolean z = true;
        if (ql4 == null) {
            int i2 = oze.a;
            ml4 ml4 = (ml4) l38.a.getAccessor().c(ml4.class);
            ml4.c(false);
            ql4 ql42 = new ql4(getApplicationContext(), ml4, false, cls);
            hashMap.put(cls, ql42);
            ql4 = ql42;
        }
        this.o = ql4;
        if (ql4.e != null) {
            z = false;
        }
        oyb.k(z);
        ql4.e = this;
        if (ql4.b.h) {
            oze.p((fi4) null).postAtFrontOfQueue(new ii4(ql4, 2, this));
        }
    }

    public final void onDestroy() {
        ql4 ql4 = this.o;
        ql4.getClass();
        boolean z = false;
        if (ql4.e == this) {
            z = true;
        }
        oyb.k(z);
        ql4.e = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        this.X = i2;
        this.Z = false;
        if (intent != null) {
            str2 = intent.getAction();
            str = intent.getStringExtra("content_id");
            this.Y |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str2);
        } else {
            str2 = null;
            str = null;
        }
        if (str2 == null) {
            str2 = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        ql4 ql4 = this.o;
        ql4.getClass();
        ml4 ml4 = ql4.b;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -2068303304:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1192305801:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c2 = 1;
                    break;
                }
                break;
            case -659421309:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c2 = 2;
                    break;
                }
                break;
            case -238450692:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c2 = 3;
                    break;
                }
                break;
            case 32678949:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c2 = 4;
                    break;
                }
                break;
            case 464223742:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c2 = 5;
                    break;
                }
                break;
            case 829812082:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c2 = 6;
                    break;
                }
                break;
            case 845668953:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1746253622:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                intent.getClass();
                if (intent.hasExtra("stop_reason")) {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    ml4.f++;
                    ml4.c.obtainMessage(4, intExtra, 0, str).sendToTarget();
                    break;
                } else {
                    ez3.A("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                }
            case 1:
                if (str != null) {
                    ml4.f++;
                    ml4.c.obtainMessage(8, str).sendToTarget();
                    break;
                } else {
                    ez3.A("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case 2:
            case 3:
                break;
            case 4:
                ml4.c(false);
                break;
            case 5:
                ml4.f++;
                ml4.c.obtainMessage(9).sendToTarget();
                break;
            case 6:
                intent.getClass();
                pl4 pl4 = (pl4) intent.getParcelableExtra("download_request");
                if (pl4 != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    ml4.f++;
                    ml4.c.obtainMessage(7, intExtra2, 0, pl4).sendToTarget();
                    break;
                } else {
                    ez3.A("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case 7:
                intent.getClass();
                yac yac = (yac) intent.getParcelableExtra("requirements");
                if (yac != null) {
                    if (!yac.equals((yac) ml4.m.d)) {
                        ga0 ga0 = ml4.m;
                        an anVar = (an) ga0.f;
                        anVar.getClass();
                        Context context = (Context) ga0.a;
                        context.unregisterReceiver(anVar);
                        ga0.f = null;
                        if (oze.a >= 24 && ((abc) ga0.g) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            abc abc = (abc) ga0.g;
                            abc.getClass();
                            connectivityManager.unregisterNetworkCallback(abc);
                            ga0.g = null;
                        }
                        ga0 ga02 = new ga0(ml4.a, ml4.d, yac);
                        ml4.m = ga02;
                        ml4.b(ml4.m, ga02.f());
                        break;
                    }
                } else {
                    ez3.A("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case 8:
                ml4.c(true);
                break;
            default:
                ez3.A("Ignored unrecognized action: ".concat(str2));
                break;
        }
        int i3 = oze.a;
        this.w0 = false;
        if (ml4.g == 0 && ml4.f == 0) {
            c();
        }
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        this.Z = true;
    }
}
