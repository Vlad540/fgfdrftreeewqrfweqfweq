package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qa6  reason: default package */
public final class qa6 implements Handler.Callback {
    public static final Status D0 = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (nd3) null);
    public static final Status E0 = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (nd3) null);
    public static final Object F0 = new Object();
    public static qa6 G0;
    public final bs A0 = new bs(0);
    public final z59 B0;
    public volatile boolean C0 = true;
    public final Context X;
    public final ma6 Y;
    public final s5c Z;
    public long a = WorkRequest.MIN_BACKOFF_MILLIS;
    public boolean b = false;
    public ree c;
    public l0g o;
    public final AtomicInteger w0 = new AtomicInteger(1);
    public final AtomicInteger x0 = new AtomicInteger(0);
    public final ConcurrentHashMap y0 = new ConcurrentHashMap(5, 0.75f, 1);
    public final bs z0 = new bs(0);

    public qa6(Context context, Looper looper) {
        ma6 ma6 = ma6.d;
        this.X = context;
        z59 z59 = new z59(looper, (Handler.Callback) this, 2);
        Looper.getMainLooper();
        this.B0 = z59;
        this.Y = ma6;
        this.Z = new s5c(12);
        PackageManager packageManager = context.getPackageManager();
        if (oyb.f == null) {
            oyb.f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (oyb.f.booleanValue()) {
            this.C0 = false;
        }
        z59.sendMessage(z59.obtainMessage(6));
    }

    public static Status c(zk zkVar, nd3 nd3) {
        return new Status(17, me4.j("API: ", (String) zkVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(nd3)), nd3.c, nd3);
    }

    public static qa6 f(Context context) {
        qa6 qa6;
        HandlerThread handlerThread;
        synchronized (F0) {
            if (G0 == null) {
                synchronized (c6g.h) {
                    try {
                        handlerThread = c6g.j;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            c6g.j = handlerThread2;
                            handlerThread2.start();
                            handlerThread = c6g.j;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ma6.c;
                G0 = new qa6(applicationContext, looper);
            }
            qa6 = G0;
        }
        return qa6;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        ofc ofc = (ofc) nfc.o().b;
        if (ofc != null && !ofc.b) {
            return false;
        }
        int i = ((SparseIntArray) this.Z.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(nd3 nd3, int i) {
        PendingIntent pendingIntent;
        boolean z;
        PendingIntent pendingIntent2;
        Boolean bool;
        ma6 ma6 = this.Y;
        Context context = this.X;
        ma6.getClass();
        synchronized (xy6.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = xy6.a;
            pendingIntent = null;
            if (!(context2 == null || (bool = xy6.b) == null)) {
                if (context2 == applicationContext) {
                    z = bool.booleanValue();
                }
            }
            xy6.b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            xy6.b = Boolean.valueOf(isInstantApp);
            xy6.a = applicationContext;
            z = isInstantApp;
        }
        if (z) {
            return false;
        }
        int i2 = nd3.b;
        if (i2 == 0 || (pendingIntent2 = nd3.c) == null) {
            Intent a2 = ma6.a(i2, context, (String) null);
            if (a2 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 201326592);
            }
            pendingIntent2 = pendingIntent;
        }
        if (pendingIntent2 == null) {
            return false;
        }
        int i3 = nd3.b;
        int i4 = GoogleApiActivity.b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent2);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        ma6.f(context, i3, PendingIntent.getActivity(context, 0, intent, n0g.a | 134217728));
        return true;
    }

    public final dzf d(la6 la6) {
        ConcurrentHashMap concurrentHashMap = this.y0;
        zk zkVar = la6.X;
        dzf dzf = (dzf) concurrentHashMap.get(zkVar);
        if (dzf == null) {
            dzf = new dzf(this, la6);
            concurrentHashMap.put(zkVar, dzf);
        }
        if (dzf.d.j()) {
            this.A0.add(zkVar);
        }
        dzf.j();
        return dzf;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, a62] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.vde r7, int r8, defpackage.la6 r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x007a
            zk r9 = r9.X
            boolean r0 = r6.a()
            if (r0 != 0) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            nfc r0 = defpackage.nfc.o()
            java.lang.Object r0 = r0.b
            ofc r0 = (defpackage.ofc) r0
            r1 = 1
            if (r0 == 0) goto L_0x0049
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentHashMap r2 = r6.y0
            java.lang.Object r2 = r2.get(r9)
            dzf r2 = (defpackage.dzf) r2
            if (r2 == 0) goto L_0x0044
            ok r3 = r2.d
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.common.internal.a r3 = (com.google.android.gms.common.internal.a) r3
            p4g r4 = r3.J0
            if (r4 == 0) goto L_0x0044
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x0044
            ud3 r0 = a62.b(r2, r3, r8)
            if (r0 == 0) goto L_0x0047
            int r3 = r2.n
            int r3 = r3 + r1
            r2.n = r3
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0044:
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0047:
            r8 = 0
            goto L_0x0069
        L_0x0049:
            a62 r0 = new a62
            r2 = 0
            if (r1 == 0) goto L_0x0054
            long r4 = java.lang.System.currentTimeMillis()
            goto L_0x0055
        L_0x0054:
            r4 = r2
        L_0x0055:
            if (r1 == 0) goto L_0x005b
            long r2 = android.os.SystemClock.elapsedRealtime()
        L_0x005b:
            r0.<init>()
            r0.o = r6
            r0.a = r8
            r0.X = r9
            r0.b = r4
            r0.c = r2
            r8 = r0
        L_0x0069:
            if (r8 == 0) goto L_0x007a
            n6g r7 = r7.a
            z59 r6 = r6.B0
            r6.getClass()
            ul0 r9 = new ul0
            r9.<init>(r6)
            r7.b(r9, r8)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa6.e(vde, int, la6):void");
    }

    public final void g(nd3 nd3, int i) {
        if (!b(nd3, i)) {
            z59 z59 = this.B0;
            z59.sendMessage(z59.obtainMessage(5, i, 0, nd3));
        }
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [la6, l0g] */
    /* JADX WARNING: type inference failed for: r6v3, types: [la6, l0g] */
    /* JADX WARNING: type inference failed for: r1v23, types: [la6, l0g] */
    public final boolean handleMessage(Message message) {
        dzf dzf;
        ib5[] g;
        int i = message.what;
        z59 z59 = this.B0;
        ConcurrentHashMap concurrentHashMap = this.y0;
        long j = 300000;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.a = j;
                z59.removeMessages(12);
                for (zk obtainMessage : concurrentHashMap.keySet()) {
                    z59.sendMessageDelayed(z59.obtainMessage(12, obtainMessage), this.a);
                }
                break;
            case 2:
                hr1.r(message.obj);
                throw null;
            case 3:
                for (dzf dzf2 : concurrentHashMap.values()) {
                    a24.j(dzf2.o.B0);
                    dzf2.m = null;
                    dzf2.j();
                }
                break;
            case 4:
            case 8:
            case 13:
                ozf ozf = (ozf) message.obj;
                dzf dzf3 = (dzf) concurrentHashMap.get(ozf.c.X);
                if (dzf3 == null) {
                    dzf3 = d(ozf.c);
                }
                boolean j2 = dzf3.d.j();
                j0g j0g = ozf.a;
                if (j2 && this.x0.get() != ozf.b) {
                    j0g.a(D0);
                    dzf3.o();
                    break;
                } else {
                    dzf3.l(j0g);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                nd3 nd3 = (nd3) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        dzf = (dzf) it.next();
                        if (dzf.i == i2) {
                        }
                    } else {
                        dzf = null;
                    }
                }
                if (dzf == null) {
                    Log.wtf("GoogleApiManager", rf0.f(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    break;
                } else {
                    int i3 = nd3.b;
                    if (i3 != 13) {
                        dzf.b(c(dzf.e, nd3));
                        break;
                    } else {
                        this.Y.getClass();
                        int i4 = xa6.e;
                        StringBuilder m = hr1.m("Error resolution was canceled by the user, original error message: ", nd3.b(i3), ": ");
                        m.append(nd3.o);
                        dzf.b(new Status(17, m.toString(), (PendingIntent) null, (nd3) null));
                        break;
                    }
                }
            case 6:
                Context context = this.X;
                if (context.getApplicationContext() instanceof Application) {
                    rd0.a((Application) context.getApplicationContext());
                    rd0 rd0 = rd0.X;
                    czf czf = new czf(this);
                    rd0.getClass();
                    synchronized (rd0) {
                        rd0.c.add(czf);
                    }
                    AtomicBoolean atomicBoolean = rd0.b;
                    boolean z = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = rd0.a;
                    if (!z) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((la6) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    dzf dzf4 = (dzf) concurrentHashMap.get(message.obj);
                    a24.j(dzf4.o.B0);
                    if (dzf4.k) {
                        dzf4.j();
                        break;
                    }
                }
                break;
            case 10:
                bs bsVar = this.A0;
                bsVar.getClass();
                ur urVar = new ur(bsVar);
                while (urVar.hasNext()) {
                    dzf dzf5 = (dzf) concurrentHashMap.remove((zk) urVar.next());
                    if (dzf5 != null) {
                        dzf5.o();
                    }
                }
                bsVar.clear();
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    dzf dzf6 = (dzf) concurrentHashMap.get(message.obj);
                    qa6 qa6 = dzf6.o;
                    a24.j(qa6.B0);
                    boolean z2 = dzf6.k;
                    if (z2) {
                        if (z2) {
                            qa6 qa62 = dzf6.o;
                            z59 z592 = qa62.B0;
                            zk zkVar = dzf6.e;
                            z592.removeMessages(11, zkVar);
                            qa62.B0.removeMessages(9, zkVar);
                            dzf6.k = false;
                        }
                        dzf6.b(qa6.Y.b(qa6.X, na6.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent) null, (nd3) null) : new Status(22, "API failed to connect while resuming due to an unknown error.", (PendingIntent) null, (nd3) null));
                        dzf6.d.b("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    dzf dzf7 = (dzf) concurrentHashMap.get(message.obj);
                    a24.j(dzf7.o.B0);
                    ok okVar = dzf7.d;
                    if (okVar.isConnected() && dzf7.h.isEmpty()) {
                        d4b d4b = dzf7.f;
                        if (((Map) d4b.b).isEmpty() && ((Map) d4b.c).isEmpty()) {
                            okVar.b("Timing out service connection.");
                            break;
                        } else {
                            dzf7.g();
                            break;
                        }
                    }
                }
                break;
            case 14:
                hr1.r(message.obj);
                throw null;
            case 15:
                ezf ezf = (ezf) message.obj;
                if (concurrentHashMap.containsKey(ezf.a)) {
                    dzf dzf8 = (dzf) concurrentHashMap.get(ezf.a);
                    if (dzf8.l.contains(ezf) && !dzf8.k) {
                        if (dzf8.d.isConnected()) {
                            dzf8.d();
                            break;
                        } else {
                            dzf8.j();
                            break;
                        }
                    }
                }
                break;
            case 16:
                ezf ezf2 = (ezf) message.obj;
                if (concurrentHashMap.containsKey(ezf2.a)) {
                    dzf dzf9 = (dzf) concurrentHashMap.get(ezf2.a);
                    if (dzf9.l.remove(ezf2)) {
                        qa6 qa63 = dzf9.o;
                        qa63.B0.removeMessages(15, ezf2);
                        qa63.B0.removeMessages(16, ezf2);
                        LinkedList linkedList = dzf9.c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            ib5 ib5 = ezf2.b;
                            if (!hasNext) {
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    j0g j0g2 = (j0g) arrayList.get(i5);
                                    linkedList.remove(j0g2);
                                    j0g2.b(new UnsupportedApiCallException(ib5));
                                }
                                break;
                            } else {
                                j0g j0g3 = (j0g) it2.next();
                                if ((j0g3 instanceof hzf) && (g = ((hzf) j0g3).g(dzf9)) != null) {
                                    int length = g.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            if (!x87.F(g[i6], ib5)) {
                                                i6++;
                                            } else if (i6 >= 0) {
                                                arrayList.add(j0g3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                ree ree = this.c;
                if (ree != null) {
                    if (ree.a > 0 || a()) {
                        if (this.o == null) {
                            this.o = new la6(this.X, l0g.z0, (nk) tee.b, ka6.c);
                        }
                        this.o.d(ree);
                    }
                    this.c = null;
                    break;
                }
                break;
            case 18:
                nzf nzf = (nzf) message.obj;
                int i7 = (nzf.c > 0 ? 1 : (nzf.c == 0 ? 0 : -1));
                t39 t39 = nzf.a;
                int i8 = nzf.b;
                if (i7 != 0) {
                    ree ree2 = this.c;
                    if (ree2 != null) {
                        List list = ree2.b;
                        if (ree2.a != i8 || (list != null && list.size() >= nzf.d)) {
                            z59.removeMessages(17);
                            ree ree3 = this.c;
                            if (ree3 != null) {
                                if (ree3.a > 0 || a()) {
                                    if (this.o == null) {
                                        this.o = new la6(this.X, l0g.z0, (nk) tee.b, ka6.c);
                                    }
                                    this.o.d(ree3);
                                }
                                this.c = null;
                            }
                        } else {
                            ree ree4 = this.c;
                            if (ree4.b == null) {
                                ree4.b = new ArrayList();
                            }
                            ree4.b.add(t39);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(t39);
                        this.c = new ree(i8, arrayList2);
                        z59.sendMessageDelayed(z59.obtainMessage(17), nzf.c);
                        break;
                    }
                } else {
                    ree ree5 = new ree(i8, Arrays.asList(new t39[]{t39}));
                    if (this.o == null) {
                        this.o = new la6(this.X, l0g.z0, (nk) tee.b, ka6.c);
                    }
                    this.o.d(ree5);
                    break;
                }
                break;
            case 19:
                this.b = false;
                break;
            default:
                return false;
        }
        return true;
    }
}
