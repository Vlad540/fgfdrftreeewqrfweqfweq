package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: n45  reason: default package */
public final class n45 extends u2 {
    public final z45 A0;
    public final qh7 B0;
    public final CopyOnWriteArraySet C0;
    public final qje D0;
    public final ArrayList E0;
    public final boolean F0;
    public final qe8 G0;
    public final g44 H0;
    public final Looper I0;
    public final cf0 J0;
    public final long K0;
    public final long L0;
    public final long M0;
    public final z7e N0;
    public final h45 O0;
    public final j45 P0;
    public final ud Q0;
    public final p30 R0;
    public final m54 S0;
    public final ga3 T0;
    public final long U0;
    public int V0;
    public boolean W0;
    public final ga3 X;
    public int X0;
    public final Context Y;
    public int Y0;
    public final kya Z;
    public boolean Z0;
    public yed a1;
    public eya b1;
    public final ope c;
    public z78 c1;
    public z78 d1;
    public AudioTrack e1;
    public Object f1;
    public Surface g1;
    public final int h1;
    public gjd i1;
    public final int j1;
    public k20 k1;
    public float l1;
    public boolean m1;
    public vw3 n1;
    public final eya o;
    public final boolean o1;
    public boolean p1;
    public final int q1;
    public boolean r1;
    public final uf4 s1;
    public r8f t1;
    public z78 u1;
    public uxa v1;
    public final qi0[] w0;
    public int w1;
    public final eu7 x0;
    public long x1;
    public final h8e y0;
    public final b45 z0;

    static {
        g78.a("media3.exoplayer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: u2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: n45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: n45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: n45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: n45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: n45} */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, j45] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object, m54] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n45(defpackage.q35 r35) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            r7 = 1
            r8 = 0
            java.lang.String r9 = " [AndroidXMedia3/1.4.1] ["
            java.lang.String r10 = "Init "
            r11 = 3
            r1.<init>(r11)
            ga3 r12 = new ga3
            r12.<init>((boolean) r8, (int) r7)
            r1.X = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r12.<init>(r10)     // Catch:{ all -> 0x01c3 }
            int r10 = java.lang.System.identityHashCode(r34)     // Catch:{ all -> 0x01c3 }
            java.lang.String r10 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x01c3 }
            r12.append(r10)     // Catch:{ all -> 0x01c3 }
            r12.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = defpackage.oze.e     // Catch:{ all -> 0x01c3 }
            r12.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = "]"
            r12.append(r9)     // Catch:{ all -> 0x01c3 }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x01c3 }
            defpackage.ez3.M(r9)     // Catch:{ all -> 0x01c3 }
            android.content.Context r9 = r0.a     // Catch:{ all -> 0x01c3 }
            android.content.Context r10 = r9.getApplicationContext()     // Catch:{ all -> 0x01c3 }
            r1.Y = r10     // Catch:{ all -> 0x01c3 }
            e26 r12 = r0.h     // Catch:{ all -> 0x01c3 }
            z7e r13 = r0.b     // Catch:{ all -> 0x01c3 }
            java.lang.Object r12 = r12.apply(r13)     // Catch:{ all -> 0x01c3 }
            g44 r12 = (defpackage.g44) r12     // Catch:{ all -> 0x01c3 }
            r1.H0 = r12     // Catch:{ all -> 0x01c3 }
            int r13 = r0.j     // Catch:{ all -> 0x01c3 }
            r1.q1 = r13     // Catch:{ all -> 0x01c3 }
            k20 r13 = r0.k     // Catch:{ all -> 0x01c3 }
            r1.k1 = r13     // Catch:{ all -> 0x01c3 }
            int r13 = r0.l     // Catch:{ all -> 0x01c3 }
            r1.h1 = r13     // Catch:{ all -> 0x01c3 }
            r1.m1 = r8     // Catch:{ all -> 0x01c3 }
            long r13 = r0.t     // Catch:{ all -> 0x01c3 }
            r1.U0 = r13     // Catch:{ all -> 0x01c3 }
            h45 r13 = new h45     // Catch:{ all -> 0x01c3 }
            r13.<init>(r1)     // Catch:{ all -> 0x01c3 }
            r1.O0 = r13     // Catch:{ all -> 0x01c3 }
            j45 r14 = new j45     // Catch:{ all -> 0x01c3 }
            r14.<init>()     // Catch:{ all -> 0x01c3 }
            r1.P0 = r14     // Catch:{ all -> 0x01c3 }
            android.os.Handler r14 = new android.os.Handler     // Catch:{ all -> 0x01c3 }
            android.os.Looper r15 = r0.i     // Catch:{ all -> 0x01c3 }
            r14.<init>(r15)     // Catch:{ all -> 0x01c3 }
            p3e r15 = r0.c     // Catch:{ all -> 0x01c3 }
            java.lang.Object r15 = r15.get()     // Catch:{ all -> 0x01c3 }
            k9c r15 = (defpackage.k9c) r15     // Catch:{ all -> 0x01c3 }
            r16 = r14
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            qi0[] r15 = r15.a(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01c3 }
            r1.w0 = r15     // Catch:{ all -> 0x01c3 }
            int r13 = r15.length     // Catch:{ all -> 0x01c3 }
            if (r13 <= 0) goto L_0x0091
            r13 = r7
            goto L_0x0092
        L_0x0091:
            r13 = r8
        L_0x0092:
            defpackage.oyb.k(r13)     // Catch:{ all -> 0x01c3 }
            p3e r13 = r0.e     // Catch:{ all -> 0x01c3 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x01c3 }
            eu7 r13 = (defpackage.eu7) r13     // Catch:{ all -> 0x01c3 }
            r1.x0 = r13     // Catch:{ all -> 0x01c3 }
            p3e r5 = r0.d     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01c3 }
            qe8 r5 = (defpackage.qe8) r5     // Catch:{ all -> 0x01c3 }
            r1.G0 = r5     // Catch:{ all -> 0x01c3 }
            p3e r5 = r0.g     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01c3 }
            cf0 r5 = (defpackage.cf0) r5     // Catch:{ all -> 0x01c3 }
            r1.J0 = r5     // Catch:{ all -> 0x01c3 }
            boolean r6 = r0.m     // Catch:{ all -> 0x01c3 }
            r1.F0 = r6     // Catch:{ all -> 0x01c3 }
            xtc r6 = r0.n     // Catch:{ all -> 0x01c3 }
            r30 = r5
            long r4 = r0.o     // Catch:{ all -> 0x01c3 }
            r1.K0 = r4     // Catch:{ all -> 0x01c3 }
            long r4 = r0.p     // Catch:{ all -> 0x01c3 }
            r1.L0 = r4     // Catch:{ all -> 0x01c3 }
            long r4 = r0.q     // Catch:{ all -> 0x01c3 }
            r1.M0 = r4     // Catch:{ all -> 0x01c3 }
            android.os.Looper r4 = r0.i     // Catch:{ all -> 0x01c3 }
            r1.I0 = r4     // Catch:{ all -> 0x01c3 }
            z7e r5 = r0.b     // Catch:{ all -> 0x01c3 }
            r1.N0 = r5     // Catch:{ all -> 0x01c3 }
            r1.Z = r1     // Catch:{ all -> 0x01c3 }
            qh7 r2 = new qh7     // Catch:{ all -> 0x01c3 }
            b45 r11 = new b45     // Catch:{ all -> 0x01c3 }
            r11.<init>(r1, r8)     // Catch:{ all -> 0x01c3 }
            r2.<init>(r4, r5, r11)     // Catch:{ all -> 0x01c3 }
            r1.B0 = r2     // Catch:{ all -> 0x01c3 }
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x01c3 }
            r2.<init>()     // Catch:{ all -> 0x01c3 }
            r1.C0 = r2     // Catch:{ all -> 0x01c3 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x01c3 }
            r11.<init>()     // Catch:{ all -> 0x01c3 }
            r1.E0 = r11     // Catch:{ all -> 0x01c3 }
            yed r11 = new yed     // Catch:{ all -> 0x01c3 }
            r11.<init>()     // Catch:{ all -> 0x01c3 }
            r1.a1 = r11     // Catch:{ all -> 0x01c3 }
            ope r11 = new ope     // Catch:{ all -> 0x01c3 }
            int r7 = r15.length     // Catch:{ all -> 0x01c3 }
            j9c[] r7 = new defpackage.j9c[r7]     // Catch:{ all -> 0x01c3 }
            int r8 = r15.length     // Catch:{ all -> 0x01c3 }
            g55[] r8 = new defpackage.g55[r8]     // Catch:{ all -> 0x01c3 }
            spe r3 = defpackage.spe.b     // Catch:{ all -> 0x01c3 }
            r31 = r9
            r9 = 0
            r11.<init>((defpackage.j9c[]) r7, (defpackage.g55[]) r8, (defpackage.spe) r3, (defpackage.cu7) r9)     // Catch:{ all -> 0x01c3 }
            r1.c = r11     // Catch:{ all -> 0x01c3 }
            qje r3 = new qje     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r1.D0 = r3     // Catch:{ all -> 0x01c3 }
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r7 = 20
            int[] r7 = new int[r7]     // Catch:{ all -> 0x01c3 }
            r7 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32} // fill-array     // Catch:{ all -> 0x01c3 }
            int r8 = r7.length     // Catch:{ all -> 0x01c3 }
            r9 = 0
        L_0x0119:
            if (r9 >= r8) goto L_0x0132
            r17 = r8
            r8 = r7[r9]     // Catch:{ all -> 0x01c3 }
            r19 = r7
            r7 = 1
            r18 = 0
            r20 = r18 ^ 1
            defpackage.oyb.k(r20)     // Catch:{ all -> 0x01c3 }
            r3.append(r8, r7)     // Catch:{ all -> 0x01c3 }
            int r9 = r9 + r7
            r8 = r17
            r7 = r19
            goto L_0x0119
        L_0x0132:
            r13.getClass()     // Catch:{ all -> 0x01c3 }
            r7 = 0
            r8 = 1
            r9 = r7 ^ 1
            defpackage.oyb.k(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 29
            r3.append(r9, r8)     // Catch:{ all -> 0x01c3 }
            eya r9 = new eya     // Catch:{ all -> 0x01c3 }
            r17 = r7 ^ 1
            defpackage.oyb.k(r17)     // Catch:{ all -> 0x01c3 }
            wi5 r7 = new wi5     // Catch:{ all -> 0x01c3 }
            r7.<init>(r3)     // Catch:{ all -> 0x01c3 }
            r9.<init>(r7)     // Catch:{ all -> 0x01c3 }
            r1.o = r9     // Catch:{ all -> 0x01c3 }
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r8 = 0
        L_0x0158:
            android.util.SparseBooleanArray r9 = r7.a     // Catch:{ all -> 0x01c3 }
            int r9 = r9.size()     // Catch:{ all -> 0x01c3 }
            if (r8 >= r9) goto L_0x0175
            int r9 = r7.b(r8)     // Catch:{ all -> 0x01c3 }
            r18 = r7
            r7 = 1
            r17 = 0
            r19 = r17 ^ 1
            defpackage.oyb.k(r19)     // Catch:{ all -> 0x01c3 }
            r3.append(r9, r7)     // Catch:{ all -> 0x01c3 }
            int r8 = r8 + r7
            r7 = r18
            goto L_0x0158
        L_0x0175:
            r7 = 1
            r8 = 0
            r9 = r8 ^ 1
            defpackage.oyb.k(r9)     // Catch:{ all -> 0x01c3 }
            r9 = 4
            r3.append(r9, r7)     // Catch:{ all -> 0x01c3 }
            r17 = r8 ^ 1
            defpackage.oyb.k(r17)     // Catch:{ all -> 0x01c3 }
            r9 = 10
            r3.append(r9, r7)     // Catch:{ all -> 0x01c3 }
            eya r9 = new eya     // Catch:{ all -> 0x01c3 }
            r17 = r8 ^ 1
            defpackage.oyb.k(r17)     // Catch:{ all -> 0x01c3 }
            wi5 r7 = new wi5     // Catch:{ all -> 0x01c3 }
            r7.<init>(r3)     // Catch:{ all -> 0x01c3 }
            r9.<init>(r7)     // Catch:{ all -> 0x01c3 }
            r1.b1 = r9     // Catch:{ all -> 0x01c3 }
            r3 = 0
            h8e r7 = r5.a(r4, r3)     // Catch:{ all -> 0x01c3 }
            r1.y0 = r7     // Catch:{ all -> 0x01c3 }
            b45 r3 = new b45     // Catch:{ all -> 0x01c3 }
            r7 = 3
            r3.<init>(r1, r7)     // Catch:{ all -> 0x01c3 }
            r1.z0 = r3     // Catch:{ all -> 0x01c3 }
            uxa r7 = defpackage.uxa.i(r11)     // Catch:{ all -> 0x01c3 }
            r1.v1 = r7     // Catch:{ all -> 0x01c3 }
            r12.K(r1, r4)     // Catch:{ all -> 0x01c3 }
            int r7 = defpackage.oze.a     // Catch:{ all -> 0x01c3 }
            java.lang.String r8 = r0.w
            r9 = 31
            if (r7 >= r9) goto L_0x01c6
            cza r9 = new cza     // Catch:{ all -> 0x01c3 }
            r9.<init>(r8)     // Catch:{ all -> 0x01c3 }
            r29 = r9
            goto L_0x01ce
        L_0x01c3:
            r0 = move-exception
            goto L_0x0360
        L_0x01c6:
            boolean r9 = r0.u     // Catch:{ all -> 0x01c3 }
            cza r8 = defpackage.f45.a(r10, r1, r9, r8)     // Catch:{ all -> 0x01c3 }
            r29 = r8
        L_0x01ce:
            z45 r8 = new z45     // Catch:{ all -> 0x01c3 }
            p3e r9 = r0.f     // Catch:{ all -> 0x01c3 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x01c3 }
            r17 = r9
            pi7 r17 = (defpackage.pi7) r17     // Catch:{ all -> 0x01c3 }
            int r9 = r1.V0     // Catch:{ all -> 0x01c3 }
            boolean r10 = r1.W0     // Catch:{ all -> 0x01c3 }
            r32 = r2
            a94 r2 = r0.r     // Catch:{ all -> 0x01c3 }
            long r0 = r0.s     // Catch:{ all -> 0x035d }
            r16 = r13
            r13 = r8
            r33 = r14
            r14 = r15
            r15 = r16
            r16 = r11
            r18 = r30
            r19 = r9
            r20 = r10
            r21 = r12
            r22 = r6
            r23 = r2
            r24 = r0
            r26 = r4
            r27 = r5
            r28 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)     // Catch:{ all -> 0x035d }
            r1 = r34
            r1.A0 = r8     // Catch:{ all -> 0x01c3 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.l1 = r0     // Catch:{ all -> 0x01c3 }
            r0 = 0
            r1.V0 = r0     // Catch:{ all -> 0x01c3 }
            z78 r0 = defpackage.z78.J     // Catch:{ all -> 0x01c3 }
            r1.c1 = r0     // Catch:{ all -> 0x01c3 }
            r1.d1 = r0     // Catch:{ all -> 0x01c3 }
            r1.u1 = r0     // Catch:{ all -> 0x01c3 }
            r0 = -1
            r1.w1 = r0     // Catch:{ all -> 0x01c3 }
            r2 = 21
            if (r7 >= r2) goto L_0x024e
            android.media.AudioTrack r2 = r1.e1     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x0231
            int r2 = r2.getAudioSessionId()     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x0231
            android.media.AudioTrack r2 = r1.e1     // Catch:{ all -> 0x01c3 }
            r2.release()     // Catch:{ all -> 0x01c3 }
            r2 = 0
            r1.e1 = r2     // Catch:{ all -> 0x01c3 }
        L_0x0231:
            android.media.AudioTrack r2 = r1.e1     // Catch:{ all -> 0x01c3 }
            if (r2 != 0) goto L_0x0245
            android.media.AudioTrack r2 = new android.media.AudioTrack     // Catch:{ all -> 0x01c3 }
            r7 = 4000(0xfa0, float:5.605E-42)
            r8 = 4
            r9 = 2
            r10 = 2
            r12 = 0
            r6 = 3
            r11 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01c3 }
            r1.e1 = r2     // Catch:{ all -> 0x01c3 }
        L_0x0245:
            android.media.AudioTrack r2 = r1.e1     // Catch:{ all -> 0x01c3 }
            int r2 = r2.getAudioSessionId()     // Catch:{ all -> 0x01c3 }
            r1.j1 = r2     // Catch:{ all -> 0x01c3 }
            goto L_0x0262
        L_0x024e:
            android.content.Context r2 = r1.Y     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x01c3 }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x01c3 }
            if (r2 != 0) goto L_0x025c
            r2 = r0
            goto L_0x0260
        L_0x025c:
            int r2 = r2.generateAudioSessionId()     // Catch:{ all -> 0x01c3 }
        L_0x0260:
            r1.j1 = r2     // Catch:{ all -> 0x01c3 }
        L_0x0262:
            vw3 r2 = defpackage.vw3.c     // Catch:{ all -> 0x01c3 }
            r1.n1 = r2     // Catch:{ all -> 0x01c3 }
            r2 = 1
            r1.o1 = r2     // Catch:{ all -> 0x01c3 }
            g44 r2 = r1.H0     // Catch:{ all -> 0x01c3 }
            r1.z(r2)     // Catch:{ all -> 0x01c3 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x01c3 }
            r2.<init>(r4)     // Catch:{ all -> 0x01c3 }
            g44 r3 = r1.H0     // Catch:{ all -> 0x01c3 }
            r5 = r30
            g54 r5 = (defpackage.g54) r5     // Catch:{ all -> 0x01c3 }
            r5.getClass()     // Catch:{ all -> 0x01c3 }
            r3.getClass()     // Catch:{ all -> 0x01c3 }
            ea6 r4 = r5.b     // Catch:{ all -> 0x01c3 }
            r4.getClass()     // Catch:{ all -> 0x01c3 }
            java.lang.Object r4 = r4.b
            java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x01c3 }
        L_0x028c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r6 == 0) goto L_0x02a3
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01c3 }
            af0 r6 = (defpackage.af0) r6     // Catch:{ all -> 0x01c3 }
            g44 r7 = r6.b     // Catch:{ all -> 0x01c3 }
            if (r7 != r3) goto L_0x028c
            r7 = 1
            r6.c = r7     // Catch:{ all -> 0x01c3 }
            r4.remove(r6)     // Catch:{ all -> 0x01c3 }
            goto L_0x028c
        L_0x02a3:
            af0 r5 = new af0     // Catch:{ all -> 0x01c3 }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x01c3 }
            r4.add(r5)     // Catch:{ all -> 0x01c3 }
            h45 r2 = r1.O0     // Catch:{ all -> 0x01c3 }
            r3 = r32
            r3.add(r2)     // Catch:{ all -> 0x01c3 }
            ud r2 = new ud     // Catch:{ all -> 0x01c3 }
            h45 r3 = r1.O0     // Catch:{ all -> 0x01c3 }
            r4 = r31
            r5 = r33
            r2.<init>((android.content.Context) r4, (android.os.Handler) r5, (defpackage.h45) r3)     // Catch:{ all -> 0x01c3 }
            r1.Q0 = r2     // Catch:{ all -> 0x01c3 }
            r2.v()     // Catch:{ all -> 0x01c3 }
            p30 r2 = new p30     // Catch:{ all -> 0x01c3 }
            h45 r3 = r1.O0     // Catch:{ all -> 0x01c3 }
            r2.<init>((android.content.Context) r4, (android.os.Handler) r5, (defpackage.h45) r3)     // Catch:{ all -> 0x01c3 }
            r1.R0 = r2     // Catch:{ all -> 0x01c3 }
            r3 = 0
            r2.b(r3)     // Catch:{ all -> 0x01c3 }
            m54 r2 = new m54     // Catch:{ all -> 0x01c3 }
            r2.<init>()     // Catch:{ all -> 0x01c3 }
            r4.getApplicationContext()     // Catch:{ all -> 0x01c3 }
            r1.S0 = r2     // Catch:{ all -> 0x01c3 }
            ga3 r2 = new ga3     // Catch:{ all -> 0x01c3 }
            r2.<init>((android.content.Context) r4)     // Catch:{ all -> 0x01c3 }
            r1.T0 = r2     // Catch:{ all -> 0x01c3 }
            r2.h()     // Catch:{ all -> 0x01c3 }
            mu0 r2 = new mu0     // Catch:{ all -> 0x01c3 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ all -> 0x01c3 }
            r2.c = r3     // Catch:{ all -> 0x01c3 }
            r2.d = r3     // Catch:{ all -> 0x01c3 }
            uf4 r2 = r2.b()     // Catch:{ all -> 0x01c3 }
            r1.s1 = r2     // Catch:{ all -> 0x01c3 }
            r8f r2 = defpackage.r8f.e     // Catch:{ all -> 0x01c3 }
            r1.t1 = r2     // Catch:{ all -> 0x01c3 }
            gjd r2 = defpackage.gjd.c     // Catch:{ all -> 0x01c3 }
            r1.i1 = r2     // Catch:{ all -> 0x01c3 }
            eu7 r2 = r1.x0     // Catch:{ all -> 0x01c3 }
            k20 r3 = r1.k1     // Catch:{ all -> 0x01c3 }
            r2.a(r3)     // Catch:{ all -> 0x01c3 }
            int r2 = r1.j1     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r3 = 10
            r4 = 1
            r1.n2(r4, r3, r2)     // Catch:{ all -> 0x01c3 }
            int r2 = r1.j1     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r5 = 2
            r1.n2(r5, r3, r2)     // Catch:{ all -> 0x01c3 }
            k20 r2 = r1.k1     // Catch:{ all -> 0x01c3 }
            r3 = 3
            r1.n2(r4, r3, r2)     // Catch:{ all -> 0x01c3 }
            int r2 = r1.h1     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r3 = 4
            r1.n2(r5, r3, r2)     // Catch:{ all -> 0x01c3 }
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r3 = 5
            r1.n2(r5, r3, r2)     // Catch:{ all -> 0x01c3 }
            boolean r2 = r1.m1     // Catch:{ all -> 0x01c3 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r3 = 9
            r4 = 1
            r1.n2(r4, r3, r2)     // Catch:{ all -> 0x01c3 }
            j45 r2 = r1.P0     // Catch:{ all -> 0x01c3 }
            r3 = 7
            r4 = 2
            r1.n2(r4, r3, r2)     // Catch:{ all -> 0x01c3 }
            j45 r2 = r1.P0     // Catch:{ all -> 0x01c3 }
            r3 = 6
            r4 = 8
            r1.n2(r3, r4, r2)     // Catch:{ all -> 0x01c3 }
            int r2 = r1.q1     // Catch:{ all -> 0x01c3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c3 }
            r3 = 16
            r1.n2(r0, r3, r2)     // Catch:{ all -> 0x01c3 }
            ga3 r0 = r1.X
            r0.g()
            return
        L_0x035d:
            r0 = move-exception
            r1 = r34
        L_0x0360:
            ga3 r1 = r1.X
            r1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n45.<init>(q35):void");
    }

    public static long h2(uxa uxa) {
        tje tje = new tje();
        qje qje = new qje();
        uxa.a.h(uxa.b.a, qje);
        long j = uxa.c;
        if (j != -9223372036854775807L) {
            return qje.e + j;
        }
        return uxa.a.n(qje.c, tje, 0).l;
    }

    public final int B() {
        w2();
        if (this.v1.a.q()) {
            return 0;
        }
        uxa uxa = this.v1;
        return uxa.a.b(uxa.b.a);
    }

    public final r8f C() {
        w2();
        return this.t1;
    }

    public final void D0() {
        w2();
    }

    public final boolean E0() {
        w2();
        return this.W0;
    }

    public final k20 F() {
        w2();
        return this.k1;
    }

    public final mpe F0() {
        w2();
        return ((bc4) this.x0).f();
    }

    public final long G0() {
        w2();
        if (this.v1.a.q()) {
            return this.x1;
        }
        uxa uxa = this.v1;
        if (uxa.k.d != uxa.b.d) {
            return oze.h0(uxa.a.n(p0(), (tje) this.b, 0).m);
        }
        long j = uxa.q;
        if (this.v1.k.b()) {
            uxa uxa2 = this.v1;
            qje h = uxa2.a.h(uxa2.k.a, this.D0);
            long d = h.d(this.v1.k.b);
            j = d == Long.MIN_VALUE ? h.d : d;
        }
        uxa uxa3 = this.v1;
        vje vje = uxa3.a;
        Object obj = uxa3.k.a;
        qje qje = this.D0;
        vje.h(obj, qje);
        return oze.h0(j + qje.e);
    }

    public final void H(int i, boolean z) {
        w2();
    }

    public final void H0(int i, long j, List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        o2(c2, i, j, false);
    }

    public final uf4 I() {
        w2();
        return this.s1;
    }

    public final void I0(int i) {
        w2();
    }

    public final void J() {
        w2();
    }

    public final void L(int i, int i2) {
        w2();
    }

    public final void N(int i) {
        w2();
    }

    public final z78 N0() {
        w2();
        return this.c1;
    }

    public final int O() {
        w2();
        if (n()) {
            return this.v1.b.c;
        }
        return -1;
    }

    public final void O0(List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        o2(c2, -1, -9223372036854775807L, true);
    }

    public final long P0() {
        w2();
        return this.K0;
    }

    public final void Q(mpe mpe) {
        w2();
        eu7 eu7 = this.x0;
        eu7.getClass();
        if (!mpe.equals(((bc4) eu7).f())) {
            eu7.b(mpe);
            this.B0.f(19, new d45(mpe, 0));
        }
    }

    public final void U(int i, int i2) {
        w2();
        oyb.d(i >= 0 && i2 >= i);
        int size = this.E0.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            uxa l2 = l2(this.v1, i, min);
            t2(l2, 0, !l2.b.a.equals(this.v1.b.a), 4, e2(l2), -1, false);
        }
    }

    public final void V1(int i, long j, boolean z) {
        w2();
        if (i != -1) {
            oyb.d(i >= 0);
            vje vje = this.v1.a;
            if (vje.q() || i < vje.p()) {
                g44 g44 = this.H0;
                if (!g44.x0) {
                    gd a = g44.a();
                    g44.x0 = true;
                    g44.J(a, -1, new t34(14));
                }
                this.X0++;
                if (n()) {
                    ez3.j0("seekTo ignored because an ad is playing");
                    u45 u45 = new u45(this.v1);
                    u45.d(1);
                    n45 n45 = this.z0.b;
                    n45.y0.d(new ii4(n45, 18, u45));
                    return;
                }
                uxa uxa = this.v1;
                int i2 = uxa.e;
                if (i2 == 3 || (i2 == 4 && !vje.q())) {
                    uxa = this.v1.g(2);
                }
                int p0 = p0();
                uxa i22 = i2(uxa, vje, j2(vje, i, j));
                this.A0.w0.a(3, new x45(vje, i, oze.S(j))).b();
                t2(i22, 0, true, 1, e2(i22), p0, z);
            }
        }
    }

    public final PlaybackException X() {
        w2();
        return this.v1.f;
    }

    public final void Y(boolean z) {
        w2();
        int d = this.R0.d(getPlaybackState(), z);
        s2(d, d == -1 ? 2 : 1, z);
    }

    public final ArrayList Z1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            nf8 nf8 = new nf8((zh0) list.get(i2), this.F0);
            arrayList.add(nf8);
            this.E0.add(i2 + i, new l45(nf8.b, nf8.a));
        }
        this.a1 = this.a1.a(i, arrayList.size());
        return arrayList;
    }

    public final long a0() {
        w2();
        return this.L0;
    }

    public final uxa a2(uxa uxa, int i, ArrayList arrayList) {
        vje vje = uxa.a;
        this.X0++;
        ArrayList Z1 = Z1(i, arrayList);
        uza uza = new uza(this.E0, this.a1);
        uxa i2 = i2(uxa, uza, g2(vje, uza, f2(uxa), d2(uxa)));
        this.A0.w0.b(new r45(Z1, this.a1, -1, -9223372036854775807L), 18, i, 0).b();
        return i2;
    }

    public final boolean b() {
        w2();
        return this.v1.g;
    }

    public final long b0() {
        w2();
        return d2(this.v1);
    }

    public final z78 b2() {
        vje x02 = x0();
        if (x02.q()) {
            return this.u1;
        }
        l68 l68 = x02.n(p0(), (tje) this.b, 0).c;
        x78 a = this.u1.a();
        z78 z78 = l68.d;
        if (z78 != null) {
            CharSequence charSequence = z78.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = z78.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = z78.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = z78.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = z78.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = z78.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = z78.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = z78.h;
            if (l != null) {
                a.i(l);
            }
            ayb ayb = z78.i;
            if (ayb != null) {
                a.i = ayb;
            }
            ayb ayb2 = z78.j;
            if (ayb2 != null) {
                a.j = ayb2;
            }
            byte[] bArr = z78.k;
            Uri uri = z78.m;
            if (!(uri == null && bArr == null)) {
                a.m = uri;
                a.f(bArr, z78.l);
            }
            Integer num = z78.n;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = z78.o;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = z78.p;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = z78.q;
            if (bool != null) {
                a.q = bool;
            }
            Boolean bool2 = z78.r;
            if (bool2 != null) {
                a.r = bool2;
            }
            Integer num4 = z78.s;
            if (num4 != null) {
                a.s = num4;
            }
            Integer num5 = z78.t;
            if (num5 != null) {
                a.s = num5;
            }
            Integer num6 = z78.u;
            if (num6 != null) {
                a.t = num6;
            }
            Integer num7 = z78.v;
            if (num7 != null) {
                a.u = num7;
            }
            Integer num8 = z78.w;
            if (num8 != null) {
                a.v = num8;
            }
            Integer num9 = z78.x;
            if (num9 != null) {
                a.w = num9;
            }
            Integer num10 = z78.y;
            if (num10 != null) {
                a.x = num10;
            }
            CharSequence charSequence8 = z78.z;
            if (charSequence8 != null) {
                a.y = charSequence8;
            }
            CharSequence charSequence9 = z78.A;
            if (charSequence9 != null) {
                a.z = charSequence9;
            }
            CharSequence charSequence10 = z78.B;
            if (charSequence10 != null) {
                a.A = charSequence10;
            }
            Integer num11 = z78.C;
            if (num11 != null) {
                a.B = num11;
            }
            Integer num12 = z78.D;
            if (num12 != null) {
                a.C = num12;
            }
            CharSequence charSequence11 = z78.E;
            if (charSequence11 != null) {
                a.D = charSequence11;
            }
            CharSequence charSequence12 = z78.F;
            if (charSequence12 != null) {
                a.E = charSequence12;
            }
            CharSequence charSequence13 = z78.G;
            if (charSequence13 != null) {
                a.F = charSequence13;
            }
            Integer num13 = z78.H;
            if (num13 != null) {
                a.G = num13;
            }
            Bundle bundle = z78.I;
            if (bundle != null) {
                a.H = bundle;
            }
        }
        return new z78(a);
    }

    public final long c() {
        w2();
        if (!n()) {
            return A();
        }
        uxa uxa = this.v1;
        se8 se8 = uxa.b;
        vje vje = uxa.a;
        Object obj = se8.a;
        qje qje = this.D0;
        vje.h(obj, qje);
        return oze.h0(qje.a(se8.b, se8.c));
    }

    public final ArrayList c2(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.G0.e((l68) list.get(i)));
        }
        return arrayList;
    }

    public final wxa d() {
        w2();
        return this.v1.o;
    }

    public final void d0(int i, List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        oyb.d(i >= 0);
        ArrayList arrayList = this.E0;
        int min = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            boolean z = this.w1 == -1;
            w2();
            o2(c2, -1, -9223372036854775807L, z);
            return;
        }
        t2(a2(this.v1, min, c2), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final long d2(uxa uxa) {
        if (!uxa.b.b()) {
            return oze.h0(e2(uxa));
        }
        Object obj = uxa.b.a;
        vje vje = uxa.a;
        qje qje = this.D0;
        vje.h(obj, qje);
        long j = uxa.c;
        return j == -9223372036854775807L ? oze.h0(vje.n(f2(uxa), (tje) this.b, 0).l) : oze.h0(qje.e) + oze.h0(j);
    }

    public final float e() {
        w2();
        return this.l1;
    }

    public final long e0() {
        w2();
        if (!n()) {
            return G0();
        }
        uxa uxa = this.v1;
        return uxa.k.equals(uxa.b) ? oze.h0(this.v1.q) : c();
    }

    public final long e2(uxa uxa) {
        if (uxa.a.q()) {
            return oze.S(this.x1);
        }
        long j = uxa.p ? uxa.j() : uxa.s;
        if (uxa.b.b()) {
            return j;
        }
        vje vje = uxa.a;
        Object obj = uxa.b.a;
        qje qje = this.D0;
        vje.h(obj, qje);
        return j + qje.e;
    }

    public final void f(wxa wxa) {
        w2();
        if (!this.v1.o.equals(wxa)) {
            uxa f = this.v1.f(wxa);
            this.X0++;
            this.A0.w0.a(4, wxa).b();
            t2(f, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final int f2(uxa uxa) {
        if (uxa.a.q()) {
            return this.w1;
        }
        return uxa.a.h(uxa.b.a, this.D0).c;
    }

    public final void g(float f) {
        w2();
        float i = oze.i(f, 0.0f, 1.0f);
        if (this.l1 != i) {
            this.l1 = i;
            n2(1, 2, Float.valueOf(this.R0.e * i));
            this.B0.f(22, new u35(1, i));
        }
    }

    public final void g0(int i) {
        w2();
    }

    public final Pair g2(vje vje, uza uza, int i, long j) {
        uza uza2 = uza;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (vje.q() || uza.q()) {
            boolean z = !vje.q() && uza.q();
            if (!z) {
                i2 = i;
            }
            if (!z) {
                j2 = j;
            }
            return j2(uza, i2, j2);
        }
        Pair j3 = vje.j((tje) this.b, this.D0, i, oze.S(j));
        Object obj = j3.first;
        if (uza.b(obj) != -1) {
            return j3;
        }
        int G = z45.G((tje) this.b, this.D0, this.V0, this.W0, obj, vje, uza);
        if (G == -1) {
            return j2(uza, -1, -9223372036854775807L);
        }
        tje tje = (tje) this.b;
        uza.n(G, tje, 0);
        return j2(uza, G, oze.h0(tje.l));
    }

    public final int getPlaybackState() {
        w2();
        return this.v1.e;
    }

    public final int getRepeatMode() {
        w2();
        return this.V0;
    }

    public final spe h0() {
        w2();
        return (spe) this.v1.i.Y;
    }

    public final uxa i2(uxa uxa, vje vje, Pair pair) {
        List list;
        int i;
        vje vje2 = vje;
        Pair pair2 = pair;
        oyb.d(vje.q() || pair2 != null);
        vje vje3 = uxa.a;
        long d2 = d2(uxa);
        uxa h = uxa.h(vje);
        if (vje.q()) {
            se8 se8 = uxa.u;
            long S = oze.S(this.x1);
            uxa b = h.c(se8, S, S, S, 0, woe.d, this.c, e8c.X).b(se8);
            b.q = b.s;
            return b;
        }
        Object obj = h.b.a;
        int i2 = oze.a;
        boolean z = !obj.equals(pair2.first);
        se8 se82 = z ? new se8(pair2.first) : h.b;
        long longValue = ((Long) pair2.second).longValue();
        long S2 = oze.S(d2);
        if (!vje3.q()) {
            S2 -= vje3.h(obj, this.D0).e;
        }
        if (z || longValue < S2) {
            long j = longValue;
            se8 se83 = se82;
            oyb.k(!se83.b());
            woe woe = z ? woe.d : h.h;
            ope ope = z ? this.c : h.i;
            if (z) {
                po5 po5 = ws6.b;
                list = e8c.X;
            } else {
                list = h.j;
            }
            uxa b2 = h.c(se83, j, j, j, 0, woe, ope, list).b(se83);
            b2.q = j;
            return b2;
        } else if (i == 0) {
            int b3 = vje2.b(h.k.a);
            if (b3 != -1 && vje2.g(b3, this.D0, false).c == vje2.h(se82.a, this.D0).c) {
                return h;
            }
            vje2.h(se82.a, this.D0);
            long a = se82.b() ? this.D0.a(se82.b, se82.c) : this.D0.d;
            uxa b4 = h.c(se82, h.s, h.s, h.d, a - h.s, h.h, h.i, h.j).b(se82);
            b4.q = a;
            return b4;
        } else {
            se8 se84 = se82;
            oyb.k(!se84.b());
            long max = Math.max(0, h.r - (longValue - S2));
            long j2 = h.q;
            if (h.k.equals(h.b)) {
                j2 = longValue + max;
            }
            uxa c2 = h.c(se84, longValue, longValue, longValue, max, h.h, h.i, h.j);
            c2.q = j2;
            return c2;
        }
    }

    public final Pair j2(vje vje, int i, long j) {
        if (vje.q()) {
            this.w1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.x1 = j;
            return null;
        }
        if (i == -1 || i >= vje.p()) {
            i = vje.a(this.W0);
            j = oze.h0(vje.n(i, (tje) this.b, 0).l);
        }
        return vje.j((tje) this.b, this.D0, i, oze.S(j));
    }

    public final long k() {
        w2();
        return oze.h0(e2(this.v1));
    }

    public final z78 k0() {
        w2();
        return this.d1;
    }

    public final void k2(int i, int i2) {
        gjd gjd = this.i1;
        if (i != gjd.a || i2 != gjd.b) {
            this.i1 = new gjd(i, i2);
            this.B0.f(24, new a45(i, i2, 0));
            n2(2, 14, new gjd(i, i2));
        }
    }

    public final int l() {
        w2();
        return 0;
    }

    public final vw3 l0() {
        w2();
        return this.n1;
    }

    public final uxa l2(uxa uxa, int i, int i2) {
        int f2 = f2(uxa);
        long d2 = d2(uxa);
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        this.X0++;
        m2(i, i2);
        uza uza = new uza(arrayList, this.a1);
        uxa i22 = i2(uxa, uza, g2(uxa.a, uza, f2, d2));
        int i3 = i22.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && f2 >= i22.a.p()) {
            i22 = i22.g(4);
        }
        this.A0.w0.b(this.a1, 20, i, i2).b();
        return i22;
    }

    public final void m(Surface surface) {
        w2();
        p2(surface);
        int i = surface == null ? 0 : -1;
        k2(i, i);
    }

    public final void m0(k20 k20, boolean z) {
        w2();
        if (!this.r1) {
            boolean a = oze.a(this.k1, k20);
            int i = 1;
            qh7 qh7 = this.B0;
            if (!a) {
                this.k1 = k20;
                n2(1, 3, k20);
                qh7.c(20, new c45(k20, 0));
            }
            k20 k202 = z ? k20 : null;
            p30 p30 = this.R0;
            p30.b(k202);
            this.x0.a(k20);
            boolean u = u();
            int d = p30.d(getPlaybackState(), u);
            if (d == -1) {
                i = 2;
            }
            s2(d, i, u);
            qh7.b();
        }
    }

    public final void m2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.E0.remove(i3);
        }
        yed yed = this.a1;
        int i4 = i2 - i;
        int[] iArr = yed.b;
        int[] iArr2 = new int[(iArr.length - i4)];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.a1 = new yed(iArr2, new Random(yed.a.nextLong()));
    }

    public final boolean n() {
        w2();
        return this.v1.b.b();
    }

    public final void n0(z78 z78) {
        w2();
        if (!z78.equals(this.d1)) {
            this.d1 = z78;
            this.B0.f(15, new b45(this, 1));
        }
    }

    public final void n2(int i, int i2, Object obj) {
        for (qi0 qi0 : this.w0) {
            if (i == -1 || qi0.b == i) {
                int f2 = f2(this.v1);
                vje vje = this.v1.a;
                int i3 = f2 == -1 ? 0 : f2;
                z45 z45 = this.A0;
                lza lza = new lza(z45, qi0, vje, i3, this.N0, z45.y0);
                oyb.k(!lza.g);
                lza.d = i2;
                oyb.k(!lza.g);
                lza.e = obj;
                lza.c();
            }
        }
    }

    public final int o0() {
        w2();
        if (n()) {
            return this.v1.b.b;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o2(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            uxa r2 = r0.v1
            int r2 = r15.f2(r2)
            long r3 = r15.k()
            int r5 = r0.X0
            r6 = 1
            int r5 = r5 + r6
            r0.X0 = r5
            java.util.ArrayList r5 = r0.E0
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L_0x0023
            int r7 = r5.size()
            r15.m2(r8, r7)
        L_0x0023:
            r7 = r16
            java.util.ArrayList r10 = r15.Z1(r8, r7)
            uza r7 = new uza
            yed r9 = r0.a1
            r7.<init>(r5, r9)
            boolean r5 = r7.q()
            int r9 = r7.g
            if (r5 != 0) goto L_0x0041
            if (r1 >= r9) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0041:
            r5 = -1
            if (r20 == 0) goto L_0x0051
            boolean r1 = r0.W0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004f:
            r12 = r1
            goto L_0x0059
        L_0x0051:
            if (r1 != r5) goto L_0x0056
            r12 = r2
            r2 = r3
            goto L_0x0059
        L_0x0056:
            r2 = r18
            goto L_0x004f
        L_0x0059:
            uxa r1 = r0.v1
            android.util.Pair r4 = r15.j2(r7, r12, r2)
            uxa r1 = r15.i2(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L_0x0075
            if (r4 == r6) goto L_0x0075
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x0074
            if (r12 < r9) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 2
            goto L_0x0075
        L_0x0074:
            r4 = 4
        L_0x0075:
            uxa r1 = r1.g(r4)
            long r13 = defpackage.oze.S(r2)
            yed r11 = r0.a1
            z45 r2 = r0.A0
            h8e r2 = r2.w0
            r45 r3 = new r45
            r9 = r3
            r9.<init>(r10, r11, r12, r13)
            r4 = 17
            f8e r2 = r2.a(r4, r3)
            r2.b()
            uxa r2 = r0.v1
            se8 r2 = r2.b
            java.lang.Object r2 = r2.a
            se8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00ae
            uxa r2 = r0.v1
            vje r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00ae
            r3 = r6
            goto L_0x00af
        L_0x00ae:
            r3 = r8
        L_0x00af:
            long r5 = r15.e2(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.t2(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n45.o2(java.util.List, int, long, boolean):void");
    }

    public final int p0() {
        w2();
        int f2 = f2(this.v1);
        if (f2 == -1) {
            return 0;
        }
        return f2;
    }

    public final void p2(Object obj) {
        boolean z;
        Object obj2 = obj;
        ArrayList arrayList = new ArrayList();
        for (qi0 qi0 : this.w0) {
            if (qi0.b == 2) {
                int f2 = f2(this.v1);
                vje vje = this.v1.a;
                int i = f2 == -1 ? 0 : f2;
                z45 z45 = this.A0;
                lza lza = r9;
                lza lza2 = new lza(z45, qi0, vje, i, this.N0, z45.y0);
                oyb.k(!lza.g);
                lza.d = 1;
                oyb.k(!lza.g);
                lza.e = obj2;
                lza.c();
                arrayList.add(lza);
            }
        }
        Object obj3 = this.f1;
        if (obj3 == null || obj3 == obj2) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((lza) it.next()).a(this.U0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj4 = this.f1;
            Surface surface = this.g1;
            if (obj4 == surface) {
                surface.release();
                this.g1 = null;
            }
        }
        this.f1 = obj2;
        if (z) {
            q2(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void prepare() {
        w2();
        boolean u = u();
        int i = 2;
        int d = this.R0.d(2, u);
        s2(d, d == -1 ? 2 : 1, u);
        uxa uxa = this.v1;
        if (uxa.e == 1) {
            uxa e = uxa.e((ExoPlaybackException) null);
            if (e.a.q()) {
                i = 4;
            }
            uxa g = e.g(i);
            this.X0++;
            h8e h8e = this.A0.w0;
            h8e.getClass();
            f8e c2 = h8e.c();
            c2.a = h8e.a.obtainMessage(29);
            c2.b();
            t2(g, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final long q() {
        w2();
        return oze.h0(this.v1.r);
    }

    public final void q0(boolean z) {
        w2();
    }

    public final void q2(ExoPlaybackException exoPlaybackException) {
        uxa uxa = this.v1;
        uxa b = uxa.b(uxa.b);
        b.q = b.s;
        b.r = 0;
        uxa g = b.g(1);
        if (exoPlaybackException != null) {
            g = g.e(exoPlaybackException);
        }
        uxa uxa2 = g;
        this.X0++;
        h8e h8e = this.A0.w0;
        h8e.getClass();
        f8e c2 = h8e.c();
        c2.a = h8e.a.obtainMessage(6);
        c2.b();
        t2(uxa2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void r0(hya hya) {
        w2();
        hya.getClass();
        this.B0.e(hya);
    }

    public final void r2() {
        boolean z = true;
        eya eya = this.b1;
        int i = oze.a;
        kya kya = this.Z;
        boolean n = kya.n();
        boolean n12 = kya.n1();
        boolean M = kya.M();
        boolean j0 = kya.j0();
        boolean K1 = kya.K1();
        boolean y1 = kya.y1();
        boolean q = kya.x0().q();
        ea6 ea6 = new ea6(1);
        wi5 wi5 = this.o.a;
        ui5 ui5 = (ui5) ea6.b;
        ui5.b(wi5);
        boolean z2 = !n;
        ea6.z(4, z2);
        ea6.z(5, n12 && !n);
        ea6.z(6, M && !n);
        ea6.z(7, !q && (M || !K1 || n12) && !n);
        ea6.z(8, j0 && !n);
        ea6.z(9, !q && (j0 || (K1 && y1)) && !n);
        ea6.z(10, z2);
        ea6.z(11, n12 && !n);
        if (!n12 || n) {
            z = false;
        }
        ea6.z(12, z);
        eya eya2 = new eya(ui5.e());
        this.b1 = eya2;
        if (!eya2.equals(eya)) {
            this.B0.c(13, new b45(this, 2));
        }
    }

    public final void release() {
        boolean z;
        qb4 qb4;
        AudioTrack audioTrack;
        ez3.M("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oze.e + "] [" + g78.b() + "]");
        w2();
        int i = oze.a;
        if (i < 21 && (audioTrack = this.e1) != null) {
            audioTrack.release();
            this.e1 = null;
        }
        this.Q0.v();
        this.S0.getClass();
        ga3 ga3 = this.T0;
        ga3.getClass();
        ga3.getClass();
        p30 p30 = this.R0;
        p30.h = null;
        p30.a();
        p30.c(0);
        z45 z45 = this.A0;
        synchronized (z45) {
            if (!z45.P0) {
                if (z45.y0.getThread().isAlive()) {
                    z45.w0.f(7);
                    z45.h0(new k94(8, z45), z45.K0);
                    z = z45.P0;
                }
            }
            z = true;
        }
        if (!z) {
            this.B0.f(10, new i74(18));
        }
        this.B0.d();
        this.y0.a.removeCallbacksAndMessages((Object) null);
        cf0 cf0 = this.J0;
        g44 g44 = this.H0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((g54) cf0).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            af0 af0 = (af0) it.next();
            if (af0.b == g44) {
                af0.c = true;
                copyOnWriteArrayList.remove(af0);
            }
        }
        uxa uxa = this.v1;
        if (uxa.p) {
            this.v1 = uxa.a();
        }
        uxa g = this.v1.g(1);
        this.v1 = g;
        uxa b = g.b(g.b);
        this.v1 = b;
        b.q = b.s;
        this.v1.r = 0;
        g44 g442 = this.H0;
        h8e h8e = g442.w0;
        oyb.l(h8e);
        h8e.d(new ds1(21, g442));
        bc4 bc4 = (bc4) this.x0;
        synchronized (bc4.c) {
            if (i >= 32) {
                try {
                    e06 e06 = bc4.h;
                    if (!(e06 == null || (qb4 = (qb4) e06.o) == null)) {
                        if (((Handler) e06.c) != null) {
                            ((Spatializer) e06.b).removeOnSpatializerStateChangedListener(qb4);
                            ((Handler) e06.c).removeCallbacksAndMessages((Object) null);
                            e06.c = null;
                            e06.o = null;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        bc4.a = null;
        bc4.b = null;
        Surface surface = this.g1;
        if (surface != null) {
            surface.release();
            this.g1 = null;
        }
        this.n1 = vw3.c;
        this.r1 = true;
    }

    public final eya s() {
        w2();
        return this.b1;
    }

    public final void s0(List list, int i, int i2) {
        w2();
        oyb.d(i >= 0 && i2 >= i);
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        if (i <= size) {
            int min = Math.min(i2, size);
            if (min - i == list.size()) {
                int i3 = i;
                while (i3 < min) {
                    if (((l45) arrayList.get(i3)).b.k.a((l68) list.get(i3 - i))) {
                        i3++;
                    }
                }
                this.X0++;
                this.A0.w0.b(list, 27, i, min).b();
                for (int i4 = i; i4 < min; i4++) {
                    l45 l45 = (l45) arrayList.get(i4);
                    l45.c = new sza(l45.c, (l68) list.get(i4 - i));
                }
                t2(this.v1.h(new uza(arrayList, this.a1)), 0, false, 4, -9223372036854775807L, -1, false);
                return;
            }
            ArrayList c2 = c2(list);
            if (arrayList.isEmpty()) {
                boolean z = this.w1 == -1;
                w2();
                o2(c2, -1, -9223372036854775807L, z);
                return;
            }
            uxa l2 = l2(a2(this.v1, min, c2), i, min);
            t2(l2, 0, !l2.b.a.equals(this.v1.b.a), 4, e2(l2), -1, false);
        }
    }

    public final void s2(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (i == 0) {
            i3 = 1;
        }
        uxa uxa = this.v1;
        if (uxa.l != z2 || uxa.n != i3 || uxa.m != i2) {
            u2(i2, i3, z2);
        }
    }

    public final void setRepeatMode(int i) {
        w2();
        if (this.V0 != i) {
            this.V0 = i;
            h8e h8e = this.A0.w0;
            h8e.getClass();
            f8e c2 = h8e.c();
            c2.a = h8e.a.obtainMessage(11, i, 0);
            c2.b();
            x34 x34 = new x34(i, 2);
            qh7 qh7 = this.B0;
            qh7.c(8, x34);
            r2();
            qh7.b();
        }
    }

    public final void stop() {
        w2();
        this.R0.d(1, u());
        q2((ExoPlaybackException) null);
        this.n1 = new vw3(this.v1.s, e8c.X);
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0299  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t2(defpackage.uxa r41, int r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r44
            uxa r3 = r0.v1
            r0.v1 = r1
            vje r4 = r3.a
            vje r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            vje r6 = r3.a
            vje r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
            goto L_0x00cd
        L_0x0035:
            boolean r8 = r7.q()
            boolean r9 = r6.q()
            if (r8 == r9) goto L_0x004c
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r6.<init>(r7, r8)
            goto L_0x00cd
        L_0x004c:
            se8 r8 = r3.b
            java.lang.Object r9 = r8.a
            qje r12 = r0.D0
            qje r9 = r6.h(r9, r12)
            int r9 = r9.c
            java.lang.Object r11 = r0.b
            tje r11 = (defpackage.tje) r11
            tje r6 = r6.n(r9, r11, r13)
            java.lang.Object r6 = r6.a
            se8 r9 = r1.b
            java.lang.Object r15 = r9.a
            qje r12 = r7.h(r15, r12)
            int r12 = r12.c
            tje r7 = r7.n(r12, r11, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r43 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r6 = r5
            goto L_0x0087
        L_0x007e:
            if (r43 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r6 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r6 = 3
        L_0x0087:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r8, r6)
            r6 = r7
            goto L_0x00cd
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r43 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r9.d
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b3
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00b3:
            if (r43 == 0) goto L_0x00c6
            if (r2 != r5) goto L_0x00c6
            if (r48 == 0) goto L_0x00c6
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00c6:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
        L_0x00cd:
            java.lang.Object r7 = r6.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r7 == 0) goto L_0x0108
            vje r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x0102
            vje r9 = r1.a
            se8 r10 = r1.b
            java.lang.Object r10 = r10.a
            qje r11 = r0.D0
            qje r9 = r9.h(r10, r11)
            int r9 = r9.c
            vje r10 = r1.a
            java.lang.Object r11 = r0.b
            tje r11 = (defpackage.tje) r11
            tje r9 = r10.n(r9, r11, r13)
            l68 r9 = r9.c
            goto L_0x0103
        L_0x0102:
            r9 = 0
        L_0x0103:
            z78 r10 = defpackage.z78.J
            r0.u1 = r10
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            if (r7 != 0) goto L_0x0115
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0144
        L_0x0115:
            z78 r10 = r0.u1
            x78 r10 = r10.a()
            java.util.List r11 = r1.j
            r12 = 0
        L_0x011e:
            int r15 = r11.size()
            if (r12 >= r15) goto L_0x013d
            java.lang.Object r15 = r11.get(r12)
            a39 r15 = (defpackage.a39) r15
            r8 = 0
        L_0x012b:
            x29[] r13 = r15.a
            int r14 = r13.length
            if (r8 >= r14) goto L_0x0138
            r13 = r13[r8]
            r13.w(r10)
            int r8 = r8 + 1
            goto L_0x012b
        L_0x0138:
            int r12 = r12 + 1
            r13 = 0
            goto L_0x011e
        L_0x013d:
            z78 r8 = new z78
            r8.<init>(r10)
            r0.u1 = r8
        L_0x0144:
            z78 r8 = r40.b2()
            z78 r10 = r0.c1
            boolean r10 = r8.equals(r10)
            r10 = r10 ^ r5
            r0.c1 = r8
            boolean r8 = r3.l
            boolean r11 = r1.l
            if (r8 == r11) goto L_0x0159
            r8 = r5
            goto L_0x015a
        L_0x0159:
            r8 = 0
        L_0x015a:
            int r11 = r3.e
            int r12 = r1.e
            if (r11 == r12) goto L_0x0162
            r11 = r5
            goto L_0x0163
        L_0x0162:
            r11 = 0
        L_0x0163:
            if (r11 != 0) goto L_0x0167
            if (r8 == 0) goto L_0x016a
        L_0x0167:
            r40.v2()
        L_0x016a:
            boolean r12 = r3.g
            boolean r13 = r1.g
            if (r12 == r13) goto L_0x0172
            r12 = r5
            goto L_0x0173
        L_0x0172:
            r12 = 0
        L_0x0173:
            if (r4 == 0) goto L_0x0183
            qh7 r4 = r0.B0
            hc0 r13 = new hc0
            r14 = 4
            r15 = r42
            r13.<init>(r15, r14, r1)
            r14 = 0
            r4.c(r14, r13)
        L_0x0183:
            if (r43 == 0) goto L_0x02bc
            qje r4 = new qje
            r4.<init>()
            vje r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c8
            se8 r13 = r3.b
            java.lang.Object r13 = r13.a
            vje r14 = r3.a
            r14.h(r13, r4)
            int r14 = r4.c
            vje r15 = r3.a
            int r15 = r15.b(r13)
            vje r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.b
            tje r13 = (defpackage.tje) r13
            r16 = r11
            r17 = r12
            r11 = 0
            tje r5 = r5.n(r14, r13, r11)
            java.lang.Object r5 = r5.a
            java.lang.Object r11 = r0.b
            tje r11 = (defpackage.tje) r11
            l68 r11 = r11.c
            r22 = r42
            r19 = r5
            r21 = r11
            r20 = r14
            r23 = r15
            goto L_0x01d6
        L_0x01c8:
            r16 = r11
            r17 = r12
            r20 = r47
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01d6:
            if (r2 != 0) goto L_0x0204
            se8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x01ef
            se8 r5 = r3.b
            int r11 = r5.b
            int r5 = r5.c
            long r4 = r4.a(r11, r5)
            long r11 = h2(r3)
            goto L_0x0219
        L_0x01ef:
            se8 r5 = r3.b
            int r5 = r5.e
            r11 = -1
            if (r5 == r11) goto L_0x01fe
            uxa r4 = r0.v1
            long r4 = h2(r4)
        L_0x01fc:
            r11 = r4
            goto L_0x0219
        L_0x01fe:
            long r11 = r4.e
            long r4 = r4.d
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0204:
            se8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x0213
            long r4 = r3.s
            long r11 = h2(r3)
            goto L_0x0219
        L_0x0213:
            long r4 = r4.e
            long r11 = r3.s
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0219:
            jya r13 = new jya
            long r24 = defpackage.oze.h0(r4)
            long r26 = defpackage.oze.h0(r11)
            se8 r4 = r3.b
            int r5 = r4.b
            int r4 = r4.c
            r18 = r13
            r28 = r5
            r29 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r4 = r40.p0()
            uxa r5 = r0.v1
            vje r5 = r5.a
            boolean r5 = r5.q()
            if (r5 != 0) goto L_0x0273
            uxa r5 = r0.v1
            se8 r11 = r5.b
            java.lang.Object r11 = r11.a
            vje r5 = r5.a
            qje r12 = r0.D0
            r5.h(r11, r12)
            uxa r5 = r0.v1
            vje r5 = r5.a
            int r5 = r5.b(r11)
            uxa r12 = r0.v1
            vje r12 = r12.a
            java.lang.Object r14 = r0.b
            tje r14 = (defpackage.tje) r14
            r15 = r10
            r18 = r11
            r10 = 0
            tje r10 = r12.n(r4, r14, r10)
            java.lang.Object r10 = r10.a
            l68 r11 = r14.c
            r33 = r5
            r29 = r10
            r31 = r11
            r32 = r18
            goto L_0x027c
        L_0x0273:
            r15 = r10
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x027c:
            long r34 = defpackage.oze.h0(r45)
            jya r5 = new jya
            uxa r10 = r0.v1
            se8 r10 = r10.b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x0299
            uxa r10 = r0.v1
            long r10 = h2(r10)
            long r10 = defpackage.oze.h0(r10)
            r36 = r10
            goto L_0x029b
        L_0x0299:
            r36 = r34
        L_0x029b:
            uxa r10 = r0.v1
            se8 r10 = r10.b
            int r11 = r10.b
            int r10 = r10.c
            r28 = r5
            r30 = r4
            r38 = r11
            r39 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            qh7 r4 = r0.B0
            ph0 r10 = new ph0
            r11 = 6
            r10.<init>(r2, r13, r5, r11)
            r2 = 11
            r4.c(r2, r10)
            goto L_0x02c1
        L_0x02bc:
            r15 = r10
            r16 = r11
            r17 = r12
        L_0x02c1:
            if (r7 == 0) goto L_0x02cf
            qh7 r2 = r0.B0
            hc0 r4 = new hc0
            r5 = 6
            r4.<init>(r6, r5, r9)
            r5 = 1
            r2.c(r5, r4)
        L_0x02cf:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r3.f
            androidx.media3.exoplayer.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02f1
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.c(r5, r4)
            androidx.media3.exoplayer.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02f1
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r6 = 1
            r4.<init>(r1, r6)
            r2.c(r5, r4)
        L_0x02f1:
            ope r2 = r3.i
            ope r4 = r1.i
            if (r2 == r4) goto L_0x030c
            eu7 r2 = r0.x0
            java.lang.Object r4 = r4.c
            r2.getClass()
            cu7 r4 = (defpackage.cu7) r4
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 2
            r4.<init>(r1, r5)
            r5 = 2
            r2.c(r5, r4)
        L_0x030c:
            if (r15 == 0) goto L_0x031d
            z78 r2 = r0.c1
            qh7 r4 = r0.B0
            y35 r5 = new y35
            r6 = 0
            r5.<init>(r2, r6)
            r2 = 14
            r4.c(r2, r5)
        L_0x031d:
            if (r17 == 0) goto L_0x032b
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.c(r5, r4)
        L_0x032b:
            if (r16 != 0) goto L_0x032f
            if (r8 == 0) goto L_0x033b
        L_0x032f:
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.c(r5, r4)
        L_0x033b:
            if (r16 == 0) goto L_0x0349
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.c(r5, r4)
        L_0x0349:
            if (r8 != 0) goto L_0x0351
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x035d
        L_0x0351:
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 6
            r4.<init>(r1, r5)
            r5 = 5
            r2.c(r5, r4)
        L_0x035d:
            int r2 = r3.n
            int r4 = r1.n
            if (r2 == r4) goto L_0x036f
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 7
            r4.<init>(r1, r5)
            r5 = 6
            r2.c(r5, r4)
        L_0x036f:
            boolean r2 = r3.k()
            boolean r4 = r41.k()
            if (r2 == r4) goto L_0x0386
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 7
            r2.c(r5, r4)
        L_0x0386:
            wxa r2 = r3.o
            wxa r4 = r1.o
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x039e
            qh7 r2 = r0.B0
            w35 r4 = new w35
            r5 = 9
            r4.<init>(r1, r5)
            r5 = 12
            r2.c(r5, r4)
        L_0x039e:
            r40.r2()
            qh7 r2 = r0.B0
            r2.b()
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03c4
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.C0
            java.util.Iterator r0 = r0.iterator()
        L_0x03b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03c4
            java.lang.Object r1 = r0.next()
            h45 r1 = (defpackage.h45) r1
            n45 r1 = r1.a
            r1.v2()
            goto L_0x03b2
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n45.t2(uxa, int, boolean, int, long, int, boolean):void");
    }

    public final boolean u() {
        w2();
        return this.v1.l;
    }

    public final void u0(int i, int i2, int i3) {
        w2();
        oyb.d(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.E0;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            vje x02 = x0();
            this.X0++;
            oze.R(arrayList, i, min, min2);
            uza uza = new uza(arrayList, this.a1);
            uxa uxa = this.v1;
            uxa i22 = i2(uxa, uza, g2(x02, uza, f2(uxa), d2(this.v1)));
            yed yed = this.a1;
            z45 z45 = this.A0;
            z45.getClass();
            z45.w0.a(19, new s45(i, min, min2, yed)).b();
            t2(i22, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void u2(int i, int i2, boolean z) {
        this.X0++;
        uxa uxa = this.v1;
        if (uxa.p) {
            uxa = uxa.a();
        }
        uxa d = uxa.d(i, i2, z);
        int i3 = i | (i2 << 4);
        h8e h8e = this.A0.w0;
        h8e.getClass();
        f8e c2 = h8e.c();
        c2.a = h8e.a.obtainMessage(1, z ? 1 : 0, i3);
        c2.b();
        t2(d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final int v0() {
        w2();
        return this.v1.n;
    }

    public final void v2() {
        int playbackState = getPlaybackState();
        ga3 ga3 = this.T0;
        m54 m54 = this.S0;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                w2();
                boolean z = this.v1.p;
                boolean u = u();
                m54.getClass();
                u();
                ga3.getClass();
                ga3.getClass();
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        m54.getClass();
        ga3.getClass();
        ga3.getClass();
    }

    public final void w(boolean z) {
        w2();
        if (this.W0 != z) {
            this.W0 = z;
            h8e h8e = this.A0.w0;
            h8e.getClass();
            f8e c2 = h8e.c();
            c2.a = h8e.a.obtainMessage(12, z ? 1 : 0, 0);
            c2.b();
            cz0 cz0 = new cz0(z, 2);
            qh7 qh7 = this.B0;
            qh7.c(9, cz0);
            r2();
            qh7.b();
        }
    }

    public final void w2() {
        this.X.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = oze.a;
            Locale locale = Locale.US;
            String i2 = c3d.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.o1) {
                ez3.k0(i2, this.p1 ? null : new IllegalStateException());
                this.p1 = true;
                return;
            }
            throw new IllegalStateException(i2);
        }
    }

    public final vje x0() {
        w2();
        return this.v1.a;
    }

    public final long y() {
        w2();
        return this.M0;
    }

    public final void z(hya hya) {
        hya.getClass();
        this.B0.a(hya);
    }

    public final boolean z0() {
        w2();
        return false;
    }

    public final Looper z1() {
        return this.I0;
    }
}
