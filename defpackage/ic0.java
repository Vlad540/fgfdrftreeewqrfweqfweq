package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.p0;

/* renamed from: ic0  reason: default package */
public final /* synthetic */ class ic0 implements of3, ou9, r3e, lh7, tx9 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ic0(lc0 lc0, String str, int i, Context context) {
        this.a = lc0;
        this.o = str;
        this.b = i;
        this.c = context;
    }

    public void a(Object obj) {
        int i = this.b;
        p0 p0Var = (p0) this.a;
        d.a((d) this.o, i, p0Var, (String) this.c, (np) obj);
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Drawable c2 = ((lc0) this.a).c((Context) this.c);
        int i = this.b;
        c2.setBounds(0, 0, i, i);
        c2.draw((Canvas) this.o);
    }

    public void d(at9 at9) {
        lc0 lc0 = (lc0) this.a;
        ur6 d = ur6.d(lc0.b((String) this.o));
        int i = this.b;
        d.d = i <= 0 ? null : new hbc(0.0f, i, i, 12);
        d.g = rr6.a;
        d.l = new pha(false);
        g0 a2 = a06.u().a(d.a(), (Object) null);
        a2.m(new kc0(at9, lc0, (Context) this.c, a2), xn1.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f4 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0101 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0116 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0134 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013b A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0167 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0217 A[Catch:{ all -> 0x00b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r34 = this;
            r0 = r34
            r1 = 15
            java.lang.Object r2 = r0.o
            t52 r2 = (defpackage.t52) r2
            java.lang.Object r3 = r0.a
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.c
            java.util.Map r4 = (java.util.Map) r4
            int r0 = r0.b
            r2.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            int r7 = r3.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "storeChatsFromServer: chats.size() = %d"
            java.lang.String r9 = "t52"
            udd.p(r9, r8, r7)
            zb9 r7 = new zb9
            int r8 = r3.size()
            r7.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r3.size()
            r8.<init>(r10)
            bs r10 = new bs
            r11 = 0
            r10.<init>(r11)
            bs r15 = new bs
            r15.<init>(r11)
            bs r14 = new bs
            r14.<init>(r11)
            yr r13 = new yr
            r13.<init>(r11)
            nj4 r12 = r2.l
            java.lang.Object r12 = r12.get()
            a04 r12 = (defpackage.a04) r12
            hz3 r12 = (defpackage.hz3) r12
            r12.a()
            g2b r12 = r2.n     // Catch:{ all -> 0x00b2 }
            j2b r12 = (defpackage.j2b) r12     // Catch:{ all -> 0x00b2 }
            yzc r12 = r12.b     // Catch:{ all -> 0x00b2 }
            r12.getClass()     // Catch:{ all -> 0x00b2 }
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f22chatspreloadperiod     // Catch:{ all -> 0x00b2 }
            r16 = r5
            long r5 = (long) r1     // Catch:{ all -> 0x00b2 }
            long r5 = r12.o(r11, r5)     // Catch:{ all -> 0x00b2 }
            int r5 = (int) r5     // Catch:{ all -> 0x00b2 }
            long r5 = (long) r5     // Catch:{ all -> 0x00b2 }
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 * r11
            g2b r11 = r2.n     // Catch:{ all -> 0x00b2 }
            j2b r11 = (defpackage.j2b) r11     // Catch:{ all -> 0x00b2 }
            i03 r11 = r11.a     // Catch:{ all -> 0x00b2 }
            long r11 = r11.m()     // Catch:{ all -> 0x00b2 }
            java.util.Iterator r18 = r3.iterator()     // Catch:{ all -> 0x00b2 }
            r19 = 0
            r21 = r19
        L_0x008a:
            boolean r23 = r18.hasNext()     // Catch:{ all -> 0x00b2 }
            if (r23 == 0) goto L_0x022f
            java.lang.Object r23 = r18.next()     // Catch:{ all -> 0x00b2 }
            r1 = r23
            j22 r1 = (defpackage.j22) r1     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x00b5
            java.lang.String r1 = "storeChatsFromServer: chatFromServer is null!"
            r23 = r3
            r34 = r13
            r3 = 0
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b2 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)     // Catch:{ all -> 0x00b2 }
            r3 = 0
            udd.R(r9, r3, r1, r13)     // Catch:{ all -> 0x00b2 }
            r1 = 15
            r13 = r34
            r3 = r23
            goto L_0x008a
        L_0x00b2:
            r0 = move-exception
            goto L_0x0339
        L_0x00b5:
            r23 = r3
            r34 = r13
            fn6 r3 = udd.e     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x00c2
        L_0x00bd:
            r24 = r5
            r26 = r11
            goto L_0x00f2
        L_0x00c2:
            boolean r13 = r3.c()     // Catch:{ all -> 0x00b2 }
            if (r13 != 0) goto L_0x00c9
            goto L_0x00bd
        L_0x00c9:
            tn7 r13 = defpackage.tn7.X     // Catch:{ all -> 0x00b2 }
            r24 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "storeChatsFromServer: Chat("
            r5.<init>(r6)     // Catch:{ all -> 0x00b2 }
            r26 = r11
            long r11 = r1.a     // Catch:{ all -> 0x00b2 }
            r5.append(r11)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            int r6 = r1.A0     // Catch:{ all -> 0x00b2 }
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b2 }
            r6 = 0
            r3.d(r13, r9, r5, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00f2:
            if (r4 == 0) goto L_0x0101
            long r5 = r1.a     // Catch:{ all -> 0x00b2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x00b2 }
            tn2 r3 = (defpackage.tn2) r3     // Catch:{ all -> 0x00b2 }
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            nj4 r5 = r2.l     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00b2 }
            a04 r5 = (defpackage.a04) r5     // Catch:{ all -> 0x00b2 }
            hz3 r5 = (defpackage.hz3) r5     // Catch:{ all -> 0x00b2 }
            xdc r5 = r5.b     // Catch:{ all -> 0x00b2 }
            long r11 = r1.a     // Catch:{ all -> 0x00b2 }
            p62 r5 = r5.e(r11)     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x0132
            int r6 = r1.b1     // Catch:{ all -> 0x00b2 }
            r11 = 2
            if (r6 != r11) goto L_0x011d
            r6 = 1
            goto L_0x011e
        L_0x011d:
            r6 = 0
        L_0x011e:
            if (r6 == 0) goto L_0x0132
            nj4 r5 = r2.l     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00b2 }
            a04 r5 = (defpackage.a04) r5     // Catch:{ all -> 0x00b2 }
            hz3 r5 = (defpackage.hz3) r5     // Catch:{ all -> 0x00b2 }
            xdc r5 = r5.b     // Catch:{ all -> 0x00b2 }
            long r11 = r1.y0     // Catch:{ all -> 0x00b2 }
            p62 r5 = r5.f(r11)     // Catch:{ all -> 0x00b2 }
        L_0x0132:
            if (r5 == 0) goto L_0x013b
            o62 r5 = r5.c     // Catch:{ all -> 0x00b2 }
            long r11 = r5.p0     // Catch:{ all -> 0x00b2 }
            long r5 = r5.q0     // Catch:{ all -> 0x00b2 }
            goto L_0x013e
        L_0x013b:
            r5 = r19
            r11 = r5
        L_0x013e:
            i22 r3 = r2.b0(r1, r3)     // Catch:{ all -> 0x00b2 }
            i22 r13 = r2.a     // Catch:{ all -> 0x00b2 }
            if (r13 != 0) goto L_0x0161
            if (r3 == 0) goto L_0x0161
            g2b r13 = r2.n     // Catch:{ all -> 0x00b2 }
            j2b r13 = (defpackage.j2b) r13     // Catch:{ all -> 0x00b2 }
            i03 r13 = r13.a     // Catch:{ all -> 0x00b2 }
            r28 = r9
            r29 = r10
            long r9 = r13.s()     // Catch:{ all -> 0x00b2 }
            o62 r13 = r3.b     // Catch:{ all -> 0x00b2 }
            boolean r9 = r13.f(r9)     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x0165
            r2.a = r3     // Catch:{ all -> 0x00b2 }
            goto L_0x0165
        L_0x0161:
            r28 = r9
            r29 = r10
        L_0x0165:
            if (r3 == 0) goto L_0x0217
            long r9 = r1.Z0     // Catch:{ all -> 0x00b2 }
            r30 = r7
            r31 = r8
            long r7 = r1.a1     // Catch:{ all -> 0x00b2 }
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0177
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0180
        L_0x0177:
            long r5 = r3.a     // Catch:{ all -> 0x00b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00b2 }
            r14.add(r5)     // Catch:{ all -> 0x00b2 }
        L_0x0180:
            long r5 = r1.z0     // Catch:{ all -> 0x00b2 }
            java.util.Map r7 = r1.o     // Catch:{ all -> 0x00b2 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00b2 }
            if (r7 != 0) goto L_0x019e
            java.util.Map r1 = r1.o     // Catch:{ all -> 0x00b2 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00b2 }
            java.lang.Object r1 = java.util.Collections.max(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x00b2 }
            long r7 = r1.longValue()     // Catch:{ all -> 0x00b2 }
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ all -> 0x00b2 }
        L_0x019e:
            r32 = r5
            r5 = r21
            r21 = r32
            int r1 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r21 = r5
        L_0x01ab:
            long r5 = r3.a     // Catch:{ all -> 0x00b2 }
            r1 = r30
            r1.a(r5)     // Catch:{ all -> 0x00b2 }
            r7 = r31
            r7.add(r3)     // Catch:{ all -> 0x00b2 }
            o62 r5 = r3.b     // Catch:{ all -> 0x00b2 }
            long r5 = r5.a     // Catch:{ all -> 0x00b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00b2 }
            r8 = r29
            r8.add(r5)     // Catch:{ all -> 0x00b2 }
            nj4 r5 = r2.w     // Catch:{ all -> 0x00b2 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00b2 }
            luf r5 = (defpackage.luf) r5     // Catch:{ all -> 0x00b2 }
            long r9 = r3.a     // Catch:{ all -> 0x00b2 }
            p1d r6 = new p1d     // Catch:{ all -> 0x00b2 }
            r6.<init>(r9)     // Catch:{ all -> 0x00b2 }
            r5.a(r6)     // Catch:{ all -> 0x00b2 }
            boolean r5 = r3.e0()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x01f1
            boolean r5 = r3.b0()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x01f1
            int r5 = r15.c     // Catch:{ all -> 0x00b2 }
            if (r5 < r0) goto L_0x01f4
            o62 r5 = r3.b     // Catch:{ all -> 0x00b2 }
            long r5 = r5.k     // Catch:{ all -> 0x00b2 }
            long r11 = r26 - r5
            int r5 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            r9 = r34
            goto L_0x021f
        L_0x01f4:
            long r5 = r3.a     // Catch:{ all -> 0x00b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00b2 }
            r15.add(r5)     // Catch:{ all -> 0x00b2 }
            o62 r5 = r3.b     // Catch:{ all -> 0x00b2 }
            long r5 = r5.L     // Catch:{ all -> 0x00b2 }
            int r9 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r9 == 0) goto L_0x01f1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00b2 }
            o62 r3 = r3.b     // Catch:{ all -> 0x00b2 }
            long r9 = r3.a     // Catch:{ all -> 0x00b2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00b2 }
            r9 = r34
            r9.put(r5, r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x021f
        L_0x0217:
            r9 = r34
            r1 = r7
            r7 = r8
            r5 = r21
            r8 = r29
        L_0x021f:
            r10 = r8
            r13 = r9
            r3 = r23
            r5 = r24
            r11 = r26
            r9 = r28
            r8 = r7
            r7 = r1
            r1 = 15
            goto L_0x008a
        L_0x022f:
            r23 = r3
            r1 = r7
            r7 = r8
            r28 = r9
            r8 = r10
            r9 = r13
            r5 = r21
            java.lang.String r0 = "storeChatsFromServer end, time = %dms"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b2 }
            long r3 = r3 - r16
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x00b2 }
            r4 = r28
            udd.p(r4, r0, r3)     // Catch:{ all -> 0x00b2 }
            nj4 r0 = r2.l     // Catch:{ all -> 0x00b2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b2 }
            a04 r0 = (defpackage.a04) r0     // Catch:{ all -> 0x00b2 }
            hz3 r0 = (defpackage.hz3) r0     // Catch:{ all -> 0x00b2 }
            r0.c()     // Catch:{ all -> 0x00b2 }
            nj4 r0 = r2.l
            java.lang.Object r0 = r0.get()
            a04 r0 = (defpackage.a04) r0
            hz3 r0 = (defpackage.hz3) r0
            r0.b()
            int r0 = r23.size()
            if (r0 != 0) goto L_0x0288
            g2b r0 = r2.n
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            long r10 = r0.o()
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0288
            g2b r0 = r2.n
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            r5 = 1
            r0.v(r5)
            goto L_0x029f
        L_0x0288:
            g2b r0 = r2.n
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            long r10 = r0.o()
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x029f
            g2b r0 = r2.n
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            r0.v(r5)
        L_0x029f:
            java.util.ArrayList r0 = lp.U(r1)
            java.util.List r12 = java.util.Collections.unmodifiableList(r0)
            md4 r0 = defpackage.md4.REGULAR
            mw2 r3 = new mw2
            r13 = 1
            r17 = 0
            r5 = 0
            r16 = 0
            r11 = r3
            r6 = r9
            r9 = r14
            r14 = r5
            r5 = r15
            r15 = r0
            r18 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            tt0 r8 = r2.m
            r8.c(r3)
            grd r8 = r2.E
            r10 = 0
            r8.m(r10, r3)
            s52 r3 = r2.G
            if (r3 == 0) goto L_0x02ce
            r3.c(r7)
        L_0x02ce:
            boolean r3 = r5.isEmpty()
            java.lang.String r7 = "syncMessages"
            if (r3 != 0) goto L_0x02ef
            int r3 = r5.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r8 = "storeChatsFromServer: chatsToSync = %d"
            udd.p(r4, r8, r3)
            g5 r3 = new g5
            r8 = 15
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (java.lang.Object) r5, (int) r8)
            r2.f0(r7, r3)
        L_0x02ef:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0310
            int r0 = r5.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "storeChatsFromServer: chatsWithScheduledMessagesForSync = %d"
            udd.p(r4, r3, r0)
            md4 r0 = defpackage.md4.DELAYED
            g5 r3 = new g5
            r5 = 15
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r0, (java.lang.Object) r9, (int) r5)
            r2.f0(r7, r3)
        L_0x0310:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0333
            int r0 = r6.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "storeChatsFromServer: pinsToSync = %d"
            udd.p(r4, r3, r0)
            r2.e()
            dr1 r0 = new dr1
            r3 = 7
            r0.<init>(r2, r3, r6)
            java.lang.String r3 = "syncPins"
            r2.f0(r3, r0)
        L_0x0333:
            java.lang.String r0 = "storeChatsFromServer: finished"
            udd.q(r4, r0)
            return r1
        L_0x0339:
            nj4 r1 = r2.l
            java.lang.Object r1 = r1.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic0.get():java.lang.Object");
    }

    public void invoke(Object obj) {
        hd hdVar = (hd) obj;
        hdVar.getClass();
        int i = this.b;
        hdVar.B((gd) this.o, (jya) this.a, (jya) this.c, i);
    }

    public /* synthetic */ ic0(Object obj, int i, Object obj2, Object obj3) {
        this.o = obj;
        this.b = i;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ic0(Object obj, Object obj2, Object obj3, int i) {
        this.o = obj;
        this.a = obj2;
        this.c = obj3;
        this.b = i;
    }
}
