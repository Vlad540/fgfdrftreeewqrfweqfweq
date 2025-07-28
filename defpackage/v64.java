package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: v64  reason: default package */
public final class v64 implements zn4 {
    public final List a;
    public final m35 b;
    public final nu7 c;
    public final za6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final au3 i;
    public final mk9 j;
    public final cza k;
    public final e06 l;
    public final UUID m;
    public final Looper n;
    public final fx o;
    public int p;
    public int q;
    public HandlerThread r;
    public r64 s;
    public mw3 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public i35 x;
    public k35 y;

    public v64(UUID uuid, m35 m35, nu7 nu7, za6 za6, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, e06 e06, Looper looper, mk9 mk9, cza cza) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = nu7;
        this.d = za6;
        this.b = m35;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = e06;
        this.i = new au3(1);
        this.j = mk9;
        this.k = cza;
        this.p = 2;
        this.n = looper;
        this.o = new fx(this, looper, 3);
    }

    public final UUID a() {
        p();
        return this.m;
    }

    public final boolean b() {
        p();
        return this.f;
    }

    public final boolean c(String str) {
        p();
        byte[] bArr = this.v;
        oyb.l(bArr);
        return this.b.e(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    public final mw3 e() {
        p();
        return this.t;
    }

    public final void f(fo4 fo4) {
        p();
        int i2 = this.q;
        if (i2 <= 0) {
            ez3.A("release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.q = i3;
        if (i3 == 0) {
            this.p = 0;
            fx fxVar = this.o;
            int i4 = oze.a;
            fxVar.removeCallbacksAndMessages((Object) null);
            r64 r64 = this.s;
            synchronized (r64) {
                r64.removeCallbacksAndMessages((Object) null);
                r64.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.h(bArr);
                this.v = null;
            }
        }
        if (fo4 != null) {
            au3 au3 = this.i;
            synchronized (au3.b) {
                try {
                    Integer num = (Integer) au3.c.get(fo4);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(au3.X);
                        arrayList.remove(fo4);
                        au3.X = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            au3.c.remove(fo4);
                            HashSet hashSet = new HashSet(au3.o);
                            hashSet.remove(fo4);
                            au3.o = Collections.unmodifiableSet(hashSet);
                        } else {
                            au3.c.put(fo4, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.i.a(fo4) == 0) {
                fo4.f();
            }
        }
        za6 za6 = this.d;
        int i5 = this.q;
        z64 z64 = (z64) za6.a;
        if (i5 == 1 && z64.p > 0 && z64.l != -9223372036854775807L) {
            z64.o.add(this);
            Handler handler = z64.u;
            handler.getClass();
            handler.postAtTime(new ds1(26, this), this, SystemClock.uptimeMillis() + z64.l);
        } else if (i5 == 0) {
            z64.m.remove(this);
            if (z64.r == this) {
                z64.r = null;
            }
            if (z64.s == this) {
                z64.s = null;
            }
            nu7 nu7 = z64.i;
            HashSet hashSet2 = (HashSet) nu7.a;
            hashSet2.remove(this);
            if (((v64) nu7.b) == this) {
                nu7.b = null;
                if (!hashSet2.isEmpty()) {
                    v64 v64 = (v64) hashSet2.iterator().next();
                    nu7.b = v64;
                    k35 b2 = v64.b.b();
                    v64.y = b2;
                    r64 r642 = v64.s;
                    int i6 = oze.a;
                    b2.getClass();
                    r642.getClass();
                    r642.obtainMessage(1, new t64(yi7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                }
            }
            if (z64.l != -9223372036854775807L) {
                Handler handler2 = z64.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                z64.o.remove(this);
            }
        }
        z64.j();
    }

    public final void g(fo4 fo4) {
        p();
        boolean z = false;
        if (this.q < 0) {
            ez3.A("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (fo4 != null) {
            au3 au3 = this.i;
            synchronized (au3.b) {
                try {
                    ArrayList arrayList = new ArrayList(au3.X);
                    arrayList.add(fo4);
                    au3.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) au3.c.get(fo4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(au3.o);
                        hashSet.add(fo4);
                        au3.o = Collections.unmodifiableSet(hashSet);
                    }
                    au3.c.put(fo4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            oyb.k(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new r64(this, this.r.getLooper(), 1);
            if (l()) {
                h(true);
            }
        } else if (fo4 != null && i() && this.i.a(fo4) == 1) {
            fo4.d(this.p);
        }
        z64 z64 = (z64) this.d.a;
        if (z64.l != -9223372036854775807L) {
            z64.o.remove(this);
            Handler handler = z64.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        p();
        return this.p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089 A[Catch:{ NumberFormatException -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.v
            int r1 = defpackage.oze.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0038
            if (r1 == r2) goto L_0x0038
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f8
        L_0x0018:
            byte[] r1 = r10.w
            r1.getClass()
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.w
            r10.m(r0, r1, r11)
            goto L_0x00f8
        L_0x0029:
            byte[] r1 = r10.w
            if (r1 == 0) goto L_0x0033
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x0033:
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x0038:
            byte[] r1 = r10.w
            if (r1 != 0) goto L_0x0041
            r10.m(r2, r0, r11)
            goto L_0x00f8
        L_0x0041:
            int r1 = r10.p
            r2 = 4
            if (r1 == r2) goto L_0x004c
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x004c:
            java.util.UUID r1 = defpackage.yu0.d
            java.util.UUID r4 = r10.m
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005c
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00ac
        L_0x005c:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0064
            r1 = 0
            goto L_0x0095
        L_0x0064:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x007a }
            if (r5 == 0) goto L_0x007a
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r8 = r6
        L_0x007b:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x008d }
            if (r1 == 0) goto L_0x008d
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
        L_0x008d:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r1)
            r1 = r4
        L_0x0095:
            r1.getClass()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r4 = java.lang.Math.min(r4, r6)
        L_0x00ac:
            int r1 = r10.e
            if (r1 != 0) goto L_0x00cb
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x00cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Offline license has expired or will expire soon. Remaining seconds: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.ez3.v(r1)
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x00cb:
            r0 = 0
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00da
            androidx.media3.exoplayer.drm.KeysExpiredException r11 = new androidx.media3.exoplayer.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f8
        L_0x00da:
            r10.p = r2
            au3 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f9 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r10.next()
            fo4 r11 = (defpackage.fo4) r11
            r11.c()
            goto L_0x00e8
        L_0x00f8:
            return
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v64.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.p;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Throwable th, int i2) {
        int i3;
        Set<fo4> set;
        int i4 = oze.a;
        if (i4 < 21 || !qo4.a(th)) {
            if (i4 < 23 || !so4.a(th)) {
                if (!(th instanceof NotProvisionedException) && !ct0.x(th)) {
                    if (th instanceof DeniedByServerException) {
                        i3 = 6007;
                    } else if (th instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (th instanceof KeysExpiredException) {
                        i3 = 6008;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = 6004;
                        } else if (i2 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = 6002;
            }
            i3 = 6006;
        } else {
            i3 = qo4.b(th);
        }
        this.u = new DrmSession$DrmSessionException(th, i3);
        ez3.B("DRM session error", th);
        if (th instanceof Exception) {
            au3 au3 = this.i;
            synchronized (au3.b) {
                set = au3.o;
            }
            for (fo4 e2 : set) {
                e2.e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        } else if (!ct0.y(th) && !ct0.x(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || ct0.x(th)) {
            this.c.z(this);
        } else {
            j(th, z ? 1 : 2);
        }
    }

    public final boolean l() {
        Set<fo4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] d2 = this.b.d();
            this.v = d2;
            this.b.w(d2, this.k);
            this.t = this.b.c(this.v);
            this.p = 3;
            au3 au3 = this.i;
            synchronized (au3.b) {
                set = au3.o;
            }
            for (fo4 d3 : set) {
                d3.d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.z(this);
            return false;
        } catch (Exception | NoSuchMethodError e2) {
            if (ct0.x(e2)) {
                this.c.z(this);
                return false;
            }
            j(e2, 1);
            return false;
        }
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            i35 k2 = this.b.k(bArr, this.a, i2, this.h);
            this.x = k2;
            r64 r64 = this.s;
            int i3 = oze.a;
            k2.getClass();
            r64.getClass();
            r64.obtainMessage(2, new t64(yi7.b.getAndIncrement(), z, SystemClock.elapsedRealtime(), k2)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    public final boolean o() {
        try {
            this.b.g(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e2) {
            j(e2, 1);
            return false;
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            ez3.k0("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
