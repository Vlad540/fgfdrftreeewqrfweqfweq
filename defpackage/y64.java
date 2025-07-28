package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: y64  reason: default package */
public final class y64 implements mo4 {
    public final UUID b;
    public final hs1 c;
    public final e06 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final qe4 i = new qe4(15);
    public final lk9 j;
    public final ea6 k = new ea6(12, this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = gp0.B();
    public final Set o = gp0.B();
    public int p;
    public l35 q;
    public u64 r;
    public u64 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public bza x;
    public volatile fx y;

    public y64(UUID uuid, e06 e06, HashMap hashMap, boolean z, int[] iArr, boolean z2, lk9 lk9, long j2) {
        hs1 hs1 = nz5.X;
        uuid.getClass();
        swb.d("Use C.CLEARKEY_UUID instead", !vu0.b.equals(uuid));
        this.b = uuid;
        this.c = hs1;
        this.d = e06;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = lk9;
        this.l = j2;
    }

    public static boolean f(u64 u64) {
        if (u64.o == 1) {
            if (mze.a < 19) {
                return true;
            }
            DrmSession$DrmSessionException d2 = u64.d();
            d2.getClass();
            if (d2.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(wn4 wn4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(wn4.o);
        for (int i2 = 0; i2 < wn4.o; i2++) {
            un4 un4 = wn4.a[i2];
            if ((un4.a(uuid) || (vu0.c.equals(uuid) && un4.a(vu0.b))) && (un4.X != null || z)) {
                arrayList.add(un4);
            }
        }
        return arrayList;
    }

    public final yn4 a(eo4 eo4, vu5 vu5) {
        swb.h(this.p > 0);
        swb.i(this.t);
        return e(this.t, eo4, vu5, true);
    }

    public final int b(vu5 vu5) {
        l35 l35 = this.q;
        l35.getClass();
        int l2 = l35.l();
        wn4 wn4 = vu5.D0;
        if (wn4 == null) {
            int g2 = b49.g(vu5.A0);
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
            if (i(wn4, uuid, true).isEmpty()) {
                if (wn4.o == 1 && wn4.a[0].a(vu0.b)) {
                    new StringBuilder(String.valueOf(uuid).length() + 72);
                }
                return 1;
            }
            String str = wn4.c;
            if (str == null || "cenc".equals(str)) {
                return l2;
            }
            if ("cbcs".equals(str)) {
                if (mze.a >= 25) {
                    return l2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return l2;
            }
            return 1;
        }
    }

    public final void c(Looper looper, bza bza) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    swb.h(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = bza;
    }

    public final ko4 d(eo4 eo4, vu5 vu5) {
        swb.h(this.p > 0);
        swb.i(this.t);
        w64 w64 = new w64(this, eo4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new dr1(w64, 19, vu5));
        return w64;
    }

    public final yn4 e(Looper looper, eo4 eo4, vu5 vu5, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new fx(this, looper, 4);
        }
        wn4 wn4 = vu5.D0;
        int i2 = 0;
        u64 u64 = null;
        if (wn4 == null) {
            int g2 = b49.g(vu5.A0);
            l35 l35 = this.q;
            l35.getClass();
            if (l35.l() == 2 && iz5.d) {
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
            if (i2 == -1 || l35.l() == 1) {
                return null;
            }
            u64 u642 = this.r;
            if (u642 == null) {
                po5 po5 = ws6.b;
                u64 h2 = h(e8c.X, true, (eo4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                u642.g((eo4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(wn4, this.b, false);
            if (arrayList.isEmpty()) {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Media does not support uuid: ");
                sb.append(valueOf);
                Exception exc = new Exception(sb.toString());
                oyb.b("DRM error", exc);
                if (eo4 != null) {
                    eo4.e(exc);
                }
                return new zz4(new DrmSession$DrmSessionException(exc, 6003));
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
                u64 u643 = (u64) it.next();
                if (mze.a(u643.a, arrayList)) {
                    u64 = u643;
                    break;
                }
            }
        } else {
            u64 = this.s;
        }
        if (u64 == null) {
            u64 = h(arrayList, false, eo4, z);
            if (!this.f) {
                this.s = u64;
            }
            this.m.add(u64);
        } else {
            u64.g(eo4);
        }
        return u64;
    }

    public final u64 g(List list, boolean z, eo4 eo4) {
        this.q.getClass();
        l35 l35 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        bza bza = this.x;
        bza.getClass();
        e06 e06 = this.d;
        lk9 lk9 = this.j;
        lk9 lk92 = lk9;
        u64 u64 = new u64(this.b, l35, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, e06, looper, lk92, bza);
        u64.g(eo4);
        if (this.l != -9223372036854775807L) {
            u64.g((eo4) null);
        }
        return u64;
    }

    public final u64 h(List list, boolean z, eo4 eo4, boolean z2) {
        u64 g2 = g(list, z, eo4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            rue g3 = gt6.j(set).iterator();
            while (g3.hasNext()) {
                ((yn4) g3.next()).f((eo4) null);
            }
            g2.f(eo4);
            if (j2 != -9223372036854775807L) {
                g2.f((eo4) null);
            }
            g2 = g(list, z, eo4);
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
            ((w64) g4.next()).release();
        }
        if (!set.isEmpty()) {
            rue g5 = gt6.j(set).iterator();
            while (g5.hasNext()) {
                ((yn4) g5.next()).f((eo4) null);
            }
        }
        g2.f(eo4);
        if (j2 != -9223372036854775807L) {
            g2.f((eo4) null);
        }
        return g(list, z, eo4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            l35 l35 = this.q;
            l35.getClass();
            l35.release();
            this.q = null;
        }
    }

    public final void prepare() {
        nz5 nz5;
        int i2 = this.p;
        this.p = i2 + 1;
        if (i2 == 0) {
            if (this.q == null) {
                UUID uuid = this.b;
                this.c.getClass();
                try {
                    nz5 = new nz5(uuid, 0);
                } catch (UnsupportedSchemeException e2) {
                    throw new Exception(e2);
                } catch (Exception e3) {
                    throw new Exception(e3);
                } catch (UnsupportedDrmException unused) {
                    new StringBuilder(String.valueOf(uuid).length() + 53);
                    nz5 = new g02(10);
                }
                this.q = nz5;
                nz5.n(new lv1(13, this));
            } else if (this.l != -9223372036854775807L) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i3 < arrayList.size()) {
                        ((u64) arrayList.get(i3)).g((eo4) null);
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void release() {
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((u64) arrayList.get(i3)).f((eo4) null);
                }
            }
            rue g2 = gt6.j(this.n).iterator();
            while (g2.hasNext()) {
                ((w64) g2.next()).release();
            }
            j();
        }
    }
}
