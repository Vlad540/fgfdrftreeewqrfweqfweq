package one.me.calls.impl.service;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl;", "Landroid/app/Service;", "<init>", "()V", "cj1", "dj1", "calls-impl_release"}, k = 1, mv = {2, 0, 0})
public final class CallServiceImpl extends Service {
    public static final dj1 w0 = new Object();
    public static Handler x0;
    public static final u3d y0;
    public final r7e X = new r7e(new di1(5));
    public final r7e Y = new r7e(new di1(6));
    public MediaSession Z;
    public final r7e a = new r7e(new di1(1));
    public final r7e b = new r7e(new di1(2));
    public final r7e c = new r7e(new di1(3));
    public final r7e o = new r7e(new di1(4));

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, dj1] */
    static {
        u3d u3d = new u3d();
        u3d.add(-1);
        u3d.add(2);
        u3d.add(32);
        if (Build.VERSION.SDK_INT >= 30) {
            u3d.add(128);
            u3d.add(64);
        }
        y0 = z3d.h(u3d);
    }

    public final cq1 a() {
        return (cq1) this.a.getValue();
    }

    public final void b(int i, Notification notification, boolean z, boolean z2) {
        int i2;
        r7e r7e = this.X;
        int i3 = 2;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                i2 = -1;
            } else {
                i2 = ((qna) r7e.getValue()).b(qna.h) ? 130 : 2;
                if (((qna) r7e.getValue()).b(qna.l)) {
                    i2 |= 64;
                }
                if (((nnc) this.o.getValue()).c() || z2) {
                    i2 |= 32;
                }
            }
            udd.p("CallServiceTag", "CallService start foreground with particular types: ".concat(dj1.a(i2)), new Object[0]);
            a().a();
            startForeground(i, notification, i2);
            udd.p("CallServiceTag", "CallService crosscheck types: ".concat(dj1.a(getForegroundServiceType())), new Object[0]);
        } catch (Throwable th) {
            udd.s("CallServiceTag", "CallService can't start foreground service due to " + th.getMessage() + ". Try to start with simple permissions.", th);
            try {
                if (Build.VERSION.SDK_INT < 34) {
                    i3 = -1;
                }
                startForeground(i, notification, i3);
                udd.p("CallServiceTag", "CallService started with types: ".concat(dj1.a(getForegroundServiceType())), new Object[0]);
            } catch (Exception unused) {
                udd.s("CallServiceTag", "CallService can't start foreground service. Try show usual notification isIncoming=" + z + ".", th);
                if (z) {
                    cq1 a2 = a();
                    a2.getClass();
                    udd.p("CallsNotification", "showNotification id=" + i + " notification", new Object[0]);
                    a2.e().a((String) null, i, notification);
                }
            }
        }
    }

    public final void c(zw3 zw3, k11 k11, boolean z) {
        PendingIntent broadcast;
        PendingIntent pendingIntent;
        boolean z2;
        PendingIntent broadcast2;
        zw3 zw32 = zw3;
        k11 k112 = k11;
        boolean z3 = z;
        boolean f = hhd.f(k112, k11.g);
        boolean z4 = zw32.g;
        ete ete = zw32.a;
        if (f) {
            udd.p("CallServiceTag", "CallService show default push due to chat info is empty.", new Object[0]);
            b(239, a().c(this, k112, ete != null ? ete.P() : false, z4), true, z3);
            return;
        }
        bw4 bw4 = bw4.a;
        Class<CallNotifierFixActivity> cls = CallNotifierFixActivity.class;
        Class<CallNotifierBroadcastReceiver> cls2 = CallNotifierBroadcastReceiver.class;
        if (!z4 || zw32.f) {
            boolean z5 = z3;
            udd.p("CallServiceTag", "CallService show active notification.", new Object[0]);
            cq1 a2 = a();
            CharSequence charSequence = k112.b;
            String obj = charSequence != null ? charSequence.toString() : null;
            a2.getClass();
            udd.p("CallsNotification", "showActiveCallNotification", new Object[0]);
            ((o7a) a2.d.getValue()).m();
            if (obj == null) {
                obj = (String) a2.f.getValue();
            }
            Bitmap bitmap = (Bitmap) xs7.M(bw4, new aq1(a2, k112.c, (Continuation) null));
            ((o54) a2.c.getValue()).getClass();
            un9 un9 = new un9(this, "ru.oneme.app.new.activeCalls");
            un9.k = -1;
            un9.v = "call";
            un9.F.icon = ((Number) a2.j.getValue()).intValue();
            t97 t97 = a2.i;
            un9.f = un9.c((String) t97.getValue());
            un9.e = un9.c(obj);
            h91 d = a2.d();
            un9.g = d.a(d.c(), new o8(20));
            un9.i(2, true);
            h91 d2 = a2.d();
            un9.h = d2.a(d2.c(), new o8(20));
            un9.i(128, false);
            Application c2 = a2.d().c();
            if (d1f.a >= 31) {
                Intent intent = new Intent(c2, cls);
                intent.setAction("action-finished-call");
                broadcast = PendingIntent.getActivity(c2, 0, intent, 201326592);
            } else {
                Intent intent2 = new Intent(c2, cls2);
                intent2.setAction("action-finished-call");
                broadcast = PendingIntent.getBroadcast(c2, 0, intent2, 201326592);
            }
            PendingIntent pendingIntent2 = broadcast;
            if (pendingIntent2 != null) {
                un9.q(new zn9(2, cq1.b(obj, (String) t97.getValue(), bitmap), pendingIntent2, (PendingIntent) null, (PendingIntent) null));
            }
            b(239, un9.b(), false, z5);
            return;
        }
        udd.p("CallServiceTag", "CallService show incoming notification.", new Object[0]);
        cq1 a3 = a();
        boolean P = ete != null ? ete.P() : false;
        a3.getClass();
        udd.p("CallsNotification", "showIncomingCallNotification", new Object[0]);
        CharSequence charSequence2 = k112.b;
        if (charSequence2 == null) {
            charSequence2 = (String) a3.f.getValue();
        }
        Bitmap bitmap2 = (Bitmap) xs7.M(bw4, new bq1(a3, k112, (Continuation) null));
        ((o54) a3.c.getValue()).getClass();
        un9 un92 = new un9(this, "ru.oneme.app.new.incomingCalls.");
        un92.F.icon = P ? ((Number) a3.k.getValue()).intValue() : ((Number) a3.j.getValue()).intValue();
        un92.e = un9.c(charSequence2);
        t97 t972 = a3.g;
        t97 t973 = a3.h;
        un92.f = un9.c(P ? (String) t973.getValue() : (String) t972.getValue());
        un92.k = 2;
        un92.i(2, true);
        un92.i(16, true);
        Application c3 = a3.d().c();
        int i = d1f.a;
        if (i >= 31) {
            Intent intent3 = new Intent(c3, cls);
            h91.b(intent3, k112, P);
            z2 = false;
            pendingIntent = PendingIntent.getActivity(c3, 0, intent3, 201326592);
        } else {
            z2 = false;
            Intent intent4 = new Intent(c3, cls2);
            h91.b(intent4, k112, P);
            pendingIntent = PendingIntent.getBroadcast(c3, 0, intent4, 201326592);
        }
        un92.h = pendingIntent;
        un92.i(128, true);
        un92.l = z2;
        un92.v = "call";
        h91 d3 = a3.d();
        PendingIntent a4 = d3.a(d3.c(), new g91(d3, k112, P));
        if (a4 != null) {
            Application c4 = a3.d().c();
            if (i >= 31) {
                Intent intent5 = new Intent(c4, cls);
                intent5.setAction("action-decline-call");
                broadcast2 = PendingIntent.getActivity(c4, 0, intent5, 201326592);
            } else {
                Intent intent6 = new Intent(c4, cls2);
                intent6.setAction("action-decline-call");
                broadcast2 = PendingIntent.getBroadcast(c4, 0, intent6, 201326592);
            }
            PendingIntent pendingIntent3 = broadcast2;
            if (pendingIntent3 != null) {
                un92.q(new zn9(1, cq1.b(charSequence2, P ? (String) t973.getValue() : (String) t972.getValue(), bitmap2), (PendingIntent) null, pendingIntent3, a4));
            }
        }
        b(240, un92.b(), true, z);
    }

    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        udd.p("CallServiceTag", "CallService onCreate", new Object[0]);
        zw3 zw3 = (zw3) ((ep1) ((so1) this.b.getValue())).I.getValue();
        k11 k11 = (k11) ((x11) ((n11) this.c.getValue())).k.getValue();
        cq1 a2 = a();
        ete ete = zw3.a;
        b(239, a2.c(this, k11, ete != null ? ete.P() : false, zw3.g), true, false);
    }

    public final void onDestroy() {
        udd.p("CallServiceTag", "service call onDestroy", new Object[0]);
        a().a();
        MediaSession mediaSession = this.Z;
        if (mediaSession != null) {
            mediaSession.release();
            udd.p("CallServiceTag", "media session stop", new Object[0]);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        udd.p("CallServiceTag", "CallService onStartCommand", new Object[0]);
        r7e r7e = this.b;
        zw3 zw3 = (zw3) ((ep1) ((so1) r7e.getValue())).I.getValue();
        k11 k11 = (k11) ((x11) ((n11) this.c.getValue())).k.getValue();
        if (!zw3.g || ((ep1) ((so1) r7e.getValue())).q()) {
            MediaSession mediaSession = this.Z;
            if (mediaSession != null) {
                mediaSession.release();
                udd.p("CallServiceTag", "media session stop", new Object[0]);
            }
        } else if (this.Z == null) {
            fj1 fj1 = new fj1(this);
            MediaSession mediaSession2 = new MediaSession(this, "CallServiceTag");
            mediaSession2.setFlags(3);
            mediaSession2.setPlaybackState(new PlaybackState.Builder().setState(3, 0, 0.0f).build());
            mediaSession2.setPlaybackToRemote(fj1);
            mediaSession2.setCallback(new MediaSession.Callback());
            mediaSession2.setActive(true);
            this.Z = mediaSession2;
            udd.p("CallServiceTag", "media session started", new Object[0]);
        }
        if (intent != null) {
            pz4 pz4 = cj1.Y;
            if (pz4.get(intent.getIntExtra("ACTION", 0)) != cj1.b) {
                if (pz4.get(intent.getIntExtra("ACTION", 0)) == cj1.a) {
                    udd.p("CallServiceTag", "CallService start.", new Object[0]);
                    return 2;
                }
                b65 b65 = zw3.j;
                if ((b65 instanceof v55) || (b65 instanceof u55) || (b65 instanceof w55)) {
                    udd.p("CallServiceTag", "CallService finished due to call is failed or finished.", new Object[0]);
                    dj1.c().postDelayed(new n30(i2, 3, this), 500);
                    return 2;
                } else if (pz4.get(intent.getIntExtra("ACTION", 0)) == cj1.c) {
                    udd.p("CallServiceTag", "CallService restart.", new Object[0]);
                    c(zw3, k11, false);
                    return 2;
                } else if (pz4.get(intent.getIntExtra("ACTION", 0)) == cj1.o) {
                    udd.p("CallServiceTag", "CallService restart for screen sharing.", new Object[0]);
                    c(zw3, k11, true);
                    return 2;
                } else {
                    udd.p("CallServiceTag", "CallService simple start, no action.", new Object[0]);
                    return 2;
                }
            }
        }
        udd.p("CallServiceTag", "CallService finished.", new Object[0]);
        dj1.c().postDelayed(new n30(-1, 3, this), 500);
        return 2;
    }
}
