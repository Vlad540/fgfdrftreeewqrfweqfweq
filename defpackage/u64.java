package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: u64  reason: default package */
public final class u64 implements yn4 {
    public final List a;
    public final l35 b;
    public final qe4 c;
    public final ea6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final au3 i;
    public final lk9 j;
    public final bza k;
    public final e06 l;
    public final UUID m;
    public final fx n;
    public int o;
    public int p;
    public HandlerThread q;
    public r64 r;
    public lw3 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public h35 w;
    public j35 x;

    public u64(UUID uuid, l35 l35, qe4 qe4, ea6 ea6, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, e06 e06, Looper looper, lk9 lk9, bza bza) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = qe4;
        this.d = ea6;
        this.b = l35;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = e06;
        this.i = new au3(0);
        this.j = lk9;
        this.k = bza;
        this.o = 2;
        this.n = new fx(this, looper, 2);
    }

    public final UUID a() {
        return this.m;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c(String str) {
        byte[] bArr = this.u;
        swb.i(bArr);
        return this.b.e(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    public final lw3 e() {
        return this.s;
    }

    public final void f(eo4 eo4) {
        int i2 = this.p;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.p = i3;
            if (i3 == 0) {
                this.o = 0;
                fx fxVar = this.n;
                int i4 = mze.a;
                fxVar.removeCallbacksAndMessages((Object) null);
                r64 r64 = this.r;
                synchronized (r64) {
                    r64.removeCallbacksAndMessages((Object) null);
                    r64.b = true;
                }
                this.r = null;
                this.q.quit();
                this.q = null;
                this.s = null;
                this.t = null;
                this.w = null;
                this.x = null;
                byte[] bArr = this.u;
                if (bArr != null) {
                    this.b.h(bArr);
                    this.u = null;
                }
            }
            if (eo4 != null) {
                au3 au3 = this.i;
                synchronized (au3.b) {
                    try {
                        Integer num = (Integer) au3.c.get(eo4);
                        if (num != null) {
                            ArrayList arrayList = new ArrayList(au3.X);
                            arrayList.remove(eo4);
                            au3.X = Collections.unmodifiableList(arrayList);
                            if (num.intValue() == 1) {
                                au3.c.remove(eo4);
                                HashSet hashSet = new HashSet(au3.o);
                                hashSet.remove(eo4);
                                au3.o = Collections.unmodifiableSet(hashSet);
                            } else {
                                au3.c.put(eo4, Integer.valueOf(num.intValue() - 1));
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (this.i.a(eo4) == 0) {
                    eo4.f();
                }
            }
            ea6 ea6 = this.d;
            int i5 = this.p;
            y64 y64 = (y64) ea6.b;
            if (i5 == 1 && y64.p > 0 && y64.l != -9223372036854775807L) {
                y64.o.add(this);
                Handler handler = y64.u;
                handler.getClass();
                handler.postAtTime(new ds1(25, this), this, SystemClock.uptimeMillis() + y64.l);
            } else if (i5 == 0) {
                y64.m.remove(this);
                if (y64.r == this) {
                    y64.r = null;
                }
                if (y64.s == this) {
                    y64.s = null;
                }
                qe4 qe4 = y64.i;
                HashSet hashSet2 = (HashSet) qe4.b;
                hashSet2.remove(this);
                if (((u64) qe4.c) == this) {
                    qe4.c = null;
                    if (!hashSet2.isEmpty()) {
                        u64 u64 = (u64) hashSet2.iterator().next();
                        qe4.c = u64;
                        j35 b2 = u64.b.b();
                        u64.x = b2;
                        r64 r642 = u64.r;
                        int i6 = mze.a;
                        b2.getClass();
                        r642.getClass();
                        r642.obtainMessage(0, new s64(xi7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                    }
                }
                if (y64.l != -9223372036854775807L) {
                    Handler handler2 = y64.u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(this);
                    y64.o.remove(this);
                }
            }
            y64.j();
        }
    }

    public final void g(eo4 eo4) {
        boolean z = false;
        if (this.p < 0) {
            this.p = 0;
        }
        if (eo4 != null) {
            au3 au3 = this.i;
            synchronized (au3.b) {
                try {
                    ArrayList arrayList = new ArrayList(au3.X);
                    arrayList.add(eo4);
                    au3.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) au3.c.get(eo4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(au3.o);
                        hashSet.add(eo4);
                        au3.o = Collections.unmodifiableSet(hashSet);
                    }
                    au3.c.put(eo4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 == 1) {
            if (this.o == 2) {
                z = true;
            }
            swb.h(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new r64(this, this.q.getLooper(), 0);
            if (l()) {
                h(true);
            }
        } else if (eo4 != null && i() && this.i.a(eo4) == 1) {
            eo4.d(this.o);
        }
        y64 y64 = (y64) this.d.b;
        if (y64.l != -9223372036854775807L) {
            y64.o.remove(this);
            Handler handler = y64.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ NumberFormatException -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.u
            int r1 = defpackage.mze.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x003e
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f3
        L_0x0018:
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.u
            r1.getClass()
            byte[] r1 = r10.v
            r10.m(r0, r1, r11)
            goto L_0x00f3
        L_0x0029:
            byte[] r1 = r10.v
            if (r1 == 0) goto L_0x0039
            l35 r4 = r10.b     // Catch:{ Exception -> 0x0033 }
            r4.g(r0, r1)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0039:
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x003e:
            byte[] r1 = r10.v
            if (r1 != 0) goto L_0x0047
            r10.m(r2, r0, r11)
            goto L_0x00f3
        L_0x0047:
            int r4 = r10.o
            r5 = 4
            if (r4 == r5) goto L_0x0058
            l35 r4 = r10.b     // Catch:{ Exception -> 0x0052 }
            r4.g(r0, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0058:
            java.util.UUID r1 = defpackage.vu0.d
            java.util.UUID r2 = r10.m
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b8
        L_0x0068:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0070
            r1 = 0
            goto L_0x00a1
        L_0x0070:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x0086 }
            if (r4 == 0) goto L_0x0086
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0099 }
            if (r1 == 0) goto L_0x0099
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0099 }
        L_0x0099:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2.<init>(r4, r1)
            r1 = r2
        L_0x00a1:
            r1.getClass()
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r6, r1)
        L_0x00b8:
            int r4 = r10.e
            if (r4 != 0) goto L_0x00c6
            r6 = 60
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00c6
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x00c6:
            r6 = 0
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00d5
            com.google.android.exoplayer2.drm.KeysExpiredException r11 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f3
        L_0x00d5:
            r10.o = r5
            au3 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f4 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f3
            java.lang.Object r11 = r10.next()
            eo4 r11 = (defpackage.eo4) r11
            r11.c()
            goto L_0x00e3
        L_0x00f3:
            return
        L_0x00f4:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u64.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.o;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Exception exc, int i2) {
        int i3;
        Set<eo4> set;
        int i4 = mze.a;
        if (i4 < 21 || !po4.a(exc)) {
            if (i4 < 23 || !ro4.a(exc)) {
                if (i4 < 18 || !oo4.b(exc)) {
                    if (i4 >= 18 && oo4.a(exc)) {
                        i3 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
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
            i3 = po4.b(exc);
        }
        this.t = new DrmSession$DrmSessionException(exc, i3);
        oyb.b("DRM session error", exc);
        au3 au3 = this.i;
        synchronized (au3.b) {
            set = au3.o;
        }
        for (eo4 e2 : set) {
            e2.e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void k(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            qe4 qe4 = this.c;
            ((HashSet) qe4.b).add(this);
            if (((u64) qe4.c) == null) {
                qe4.c = this;
                j35 b2 = this.b.b();
                this.x = b2;
                r64 r64 = this.r;
                int i2 = mze.a;
                b2.getClass();
                r64.getClass();
                r64.obtainMessage(0, new s64(xi7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                return;
            }
            return;
        }
        j(exc, z ? 1 : 2);
    }

    public final boolean l() {
        Set<eo4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] d2 = this.b.d();
            this.u = d2;
            this.b.p(d2, this.k);
            this.s = this.b.c(this.u);
            this.o = 3;
            au3 au3 = this.i;
            synchronized (au3.b) {
                set = au3.o;
            }
            for (eo4 d3 : set) {
                d3.d(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qe4 qe4 = this.c;
            ((HashSet) qe4.b).add(this);
            if (((u64) qe4.c) == null) {
                qe4.c = this;
                j35 b2 = this.b.b();
                this.x = b2;
                r64 r64 = this.r;
                int i2 = mze.a;
                b2.getClass();
                r64.getClass();
                r64.obtainMessage(0, new s64(xi7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
            }
        } catch (Exception e2) {
            j(e2, 1);
        }
        return false;
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            h35 k2 = this.b.k(bArr, this.a, i2, this.h);
            this.w = k2;
            r64 r64 = this.r;
            int i3 = mze.a;
            k2.getClass();
            r64.getClass();
            r64.obtainMessage(1, new s64(xi7.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), k2)).sendToTarget();
        } catch (Exception e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }
}
