package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: f84  reason: default package */
public final class f84 implements cj7, dj7 {
    public static final hs1 E0 = new Object();
    public static final hs1 F0 = new Object();
    public Object A0;
    public Object B0;
    public Object C0;
    public Object D0;
    public Uri X;
    public boolean Y;
    public long Z;
    public final /* synthetic */ int a = 0;
    public final HashMap b;
    public final CopyOnWriteArrayList c;
    public Handler o;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public Object z0;

    public f84(e3 e3Var, lk9 lk9, aj6 aj6) {
        this.w0 = e3Var;
        this.x0 = aj6;
        this.y0 = lk9;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.Z = -9223372036854775807L;
    }

    public void E(gj7 gj7, long j, long j2) {
        vi6 vi6;
        nja nja = (nja) gj7;
        xi6 xi6 = (xi6) nja.Y;
        boolean z = xi6 instanceof ni6;
        if (z) {
            String str = xi6.a;
            vi6 vi62 = vi6.l;
            Uri parse = Uri.parse(str);
            uu5 uu5 = new uu5();
            uu5.a = "0";
            uu5.l = c49.l("application/x-mpegURL");
            vi6 = new vi6(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(new ti6(parse, new xu5(uu5), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (xu5) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            vi6 = (vi6) xi6;
        }
        this.C0 = vi6;
        this.X = ((ti6) vi6.e.get(0)).a;
        this.c.add(new c84(this));
        List list = vi6.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new e84(this, uri));
        }
        Uri uri2 = nja.o.c;
        yi7 yi7 = new yi7(j2);
        e84 e84 = (e84) this.b.get(this.X);
        if (z) {
            e84.f((ni6) xi6, yi7);
        } else {
            e84.c(false);
        }
        ((mk9) this.y0).getClass();
        ((jn) this.z0).z(yi7, 4, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        long j3;
        IOException iOException2 = iOException;
        nja nja = (nja) gj7;
        long j4 = nja.a;
        Uri uri = nja.o.c;
        long j5 = j2;
        yi7 yi7 = new yi7(j2);
        ((mk9) this.y0).getClass();
        boolean z = true;
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i2 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            z = false;
        }
        ((jn) this.z0).C(yi7, nja.c, iOException2, z);
        return z ? ul7.Y : new sz0(j3, 0, 5, false);
    }

    public mi6 a(Uri uri, boolean z) {
        HashMap hashMap = this.b;
        mi6 mi6 = ((d84) hashMap.get(uri)).o;
        if (mi6 != null && z && !uri.equals(this.X)) {
            List list = ((ui6) this.C0).e;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(((si6) list.get(i)).a)) {
                    mi6 mi62 = (mi6) this.D0;
                    if (mi62 == null || !mi62.o) {
                        this.X = uri;
                        d84 d84 = (d84) hashMap.get(uri);
                        mi6 mi63 = d84.o;
                        if (mi63 == null || !mi63.o) {
                            d84.c(c(uri));
                        } else {
                            this.D0 = mi63;
                            ((oi6) ((ej6) this.B0)).q(mi63);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return mi6;
    }

    public ni6 b(Uri uri, boolean z) {
        HashMap hashMap = this.b;
        ni6 ni6 = ((e84) hashMap.get(uri)).o;
        if (ni6 != null && z) {
            if (!uri.equals(this.X)) {
                List list = ((vi6) this.C0).e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (uri.equals(((ti6) list.get(i)).a)) {
                        ni6 ni62 = (ni6) this.D0;
                        if (ni62 == null || !ni62.o) {
                            this.X = uri;
                            e84 e84 = (e84) hashMap.get(uri);
                            ni6 ni63 = e84.o;
                            if (ni63 == null || !ni63.o) {
                                e84.e(c(uri));
                            } else {
                                this.D0 = ni63;
                                ((pi6) ((fj6) this.B0)).v(ni63);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            e84 e842 = (e84) hashMap.get(uri);
            ni6 ni64 = e842.o;
            if (!e842.z0) {
                e842.z0 = true;
                if (ni64 != null && !ni64.o) {
                    e842.c(true);
                }
            }
        }
        return ni6;
    }

    public final Uri c(Uri uri) {
        fi6 fi6;
        gi6 gi6;
        switch (this.a) {
            case 0:
                mi6 mi6 = (mi6) this.D0;
                if (mi6 == null || !mi6.v.e || (fi6 = (fi6) mi6.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fi6.b));
                int i = fi6.c;
                if (i != -1) {
                    buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
                }
                return buildUpon.build();
            default:
                ni6 ni6 = (ni6) this.D0;
                if (ni6 == null || !ni6.v.e || (gi6 = (gi6) ni6.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon2 = uri.buildUpon();
                buildUpon2.appendQueryParameter("_HLS_msn", String.valueOf(gi6.b));
                int i2 = gi6.c;
                if (i2 != -1) {
                    buildUpon2.appendQueryParameter("_HLS_part", String.valueOf(i2));
                }
                return buildUpon2.build();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r8 = r8.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.net.Uri r8) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            e84 r7 = (defpackage.e84) r7
            ni6 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x0013
            goto L_0x003b
        L_0x0013:
            long r1 = android.os.SystemClock.elapsedRealtime()
            ni6 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.oze.h0(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            ni6 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x003a
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x003a
            if (r8 == r6) goto L_0x003a
            long r7 = r7.X
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            return r0
        L_0x003c:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            d84 r7 = (defpackage.d84) r7
            mi6 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x004a
            goto L_0x0072
        L_0x004a:
            long r1 = android.os.SystemClock.elapsedRealtime()
            mi6 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.mze.M(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            mi6 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x0071
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x0071
            if (r8 == r6) goto L_0x0071
            long r7 = r7.X
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0072
        L_0x0071:
            r0 = r6
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f84.d(android.net.Uri):boolean");
    }

    public void g(fj7 fj7, long j, long j2, boolean z) {
        mja mja = (mja) fj7;
        long j3 = mja.a;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j3, mja.b, esd.c, esd.o, j, j2, esd.b);
        ((lk9) this.y0).getClass();
        ((af8) this.z0).d(xi7, 4, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void q(fj7 fj7, long j, long j2) {
        ui6 ui6;
        mja mja = (mja) fj7;
        wi6 wi6 = (wi6) mja.Y;
        boolean z = wi6 instanceof mi6;
        if (z) {
            String str = wi6.a;
            ui6 ui62 = ui6.n;
            Uri parse = Uri.parse(str);
            tu5 tu5 = new tu5();
            tu5.a = "0";
            tu5.j = "application/x-mpegURL";
            ui6 = new ui6(BuildConfig.FLAVOR, Collections.emptyList(), Collections.singletonList(new si6(parse, new vu5(tu5), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (vu5) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            ui6 = (ui6) wi6;
        }
        this.C0 = ui6;
        this.X = ((si6) ui6.e.get(0)).a;
        this.c.add(new b84(this));
        List list = ui6.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new d84(this, uri));
        }
        long j3 = mja.a;
        xz3 xz3 = mja.b;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j3, xz3, esd.c, esd.o, j, j2, esd.b);
        d84 d84 = (d84) this.b.get(this.X);
        if (z) {
            d84.d((mi6) wi6);
        } else {
            d84.c(d84.a);
        }
        ((lk9) this.y0).getClass();
        ((af8) this.z0).f(xi7, 4, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void x(gj7 gj7, long j, long j2, boolean z) {
        nja nja = (nja) gj7;
        long j3 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        ((mk9) this.y0).getClass();
        ((jn) this.z0).x(yi7, 4, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sz0 y(defpackage.fj7 r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            r2 = r17
            mja r2 = (defpackage.mja) r2
            xi7 r15 = new xi7
            long r4 = r2.a
            esd r3 = r2.o
            android.net.Uri r7 = r3.c
            java.util.Map r8 = r3.o
            long r13 = r3.b
            xz3 r6 = r2.b
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            java.lang.Object r3 = r0.y0
            lk9 r3 = (defpackage.lk9) r3
            r3.getClass()
            boolean r3 = r1 instanceof com.google.android.exoplayer2.ParserException
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x005f
            int r3 = com.google.android.exoplayer2.upstream.DataSourceException.b
            r3 = r1
        L_0x003e:
            if (r3 == 0) goto L_0x0053
            boolean r7 = r3 instanceof com.google.android.exoplayer2.upstream.DataSourceException
            if (r7 == 0) goto L_0x004e
            r7 = r3
            com.google.android.exoplayer2.upstream.DataSourceException r7 = (com.google.android.exoplayer2.upstream.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x004e
            goto L_0x005f
        L_0x004e:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x003e
        L_0x0053:
            int r3 = r23 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            goto L_0x0060
        L_0x005f:
            r7 = r5
        L_0x0060:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            if (r3 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r5
        L_0x0067:
            java.lang.Object r0 = r0.z0
            af8 r0 = (defpackage.af8) r0
            int r2 = r2.c
            r0.i(r15, r2, r1, r4)
            if (r4 == 0) goto L_0x0075
            sz0 r0 = defpackage.jj7.Y
            goto L_0x0079
        L_0x0075:
            sz0 r0 = defpackage.jj7.q(r7, r5)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f84.y(fj7, long, long, java.io.IOException, int):sz0");
    }

    public f84(x3a x3a, mk9 mk9, bj6 bj6) {
        this.w0 = x3a;
        this.x0 = bj6;
        this.y0 = mk9;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.Z = -9223372036854775807L;
    }
}
