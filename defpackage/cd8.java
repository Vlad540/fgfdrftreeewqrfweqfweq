package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: cd8  reason: default package */
public class cd8 {
    public final ws6 A;
    public final Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final zc8 c;
    public final f18 d;
    public final hk9 e;
    public final Context f;
    public final me8 g;
    public final md8 h;
    public final String i;
    public final m3d j;
    public final kc8 k;
    public final Handler l;
    public final wm0 m;
    public final wc8 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public fza r;
    public qza s;
    public final PendingIntent t;
    public ad8 u;
    public wwc v;
    public wd8 w;
    public boolean x;
    public final long y;
    public boolean z;

    static {
        new p2d(1);
    }

    public cd8(kc8 kc8, Context context, n45 n45, e8c e8c, hk9 hk9, Bundle bundle, Bundle bundle2, mn mnVar) {
        ez3.M("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oze.e + "]");
        this.k = kc8;
        this.f = context;
        this.i = BuildConfig.FLAVOR;
        this.t = null;
        this.A = e8c;
        this.e = hk9;
        this.B = bundle2;
        this.m = mnVar;
        this.p = true;
        this.q = true;
        me8 me8 = new me8(this);
        this.g = me8;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = n45.I0;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.r = fza.F;
        this.c = new zc8(this, looper);
        this.d = new f18(this, looper);
        Uri build = new Uri.Builder().scheme(cd8.class.getName()).appendPath(BuildConfig.FLAVOR).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        this.j = new m3d(Process.myUid(), 1004001300, 4, context.getPackageName(), me8, bundle);
        this.h = new md8(this, build, handler);
        n45 n452 = n45;
        e8c e8c2 = e8c;
        qza qza = new qza(n452, e8c2, gc8.d, gc8.e, bundle2);
        this.s = qza;
        oze.W(handler, new zo5(this, 20, qza));
        this.y = 3000;
        this.n = new wc8(this, 2);
        oze.W(handler, new wc8(this, 3));
    }

    public static boolean j(ic8 ic8) {
        return ic8 != null && ic8.b == 0 && Objects.equals(ic8.a.a.a, "com.android.systemui");
    }

    public final boolean a(KeyEvent keyEvent, boolean z2) {
        uc3 uc3;
        ic8 e2 = this.k.a.e();
        e2.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z2) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            uc3 = new uc3(this, e2, 6);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.s.u()) {
                                uc3 = new uc3(this, e2, 5);
                                break;
                            } else {
                                uc3 = new uc3(this, e2, 4);
                                break;
                            }
                        case 86:
                            uc3 = new uc3(this, e2, 3);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            uc3 = new uc3(this, e2, 2);
                            break;
                        case 90:
                            uc3 = new uc3(this, e2, 1);
                            break;
                        default:
                            return false;
                    }
                }
                uc3 = new uc3(this, e2, 9);
            }
            uc3 = new uc3(this, e2, 8);
        } else {
            uc3 = new uc3(this, e2, 7);
        }
        oze.W(this.l, new px4((Object) this, (Object) uc3, (Object) e2, 13));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ic8 r4, defpackage.bd8 r5) {
        /*
            r3 = this;
            me8 r0 = r3.g
            nxc r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            k96 r1 = r1.B(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x0011
            int r3 = r1.i()     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x002c
        L_0x000f:
            r3 = move-exception
            goto L_0x0034
        L_0x0011:
            nxc r1 = r0.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r1 = r1.J(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            r2 = 0
            if (r1 != 0) goto L_0x0027
            md8 r3 = r3.h     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            nxc r3 = r3.e     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            boolean r3 = r3.J(r4)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            r3 = r2
        L_0x002c:
            hc8 r1 = r4.d     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            if (r1 == 0) goto L_0x004f
            r5.a(r1, r3)     // Catch:{ DeadObjectException -> 0x004a, RemoteException -> 0x000f }
            goto L_0x004f
        L_0x0034:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Exception in "
            r5.<init>(r0)
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.ez3.k0(r4, r3)
            goto L_0x004f
        L_0x004a:
            nxc r3 = r0.e
            r3.V(r4)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd8.b(ic8, bd8):void");
    }

    public final void c(bd8 bd8) {
        ws6 t2 = this.g.e.t();
        for (int i2 = 0; i2 < t2.size(); i2++) {
            b((ic8) t2.get(i2), bd8);
        }
        try {
            bd8.a(this.h.h, 0);
        } catch (RemoteException e2) {
            ez3.B("Exception in using media1 API", e2);
        }
    }

    public final Handler d() {
        return this.l;
    }

    public final ic8 e() {
        ws6 t2 = this.g.H0().t();
        for (int i2 = 0; i2 < t2.size(); i2++) {
            ic8 ic8 = (ic8) t2.get(i2);
            if (h(ic8)) {
                return ic8;
            }
        }
        return null;
    }

    public final void f(eya eya) {
        this.c.a(false, false);
        c(new v48(eya));
        try {
            kd8 kd8 = this.h.h;
            uf4 uf4 = this.r.q;
            kd8.p();
        } catch (RemoteException e2) {
            ez3.B("Exception in using media1 API", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [k1, java.lang.Object] */
    public final void g(ic8 ic8, boolean z2) {
        if (o()) {
            boolean z3 = this.s.t1(16) && this.s.R0() != null;
            boolean z4 = this.s.t1(31) || this.s.t1(20);
            ic8 s2 = s(ic8);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            oyb.k(!false);
            sparseBooleanArray.append(1, true);
            oyb.k(!false);
            eya eya = new eya(new wi5(sparseBooleanArray));
            if (z3 || !z4) {
                if (!z3) {
                    ez3.j0("Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                oze.I(this.s);
                if (z2) {
                    p(s2);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            ? obj = new Object();
            obj.m(unsupportedOperationException);
            obj.c(new p36((Object) obj, 0, (Object) new ud(this, s2, z2, eya)), new eo1(2, this));
        }
    }

    public final boolean h(ic8 ic8) {
        return Objects.equals(ic8.a.a.a, this.f.getPackageName()) && ic8.b != 0 && new Bundle(ic8.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.a) {
            z2 = this.x;
        }
        return z2;
    }

    public final ch7 k(ic8 ic8, e8c e8c) {
        return this.e.j(this.k, s(ic8), e8c);
    }

    public final gc8 l(ic8 ic8) {
        ws6 ws6 = null;
        if (!this.z || !j(ic8)) {
            this.e.getClass();
            eya eya = gc8.e;
            w1d w1d = gc8.d;
            gc8 gc8 = new gc8(w1d, eya, (ws6) null);
            if (h(ic8)) {
                boolean z2 = true;
                this.z = true;
                qza qza = this.s;
                qza.c = this.k.a.A;
                if (qza.X.a(17) == eya.a(17)) {
                    z2 = false;
                }
                qza qza2 = this.s;
                qza2.o = w1d;
                qza2.X = eya;
                md8 md8 = this.h;
                if (z2) {
                    oze.W(md8.f.l, new fd8(md8, qza2, 0));
                } else {
                    md8.S(qza2);
                }
            }
            return gc8;
        }
        w1d w1d2 = gc8.d;
        w1d w1d3 = this.s.o;
        w1d3.getClass();
        eya eya2 = this.s.X;
        eya2.getClass();
        ws6 ws62 = this.s.c;
        if (ws62 != null) {
            ws6 = ws6.j(ws62);
        }
        return new gc8(w1d3, eya2, ws6);
    }

    public final bs6 m(ic8 ic8) {
        s(ic8);
        this.e.getClass();
        return swb.A(new p2d(-6));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(defpackage.ic8 r10, android.content.Intent r11) {
        /*
            r9 = this;
            android.os.Bundle r0 = r11.getExtras()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r2 = "android.intent.extra.KEY_EVENT"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0016
            android.os.Parcelable r0 = r0.getParcelable(r2)
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            android.content.ComponentName r2 = r11.getComponent()
            java.lang.String r11 = r11.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r11 = java.util.Objects.equals(r11, r3)
            r3 = 0
            if (r11 == 0) goto L_0x00ea
            android.content.Context r11 = r9.f
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r4 = r11.getPackageName()
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00ea
        L_0x003a:
            if (r0 == 0) goto L_0x00ea
            int r2 = r0.getAction()
            if (r2 == 0) goto L_0x0044
            goto L_0x00ea
        L_0x0044:
            r9.u()
            hk9 r2 = r9.e
            r2.getClass()
            int r2 = r0.getKeyCode()
            int r4 = defpackage.oze.a
            r5 = 21
            r6 = 1
            if (r4 < r5) goto L_0x005f
            boolean r11 = defpackage.yc8.a(r11)
            if (r11 == 0) goto L_0x005f
            r11 = r6
            goto L_0x0060
        L_0x005f:
            r11 = r3
        L_0x0060:
            int r4 = r10.b
            r5 = 85
            r7 = 79
            f18 r8 = r9.d
            if (r2 == r7) goto L_0x0082
            if (r2 == r5) goto L_0x0082
            java.lang.Object r10 = r8.b
            px4 r10 = (defpackage.px4) r10
            if (r10 == 0) goto L_0x007c
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            px4 r10 = (defpackage.px4) r10
            r8.b = r1
            r1 = r10
        L_0x007c:
            if (r1 == 0) goto L_0x00c3
            defpackage.oze.W(r8, r1)
            goto L_0x00c3
        L_0x0082:
            if (r11 != 0) goto L_0x00ae
            if (r4 != 0) goto L_0x00ae
            int r11 = r0.getRepeatCount()
            if (r11 == 0) goto L_0x008d
            goto L_0x00ae
        L_0x008d:
            java.lang.Object r11 = r8.b
            px4 r11 = (defpackage.px4) r11
            if (r11 == 0) goto L_0x009c
            if (r11 == 0) goto L_0x009a
            r8.removeCallbacks(r11)
            r8.b = r1
        L_0x009a:
            r10 = r6
            goto L_0x00c4
        L_0x009c:
            px4 r9 = new px4
            r11 = 14
            r9.<init>((java.lang.Object) r8, (java.lang.Object) r10, (java.lang.Object) r0, (int) r11)
            r8.b = r9
            int r10 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r10 = (long) r10
            r8.postDelayed(r9, r10)
            return r6
        L_0x00ae:
            java.lang.Object r10 = r8.b
            px4 r10 = (defpackage.px4) r10
            if (r10 == 0) goto L_0x00be
            r8.removeCallbacks(r10)
            java.lang.Object r10 = r8.b
            px4 r10 = (defpackage.px4) r10
            r8.b = r1
            r1 = r10
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            defpackage.oze.W(r8, r1)
        L_0x00c3:
            r10 = r3
        L_0x00c4:
            boolean r11 = r9.z
            if (r11 != 0) goto L_0x00e5
            md8 r9 = r9.h
            if (r2 == r5) goto L_0x00ce
            if (r2 != r7) goto L_0x00d4
        L_0x00ce:
            if (r10 == 0) goto L_0x00d4
            r9.C()
            return r6
        L_0x00d4:
            if (r4 == 0) goto L_0x00e4
            vc8 r9 = r9.j
            mn r9 = r9.b
            java.lang.Object r9 = r9.b
            v38 r9 = (defpackage.v38) r9
            android.media.session.MediaController r9 = r9.a
            r9.dispatchMediaButtonEvent(r0)
            return r6
        L_0x00e4:
            return r3
        L_0x00e5:
            boolean r9 = r9.a(r0, r10)
            return r9
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd8.n(ic8, android.content.Intent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [k1, java.lang.Object] */
    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ? obj = new Object();
            this.o.post(new zo5(this, 18, obj));
            try {
                return ((Boolean) obj.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            wwc wwc = this.v;
            if (wwc == null) {
                return true;
            }
            wwc.getClass();
            int i2 = oze.a;
            if (i2 < 31 || i2 >= 33) {
                return true;
            }
            vd8 vd8 = (vd8) wwc.b;
            if (!vd8.c().b) {
                return vd8.f(this.k, true);
            }
            return true;
        }
    }

    public final void p(ic8 ic8) {
        s(ic8);
        this.e.getClass();
    }

    public final a4d q(ic8 ic8, e8c e8c, int i2, long j2) {
        return oze.g0(this.e.j(this.k, s(ic8), e8c), new y85(i2, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r0 = r8.d;
        r1 = (defpackage.px4) r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r0.removeCallbacks(r1);
        r0.b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r8.l.removeCallbacksAndMessages((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        defpackage.oze.W(r8.l, new defpackage.wc8(r8, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        defpackage.ez3.k0("Exception thrown while closing", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Release "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r8)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.oze.e
            r0.append(r1)
            java.lang.String r1 = "] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.g78.b()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.ez3.M(r0)
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.x     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0040
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r8 = move-exception
            goto L_0x00fa
        L_0x0040:
            r1 = 1
            r8.x = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            f18 r0 = r8.d
            java.lang.Object r1 = r0.b
            px4 r1 = (defpackage.px4) r1
            r2 = 0
            if (r1 == 0) goto L_0x0052
            r0.removeCallbacks(r1)
            r0.b = r2
        L_0x0052:
            android.os.Handler r0 = r8.l
            r0.removeCallbacksAndMessages(r2)
            android.os.Handler r0 = r8.l     // Catch:{ Exception -> 0x0063 }
            wc8 r1 = new wc8     // Catch:{ Exception -> 0x0063 }
            r3 = 0
            r1.<init>(r8, r3)     // Catch:{ Exception -> 0x0063 }
            defpackage.oze.W(r0, r1)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            r0 = move-exception
            java.lang.String r1 = "Exception thrown while closing"
            defpackage.ez3.k0(r1, r0)
        L_0x0069:
            md8 r0 = r8.h
            r0.getClass()
            int r1 = defpackage.oze.a
            cd8 r3 = r0.f
            vc8 r4 = r0.j
            r5 = 31
            if (r1 >= r5) goto L_0x00a0
            android.content.ComponentName r1 = r0.l
            if (r1 != 0) goto L_0x0084
            qc8 r1 = r4.a
            android.media.session.MediaSession r1 = r1.a
            r1.setMediaButtonReceiver(r2)
            goto L_0x00a0
        L_0x0084:
            android.content.Intent r5 = new android.content.Intent
            android.net.Uri r6 = r3.b
            java.lang.String r7 = "android.intent.action.MEDIA_BUTTON"
            r5.<init>(r7, r6)
            r5.setComponent(r1)
            android.content.Context r1 = r3.f
            int r6 = defpackage.md8.q
            r7 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r1, r7, r5, r6)
            qc8 r5 = r4.a
            android.media.session.MediaSession r5 = r5.a
            r5.setMediaButtonReceiver(r1)
        L_0x00a0:
            an r0 = r0.k
            if (r0 == 0) goto L_0x00a9
            android.content.Context r1 = r3.f
            r1.unregisterReceiver(r0)
        L_0x00a9:
            qc8 r0 = r4.a
            android.os.RemoteCallbackList r1 = r0.f
            r1.kill()
            android.media.session.MediaSession r1 = r0.a
            r1.setCallback(r2)
            oc8 r0 = r0.b
            java.util.concurrent.atomic.AtomicReference r0 = r0.c
            r0.set(r2)
            r1.release()
            me8 r8 = r8.g
            nxc r0 = r8.e
            ws6 r0 = r0.t()
            java.util.Iterator r0 = r0.iterator()
        L_0x00cb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r0.next()
            ic8 r1 = (defpackage.ic8) r1
            hc8 r1 = r1.d
            if (r1 == 0) goto L_0x00cb
            r1.onDisconnected()     // Catch:{ RemoteException -> 0x00cb }
            goto L_0x00cb
        L_0x00df:
            java.util.Set r8 = r8.f
            java.util.Iterator r8 = r8.iterator()
        L_0x00e5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r8.next()
            ic8 r0 = (defpackage.ic8) r0
            hc8 r0 = r0.d
            if (r0 == 0) goto L_0x00e5
            r0.onDisconnected()     // Catch:{ RemoteException -> 0x00e5 }
            goto L_0x00e5
        L_0x00f9:
            return
        L_0x00fa:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd8.r():void");
    }

    public final ic8 s(ic8 ic8) {
        if (!this.z || !j(ic8)) {
            return ic8;
        }
        ic8 e2 = e();
        e2.getClass();
        return e2;
    }

    public final void t() {
        Handler handler = this.l;
        wc8 wc8 = this.n;
        handler.removeCallbacks(wc8);
        if (this.q) {
            long j2 = this.y;
            if (j2 <= 0) {
                return;
            }
            if (this.s.a() || this.s.b()) {
                handler.postDelayed(wc8, j2);
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
