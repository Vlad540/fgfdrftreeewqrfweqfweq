package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: xm7  reason: default package */
public final class xm7 extends l5e implements i26 {
    public final /* synthetic */ an7 A0;
    public ArrayList X;
    public Iterator Y;
    public Object Z;
    public int w0;
    public int x0;
    public long y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm7(an7 an7, Continuation continuation) {
        super(2, continuation);
        this.A0 = an7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xm7(this.A0, continuation);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:31|(1:32)|33|(4:35|(1:37)|(1:39)|(1:41))|65|66|67|68|24|(1:(3:88|(1:90)|91))(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(1:(1:(1:(11:5|82|(1:84)|85|24|(5:26|27|28|(1:30)(10:31|32|33|(4:35|(1:37)|(1:39)|(1:41))|65|66|67|68|24|(1:(3:88|(1:90)|91))(0))|30)|88|(0)|91|92|(1:94)(6:95|(1:99)|100|(1:102)(1:103)|104|(5:106|(7:109|(1:111)|112|(1:114)|(2:116|122)(1:123)|117|107)|121|118|124)(2:119|120)))(2:6|7))(3:8|9|10))(11:14|15|16|17|32|33|(11:65|66|67|68|24|(0)|88|(0)|91|92|(0)(0))|35|(0)|(0)|(0)))(10:18|(1:22)|23|24|(0)(0)|88|(0)|91|92|(0)(0))|11|42|43|44|45|46|47|48|49|50|51|52|53|24|(0)|88|(0)|91|92|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0177, code lost:
        r14 = r9;
        r9 = r10;
        r13 = r27;
        r12 = r28;
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0183, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0188, code lost:
        r33 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018a, code lost:
        r28 = r12;
        r27 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ab, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f0, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f5, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fa, code lost:
        r10 = r0;
        r0 = r5;
        r11 = r13;
        r9 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0254 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r32
            pu3 r2 = pu3.a
            int r0 = r1.z0
            jue r3 = jue.a
            java.lang.String r4 = "ONEME-11049"
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            if (r0 == 0) goto L_0x0064
            if (r0 == r6) goto L_0x0053
            if (r0 == r5) goto L_0x0037
            if (r0 != r8) goto L_0x002f
            int r0 = r1.x0
            int r9 = r1.w0
            java.lang.Object r10 = r1.Z
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.util.Iterator r11 = r1.Y
            java.util.ArrayList r12 = r1.X
            wx3.H(r33)
            r26 = r3
            r6 = r8
            r29 = r12
            r12 = r9
            r9 = r29
            goto L_0x01fe
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            long r9 = r1.y0
            int r11 = r1.x0
            int r12 = r1.w0
            java.lang.Object r0 = r1.Z
            on7 r0 = (defpackage.on7) r0
            java.util.Iterator r13 = r1.Y
            java.util.ArrayList r14 = r1.X
            wx3.H(r33)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r5 = r11
            r10 = r9
            r9 = r14
            goto L_0x011c
        L_0x004d:
            r0 = move-exception
            r26 = r3
            r3 = r6
            goto L_0x01be
        L_0x0053:
            long r9 = r1.y0
            int r11 = r1.x0
            int r12 = r1.w0
            java.util.Iterator r13 = r1.Y
            java.util.ArrayList r14 = r1.X
            wx3.H(r33)     // Catch:{ all -> 0x004d }
            r0 = r33
            goto L_0x00e4
        L_0x0064:
            wx3.H(r33)
            an7 r0 = r1.A0
            java.lang.String r9 = r0.Z
            fn6 r10 = udd.e
            if (r10 != 0) goto L_0x0070
            goto L_0x008b
        L_0x0070:
            boolean r11 = r10.c()
            if (r11 == 0) goto L_0x008b
            tn7 r11 = defpackage.tn7.X
            java.util.List r0 = r0.X
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Creating LogApiTask for tasks="
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r10.d(r11, r9, r0, r7)
        L_0x008b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            an7 r9 = r1.A0
            java.util.List r9 = r9.X
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = r10
            r12 = r11
            r10 = r9
            r9 = r0
        L_0x009d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            an7 r0 = r1.A0     // Catch:{ all -> 0x01ba }
            in7 r0 = r0.o()     // Catch:{ all -> 0x01ba }
            r1.X = r9     // Catch:{ all -> 0x01ba }
            r1.Y = r10     // Catch:{ all -> 0x01ba }
            r1.Z = r7     // Catch:{ all -> 0x01ba }
            r1.w0 = r11     // Catch:{ all -> 0x01ba }
            r1.x0 = r12     // Catch:{ all -> 0x01ba }
            r1.y0 = r13     // Catch:{ all -> 0x01ba }
            r1.z0 = r6     // Catch:{ all -> 0x01ba }
            zec r0 = r0.b()     // Catch:{ all -> 0x01ba }
            pae r15 = r0.a     // Catch:{ all -> 0x01ba }
            n3a r15 = (n3a) r15     // Catch:{ all -> 0x01ba }
            ju3 r15 = r15.b()     // Catch:{ all -> 0x01ba }
            vec r8 = new vec     // Catch:{ all -> 0x01ba }
            r8.<init>(r0, r13, r7)     // Catch:{ all -> 0x01ba }
            java.lang.Object r0 = xs7.U(r15, r8, r1)     // Catch:{ all -> 0x01ba }
            if (r0 != r2) goto L_0x00d9
            return r2
        L_0x00d9:
            r29 = r13
            r14 = r9
            r13 = r10
            r9 = r29
            r31 = r12
            r12 = r11
            r11 = r31
        L_0x00e4:
            on7 r0 = (defpackage.on7) r0     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0195
            an7 r8 = r1.A0     // Catch:{ all -> 0x0191 }
            in7 r8 = r8.o()     // Catch:{ all -> 0x0191 }
            r1.X = r14     // Catch:{ all -> 0x0191 }
            r1.Y = r13     // Catch:{ all -> 0x0191 }
            r1.Z = r0     // Catch:{ all -> 0x0191 }
            r1.w0 = r12     // Catch:{ all -> 0x0191 }
            r1.x0 = r11     // Catch:{ all -> 0x0191 }
            r1.y0 = r9     // Catch:{ all -> 0x0191 }
            r1.z0 = r5     // Catch:{ all -> 0x0191 }
            zec r8 = r8.b()     // Catch:{ all -> 0x0191 }
            pae r15 = r8.a     // Catch:{ all -> 0x0191 }
            n3a r15 = (n3a) r15     // Catch:{ all -> 0x0191 }
            ju3 r15 = r15.b()     // Catch:{ all -> 0x0191 }
            xec r5 = new xec     // Catch:{ all -> 0x0191 }
            r5.<init>(r8, r9, r7)     // Catch:{ all -> 0x0191 }
            java.lang.Object r5 = xs7.U(r15, r5, r1)     // Catch:{ all -> 0x0191 }
            if (r5 != r2) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r5 = r3
        L_0x0115:
            if (r5 != r2) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r5 = r3
        L_0x0119:
            if (r5 != r2) goto L_0x0048
            return r2
        L_0x011c:
            ln7 r0 = r0.X     // Catch:{ all -> 0x0185 }
            long r14 = r0.a     // Catch:{ all -> 0x0185 }
            long r7 = r0.b     // Catch:{ all -> 0x0185 }
            java.lang.String r6 = r0.c     // Catch:{ all -> 0x0185 }
            r26 = r3
            java.lang.String r3 = r0.d     // Catch:{ all -> 0x0183 }
            r33 = r5
            java.util.Map r5 = r0.e     // Catch:{ all -> 0x0181 }
            r28 = r12
            r27 = r13
            long r12 = r0.f     // Catch:{ all -> 0x0176 }
            bl r0 = new bl     // Catch:{ all -> 0x0176 }
            r16 = r0
            r17 = r14
            r19 = r7
            r21 = r12
            r23 = r6
            r24 = r3
            r25 = r5
            r16.<init>(r17, r19, r21, r23, r24, r25)     // Catch:{ all -> 0x0176 }
            r9.add(r0)     // Catch:{ all -> 0x0176 }
            an7 r3 = r1.A0     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r3.Z     // Catch:{ all -> 0x0176 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r5.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = "Create entry for request: taskId:"
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            r5.append(r10)     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = ", event:"
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            r5.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0176 }
            udd.q(r3, r0)     // Catch:{ all -> 0x0176 }
            r12 = r33
            r3 = r26
            r10 = r27
            r11 = r28
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            goto L_0x009d
        L_0x0176:
            r0 = move-exception
        L_0x0177:
            r14 = r9
            r9 = r10
            r13 = r27
            r12 = r28
            r3 = 1
            r11 = r33
            goto L_0x01be
        L_0x0181:
            r0 = move-exception
            goto L_0x018a
        L_0x0183:
            r0 = move-exception
            goto L_0x0188
        L_0x0185:
            r0 = move-exception
            r26 = r3
        L_0x0188:
            r33 = r5
        L_0x018a:
            r28 = r12
            r27 = r13
            goto L_0x0177
        L_0x018f:
            r3 = 1
            goto L_0x01be
        L_0x0191:
            r0 = move-exception
            r26 = r3
            goto L_0x018f
        L_0x0195:
            r26 = r3
            int r3 = r12 + 1
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01aa }
            r0.<init>(r12)     // Catch:{ all -> 0x01aa }
            r12 = r11
            r10 = r13
            r9 = r14
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 3
            r11 = r3
            r3 = r26
            goto L_0x009d
        L_0x01aa:
            r0 = move-exception
            r12 = r3
            goto L_0x018f
        L_0x01ad:
            r3 = 1
            r29 = r13
            r14 = r9
            r13 = r10
            r9 = r29
            r31 = r12
            r12 = r11
            r11 = r31
            goto L_0x01be
        L_0x01ba:
            r0 = move-exception
            r26 = r3
            goto L_0x01ad
        L_0x01be:
            int r5 = r11 + 1
            an7 r3 = r1.A0
            in7 r3 = r3.o()
            r1.X = r14
            r1.Y = r13
            r1.Z = r0
            r1.w0 = r12
            r1.x0 = r5
            r6 = 3
            r1.z0 = r6
            zec r3 = r3.b()
            java.util.List r7 = hr1.o(r9)
            pae r8 = r3.a
            n3a r8 = (n3a) r8
            ju3 r8 = r8.b()
            sec r9 = new sec
            r10 = 0
            r9.<init>(r3, r7, r10)
            java.lang.Object r3 = xs7.U(r8, r9, r1)
            if (r3 != r2) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r3 = r26
        L_0x01f2:
            if (r3 != r2) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r3 = r26
        L_0x01f7:
            if (r3 != r2) goto L_0x01fa
            return r2
        L_0x01fa:
            r10 = r0
            r0 = r5
            r11 = r13
            r9 = r14
        L_0x01fe:
            an7 r3 = r1.A0
            pl r3 = r3.c
            if (r3 == 0) goto L_0x0205
            goto L_0x0206
        L_0x0205:
            r3 = 0
        L_0x0206:
            t97 r3 = r3.u
            java.lang.Object r3 = r3.getValue()
            g15 r3 = (defpackage.g15) r3
            ru.ok.tamtam.ExceptionHandler$HandledException r5 = new ru.ok.tamtam.ExceptionHandler$HandledException
            r7 = 1
            r8 = 0
            r5.<init>(r8, r10, r7, r4)
            r4a r3 = (r4a) r3
            r3.c(r5, r7)
            r8 = r6
            r6 = r7
            r10 = r11
            r11 = r12
            r3 = r26
            r5 = 2
            r7 = 0
            r12 = r0
            goto L_0x009d
        L_0x0225:
            if (r12 != 0) goto L_0x0229
            if (r11 == 0) goto L_0x024e
        L_0x0229:
            an7 r0 = r1.A0
            pl r0 = r0.c
            if (r0 == 0) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r0 = 0
        L_0x0231:
            t97 r0 = r0.u
            java.lang.Object r0 = r0.getValue()
            g15 r0 = (defpackage.g15) r0
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            java.lang.String r3 = "Skipped events in task = "
            java.lang.String r5 = ", deleted due error = "
            java.lang.String r3 = defpackage.me4.g(r3, r11, r12, r5)
            r5 = 2
            r6 = 0
            r2.<init>(r3, r6, r5, r4)
            r4a r0 = (r4a) r0
            r3 = 1
            r0.c(r2, r3)
        L_0x024e:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0257
            r7 = 0
            goto L_0x033b
        L_0x0257:
            long r2 = java.lang.System.currentTimeMillis()
            an7 r0 = r1.A0
            java.lang.String r4 = r0.Z
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x0264
            goto L_0x0291
        L_0x0264:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0291
            tn7 r6 = defpackage.tn7.X
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r2)
            java.lang.String r7 = ez3.T(r7)
            boolean r0 = r0.o
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Updating lastSuccessful sent time="
            r8.<init>(r10)
            r8.append(r7)
            java.lang.String r7 = " for isCritical="
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7 = 0
            r5.d(r6, r4, r0, r7)
        L_0x0291:
            an7 r0 = r1.A0
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x02a9
            g2b r0 = r0.r()
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentCriticalLogTime"
            r0.k(r2, r1)
            goto L_0x02ba
        L_0x02a9:
            g2b r0 = r0.r()
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "user.lastSentLogTime"
            r0.k(r2, r1)
        L_0x02ba:
            bn7 r0 = new bn7
            r10 = 0
            r0.<init>((defpackage.dfa) r10)
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x033c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x02cf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0335
            java.lang.Object r3 = r2.next()
            bl r3 = (defpackage.bl) r3
            r3.getClass()
            ht7 r4 = new ht7
            r4.<init>()
            long r5 = r3.a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "time"
            r4.put(r6, r5)
            long r5 = r3.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "userId"
            r4.put(r6, r5)
            java.lang.String r5 = "type"
            java.lang.String r6 = r3.d
            r4.put(r5, r6)
            java.lang.String r5 = "event"
            java.lang.String r6 = r3.e
            r4.put(r5, r6)
            java.util.Map r5 = r3.f
            if (r5 == 0) goto L_0x0310
            java.lang.String r6 = "params"
            r4.put(r6, r5)
        L_0x0310:
            long r5 = r3.c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x031d
            goto L_0x031e
        L_0x031d:
            r3 = r10
        L_0x031e:
            if (r3 == 0) goto L_0x032d
            long r5 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "sessionId"
            r4.put(r5, r3)
        L_0x032d:
            ht7 r3 = r4.b()
            r1.add(r3)
            goto L_0x02cf
        L_0x0335:
            java.lang.String r2 = "events"
            r0.h(r2, r1)
            r7 = r0
        L_0x033b:
            return r7
        L_0x033c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "status can't be null or empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm7.o(java.lang.Object):java.lang.Object");
    }
}
