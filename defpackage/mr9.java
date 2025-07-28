package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: mr9  reason: default package */
public final class mr9 {
    public static final /* synthetic */ int e = 0;
    public final pae a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public mr9(t97 t97, t97 t972, t97 t973, pae pae) {
        this.a = pae;
        this.b = t97;
        this.c = t972;
        this.d = t973;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.mr9 r4, java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.er9
            if (r0 == 0) goto L_0x0016
            r0 = r6
            er9 r0 = (defpackage.er9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            er9 r0 = new er9
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            wx3.H(r6)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            goto L_0x004a
        L_0x002a:
            r4 = move-exception
            goto L_0x004c
        L_0x002c:
            r4 = move-exception
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            wx3.H(r6)
            t97 r4 = r4.b     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            na5 r4 = (defpackage.na5) r4     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            r0.Y = r3     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            java.lang.Object r6 = r4.b(r5, r0)     // Catch:{ CancellationException -> 0x002c, all -> 0x002a }
            if (r6 != r1) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            r1 = r6
            goto L_0x0056
        L_0x004c:
            java.lang.String r5 = "mr9"
            java.lang.String r6 = "getAnalyticsEntries: failed"
            udd.o(r5, r6, r4)
            hw4 r4 = hw4.a
            r1 = r4
        L_0x0056:
            return r1
        L_0x0057:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr9.a(mr9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.mr9 r7, long r8, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof defpackage.fr9
            if (r0 == 0) goto L_0x0017
            r0 = r12
            fr9 r0 = (defpackage.fr9) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0017
            int r1 = r1 - r2
            r0.w0 = r1
        L_0x0015:
            r6 = r0
            goto L_0x001d
        L_0x0017:
            fr9 r0 = new fr9
            r0.<init>(r7, r12)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r12 = r6.Y
            pu3 r0 = pu3.a
            int r1 = r6.w0
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            long r10 = r6.X
            long r8 = r6.o
            wx3.H(r12)     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            goto L_0x0057
        L_0x0030:
            r7 = move-exception
            goto L_0x0059
        L_0x0032:
            r7 = move-exception
            goto L_0x006f
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            wx3.H(r12)
            t97 r7 = r7.d     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r1 = r7
            ur9 r1 = (defpackage.ur9) r1     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.o = r8     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.X = r10     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r6.w0 = r2     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b(r2, r4, r6)     // Catch:{ CancellationException -> 0x0032, all -> 0x0030 }
            if (r12 != r0) goto L_0x0057
            goto L_0x006e
        L_0x0057:
            r0 = r12
            goto L_0x006e
        L_0x0059:
            java.lang.String r12 = "getProcessedMessage: failed for chatServerId="
            java.lang.String r0 = ", messageId="
            java.lang.StringBuilder r8 = hr1.k(r8, r12, r0)
            java.lang.String r9 = " "
            java.lang.String r8 = defpackage.wn6.k(r8, r10, r9)
            java.lang.String r9 = "mr9"
            udd.o(r9, r8, r7)
            r7 = 0
            r0 = r7
        L_0x006e:
            return r0
        L_0x006f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr9.b(mr9, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(mr9 mr9, List list, List list2, boolean z, Continuation continuation) {
        Object obj;
        mr9.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            oa5 oa5 = (oa5) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                qr9 qr9 = (qr9) obj;
                if (qr9.a == oa5.b && qr9.b == oa5.c) {
                    break;
                }
            }
            qr9 qr92 = (qr9) obj;
            if (qr92 != null) {
                boolean z2 = qr92 instanceof pr9;
                long j = qr92.a;
                long j2 = qr92.b;
                if (z2) {
                    StringBuilder k = hr1.k(j2, "onMessagesProcessed: show, messageId=", ", chatId=");
                    k.append(j);
                    udd.q("mr9", k.toString());
                    boolean z3 = ((pr9) qr92).d;
                    nr9 e2 = mr9.e();
                    e2.getClass();
                    String str = oa5.k;
                    try {
                        if (str.length() != 0) {
                            kgd kgd = new kgd(0);
                            nr9.a(kgd, oa5);
                            kgd.put("p_op", "show");
                            e2.b().b(str, kgd);
                        }
                    } catch (Exception e3) {
                        udd.s(nr9.d, "onNotificationShow: failed", e3);
                        e2.c().c(new Exception("failed to log notification show", e3), true);
                    }
                    arrayList.add(oa5.a(oa5));
                } else if (qr92 instanceof or9) {
                    StringBuilder k2 = hr1.k(j2, "onMessagesProcessed: drop, messageId=", ", chatId=");
                    k2.append(j);
                    k2.append(", reason=");
                    ep4 ep4 = ((or9) qr92).d;
                    k2.append(ep4);
                    udd.q("mr9", k2.toString());
                    nr9 e4 = mr9.e();
                    e4.getClass();
                    String str2 = oa5.k;
                    try {
                        if (str2.length() != 0) {
                            HashMap hashMap = new HashMap();
                            nr9.a(hashMap, oa5);
                            hashMap.put("p_op", "drop");
                            hashMap.put("p_dr", ep4.a);
                            e4.b().b(str2, hashMap);
                        }
                    } catch (Exception e5) {
                        udd.s(nr9.d, "onNotificationShow: failed", e5);
                        e4.c().c(new Exception("failed to log notification drop", e5), true);
                    }
                    arrayList.add(oa5.a(oa5));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        boolean z4 = !arrayList.isEmpty();
        jue jue = jue.a;
        if (!z4) {
            return jue;
        }
        mr9 mr92 = mr9;
        Object h = mr9.h(arrayList, continuation);
        return h == pu3.a ? h : jue;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.mr9 r4, java.util.ArrayList r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.lr9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            lr9 r0 = (defpackage.lr9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            lr9 r0 = new lr9
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wx3.H(r6)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            goto L_0x0059
        L_0x0027:
            r4 = move-exception
            goto L_0x0052
        L_0x0029:
            r4 = move-exception
            goto L_0x005c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            wx3.H(r6)
            t97 r4 = r4.d     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            ur9 r4 = (defpackage.ur9) r4     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r4.getClass()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            tr9 r6 = new tr9     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            aec r4 = r4.a     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r1g.h(r4, r6, r0)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            if (r4 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0052:
            java.lang.String r5 = "mr9"
            java.lang.String r6 = "storeMessagesProcessed: failed "
            udd.o(r5, r6, r4)
        L_0x0059:
            jue r1 = jue.a
        L_0x005b:
            return r1
        L_0x005c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr9.d(mr9, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final nr9 e() {
        return (nr9) this.c.getValue();
    }

    public final Object f(cb5 cb5, oa5 oa5, fjb fjb) {
        Object U = xs7.U(this.a.b(), new gr9(oa5, this, cb5, (Continuation) null), fjb);
        return U == pu3.a ? U : jue.a;
    }

    public final Object g(long j, long j2, Continuation continuation) {
        Object U = xs7.U(this.a.b(), new ir9(this, j, j2, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jr9
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jr9 r0 = (defpackage.jr9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            jr9 r0 = new jr9
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wx3.H(r6)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            goto L_0x005a
        L_0x0027:
            r4 = move-exception
            goto L_0x0053
        L_0x0029:
            r4 = move-exception
            goto L_0x005d
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            wx3.H(r6)
            t97 r4 = r4.b     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            na5 r4 = (defpackage.na5) r4     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r0.Y = r3     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r4.getClass()     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            uh r6 = new uh     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            r2 = 8
            r6.<init>(r4, r2, r5)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            aec r4 = r4.a     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            java.lang.Object r4 = r1g.h(r4, r6, r0)     // Catch:{ CancellationException -> 0x0029, all -> 0x0027 }
            if (r4 != r1) goto L_0x005a
            return r1
        L_0x0053:
            java.lang.String r5 = "mr9"
            java.lang.String r6 = "putAnalyticsEntries: failed"
            udd.o(r5, r6, r4)
        L_0x005a:
            jue r4 = jue.a
            return r4
        L_0x005d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr9.h(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
