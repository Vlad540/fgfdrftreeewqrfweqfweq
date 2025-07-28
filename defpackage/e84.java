package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: e84  reason: default package */
public final class e84 implements dj7 {
    public final /* synthetic */ f84 A0;
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final ul7 b = new ul7("DefaultHlsPlaylistTracker:MediaPlaylist", 1);
    public final qz3 c;
    public ni6 o;
    public long w0;
    public boolean x0;
    public IOException y0;
    public boolean z0;

    public e84(f84 f84, Uri uri) {
        this.A0 = f84;
        this.a = uri;
        this.c = ((nz3) ((x3a) f84.w0).b).a();
    }

    public static boolean a(e84 e84, long j) {
        e84.w0 = SystemClock.elapsedRealtime() + j;
        f84 f84 = e84.A0;
        if (!e84.a.equals(f84.X)) {
            return false;
        }
        List list = ((vi6) f84.C0).e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            e84 e842 = (e84) f84.b.get(((ti6) list.get(i)).a);
            e842.getClass();
            if (elapsedRealtime > e842.w0) {
                Uri uri = e842.a;
                f84.X = uri;
                e842.e(f84.c(uri));
                return false;
            }
        }
        return true;
    }

    public final void E(gj7 gj7, long j, long j2) {
        nja nja = (nja) gj7;
        xi6 xi6 = (xi6) nja.Y;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        if (xi6 instanceof ni6) {
            f((ni6) xi6, yi7);
            ((jn) this.A0.z0).z(yi7, 4, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException b2 = ParserException.b((Exception) null, "Loaded playlist has unexpected type.");
            this.y0 = b2;
            ((jn) this.A0.z0).C(yi7, 4, b2, true);
        }
        ((mk9) this.A0.y0).getClass();
    }

    public final sz0 U(gj7 gj7, long j, long j2, IOException iOException, int i) {
        nja nja = (nja) gj7;
        long j3 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        sz0 sz0 = ul7.X;
        f84 f84 = this.A0;
        int i2 = nja.c;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).o : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.Z = SystemClock.elapsedRealtime();
                c(false);
                int i4 = oze.a;
                ((jn) f84.z0).C(yi7, i2, iOException, true);
                return sz0;
            }
        }
        wi7 wi7 = new wi7(i, iOException);
        Iterator it = f84.c.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((dj6) it.next()).c(this.a, wi7, false);
        }
        mk9 mk9 = (mk9) f84.y0;
        if (z3) {
            mk9.getClass();
            long m = mk9.m(wi7);
            sz0 = m != -9223372036854775807L ? new sz0(m, 0, 5, false) : ul7.Y;
        }
        boolean z4 = !sz0.a();
        ((jn) f84.z0).C(yi7, i2, iOException, z4);
        if (z4) {
            mk9.getClass();
        }
        return sz0;
    }

    public final Uri b() {
        ni6 ni6 = this.o;
        Uri uri = this.a;
        if (ni6 != null) {
            li6 li6 = ni6.v;
            if (li6.a != -9223372036854775807L || li6.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                ni6 ni62 = this.o;
                if (ni62.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ni62.k + ((long) ni62.r.size())));
                    ni6 ni63 = this.o;
                    if (ni63.n != -9223372036854775807L) {
                        ws6 ws6 = ni63.s;
                        int size = ws6.size();
                        if (!ws6.isEmpty() && ((ei6) gwf.t(ws6)).B0) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                li6 li62 = this.o.v;
                if (li62.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", li62.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.a);
    }

    public final void d(Uri uri) {
        f84 f84 = this.A0;
        nja nja = new nja(this.c, uri, 4, ((bj6) f84.x0).i((vi6) f84.C0, this.o));
        int i = nja.c;
        ((jn) f84.z0).F(new yi7(nja.a, nja.b, this.b.F(nja, this, ((mk9) f84.y0).k(i))), i, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.w0 = 0;
        if (!this.x0) {
            ul7 ul7 = this.b;
            if (!ul7.A() && !ul7.w()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.Z;
                if (elapsedRealtime < j) {
                    this.x0 = true;
                    this.A0.o.postDelayed(new dr1(this, 22, uri), j - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.ni6 r65, defpackage.yi7 r66) {
        /*
            r64 = this;
            r0 = r64
            r1 = r65
            ni6 r2 = r0.o
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.X = r3
            f84 r5 = r0.A0
            r5.getClass()
            if (r2 == 0) goto L_0x00a2
            long r10 = r1.k
            long r12 = r2.k
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x001d
            goto L_0x00a5
        L_0x001d:
            boolean r11 = r2.o
            ws6 r15 = r2.s
            ws6 r14 = r2.r
            boolean r12 = r1.o
            if (r10 >= 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            ws6 r10 = r1.r
            int r10 = r10.size()
            int r13 = r14.size()
            int r10 = r10 - r13
            if (r10 == 0) goto L_0x0039
            if (r10 <= 0) goto L_0x004c
            goto L_0x00a5
        L_0x0039:
            ws6 r10 = r1.s
            int r10 = r10.size()
            int r13 = r15.size()
            if (r10 > r13) goto L_0x00a5
            if (r10 != r13) goto L_0x004c
            if (r12 == 0) goto L_0x004c
            if (r11 != 0) goto L_0x004c
            goto L_0x00a5
        L_0x004c:
            if (r12 == 0) goto L_0x00a0
            if (r11 == 0) goto L_0x0051
            goto L_0x00a0
        L_0x0051:
            ni6 r10 = new ni6
            r12 = r10
            r31 = 1
            boolean r11 = r2.p
            r32 = r11
            int r13 = r2.d
            java.lang.String r11 = r2.a
            r34 = r14
            r14 = r11
            java.util.List r11 = r2.b
            r35 = r15
            r15 = r11
            long r8 = r2.e
            r16 = r8
            boolean r8 = r2.g
            r18 = r8
            long r8 = r2.h
            r19 = r8
            boolean r8 = r2.i
            r21 = r8
            int r8 = r2.j
            r22 = r8
            long r8 = r2.k
            r23 = r8
            int r8 = r2.l
            r25 = r8
            long r8 = r2.m
            r26 = r8
            long r8 = r2.n
            r28 = r8
            boolean r8 = r2.c
            r30 = r8
            xn4 r8 = r2.q
            r33 = r8
            li6 r8 = r2.v
            r36 = r8
            zs6 r8 = r2.t
            r37 = r8
            r12.<init>(r13, r14, r15, r16, r18, r19, r21, r22, r23, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x009d:
            r8 = 0
            goto L_0x017b
        L_0x00a0:
            r10 = r2
            goto L_0x009d
        L_0x00a2:
            r65.getClass()
        L_0x00a5:
            boolean r8 = r1.p
            long r9 = r1.k
            if (r8 == 0) goto L_0x00b0
            long r11 = r1.h
        L_0x00ad:
            r45 = r11
            goto L_0x00ed
        L_0x00b0:
            java.lang.Object r8 = r5.D0
            ni6 r8 = (defpackage.ni6) r8
            if (r8 == 0) goto L_0x00b9
            long r11 = r8.h
            goto L_0x00bb
        L_0x00b9:
            r11 = 0
        L_0x00bb:
            if (r2 != 0) goto L_0x00be
            goto L_0x00ad
        L_0x00be:
            ws6 r8 = r2.r
            int r13 = r8.size()
            long r14 = r2.k
            long r6 = r9 - r14
            int r6 = (int) r6
            int r7 = r8.size()
            if (r6 >= r7) goto L_0x00d6
            java.lang.Object r6 = r8.get(r6)
            ii6 r6 = (defpackage.ii6) r6
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            long r7 = r2.h
            if (r6 == 0) goto L_0x00df
            long r11 = r6.X
        L_0x00dd:
            long r11 = r11 + r7
            goto L_0x00ad
        L_0x00df:
            r18 = r11
            long r11 = (long) r13
            long r13 = r9 - r14
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            long r11 = r2.u
            goto L_0x00dd
        L_0x00eb:
            r45 = r18
        L_0x00ed:
            boolean r6 = r1.i
            ws6 r7 = r1.r
            if (r6 == 0) goto L_0x00f9
            int r6 = r1.j
        L_0x00f5:
            r48 = r6
            r8 = 0
            goto L_0x0130
        L_0x00f9:
            java.lang.Object r6 = r5.D0
            ni6 r6 = (defpackage.ni6) r6
            if (r6 == 0) goto L_0x0102
            int r6 = r6.j
            goto L_0x0103
        L_0x0102:
            r6 = 0
        L_0x0103:
            if (r2 != 0) goto L_0x0106
            goto L_0x00f5
        L_0x0106:
            long r11 = r2.k
            long r9 = r9 - r11
            int r8 = (int) r9
            ws6 r9 = r2.r
            int r10 = r9.size()
            if (r8 >= r10) goto L_0x0119
            java.lang.Object r8 = r9.get(r8)
            ii6 r8 = (defpackage.ii6) r8
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x012e
            int r6 = r2.j
            int r8 = r8.o
            int r6 = r6 + r8
            r8 = 0
            java.lang.Object r9 = r7.get(r8)
            ii6 r9 = (defpackage.ii6) r9
            int r9 = r9.o
            int r6 = r6 - r9
        L_0x012b:
            r48 = r6
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x012b
        L_0x0130:
            ni6 r10 = new ni6
            r38 = r10
            boolean r6 = r1.o
            r57 = r6
            boolean r6 = r1.p
            r58 = r6
            int r6 = r1.d
            r39 = r6
            java.lang.String r6 = r1.a
            r40 = r6
            java.util.List r6 = r1.b
            r41 = r6
            long r11 = r1.e
            r42 = r11
            boolean r6 = r1.g
            r44 = r6
            r47 = 1
            long r11 = r1.k
            r49 = r11
            int r6 = r1.l
            r51 = r6
            long r11 = r1.m
            r52 = r11
            long r11 = r1.n
            r54 = r11
            boolean r6 = r1.c
            r56 = r6
            xn4 r6 = r1.q
            r59 = r6
            ws6 r6 = r1.s
            r61 = r6
            li6 r6 = r1.v
            r62 = r6
            zs6 r6 = r1.t
            r63 = r6
            r60 = r7
            r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x017b:
            r0.o = r10
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.c
            r7 = 1
            android.net.Uri r9 = r0.a
            boolean r11 = r10.o
            if (r10 == r2) goto L_0x01c0
            r12 = 0
            r0.y0 = r12
            r0.Y = r3
            android.net.Uri r1 = r5.X
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x01ac
            java.lang.Object r1 = r5.D0
            ni6 r1 = (defpackage.ni6) r1
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.Y = r1
            long r7 = r10.h
            r5.Z = r7
        L_0x01a1:
            r5.D0 = r10
            java.lang.Object r1 = r5.B0
            fj6 r1 = (defpackage.fj6) r1
            pi6 r1 = (defpackage.pi6) r1
            r1.v(r10)
        L_0x01ac:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            dj6 r6 = (defpackage.dj6) r6
            r6.a()
            goto L_0x01b0
        L_0x01c0:
            r12 = 0
            if (r11 != 0) goto L_0x0213
            ws6 r10 = r1.r
            int r10 = r10.size()
            long r10 = (long) r10
            long r13 = r1.k
            long r13 = r13 + r10
            ni6 r1 = r0.o
            long r10 = r1.k
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dc
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException
            r1.<init>()
            r8 = r7
            goto L_0x01f6
        L_0x01dc:
            long r10 = r0.Y
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.m
            long r13 = defpackage.oze.h0(r13)
            double r13 = (double) r13
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
            r1.<init>()
            goto L_0x01f6
        L_0x01f5:
            r1 = r12
        L_0x01f6:
            if (r1 == 0) goto L_0x0213
            r0.y0 = r1
            wi7 r10 = new wi7
            r10.<init>(r7, r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x0203:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            dj6 r6 = (defpackage.dj6) r6
            r6.c(r9, r10, r8)
            goto L_0x0203
        L_0x0213:
            ni6 r1 = r0.o
            li6 r6 = r1.v
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x0224
            long r6 = r1.m
            if (r1 == r2) goto L_0x0220
            goto L_0x0226
        L_0x0220:
            r1 = 2
            long r6 = r6 / r1
            goto L_0x0226
        L_0x0224:
            r6 = 0
        L_0x0226:
            long r1 = defpackage.oze.h0(r6)
            long r1 = r1 + r3
            r3 = r66
            long r3 = r3.a
            long r1 = r1 - r3
            r0.Z = r1
            ni6 r1 = r0.o
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x024b
            android.net.Uri r1 = r5.X
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0244
            boolean r1 = r0.z0
            if (r1 == 0) goto L_0x024b
        L_0x0244:
            android.net.Uri r1 = r64.b()
            r0.e(r1)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.f(ni6, yi7):void");
    }

    public final void x(gj7 gj7, long j, long j2, boolean z) {
        nja nja = (nja) gj7;
        long j3 = nja.a;
        Uri uri = nja.o.c;
        yi7 yi7 = new yi7(j2);
        f84 f84 = this.A0;
        ((mk9) f84.y0).getClass();
        ((jn) f84.z0).x(yi7, 4, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }
}
