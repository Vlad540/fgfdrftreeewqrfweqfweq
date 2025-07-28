package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: uj3  reason: default package */
public class uj3 implements Serializable {
    public final String A0;
    public final String B0;
    public final s77 C0;
    public final int[] D0;
    public final List X;
    public final long Y;
    public final long Z;
    public final long a;
    public final long b;
    public final String c;
    public final String o;
    public final ln3 w0;
    public final int x0;
    public final List y0;
    public final String z0;

    public uj3(long j, long j2, String str, String str2, List list, long j3, long j4, ln3 ln3, int i, List list2, String str3, String str4, String str5, s77 s77, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.o = str2;
        List list3 = list;
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparing(new fi3(1)));
        this.X = Collections.unmodifiableList(arrayList);
        this.Y = j3;
        this.Z = j4;
        this.w0 = ln3;
        this.x0 = i == 0 ? 1 : i;
        this.y0 = list2;
        this.z0 = str3;
        this.A0 = str4;
        this.B0 = str5;
        this.C0 = s77;
        this.D0 = iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: jm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: s77} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: jm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: jm3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v10, resolved type: s77} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x038f, code lost:
        r9 = r9 + r6;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0336 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.uj3 e(defpackage.ws8 r33) {
        /*
            int r7 = jjd.K(r33)
            r8 = 0
            if (r7 != 0) goto L_0x0008
            return r8
        L_0x0008:
            r9 = 0
            r16 = r8
            r17 = r16
            r18 = r17
            r23 = r18
            r26 = r23
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r12 = r9
            r14 = r12
            r19 = r14
            r21 = r19
            r9 = 0
            r24 = 0
            r10 = r30
        L_0x0027:
            if (r9 >= r7) goto L_0x0393
            java.lang.String r0 = r33.z0()
            r0.getClass()
            java.lang.String r11 = ""
            int r25 = r0.hashCode()
            switch(r25) {
                case -2078600011: goto L_0x00e8;
                case -1724546052: goto L_0x00dc;
                case -1249512767: goto L_0x00d0;
                case -1249474914: goto L_0x00c4;
                case -913939087: goto L_0x00b8;
                case -892481550: goto L_0x00ad;
                case -863791528: goto L_0x00a2;
                case -595295507: goto L_0x0097;
                case -332625698: goto L_0x008a;
                case -295931082: goto L_0x007d;
                case 3355: goto L_0x0070;
                case 3018746: goto L_0x0063;
                case 3321850: goto L_0x0056;
                case 104585032: goto L_0x0049;
                case 106642798: goto L_0x003c;
                default: goto L_0x0039;
            }
        L_0x0039:
            r0 = -1
            goto L_0x00f3
        L_0x003c:
            java.lang.String r5 = "phone"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0045
            goto L_0x0039
        L_0x0045:
            r0 = 14
            goto L_0x00f3
        L_0x0049:
            java.lang.String r5 = "names"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0052
            goto L_0x0039
        L_0x0052:
            r0 = 13
            goto L_0x00f3
        L_0x0056:
            java.lang.String r5 = "link"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x005f
            goto L_0x0039
        L_0x005f:
            r0 = 12
            goto L_0x00f3
        L_0x0063:
            java.lang.String r5 = "bday"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x006c
            goto L_0x0039
        L_0x006c:
            r0 = 11
            goto L_0x00f3
        L_0x0070:
            java.lang.String r5 = "id"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0079
            goto L_0x0039
        L_0x0079:
            r0 = 10
            goto L_0x00f3
        L_0x007d:
            java.lang.String r5 = "updateTime"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0086
            goto L_0x0039
        L_0x0086:
            r0 = 9
            goto L_0x00f3
        L_0x008a:
            java.lang.String r5 = "baseUrl"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0093
            goto L_0x0039
        L_0x0093:
            r0 = 8
            goto L_0x00f3
        L_0x0097:
            java.lang.String r5 = "photoId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0039
        L_0x00a0:
            r0 = 7
            goto L_0x00f3
        L_0x00a2:
            java.lang.String r5 = "baseRawUrl"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0039
        L_0x00ab:
            r0 = 6
            goto L_0x00f3
        L_0x00ad:
            java.lang.String r5 = "status"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00b6
            goto L_0x0039
        L_0x00b6:
            r0 = 5
            goto L_0x00f3
        L_0x00b8:
            java.lang.String r5 = "menuButton"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00c2
            goto L_0x0039
        L_0x00c2:
            r0 = 4
            goto L_0x00f3
        L_0x00c4:
            java.lang.String r5 = "options"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0039
        L_0x00ce:
            r0 = 3
            goto L_0x00f3
        L_0x00d0:
            java.lang.String r5 = "gender"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00da
            goto L_0x0039
        L_0x00da:
            r0 = 2
            goto L_0x00f3
        L_0x00dc:
            java.lang.String r5 = "description"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0039
        L_0x00e6:
            r0 = 1
            goto L_0x00f3
        L_0x00e8:
            java.lang.String r5 = "profileOptions"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00f2
            goto L_0x0039
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            switch(r0) {
                case 0: goto L_0x0358;
                case 1: goto L_0x0350;
                case 2: goto L_0x0338;
                case 3: goto L_0x0302;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01bf;
                case 7: goto L_0x01b7;
                case 8: goto L_0x01b1;
                case 9: goto L_0x01aa;
                case 10: goto L_0x01a3;
                case 11: goto L_0x019d;
                case 12: goto L_0x0197;
                case 13: goto L_0x0105;
                case 14: goto L_0x0100;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            r33.z()
        L_0x00f9:
            r1 = 2
            r2 = 5
        L_0x00fb:
            r5 = -1
            r6 = 1
            r11 = 3
            goto L_0x038f
        L_0x0100:
            long r21 = r33.w0()
            goto L_0x00f9
        L_0x0105:
            int r0 = jjd.D(r33)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r2 = 0
        L_0x010f:
            if (r2 >= r0) goto L_0x0193
            int r4 = r33.x0()
            r18 = r8
            r1 = r11
            r3 = 0
        L_0x0119:
            jm3 r31 = defpackage.jm3.c
            if (r3 >= r4) goto L_0x017b
            java.lang.String r6 = r33.z0()
            r6.getClass()
            int r32 = r6.hashCode()
            switch(r32) {
                case -1459599807: goto L_0x0149;
                case 3575610: goto L_0x013c;
                case 132835675: goto L_0x012f;
                default: goto L_0x012b;
            }
        L_0x012b:
            r32 = r0
        L_0x012d:
            r0 = -1
            goto L_0x0155
        L_0x012f:
            r32 = r0
            java.lang.String r0 = "firstName"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x013a
            goto L_0x0153
        L_0x013a:
            r0 = 2
            goto L_0x0155
        L_0x013c:
            r32 = r0
            java.lang.String r0 = "type"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0147
            goto L_0x0153
        L_0x0147:
            r0 = 1
            goto L_0x0155
        L_0x0149:
            r32 = r0
            java.lang.String r0 = "lastName"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0154
        L_0x0153:
            goto L_0x012d
        L_0x0154:
            r0 = 0
        L_0x0155:
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0162;
                case 2: goto L_0x015d;
                default: goto L_0x0158;
            }
        L_0x0158:
            r33.z()
        L_0x015b:
            r6 = 1
            goto L_0x0177
        L_0x015d:
            java.lang.String r8 = jjd.M(r33)
            goto L_0x015b
        L_0x0162:
            java.lang.String r0 = jjd.M(r33)
            if (r0 != 0) goto L_0x016b
            r18 = r31
            goto L_0x015b
        L_0x016b:
            jm3 r0 = defpackage.jm3.valueOf(r0)
            r18 = r0
            goto L_0x015b
        L_0x0172:
            java.lang.String r1 = jjd.M(r33)
            goto L_0x015b
        L_0x0177:
            int r3 = r3 + r6
            r0 = r32
            goto L_0x0119
        L_0x017b:
            r32 = r0
            r6 = 1
            if (r18 != 0) goto L_0x0183
            r0 = r31
            goto L_0x0185
        L_0x0183:
            r0 = r18
        L_0x0185:
            km3 r3 = new km3
            r3.<init>(r8, r0, r1)
            r5.add(r3)
            int r2 = r2 + r6
            r0 = r32
            r8 = 0
            goto L_0x010f
        L_0x0193:
            r18 = r5
            goto L_0x00f9
        L_0x0197:
            java.lang.String r27 = jjd.M(r33)
            goto L_0x00f9
        L_0x019d:
            java.lang.String r28 = jjd.M(r33)
            goto L_0x00f9
        L_0x01a3:
            long r0 = r33.w0()
            r12 = r0
            goto L_0x00f9
        L_0x01aa:
            long r0 = r33.w0()
            r14 = r0
            goto L_0x00f9
        L_0x01b1:
            java.lang.String r16 = jjd.M(r33)
            goto L_0x00f9
        L_0x01b7:
            long r0 = r33.w0()
            r19 = r0
            goto L_0x00f9
        L_0x01bf:
            java.lang.String r17 = jjd.M(r33)
            goto L_0x00f9
        L_0x01c5:
            n1 r0 = r33.A0()
            int r1 = r0.e()
            if (r1 == 0) goto L_0x01f3
            r2 = 1
            if (r1 != r2) goto L_0x01db
            r6 = r2
            r1 = 2
            r2 = 5
            r5 = -1
            r11 = 3
            r23 = 0
            goto L_0x038f
        L_0x01db:
            int r1 = r0.e()
            r2 = 5
            if (r1 != r2) goto L_0x01f0
            mt6 r0 = r0.p()
            m1 r0 = (defpackage.m1) r0
            java.lang.String r0 = r0.y()
            ln3 r23 = defpackage.ln3.valueOf(r0)
        L_0x01f0:
            r1 = 2
            goto L_0x00fb
        L_0x01f3:
            r1 = 0
            throw r1
        L_0x01f5:
            r1 = r8
            r2 = 5
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            int r0 = jjd.K(r33)     // Catch:{ all -> 0x0201 }
            r5 = r0
            goto L_0x0232
        L_0x0201:
            r0 = move-exception
            r5 = r0
            udd.S(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x021f
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r5)
            goto L_0x020c
        L_0x021f:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0231
            r6 = 1
            if (r0 == r6) goto L_0x0230
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0230:
            throw r5
        L_0x0231:
            r5 = 0
        L_0x0232:
            if (r5 != 0) goto L_0x0237
            r29 = r1
            goto L_0x01f0
        L_0x0237:
            r6 = 0
        L_0x0238:
            if (r6 >= r5) goto L_0x02f2
            java.lang.String r0 = jjd.M(r33)     // Catch:{ all -> 0x023f }
            goto L_0x0270
        L_0x023f:
            r0 = move-exception
            r8 = r0
            udd.S(r4, r3, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x024a:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x025d
            java.lang.Object r29 = r0.next()
            ny9 r29 = (ny9) r29
            r29.getClass()
            ny9.a(r8)
            goto L_0x024a
        L_0x025d:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x026f
            r1 = 1
            if (r0 == r1) goto L_0x026e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x026e:
            throw r8
        L_0x026f:
            r0 = 0
        L_0x0270:
            if (r0 != 0) goto L_0x0275
        L_0x0272:
            r8 = 1
            goto L_0x02ee
        L_0x0275:
            java.lang.String r1 = "text"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = jjd.M(r33)     // Catch:{ all -> 0x0283 }
            r11 = r0
            goto L_0x02b4
        L_0x0283:
            r0 = move-exception
            r1 = r0
            udd.S(r4, r3, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x028e:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x02a1
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r1)
            goto L_0x028e
        L_0x02a1:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x02b3
            r8 = 1
            if (r0 == r8) goto L_0x02b2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02b2:
            throw r1
        L_0x02b3:
            r11 = 0
        L_0x02b4:
            if (r11 != 0) goto L_0x0272
        L_0x02b6:
            r29 = 0
            goto L_0x01f0
        L_0x02ba:
            r33.z()     // Catch:{ all -> 0x02be }
            goto L_0x0272
        L_0x02be:
            r0 = move-exception
            r1 = r0
            udd.S(r4, r3, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02c9:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x02dc
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r1)
            goto L_0x02c9
        L_0x02dc:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0272
            r8 = 1
            if (r0 == r8) goto L_0x02ed
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ed:
            throw r1
        L_0x02ee:
            int r6 = r6 + r8
            r1 = 0
            goto L_0x0238
        L_0x02f2:
            int r0 = r11.length()
            if (r0 != 0) goto L_0x02f9
            goto L_0x02b6
        L_0x02f9:
            s77 r0 = new s77
            r0.<init>((java.lang.String) r11)
            r29 = r0
            goto L_0x01f0
        L_0x0302:
            r2 = 5
            int r0 = r33.s0()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r1 = 0
        L_0x030d:
            if (r1 >= r0) goto L_0x01f0
            java.lang.String r3 = jjd.M(r33)
            if (r3 != 0) goto L_0x0318
            r3 = 0
        L_0x0316:
            r8 = 1
            goto L_0x0331
        L_0x0318:
            tj3[] r4 = defpackage.tj3.values()
            int r5 = r4.length
            r6 = 0
        L_0x031e:
            if (r6 >= r5) goto L_0x032f
            r8 = r4[r6]
            java.lang.String r11 = r8.a
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x032c
            r3 = r8
            goto L_0x0316
        L_0x032c:
            r8 = 1
            int r6 = r6 + r8
            goto L_0x031e
        L_0x032f:
            r8 = 1
            r3 = 0
        L_0x0331:
            if (r3 == 0) goto L_0x0336
            r10.add(r3)
        L_0x0336:
            int r1 = r1 + r8
            goto L_0x030d
        L_0x0338:
            r2 = 5
            r8 = 1
            int r0 = r33.v0()
            if (r0 == r8) goto L_0x034b
            r1 = 2
            if (r0 == r1) goto L_0x0347
            r24 = 1
            goto L_0x00fb
        L_0x0347:
            r24 = 3
            goto L_0x00fb
        L_0x034b:
            r1 = 2
            r24 = r1
            goto L_0x00fb
        L_0x0350:
            r1 = 2
            r2 = 5
            java.lang.String r26 = jjd.M(r33)
            goto L_0x00fb
        L_0x0358:
            r1 = 2
            r2 = 5
            int r0 = r33.s0()
            int[] r3 = new int[r0]
            r4 = 0
        L_0x0361:
            if (r4 >= r0) goto L_0x038a
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            sp8 r8 = r33.n()
            int r8 = r8.a()
            r11 = 3
            if (r8 != r11) goto L_0x037c
            int r6 = r33.v0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x037f
        L_0x037c:
            r33.z()
        L_0x037f:
            int r6 = r6.intValue()
            if (r6 == r5) goto L_0x0387
            r3[r4] = r6
        L_0x0387:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0361
        L_0x038a:
            r5 = -1
            r6 = 1
            r11 = 3
            r30 = r3
        L_0x038f:
            int r9 = r9 + r6
            r8 = 0
            goto L_0x0027
        L_0x0393:
            if (r10 != 0) goto L_0x039d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r25 = r0
            goto L_0x039f
        L_0x039d:
            r25 = r10
        L_0x039f:
            uj3 r0 = new uj3
            r11 = r0
            r11.<init>(r12, r14, r16, r17, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.e(ws8):uj3");
    }

    public final String a() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((km3) list.get(0)).a();
    }

    public final String b() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((km3) list.get(0)).a;
    }

    public final String c() {
        List list = this.X;
        if (list.isEmpty()) {
            return null;
        }
        return ((km3) list.get(0)).c;
    }

    public final String d(fj0 fj0) {
        String str = this.c;
        if (!r1g.p(str)) {
            return vx3.t(str, fj0, ej0.a);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.w0);
        sb.append(", options=");
        return hr1.i(sb, this.y0, "}");
    }
}
