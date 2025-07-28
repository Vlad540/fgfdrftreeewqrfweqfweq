package defpackage;

import android.media.MediaDrmException;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g02  reason: default package */
public final class g02 implements of3, i13, y1e, n96, l35 {
    public static final g02 X = new g02(4);
    public static final g02 Y = new g02(5);
    public static final /* synthetic */ g02 Z = new g02(6);
    public static final long[] b = new long[0];
    public static final g02 c = new g02(2);
    public static final g02 o = new g02(3);
    public static g02 w0;
    public final /* synthetic */ int a;

    public /* synthetic */ g02(int i) {
        this.a = i;
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public void accept(Object obj) {
        z2f z2f = (z2f) obj;
        if (!z2f.b || !lp.o(z2f.d)) {
            throw new RuntimeException("conversion failed");
        }
    }

    public j35 b() {
        throw new IllegalStateException();
    }

    public lw3 c(byte[] bArr) {
        throw new IllegalStateException();
    }

    public byte[] d() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public boolean e(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void h(byte[] bArr) {
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public h35 k(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public int l() {
        return 1;
    }

    public void n(lv1 lv1) {
    }

    public n6g o(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = zgc.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? gwf.o(bundle) : gwf.o((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0311, code lost:
        r32 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0315, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0352, code lost:
        r32 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0356, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        r35.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x05eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x05ec, code lost:
        r4 = r0;
        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", r4);
        r0 = defpackage.uzc.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x05fa, code lost:
        if (r0.hasNext() != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x05fc, code lost:
        ((ny9) r0.next()).getClass();
        ny9.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0609, code lost:
        r0 = hr1.t(defpackage.m4b.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x060f, code lost:
        if (r0 != 0) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0612, code lost:
        if (r0 != 1) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0619, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x061a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r32 = r6;
        r33 = r7;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0159, code lost:
        r32 = r6;
        r33 = r7;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
        r10 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.lbe q(defpackage.ws8 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            int r0 = r0.a
            switch(r0) {
                case 3: goto L_0x0680;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            long r21 = java.lang.System.nanoTime()
            boolean r0 = r35.m()
            if (r0 != 0) goto L_0x001e
            jo7 r0 = new jo7
            r0.<init>()
            goto L_0x067f
        L_0x001e:
            r4 = 1
            int r0 = jjd.K(r35)     // Catch:{ all -> 0x0025 }
            r6 = r0
            goto L_0x0055
        L_0x0025:
            r0 = move-exception
            r6 = r0
            udd.S(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0043
            java.lang.Object r7 = r0.next()
            ny9 r7 = (ny9) r7
            r7.getClass()
            ny9.a(r6)
            goto L_0x0030
        L_0x0043:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0054
            if (r0 == r4) goto L_0x0053
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0053:
            throw r6
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 != 0) goto L_0x005e
            jo7 r0 = new jo7
            r0.<init>()
            goto L_0x067f
        L_0x005e:
            hw4 r7 = hw4.a
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r10 = 0
            r15 = r7
            r16 = r15
            r18 = r10
            r23 = r18
            r26 = r23
            r5 = 0
            r12 = 0
            r17 = 0
            r20 = 0
            r25 = 0
            r28 = 0
        L_0x0084:
            if (r5 >= r6) goto L_0x0664
            java.lang.String r0 = jjd.M(r35)     // Catch:{ all -> 0x008b }
            goto L_0x00bb
        L_0x008b:
            r0 = move-exception
            r9 = r0
            udd.S(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x00a9
            java.lang.Object r29 = r0.next()
            ny9 r29 = (ny9) r29
            r29.getClass()
            ny9.a(r9)
            goto L_0x0096
        L_0x00a9:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x00ba
            if (r0 == r4) goto L_0x00b9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b9:
            throw r9
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 != 0) goto L_0x00c5
            r32 = r6
            r33 = r7
            r6 = r10
            r10 = r4
            goto L_0x065a
        L_0x00c5:
            int r9 = r0.hashCode()
            java.lang.String r4 = "chats"
            switch(r9) {
                case -1900708191: goto L_0x05d9;
                case -1849019982: goto L_0x058e;
                case -1354792126: goto L_0x057a;
                case -1323779342: goto L_0x041f;
                case -1276666629: goto L_0x035a;
                case -567451565: goto L_0x0309;
                case -462094004: goto L_0x0243;
                case -309425751: goto L_0x01ff;
                case 3560141: goto L_0x01bc;
                case 94425557: goto L_0x01a1;
                case 94623771: goto L_0x0161;
                case 110541305: goto L_0x0117;
                case 1097076194: goto L_0x00d5;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r32 = r6
            r33 = r7
            r6 = r10
            goto L_0x05e6
        L_0x00d5:
            java.lang.String r4 = "resetAt"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00de
            goto L_0x00ce
        L_0x00de:
            long r26 = jjd.J(r1, r10)     // Catch:{ all -> 0x00e4 }
            goto L_0x0159
        L_0x00e4:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ef:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0102
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x00ef
        L_0x0102:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0114
            r9 = 1
            if (r0 == r9) goto L_0x0113
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0113:
            throw r4
        L_0x0114:
            r26 = r10
            goto L_0x0159
        L_0x0117:
            java.lang.String r4 = "token"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0120
            goto L_0x00ce
        L_0x0120:
            java.lang.String r0 = jjd.M(r35)     // Catch:{ all -> 0x0127 }
            r17 = r0
            goto L_0x0159
        L_0x0127:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0145
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x0132
        L_0x0145:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0157
            r9 = 1
            if (r0 == r9) goto L_0x0156
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0156:
            throw r4
        L_0x0157:
            r17 = 0
        L_0x0159:
            r32 = r6
            r33 = r7
            r6 = r10
        L_0x015e:
            r10 = 1
            goto L_0x065a
        L_0x0161:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0169
            goto L_0x00ce
        L_0x0169:
            zy r0 = defpackage.zy.b(r35)     // Catch:{ all -> 0x016f }
            r15 = r0
            goto L_0x0159
        L_0x016f:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x017a:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x018d
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x017a
        L_0x018d:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x019f
            r9 = 1
            if (r0 == r9) goto L_0x019e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x019e:
            throw r4
        L_0x019f:
            r15 = r7
            goto L_0x0159
        L_0x01a1:
            java.lang.String r4 = "calls"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01ab
            goto L_0x00ce
        L_0x01ab:
            int r0 = jjd.D(r35)
            r4 = 0
        L_0x01b0:
            if (r4 >= r0) goto L_0x0159
            y1f r9 = defpackage.y1f.a(r35)
            r14.add(r9)
            int r4 = r4 + 1
            goto L_0x01b0
        L_0x01bc:
            java.lang.String r4 = "time"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01c6
            goto L_0x00ce
        L_0x01c6:
            long r18 = jjd.J(r1, r10)     // Catch:{ all -> 0x01cb }
            goto L_0x0159
        L_0x01cb:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d6:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01e9
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x01d6
        L_0x01e9:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x01fb
            r9 = 1
            if (r0 == r9) goto L_0x01fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fa:
            throw r4
        L_0x01fb:
            r18 = r10
            goto L_0x0159
        L_0x01ff:
            java.lang.String r4 = "profile"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0209
            goto L_0x00ce
        L_0x0209:
            uj3 r0 = defpackage.uj3.e(r35)     // Catch:{ all -> 0x0210 }
            r12 = r0
            goto L_0x0159
        L_0x0210:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x021b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x022e
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x021b
        L_0x022e:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0240
            r9 = 1
            if (r0 == r9) goto L_0x023f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x023f:
            throw r4
        L_0x0240:
            r12 = 0
            goto L_0x0159
        L_0x0243:
            java.lang.String r4 = "messages"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x024d
            goto L_0x00ce
        L_0x024d:
            int r0 = jjd.K(r35)     // Catch:{ all -> 0x0253 }
            r4 = r0
            goto L_0x0284
        L_0x0253:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025e:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0271
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x025e
        L_0x0271:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0283
            r9 = 1
            if (r0 == r9) goto L_0x0282
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0282:
            throw r4
        L_0x0283:
            r4 = 0
        L_0x0284:
            r9 = 0
        L_0x0285:
            if (r9 >= r4) goto L_0x0159
            long r30 = jjd.J(r1, r10)     // Catch:{ all -> 0x028e }
            r10 = r30
            goto L_0x02c0
        L_0x028e:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0299:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x02ac
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r10)
            goto L_0x0299
        L_0x02ac:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x02be
            r11 = 1
            if (r0 == r11) goto L_0x02bd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02bd:
            throw r10
        L_0x02be:
            r10 = 0
        L_0x02c0:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            zy r0 = defpackage.zy.e(r35)     // Catch:{ all -> 0x02cb }
            r32 = r4
            goto L_0x02fe
        L_0x02cb:
            r0 = move-exception
            r11 = r0
            udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02d6:
            boolean r32 = r0.hasNext()
            if (r32 == 0) goto L_0x02e9
            java.lang.Object r32 = r0.next()
            ny9 r32 = (ny9) r32
            r32.getClass()
            ny9.a(r11)
            goto L_0x02d6
        L_0x02e9:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x02fb
            r4 = 1
            if (r0 == r4) goto L_0x02fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02fa:
            throw r11
        L_0x02fb:
            r32 = r4
            r0 = r7
        L_0x02fe:
            r13.put(r10, r0)
            int r9 = r9 + 1
            r4 = r32
            r10 = 0
            goto L_0x0285
        L_0x0309:
            java.lang.String r4 = "contacts"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0319
        L_0x0311:
            r32 = r6
            r33 = r7
        L_0x0315:
            r6 = 0
            goto L_0x05e6
        L_0x0319:
            zy r0 = defpackage.zy.c(r35)     // Catch:{ all -> 0x0320 }
            r16 = r0
            goto L_0x0352
        L_0x0320:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x032b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x033e
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x032b
        L_0x033e:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0350
            r9 = 1
            if (r0 == r9) goto L_0x034f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x034f:
            throw r4
        L_0x0350:
            r16 = r7
        L_0x0352:
            r32 = r6
            r33 = r7
        L_0x0356:
            r6 = 0
            goto L_0x015e
        L_0x035a:
            java.lang.String r4 = "presence"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0363
        L_0x0362:
            goto L_0x0311
        L_0x0363:
            int r0 = jjd.K(r35)     // Catch:{ all -> 0x0369 }
            r4 = r0
            goto L_0x039a
        L_0x0369:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0374:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0387
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x0374
        L_0x0387:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0399
            r9 = 1
            if (r0 == r9) goto L_0x0398
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0398:
            throw r4
        L_0x0399:
            r4 = 0
        L_0x039a:
            r9 = 0
        L_0x039b:
            if (r9 >= r4) goto L_0x0352
            r10 = 0
            long r32 = jjd.J(r1, r10)     // Catch:{ all -> 0x03a6 }
            r10 = r32
            goto L_0x03d8
        L_0x03a6:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03b1:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x03c4
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r10)
            goto L_0x03b1
        L_0x03c4:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x03d6
            r11 = 1
            if (r0 == r11) goto L_0x03d5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03d5:
            throw r10
        L_0x03d6:
            r10 = 0
        L_0x03d8:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            m2b r0 = defpackage.m2b.a(r35)     // Catch:{ all -> 0x03e3 }
            r32 = r4
            goto L_0x0416
        L_0x03e3:
            r0 = move-exception
            r11 = r0
            udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03ee:
            boolean r32 = r0.hasNext()
            if (r32 == 0) goto L_0x0401
            java.lang.Object r32 = r0.next()
            ny9 r32 = (ny9) r32
            r32.getClass()
            ny9.a(r11)
            goto L_0x03ee
        L_0x0401:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0413
            r4 = 1
            if (r0 == r4) goto L_0x0412
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0412:
            throw r11
        L_0x0413:
            r32 = r4
            r0 = 0
        L_0x0416:
            r8.put(r10, r0)
            int r9 = r9 + 1
            r4 = r32
            goto L_0x039b
        L_0x041f:
            java.lang.String r9 = "drafts"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0429
            goto L_0x0362
        L_0x0429:
            int r0 = jjd.K(r35)     // Catch:{ all -> 0x042f }
            r9 = r0
            goto L_0x0460
        L_0x042f:
            r0 = move-exception
            r9 = r0
            udd.S(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x043a:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x044d
            java.lang.Object r10 = r0.next()
            ny9 r10 = (ny9) r10
            r10.getClass()
            ny9.a(r9)
            goto L_0x043a
        L_0x044d:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x045f
            r10 = 1
            if (r0 == r10) goto L_0x045e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x045e:
            throw r9
        L_0x045f:
            r9 = 0
        L_0x0460:
            if (r9 != 0) goto L_0x046a
            r32 = r6
            r33 = r7
            r28 = 0
            goto L_0x0356
        L_0x046a:
            r32 = r6
            r6 = 0
            r10 = 0
            r11 = 0
        L_0x046f:
            if (r10 >= r9) goto L_0x056f
            java.lang.String r0 = jjd.M(r35)     // Catch:{ all -> 0x047a }
            r33 = r7
            r28 = r9
            goto L_0x04af
        L_0x047a:
            r0 = move-exception
            r33 = r7
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0487:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x049a
            java.lang.Object r28 = r0.next()
            ny9 r28 = (ny9) r28
            r28.getClass()
            ny9.a(r7)
            goto L_0x0487
        L_0x049a:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x04ac
            r9 = 1
            if (r0 == r9) goto L_0x04ab
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ab:
            throw r7
        L_0x04ac:
            r28 = r9
            r0 = 0
        L_0x04af:
            if (r0 != 0) goto L_0x04b3
            goto L_0x0567
        L_0x04b3:
            boolean r7 = r0.equals(r4)
            if (r7 == 0) goto L_0x04f3
            em4 r0 = r1g.o(r35)     // Catch:{ all -> 0x04c0 }
            r11 = r0
            goto L_0x0567
        L_0x04c0:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04cb:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x04de
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r7)
            goto L_0x04cb
        L_0x04de:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x04f0
            r9 = 1
            if (r0 == r9) goto L_0x04ef
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ef:
            throw r7
        L_0x04f0:
            r11 = 0
            goto L_0x0567
        L_0x04f3:
            java.lang.String r7 = "users"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0533
            em4 r0 = r1g.o(r35)     // Catch:{ all -> 0x0501 }
            r6 = r0
            goto L_0x0567
        L_0x0501:
            r0 = move-exception
            r6 = r0
            udd.S(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x050c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x051f
            java.lang.Object r7 = r0.next()
            ny9 r7 = (ny9) r7
            r7.getClass()
            ny9.a(r6)
            goto L_0x050c
        L_0x051f:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0531
            r7 = 1
            if (r0 == r7) goto L_0x0530
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0530:
            throw r6
        L_0x0531:
            r6 = 0
            goto L_0x0567
        L_0x0533:
            r35.z()     // Catch:{ all -> 0x0537 }
            goto L_0x0567
        L_0x0537:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0542:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0555
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r7)
            goto L_0x0542
        L_0x0555:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0567
            r9 = 1
            if (r0 == r9) goto L_0x0566
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0566:
            throw r7
        L_0x0567:
            int r10 = r10 + 1
            r9 = r28
            r7 = r33
            goto L_0x046f
        L_0x056f:
            r33 = r7
            pm4 r0 = new pm4
            r0.<init>(r11, r6)
            r28 = r0
            goto L_0x0356
        L_0x057a:
            r32 = r6
            r33 = r7
            java.lang.String r4 = "config"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0588
        L_0x0586:
            goto L_0x0315
        L_0x0588:
            ra3 r20 = wx3.y(r35)
            goto L_0x0356
        L_0x058e:
            r32 = r6
            r33 = r7
            java.lang.String r4 = "chatMarker"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x059b
            goto L_0x0586
        L_0x059b:
            r6 = 0
            long r9 = jjd.J(r1, r6)     // Catch:{ all -> 0x05a5 }
            r23 = r9
            goto L_0x015e
        L_0x05a5:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05b0:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x05c3
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x05b0
        L_0x05c3:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x05d5
            r9 = 1
            if (r0 == r9) goto L_0x05d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05d4:
            throw r4
        L_0x05d5:
            r23 = r6
            goto L_0x015e
        L_0x05d9:
            r32 = r6
            r33 = r7
            r6 = r10
            java.lang.String r4 = "videoChatHistory"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x061b
        L_0x05e6:
            r35.z()     // Catch:{ all -> 0x05eb }
            goto L_0x015e
        L_0x05eb:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05f6:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0609
            java.lang.Object r9 = r0.next()
            ny9 r9 = (ny9) r9
            r9.getClass()
            ny9.a(r4)
            goto L_0x05f6
        L_0x0609:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x015e
            r9 = 1
            if (r0 == r9) goto L_0x061a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x061a:
            throw r4
        L_0x061b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = jjd.E(r35)     // Catch:{ all -> 0x0627 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0627 }
        L_0x0625:
            r10 = 1
            goto L_0x0656
        L_0x0627:
            r0 = move-exception
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x0631:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0644
            java.lang.Object r10 = r9.next()
            ny9 r10 = (ny9) r10
            r10.getClass()
            ny9.a(r0)
            goto L_0x0631
        L_0x0644:
            int r9 = defpackage.m4b.a
            int r9 = hr1.t(r9)
            if (r9 == 0) goto L_0x0625
            r10 = 1
            if (r9 == r10) goto L_0x0655
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0655:
            throw r0
        L_0x0656:
            boolean r25 = r4.booleanValue()
        L_0x065a:
            int r5 = r5 + 1
            r4 = r10
            r10 = r6
            r6 = r32
            r7 = r33
            goto L_0x0084
        L_0x0664:
            jo7 r0 = new jo7
            r4 = r0
            r5 = r12
            r6 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r12 = r20
            r1 = r14
            r14 = r23
            r16 = r1
            r17 = r25
            r18 = r26
            r20 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r20, r21)
        L_0x067f:
            return r0
        L_0x0680:
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            boolean r0 = r35.m()
            r4 = 0
            if (r0 != 0) goto L_0x068d
            goto L_0x0822
        L_0x068d:
            r5 = 1
            r6 = 0
            int r0 = jjd.K(r35)     // Catch:{ all -> 0x0695 }
            r7 = r0
            goto L_0x06c5
        L_0x0695:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06a0:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x06b3
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x06a0
        L_0x06b3:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x06c4
            if (r0 == r5) goto L_0x06c3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06c3:
            throw r7
        L_0x06c4:
            r7 = r6
        L_0x06c5:
            r8 = r4
            r9 = r8
        L_0x06c7:
            if (r6 >= r7) goto L_0x081d
            java.lang.String r0 = jjd.M(r35)     // Catch:{ all -> 0x06ce }
            goto L_0x0701
        L_0x06ce:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)     // Catch:{ all -> 0x06ec }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x06ec }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x06ec }
        L_0x06d9:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x06ec }
            if (r11 == 0) goto L_0x06ef
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x06ec }
            ny9 r11 = (ny9) r11     // Catch:{ all -> 0x06ec }
            r11.getClass()     // Catch:{ all -> 0x06ec }
            ny9.a(r10)     // Catch:{ all -> 0x06ec }
            goto L_0x06d9
        L_0x06ec:
            r0 = move-exception
            goto L_0x07f0
        L_0x06ef:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x06ec }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x06ec }
            if (r0 == 0) goto L_0x0700
            if (r0 == r5) goto L_0x06ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06ec }
            r0.<init>()     // Catch:{ all -> 0x06ec }
            throw r0     // Catch:{ all -> 0x06ec }
        L_0x06ff:
            throw r10     // Catch:{ all -> 0x06ec }
        L_0x0700:
            r0 = r4
        L_0x0701:
            if (r0 == 0) goto L_0x07ec
            java.lang.String r10 = "botId"
            boolean r10 = r0.equals(r10)     // Catch:{ all -> 0x0730 }
            if (r10 == 0) goto L_0x074c
            r10 = 0
            long r10 = jjd.J(r1, r10)     // Catch:{ all -> 0x0712 }
            goto L_0x0746
        L_0x0712:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)     // Catch:{ all -> 0x0730 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x0730 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0730 }
        L_0x071d:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0730 }
            if (r11 == 0) goto L_0x0733
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0730 }
            ny9 r11 = (ny9) r11     // Catch:{ all -> 0x0730 }
            r11.getClass()     // Catch:{ all -> 0x0730 }
            ny9.a(r10)     // Catch:{ all -> 0x0730 }
            goto L_0x071d
        L_0x0730:
            r0 = move-exception
            goto L_0x07bf
        L_0x0733:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x0730 }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x0744
            if (r0 == r5) goto L_0x0743
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0730 }
            r0.<init>()     // Catch:{ all -> 0x0730 }
            throw r0     // Catch:{ all -> 0x0730 }
        L_0x0743:
            throw r10     // Catch:{ all -> 0x0730 }
        L_0x0744:
            r10 = -1
        L_0x0746:
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0730 }
            goto L_0x07ec
        L_0x074c:
            java.lang.String r10 = "startParams"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x078c
            java.lang.String r0 = jjd.M(r35)     // Catch:{ all -> 0x075b }
            r9 = r0
            goto L_0x07ec
        L_0x075b:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)     // Catch:{ all -> 0x0730 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x0730 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0730 }
        L_0x0766:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0730 }
            if (r11 == 0) goto L_0x0779
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0730 }
            ny9 r11 = (ny9) r11     // Catch:{ all -> 0x0730 }
            r11.getClass()     // Catch:{ all -> 0x0730 }
            ny9.a(r10)     // Catch:{ all -> 0x0730 }
            goto L_0x0766
        L_0x0779:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x0730 }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x078a
            if (r0 == r5) goto L_0x0789
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0730 }
            r0.<init>()     // Catch:{ all -> 0x0730 }
            throw r0     // Catch:{ all -> 0x0730 }
        L_0x0789:
            throw r10     // Catch:{ all -> 0x0730 }
        L_0x078a:
            r9 = r4
            goto L_0x07ec
        L_0x078c:
            r35.z()     // Catch:{ all -> 0x0790 }
            goto L_0x07ec
        L_0x0790:
            r0 = move-exception
            r10 = r0
            udd.S(r3, r2, r10)     // Catch:{ all -> 0x0730 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x0730 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0730 }
        L_0x079b:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0730 }
            if (r11 == 0) goto L_0x07ae
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0730 }
            ny9 r11 = (ny9) r11     // Catch:{ all -> 0x0730 }
            r11.getClass()     // Catch:{ all -> 0x0730 }
            ny9.a(r10)     // Catch:{ all -> 0x0730 }
            goto L_0x079b
        L_0x07ae:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x0730 }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x0730 }
            if (r0 == 0) goto L_0x07ec
            if (r0 == r5) goto L_0x07be
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0730 }
            r0.<init>()     // Catch:{ all -> 0x0730 }
            throw r0     // Catch:{ all -> 0x0730 }
        L_0x07be:
            throw r10     // Catch:{ all -> 0x0730 }
        L_0x07bf:
            udd.S(r3, r2, r0)     // Catch:{ all -> 0x06ec }
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.uzc.a     // Catch:{ all -> 0x06ec }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x06ec }
        L_0x07c8:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x06ec }
            if (r11 == 0) goto L_0x07db
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x06ec }
            ny9 r11 = (ny9) r11     // Catch:{ all -> 0x06ec }
            r11.getClass()     // Catch:{ all -> 0x06ec }
            ny9.a(r0)     // Catch:{ all -> 0x06ec }
            goto L_0x07c8
        L_0x07db:
            int r10 = defpackage.m4b.a     // Catch:{ all -> 0x06ec }
            int r10 = hr1.t(r10)     // Catch:{ all -> 0x06ec }
            if (r10 == 0) goto L_0x07ec
            if (r10 == r5) goto L_0x07eb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x06ec }
            r0.<init>()     // Catch:{ all -> 0x06ec }
            throw r0     // Catch:{ all -> 0x06ec }
        L_0x07eb:
            throw r0     // Catch:{ all -> 0x06ec }
        L_0x07ec:
            int r6 = r6 + 1
            goto L_0x06c7
        L_0x07f0:
            udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.uzc.a
            java.util.Iterator r1 = r1.iterator()
        L_0x07f9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x080c
            java.lang.Object r2 = r1.next()
            ny9 r2 = (ny9) r2
            r2.getClass()
            ny9.a(r0)
            goto L_0x07f9
        L_0x080c:
            int r1 = defpackage.m4b.a
            int r1 = hr1.t(r1)
            if (r1 == 0) goto L_0x081d
            if (r1 == r5) goto L_0x081c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x081c:
            throw r0
        L_0x081d:
            d65 r4 = new d65
            r4.<init>(r9, r8)
        L_0x0822:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g02.q(ws8):lbe");
    }

    public void release() {
    }
}
