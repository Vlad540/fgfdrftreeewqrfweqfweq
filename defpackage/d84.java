package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: d84  reason: default package */
public final class d84 implements cj7 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final jj7 b = new jj7("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final oz3 c;
    public mi6 o;
    public long w0;
    public boolean x0;
    public IOException y0;
    public final /* synthetic */ f84 z0;

    public d84(f84 f84, Uri uri) {
        this.z0 = f84;
        this.a = uri;
        this.c = ((mz3) ((e3) f84.w0).a).a();
    }

    public static boolean a(d84 d84, long j) {
        d84.w0 = SystemClock.elapsedRealtime() + j;
        f84 f84 = d84.z0;
        if (!d84.a.equals(f84.X)) {
            return false;
        }
        List list = ((ui6) f84.C0).e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            d84 d842 = (d84) f84.b.get(((si6) list.get(i)).a);
            d842.getClass();
            if (elapsedRealtime > d842.w0) {
                Uri uri = d842.a;
                f84.X = uri;
                d842.c(f84.c(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        f84 f84 = this.z0;
        mja mja = new mja(this.c, uri, 4, ((aj6) f84.x0).m((ui6) f84.C0, this.o));
        int i = mja.c;
        ((af8) f84.z0).k(new xi7(mja.a, mja.b, this.b.G(mja, this, ((lk9) f84.y0).h(i))), i, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.w0 = 0;
        if (!this.x0) {
            jj7 jj7 = this.b;
            if (!jj7.C() && !jj7.B()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.Z;
                if (elapsedRealtime < j) {
                    this.x0 = true;
                    this.z0.o.postDelayed(new dr1(this, 21, uri), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.mi6 r65) {
        /*
            r64 = this;
            r0 = r64
            r1 = r65
            mi6 r2 = r0.o
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.X = r3
            f84 r5 = r0.z0
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
            mi6 r10 = new mi6
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
            wn4 r8 = r2.q
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
            mi6 r8 = (defpackage.mi6) r8
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
            hi6 r6 = (defpackage.hi6) r6
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
            mi6 r6 = (defpackage.mi6) r6
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
            hi6 r8 = (defpackage.hi6) r8
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
            hi6 r9 = (defpackage.hi6) r9
            int r9 = r9.o
            int r6 = r6 - r9
        L_0x012b:
            r48 = r6
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x012b
        L_0x0130:
            mi6 r10 = new mi6
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
            wn4 r6 = r1.q
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
            mi6 r1 = (defpackage.mi6) r1
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.Y = r1
            long r7 = r10.h
            r5.Z = r7
        L_0x01a1:
            r5.D0 = r10
            java.lang.Object r1 = r5.B0
            ej6 r1 = (defpackage.ej6) r1
            oi6 r1 = (defpackage.oi6) r1
            r1.q(r10)
        L_0x01ac:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            cj6 r6 = (defpackage.cj6) r6
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
            mi6 r1 = r0.o
            long r10 = r1.k
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dc
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException
            r1.<init>()
            r8 = r7
            goto L_0x01f6
        L_0x01dc:
            long r10 = r0.Y
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.m
            long r13 = defpackage.mze.M(r13)
            double r13 = (double) r13
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
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
            cj6 r6 = (defpackage.cj6) r6
            r6.e(r9, r10, r8)
            goto L_0x0203
        L_0x0213:
            mi6 r1 = r0.o
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
            long r1 = defpackage.mze.M(r6)
            long r1 = r1 + r3
            r0.Z = r1
            mi6 r1 = r0.o
            long r1 = r1.n
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0242
            android.net.Uri r1 = r5.X
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02bc
        L_0x0242:
            mi6 r1 = r0.o
            boolean r2 = r1.o
            if (r2 != 0) goto L_0x02bc
            li6 r1 = r1.v
            long r5 = r1.a
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0255
            boolean r1 = r1.e
            if (r1 != 0) goto L_0x0255
            goto L_0x02b9
        L_0x0255:
            android.net.Uri$Builder r1 = r9.buildUpon()
            mi6 r2 = r0.o
            li6 r5 = r2.v
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x029d
            ws6 r5 = r2.r
            int r5 = r5.size()
            long r5 = (long) r5
            long r7 = r2.k
            long r7 = r7 + r5
            java.lang.String r2 = "_HLS_msn"
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r1.appendQueryParameter(r2, r5)
            mi6 r2 = r0.o
            long r5 = r2.n
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x029d
            ws6 r2 = r2.s
            int r5 = r2.size()
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0294
            java.lang.Object r2 = defpackage.gwf.t(r2)
            di6 r2 = (defpackage.di6) r2
            boolean r2 = r2.B0
            if (r2 == 0) goto L_0x0294
            int r5 = r5 + -1
        L_0x0294:
            java.lang.String r2 = "_HLS_part"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.appendQueryParameter(r2, r5)
        L_0x029d:
            mi6 r2 = r0.o
            li6 r2 = r2.v
            long r5 = r2.a
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02b5
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x02ae
            java.lang.String r2 = "v2"
            goto L_0x02b0
        L_0x02ae:
            java.lang.String r2 = "YES"
        L_0x02b0:
            java.lang.String r3 = "_HLS_skip"
            r1.appendQueryParameter(r3, r2)
        L_0x02b5:
            android.net.Uri r9 = r1.build()
        L_0x02b9:
            r0.c(r9)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.d(mi6):void");
    }

    public final void g(fj7 fj7, long j, long j2, boolean z) {
        mja mja = (mja) fj7;
        long j3 = mja.a;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j3, mja.b, esd.c, esd.o, j, j2, esd.b);
        f84 f84 = this.z0;
        ((lk9) f84.y0).getClass();
        ((af8) f84.z0).d(xi7, 4, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void q(fj7 fj7, long j, long j2) {
        mja mja = (mja) fj7;
        wi6 wi6 = (wi6) mja.Y;
        long j3 = mja.a;
        xz3 xz3 = mja.b;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j3, xz3, esd.c, esd.o, j, j2, esd.b);
        if (wi6 instanceof mi6) {
            d((mi6) wi6);
            ((af8) this.z0.z0).f(xi7, 4, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException b2 = ParserException.b((Exception) null, "Loaded playlist has unexpected type.");
            this.y0 = b2;
            ((af8) this.z0.z0).i(xi7, 4, b2, true);
        }
        ((lk9) this.z0.y0).getClass();
    }

    public final sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        IOException iOException2 = iOException;
        mja mja = (mja) fj7;
        long j3 = mja.a;
        esd esd = mja.o;
        Uri uri = esd.c;
        xi7 xi7 = r3;
        Uri uri2 = uri;
        xi7 xi72 = new xi7(j3, mja.b, uri, esd.o, j, j2, esd.b);
        boolean z = uri2.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException2 instanceof HlsPlaylistParser$DeltaUpdateException;
        sz0 sz0 = jj7.X;
        Uri uri3 = this.a;
        f84 f84 = this.z0;
        int i2 = mja.c;
        if (z || z2) {
            int i3 = iOException2 instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException2).c : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                xi7 xi73 = xi7;
                this.Z = SystemClock.elapsedRealtime();
                c(uri3);
                int i4 = mze.a;
                ((af8) f84.z0).i(xi73, i2, iOException2, true);
                return sz0;
            }
        }
        wi7 wi7 = new wi7(i, iOException2);
        Iterator it = f84.c.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((cj6) it.next()).e(uri3, wi7, false);
        }
        lk9 lk9 = (lk9) f84.y0;
        if (z3) {
            lk9.getClass();
            long j4 = lk9.j(wi7);
            sz0 = j4 != -9223372036854775807L ? new sz0(j4, 0, 4, false) : jj7.Y;
        }
        boolean z4 = !sz0.a();
        ((af8) f84.z0).i(xi7, i2, iOException2, z4);
        if (z4) {
            lk9.getClass();
        }
        return sz0;
    }
}
