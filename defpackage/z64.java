package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: z64  reason: default package */
public final class z64 implements no4 {
    public final UUID b;
    public final hs1 c;
    public final e06 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final nu7 i = new nu7(15, false);
    public final mk9 j;
    public final za6 k = new za6((Object) this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = gp0.B();
    public final Set o = gp0.B();
    public int p;
    public m35 q;
    public v64 r;
    public v64 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public cza x;
    public volatile fx y;

    public z64(UUID uuid, e06 e06, HashMap hashMap, boolean z, int[] iArr, boolean z2, mk9 mk9, long j2) {
        hs1 hs1 = nz5.Y;
        uuid.getClass();
        oyb.c("Use C.CLEARKEY_UUID instead", !yu0.b.equals(uuid));
        this.b = uuid;
        this.c = hs1;
        this.d = e06;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = mk9;
        this.l = j2;
    }

    public static boolean f(v64 v64) {
        v64.p();
        if (v64.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException d2 = v64.d();
        d2.getClass();
        Throwable cause = d2.getCause();
        return (cause instanceof ResourceBusyException) || ct0.y(cause);
    }

    public static ArrayList i(xn4 xn4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(xn4.o);
        for (int i2 = 0; i2 < xn4.o; i2++) {
            vn4 vn4 = xn4.a[i2];
            if ((vn4.a(uuid) || (yu0.c.equals(uuid) && vn4.a(yu0.b))) && (vn4.X != null || z)) {
                arrayList.add(vn4);
            }
        }
        return arrayList;
    }

    public final zn4 a(fo4 fo4, xu5 xu5) {
        boolean z = false;
        k(false);
        if (this.p > 0) {
            z = true;
        }
        oyb.k(z);
        oyb.l(this.t);
        return e(this.t, fo4, xu5, true);
    }

    public final lo4 b(fo4 fo4, xu5 xu5) {
        oyb.k(this.p > 0);
        oyb.l(this.t);
        x64 x64 = new x64(this, fo4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new dr1(x64, 20, xu5));
        return x64;
    }

    public final void c(Looper looper, cza cza) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    oyb.k(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = cza;
    }

    public final int d(xu5 xu5) {
        k(false);
        m35 m35 = this.q;
        m35.getClass();
        int l2 = m35.l();
        xn4 xn4 = xu5.r;
        if (xn4 == null) {
            int g2 = c49.g(xu5.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                return l2;
            }
            return 0;
        } else if (this.w != null) {
            return l2;
        } else {
            UUID uuid = this.b;
            if (i(xn4, uuid, true).isEmpty()) {
                if (xn4.o == 1 && xn4.a[0].a(yu0.b)) {
                    ez3.j0("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = xn4.c;
            if (str == null || "cenc".equals(str)) {
                return l2;
            }
            if ("cbcs".equals(str)) {
                if (oze.a >= 25) {
                    return l2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return l2;
            }
            return 1;
        }
    }

    public final zn4 e(Looper looper, fo4 fo4, xu5 xu5, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new fx(this, looper, 5);
        }
        xn4 xn4 = xu5.r;
        int i2 = 0;
        v64 v64 = null;
        if (xn4 == null) {
            int g2 = c49.g(xu5.n);
            m35 m35 = this.q;
            m35.getClass();
            if (m35.l() == 2 && jz5.c) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1 || m35.l() == 1) {
                return null;
            }
            v64 v642 = this.r;
            if (v642 == null) {
                po5 po5 = ws6.b;
                v64 h2 = h(e8c.X, true, (fo4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                v642.g((fo4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(xn4, this.b, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.b);
                ez3.B("DRM error", exc);
                if (fo4 != null) {
                    fo4.e(exc);
                }
                return new a05(new DrmSession$DrmSessionException(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v64 v643 = (v64) it.next();
                if (oze.a(v643.a, arrayList)) {
                    v64 = v643;
                    break;
                }
            }
        } else {
            v64 = this.s;
        }
        if (v64 == null) {
            v64 = h(arrayList, false, fo4, z);
            if (!this.f) {
                this.s = v64;
            }
            this.m.add(v64);
        } else {
            v64.g(fo4);
        }
        return v64;
    }

    public final v64 g(List list, boolean z, fo4 fo4) {
        this.q.getClass();
        m35 m35 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        cza cza = this.x;
        cza.getClass();
        e06 e06 = this.d;
        mk9 mk9 = this.j;
        mk9 mk92 = mk9;
        v64 v64 = new v64(this.b, m35, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, e06, looper, mk92, cza);
        v64.g(fo4);
        if (this.l != -9223372036854775807L) {
            v64.g((fo4) null);
        }
        return v64;
    }

    public final v64 h(List list, boolean z, fo4 fo4, boolean z2) {
        v64 g2 = g(list, z, fo4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            rue g3 = gt6.j(set).iterator();
            while (g3.hasNext()) {
                ((zn4) g3.next()).f((fo4) null);
            }
            g2.f(fo4);
            if (j2 != -9223372036854775807L) {
                g2.f((fo4) null);
            }
            g2 = g(list, z, fo4);
        }
        if (!f(g2) || !z2) {
            return g2;
        }
        Set set2 = this.n;
        if (set2.isEmpty()) {
            return g2;
        }
        rue g4 = gt6.j(set2).iterator();
        while (g4.hasNext()) {
            ((x64) g4.next()).release();
        }
        if (!set.isEmpty()) {
            rue g5 = gt6.j(set).iterator();
            while (g5.hasNext()) {
                ((zn4) g5.next()).f((fo4) null);
            }
        }
        g2.f(fo4);
        if (j2 != -9223372036854775807L) {
            g2.f((fo4) null);
        }
        return g(list, z, fo4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            m35 m35 = this.q;
            m35.getClass();
            m35.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (!z || this.t != null) {
            Thread currentThread = Thread.currentThread();
            Looper looper = this.t;
            looper.getClass();
            if (currentThread != looper.getThread()) {
                ez3.k0("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
                return;
            }
            return;
        }
        ez3.k0("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: nz5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: nz5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: nz5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void prepare() {
        /*
            r4 = this;
            r0 = 1
            r4.k(r0)
            int r0 = r4.p
            int r1 = r0 + 1
            r4.p = r1
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            m35 r0 = r4.q
            if (r0 != 0) goto L_0x0057
            java.util.UUID r0 = r4.b
            hs1 r1 = r4.c
            r1.getClass()
            nz5 r1 = new nz5     // Catch:{ UnsupportedSchemeException -> 0x0021, Exception -> 0x001f }
            r2 = 1
            r1.<init>(r0, r2)     // Catch:{ UnsupportedSchemeException -> 0x0021, Exception -> 0x001f }
            goto L_0x004a
        L_0x001f:
            r1 = move-exception
            goto L_0x0023
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            androidx.media3.exoplayer.drm.UnsupportedDrmException r2 = new androidx.media3.exoplayer.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002f }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002f }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002f }
        L_0x0029:
            androidx.media3.exoplayer.drm.UnsupportedDrmException r2 = new androidx.media3.exoplayer.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002f }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002f }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002f }
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to instantiate a FrameworkMediaDrm for uuid: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.ez3.A(r0)
            oa2 r1 = new oa2
            r1.<init>()
        L_0x004a:
            r4.q = r1
            mv4 r0 = new mv4
            r2 = 11
            r0.<init>(r2, r4)
            r1.o(r0)
            goto L_0x0078
        L_0x0057:
            long r0 = r4.l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            r0 = 0
        L_0x0063:
            java.util.ArrayList r1 = r4.m
            int r2 = r1.size()
            if (r0 >= r2) goto L_0x0078
            java.lang.Object r1 = r1.get(r0)
            v64 r1 = (defpackage.v64) r1
            r2 = 0
            r1.g(r2)
            int r0 = r0 + 1
            goto L_0x0063
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z64.prepare():void");
    }

    public final void release() {
        k(true);
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((v64) arrayList.get(i3)).f((fo4) null);
                }
            }
            rue g2 = gt6.j(this.n).iterator();
            while (g2.hasNext()) {
                ((x64) g2.next()).release();
            }
            j();
        }
    }
}
