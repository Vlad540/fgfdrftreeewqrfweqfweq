package defpackage;

import java.util.HashMap;

/* renamed from: d94  reason: default package */
public final class d94 implements pi7 {
    public final l34 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f = -1;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public d94(l34 l34, int i2, int i3, int i4, int i5, boolean z) {
        l("bufferForPlaybackMs", i4, 0, "0");
        l("bufferForPlaybackAfterRebufferMs", i5, 0, "0");
        l("minBufferMs", i2, i4, "bufferForPlaybackMs");
        l("minBufferMs", i2, i5, "bufferForPlaybackAfterRebufferMs");
        l("maxBufferMs", i3, i2, "minBufferMs");
        l("backBufferDurationMs", 0, 0, "0");
        this.a = l34;
        this.b = oze.S((long) i2);
        this.c = oze.S((long) i3);
        this.d = oze.S((long) i4);
        this.e = oze.S((long) i5);
        this.g = z;
        this.h = oze.S((long) 0);
        this.i = false;
        this.j = new HashMap();
        this.k = -1;
    }

    public static void l(String str, int i2, int i3, String str2) {
        boolean z = i2 >= i3;
        oyb.c(str + " cannot be less than " + str2, z);
    }

    public final boolean a() {
        return this.i;
    }

    public final void c(cza cza) {
        if (this.j.remove(cza) != null) {
            boolean isEmpty = this.j.isEmpty();
            l34 l34 = this.a;
            if (isEmpty) {
                synchronized (l34) {
                    if (l34.b) {
                        l34.c(0);
                    }
                }
            } else {
                l34.c(m());
            }
        }
        if (this.j.isEmpty()) {
            this.k = -1;
        }
    }

    public final void d(cza cza) {
        if (this.j.remove(cza) != null) {
            boolean isEmpty = this.j.isEmpty();
            l34 l34 = this.a;
            if (isEmpty) {
                synchronized (l34) {
                    if (l34.b) {
                        l34.c(0);
                    }
                }
                return;
            }
            l34.c(m());
        }
    }

    public final long f() {
        return this.h;
    }

    public final void g(cza cza) {
        long id = Thread.currentThread().getId();
        long j2 = this.k;
        oyb.j("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j2 == -1 || j2 == id);
        this.k = id;
        HashMap hashMap = this.j;
        if (!hashMap.containsKey(cza)) {
            hashMap.put(cza, new Object());
        }
        b94 b94 = (b94) hashMap.get(cza);
        b94.getClass();
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        b94.b = i2;
        b94.a = false;
    }

    public final void h(cza cza, qi0[] qi0Arr, g55[] g55Arr) {
        b94 b94 = (b94) this.j.get(cza);
        b94.getClass();
        int i2 = this.f;
        if (i2 == -1) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 13107200;
                if (i3 < qi0Arr.length) {
                    if (g55Arr[i3] != null) {
                        switch (qi0Arr[i3].b) {
                            case -2:
                                i5 = 0;
                                break;
                            case 0:
                                i5 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i5 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i5 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i4 += i5;
                    }
                    i3++;
                } else {
                    i2 = Math.max(13107200, i4);
                }
            }
        }
        b94.b = i2;
        boolean isEmpty = this.j.isEmpty();
        l34 l34 = this.a;
        if (isEmpty) {
            synchronized (l34) {
                if (l34.b) {
                    l34.c(0);
                }
            }
            return;
        }
        l34.c(m());
    }

    public final boolean i(oi7 oi7) {
        b94 b94 = (b94) this.j.get(oi7.a);
        b94.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= m();
        float f2 = oi7.c;
        int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        long j2 = this.c;
        long j3 = this.b;
        if (i2 > 0) {
            j3 = Math.min(oze.A(f2, j3), j2);
        }
        long max = Math.max(j3, 500000);
        long j4 = oi7.b;
        if (j4 < max) {
            if (!this.g && z2) {
                z = false;
            }
            b94.a = z;
            if (!z && j4 < 500000) {
                ez3.j0("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j2 || z2) {
            b94.a = false;
        }
        return b94.a;
    }

    public final l34 j() {
        return this.a;
    }

    public final boolean k(oi7 oi7) {
        long E = oze.E(oi7.c, oi7.b);
        long j2 = oi7.d ? this.e : this.d;
        long j3 = oi7.e;
        if (j3 != -9223372036854775807L) {
            j2 = Math.min(j3 / 2, j2);
        }
        return j2 <= 0 || E >= j2 || (!this.g && this.a.a() >= m());
    }

    public final int m() {
        int i2 = 0;
        for (b94 b94 : this.j.values()) {
            i2 += b94.b;
        }
        return i2;
    }
}
