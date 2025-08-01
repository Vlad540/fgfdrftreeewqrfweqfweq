package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: c54  reason: default package */
public final class c54 implements a60 {
    public static final Object m0 = new Object();
    public static ExecutorService n0;
    public static int o0;
    public k20 A;
    public u44 B;
    public u44 C;
    public wxa D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public byte[] T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public int a0;
    public final it4 b;
    public qb0 b0;
    public final boolean c;
    public i30 c0;
    public final h12 d;
    public boolean d0;
    public final dse e;
    public long e0;
    public final e8c f;
    public long f0;
    public final e8c g;
    public boolean g0;
    public final ga3 h;
    public boolean h0;
    public final n60 i;
    public Looper i0;
    public final ArrayDeque j;
    public long j0;
    public final boolean k;
    public long k0;
    public int l;
    public Handler l0;
    public a54 m;
    public final x44 n;
    public final x44 o;
    public final m54 p;
    public final b2b q;
    public cza r;
    public lhd s;
    public s44 t;
    public s44 u;
    public f50 v;
    public AudioTrack w;
    public w20 x;
    public a30 y;
    public w44 z;

    /* JADX WARNING: type inference failed for: r10v5, types: [h12, rg0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [dse, rg0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v11, types: [java.lang.Object, qb0] */
    public c54(q44 q44) {
        w20 w20;
        Context context = (Context) q44.d;
        this.a = context;
        k20 k20 = k20.g;
        this.A = k20;
        if (context != null) {
            w20 w202 = w20.c;
            int i2 = oze.a;
            w20 = w20.b(context, k20, (i30) null);
        } else {
            w20 = (w20) q44.e;
        }
        this.x = w20;
        this.b = (it4) q44.f;
        int i3 = oze.a;
        this.c = i3 >= 21 && q44.a;
        this.k = i3 >= 23 && q44.b;
        this.l = 0;
        this.p = (m54) q44.g;
        b2b b2b = (b2b) q44.h;
        b2b.getClass();
        this.q = b2b;
        ga3 ga3 = new ga3(false, 1);
        this.h = ga3;
        ga3.g();
        this.i = new n60(new c9(8, this));
        ? rg0 = new rg0();
        this.d = rg0;
        ? rg02 = new rg0();
        rg02.m = oze.f;
        this.e = rg02;
        rg0 rg03 = new rg0();
        po5 po5 = ws6.b;
        Object[] objArr = {rg03, rg0, rg02};
        e07.n(3, objArr);
        this.f = ws6.h(3, objArr);
        this.g = ws6.n(new rg0());
        this.P = 1.0f;
        this.a0 = 0;
        this.b0 = new Object();
        wxa wxa = wxa.d;
        this.C = new u44(wxa, 0, 0);
        this.D = wxa;
        this.E = false;
        this.j = new ArrayDeque();
        this.n = new x44(1);
        this.o = new x44(1);
    }

    public static boolean m(AudioTrack audioTrack) {
        return oze.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r2 != 4) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r2 != 4) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            boolean r2 = r16.t()
            r3 = 4
            r4 = 1610612736(0x60000000, float:3.6893488E19)
            r5 = 22
            r6 = 1342177280(0x50000000, float:8.5899346E9)
            r7 = 21
            boolean r8 = r0.c
            it4 r9 = r0.b
            if (r2 != 0) goto L_0x005b
            boolean r2 = r0.d0
            if (r2 != 0) goto L_0x0055
            s44 r2 = r0.u
            int r10 = r2.c
            if (r10 != 0) goto L_0x0055
            xu5 r2 = r2.a
            int r2 = r2.D
            if (r8 == 0) goto L_0x0033
            int r10 = defpackage.oze.a
            if (r2 == r7) goto L_0x0055
            if (r2 == r6) goto L_0x0055
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0055
            if (r2 != r3) goto L_0x0033
            goto L_0x0055
        L_0x0033:
            wxa r2 = r0.D
            r9.getClass()
            float r10 = r2.a
            java.lang.Object r11 = r9.c
            qld r11 = (defpackage.qld) r11
            float r12 = r11.c
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0048
            r11.c = r10
            r11.i = r1
        L_0x0048:
            float r10 = r11.d
            float r12 = r2.b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0057
            r11.d = r12
            r11.i = r1
            goto L_0x0057
        L_0x0055:
            wxa r2 = defpackage.wxa.d
        L_0x0057:
            r0.D = r2
        L_0x0059:
            r11 = r2
            goto L_0x005e
        L_0x005b:
            wxa r2 = defpackage.wxa.d
            goto L_0x0059
        L_0x005e:
            boolean r2 = r0.d0
            if (r2 != 0) goto L_0x0084
            s44 r2 = r0.u
            int r10 = r2.c
            if (r10 != 0) goto L_0x0084
            xu5 r2 = r2.a
            int r2 = r2.D
            if (r8 == 0) goto L_0x007b
            int r8 = defpackage.oze.a
            if (r2 == r7) goto L_0x0084
            if (r2 == r6) goto L_0x0084
            if (r2 == r5) goto L_0x0084
            if (r2 == r4) goto L_0x0084
            if (r2 != r3) goto L_0x007b
            goto L_0x0084
        L_0x007b:
            boolean r2 = r0.E
            java.lang.Object r3 = r9.b
            ggd r3 = (defpackage.ggd) r3
            r3.o = r2
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            r0.E = r2
            java.util.ArrayDeque r2 = r0.j
            u44 r3 = new u44
            r4 = 0
            r6 = r17
            long r12 = java.lang.Math.max(r4, r6)
            s44 r4 = r0.u
            long r5 = r16.h()
            int r4 = r4.e
            long r14 = defpackage.oze.Y(r4, r5)
            r10 = r3
            r10.<init>(r11, r12, r14)
            r2.add(r3)
            s44 r2 = r0.u
            f50 r2 = r2.i
            r0.v = r2
            r2.b()
            lhd r2 = r0.s
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r0.E
            java.lang.Object r2 = r2.b
            m28 r2 = (defpackage.m28) r2
            qe4 r2 = r2.V1
            java.lang.Object r3 = r2.b
            android.os.Handler r3 = (android.os.Handler) r3
            if (r3 == 0) goto L_0x00c9
            t50 r4 = new t50
            r4.<init>((java.lang.Object) r2, (boolean) r0, (int) r1)
            r3.post(r4)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.a(long):void");
    }

    /* JADX WARNING: type inference failed for: r12v11, types: [ms6, ts6] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a6, code lost:
        if (((r3 == java.math.RoundingMode.HALF_EVEN) & ((r20 & 1) != 0)) != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a9, code lost:
        if (r23 > 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ac, code lost:
        if (r9 > 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01af, code lost:
        if (r9 < 0) goto L_0x01b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.xu5 r28, int[] r29) {
        /*
            r27 = this;
            r0 = r27
            r2 = r28
            r27.n()
            java.lang.String r1 = r2.n
            java.lang.String r3 = "audio/raw"
            boolean r1 = r3.equals(r1)
            r3 = 2
            boolean r4 = r0.k
            r5 = 8
            r6 = -1
            r7 = 1
            java.lang.String r9 = r2.n
            int r10 = r2.B
            if (r1 == 0) goto L_0x00bb
            int r1 = r2.D
            boolean r11 = defpackage.oze.L(r1)
            defpackage.oyb.d(r11)
            int r11 = defpackage.oze.D(r1, r10)
            ts6 r12 = new ts6
            r13 = 4
            r12.<init>(r13)
            boolean r14 = r0.c
            r15 = 21
            if (r14 == 0) goto L_0x004b
            if (r1 == r15) goto L_0x0045
            r14 = 1342177280(0x50000000, float:8.5899346E9)
            if (r1 == r14) goto L_0x0045
            r14 = 22
            if (r1 == r14) goto L_0x0045
            r14 = 1610612736(0x60000000, float:3.6893488E19)
            if (r1 == r14) goto L_0x0045
            if (r1 != r13) goto L_0x004b
        L_0x0045:
            e8c r1 = r0.g
            r12.e(r1)
            goto L_0x0059
        L_0x004b:
            e8c r1 = r0.f
            r12.e(r1)
            it4 r1 = r0.b
            java.lang.Object r1 = r1.a
            k50[] r1 = (defpackage.k50[]) r1
            r12.b(r1)
        L_0x0059:
            f50 r1 = new f50
            e8c r12 = r12.j()
            r1.<init>(r12)
            f50 r12 = r0.v
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x006c
            f50 r1 = r0.v
        L_0x006c:
            int r12 = r2.E
            dse r13 = r0.e
            r13.i = r12
            int r12 = r2.F
            r13.j = r12
            int r12 = defpackage.oze.a
            if (r12 >= r15) goto L_0x0089
            if (r10 != r5) goto L_0x0089
            if (r29 != 0) goto L_0x0089
            r10 = 6
            int[] r12 = new int[r10]
            r13 = 0
        L_0x0082:
            if (r13 >= r10) goto L_0x008b
            r12[r13] = r13
            int r13 = r13 + 1
            goto L_0x0082
        L_0x0089:
            r12 = r29
        L_0x008b:
            h12 r10 = r0.d
            r10.i = r12
            h50 r10 = new h50
            r10.<init>(r2)
            h50 r10 = r1.a(r10)     // Catch:{ AudioProcessor$UnhandledAudioFormatException -> 0x00b3 }
            int r12 = r10.b
            int r13 = defpackage.oze.t(r12)
            int r14 = r10.c
            int r12 = defpackage.oze.D(r14, r12)
            int r10 = r10.a
            r15 = r1
            r16 = r4
            r4 = 0
            r17 = 0
            r26 = r13
            r13 = r10
            r10 = r26
            goto L_0x0113
        L_0x00b3:
            r0 = move-exception
            r1 = r0
            androidx.media3.exoplayer.audio.AudioSink$ConfigurationException r0 = new androidx.media3.exoplayer.audio.AudioSink$ConfigurationException
            r0.<init>((androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException) r1, (defpackage.xu5) r2)
            throw r0
        L_0x00bb:
            f50 r1 = new f50
            e8c r11 = defpackage.e8c.X
            r1.<init>(r11)
            int r11 = r0.l
            if (r11 == 0) goto L_0x00cb
            a50 r11 = r27.e(r28)
            goto L_0x00cd
        L_0x00cb:
            a50 r11 = defpackage.a50.d
        L_0x00cd:
            int r12 = r0.l
            int r13 = r2.C
            if (r12 == 0) goto L_0x00f0
            boolean r12 = r11.a
            if (r12 == 0) goto L_0x00f0
            r9.getClass()
            java.lang.String r4 = r2.j
            int r4 = defpackage.c49.b(r9, r4)
            int r10 = defpackage.oze.t(r10)
            boolean r11 = r11.b
            r15 = r1
            r14 = r4
            r12 = r6
            r4 = r7
            r16 = r4
            r17 = r11
        L_0x00ee:
            r11 = r12
            goto L_0x0113
        L_0x00f0:
            w20 r10 = r0.x
            k20 r11 = r0.A
            android.util.Pair r10 = r10.d(r11, r2)
            if (r10 == 0) goto L_0x0286
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r15 = r1
            r16 = r4
            r12 = r6
            r14 = r11
            r17 = 0
            r4 = r3
            goto L_0x00ee
        L_0x0113:
            java.lang.String r1 = ") for: "
            if (r14 == 0) goto L_0x026c
            if (r10 == 0) goto L_0x0252
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            boolean r1 = r1.equals(r9)
            int r9 = r2.i
            if (r1 == 0) goto L_0x0128
            if (r9 != r6) goto L_0x0128
            r9 = 768000(0xbb800, float:1.076197E-39)
        L_0x0128:
            int r1 = android.media.AudioTrack.getMinBufferSize(r13, r10, r14)
            r8 = -2
            if (r1 == r8) goto L_0x0131
            r8 = r7
            goto L_0x0132
        L_0x0131:
            r8 = 0
        L_0x0132:
            defpackage.oyb.k(r8)
            if (r12 == r6) goto L_0x0139
            r8 = r12
            goto L_0x013a
        L_0x0139:
            r8 = r7
        L_0x013a:
            if (r16 == 0) goto L_0x013f
            r18 = 4620693217682128896(0x4020000000000000, double:8.0)
            goto L_0x0141
        L_0x013f:
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0141:
            m54 r6 = r0.p
            r6.getClass()
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 250000(0x3d090, float:3.50325E-40)
            if (r4 == 0) goto L_0x01f5
            if (r4 == r7) goto L_0x01e2
            if (r4 != r3) goto L_0x01dc
            r3 = 5
            if (r14 != r3) goto L_0x015a
            r6 = 500000(0x7a120, float:7.00649E-40)
        L_0x0158:
            r3 = -1
            goto L_0x0160
        L_0x015a:
            if (r14 != r5) goto L_0x0158
            r6 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x0158
        L_0x0160:
            if (r9 == r3) goto L_0x01c1
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            r3.getClass()
            int r20 = r9 / 8
            int r23 = r5 * r20
            int r23 = r9 - r23
            if (r23 != 0) goto L_0x0170
            goto L_0x01b6
        L_0x0170:
            r9 = r9 ^ r5
            int r9 = r9 >> 31
            r9 = r9 | r7
            int[] r24 = defpackage.cz6.a
            int r25 = r3.ordinal()
            r24 = r24[r25]
            switch(r24) {
                case 1: goto L_0x01b4;
                case 2: goto L_0x01b6;
                case 3: goto L_0x01af;
                case 4: goto L_0x01b1;
                case 5: goto L_0x01ac;
                case 6: goto L_0x0185;
                case 7: goto L_0x0185;
                case 8: goto L_0x0185;
                default: goto L_0x017f;
            }
        L_0x017f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0185:
            int r23 = java.lang.Math.abs(r23)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r23
            int r23 = r23 - r5
            if (r23 != 0) goto L_0x01a9
            java.math.RoundingMode r5 = java.math.RoundingMode.HALF_UP
            if (r3 == r5) goto L_0x01b1
            java.math.RoundingMode r5 = java.math.RoundingMode.HALF_EVEN
            if (r3 != r5) goto L_0x019d
            r3 = r7
            goto L_0x019e
        L_0x019d:
            r3 = 0
        L_0x019e:
            r5 = r20 & 1
            if (r5 == 0) goto L_0x01a4
            r5 = r7
            goto L_0x01a5
        L_0x01a4:
            r5 = 0
        L_0x01a5:
            r3 = r3 & r5
            if (r3 == 0) goto L_0x01b6
            goto L_0x01b1
        L_0x01a9:
            if (r23 <= 0) goto L_0x01b6
            goto L_0x01b1
        L_0x01ac:
            if (r9 <= 0) goto L_0x01b6
            goto L_0x01b1
        L_0x01af:
            if (r9 >= 0) goto L_0x01b6
        L_0x01b1:
            int r20 = r20 + r9
            goto L_0x01b6
        L_0x01b4:
            if (r23 != 0) goto L_0x01b9
        L_0x01b6:
            r3 = r20
            goto L_0x01c6
        L_0x01b9:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "mode was UNNECESSARY, but rounding was necessary"
            r0.<init>(r1)
            throw r0
        L_0x01c1:
            int r20 = defpackage.m54.q(r14)
            goto L_0x01b6
        L_0x01c6:
            long r5 = (long) r6
            r20 = r8
            long r7 = (long) r3
            long r5 = r5 * r7
            long r5 = r5 / r21
            int r3 = defpackage.xie.l(r5)
        L_0x01d1:
            r24 = r12
            r25 = r13
            r23 = r15
            r9 = r20
            r20 = r14
            goto L_0x021e
        L_0x01dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x01e2:
            r20 = r8
            int r3 = defpackage.m54.q(r14)
            r5 = 50000000(0x2faf080, float:3.6872239E-37)
            long r5 = (long) r5
            long r7 = (long) r3
            long r5 = r5 * r7
            long r5 = r5 / r21
            int r3 = defpackage.xie.l(r5)
            goto L_0x01d1
        L_0x01f5:
            r20 = r8
            int r3 = r1 * 4
            long r5 = (long) r6
            long r7 = (long) r13
            long r5 = r5 * r7
            r23 = r15
            r9 = r20
            r20 = r14
            long r14 = (long) r9
            long r5 = r5 * r14
            long r5 = r5 / r21
            int r5 = defpackage.xie.l(r5)
            r6 = 750000(0xb71b0, float:1.050974E-39)
            r24 = r12
            r25 = r13
            long r12 = (long) r6
            long r12 = r12 * r7
            long r12 = r12 * r14
            long r12 = r12 / r21
            int r6 = defpackage.xie.l(r12)
            int r3 = defpackage.oze.j(r3, r5, r6)
        L_0x021e:
            double r5 = (double) r3
            double r5 = r5 * r18
            int r3 = (int) r5
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + r9
            r3 = 1
            int r1 = r1 - r3
            int r1 = r1 / r9
            int r9 = r9 * r1
            r1 = 0
            r0.g0 = r1
            s44 r14 = new s44
            boolean r13 = r0.d0
            r1 = r14
            r2 = r28
            r3 = r11
            r5 = r24
            r6 = r25
            r7 = r10
            r8 = r20
            r10 = r23
            r11 = r16
            r12 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r27.l()
            if (r1 == 0) goto L_0x024f
            r0.t = r14
            goto L_0x0251
        L_0x024f:
            r0.u = r14
        L_0x0251:
            return
        L_0x0252:
            androidx.media3.exoplayer.audio.AudioSink$ConfigurationException r0 = new androidx.media3.exoplayer.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid output channel config (mode="
            r3.<init>(r5)
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>((defpackage.xu5) r2, (java.lang.String) r1)
            throw r0
        L_0x026c:
            androidx.media3.exoplayer.audio.AudioSink$ConfigurationException r0 = new androidx.media3.exoplayer.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid output encoding (mode="
            r3.<init>(r5)
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>((defpackage.xu5) r2, (java.lang.String) r1)
            throw r0
        L_0x0286:
            androidx.media3.exoplayer.audio.AudioSink$ConfigurationException r0 = new androidx.media3.exoplayer.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to configure passthrough for: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((defpackage.xu5) r2, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.b(xu5, int[]):void");
    }

    public final boolean c() {
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.S;
            if (byteBuffer == null) {
                return true;
            }
            u(Long.MIN_VALUE, byteBuffer);
            return this.S == null;
        }
        this.v.h();
        q(Long.MIN_VALUE);
        if (!this.v.e()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.S;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    public final void d() {
        w44 w44;
        if (l()) {
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.h0 = false;
            this.L = 0;
            this.C = new u44(this.D, 0, 0);
            this.O = 0;
            this.B = null;
            this.j.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.W = false;
            this.V = false;
            this.X = false;
            this.F = null;
            this.G = 0;
            this.e.o = 0;
            f50 f50 = this.u.i;
            this.v = f50;
            f50.b();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (m(this.w)) {
                a54 a54 = this.m;
                a54.getClass();
                a54.b(this.w);
            }
            int i2 = oze.a;
            if (i2 < 21 && !this.Z) {
                this.a0 = 0;
            }
            s44 s44 = this.u;
            z50 z50 = new z50(s44.g, s44.e, s44.f, s44.h, s44.l, s44.c == 1);
            s44 s442 = this.t;
            if (s442 != null) {
                this.u = s442;
                this.t = null;
            }
            n60 n60 = this.i;
            n60.d();
            n60.c = null;
            n60.f = null;
            if (i2 >= 24 && (w44 = this.z) != null) {
                w44.c();
                this.z = null;
            }
            AudioTrack audioTrack2 = this.w;
            ga3 ga3 = this.h;
            lhd lhd = this.s;
            ga3.c();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (m0) {
                try {
                    if (n0 == null) {
                        n0 = Executors.newSingleThreadExecutor(new v93(2, "ExoPlayer:AudioTrackReleaseThread"));
                    }
                    o0++;
                    n0.execute(new co1(audioTrack2, lhd, handler, z50, ga3, 3));
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.w = null;
        }
        this.o.b = null;
        this.n.b = null;
        this.j0 = 0;
        this.k0 = 0;
        Handler handler2 = this.l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    public final a50 e(xu5 xu5) {
        int i2;
        boolean z2;
        if (this.g0) {
            return a50.d;
        }
        k20 k20 = this.A;
        b2b b2b = this.q;
        b2b.getClass();
        xu5.getClass();
        k20.getClass();
        int i3 = oze.a;
        if (i3 < 29 || (i2 = xu5.C) == -1) {
            return a50.d;
        }
        Boolean bool = (Boolean) b2b.c;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            Context context = (Context) b2b.b;
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    b2b.c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    b2b.c = Boolean.FALSE;
                }
            } else {
                b2b.c = Boolean.FALSE;
            }
            z2 = ((Boolean) b2b.c).booleanValue();
        }
        String str = xu5.n;
        str.getClass();
        int b2 = c49.b(str, xu5.j);
        if (b2 == 0 || i3 < oze.r(b2)) {
            return a50.d;
        }
        int t2 = oze.t(xu5.B);
        if (t2 == 0) {
            return a50.d;
        }
        try {
            AudioFormat s2 = oze.s(i2, t2, b2);
            return i3 >= 31 ? k44.a(s2, (AudioAttributes) k20.b().b, z2) : j44.a(s2, (AudioAttributes) k20.b().b, z2);
        } catch (IllegalArgumentException unused) {
            return a50.d;
        }
    }

    public final int f(xu5 xu5) {
        n();
        if (!"audio/raw".equals(xu5.n)) {
            return this.x.d(this.A, xu5) != null ? 2 : 0;
        }
        int i2 = xu5.D;
        if (oze.L(i2)) {
            return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
        }
        us8.l(i2, "Invalid PCM encoding: ");
        return 0;
    }

    public final long g() {
        s44 s44 = this.u;
        return s44.c == 0 ? this.H / ((long) s44.b) : this.I;
    }

    public final long h() {
        s44 s44 = this.u;
        if (s44.c != 0) {
            return this.K;
        }
        long j2 = this.J;
        long j3 = (long) s44.d;
        int i2 = oze.a;
        return ((j2 + j3) - 1) / j3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0216, code lost:
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0282, code lost:
        if (((r1.get(r25.position() + 5) & 248) >> 3) <= 10) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0292, code lost:
        if (((r1.get(r25.position() + 4) & 192) >> 6) != 3) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0295, code lost:
        r8 = (r1.get(r25.position() + 4) & 48) >> 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02a3, code lost:
        r5 = defpackage.z3d.a[r8] * 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ab, code lost:
        r5 = 1536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0106, code lost:
        if (r9.b() == 0) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r4 = r28
            java.nio.ByteBuffer r5 = r0.Q
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0013
            if (r1 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0014
        L_0x0013:
            r5 = r6
        L_0x0014:
            defpackage.oyb.d(r5)
            s44 r5 = r0.t
            r8 = 3
            n60 r9 = r0.i
            r10 = 0
            if (r5 == 0) goto L_0x00a8
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x0026
            return r7
        L_0x0026:
            s44 r5 = r0.t
            s44 r11 = r0.u
            r5.getClass()
            int r12 = r11.c
            int r13 = r5.c
            if (r12 != r13) goto L_0x0098
            int r12 = r11.g
            int r13 = r5.g
            if (r12 != r13) goto L_0x0098
            int r12 = r11.e
            int r13 = r5.e
            if (r12 != r13) goto L_0x0098
            int r12 = r11.f
            int r13 = r5.f
            if (r12 != r13) goto L_0x0098
            int r12 = r11.d
            int r13 = r5.d
            if (r12 != r13) goto L_0x0098
            boolean r12 = r11.j
            boolean r13 = r5.j
            if (r12 != r13) goto L_0x0098
            boolean r11 = r11.k
            boolean r5 = r5.k
            if (r11 != r5) goto L_0x0098
            s44 r5 = r0.t
            r0.u = r5
            r0.t = r10
            android.media.AudioTrack r5 = r0.w
            if (r5 == 0) goto L_0x00a5
            boolean r5 = m(r5)
            if (r5 == 0) goto L_0x00a5
            s44 r5 = r0.u
            boolean r5 = r5.k
            if (r5 == 0) goto L_0x00a5
            android.media.AudioTrack r5 = r0.w
            int r5 = r5.getPlayState()
            if (r5 != r8) goto L_0x0088
            android.media.AudioTrack r5 = r0.w
            r5.setOffloadEndOfStream()
            r9.H = r6
            l60 r5 = r9.f
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r5.g
            k60 r5 = (defpackage.k60) r5
            if (r5 == 0) goto L_0x0088
            r5.f = r6
        L_0x0088:
            android.media.AudioTrack r5 = r0.w
            s44 r11 = r0.u
            xu5 r11 = r11.a
            int r12 = r11.E
            int r11 = r11.F
            r5.setOffloadDelayPadding(r12, r11)
            r0.h0 = r6
            goto L_0x00a5
        L_0x0098:
            r24.p()
            boolean r5 = r24.j()
            if (r5 == 0) goto L_0x00a2
            return r7
        L_0x00a2:
            r24.d()
        L_0x00a5:
            r0.a(r2)
        L_0x00a8:
            boolean r5 = r24.l()
            x44 r11 = r0.n
            if (r5 != 0) goto L_0x00c2
            boolean r5 = r24.k()     // Catch:{ AudioSink$InitializationException -> 0x00b7 }
            if (r5 != 0) goto L_0x00c2
            return r7
        L_0x00b7:
            r0 = move-exception
            r1 = r0
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x00c1
            r11.a(r1)
            return r7
        L_0x00c1:
            throw r1
        L_0x00c2:
            r11.b = r10
            boolean r5 = r0.N
            r11 = 0
            if (r5 == 0) goto L_0x00e7
            long r13 = java.lang.Math.max(r11, r2)
            r0.O = r13
            r0.M = r7
            r0.N = r7
            boolean r5 = r24.t()
            if (r5 == 0) goto L_0x00dd
            r24.s()
        L_0x00dd:
            r0.a(r2)
            boolean r5 = r0.Y
            if (r5 == 0) goto L_0x00e7
            r24.o()
        L_0x00e7:
            long r13 = r24.h()
            android.media.AudioTrack r5 = r9.c
            r5.getClass()
            int r5 = r5.getPlayState()
            boolean r15 = r9.h
            r10 = 2
            if (r15 == 0) goto L_0x0109
            if (r5 != r10) goto L_0x00fe
            r9.p = r7
            goto L_0x0108
        L_0x00fe:
            if (r5 != r6) goto L_0x0109
            long r16 = r9.b()
            int r15 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0109
        L_0x0108:
            return r7
        L_0x0109:
            boolean r15 = r9.p
            boolean r13 = r9.c(r13)
            r9.p = r13
            if (r15 == 0) goto L_0x014f
            if (r13 != 0) goto L_0x014f
            if (r5 == r6) goto L_0x014f
            int r5 = r9.e
            long r13 = r9.i
            long r19 = defpackage.oze.h0(r13)
            c9 r13 = r9.a
            java.lang.Object r13 = r13.b
            c54 r13 = (defpackage.c54) r13
            lhd r14 = r13.s
            if (r14 == 0) goto L_0x014f
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r11 = r13.f0
            long r21 = r14 - r11
            lhd r11 = r13.s
            java.lang.Object r11 = r11.b
            m28 r11 = (defpackage.m28) r11
            qe4 r11 = r11.V1
            java.lang.Object r12 = r11.b
            android.os.Handler r12 = (android.os.Handler) r12
            if (r12 == 0) goto L_0x014f
            s50 r13 = new s50
            r18 = 1
            r16 = r13
            r17 = r5
            r23 = r11
            r16.<init>(r17, r18, r19, r21, r23)
            r12.post(r13)
        L_0x014f:
            java.nio.ByteBuffer r5 = r0.Q
            if (r5 != 0) goto L_0x042b
            java.nio.ByteOrder r5 = r25.order()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r11) goto L_0x015d
            r5 = r6
            goto L_0x015e
        L_0x015d:
            r5 = r7
        L_0x015e:
            defpackage.oyb.d(r5)
            boolean r5 = r25.hasRemaining()
            if (r5 != 0) goto L_0x0168
            return r6
        L_0x0168:
            s44 r5 = r0.u
            int r11 = r5.c
            if (r11 == 0) goto L_0x038d
            int r11 = r0.L
            if (r11 != 0) goto L_0x038d
            r11 = 20
            r12 = 5
            int r5 = r5.g
            if (r5 == r11) goto L_0x032b
            r11 = 30
            r13 = -2
            r14 = 1024(0x400, float:1.435E-42)
            r15 = -1
            if (r5 == r11) goto L_0x0274
            r11 = 10
            switch(r5) {
                case 5: goto L_0x0276;
                case 6: goto L_0x0276;
                case 7: goto L_0x0274;
                case 8: goto L_0x0274;
                case 9: goto L_0x021d;
                case 10: goto L_0x0388;
                case 11: goto L_0x0219;
                case 12: goto L_0x0219;
                default: goto L_0x0186;
            }
        L_0x0186:
            r10 = 16
            switch(r5) {
                case 14: goto L_0x01b6;
                case 15: goto L_0x01b2;
                case 16: goto L_0x0388;
                case 17: goto L_0x0197;
                case 18: goto L_0x0276;
                default: goto L_0x018b;
            }
        L_0x018b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected audio encoding: "
            java.lang.String r1 = wn6.h(r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x0197:
            byte[] r5 = new byte[r10]
            int r8 = r25.position()
            r1.get(r5)
            r1.position(r8)
            wx1 r8 = new wx1
            r11 = 2
            r12 = 0
            r8.<init>((byte[]) r5, (int) r10, (int) r11, (byte) r12)
            x3 r5 = defpackage.gt0.F(r8)
            int r14 = r5.c
            goto L_0x0388
        L_0x01b2:
            r14 = 512(0x200, float:7.175E-43)
            goto L_0x0388
        L_0x01b6:
            int r5 = r25.position()
            int r8 = r25.limit()
            int r8 = r8 - r11
            r11 = r5
        L_0x01c0:
            if (r11 > r8) goto L_0x01e2
            int r12 = r11 + 4
            int r12 = r1.getInt(r12)
            java.nio.ByteOrder r14 = r25.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            if (r14 != r7) goto L_0x01d1
            goto L_0x01d5
        L_0x01d1:
            int r12 = java.lang.Integer.reverseBytes(r12)
        L_0x01d5:
            r7 = r12 & -2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r7 != r12) goto L_0x01de
            int r11 = r11 - r5
            goto L_0x01e3
        L_0x01de:
            int r11 = r11 + 1
            r7 = 0
            goto L_0x01c0
        L_0x01e2:
            r11 = r15
        L_0x01e3:
            if (r11 != r15) goto L_0x01e8
            r14 = 0
            goto L_0x0388
        L_0x01e8:
            int r5 = r25.position()
            int r5 = r5 + r11
            int r5 = r5 + 7
            byte r5 = r1.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r7 = 187(0xbb, float:2.62E-43)
            if (r5 != r7) goto L_0x01fb
            r5 = r6
            goto L_0x01fc
        L_0x01fb:
            r5 = 0
        L_0x01fc:
            int r7 = r25.position()
            int r7 = r7 + r11
            if (r5 == 0) goto L_0x0206
            r5 = 9
            goto L_0x0208
        L_0x0206:
            r5 = 8
        L_0x0208:
            int r7 = r7 + r5
            byte r5 = r1.get(r7)
            int r5 = r5 >> 4
            r5 = r5 & 7
            r7 = 40
            int r5 = r7 << r5
            int r5 = r5 * r10
        L_0x0216:
            r14 = r5
            goto L_0x0388
        L_0x0219:
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0388
        L_0x021d:
            int r5 = r25.position()
            int r5 = r1.getInt(r5)
            java.nio.ByteOrder r7 = r25.order()
            java.nio.ByteOrder r12 = java.nio.ByteOrder.BIG_ENDIAN
            if (r7 != r12) goto L_0x022e
            goto L_0x0232
        L_0x022e:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x0232:
            r7 = -2097152(0xffffffffffe00000, float:NaN)
            r12 = r5 & r7
            if (r12 != r7) goto L_0x023d
            int r7 = r5 >>> 19
            r7 = r7 & r8
            if (r7 != r6) goto L_0x023f
        L_0x023d:
            r14 = r15
            goto L_0x026a
        L_0x023f:
            int r12 = r5 >>> 17
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0245
            goto L_0x023d
        L_0x0245:
            int r13 = r5 >>> 12
            r14 = 15
            r13 = r13 & r14
            int r5 = r5 >>> r11
            r5 = r5 & r8
            if (r13 == 0) goto L_0x023d
            if (r13 == r14) goto L_0x023d
            if (r5 != r8) goto L_0x0253
            goto L_0x023d
        L_0x0253:
            r5 = 1152(0x480, float:1.614E-42)
            if (r12 == r6) goto L_0x0264
            if (r12 == r10) goto L_0x0269
            if (r12 != r8) goto L_0x025e
            r5 = 384(0x180, float:5.38E-43)
            goto L_0x0269
        L_0x025e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0264:
            if (r7 != r8) goto L_0x0267
            goto L_0x0269
        L_0x0267:
            r5 = 576(0x240, float:8.07E-43)
        L_0x0269:
            r14 = r5
        L_0x026a:
            if (r14 == r15) goto L_0x026e
            goto L_0x0388
        L_0x026e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0274:
            r5 = r7
            goto L_0x02af
        L_0x0276:
            int r5 = r25.position()
            int r5 = r5 + r12
            byte r5 = r1.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            int r5 = r5 >> r8
            if (r5 <= r11) goto L_0x02ab
            int r5 = r25.position()
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r8) goto L_0x0295
            goto L_0x02a3
        L_0x0295:
            int r5 = r25.position()
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            r5 = r5 & 48
            int r8 = r5 >> 4
        L_0x02a3:
            int[] r5 = defpackage.z3d.a
            r5 = r5[r8]
            int r5 = r5 * 256
            goto L_0x0216
        L_0x02ab:
            r5 = 1536(0x600, float:2.152E-42)
            goto L_0x0216
        L_0x02af:
            int r7 = r1.getInt(r5)
            r8 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r7 == r8) goto L_0x0388
            int r7 = r1.getInt(r5)
            r8 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r7 != r8) goto L_0x02c3
            goto L_0x0388
        L_0x02c3:
            int r7 = r1.getInt(r5)
            r5 = 622876772(0x25205864, float:1.3907736E-16)
            if (r7 != r5) goto L_0x02d0
            r14 = 4096(0x1000, float:5.74E-42)
            goto L_0x0388
        L_0x02d0:
            int r5 = r25.position()
            byte r7 = r1.get(r5)
            if (r7 == r13) goto L_0x0317
            if (r7 == r15) goto L_0x0306
            r8 = 31
            if (r7 == r8) goto L_0x02f3
            int r7 = r5 + 4
            byte r7 = r1.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + r12
            byte r5 = r1.get(r5)
        L_0x02ee:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x02f0:
            int r5 = r5 >> r10
            r5 = r5 | r7
            goto L_0x0327
        L_0x02f3:
            int r7 = r5 + 5
            byte r7 = r1.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 6
            byte r5 = r1.get(r5)
        L_0x0303:
            r5 = r5 & 60
            goto L_0x02f0
        L_0x0306:
            int r7 = r5 + 4
            byte r7 = r1.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 7
            byte r5 = r1.get(r5)
            goto L_0x0303
        L_0x0317:
            int r7 = r5 + 5
            byte r7 = r1.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            goto L_0x02ee
        L_0x0327:
            int r5 = r5 + r6
            int r14 = r5 * 32
            goto L_0x0388
        L_0x032b:
            byte r5 = r1.get(r12)
            r5 = r5 & r10
            if (r5 != 0) goto L_0x0334
            r5 = 0
            goto L_0x0360
        L_0x0334:
            r5 = 26
            byte r5 = r1.get(r5)
            r7 = 28
            r10 = r7
            r8 = 0
        L_0x033e:
            if (r8 >= r5) goto L_0x034a
            int r11 = r8 + 27
            byte r11 = r1.get(r11)
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L_0x033e
        L_0x034a:
            int r5 = r10 + 26
            byte r5 = r1.get(r5)
            r8 = 0
        L_0x0351:
            if (r8 >= r5) goto L_0x035e
            int r11 = r10 + 27
            int r11 = r11 + r8
            byte r11 = r1.get(r11)
            int r7 = r7 + r11
            int r8 = r8 + 1
            goto L_0x0351
        L_0x035e:
            int r5 = r10 + r7
        L_0x0360:
            int r7 = r5 + 26
            byte r7 = r1.get(r7)
            int r7 = r7 + 27
            int r7 = r7 + r5
            byte r5 = r1.get(r7)
            int r8 = r25.limit()
            int r8 = r8 - r7
            if (r8 <= r6) goto L_0x037a
            int r7 = r7 + r6
            byte r7 = r1.get(r7)
            goto L_0x037b
        L_0x037a:
            r7 = 0
        L_0x037b:
            long r7 = defpackage.ete.D(r5, r7)
            r10 = 48000(0xbb80, double:2.3715E-319)
            long r7 = r7 * r10
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r10
            int r14 = (int) r7
        L_0x0388:
            r0.L = r14
            if (r14 != 0) goto L_0x038d
            return r6
        L_0x038d:
            u44 r5 = r0.B
            if (r5 == 0) goto L_0x039f
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x0399
            r5 = 0
            return r5
        L_0x0399:
            r0.a(r2)
            r5 = 0
            r0.B = r5
        L_0x039f:
            long r7 = r0.O
            s44 r5 = r0.u
            long r10 = r24.g()
            dse r12 = r0.e
            long r12 = r12.o
            long r10 = r10 - r12
            xu5 r5 = r5.a
            int r5 = r5.C
            long r10 = defpackage.oze.Y(r5, r10)
            long r10 = r10 + r7
            boolean r5 = r0.M
            if (r5 != 0) goto L_0x03e3
            long r7 = r10 - r2
            long r7 = java.lang.Math.abs(r7)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x03e3
            lhd r5 = r0.s
            if (r5 == 0) goto L_0x03e1
            androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException r7 = new androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
            java.lang.String r8 = "Unexpected audio track timestamp discontinuity: expected "
            java.lang.String r12 = ", got "
            java.lang.StringBuilder r8 = defpackage.hr1.k(r10, r8, r12)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r5.u(r7)
        L_0x03e1:
            r0.M = r6
        L_0x03e3:
            boolean r5 = r0.M
            if (r5 == 0) goto L_0x040c
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x03ef
            r5 = 0
            return r5
        L_0x03ef:
            r5 = 0
            long r7 = r2 - r10
            long r10 = r0.O
            long r10 = r10 + r7
            r0.O = r10
            r0.M = r5
            r0.a(r2)
            lhd r5 = r0.s
            if (r5 == 0) goto L_0x040c
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x040c
            java.lang.Object r5 = r5.b
            m28 r5 = (defpackage.m28) r5
            r5.d2 = r6
        L_0x040c:
            s44 r5 = r0.u
            int r5 = r5.c
            if (r5 != 0) goto L_0x041d
            long r7 = r0.H
            int r5 = r25.remaining()
            long r10 = (long) r5
            long r7 = r7 + r10
            r0.H = r7
            goto L_0x0427
        L_0x041d:
            long r7 = r0.I
            int r5 = r0.L
            long r10 = (long) r5
            long r12 = (long) r4
            long r10 = r10 * r12
            long r10 = r10 + r7
            r0.I = r10
        L_0x0427:
            r0.Q = r1
            r0.R = r4
        L_0x042b:
            r0.q(r2)
            java.nio.ByteBuffer r1 = r0.Q
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L_0x043d
            r1 = 0
            r0.Q = r1
            r1 = 0
            r0.R = r1
            return r6
        L_0x043d:
            long r1 = r24.h()
            long r3 = r9.z
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x046d
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x046d
            z7e r1 = r9.J
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r9.z
            long r1 = r1 - r3
            r3 = 200(0xc8, double:9.9E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x046d
            java.lang.String r1 = "Resetting stalled audio track"
            defpackage.ez3.j0(r1)
            r24.d()
            return r6
        L_0x046d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.i(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean j() {
        return l() && (oze.a < 29 || !this.w.isOffloadedPlayback() || !this.X) && this.i.c(h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k() {
        /*
            r20 = this;
            r1 = r20
            ga3 r0 = r1.h
            boolean r0 = r0.e()
            r2 = 0
            if (r0 != 0) goto L_0x000c
            return r2
        L_0x000c:
            r3 = 1
            s44 r0 = r1.u     // Catch:{ AudioSink$InitializationException -> 0x0026 }
            r0.getClass()     // Catch:{ AudioSink$InitializationException -> 0x0026 }
            k20 r4 = r1.A     // Catch:{ AudioSink$InitializationException -> 0x001b }
            int r5 = r1.a0     // Catch:{ AudioSink$InitializationException -> 0x001b }
            android.media.AudioTrack r0 = r0.a(r4, r5)     // Catch:{ AudioSink$InitializationException -> 0x001b }
            goto L_0x0066
        L_0x001b:
            r0 = move-exception
            lhd r4 = r1.s     // Catch:{ AudioSink$InitializationException -> 0x0026 }
            if (r4 == 0) goto L_0x0023
            r4.u(r0)     // Catch:{ AudioSink$InitializationException -> 0x0026 }
        L_0x0023:
            throw r0     // Catch:{ AudioSink$InitializationException -> 0x0026 }
        L_0x0024:
            r4 = r0
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x0024
        L_0x0028:
            s44 r0 = r1.u
            int r5 = r0.h
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r5 <= r6) goto L_0x019d
            s44 r5 = new s44
            boolean r6 = r0.j
            boolean r15 = r0.k
            xu5 r8 = r0.a
            int r9 = r0.b
            int r10 = r0.c
            int r11 = r0.d
            int r12 = r0.e
            int r13 = r0.f
            int r14 = r0.g
            r16 = 1000000(0xf4240, float:1.401298E-39)
            f50 r7 = r0.i
            boolean r0 = r0.l
            r17 = r7
            r7 = r5
            r18 = r15
            r15 = r16
            r16 = r17
            r17 = r6
            r19 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            k20 r0 = r1.A     // Catch:{ AudioSink$InitializationException -> 0x0191 }
            int r6 = r1.a0     // Catch:{ AudioSink$InitializationException -> 0x0191 }
            android.media.AudioTrack r0 = r5.a(r0, r6)     // Catch:{ AudioSink$InitializationException -> 0x0191 }
            r1.u = r5     // Catch:{ AudioSink$InitializationException -> 0x018f }
        L_0x0066:
            r1.w = r0
            boolean r0 = m(r0)
            if (r0 == 0) goto L_0x0091
            android.media.AudioTrack r0 = r1.w
            a54 r4 = r1.m
            if (r4 != 0) goto L_0x007b
            a54 r4 = new a54
            r4.<init>(r1)
            r1.m = r4
        L_0x007b:
            a54 r4 = r1.m
            r4.a(r0)
            s44 r0 = r1.u
            boolean r4 = r0.k
            if (r4 == 0) goto L_0x0091
            android.media.AudioTrack r4 = r1.w
            xu5 r0 = r0.a
            int r5 = r0.E
            int r0 = r0.F
            r4.setOffloadDelayPadding(r5, r0)
        L_0x0091:
            int r0 = defpackage.oze.a
            r4 = 31
            if (r0 < r4) goto L_0x00a0
            cza r4 = r1.r
            if (r4 == 0) goto L_0x00a0
            android.media.AudioTrack r5 = r1.w
            defpackage.o44.a(r5, r4)
        L_0x00a0:
            android.media.AudioTrack r4 = r1.w
            int r4 = r4.getAudioSessionId()
            r1.a0 = r4
            android.media.AudioTrack r4 = r1.w
            s44 r5 = r1.u
            int r6 = r5.c
            r7 = 2
            if (r6 != r7) goto L_0x00b3
            r6 = r3
            goto L_0x00b4
        L_0x00b3:
            r6 = r2
        L_0x00b4:
            n60 r7 = r1.i
            r7.c = r4
            int r8 = r5.d
            r7.d = r8
            int r9 = r5.h
            r7.e = r9
            l60 r10 = new l60
            r11 = 1
            r10.<init>(r4, r11)
            r7.f = r10
            int r4 = r4.getSampleRate()
            r7.g = r4
            int r4 = r5.g
            r5 = 23
            if (r6 == 0) goto L_0x00de
            if (r0 >= r5) goto L_0x00de
            r6 = 5
            if (r4 == r6) goto L_0x00dc
            r6 = 6
            if (r4 != r6) goto L_0x00de
        L_0x00dc:
            r6 = r3
            goto L_0x00df
        L_0x00de:
            r6 = r2
        L_0x00df:
            r7.h = r6
            boolean r4 = defpackage.oze.L(r4)
            r7.q = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x00f7
            int r9 = r9 / r8
            long r8 = (long) r9
            int r4 = r7.g
            long r8 = defpackage.oze.Y(r4, r8)
            goto L_0x00f8
        L_0x00f7:
            r8 = r10
        L_0x00f8:
            r7.i = r8
            r8 = 0
            r7.t = r8
            r7.u = r8
            r7.H = r2
            r7.I = r8
            r7.v = r8
            r7.p = r2
            r7.y = r10
            r7.z = r10
            r7.r = r8
            r7.o = r8
            r4 = 1065353216(0x3f800000, float:1.0)
            r7.j = r4
            boolean r4 = r20.l()
            if (r4 != 0) goto L_0x011b
            goto L_0x012e
        L_0x011b:
            r4 = 21
            if (r0 < r4) goto L_0x0127
            android.media.AudioTrack r4 = r1.w
            float r6 = r1.P
            r4.setVolume(r6)
            goto L_0x012e
        L_0x0127:
            android.media.AudioTrack r4 = r1.w
            float r6 = r1.P
            r4.setStereoVolume(r6, r6)
        L_0x012e:
            qb0 r4 = r1.b0
            r4.getClass()
            i30 r4 = r1.c0
            if (r4 == 0) goto L_0x0149
            if (r0 < r5) goto L_0x0149
            android.media.AudioTrack r5 = r1.w
            defpackage.m44.a(r5, r4)
            a30 r4 = r1.y
            if (r4 == 0) goto L_0x0149
            i30 r5 = r1.c0
            android.media.AudioDeviceInfo r5 = r5.a
            r4.h(r5)
        L_0x0149:
            r4 = 24
            if (r0 < r4) goto L_0x015a
            a30 r0 = r1.y
            if (r0 == 0) goto L_0x015a
            w44 r4 = new w44
            android.media.AudioTrack r5 = r1.w
            r4.<init>(r5, r0)
            r1.z = r4
        L_0x015a:
            r1.N = r3
            lhd r0 = r1.s
            if (r0 == 0) goto L_0x018e
            s44 r1 = r1.u
            z50 r11 = new z50
            int r4 = r1.c
            if (r4 != r3) goto L_0x016a
            r10 = r3
            goto L_0x016b
        L_0x016a:
            r10 = r2
        L_0x016b:
            int r7 = r1.f
            boolean r9 = r1.l
            int r5 = r1.g
            int r6 = r1.e
            int r8 = r1.h
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.b
            m28 r0 = (defpackage.m28) r0
            qe4 r0 = r0.V1
            java.lang.Object r1 = r0.b
            android.os.Handler r1 = (android.os.Handler) r1
            if (r1 == 0) goto L_0x018e
            r50 r2 = new r50
            r4 = 1
            r2.<init>(r0, r11, r4)
            r1.post(r2)
        L_0x018e:
            return r3
        L_0x018f:
            r0 = move-exception
            goto L_0x019a
        L_0x0191:
            r0 = move-exception
            lhd r2 = r1.s     // Catch:{ AudioSink$InitializationException -> 0x018f }
            if (r2 == 0) goto L_0x0199
            r2.u(r0)     // Catch:{ AudioSink$InitializationException -> 0x018f }
        L_0x0199:
            throw r0     // Catch:{ AudioSink$InitializationException -> 0x018f }
        L_0x019a:
            r4.addSuppressed(r0)
        L_0x019d:
            s44 r0 = r1.u
            int r0 = r0.c
            if (r0 != r3) goto L_0x01a5
            r1.g0 = r3
        L_0x01a5:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.k():boolean");
    }

    public final boolean l() {
        return this.w != null;
    }

    public final void n() {
        Context context;
        w20 w20;
        y20 y20;
        if (this.y == null && (context = this.a) != null) {
            this.i0 = Looper.myLooper();
            a30 a30 = new a30(context, new r34(1, (Object) this), this.A, this.c0);
            this.y = a30;
            if (a30.a) {
                w20 = (w20) a30.w0;
                w20.getClass();
            } else {
                a30.a = true;
                z20 z20 = (z20) a30.Z;
                if (z20 != null) {
                    z20.a.registerContentObserver(z20.b, false, z20);
                }
                int i2 = oze.a;
                Handler handler = (Handler) a30.o;
                Context context2 = (Context) a30.b;
                if (i2 >= 23 && (y20 = (y20) a30.X) != null) {
                    x20.a(context2, y20, handler);
                }
                an anVar = (an) a30.Y;
                Intent intent = null;
                if (anVar != null) {
                    intent = context2.registerReceiver(anVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, handler);
                }
                w20 = w20.c(context2, intent, (k20) a30.y0, (i30) a30.x0);
                a30.w0 = w20;
            }
            this.x = w20;
        }
    }

    public final void o() {
        this.Y = true;
        if (l()) {
            n60 n60 = this.i;
            if (n60.y != -9223372036854775807L) {
                n60.J.getClass();
                n60.y = oze.S(SystemClock.elapsedRealtime());
            }
            l60 l60 = n60.f;
            l60.getClass();
            l60.a();
            this.w.play();
        }
    }

    public final void p() {
        if (!this.W) {
            this.W = true;
            long h2 = h();
            n60 n60 = this.i;
            n60.A = n60.b();
            n60.J.getClass();
            n60.y = oze.S(SystemClock.elapsedRealtime());
            n60.B = h2;
            if (m(this.w)) {
                this.X = false;
            }
            this.w.stop();
            this.G = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = r2.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.hasRemaining() != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r2.v.i(r2.Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(long r3) {
        /*
            r2 = this;
            f50 r0 = r2.v
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0013
            java.nio.ByteBuffer r0 = r2.Q
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.nio.ByteBuffer r0 = defpackage.k50.a
        L_0x000f:
            r2.u(r3, r0)
            return
        L_0x0013:
            f50 r0 = r2.v
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0044
        L_0x001b:
            f50 r0 = r2.v
            java.nio.ByteBuffer r0 = r0.d()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x0031
            r2.u(r3, r0)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x001b
            return
        L_0x0031:
            java.nio.ByteBuffer r0 = r2.Q
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            f50 r0 = r2.v
            java.nio.ByteBuffer r1 = r2.Q
            r0.i(r1)
            goto L_0x0013
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.q(long):void");
    }

    public final void r() {
        d();
        po5 l2 = this.f.listIterator(0);
        while (l2.hasNext()) {
            ((k50) l2.next()).reset();
        }
        po5 l3 = this.g.listIterator(0);
        while (l3.hasNext()) {
            ((k50) l3.next()).reset();
        }
        f50 f50 = this.v;
        if (f50 != null) {
            f50.j();
        }
        this.Y = false;
        this.g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                ez3.k0("Failed to set playback params", e2);
            }
            wxa wxa = new wxa(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = wxa;
            float f2 = wxa.a;
            n60 n60 = this.i;
            n60.j = f2;
            l60 l60 = n60.f;
            if (l60 != null) {
                l60.a();
            }
            n60.d();
        }
    }

    public final boolean t() {
        s44 s44 = this.u;
        return s44 != null && s44.j && oze.a >= 23;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        if (r14 < r13) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(long r13, java.nio.ByteBuffer r15) {
        /*
            r12 = this;
            boolean r0 = r15.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.S
            r1 = 1
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r15) goto L_0x0013
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            defpackage.oyb.d(r0)
            goto L_0x003b
        L_0x0018:
            r12.S = r15
            int r0 = defpackage.oze.a
            if (r0 >= r2) goto L_0x003b
            int r0 = r15.remaining()
            byte[] r4 = r12.T
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.T = r4
        L_0x002d:
            int r4 = r15.position()
            byte[] r5 = r12.T
            r15.get(r5, r3, r0)
            r15.position(r4)
            r12.U = r3
        L_0x003b:
            int r0 = r15.remaining()
            int r4 = defpackage.oze.a
            if (r4 >= r2) goto L_0x0078
            long r13 = r12.J
            n60 r2 = r12.i
            long r5 = r2.b()
            int r7 = r2.d
            long r7 = (long) r7
            long r5 = r5 * r7
            long r13 = r13 - r5
            int r13 = (int) r13
            int r14 = r2.e
            int r14 = r14 - r13
            if (r14 <= 0) goto L_0x0075
            int r13 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r14 = r12.w
            byte[] r2 = r12.T
            int r5 = r12.U
            int r13 = r14.write(r2, r5, r13)
            if (r13 <= 0) goto L_0x0106
            int r14 = r12.U
            int r14 = r14 + r13
            r12.U = r14
            int r14 = r15.position()
            int r14 = r14 + r13
            r15.position(r14)
            goto L_0x0106
        L_0x0075:
            r13 = r3
            goto L_0x0106
        L_0x0078:
            boolean r2 = r12.d0
            if (r2 == 0) goto L_0x0100
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r2 = r1
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            defpackage.oyb.k(r2)
            r5 = -9223372036854775808
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            long r13 = r12.e0
            goto L_0x0096
        L_0x0094:
            r12.e0 = r13
        L_0x0096:
            android.media.AudioTrack r6 = r12.w
            r2 = 26
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r4 < r2) goto L_0x00a8
            r9 = 1
            long r10 = r13 * r7
            r7 = r15
            r8 = r0
            int r13 = r6.write(r7, r8, r9, r10)
            goto L_0x0106
        L_0x00a8:
            java.nio.ByteBuffer r2 = r12.F
            if (r2 != 0) goto L_0x00c1
            r2 = 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r12.F = r2
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r2.order(r5)
            java.nio.ByteBuffer r2 = r12.F
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r2.putInt(r5)
        L_0x00c1:
            int r2 = r12.G
            if (r2 != 0) goto L_0x00da
            java.nio.ByteBuffer r2 = r12.F
            r5 = 4
            r2.putInt(r5, r0)
            java.nio.ByteBuffer r2 = r12.F
            r5 = 8
            long r13 = r13 * r7
            r2.putLong(r5, r13)
            java.nio.ByteBuffer r13 = r12.F
            r13.position(r3)
            r12.G = r0
        L_0x00da:
            java.nio.ByteBuffer r13 = r12.F
            int r13 = r13.remaining()
            if (r13 <= 0) goto L_0x00f1
            java.nio.ByteBuffer r14 = r12.F
            int r14 = r6.write(r14, r13, r1)
            if (r14 >= 0) goto L_0x00ee
            r12.G = r3
            r13 = r14
            goto L_0x0106
        L_0x00ee:
            if (r14 >= r13) goto L_0x00f1
            goto L_0x0075
        L_0x00f1:
            int r13 = r6.write(r15, r0, r1)
            if (r13 >= 0) goto L_0x00fa
            r12.G = r3
            goto L_0x0106
        L_0x00fa:
            int r14 = r12.G
            int r14 = r14 - r13
            r12.G = r14
            goto L_0x0106
        L_0x0100:
            android.media.AudioTrack r13 = r12.w
            int r13 = r13.write(r15, r0, r1)
        L_0x0106:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r12.f0 = r5
            x44 r14 = r12.o
            r5 = 0
            if (r13 >= 0) goto L_0x0155
            r15 = 24
            if (r4 < r15) goto L_0x0119
            r15 = -6
            if (r13 == r15) goto L_0x011d
        L_0x0119:
            r15 = -32
            if (r13 != r15) goto L_0x0137
        L_0x011d:
            long r7 = r12.h()
            int r15 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x0126
            goto L_0x0138
        L_0x0126:
            android.media.AudioTrack r15 = r12.w
            boolean r15 = m(r15)
            if (r15 == 0) goto L_0x0137
            s44 r15 = r12.u
            int r15 = r15.c
            if (r15 != r1) goto L_0x0138
            r12.g0 = r1
            goto L_0x0138
        L_0x0137:
            r1 = r3
        L_0x0138:
            androidx.media3.exoplayer.audio.AudioSink$WriteException r15 = new androidx.media3.exoplayer.audio.AudioSink$WriteException
            s44 r0 = r12.u
            xu5 r0 = r0.a
            r15.<init>(r13, r0, r1)
            lhd r13 = r12.s
            if (r13 == 0) goto L_0x0148
            r13.u(r15)
        L_0x0148:
            boolean r13 = r15.b
            if (r13 != 0) goto L_0x0150
            r14.a(r15)
            return
        L_0x0150:
            w20 r13 = defpackage.w20.c
            r12.x = r13
            throw r15
        L_0x0155:
            r2 = 0
            r14.b = r2
            android.media.AudioTrack r14 = r12.w
            boolean r14 = m(r14)
            if (r14 == 0) goto L_0x0182
            long r7 = r12.K
            int r14 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0168
            r12.h0 = r3
        L_0x0168:
            boolean r14 = r12.Y
            if (r14 == 0) goto L_0x0182
            lhd r14 = r12.s
            if (r14 == 0) goto L_0x0182
            if (r13 >= r0) goto L_0x0182
            boolean r4 = r12.h0
            if (r4 != 0) goto L_0x0182
            java.lang.Object r14 = r14.b
            m28 r14 = (defpackage.m28) r14
            p45 r14 = r14.V0
            if (r14 == 0) goto L_0x0182
            z45 r14 = r14.a
            r14.Y0 = r1
        L_0x0182:
            s44 r14 = r12.u
            int r14 = r14.c
            if (r14 != 0) goto L_0x018e
            long r4 = r12.J
            long r6 = (long) r13
            long r4 = r4 + r6
            r12.J = r4
        L_0x018e:
            if (r13 != r0) goto L_0x01a9
            if (r14 == 0) goto L_0x01a7
            java.nio.ByteBuffer r13 = r12.Q
            if (r15 != r13) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r1 = r3
        L_0x0198:
            defpackage.oyb.k(r1)
            long r13 = r12.K
            int r15 = r12.L
            long r0 = (long) r15
            int r15 = r12.R
            long r3 = (long) r15
            long r0 = r0 * r3
            long r0 = r0 + r13
            r12.K = r0
        L_0x01a7:
            r12.S = r2
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.u(long, java.nio.ByteBuffer):void");
    }
}
