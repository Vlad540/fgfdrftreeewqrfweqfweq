package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: y5c  reason: default package */
public final class y5c implements d7f {
    public static final Set h0 = Collections.unmodifiableSet(EnumSet.of(x5c.b, x5c.c));
    public static final Set i0 = Collections.unmodifiableSet(EnumSet.of(x5c.a, x5c.o, x5c.w0, x5c.Z, x5c.x0));
    public static final v2b j0;
    public static final mb0 k0;
    public static final z90 l0;
    public static final RuntimeException m0 = new RuntimeException("The video frame producer became inactive before any data was received.");
    public static final hs1 n0 = new Object();
    public static final ryc o0 = new ryc(pa2.u());
    public static final int p0 = 3;
    public static final long q0 = 1000;
    public Surface A;
    public Surface B;
    public MediaMuxer C;
    public final k96 D;
    public d60 E;
    public hx4 F;
    public r34 G;
    public xx4 H;
    public r34 I;
    public Uri J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Throwable T;
    public xw4 U;
    public final ci9 V;
    public Throwable W;
    public boolean X;
    public ScheduledFuture Y;
    public boolean Z;
    public final k96 a;
    public vj4 a0;
    public final k96 b;
    public vj4 b0;
    public final Executor c;
    public double c0;
    public final Executor d;
    public boolean d0;
    public final ryc e;
    public ug4 e0;
    public final hs1 f;
    public int f0;
    public final hs1 g;
    public int g0;
    public final Object h = new Object();
    public final boolean i;
    public final int j;
    public x5c k;
    public x5c l;
    public int m;
    public na0 n;
    public na0 o;
    public long p;
    public na0 q;
    public boolean r;
    public cb0 s;
    public cb0 t;
    public nb0 u;
    public final ArrayList v;
    public Integer w;
    public Integer x;
    public y4e y;
    public kje z;

    /* JADX WARNING: type inference failed for: r0v12, types: [hs1, java.lang.Object] */
    static {
        ma0 ma0 = ma0.f;
        v2b j2 = v2b.j(Arrays.asList(new ma0[]{ma0, ma0.e, ma0.d}), new k90(ma0, 1));
        j0 = j2;
        lb0 a2 = mb0.a();
        a2.a = j2;
        a2.d = -1;
        mb0 a3 = a2.a();
        k0 = a3;
        jg8 a4 = z90.a();
        a4.o = -1;
        a4.c = a3;
        l0 = a4.i();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, lb0] */
    public y5c(ExecutorService executorService, z90 z90, hs1 hs1, hs1 hs12) {
        this.i = xf4.a.j(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = x5c.a;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f0 = 1;
        this.J = Uri.EMPTY;
        this.K = 0;
        this.L = 0;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0;
        this.R = 0;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new ci9(60, (hs1) null);
        this.W = null;
        this.X = false;
        this.g0 = 3;
        this.Y = null;
        this.Z = false;
        this.b0 = null;
        this.c0 = 0.0d;
        this.d0 = false;
        this.e0 = null;
        this.c = executorService;
        Executor u2 = executorService == null ? pa2.u() : executorService;
        this.d = u2;
        ryc ryc = new ryc(u2);
        this.e = ryc;
        mb0 mb0 = z90.a;
        n80 n80 = z90.b;
        Integer valueOf = Integer.valueOf(z90.c);
        if (z90.a.d == -1) {
            xe9 xe9 = new xe9(20);
            if (mb0 != null) {
                ? obj = new Object();
                obj.a = mb0.a;
                obj.b = mb0.b;
                obj.c = mb0.c;
                obj.d = Integer.valueOf(mb0.d);
                xe9.accept(obj);
                mb0 = obj.a();
            } else {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
        }
        String str = mb0 == null ? " videoSpec" : BuildConfig.FLAVOR;
        str = n80 == null ? str.concat(" audioSpec") : str;
        if (str.isEmpty()) {
            this.D = new k96(new z90(mb0, n80, valueOf.intValue()));
            this.j = 0;
            this.a = new k96(new ua0(this.m, m(this.k), (cb0) null));
            this.b = new k96(Boolean.FALSE);
            this.f = hs1;
            this.g = hs12;
            this.a0 = new vj4(hs1, ryc, u2);
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static Object l(k96 k96) {
        try {
            return k96.m().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(x5c x5c) {
        return (x5c == x5c.X || (x5c == x5c.Z && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) xf4.a.j(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    public static boolean p(a6c a6c, na0 na0) {
        return na0 != null && a6c.c == na0.B0;
    }

    public static void r(hx4 hx4) {
        if (hx4 instanceof xx4) {
            xx4 xx4 = (xx4) hx4;
            xx4.h.execute(new lx4(xx4, 5));
        }
    }

    public final void A(Surface surface) {
        int i2;
        if (this.A != surface) {
            this.A = surface;
            synchronized (this.h) {
                if (surface != null) {
                    try {
                        i2 = surface.hashCode();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i2 = 0;
                }
                if (this.m != i2) {
                    this.m = i2;
                    this.a.v(new ua0(i2, m(this.k), this.s));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(defpackage.x5c r4) {
        /*
            r3 = this;
            x5c r0 = r3.k
            if (r0 == r4) goto L_0x0062
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.util.Set r0 = h0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L_0x0043
            x5c r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x004a
            java.util.Set r0 = i0
            x5c r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            x5c r0 = r3.k
            r3.l = r0
            int r0 = m(r0)
            goto L_0x004b
        L_0x002d:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            x5c r3 = r3.k
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x0043:
            x5c r0 = r3.l
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r3.l = r0
        L_0x004a:
            r0 = 0
        L_0x004b:
            r3.k = r4
            if (r0 != 0) goto L_0x0053
            int r0 = m(r4)
        L_0x0053:
            int r4 = r3.m
            cb0 r1 = r3.s
            ua0 r2 = new ua0
            r2.<init>(r4, r0, r1)
            k96 r3 = r3.a
            r3.v(r2)
            return
        L_0x0062:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to transition to state "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", but Recorder is already in state "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5c.B(x5c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7 A[Catch:{ all -> 0x005d, all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[Catch:{ all -> 0x005d, all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e A[Catch:{ all -> 0x005d, all -> 0x0128 }, LOOP:2: B:62:0x0108->B:64:0x010e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(defpackage.na0 r11) {
        /*
            r10 = this;
            android.media.MediaMuxer r0 = r10.C
            if (r0 != 0) goto L_0x0135
            boolean r0 = r10.n()
            ci9 r1 = r10.V
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.g()
            if (r0 != 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Audio is enabled but no audio sample is ready. Cannot start media muxer."
            r10.<init>(r11)
            throw r10
        L_0x001b:
            xw4 r0 = r10.U
            if (r0 == 0) goto L_0x012d
            r2 = 0
            r10.U = r2     // Catch:{ all -> 0x005d }
            long r3 = r0.Y()     // Catch:{ all -> 0x005d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r5.<init>()     // Catch:{ all -> 0x005d }
        L_0x002b:
            boolean r6 = r1.g()     // Catch:{ all -> 0x005d }
            if (r6 != 0) goto L_0x0043
            java.lang.Object r6 = r1.d()     // Catch:{ all -> 0x005d }
            xw4 r6 = (defpackage.xw4) r6     // Catch:{ all -> 0x005d }
            long r7 = r6.Y()     // Catch:{ all -> 0x005d }
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x002b
            r5.add(r6)     // Catch:{ all -> 0x005d }
            goto L_0x002b
        L_0x0043:
            long r3 = r0.size()     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x004b:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x005d }
            xw4 r6 = (defpackage.xw4) r6     // Catch:{ all -> 0x005d }
            long r6 = r6.size()     // Catch:{ all -> 0x005d }
            long r3 = r3 + r6
            goto L_0x004b
        L_0x005d:
            r10 = move-exception
            goto L_0x0124
        L_0x0060:
            long r6 = r10.Q     // Catch:{ all -> 0x005d }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 2
            if (r1 == 0) goto L_0x0087
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0087
            java.lang.String r1 = "Initial data exceeds file size limit %d > %d"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005d }
            long r4 = r10.Q     // Catch:{ all -> 0x005d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch:{ all -> 0x005d }
            java.lang.String.format(r1, r3)     // Catch:{ all -> 0x005d }
            r10.s(r11, r8, r2)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0087:
            k96 r1 = r10.D     // Catch:{ IOException -> 0x00b2 }
            java.lang.Object r1 = l(r1)     // Catch:{ IOException -> 0x00b2 }
            z90 r1 = (defpackage.z90) r1     // Catch:{ IOException -> 0x00b2 }
            int r1 = r1.c     // Catch:{ IOException -> 0x00b2 }
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x00b4
            nb0 r1 = r10.u     // Catch:{ IOException -> 0x00b2 }
            z90 r2 = l0     // Catch:{ IOException -> 0x00b2 }
            int r2 = r2.c     // Catch:{ IOException -> 0x00b2 }
            if (r2 == r4) goto L_0x00a0
            r2 = r3
            goto L_0x00a1
        L_0x00a0:
            r2 = r4
        L_0x00a1:
            if (r1 == 0) goto L_0x00b0
            int r1 = r1.b     // Catch:{ IOException -> 0x00b2 }
            if (r1 == r4) goto L_0x00b9
            if (r1 == r8) goto L_0x00b8
            r3 = 9
            if (r1 == r3) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r8 = r4
            goto L_0x00b9
        L_0x00b0:
            r8 = r2
            goto L_0x00b9
        L_0x00b2:
            r1 = move-exception
            goto L_0x011c
        L_0x00b4:
            if (r1 == r4) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r3 = r4
        L_0x00b8:
            r8 = r3
        L_0x00b9:
            jv1 r1 = new jv1     // Catch:{ IOException -> 0x00b2 }
            r2 = 6
            r1.<init>(r2, r10)     // Catch:{ IOException -> 0x00b2 }
            android.media.MediaMuxer r1 = r11.m(r8, r1)     // Catch:{ IOException -> 0x00b2 }
            cb0 r2 = r10.t     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00cf
            r10.z(r2)     // Catch:{ all -> 0x005d }
            int r2 = r2.b     // Catch:{ all -> 0x005d }
            r1.setOrientationHint(r2)     // Catch:{ all -> 0x005d }
        L_0x00cf:
            re5 r2 = r11.w0     // Catch:{ all -> 0x005d }
            l90 r2 = r2.a     // Catch:{ all -> 0x005d }
            r2.getClass()     // Catch:{ all -> 0x005d }
            r34 r2 = r10.G     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.x = r2     // Catch:{ all -> 0x005d }
            boolean r2 = r10.n()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00fc
            r34 r2 = r10.I     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.w = r2     // Catch:{ all -> 0x005d }
        L_0x00fc:
            r1.start()     // Catch:{ all -> 0x005d }
            r10.C = r1     // Catch:{ all -> 0x005d }
            r10.K(r0, r11)     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0108:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0118
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005d }
            xw4 r2 = (defpackage.xw4) r2     // Catch:{ all -> 0x005d }
            r10.J(r2, r11)     // Catch:{ all -> 0x005d }
            goto L_0x0108
        L_0x0118:
            r0.close()
            return
        L_0x011c:
            r2 = 5
            r10.s(r11, r2, r1)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0124:
            r0.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r11 = move-exception
            r10.addSuppressed(r11)
        L_0x012c:
            throw r10
        L_0x012d:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Media muxer cannot be started without an encoded video frame."
            r10.<init>(r11)
            throw r10
        L_0x0135:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Unable to set up media muxer when one already exists."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5c.C(na0):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: b9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: ope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: b9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: b9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(defpackage.na0 r13) {
        /*
            r12 = this;
            k96 r0 = r12.D
            java.lang.Object r0 = l(r0)
            z90 r0 = (defpackage.z90) r0
            nb0 r1 = r12.u
            int r2 = r0.c
            java.lang.String r3 = "audio/vorbis"
            r4 = 1
            java.lang.String r5 = "audio/mp4a-latm"
            if (r2 == r4) goto L_0x0015
            r6 = r5
            goto L_0x0016
        L_0x0015:
            r6 = r3
        L_0x0016:
            if (r2 == r4) goto L_0x0019
            r3 = r5
        L_0x0019:
            boolean r3 = r3.equals(r5)
            r4 = -1
            if (r3 == 0) goto L_0x0022
            r3 = 2
            goto L_0x0023
        L_0x0022:
            r3 = r4
        L_0x0023:
            r5 = 0
            if (r1 == 0) goto L_0x0044
            e90 r1 = r1.e
            if (r1 == 0) goto L_0x0044
            java.lang.String r7 = r1.b
            java.lang.String r8 = "audio/none"
            boolean r8 = java.util.Objects.equals(r7, r8)
            if (r8 == 0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            int r8 = r1.f
            if (r2 != r4) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r2 = r6.equals(r7)
            if (r2 == 0) goto L_0x0044
            if (r3 != r8) goto L_0x0044
            r8 = r3
            goto L_0x0047
        L_0x0044:
            r8 = r3
            r1 = r5
            r7 = r6
        L_0x0047:
            if (r7 == 0) goto L_0x00fe
            if (r1 == 0) goto L_0x004d
            r11 = r1
            goto L_0x004e
        L_0x004d:
            r11 = r5
        L_0x004e:
            n80 r1 = r0.b
            if (r11 == 0) goto L_0x0058
            nu7 r2 = new nu7
            r2.<init>(r1, r11)
            goto L_0x005e
        L_0x0058:
            u5g r2 = new u5g
            r3 = 3
            r2.<init>((int) r3, (java.lang.Object) r1)
        L_0x005e:
            java.lang.Object r1 = r2.get()
            r10 = r1
            m80 r10 = (defpackage.m80) r10
            d60 r1 = r12.E
            if (r1 == 0) goto L_0x006c
            r12.u()
        L_0x006c:
            boolean r1 = r13.z0
            if (r1 == 0) goto L_0x00ea
            java.util.concurrent.atomic.AtomicReference r1 = r13.o
            java.lang.Object r1 = r1.getAndSet(r5)
            w5c r1 = (defpackage.w5c) r1
            if (r1 == 0) goto L_0x00d6
            ryc r13 = o0
            d60 r13 = r1.a(r10, r13)
            r12.E = r13
            int r13 = r13.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r1 = "Set up new audio source: 0x%x"
            java.lang.String.format(r1, r13)
            n80 r9 = r0.b
            if (r11 == 0) goto L_0x009e
            b9 r13 = new b9
            r6 = r13
            r6.<init>((java.lang.String) r7, (int) r8, (defpackage.n80) r9, (defpackage.m80) r10, (defpackage.e90) r11)
            goto L_0x00a3
        L_0x009e:
            ope r13 = new ope
            r13.<init>((java.lang.String) r7, (int) r8, (defpackage.n80) r9, (defpackage.m80) r10)
        L_0x00a3:
            java.lang.Object r13 = r13.get()
            l80 r13 = (defpackage.l80) r13
            hs1 r0 = r12.g
            r0.getClass()
            xx4 r0 = new xx4
            java.util.concurrent.Executor r1 = r12.d
            r0.<init>(r1, r13)
            r12.H = r0
            ex4 r13 = r0.f
            boolean r0 = r13 instanceof defpackage.tx4
            if (r0 == 0) goto L_0x00ce
            d60 r12 = r12.E
            tx4 r13 = (defpackage.tx4) r13
            ryc r0 = r12.a
            c r1 = new c
            r2 = 9
            r1.<init>(r12, r2, r13)
            r0.execute(r1)
            return
        L_0x00ce:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r13 = "The EncoderInput of audio isn't a ByteBufferInput."
            r12.<init>(r13)
            throw r12
        L_0x00d6:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "One-time audio source creation has already occurred for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00ea:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recording does not have audio enabled. Unable to create audio source for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00fe:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null mimeType"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5c.D(na0):void");
    }

    public final void E(na0 na0, boolean z2) {
        if (this.q == null) {
            re5 re5 = na0.w0;
            l90 l90 = re5.a;
            if (l90.a > 0) {
                this.Q = Math.round(((double) l90.a) * 0.95d);
            } else {
                this.Q = 0;
            }
            l90 l902 = re5.a;
            if (l902.b > 0) {
                this.R = TimeUnit.MILLISECONDS.toNanos(l902.b);
            } else {
                this.R = 0;
            }
            this.q = na0;
            int t2 = hr1.t(this.f0);
            int i2 = 5;
            int i3 = 4;
            boolean z3 = na0.z0;
            if (t2 != 0) {
                if (t2 == 1) {
                    if (!z3) {
                        i3 = 3;
                    }
                    this.f0 = i3;
                } else if (t2 == 2 || t2 == 3 || t2 == 4 || t2 == 5) {
                    throw new AssertionError("Incorrectly invoke startInternal in audio state ".concat(m4b.n(this.f0)));
                }
            } else if (z3) {
                if (((z90) l(this.D)).b.e != 0) {
                    try {
                        if (this.q.A0) {
                            if (this.H == null) {
                            }
                            this.f0 = 4;
                        }
                        D(na0);
                        this.f0 = 4;
                    } catch (AudioSourceAccessException | InvalidConfigException e2) {
                        if (!(e2 instanceof InvalidConfigException)) {
                            i2 = 6;
                        }
                        this.f0 = i2;
                        this.W = e2;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            G(na0, false);
            if (n()) {
                d60 d60 = this.E;
                d60.a.execute(new b60(d60, na0.Y.get(), 0));
                this.H.k();
            }
            ((xx4) this.F).k();
            na0 na02 = this.q;
            na02.n(new f8f(na02.w0, k()));
            if (z2) {
                t(na0);
                return;
            }
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    public final void F(na0 na0, long j2, int i2, Exception exc) {
        if (this.q == na0 && !this.r) {
            this.r = true;
            this.S = i2;
            this.T = exc;
            if (n()) {
                while (true) {
                    ci9 ci9 = this.V;
                    if (ci9.g()) {
                        break;
                    }
                    ci9.d();
                }
                xx4 xx4 = this.H;
                xx4.q.getClass();
                xx4.h.execute(new ox4(0, j2, xhd.m(), xx4));
            }
            xw4 xw4 = this.U;
            if (xw4 != null) {
                xw4.close();
                this.U = null;
            }
            if (this.g0 != 2) {
                pzb pzb = new pzb(2, this.F);
                this.Y = pa2.A().schedule((Runnable) new hg9(this.e, 28, pzb), 1000, TimeUnit.MILLISECONDS);
            } else {
                r(this.F);
            }
            xx4 xx42 = (xx4) this.F;
            xx42.q.getClass();
            xx42.h.execute(new ox4(0, j2, xhd.m(), xx42));
        }
    }

    public final void G(na0 na0, boolean z2) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            og7 b2 = ct0.b(arrayList);
            if (!b2.isDone()) {
                b2.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(hwf.f(new r5c(this, na0, 0)));
        if (n() && !z2) {
            arrayList.add(hwf.f(new r5c(this, na0, 1)));
        }
        ct0.a(ct0.b(arrayList), new nfc(24, (Object) this), pa2.j());
    }

    public final void H() {
        na0 na0 = this.q;
        if (na0 != null) {
            na0.n(new f8f(na0.w0, k()));
        }
    }

    public final void I(x5c x5c) {
        if (!h0.contains(this.k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.k);
        } else if (!i0.contains(x5c)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + x5c);
        } else if (this.l != x5c) {
            this.l = x5c;
            this.a.v(new ua0(this.m, m(x5c), this.s));
        }
    }

    public final void J(xw4 xw4, na0 na0) {
        na0 na02 = na0;
        long size = xw4.size() + this.K;
        long j2 = this.Q;
        if (j2 == 0 || size <= j2) {
            long Y2 = xw4.Y();
            long j3 = this.N;
            if (j3 == Long.MAX_VALUE) {
                this.N = Y2;
                String.format("First audio time: %d (%s)", new Object[]{Long.valueOf(Y2), e07.I(this.N)});
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long nanos = timeUnit.toNanos(Y2 - Math.min(this.M, j3));
                e07.p("There should be a previous data for adjusting the duration.", this.P != Long.MAX_VALUE);
                long nanos2 = timeUnit.toNanos(Y2 - this.P) + nanos;
                long j4 = this.R;
                if (j4 != 0 && nanos2 > j4) {
                    String.format("Audio data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                    s(na02, 9, (IOException) null);
                    return;
                }
            }
            this.C.writeSampleData(this.w.intValue(), xw4.r(), xw4.F());
            this.K = size;
            this.P = Y2;
            return;
        }
        String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
        s(na02, 2, (IOException) null);
    }

    public final void K(xw4 xw4, na0 na0) {
        na0 na02 = na0;
        if (this.x != null) {
            long size = xw4.size() + this.K;
            long j2 = this.Q;
            long j3 = 0;
            if (j2 == 0 || size <= j2) {
                long Y2 = xw4.Y();
                long j4 = this.M;
                if (j4 == Long.MAX_VALUE) {
                    this.M = Y2;
                    String.format("First video time: %d (%s)", new Object[]{Long.valueOf(Y2), e07.I(this.M)});
                } else {
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    long nanos = timeUnit.toNanos(Y2 - Math.min(j4, this.N));
                    e07.p("There should be a previous data for adjusting the duration.", this.O != Long.MAX_VALUE);
                    long nanos2 = timeUnit.toNanos(Y2 - this.O) + nanos;
                    long j5 = this.R;
                    if (j5 == 0 || nanos2 <= j5) {
                        j3 = nanos;
                    } else {
                        String.format("Video data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                        s(na02, 9, (IOException) null);
                        return;
                    }
                }
                this.C.writeSampleData(this.x.intValue(), xw4.r(), xw4.F());
                this.K = size;
                this.L = j3;
                this.O = Y2;
                H();
                return;
            }
            String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
            s(na02, 2, (IOException) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    public final ns9 a() {
        return this.D;
    }

    public final void b(int i2) {
        this.e.execute(new n30(i2, 13, this));
    }

    public final ns9 c() {
        return this.a;
    }

    public final void d(y4e y4e) {
        f(y4e, kje.a);
    }

    public final ns9 e() {
        return this.b;
    }

    public final void f(y4e y4e, kje kje) {
        synchronized (this.h) {
            try {
                Objects.toString(this.k);
                if (this.k == x5c.x0) {
                    B(x5c.a);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.execute(new px4((Object) this, (Object) y4e, (Object) kje, 24));
    }

    public final a2f g(fu1 fu1) {
        return new z5c(this.j, fu1);
    }

    public final void h(y4e y4e, kje kje, boolean z2) {
        ma0 ma0;
        Object obj;
        if (!y4e.a()) {
            n5c n5c = new n5c(this);
            ryc ryc = this.e;
            y4e.c(ryc, n5c);
            int i2 = 0;
            z5c z5c = new z5c(0, y4e.e.p());
            zq4 zq4 = y4e.c;
            lw1 d2 = z5c.d(zq4);
            Size size = y4e.b;
            if (d2 == null) {
                ma0 = ma0.j;
            } else {
                TreeMap treeMap = d2.b;
                Size size2 = hjd.a;
                Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                if (ceilingEntry != null) {
                    obj = ceilingEntry.getValue();
                } else {
                    Map.Entry floorEntry = treeMap.floorEntry(size);
                    obj = floorEntry != null ? floorEntry.getValue() : null;
                }
                ma0 = (ma0) obj;
                if (ma0 == null) {
                    ma0 = ma0.j;
                }
            }
            Objects.toString(ma0);
            Objects.toString(size);
            if (ma0 != ma0.j) {
                nb0 b2 = z5c.b(ma0, zq4);
                this.u = b2;
                if (b2 == null) {
                    throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                }
            }
            ug4 ug4 = this.e0;
            if (ug4 != null && !ug4.b) {
                ug4.b = true;
                ScheduledFuture scheduledFuture = (ScheduledFuture) ug4.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    ug4.f = null;
                }
            }
            if (z2) {
                i2 = p0;
            }
            ug4 ug42 = new ug4(this, y4e, kje, i2);
            this.e0 = ug42;
            Objects.toString(this.F);
            vj4 vj4 = this.a0;
            vj4.e();
            ct0.A((ch7) vj4.k).c(new px4((Object) ug42, (Object) y4e, (Object) kje, 25), ryc);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: na0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: na0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: na0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: na0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: na0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: na0} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        r4 = null;
        r5 = null;
        r7 = null;
        r0 = false;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        if (r1.g0 != 3) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013f, code lost:
        r2 = r1.o;
        r1.o = null;
        B(defpackage.x5c.a);
        r5 = r2;
        r8 = 4;
        r2 = 0;
        r7 = m0;
        r4 = null;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0153, code lost:
        if (r1.i == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0155, code lost:
        r1.B = null;
        r4 = r1.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r4 == null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (r4.a() != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0162, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0163, code lost:
        I(defpackage.x5c.a);
        r4 = null;
        r5 = null;
        r7 = null;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r1.F == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0171, code lost:
        r4 = q(r1.k);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        r7 = r5;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017c, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x00a8 A[EDGE_INSN: B:104:0x00a8->B:27:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:24:0x009c->B:26:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Throwable r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            na0 r0 = r1.q
            if (r0 == 0) goto L_0x01ba
            android.media.MediaMuxer r0 = r1.C
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0023
            r0.stop()     // Catch:{ IllegalStateException -> 0x0015 }
            android.media.MediaMuxer r0 = r1.C     // Catch:{ IllegalStateException -> 0x0015 }
            r0.release()     // Catch:{ IllegalStateException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            r0.getMessage()
            if (r18 != 0) goto L_0x001d
            r0 = r2
            goto L_0x001f
        L_0x001d:
            r0 = r18
        L_0x001f:
            r1.C = r3
        L_0x0021:
            r8 = r0
            goto L_0x002a
        L_0x0023:
            if (r18 != 0) goto L_0x0028
            r0 = 8
            goto L_0x0021
        L_0x0028:
            r8 = r18
        L_0x002a:
            na0 r0 = r1.q
            android.net.Uri r4 = r1.J
            r0.a(r4)
            na0 r0 = r1.q
            re5 r10 = r0.w0
            oa0 r11 = r16.k()
            android.net.Uri r0 = r1.J
            java.lang.String r4 = "OutputUri cannot be null."
            defpackage.e07.o(r0, r4)
            ca0 r12 = new ca0
            r12.<init>(r0)
            na0 r0 = r1.q
            r15 = 0
            if (r8 != 0) goto L_0x0053
            a8f r4 = new a8f
            r13 = 0
            r14 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0069
        L_0x0053:
            if (r8 == 0) goto L_0x0057
            r4 = r2
            goto L_0x0058
        L_0x0057:
            r4 = r15
        L_0x0058:
            java.lang.String r5 = "An error type is required."
            defpackage.e07.j(r5, r4)
            a8f r13 = new a8f
            r4 = r13
            r5 = r10
            r6 = r11
            r7 = r12
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = r13
        L_0x0069:
            r0.n(r4)
            na0 r0 = r1.q
            r1.q = r3
            r1.r = r15
            r1.w = r3
            r1.x = r3
            java.util.ArrayList r4 = r1.v
            r4.clear()
            android.net.Uri r4 = android.net.Uri.EMPTY
            r1.J = r4
            r4 = 0
            r1.K = r4
            r1.L = r4
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.M = r4
            r1.N = r4
            r1.O = r4
            r1.P = r4
            r1.S = r2
            r1.T = r3
            r1.W = r3
            r4 = 0
            r1.c0 = r4
        L_0x009c:
            ci9 r4 = r1.V
            boolean r5 = r4.g()
            if (r5 != 0) goto L_0x00a8
            r4.d()
            goto L_0x009c
        L_0x00a8:
            r1.z(r3)
            int r4 = r1.f0
            int r4 = defpackage.hr1.t(r4)
            if (r4 == r2) goto L_0x01b2
            r5 = 3
            r6 = 2
            r7 = 4
            if (r4 == r6) goto L_0x00c3
            if (r4 == r5) goto L_0x00c3
            if (r4 == r7) goto L_0x00c0
            r6 = 5
            if (r4 == r6) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            r1.f0 = r2
            goto L_0x00d3
        L_0x00c3:
            r1.f0 = r6
            d60 r4 = r1.E
            ryc r6 = r4.a
            b r8 = new b
            r9 = 11
            r8.<init>(r9, r4)
            r6.execute(r8)
        L_0x00d3:
            java.lang.String r4 = "Unexpected state on finalize of recording: "
            java.lang.Object r6 = r1.h
            monitor-enter(r6)
            na0 r8 = r1.n     // Catch:{ all -> 0x0107 }
            if (r8 != r0) goto L_0x01a8
            k96 r0 = r8.Z     // Catch:{ all -> 0x0107 }
            r0.l()     // Catch:{ all -> 0x0107 }
            r1.n = r3     // Catch:{ all -> 0x0107 }
            x5c r0 = r1.k     // Catch:{ all -> 0x0107 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0107 }
            switch(r0) {
                case 1: goto L_0x013a;
                case 2: goto L_0x0138;
                case 3: goto L_0x0124;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00ed;
                default: goto L_0x00ec;
            }     // Catch:{ all -> 0x0107 }
        L_0x00ec:
            goto L_0x011d
        L_0x00ed:
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r8 = r0
            r3 = r2
            r2 = r8
            goto L_0x017f
        L_0x00f6:
            boolean r0 = r1.i     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0118
            r1.B = r3     // Catch:{ all -> 0x0107 }
            y4e r0 = r1.y     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r0.a()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x010a
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            goto L_0x01b0
        L_0x010a:
            r2 = r15
        L_0x010b:
            x5c r0 = defpackage.x5c.a     // Catch:{ all -> 0x0107 }
            r1.B(r0)     // Catch:{ all -> 0x0107 }
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r3 = r0
        L_0x0115:
            r8 = r3
            goto L_0x017f
        L_0x0118:
            x5c r0 = defpackage.x5c.o     // Catch:{ all -> 0x0107 }
            r1.B(r0)     // Catch:{ all -> 0x0107 }
        L_0x011d:
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r2 = r0
        L_0x0122:
            r3 = r2
            goto L_0x0115
        L_0x0124:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r2.<init>(r4)     // Catch:{ all -> 0x0107 }
            x5c r1 = r1.k     // Catch:{ all -> 0x0107 }
            r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0107 }
            r0.<init>(r1)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0138:
            r0 = r2
            goto L_0x013b
        L_0x013a:
            r0 = r15
        L_0x013b:
            int r4 = r1.g0     // Catch:{ all -> 0x0107 }
            if (r4 != r5) goto L_0x0151
            na0 r2 = r1.o     // Catch:{ all -> 0x0107 }
            r1.o = r3     // Catch:{ all -> 0x0107 }
            x5c r4 = defpackage.x5c.a     // Catch:{ all -> 0x0107 }
            r1.B(r4)     // Catch:{ all -> 0x0107 }
            java.lang.RuntimeException r4 = m0     // Catch:{ all -> 0x0107 }
            r5 = r2
            r8 = r7
            r2 = r15
            r7 = r4
            r4 = r3
            r3 = r2
            goto L_0x017f
        L_0x0151:
            boolean r4 = r1.i     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x016d
            r1.B = r3     // Catch:{ all -> 0x0107 }
            y4e r4 = r1.y     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0162
            boolean r4 = r4.a()     // Catch:{ all -> 0x0107 }
            if (r4 != 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r2 = r15
        L_0x0163:
            x5c r4 = defpackage.x5c.a     // Catch:{ all -> 0x0107 }
            r1.I(r4)     // Catch:{ all -> 0x0107 }
            r4 = r3
            r5 = r4
            r7 = r5
            r3 = r15
            goto L_0x0115
        L_0x016d:
            hx4 r2 = r1.F     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x017c
            x5c r2 = r1.k     // Catch:{ all -> 0x0107 }
            na0 r2 = r1.q(r2)     // Catch:{ all -> 0x0107 }
            r4 = r2
            r5 = r3
        L_0x0179:
            r7 = r5
            r2 = r15
            goto L_0x0122
        L_0x017c:
            r4 = r3
            r5 = r4
            goto L_0x0179
        L_0x017f:
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x018a
            y4e r0 = r1.y
            kje r2 = r1.z
            r1.h(r0, r2, r15)
            goto L_0x01a7
        L_0x018a:
            if (r3 == 0) goto L_0x0190
            r16.w()
            goto L_0x01a7
        L_0x0190:
            if (r4 == 0) goto L_0x01a2
            boolean r2 = r1.i
            if (r2 != 0) goto L_0x019a
            r1.E(r4, r0)
            goto L_0x01a7
        L_0x019a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            if (r5 == 0) goto L_0x01a7
            r1.j(r5, r8, r7)
        L_0x01a7:
            return
        L_0x01a8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "Active recording did not match finalized recording on finalize."
            r0.<init>(r1)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x01b0:
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            throw r0
        L_0x01b2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Incorrectly finalize recording when audio state is IDLING"
            r0.<init>(r1)
            throw r0
        L_0x01ba:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Attempted to finalize in-progress recording, but no recording is in progress."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5c.i(java.lang.Throwable, int):void");
    }

    public final void j(na0 na0, int i2, Throwable th) {
        Uri uri = Uri.EMPTY;
        na0.a(uri);
        boolean z2 = true;
        oa0 a2 = oa0.a(0, 0, new o80(1, 0.0d, this.W));
        e07.o(uri, "OutputUri cannot be null.");
        ca0 ca0 = new ca0(uri);
        if (i2 == 0) {
            z2 = false;
        }
        e07.j("An error type is required.", z2);
        na0.n(new a8f(na0.w0, a2, ca0, i2, th));
    }

    public final oa0 k() {
        int i2;
        long j2 = this.L;
        long j3 = this.K;
        int i3 = this.f0;
        int t2 = hr1.t(i3);
        if (t2 != 0) {
            i2 = 2;
            if (t2 != 2) {
                if (t2 != 3) {
                    i2 = 4;
                    if (t2 == 4) {
                        i2 = 3;
                    } else if (t2 != 5) {
                        throw new AssertionError("Invalid internal audio state: ".concat(m4b.n(i3)));
                    }
                } else {
                    na0 na0 = this.q;
                    if (na0 != null && na0.Y.get()) {
                        i2 = 5;
                    } else if (!this.X) {
                        i2 = 0;
                    }
                }
                return oa0.a(j2, j3, new o80(i2, this.c0, this.W));
            }
        }
        i2 = 1;
        return oa0.a(j2, j3, new o80(i2, this.c0, this.W));
    }

    public final boolean n() {
        return this.f0 == 4;
    }

    public final boolean o() {
        na0 na0 = this.q;
        return na0 != null && na0.A0;
    }

    public final na0 q(x5c x5c) {
        boolean z2;
        if (x5c == x5c.c) {
            z2 = true;
        } else if (x5c == x5c.b) {
            z2 = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.n == null) {
            na0 na0 = this.o;
            if (na0 != null) {
                this.n = na0;
                na0.Z.g(pa2.j(), new blb(1, this));
                this.o = null;
                if (z2) {
                    B(x5c.Y);
                } else {
                    B(x5c.X);
                }
                return na0;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    public final void s(na0 na0, int i2, IOException iOException) {
        boolean z2;
        if (na0 == this.q) {
            synchronized (this.h) {
                try {
                    z2 = false;
                    switch (this.k.ordinal()) {
                        case 0:
                        case 3:
                        case 8:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.k);
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            break;
                        case 4:
                        case 5:
                            B(x5c.Z);
                            z2 = true;
                            break;
                    }
                    if (na0 != this.n) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                F(na0, -1, i2, iOException);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    public final void t(na0 na0) {
        if (this.q == na0 && !this.r) {
            if (n()) {
                this.H.e();
            }
            ((xx4) this.F).e();
            na0 na02 = this.q;
            na02.n(new f8f(na02.w0, k()));
        }
    }

    public final void u() {
        d60 d60 = this.E;
        if (d60 != null) {
            this.E = null;
            String.format("Releasing audio source: 0x%x", new Object[]{Integer.valueOf(d60.hashCode())});
            ct0.a(hwf.f(new rgc(8, d60)), new u5g(23, (Object) d60), pa2.j());
            return;
        }
        throw new AssertionError("Cannot release null audio source.");
    }

    public final void v(boolean z2) {
        boolean z3;
        boolean z4;
        synchronized (this.h) {
            try {
                z3 = true;
                z4 = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        I(x5c.w0);
                        break;
                    case 4:
                    case 5:
                        e07.p("In-progress recording shouldn't be null when in state " + this.k, this.q != null);
                        if (this.n == this.q) {
                            if (!o()) {
                                B(x5c.w0);
                                z4 = true;
                                z3 = false;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                    case 6:
                        B(x5c.w0);
                        break;
                }
                z3 = false;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            if (z2) {
                x();
            } else {
                w();
            }
        } else if (z4) {
            F(this.q, -1, 4, (Exception) null);
        }
    }

    public final void w() {
        xx4 xx4 = this.H;
        if (xx4 != null) {
            xx4.h.execute(new lx4(xx4, 4));
            this.H = null;
            this.I = null;
        }
        if (this.E != null) {
            u();
        }
        this.f0 = 1;
        x();
    }

    public final void x() {
        y4e y4e;
        hx4 hx4 = this.F;
        boolean z2 = true;
        if (hx4 != null) {
            vj4 vj4 = this.b0;
            if (vj4 != null) {
                e07.p((String) null, ((xx4) vj4.f) == hx4);
                Objects.toString(this.F);
                this.b0.u();
                this.b0 = null;
                this.F = null;
                this.G = null;
                A((Surface) null);
            } else {
                Objects.toString(hx4);
                vj4 vj42 = this.a0;
                vj42.e();
                ct0.A((ch7) vj42.k);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.k.ordinal()) {
                    case 1:
                    case 2:
                        I(x5c.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z2 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(x5c.a);
                        break;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.Z = false;
        if (z2 && (y4e = this.y) != null && !y4e.a()) {
            h(this.y, this.z, false);
        }
    }

    public final void y() {
        if (h0.contains(this.k)) {
            B(this.l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.k);
    }

    public final void z(cb0 cb0) {
        Objects.toString(cb0);
        this.s = cb0;
        synchronized (this.h) {
            this.a.v(new ua0(this.m, m(this.k), cb0));
        }
    }
}
