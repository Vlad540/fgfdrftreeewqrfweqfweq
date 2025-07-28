package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: m45  reason: default package */
public final class m45 extends u2 {
    public final y45 A0;
    public final oz2 B0;
    public final CopyOnWriteArraySet C0;
    public final pje D0;
    public final ArrayList E0;
    public final boolean F0;
    public final f44 G0;
    public final Looper H0;
    public final bf0 I0;
    public final y7e J0;
    public final g45 K0;
    public final i45 L0;
    public final p30 M0;
    public final qzd N0;
    public final om3 O0;
    public final gk9 P0;
    public final long Q0;
    public int R0;
    public int S0;
    public int T0;
    public boolean U0;
    public int V0;
    public final wtc W0;
    public final ga3 X = new ga3(false, 0);
    public xed X0;
    public final Context Y;
    public dya Y0;
    public final u2 Z;
    public y78 Z0;
    public final AudioTrack a1;
    public Object b1;
    public final ope c;
    public Surface c1;
    public final int d1;
    public int e1;
    public int f1;
    public final int g1;
    public final j20 h1;
    public float i1;
    public boolean j1;
    public final boolean k1;
    public boolean l1;
    public final sf4 m1;
    public y78 n1;
    public final dya o;
    public txa o1;
    public int p1;
    public long q1;
    public final pi0[] w0;
    public final du7 x0;
    public final g8e y0;
    public final z35 z0;

    static {
        a55.a("goog.exo.exoplayer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: m45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: m45} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: m45} */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, i45] */
    /* JADX WARNING: type inference failed for: r2v16, types: [om3, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m45(defpackage.p35 r31, u2 r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            r4 = 20
            r5 = 1
            r6 = 0
            r7 = 2
            r1.<init>(r7)
            ga3 r8 = new ga3
            r8.<init>((boolean) r6, (int) r6)
            r1.X = r8
            int r8 = java.lang.System.identityHashCode(r30)     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.Integer.toHexString(r8)     // Catch:{ all -> 0x019e }
            java.lang.String r9 = defpackage.mze.e     // Catch:{ all -> 0x019e }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x019e }
            int r8 = r8.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + 30
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019e }
            int r9 = r9.length()     // Catch:{ all -> 0x019e }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r9.<init>(r8)     // Catch:{ all -> 0x019e }
            android.content.Context r8 = r0.a     // Catch:{ all -> 0x019e }
            android.os.Looper r9 = r0.i
            android.content.Context r10 = r8.getApplicationContext()     // Catch:{ all -> 0x019e }
            r1.Y = r10     // Catch:{ all -> 0x019e }
            e26 r10 = r0.h     // Catch:{ all -> 0x019e }
            y7e r11 = r0.b
            java.lang.Object r10 = r10.apply(r11)     // Catch:{ all -> 0x019e }
            f44 r10 = (defpackage.f44) r10     // Catch:{ all -> 0x019e }
            r1.G0 = r10     // Catch:{ all -> 0x019e }
            j20 r10 = r0.j     // Catch:{ all -> 0x019e }
            r1.h1 = r10     // Catch:{ all -> 0x019e }
            int r10 = r0.k     // Catch:{ all -> 0x019e }
            r1.d1 = r10     // Catch:{ all -> 0x019e }
            r1.j1 = r6     // Catch:{ all -> 0x019e }
            long r12 = r0.o     // Catch:{ all -> 0x019e }
            r1.Q0 = r12     // Catch:{ all -> 0x019e }
            g45 r10 = new g45     // Catch:{ all -> 0x019e }
            r10.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.K0 = r10     // Catch:{ all -> 0x019e }
            i45 r12 = new i45     // Catch:{ all -> 0x019e }
            r12.<init>()     // Catch:{ all -> 0x019e }
            r1.L0 = r12     // Catch:{ all -> 0x019e }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x019e }
            r12.<init>(r9)     // Catch:{ all -> 0x019e }
            p3e r13 = r0.c     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            r14 = r13
            hbe r14 = (hbe) r14     // Catch:{ all -> 0x019e }
            r15 = r12
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            pi0[] r10 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x019e }
            r1.w0 = r10     // Catch:{ all -> 0x019e }
            int r13 = r10.length     // Catch:{ all -> 0x019e }
            if (r13 <= 0) goto L_0x0089
            r13 = r5
            goto L_0x008a
        L_0x0089:
            r13 = r6
        L_0x008a:
            swb.h(r13)     // Catch:{ all -> 0x019e }
            p3e r13 = r0.e     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            du7 r13 = (defpackage.du7) r13     // Catch:{ all -> 0x019e }
            r1.x0 = r13     // Catch:{ all -> 0x019e }
            p3e r13 = r0.d     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            pe8 r13 = (defpackage.pe8) r13     // Catch:{ all -> 0x019e }
            p3e r13 = r0.g     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x019e }
            bf0 r13 = (defpackage.bf0) r13     // Catch:{ all -> 0x019e }
            r1.I0 = r13     // Catch:{ all -> 0x019e }
            boolean r13 = r0.l     // Catch:{ all -> 0x019e }
            r1.F0 = r13     // Catch:{ all -> 0x019e }
            wtc r13 = r0.m     // Catch:{ all -> 0x019e }
            r1.W0 = r13     // Catch:{ all -> 0x019e }
            r1.H0 = r9     // Catch:{ all -> 0x019e }
            r1.J0 = r11     // Catch:{ all -> 0x019e }
            if (r32 != 0) goto L_0x00b9
            r13 = r1
            goto L_0x00bb
        L_0x00b9:
            r13 = r32
        L_0x00bb:
            r1.Z = r13     // Catch:{ all -> 0x019e }
            oz2 r13 = new oz2     // Catch:{ all -> 0x019e }
            z35 r14 = new z35     // Catch:{ all -> 0x019e }
            r14.<init>(r1)     // Catch:{ all -> 0x019e }
            r13.<init>(r9, r11, r14)     // Catch:{ all -> 0x019e }
            r1.B0 = r13     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r9 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.C0 = r9     // Catch:{ all -> 0x019e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.E0 = r9     // Catch:{ all -> 0x019e }
            xed r9 = new xed     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.X0 = r9     // Catch:{ all -> 0x019e }
            ope r9 = new ope     // Catch:{ all -> 0x019e }
            int r11 = r10.length     // Catch:{ all -> 0x019e }
            i9c[] r11 = new defpackage.i9c[r11]     // Catch:{ all -> 0x019e }
            int r10 = r10.length     // Catch:{ all -> 0x019e }
            f55[] r10 = new defpackage.f55[r10]     // Catch:{ all -> 0x019e }
            upe r13 = defpackage.upe.b     // Catch:{ all -> 0x019e }
            r14 = 0
            r9.<init>((defpackage.i9c[]) r11, (defpackage.f55[]) r10, (defpackage.upe) r13, (defpackage.bu7) r14)     // Catch:{ all -> 0x019e }
            r1.c = r9     // Catch:{ all -> 0x019e }
            pje r9 = new pje     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r1.D0 = r9     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            int[] r10 = new int[r4]     // Catch:{ all -> 0x019e }
            r10 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28} // fill-array     // Catch:{ all -> 0x019e }
            r11 = r6
        L_0x0100:
            if (r11 >= r4) goto L_0x010e
            r13 = r10[r11]     // Catch:{ all -> 0x019e }
            r15 = r6 ^ 1
            swb.h(r15)     // Catch:{ all -> 0x019e }
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            int r11 = r11 + r5
            goto L_0x0100
        L_0x010e:
            du7 r10 = r1.x0     // Catch:{ all -> 0x019e }
            r10.getClass()     // Catch:{ all -> 0x019e }
            r10 = r6 ^ 1
            swb.h(r10)     // Catch:{ all -> 0x019e }
            r10 = 29
            r9.append(r10, r5)     // Catch:{ all -> 0x019e }
            dya r11 = new dya     // Catch:{ all -> 0x019e }
            r13 = r6 ^ 1
            swb.h(r13)     // Catch:{ all -> 0x019e }
            vi5 r13 = new vi5     // Catch:{ all -> 0x019e }
            r13.<init>(r9)     // Catch:{ all -> 0x019e }
            r11.<init>(r13)     // Catch:{ all -> 0x019e }
            r1.o = r11     // Catch:{ all -> 0x019e }
            android.util.SparseBooleanArray r9 = new android.util.SparseBooleanArray     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            r11 = r6
        L_0x0134:
            android.util.SparseBooleanArray r15 = r13.a     // Catch:{ all -> 0x019e }
            int r15 = r15.size()     // Catch:{ all -> 0x019e }
            if (r11 >= r15) goto L_0x014a
            int r15 = r13.a(r11)     // Catch:{ all -> 0x019e }
            r16 = r6 ^ 1
            swb.h(r16)     // Catch:{ all -> 0x019e }
            r9.append(r15, r5)     // Catch:{ all -> 0x019e }
            int r11 = r11 + r5
            goto L_0x0134
        L_0x014a:
            r11 = r6 ^ 1
            swb.h(r11)     // Catch:{ all -> 0x019e }
            r11 = 4
            r9.append(r11, r5)     // Catch:{ all -> 0x019e }
            r13 = r6 ^ 1
            swb.h(r13)     // Catch:{ all -> 0x019e }
            r13 = 10
            r9.append(r13, r5)     // Catch:{ all -> 0x019e }
            dya r15 = new dya     // Catch:{ all -> 0x019e }
            r16 = r6 ^ 1
            swb.h(r16)     // Catch:{ all -> 0x019e }
            vi5 r11 = new vi5     // Catch:{ all -> 0x019e }
            r11.<init>(r9)     // Catch:{ all -> 0x019e }
            r15.<init>(r11)     // Catch:{ all -> 0x019e }
            r1.Y0 = r15     // Catch:{ all -> 0x019e }
            y7e r9 = r1.J0     // Catch:{ all -> 0x019e }
            android.os.Looper r11 = r1.H0     // Catch:{ all -> 0x019e }
            g8e r9 = r9.a(r11, r14)     // Catch:{ all -> 0x019e }
            r1.y0 = r9     // Catch:{ all -> 0x019e }
            z35 r9 = new z35     // Catch:{ all -> 0x019e }
            r9.<init>(r1)     // Catch:{ all -> 0x019e }
            r1.z0 = r9     // Catch:{ all -> 0x019e }
            ope r11 = r1.c     // Catch:{ all -> 0x019e }
            txa r11 = defpackage.txa.h(r11)     // Catch:{ all -> 0x019e }
            r1.o1 = r11     // Catch:{ all -> 0x019e }
            f44 r11 = r1.G0     // Catch:{ all -> 0x019e }
            u2 r15 = r1.Z     // Catch:{ all -> 0x019e }
            android.os.Looper r3 = r1.H0     // Catch:{ all -> 0x019e }
            r11.R(r15, r3)     // Catch:{ all -> 0x019e }
            int r3 = defpackage.mze.a     // Catch:{ all -> 0x019e }
            r11 = 31
            if (r3 >= r11) goto L_0x01a1
            bza r11 = new bza     // Catch:{ all -> 0x019e }
            r11.<init>()     // Catch:{ all -> 0x019e }
        L_0x019b:
            r29 = r11
            goto L_0x01a6
        L_0x019e:
            r0 = move-exception
            goto L_0x0350
        L_0x01a1:
            bza r11 = defpackage.e45.a()     // Catch:{ all -> 0x019e }
            goto L_0x019b
        L_0x01a6:
            y45 r11 = new y45     // Catch:{ all -> 0x019e }
            pi0[] r15 = r1.w0     // Catch:{ all -> 0x019e }
            du7 r7 = r1.x0     // Catch:{ all -> 0x019e }
            ope r13 = r1.c     // Catch:{ all -> 0x019e }
            p3e r10 = r0.f     // Catch:{ all -> 0x019e }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x019e }
            r19 = r10
            c94 r19 = (defpackage.c94) r19     // Catch:{ all -> 0x019e }
            bf0 r10 = r1.I0     // Catch:{ all -> 0x019e }
            int r4 = r1.R0     // Catch:{ all -> 0x019e }
            f44 r5 = r1.G0     // Catch:{ all -> 0x019e }
            wtc r14 = r1.W0     // Catch:{ all -> 0x019e }
            a94 r0 = r0.n     // Catch:{ all -> 0x019e }
            android.os.Looper r2 = r1.H0     // Catch:{ all -> 0x019e }
            y7e r6 = r1.J0     // Catch:{ all -> 0x019e }
            r25 = 0
            r16 = r15
            r15 = r11
            r17 = r7
            r18 = r13
            r20 = r10
            r21 = r4
            r22 = r5
            r23 = r14
            r24 = r0
            r26 = r2
            r27 = r6
            r28 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x019e }
            r1.A0 = r11     // Catch:{ all -> 0x019e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.i1 = r0     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.R0 = r0     // Catch:{ all -> 0x019e }
            y78 r0 = defpackage.y78.W0     // Catch:{ all -> 0x019e }
            r1.Z0 = r0     // Catch:{ all -> 0x019e }
            r1.n1 = r0     // Catch:{ all -> 0x019e }
            r0 = -1
            r1.p1 = r0     // Catch:{ all -> 0x019e }
            r2 = 21
            if (r3 >= r2) goto L_0x022c
            android.media.AudioTrack r0 = r1.a1     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x020a
            android.media.AudioTrack r0 = r1.a1     // Catch:{ all -> 0x019e }
            r0.release()     // Catch:{ all -> 0x019e }
            r0 = 0
            r1.a1 = r0     // Catch:{ all -> 0x019e }
        L_0x020a:
            android.media.AudioTrack r0 = r1.a1     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x0223
            android.media.AudioTrack r0 = new android.media.AudioTrack     // Catch:{ all -> 0x019e }
            r15 = 4000(0xfa0, float:5.605E-42)
            r16 = 4
            r17 = 2
            r18 = 2
            r20 = 0
            r14 = 3
            r19 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x019e }
            r1.a1 = r0     // Catch:{ all -> 0x019e }
        L_0x0223:
            android.media.AudioTrack r0 = r1.a1     // Catch:{ all -> 0x019e }
            int r0 = r0.getAudioSessionId()     // Catch:{ all -> 0x019e }
            r1.g1 = r0     // Catch:{ all -> 0x019e }
            goto L_0x023f
        L_0x022c:
            android.content.Context r2 = r1.Y     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x019e }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x0239
            goto L_0x023d
        L_0x0239:
            int r0 = r2.generateAudioSessionId()     // Catch:{ all -> 0x019e }
        L_0x023d:
            r1.g1 = r0     // Catch:{ all -> 0x019e }
        L_0x023f:
            e8c r0 = defpackage.e8c.X     // Catch:{ all -> 0x019e }
            r0 = 1
            r1.k1 = r0     // Catch:{ all -> 0x019e }
            f44 r0 = r1.G0     // Catch:{ all -> 0x019e }
            r0.getClass()     // Catch:{ all -> 0x019e }
            oz2 r2 = r1.B0     // Catch:{ all -> 0x019e }
            r2.getClass()     // Catch:{ all -> 0x019e }
            oh7 r3 = new oh7     // Catch:{ all -> 0x019e }
            r3.<init>(r0)     // Catch:{ all -> 0x019e }
            java.lang.Object r0 = r2.d     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch:{ all -> 0x019e }
            r0.add(r3)     // Catch:{ all -> 0x019e }
            bf0 r0 = r1.I0     // Catch:{ all -> 0x019e }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x019e }
            android.os.Looper r3 = r1.H0     // Catch:{ all -> 0x019e }
            r2.<init>(r3)     // Catch:{ all -> 0x019e }
            f44 r3 = r1.G0     // Catch:{ all -> 0x019e }
            f54 r0 = (defpackage.f54) r0     // Catch:{ all -> 0x019e }
            r0.b(r3, r2)     // Catch:{ all -> 0x019e }
            g45 r0 = r1.K0     // Catch:{ all -> 0x019e }
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.C0     // Catch:{ all -> 0x019e }
            r2.add(r0)     // Catch:{ all -> 0x019e }
            ud r0 = new ud     // Catch:{ all -> 0x019e }
            g45 r2 = r1.K0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.g45) r2)     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.o     // Catch:{ all -> 0x019e }
            n20 r2 = (defpackage.n20) r2     // Catch:{ all -> 0x019e }
            java.lang.Object r3 = r0.c     // Catch:{ all -> 0x019e }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x019e }
            boolean r4 = r0.b     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x028a
            r3.unregisterReceiver(r2)     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.b = r2     // Catch:{ all -> 0x019e }
        L_0x028a:
            p30 r0 = new p30     // Catch:{ all -> 0x019e }
            g45 r2 = r1.K0     // Catch:{ all -> 0x019e }
            r0.<init>((android.content.Context) r8, (android.os.Handler) r12, (defpackage.g45) r2)     // Catch:{ all -> 0x019e }
            r1.M0 = r0     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r0.i     // Catch:{ all -> 0x019e }
            j20 r2 = (defpackage.j20) r2     // Catch:{ all -> 0x019e }
            r3 = 0
            boolean r2 = defpackage.mze.a(r2, r3)     // Catch:{ all -> 0x019e }
            if (r2 != 0) goto L_0x02a3
            r0.i = r3     // Catch:{ all -> 0x019e }
            r2 = 0
            r0.d = r2     // Catch:{ all -> 0x019e }
        L_0x02a3:
            qzd r0 = new qzd     // Catch:{ all -> 0x019e }
            g45 r2 = r1.K0     // Catch:{ all -> 0x019e }
            r0.<init>(r8, r12, r2)     // Catch:{ all -> 0x019e }
            r1.N0 = r0     // Catch:{ all -> 0x019e }
            j20 r2 = r1.h1     // Catch:{ all -> 0x019e }
            int r2 = r2.c     // Catch:{ all -> 0x019e }
            int r2 = defpackage.mze.x(r2)     // Catch:{ all -> 0x019e }
            int r3 = r0.d     // Catch:{ all -> 0x019e }
            if (r3 != r2) goto L_0x02b9
            goto L_0x02e0
        L_0x02b9:
            r0.d = r2     // Catch:{ all -> 0x019e }
            r0.b()     // Catch:{ all -> 0x019e }
            g45 r2 = r0.b     // Catch:{ all -> 0x019e }
            m45 r2 = r2.a     // Catch:{ all -> 0x019e }
            qzd r3 = r2.N0     // Catch:{ all -> 0x019e }
            sf4 r3 = a2(r3)     // Catch:{ all -> 0x019e }
            sf4 r4 = r2.m1     // Catch:{ all -> 0x019e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x019e }
            if (r4 != 0) goto L_0x02e0
            r2.m1 = r3     // Catch:{ all -> 0x019e }
            r34 r4 = new r34     // Catch:{ all -> 0x019e }
            r5 = 20
            r4.<init>((int) r5, (java.lang.Object) r3)     // Catch:{ all -> 0x019e }
            oz2 r2 = r2.B0     // Catch:{ all -> 0x019e }
            r3 = 29
            r2.m(r3, r4)     // Catch:{ all -> 0x019e }
        L_0x02e0:
            om3 r2 = new om3     // Catch:{ all -> 0x019e }
            r2.<init>()     // Catch:{ all -> 0x019e }
            android.content.Context r3 = r8.getApplicationContext()     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "power"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x019e }
            android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch:{ all -> 0x019e }
            r1.O0 = r2     // Catch:{ all -> 0x019e }
            gk9 r2 = new gk9     // Catch:{ all -> 0x019e }
            r2.<init>((android.content.Context) r8)     // Catch:{ all -> 0x019e }
            r1.P0 = r2     // Catch:{ all -> 0x019e }
            sf4 r0 = a2(r0)     // Catch:{ all -> 0x019e }
            r1.m1 = r0     // Catch:{ all -> 0x019e }
            int r0 = r1.g1     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 10
            r3 = 1
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.g1     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r4 = 2
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            j20 r0 = r1.h1     // Catch:{ all -> 0x019e }
            r2 = 3
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            int r0 = r1.d1     // Catch:{ all -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 4
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 5
            r1.k2(r4, r2, r0)     // Catch:{ all -> 0x019e }
            boolean r0 = r1.j1     // Catch:{ all -> 0x019e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x019e }
            r2 = 9
            r3 = 1
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            i45 r0 = r1.L0     // Catch:{ all -> 0x019e }
            r2 = 7
            r3 = 2
            r1.k2(r3, r2, r0)     // Catch:{ all -> 0x019e }
            i45 r0 = r1.L0     // Catch:{ all -> 0x019e }
            r2 = 6
            r3 = 8
            r1.k2(r2, r3, r0)     // Catch:{ all -> 0x019e }
            ga3 r0 = r1.X
            r0.g()
            return
        L_0x0350:
            ga3 r1 = r1.X
            r1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m45.<init>(p35, u2):void");
    }

    public static sf4 a2(qzd qzd) {
        qzd.getClass();
        int i = mze.a;
        AudioManager audioManager = qzd.c;
        return new sf4(0, i >= 28 ? audioManager.getStreamMinVolume(qzd.d) : 0, audioManager.getStreamMaxVolume(qzd.d));
    }

    public static long e2(txa txa) {
        sje sje = new sje();
        pje pje = new pje();
        txa.a.h(txa.b.a, pje);
        long j = txa.c;
        if (j != -9223372036854775807L) {
            return pje.X + j;
        }
        return txa.a.n(pje.c, sje, 0).B0;
    }

    public static boolean f2(txa txa) {
        return txa.e == 3 && txa.l && txa.m == 0;
    }

    public final int B() {
        s2();
        if (this.o1.a.q()) {
            return 0;
        }
        txa txa = this.o1;
        return txa.a.b(txa.b.a);
    }

    public final int O() {
        s2();
        if (n()) {
            return this.o1.b.c;
        }
        return -1;
    }

    public final uje O1() {
        s2();
        return this.o1.a;
    }

    public final void Q1() {
        s2();
    }

    public final y78 Z1() {
        uje O1 = O1();
        if (O1.q()) {
            return this.n1;
        }
        j68 j68 = O1.n(p0(), (sje) this.b, 0).c;
        w78 a = this.n1.a();
        y78 y78 = j68.o;
        if (y78 != null) {
            CharSequence charSequence = y78.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = y78.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = y78.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = y78.o;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = y78.X;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = y78.Y;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = y78.Z;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Uri uri = y78.w0;
            if (uri != null) {
                a.h = uri;
            }
            zxb zxb = y78.x0;
            if (zxb != null) {
                a.i = zxb;
            }
            zxb zxb2 = y78.y0;
            if (zxb2 != null) {
                a.j = zxb2;
            }
            byte[] bArr = y78.z0;
            if (bArr != null) {
                a.k = (byte[]) bArr.clone();
                a.l = y78.A0;
            }
            Uri uri2 = y78.B0;
            if (uri2 != null) {
                a.m = uri2;
            }
            Integer num = y78.C0;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = y78.D0;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = y78.E0;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = y78.F0;
            if (bool != null) {
                a.q = bool;
            }
            Integer num4 = y78.G0;
            if (num4 != null) {
                a.r = num4;
            }
            Integer num5 = y78.H0;
            if (num5 != null) {
                a.r = num5;
            }
            Integer num6 = y78.I0;
            if (num6 != null) {
                a.s = num6;
            }
            Integer num7 = y78.J0;
            if (num7 != null) {
                a.t = num7;
            }
            Integer num8 = y78.K0;
            if (num8 != null) {
                a.u = num8;
            }
            Integer num9 = y78.L0;
            if (num9 != null) {
                a.v = num9;
            }
            Integer num10 = y78.M0;
            if (num10 != null) {
                a.w = num10;
            }
            CharSequence charSequence8 = y78.N0;
            if (charSequence8 != null) {
                a.x = charSequence8;
            }
            CharSequence charSequence9 = y78.O0;
            if (charSequence9 != null) {
                a.y = charSequence9;
            }
            CharSequence charSequence10 = y78.P0;
            if (charSequence10 != null) {
                a.z = charSequence10;
            }
            Integer num11 = y78.Q0;
            if (num11 != null) {
                a.A = num11;
            }
            Integer num12 = y78.R0;
            if (num12 != null) {
                a.B = num12;
            }
            CharSequence charSequence11 = y78.S0;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            CharSequence charSequence12 = y78.T0;
            if (charSequence12 != null) {
                a.D = charSequence12;
            }
            CharSequence charSequence13 = y78.U0;
            if (charSequence13 != null) {
                a.E = charSequence13;
            }
            Bundle bundle = y78.V0;
            if (bundle != null) {
                a.F = bundle;
            }
        }
        return new y78(a);
    }

    public final long b0() {
        s2();
        if (!n()) {
            return k();
        }
        txa txa = this.o1;
        uje uje = txa.a;
        Object obj = txa.b.a;
        pje pje = this.D0;
        uje.h(obj, pje);
        txa txa2 = this.o1;
        return txa2.c == -9223372036854775807L ? mze.M(txa2.a.n(p0(), (sje) this.b, 0).B0) : mze.M(pje.X) + mze.M(this.o1.c);
    }

    public final kza b2(iza iza) {
        int d2 = d2();
        uje uje = this.o1.a;
        if (d2 == -1) {
            d2 = 0;
        }
        y45 y45 = this.A0;
        return new kza(y45, iza, uje, d2, this.J0, y45.y0);
    }

    public final long c() {
        s2();
        if (n()) {
            txa txa = this.o1;
            re8 re8 = txa.b;
            uje uje = txa.a;
            Object obj = re8.a;
            pje pje = this.D0;
            uje.h(obj, pje);
            return mze.M(pje.a(re8.b, re8.c));
        }
        uje O1 = O1();
        if (O1.q()) {
            return -9223372036854775807L;
        }
        return mze.M(O1.n(p0(), (sje) this.b, 0).C0);
    }

    public final long c2(txa txa) {
        if (txa.a.q()) {
            return mze.D(this.q1);
        }
        if (txa.b.a()) {
            return txa.s;
        }
        uje uje = txa.a;
        re8 re8 = txa.b;
        long j = txa.s;
        Object obj = re8.a;
        pje pje = this.D0;
        uje.h(obj, pje);
        return j + pje.X;
    }

    public final int d2() {
        if (this.o1.a.q()) {
            return this.p1;
        }
        txa txa = this.o1;
        return txa.a.h(txa.b.a, this.D0).c;
    }

    public final txa g2(txa txa, uje uje, Pair pair) {
        List list;
        int i;
        uje uje2 = uje;
        Pair pair2 = pair;
        swb.e(uje.q() || pair2 != null);
        uje uje3 = txa.a;
        txa g = txa.g(uje);
        if (uje.q()) {
            re8 re8 = txa.t;
            long D = mze.D(this.q1);
            txa a = g.b(re8, D, D, D, 0, voe.o, this.c, e8c.X).a(re8);
            a.q = a.s;
            return a;
        }
        Object obj = g.b.a;
        int i2 = mze.a;
        boolean z = !obj.equals(pair2.first);
        re8 re82 = z ? new re8(pair2.first) : g.b;
        long longValue = ((Long) pair2.second).longValue();
        long D2 = mze.D(b0());
        if (!uje3.q()) {
            D2 -= uje3.h(obj, this.D0).X;
        }
        if (z || longValue < D2) {
            re8 re83 = re82;
            swb.h(!re83.a());
            voe voe = z ? voe.o : g.h;
            ope ope = z ? this.c : g.i;
            if (z) {
                po5 po5 = ws6.b;
                list = e8c.X;
            } else {
                list = g.j;
            }
            txa a2 = g.b(re83, longValue, longValue, longValue, 0, voe, ope, list).a(re83);
            a2.q = longValue;
            return a2;
        } else if (i == 0) {
            int b = uje2.b(g.k.a);
            if (b != -1 && uje2.g(b, this.D0, false).c == uje2.h(re82.a, this.D0).c) {
                return g;
            }
            uje2.h(re82.a, this.D0);
            long a3 = re82.a() ? this.D0.a(re82.b, re82.c) : this.D0.o;
            txa a4 = g.b(re82, g.s, g.s, g.d, a3 - g.s, g.h, g.i, g.j).a(re82);
            a4.q = a3;
            return a4;
        } else {
            re8 re84 = re82;
            swb.h(!re84.a());
            long max = Math.max(0, g.r - (longValue - D2));
            long j = g.q;
            if (g.k.equals(g.b)) {
                j = longValue + max;
            }
            txa b2 = g.b(re84, longValue, longValue, longValue, max, g.h, g.i, g.j);
            b2.q = j;
            return b2;
        }
    }

    public final int getRepeatMode() {
        s2();
        return this.R0;
    }

    public final Pair h2(uje uje, int i, long j) {
        if (uje.q()) {
            this.p1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.q1 = j;
            return null;
        }
        if (i == -1 || i >= uje.p()) {
            i = uje.a(false);
            j = mze.M(uje.n(i, (sje) this.b, 0).B0);
        }
        return uje.j((sje) this.b, this.D0, i, mze.D(j));
    }

    public final void i2(int i, int i2) {
        if (i != this.e1 || i2 != this.f1) {
            this.e1 = i;
            this.f1 = i2;
            this.B0.m(24, new a45(i, i2, 1));
        }
    }

    public final void j2(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.E0.remove(i2);
        }
        xed xed = this.X0;
        int[] iArr = xed.b;
        int[] iArr2 = new int[(iArr.length - i)];
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        this.X0 = new xed(iArr2, new Random(xed.a.nextLong()));
    }

    public final long k() {
        s2();
        return mze.M(c2(this.o1));
    }

    public final void k2(int i, int i2, Object obj) {
        for (pi0 pi0 : this.w0) {
            if (pi0.a == i) {
                kza b2 = b2(pi0);
                swb.h(!b2.g);
                b2.d = i2;
                swb.h(!b2.g);
                b2.e = obj;
                b2.c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l2(java.util.List r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r16
            int r2 = r14.d2()
            long r3 = r14.k()
            int r5 = r0.S0
            r6 = 1
            int r5 = r5 + r6
            r0.S0 = r5
            java.util.ArrayList r5 = r0.E0
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0020
            int r7 = r5.size()
            r14.j2(r7)
        L_0x0020:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7 = 0
            r8 = r7
        L_0x0027:
            int r10 = r15.size()
            if (r8 >= r10) goto L_0x004f
            mf8 r10 = new mf8
            r11 = r15
            java.lang.Object r12 = r15.get(r8)
            yh0 r12 = (defpackage.yh0) r12
            boolean r13 = r0.F0
            r10.<init>(r12, r13)
            r9.add(r10)
            k45 r12 = new k45
            java.lang.Object r13 = r10.b
            lv7 r10 = r10.a
            hv7 r10 = r10.o
            r12.<init>(r13, r10)
            r5.add(r8, r12)
            int r8 = r8 + 1
            goto L_0x0027
        L_0x004f:
            xed r8 = r0.X0
            int r10 = r9.size()
            xed r8 = r8.a(r10)
            r0.X0 = r8
            tza r10 = new tza
            r10.<init>(r5, r8)
            boolean r5 = r10.q()
            int r8 = r10.o
            if (r5 != 0) goto L_0x0071
            if (r1 >= r8) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            com.google.android.exoplayer2.IllegalSeekPositionException r0 = new com.google.android.exoplayer2.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0071:
            r5 = -1
            if (r19 == 0) goto L_0x007f
            int r1 = r10.a(r7)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x007d:
            r11 = r1
            goto L_0x0087
        L_0x007f:
            if (r1 != r5) goto L_0x0084
            r11 = r2
            r2 = r3
            goto L_0x0087
        L_0x0084:
            r2 = r17
            goto L_0x007d
        L_0x0087:
            txa r1 = r0.o1
            android.util.Pair r4 = r14.h2(r10, r11, r2)
            txa r1 = r14.g2(r1, r10, r4)
            int r4 = r1.e
            if (r11 == r5) goto L_0x00a3
            if (r4 == r6) goto L_0x00a3
            boolean r4 = r10.q()
            if (r4 != 0) goto L_0x00a2
            if (r11 < r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r4 = 2
            goto L_0x00a3
        L_0x00a2:
            r4 = 4
        L_0x00a3:
            txa r1 = r1.f(r4)
            long r12 = defpackage.mze.D(r2)
            xed r10 = r0.X0
            y45 r2 = r0.A0
            g8e r2 = r2.w0
            q45 r3 = new q45
            r8 = r3
            r8.<init>(r9, r10, r11, r12)
            r4 = 17
            e8e r2 = r2.a(r4, r3)
            r2.b()
            txa r2 = r0.o1
            re8 r2 = r2.b
            java.lang.Object r2 = r2.a
            re8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00dc
            txa r2 = r0.o1
            uje r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00dc
            r5 = r6
            goto L_0x00dd
        L_0x00dc:
            r5 = r7
        L_0x00dd:
            long r7 = r14.c2(r1)
            r4 = 0
            r6 = 4
            r2 = 0
            r3 = 1
            r9 = -1
            r0 = r14
            r0.q2(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m45.l2(java.util.List, int, long, boolean):void");
    }

    public final void m2(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (pi0 pi0 : this.w0) {
            if (pi0.a == 2) {
                kza b2 = b2(pi0);
                swb.h(!b2.g);
                b2.d = 1;
                swb.h(true ^ b2.g);
                b2.e = surface;
                b2.c();
                arrayList.add(b2);
            }
        }
        Object obj = this.b1;
        if (!(obj == null || obj == surface)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((kza) it.next()).a(this.Q0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.b1;
            Surface surface2 = this.c1;
            if (obj2 == surface2) {
                surface2.release();
                this.c1 = null;
            }
        }
        this.b1 = surface;
        if (z) {
            n2(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final boolean n() {
        s2();
        return this.o1.b.a();
    }

    public final void n2(ExoPlaybackException exoPlaybackException) {
        txa txa = this.o1;
        txa a = txa.a(txa.b);
        a.q = a.s;
        a.r = 0;
        boolean z = true;
        txa f = a.f(1);
        if (exoPlaybackException != null) {
            f = f.e(exoPlaybackException);
        }
        txa txa2 = f;
        this.S0++;
        g8e g8e = this.A0.w0;
        g8e.getClass();
        e8e b = g8e.b();
        b.a = g8e.a.obtainMessage(6);
        b.b();
        if (!txa2.a.q() || this.o1.a.q()) {
            z = false;
        }
        q2(txa2, 0, 1, false, z, 4, c2(txa2), -1);
    }

    public final int o0() {
        s2();
        if (n()) {
            return this.o1.b.b;
        }
        return -1;
    }

    public final void o2() {
        int i;
        int i2;
        boolean z = true;
        dya dya = this.Y0;
        int i3 = mze.a;
        u2 u2Var = this.Z;
        boolean n = u2Var.n();
        uje O1 = u2Var.O1();
        boolean q = O1.q();
        sje sje = (sje) u2Var.b;
        boolean z2 = !q && O1.n(u2Var.p0(), sje, 0).w0;
        uje O12 = u2Var.O1();
        if (O12.q()) {
            i = -1;
        } else {
            int p0 = u2Var.p0();
            int repeatMode = u2Var.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            u2Var.Q1();
            i = O12.l(p0, repeatMode, false);
        }
        boolean z3 = i != -1;
        uje O13 = u2Var.O1();
        if (O13.q()) {
            i2 = -1;
        } else {
            int p02 = u2Var.p0();
            int repeatMode2 = u2Var.getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            u2Var.Q1();
            i2 = O13.e(p02, repeatMode2, false);
        }
        boolean z4 = i2 != -1;
        uje O14 = u2Var.O1();
        boolean z5 = !O14.q() && O14.n(u2Var.p0(), sje, 0).a();
        uje O15 = u2Var.O1();
        boolean z6 = !O15.q() && O15.n(u2Var.p0(), sje, 0).x0;
        boolean q2 = u2Var.O1().q();
        c9 c9Var = new c9(19);
        vi5 vi5 = this.o.a;
        ui5 ui5 = (ui5) c9Var.b;
        ui5.getClass();
        for (int i4 = 0; i4 < vi5.a.size(); i4++) {
            ui5.a(vi5.a(i4));
        }
        boolean z7 = !n;
        c9Var.g(4, z7);
        c9Var.g(5, z2 && !n);
        c9Var.g(6, z3 && !n);
        c9Var.g(7, !q2 && (z3 || !z5 || z2) && !n);
        c9Var.g(8, z4 && !n);
        c9Var.g(9, !q2 && (z4 || (z5 && z6)) && !n);
        c9Var.g(10, z7);
        c9Var.g(11, z2 && !n);
        if (!z2 || n) {
            z = false;
        }
        c9Var.g(12, z);
        dya dya2 = new dya(ui5.d());
        this.Y0 = dya2;
        if (!dya2.equals(dya)) {
            this.B0.l(13, new z35(this));
        }
    }

    public final int p0() {
        s2();
        int d2 = d2();
        if (d2 == -1) {
            return 0;
        }
        return d2;
    }

    public final void p2(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        txa txa = this.o1;
        if (txa.l != z2 || txa.m != i3) {
            this.S0++;
            txa d = txa.d(i3, z2);
            g8e g8e = this.A0.w0;
            g8e.getClass();
            e8e b = g8e.b();
            b.a = g8e.a.obtainMessage(1, z2 ? 1 : 0, i3);
            b.b();
            q2(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final long q() {
        s2();
        return mze.M(this.o1.r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0290  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q2(defpackage.txa r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            txa r3 = r0.o1
            r0.o1 = r1
            uje r4 = r3.a
            uje r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            uje r6 = r3.a
            uje r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto L_0x00ba
        L_0x0035:
            boolean r8 = r7.q()
            boolean r12 = r6.q()
            if (r8 == r12) goto L_0x004c
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00ba
        L_0x004c:
            re8 r8 = r3.b
            java.lang.Object r12 = r8.a
            pje r11 = r0.D0
            pje r12 = r6.h(r12, r11)
            int r12 = r12.c
            java.lang.Object r9 = r0.b
            sje r9 = (defpackage.sje) r9
            sje r6 = r6.n(r12, r9, r13)
            java.lang.Object r6 = r6.a
            re8 r12 = r1.b
            java.lang.Object r15 = r12.a
            pje r11 = r7.h(r15, r11)
            int r11 = r11.c
            sje r7 = r7.n(r11, r9, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r45 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r4 = r5
            goto L_0x0087
        L_0x007e:
            if (r45 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r4 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r4 = 3
        L_0x0087:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00ba
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r45 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r12.d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.<init>(r6, r8)
            goto L_0x00ba
        L_0x00b3:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        L_0x00ba:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            y78 r7 = r0.Z0
            if (r6 == 0) goto L_0x00f7
            uje r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x00f1
            uje r9 = r1.a
            re8 r10 = r1.b
            java.lang.Object r10 = r10.a
            pje r11 = r0.D0
            pje r9 = r9.h(r10, r11)
            int r9 = r9.c
            uje r10 = r1.a
            java.lang.Object r11 = r0.b
            sje r11 = (defpackage.sje) r11
            sje r9 = r10.n(r9, r11, r13)
            j68 r9 = r9.c
            goto L_0x00f2
        L_0x00f1:
            r9 = 0
        L_0x00f2:
            y78 r10 = defpackage.y78.W0
            r0.n1 = r10
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            if (r6 != 0) goto L_0x0104
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0139
        L_0x0104:
            y78 r7 = r0.n1
            w78 r7 = r7.a()
            java.util.List r10 = r1.j
            r11 = 0
        L_0x010d:
            int r12 = r10.size()
            if (r11 >= r12) goto L_0x012e
            java.lang.Object r12 = r10.get(r11)
            y29 r12 = (defpackage.y29) r12
            r15 = 0
        L_0x011a:
            w29[] r8 = r12.a
            int r13 = r8.length
            if (r15 >= r13) goto L_0x0129
            r8 = r8[r15]
            r8.p(r7)
            int r15 = r15 + 1
            r13 = 0
            goto L_0x011a
        L_0x0129:
            int r11 = r11 + 1
            r13 = 0
            goto L_0x010d
        L_0x012e:
            y78 r8 = new y78
            r8.<init>(r7)
            r0.n1 = r8
            y78 r7 = r40.Z1()
        L_0x0139:
            y78 r8 = r0.Z0
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.Z0 = r7
            boolean r7 = r3.l
            boolean r10 = r1.l
            if (r7 == r10) goto L_0x014a
            r7 = r5
            goto L_0x014b
        L_0x014a:
            r7 = 0
        L_0x014b:
            int r10 = r3.e
            int r11 = r1.e
            if (r10 == r11) goto L_0x0153
            r10 = r5
            goto L_0x0154
        L_0x0153:
            r10 = 0
        L_0x0154:
            if (r10 != 0) goto L_0x0158
            if (r7 == 0) goto L_0x015b
        L_0x0158:
            r40.r2()
        L_0x015b:
            boolean r11 = r3.g
            boolean r12 = r1.g
            if (r11 == r12) goto L_0x0163
            r11 = r5
            goto L_0x0164
        L_0x0163:
            r11 = 0
        L_0x0164:
            uje r12 = r3.a
            uje r13 = r1.a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x017c
            oz2 r12 = r0.B0
            x35 r13 = new x35
            r14 = 0
            r15 = r42
            r13.<init>(r1, r15, r14)
            r14 = 0
            r12.l(r14, r13)
        L_0x017c:
            if (r45 == 0) goto L_0x02b3
            pje r12 = new pje
            r12.<init>()
            uje r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c1
            re8 r13 = r3.b
            java.lang.Object r13 = r13.a
            uje r14 = r3.a
            r14.h(r13, r12)
            int r14 = r12.c
            uje r15 = r3.a
            int r15 = r15.b(r13)
            uje r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.b
            sje r13 = (defpackage.sje) r13
            r16 = r10
            r17 = r11
            r10 = 0
            sje r5 = r5.n(r14, r13, r10)
            java.lang.Object r5 = r5.a
            java.lang.Object r10 = r0.b
            sje r10 = (defpackage.sje) r10
            j68 r10 = r10.c
            r22 = r42
            r19 = r5
            r21 = r10
            r20 = r14
            r23 = r15
            goto L_0x01cf
        L_0x01c1:
            r16 = r10
            r17 = r11
            r20 = r49
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01cf:
            if (r2 != 0) goto L_0x01fd
            re8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x01e8
            re8 r5 = r3.b
            int r10 = r5.b
            int r5 = r5.c
            long r10 = r12.a(r10, r5)
            long r12 = e2(r3)
            goto L_0x0211
        L_0x01e8:
            re8 r5 = r3.b
            int r5 = r5.e
            r10 = -1
            if (r5 == r10) goto L_0x01f7
            txa r5 = r0.o1
            long r10 = e2(r5)
        L_0x01f5:
            r12 = r10
            goto L_0x0211
        L_0x01f7:
            long r10 = r12.X
            long r12 = r12.o
        L_0x01fb:
            long r10 = r10 + r12
            goto L_0x01f5
        L_0x01fd:
            re8 r5 = r3.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x020c
            long r10 = r3.s
            long r12 = e2(r3)
            goto L_0x0211
        L_0x020c:
            long r10 = r12.X
            long r12 = r3.s
            goto L_0x01fb
        L_0x0211:
            iya r5 = new iya
            long r24 = defpackage.mze.M(r10)
            long r26 = defpackage.mze.M(r12)
            re8 r10 = r3.b
            int r11 = r10.b
            int r10 = r10.c
            r18 = r5
            r28 = r11
            r29 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r10 = r40.p0()
            txa r11 = r0.o1
            uje r11 = r11.a
            boolean r11 = r11.q()
            if (r11 != 0) goto L_0x026b
            txa r11 = r0.o1
            re8 r12 = r11.b
            java.lang.Object r12 = r12.a
            uje r11 = r11.a
            pje r13 = r0.D0
            r11.h(r12, r13)
            txa r11 = r0.o1
            uje r11 = r11.a
            int r11 = r11.b(r12)
            txa r13 = r0.o1
            uje r13 = r13.a
            java.lang.Object r14 = r0.b
            sje r14 = (defpackage.sje) r14
            r42 = r11
            r15 = r12
            r11 = 0
            sje r11 = r13.n(r10, r14, r11)
            java.lang.Object r11 = r11.a
            j68 r12 = r14.c
            r33 = r42
            r29 = r11
            r31 = r12
            r32 = r15
            goto L_0x0273
        L_0x026b:
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x0273:
            long r34 = defpackage.mze.M(r47)
            iya r11 = new iya
            txa r12 = r0.o1
            re8 r12 = r12.b
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0290
            txa r12 = r0.o1
            long r12 = e2(r12)
            long r12 = defpackage.mze.M(r12)
            r36 = r12
            goto L_0x0292
        L_0x0290:
            r36 = r34
        L_0x0292:
            txa r12 = r0.o1
            re8 r12 = r12.b
            int r13 = r12.b
            int r12 = r12.c
            r28 = r11
            r30 = r10
            r38 = r13
            r39 = r12
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            oz2 r10 = r0.B0
            ph0 r12 = new ph0
            r13 = 5
            r12.<init>(r2, r5, r11, r13)
            r2 = 11
            r10.l(r2, r12)
            goto L_0x02b7
        L_0x02b3:
            r16 = r10
            r17 = r11
        L_0x02b7:
            if (r6 == 0) goto L_0x02c5
            oz2 r2 = r0.B0
            hc0 r5 = new hc0
            r6 = 5
            r5.<init>(r4, r6, r9)
            r4 = 1
            r2.l(r4, r5)
        L_0x02c5:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r3.f
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02e7
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.l(r5, r4)
            com.google.android.exoplayer2.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02e7
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r6 = 1
            r4.<init>(r1, r6)
            r2.l(r5, r4)
        L_0x02e7:
            ope r2 = r3.i
            ope r4 = r1.i
            if (r2 == r4) goto L_0x031b
            du7 r2 = r0.x0
            java.lang.Object r4 = r4.c
            r2.getClass()
            bu7 r4 = (defpackage.bu7) r4
            r2.c = r4
            epe r2 = new epe
            ope r4 = r1.i
            java.lang.Object r4 = r4.X
            f55[] r4 = (defpackage.f55[]) r4
            r2.<init>(r4)
            oz2 r4 = r0.B0
            e44 r5 = new e44
            r6 = 10
            r5.<init>(r1, r6, r2)
            r2 = 2
            r4.l(r2, r5)
            oz2 r4 = r0.B0
            v35 r5 = new v35
            r6 = 2
            r5.<init>(r1, r6)
            r4.l(r2, r5)
        L_0x031b:
            if (r8 == 0) goto L_0x032d
            y78 r2 = r0.Z0
            oz2 r4 = r0.B0
            r34 r5 = new r34
            r6 = 14
            r5.<init>((int) r6, (java.lang.Object) r2)
            r2 = 14
            r4.l(r2, r5)
        L_0x032d:
            if (r17 == 0) goto L_0x033b
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.l(r5, r4)
        L_0x033b:
            if (r16 != 0) goto L_0x033f
            if (r7 == 0) goto L_0x034b
        L_0x033f:
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.l(r5, r4)
        L_0x034b:
            if (r16 == 0) goto L_0x0359
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.l(r5, r4)
        L_0x0359:
            if (r7 == 0) goto L_0x0369
            oz2 r2 = r0.B0
            x35 r4 = new x35
            r5 = 1
            r6 = r43
            r4.<init>(r1, r6, r5)
            r5 = 5
            r2.l(r5, r4)
        L_0x0369:
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x037a
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 6
            r4.<init>(r1, r5)
            r2.l(r5, r4)
        L_0x037a:
            boolean r2 = f2(r3)
            boolean r4 = f2(r41)
            if (r2 == r4) goto L_0x038f
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 7
            r4.<init>(r1, r5)
            r2.l(r5, r4)
        L_0x038f:
            vxa r2 = r3.n
            vxa r4 = r1.n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a7
            oz2 r2 = r0.B0
            v35 r4 = new v35
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 12
            r2.l(r5, r4)
        L_0x03a7:
            if (r44 == 0) goto L_0x03b6
            oz2 r2 = r0.B0
            i74 r4 = new i74
            r5 = 19
            r4.<init>(r5)
            r5 = -1
            r2.l(r5, r4)
        L_0x03b6:
            r40.o2()
            oz2 r2 = r0.B0
            r2.h()
            boolean r2 = r3.o
            boolean r4 = r1.o
            if (r2 == r4) goto L_0x03da
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.C0
            java.util.Iterator r2 = r2.iterator()
        L_0x03ca:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03da
            java.lang.Object r4 = r2.next()
            g45 r4 = (defpackage.g45) r4
            r4.getClass()
            goto L_0x03ca
        L_0x03da:
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03f8
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.C0
            java.util.Iterator r0 = r0.iterator()
        L_0x03e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03f8
            java.lang.Object r1 = r0.next()
            g45 r1 = (defpackage.g45) r1
            m45 r1 = r1.a
            r1.r2()
            goto L_0x03e6
        L_0x03f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m45.q2(txa, int, int, boolean, boolean, int, long, int):void");
    }

    public final void r(int i, long j) {
        s2();
        f44 f44 = this.G0;
        int i2 = 1;
        if (!f44.w0) {
            fd a = f44.a();
            f44.w0 = true;
            f44.Q(a, -1, new no3(22));
        }
        uje uje = this.o1.a;
        if (i < 0 || (!uje.q() && i >= uje.p())) {
            throw new IllegalStateException();
        }
        this.S0++;
        if (n()) {
            t45 t45 = new t45(this.o1);
            t45.a(1);
            m45 m45 = this.z0.a;
            m45.y0.a.post(new ii4(m45, 19, t45));
            return;
        }
        s2();
        if (this.o1.e != 1) {
            i2 = 2;
        }
        int p0 = p0();
        txa g2 = g2(this.o1.f(i2), uje, h2(uje, i, j));
        this.A0.w0.a(3, new w45(uje, i, mze.D(j))).b();
        q2(g2, 0, 1, true, true, 1, c2(g2), p0);
    }

    public final void r2() {
        s2();
        int i = this.o1.e;
        gk9 gk9 = this.P0;
        om3 om3 = this.O0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                s2();
                boolean z = this.o1.p;
                boolean u = u();
                om3.getClass();
                u();
                gk9.getClass();
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        om3.getClass();
        gk9.getClass();
    }

    public final void s2() {
        this.X.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.H0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = mze.a;
            Locale locale = Locale.US;
            String i2 = c3d.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.k1) {
                oyb.b(i2, this.l1 ? null : new IllegalStateException());
                this.l1 = true;
                return;
            }
            throw new IllegalStateException(i2);
        }
    }

    public final boolean u() {
        s2();
        return this.o1.l;
    }
}
