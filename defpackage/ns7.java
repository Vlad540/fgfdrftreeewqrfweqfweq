package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ns7  reason: default package */
public final class ns7 implements i13, i83, goe, x89, j26, vu9, gw3, tyd, Provider {
    public static final ns7 X = new ns7(3);
    public static final ns7 Y = new ns7(4);
    public static final ns7 Z = new ns7(5);
    public static final ns7 b = new ns7(1);
    public static final ns7 c = new ns7(2);
    public static Context o;
    public final /* synthetic */ int a;

    public /* synthetic */ ns7(int i) {
        this.a = i;
    }

    public static m68 c(int i) {
        Object obj;
        pz4 pz4 = m68.Z;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((m68) obj).ordinal() == i) {
                break;
            }
        }
        m68 m68 = (m68) obj;
        return m68 == null ? m68.b : m68;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(long r8, int r10, et0 r11, defpackage.jv5 r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof xl2
            if (r0 == 0) goto L_0x0014
            r0 = r14
            xl2 r0 = (xl2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.w0 = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            xl2 r0 = new xl2
            r0.<init>(r7, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r7 = r6.Y
            pu3 r14 = pu3.a
            int r0 = r6.w0
            r1 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r1) goto L_0x002d
            int r10 = r6.X
            boolean r13 = r6.o
            wx3.H(r7)
            goto L_0x0063
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            wx3.H(r7)
            r7 = 0
            if (r12 == 0) goto L_0x003f
            java.util.Set r0 = r12.a
            r2 = r0
            goto L_0x0040
        L_0x003f:
            r2 = r7
        L_0x0040:
            if (r12 == 0) goto L_0x0046
            java.lang.Long r0 = r12.b
            r3 = r0
            goto L_0x0047
        L_0x0046:
            r3 = r7
        L_0x0047:
            if (r12 == 0) goto L_0x004b
            java.lang.CharSequence r7 = r12.d
        L_0x004b:
            r4 = r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r8)
            java.util.Set r5 = java.util.Collections.singleton(r7)
            r6.o = r13
            r6.X = r10
            r6.w0 = r1
            r1 = r11
            java.lang.Object r7 = r1.a(r2, r3, r4, r5, r6)
            if (r7 != r14) goto L_0x0063
            return r14
        L_0x0063:
            gv5 r7 = (gv5) r7
            yl2 r8 = new yl2
            r8.<init>(r10, r7, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns7.a(long, int, et0, jv5, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object apply(Object obj) {
        return obj;
    }

    public yu9 call() {
        return new ArrayList(16);
    }

    public Object f(ws8 ws8) {
        long j = 0;
        try {
            j = jjd.J(ws8, 0);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t != 0) {
                if (t != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public Object get() {
        return new eye(0);
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(eo0.class, Executor.class)));
    }

    /* JADX WARNING: type inference failed for: r0v48, types: [x89, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r23.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01c7, code lost:
        r7 = r0;
        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", r7);
        r0 = defpackage.uzc.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d5, code lost:
        if (r0.hasNext() != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01d7, code lost:
        ((ny9) r0.next()).getClass();
        ny9.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e4, code lost:
        r0 = hr1.t(defpackage.m4b.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ea, code lost:
        if (r0 != 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ed, code lost:
        if (r0 != 1) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f4, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f5, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0201, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r4 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.lbe q(defpackage.ws8 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r0 = r0.a
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            switch(r0) {
                case 1: goto L_0x0242;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "NotifMsgDelayedCmd"
            java.lang.String r4 = "response"
            udd.q(r0, r4)
            r4 = 1
            int r0 = jjd.K(r23)     // Catch:{ all -> 0x001b }
            r6 = r0
            goto L_0x004b
        L_0x001b:
            r0 = move-exception
            r6 = r0
            udd.S(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0039
            java.lang.Object r7 = r0.next()
            ny9 r7 = (ny9) r7
            r7.getClass()
            ny9.a(r6)
            goto L_0x0026
        L_0x0039:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0049
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0049:
            throw r6
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 != 0) goto L_0x0050
            r7 = 0
            goto L_0x0241
        L_0x0050:
            qw4 r8 = qw4.a
            r9 = 5
            r10 = 0
            r20 = r8
            r18 = r9
            r14 = r10
            r16 = r14
            r12 = 0
            r19 = 0
        L_0x005f:
            if (r12 >= r6) goto L_0x023b
            java.lang.String r0 = jjd.M(r23)     // Catch:{ all -> 0x0066 }
            goto L_0x0096
        L_0x0066:
            r0 = move-exception
            r13 = r0
            udd.S(r3, r2, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L_0x0084
            java.lang.Object r21 = r0.next()
            ny9 r21 = (ny9) r21
            r21.getClass()
            ny9.a(r13)
            goto L_0x0071
        L_0x0084:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0095
            if (r0 == r4) goto L_0x0094
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0094:
            throw r13
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 != 0) goto L_0x009c
        L_0x0098:
            r9 = r4
            r4 = r10
            goto L_0x0234
        L_0x009c:
            int r13 = r0.hashCode()
            switch(r13) {
                case -1690743503: goto L_0x01b9;
                case -1361631597: goto L_0x0173;
                case -907060194: goto L_0x00f4;
                case -836030906: goto L_0x00b4;
                case 954925063: goto L_0x00a6;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r4 = r10
            goto L_0x01c2
        L_0x00a6:
            java.lang.String r13 = "message"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00af
            goto L_0x00a3
        L_0x00af:
            ym8 r19 = hhd.H(r23)
            goto L_0x0098
        L_0x00b4:
            java.lang.String r13 = "userId"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00a3
        L_0x00bd:
            long r16 = jjd.J(r1, r10)     // Catch:{ all -> 0x00c2 }
            goto L_0x0098
        L_0x00c2:
            r0 = move-exception
            r13 = r0
            udd.S(r3, r2, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x00e0
            java.lang.Object r16 = r0.next()
            ny9 r16 = (ny9) r16
            r16.getClass()
            ny9.a(r13)
            goto L_0x00cd
        L_0x00e0:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x00f1
            if (r0 == r4) goto L_0x00f0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f0:
            throw r13
        L_0x00f1:
            r16 = r10
            goto L_0x0098
        L_0x00f4:
            java.lang.String r13 = "updateTypeId"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00fd
            goto L_0x00a3
        L_0x00fd:
            java.lang.Byte r0 = jjd.F(r23)     // Catch:{ all -> 0x0102 }
            goto L_0x0132
        L_0x0102:
            r0 = move-exception
            r13 = r0
            udd.S(r3, r2, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x010d:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x0120
            java.lang.Object r18 = r0.next()
            ny9 r18 = (ny9) r18
            r18.getClass()
            ny9.a(r13)
            goto L_0x010d
        L_0x0120:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0131
            if (r0 == r4) goto L_0x0130
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0130:
            throw r13
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r0 != 0) goto L_0x0137
        L_0x0134:
            r18 = r9
            goto L_0x016f
        L_0x0137:
            int[] r13 = hr1.w(r9)
            int r5 = r13.length
            r7 = 0
        L_0x013d:
            if (r7 >= r5) goto L_0x016a
            r9 = r13[r7]
            r4 = 1
            if (r9 == r4) goto L_0x015b
            r4 = 2
            if (r9 == r4) goto L_0x0159
            r4 = 3
            if (r9 == r4) goto L_0x0157
            r4 = 4
            if (r9 == r4) goto L_0x0155
            r4 = 5
            if (r9 != r4) goto L_0x0153
            r4 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x015c
        L_0x0153:
            r0 = 0
            throw r0
        L_0x0155:
            r4 = 3
            goto L_0x015c
        L_0x0157:
            r4 = 2
            goto L_0x015c
        L_0x0159:
            r4 = 1
            goto L_0x015c
        L_0x015b:
            r4 = 0
        L_0x015c:
            byte r10 = r0.byteValue()
            if (r4 != r10) goto L_0x0163
            goto L_0x016b
        L_0x0163:
            int r7 = r7 + 1
            r4 = 1
            r9 = 5
            r10 = 0
            goto L_0x013d
        L_0x016a:
            r9 = 0
        L_0x016b:
            if (r9 != 0) goto L_0x0134
            r9 = 5
            goto L_0x0134
        L_0x016f:
            r4 = 0
            goto L_0x0201
        L_0x0173:
            java.lang.String r4 = "chatId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x017e
            r4 = 0
            goto L_0x01c2
        L_0x017e:
            r4 = 0
            long r9 = jjd.J(r1, r4)     // Catch:{ all -> 0x0187 }
            r14 = r9
            goto L_0x0201
        L_0x0187:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0192:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01a5
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r7)
            goto L_0x0192
        L_0x01a5:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x01b7
            r9 = 1
            if (r0 == r9) goto L_0x01b6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b6:
            throw r7
        L_0x01b7:
            r14 = r4
            goto L_0x0201
        L_0x01b9:
            r4 = r10
            java.lang.String r7 = "messageIds"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01f6
        L_0x01c2:
            r23.z()     // Catch:{ all -> 0x01c6 }
            goto L_0x0201
        L_0x01c6:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d1:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01e4
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r7)
            goto L_0x01d1
        L_0x01e4:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0201
            r9 = 1
            if (r0 == r9) goto L_0x01f5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f5:
            throw r7
        L_0x01f6:
            m54 r0 = new m54     // Catch:{ all -> 0x0203 }
            r0.<init>()     // Catch:{ all -> 0x0203 }
            java.util.Set r0 = jjd.U(r1, r0)     // Catch:{ all -> 0x0203 }
            r20 = r0
        L_0x0201:
            r9 = 1
            goto L_0x0234
        L_0x0203:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.uzc.a
            java.util.Iterator r7 = r7.iterator()
        L_0x020d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0220
            java.lang.Object r9 = r7.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r0)
            goto L_0x020d
        L_0x0220:
            int r7 = defpackage.m4b.a
            int r7 = hr1.t(r7)
            r9 = 1
            if (r7 == 0) goto L_0x0232
            if (r7 == r9) goto L_0x0231
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0231:
            throw r0
        L_0x0232:
            r20 = r8
        L_0x0234:
            int r12 = r12 + 1
            r10 = r4
            r4 = r9
            r9 = 5
            goto L_0x005f
        L_0x023b:
            fm9 r7 = new fm9
            r13 = r7
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x0241:
            return r7
        L_0x0242:
            boolean r0 = r23.m()
            r4 = 0
            if (r0 != 0) goto L_0x024b
            goto L_0x0387
        L_0x024b:
            r5 = 1
            r6 = 0
            int r0 = jjd.K(r23)     // Catch:{ all -> 0x0253 }
            r7 = r0
            goto L_0x0283
        L_0x0253:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025e:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0271
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x025e
        L_0x0271:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0282
            if (r0 == r5) goto L_0x0281
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0281:
            throw r7
        L_0x0282:
            r7 = r6
        L_0x0283:
            if (r7 != 0) goto L_0x0287
            goto L_0x0387
        L_0x0287:
            hw4 r8 = hw4.a
            r9 = r4
            r10 = r8
        L_0x028b:
            if (r6 >= r7) goto L_0x0382
            java.lang.String r0 = jjd.M(r23)     // Catch:{ all -> 0x0292 }
            goto L_0x02c2
        L_0x0292:
            r0 = move-exception
            r11 = r0
            udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x029d:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x02b0
            java.lang.Object r12 = r0.next()
            ny9 r12 = (ny9) r12
            r12.getClass()
            ny9.a(r11)
            goto L_0x029d
        L_0x02b0:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x02c1
            if (r0 == r5) goto L_0x02c0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c0:
            throw r11
        L_0x02c1:
            r0 = r4
        L_0x02c2:
            if (r0 != 0) goto L_0x02c6
            goto L_0x037e
        L_0x02c6:
            java.lang.String r11 = "commands"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x030c
            gf6 r0 = new gf6     // Catch:{ all -> 0x02db }
            r10 = 7
            r0.<init>(r10)     // Catch:{ all -> 0x02db }
            java.util.ArrayList r0 = jjd.T(r1, r0)     // Catch:{ all -> 0x02db }
            r10 = r0
            goto L_0x037e
        L_0x02db:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.uzc.a
            java.util.Iterator r10 = r10.iterator()
        L_0x02e5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02f8
            java.lang.Object r11 = r10.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r0)
            goto L_0x02e5
        L_0x02f8:
            int r10 = defpackage.m4b.a
            int r10 = hr1.t(r10)
            if (r10 == 0) goto L_0x0309
            if (r10 == r5) goto L_0x0308
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0308:
            throw r0
        L_0x0309:
            r10 = r8
            goto L_0x037e
        L_0x030c:
            java.lang.String r11 = "contact"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x034b
            uj3 r0 = defpackage.uj3.e(r23)     // Catch:{ all -> 0x031a }
            r9 = r0
            goto L_0x037e
        L_0x031a:
            r0 = move-exception
            r9 = r0
            udd.S(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0325:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0338
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r9)
            goto L_0x0325
        L_0x0338:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0349
            if (r0 == r5) goto L_0x0348
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0348:
            throw r9
        L_0x0349:
            r9 = r4
            goto L_0x037e
        L_0x034b:
            r23.z()     // Catch:{ all -> 0x034f }
            goto L_0x037e
        L_0x034f:
            r0 = move-exception
            r11 = r0
            udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x035a:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x036d
            java.lang.Object r12 = r0.next()
            ny9 r12 = (ny9) r12
            r12.getClass()
            ny9.a(r11)
            goto L_0x035a
        L_0x036d:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x037e
            if (r0 == r5) goto L_0x037d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x037d:
            throw r11
        L_0x037e:
            int r6 = r6 + 1
            goto L_0x028b
        L_0x0382:
            dp0 r4 = new dp0
            r4.<init>(r10, r9)
        L_0x0387:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns7.q(ws8):lbe");
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "IdentityFunction";
            case 13:
                return "MediaItemType";
            default:
                return super.toString();
        }
    }

    public ns7(HashMap hashMap) {
        this.a = 10;
        hashMap.size();
    }

    public ns7(ru1 ru1) {
        this.a = 9;
    }

    public ns7() {
        this.a = 7;
        new LinkedHashSet(20);
    }
}
