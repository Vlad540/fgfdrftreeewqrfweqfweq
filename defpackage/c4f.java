package defpackage;

import android.content.Context;
import java.io.File;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: c4f  reason: default package */
public final class c4f {
    public final Context a;
    public final t97 b;
    public final f03 c;
    public final pk d;
    public final bf5 e;
    public final x2f f;
    public final String g = c4f.class.getName();
    public final ContextScope h;

    public c4f(Context context, t97 t97, f03 f03, pk pkVar, bf5 bf5, x2f x2f, pae pae) {
        this.a = context;
        this.b = t97;
        this.c = f03;
        this.d = pkVar;
        this.e = bf5;
        this.f = x2f;
        this.h = n1g.a(((n3a) pae).b().plus(x87.c()).plus(new qj(this)));
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [kg5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [a07, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [ul7, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec A[SYNTHETIC, Splitter:B:43:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.o10 r13, long r14, long r16, kotlin.coroutines.Continuation r18) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r2 = r18
            boolean r3 = r2 instanceof defpackage.y3f
            if (r3 == 0) goto L_0x0017
            r3 = r2
            y3f r3 = (defpackage.y3f) r3
            int r4 = r3.w0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.w0 = r4
            goto L_0x001c
        L_0x0017:
            y3f r3 = new y3f
            r3.<init>(r12, r2)
        L_0x001c:
            java.lang.Object r2 = r3.Y
            pu3 r4 = pu3.a
            int r5 = r3.w0
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0041
            if (r5 != r7) goto L_0x0039
            n10 r1 = r3.X
            c4f r3 = r3.o
            wx3.H(r2)     // Catch:{ Exception -> 0x0034 }
            r0 = r2
            r2 = r1
            r1 = r3
            goto L_0x0123
        L_0x0034:
            r0 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x0145
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            wx3.H(r2)
            boolean r2 = ete.L(r13)
            if (r2 == 0) goto L_0x0051
            v00 r2 = r0.j
            o10 r2 = r2.d
            n10 r2 = r2.d
            goto L_0x0053
        L_0x0051:
            n10 r2 = r0.d
        L_0x0053:
            boolean r5 = r13.i()
            boolean r8 = ete.L(r13)
            java.lang.String r9 = r1.g
            if (r5 != 0) goto L_0x0069
            if (r8 != 0) goto L_0x0069
            java.lang.String r0 = "Fetch video. Build fetcher: can't fetch because don't have video"
            udd.U(r9, r0)
        L_0x0066:
            r0 = r6
            goto L_0x00e4
        L_0x0069:
            java.lang.String r10 = r12.c(r13)
            if (r10 == 0) goto L_0x008a
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0076
            goto L_0x008a
        L_0x0076:
            ul7 r0 = new ul7
            android.content.Context r5 = r1.a
            r0.<init>()
            r0.a = r10
            r0.c = r5
            java.lang.Class<ul7> r5 = defpackage.ul7.class
            java.lang.String r5 = r5.getName()
            r0.b = r5
            goto L_0x00e4
        L_0x008a:
            if (r5 == 0) goto L_0x00be
            n10 r5 = r0.d
            java.lang.String r10 = r5.h
            if (r10 == 0) goto L_0x0098
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00be
        L_0x0098:
            java.lang.String r0 = "Fetch video. Build fetcher: internal video"
            udd.q(r9, r0)
            a07 r0 = new a07
            long r10 = r5.a
            java.lang.String r5 = r5.m
            pk r8 = r1.d
            r0.<init>()
            r0.Y = r8
            r0.a = r10
            r10 = r14
            r0.b = r10
            r10 = r16
            r0.X = r10
            r0.c = r5
            java.lang.Class<a07> r5 = defpackage.a07.class
            java.lang.String r5 = r5.getName()
            r0.o = r5
            goto L_0x00e4
        L_0x00be:
            if (r8 == 0) goto L_0x00de
            java.lang.String r5 = "Fetch video. Build fetcher: video file"
            udd.q(r9, r5)
            kg5 r5 = new kg5
            v00 r0 = r0.j
            long r10 = r0.a
            pk r0 = r1.d
            r5.<init>()
            r5.b = r0
            r5.a = r10
            java.lang.Class<kg5> r0 = defpackage.kg5.class
            java.lang.String r0 = r0.getName()
            r5.c = r0
            r0 = r5
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "Fetch video. Build fetcher: unknown type! null"
            udd.U(r9, r0)
            goto L_0x0066
        L_0x00e4:
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "Fetch video. Fetcher is null"
            udd.q(r9, r0)
            return r6
        L_0x00ec:
            z3f r5 = new z3f     // Catch:{ Exception -> 0x0144 }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x0144 }
            djc r0 = new djc     // Catch:{ Exception -> 0x0144 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0144 }
            eq4 r5 = eq4.o     // Catch:{ Exception -> 0x0144 }
            r8 = 30
            long r8 = mt0.Q(r8, r5)     // Catch:{ Exception -> 0x0144 }
            dl5 r5 = new dl5     // Catch:{ Exception -> 0x0144 }
            r5.<init>(r8, r0, r6)     // Catch:{ Exception -> 0x0144 }
            tj5 r0 = new tj5     // Catch:{ Exception -> 0x0144 }
            r8 = 0
            r0.<init>(r8, r5)     // Catch:{ Exception -> 0x0144 }
            wd2 r5 = new wd2     // Catch:{ Exception -> 0x0144 }
            r8 = 1
            r5.<init>(r12, r6, r8)     // Catch:{ Exception -> 0x0144 }
            bc r8 = new bc     // Catch:{ Exception -> 0x0144 }
            r9 = 18
            r8.<init>(r0, r9, r5)     // Catch:{ Exception -> 0x0144 }
            r3.o = r1     // Catch:{ Exception -> 0x0144 }
            r3.X = r2     // Catch:{ Exception -> 0x0144 }
            r3.w0 = r7     // Catch:{ Exception -> 0x0144 }
            java.lang.Object r0 = ez3.D(r8, r3)     // Catch:{ Exception -> 0x0144 }
            if (r0 != r4) goto L_0x0123
            return r4
        L_0x0123:
            yb5 r0 = (defpackage.yb5) r0     // Catch:{ Exception -> 0x0144 }
            t97 r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            bd r1 = (defpackage.bd) r1
            java.lang.String r3 = r2.i
            java.lang.String r4 = "ACTION_VIDEO_FETCH_OK"
            if (r3 == 0) goto L_0x0140
            int r3 = r3.length()
            if (r3 != 0) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            java.lang.String r2 = r2.i
            r1.g(r4, r2)
            goto L_0x0143
        L_0x0140:
            r1.f(r4)
        L_0x0143:
            return r0
        L_0x0144:
            r0 = move-exception
        L_0x0145:
            boolean r3 = r0 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x0157
            r3 = r0
            ru.ok.tamtam.errors.TamErrorException r3 = (ru.ok.tamtam.errors.TamErrorException) r3
            uae r3 = r3.a
            java.lang.String r3 = r3.b
            boolean r3 = iu7.F(r3)
            if (r3 == 0) goto L_0x0157
            return r6
        L_0x0157:
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x018d
            java.lang.String r3 = r1.g
            java.lang.String r4 = r2.h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Fetch video. Failed to fetch "
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            udd.s(r3, r4, r0)
            t97 r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            bd r0 = (defpackage.bd) r0
            java.lang.String r1 = "ACTION_VIDEO_FETCH_FAILURE"
            java.lang.String r2 = r2.i
            if (r2 == 0) goto L_0x0189
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0185
            goto L_0x0189
        L_0x0185:
            r0.g(r1, r2)
            goto L_0x018c
        L_0x0189:
            r0.f(r1)
        L_0x018c:
            return r6
        L_0x018d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4f.a(o10, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, v2f] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r12v7, types: [z79] */
    /* JADX WARNING: type inference failed for: r12v8, types: [vj6] */
    /* JADX WARNING: type inference failed for: r12v9, types: [yy3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.o10 r26, long r27, long r29, kotlin.coroutines.Continuation r31) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof defpackage.b4f
            if (r1 == 0) goto L_0x001a
            r1 = r0
            b4f r1 = (defpackage.b4f) r1
            int r2 = r1.x0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.x0 = r2
        L_0x0018:
            r6 = r1
            goto L_0x0020
        L_0x001a:
            b4f r1 = new b4f
            r1.<init>(r7, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r6.Z
            pu3 r9 = pu3.a
            int r1 = r6.x0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x003f
            if (r1 != r10) goto L_0x0037
            n10 r1 = r6.Y
            o10 r2 = r6.X
            c4f r3 = r6.o
            wx3.H(r0)
            goto L_0x00d5
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            wx3.H(r0)
            java.lang.String r0 = r7.g
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x004d
        L_0x0048:
            r12 = r27
            r4 = r29
            goto L_0x006b
        L_0x004d:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0048
            tn7 r2 = defpackage.tn7.X
            java.lang.String r3 = "Fetch video. Start fetch, getVideoContent chatServerId="
            java.lang.String r4 = ", messageServerId="
            r12 = r27
            java.lang.StringBuilder r3 = hr1.k(r12, r3, r4)
            r4 = r29
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r11)
        L_0x006b:
            boolean r0 = ete.L(r26)
            if (r0 == 0) goto L_0x0079
            v00 r0 = r8.j
            o10 r0 = r0.d
            n10 r0 = r0.d
        L_0x0077:
            r14 = r0
            goto L_0x007c
        L_0x0079:
            n10 r0 = r8.d
            goto L_0x0077
        L_0x007c:
            java.lang.String r0 = r14.h
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0223
            boolean r0 = r14.g
            if (r0 == 0) goto L_0x009e
            long r0 = r14.k
            f03 r2 = r7.c
            lqc r2 = (defpackage.lqc) r2
            long r2 = r2.m()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            java.lang.String r0 = r7.g
            java.lang.String r1 = "Fetch video. Live stream not started"
            udd.q(r0, r1)
            return r11
        L_0x009e:
            java.lang.String r0 = r25.c(r26)
            java.lang.String r1 = r7.g
            java.lang.String r2 = "Fetch video. Check local path, getVideoContent: local path = %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            udd.p(r1, r2, r0)
            x2f r0 = r7.f
            java.lang.String r1 = r8.q
            r0.getClass()
            v2f r0 = defpackage.x2f.a(r1)
            if (r0 == 0) goto L_0x00bb
            return r0
        L_0x00bb:
            r6.o = r7
            r6.X = r8
            r6.Y = r14
            r6.x0 = r10
            r0 = r25
            r1 = r26
            r2 = r27
            r4 = r29
            java.lang.Object r0 = r0.a(r1, r2, r4, r6)
            if (r0 != r9) goto L_0x00d2
            return r9
        L_0x00d2:
            r3 = r7
            r2 = r8
            r1 = r14
        L_0x00d5:
            yb5 r0 = (defpackage.yb5) r0
            r3.getClass()
            if (r0 == 0) goto L_0x01ea
            java.util.List r0 = r0.a
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00e6
            goto L_0x01ea
        L_0x00e6:
            m10 r4 = r1.l
            if (r4 == 0) goto L_0x00f0
            boolean r4 = r4.d
            if (r4 == 0) goto L_0x00f0
            r4 = r10
            goto L_0x00f1
        L_0x00f0:
            r4 = 0
        L_0x00f1:
            java.util.Iterator r5 = r0.iterator()
        L_0x00f5:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0108
            java.lang.Object r6 = r5.next()
            r7 = r6
            wb5 r7 = (defpackage.wb5) r7
            int r7 = r7.a
            r8 = 2
            if (r7 != r8) goto L_0x00f5
            goto L_0x0109
        L_0x0108:
            r6 = r11
        L_0x0109:
            wb5 r6 = (defpackage.wb5) r6
            if (r6 == 0) goto L_0x0137
            yy3 r0 = new yy3
            java.lang.String r5 = r6.b
            xx r6 = r1.n
            long r7 = r1.a
            long r9 = r1.c
            long r14 = r1.k
            boolean r13 = r1.g
            int r12 = r1.e
            int r1 = r1.f
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r7
            r17 = r9
            r21 = r6
            r22 = r5
            r24 = r4
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x01eb
        L_0x0137:
            java.util.Iterator r5 = r0.iterator()
        L_0x013b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014d
            java.lang.Object r6 = r5.next()
            r7 = r6
            wb5 r7 = (defpackage.wb5) r7
            int r7 = r7.a
            if (r7 != r10) goto L_0x013b
            goto L_0x014e
        L_0x014d:
            r6 = r11
        L_0x014e:
            wb5 r6 = (defpackage.wb5) r6
            if (r6 == 0) goto L_0x017c
            vj6 r0 = new vj6
            java.lang.String r5 = r6.b
            xx r6 = r1.n
            long r7 = r1.a
            long r9 = r1.c
            long r14 = r1.k
            boolean r13 = r1.g
            int r12 = r1.e
            int r1 = r1.f
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r7
            r17 = r9
            r21 = r6
            r22 = r5
            r24 = r4
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x01eb
        L_0x017c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0185:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x019b
            java.lang.Object r6 = r0.next()
            r7 = r6
            wb5 r7 = (defpackage.wb5) r7
            int r7 = r7.a
            r8 = 3
            if (r7 != r8) goto L_0x0185
            r5.add(r6)
            goto L_0x0185
        L_0x019b:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01a2
            r5 = r11
        L_0x01a2:
            if (r5 == 0) goto L_0x01ea
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = q23.H(r5, r0)
            r13.<init>(r0)
            java.util.Iterator r0 = r5.iterator()
        L_0x01b3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01d0
            java.lang.Object r5 = r0.next()
            wb5 r5 = (defpackage.wb5) r5
            x79 r6 = new x79
            java.lang.String r7 = r5.b
            int r8 = r5.c
            int r9 = r5.d
            int r5 = r5.e
            r6.<init>(r8, r7, r9, r5)
            r13.add(r6)
            goto L_0x01b3
        L_0x01d0:
            z79 r0 = new z79
            xx r14 = r1.n
            long r5 = r1.a
            long r7 = r1.c
            int r9 = r1.e
            int r1 = r1.f
            r12 = r0
            r15 = r5
            r17 = r7
            r19 = r4
            r20 = r9
            r21 = r1
            r12.<init>(r13, r14, r15, r17, r19, r20, r21)
            goto L_0x01eb
        L_0x01ea:
            r0 = r11
        L_0x01eb:
            if (r0 == 0) goto L_0x0202
            x2f r1 = r3.f
            java.lang.String r2 = r2.q
            r1.getClass()
            android.util.LruCache r1 = defpackage.x2f.a
            w2f r4 = new w2f
            long r5 = java.lang.System.currentTimeMillis()
            r4.<init>(r0, r5)
            r1.put(r2, r4)
        L_0x0202:
            java.lang.String r1 = r3.g
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0209
            goto L_0x0222
        L_0x0209:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0222
            tn7 r3 = defpackage.tn7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch video. Finish fetch, getVideoContent: processFetchResult for videoContent "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r1, r4, r11)
        L_0x0222:
            return r0
        L_0x0223:
            java.lang.String r0 = r7.g
            java.lang.String r1 = "Fetch video. Video hosting in black list"
            udd.q(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4f.b(o10, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String c(o10 o10) {
        long j;
        boolean L = ete.L(o10);
        boolean i = o10.i();
        String str = o10.r;
        if (i) {
            j = o10.d.a;
        } else {
            if (!L) {
                str = "";
            }
            j = 0;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (zl3.e(new File(str))) {
            return str;
        }
        if (j == 0) {
            return null;
        }
        File s = ((mg5) this.e).s(j);
        if (zl3.e(s)) {
            return s.getAbsolutePath();
        }
        return null;
    }
}
