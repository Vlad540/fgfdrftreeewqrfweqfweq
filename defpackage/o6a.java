package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o6a  reason: default package */
public final class o6a extends xh0 {
    public static final /* synthetic */ int o = 0;
    public final g15 h;
    public final knc i;
    public final pae j;
    public final r7e k = new r7e(new m6a(this, 0));
    public final r7e l;
    public final r7e m;
    public final AtomicBoolean n;

    public o6a(Context context, g15 g15, mg5 mg5, xzc xzc, zz9 zz9, knc knc, pae pae) {
        super(context, mg5.b, mg5, xzc, zz9, g15);
        this.h = g15;
        this.i = knc;
        this.j = pae;
        this.l = new r7e(new qk8(14, xzc));
        this.m = new r7e(new m6a(this, 1));
        this.n = new AtomicBoolean();
    }

    public final boolean e(String str, String str2, float f, float f2, rjb rjb, boolean z, are are) {
        AtomicBoolean atomicBoolean = this.n;
        boolean z2 = true;
        atomicBoolean.set(true);
        CopyOnWriteArraySet copyOnWriteArraySet = this.g;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        Handler handler = this.f;
        if (!isEmpty) {
            handler.post(new wh0(this, 1));
        }
        try {
            if (!((Boolean) ((ag8) this.l.getValue()).d.getValue()).booleanValue() || !g(str, str2, f, f2, rjb, z, are)) {
                z2 = k3f.a(this.a, this.h, str, str2, f, f2, rjb, z, new mod(24, are));
            }
            return z2;
        } finally {
            atomicBoolean.set(false);
            if (!copyOnWriteArraySet.isEmpty()) {
                handler.post(new wh0(this, 0));
            }
        }
    }

    public final void f(String str, boolean z) {
        if (z) {
            a06.u().g(tr6.b(str));
        } else {
            a06.u().f(tr6.b(str), (m18) null);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x033e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0424 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0426  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.String r42, java.lang.String r43, float r44, float r45, rjb r46, boolean r47, defpackage.are r48) {
        /*
            r41 = this;
            r1 = r41
            r0 = r44
            r2 = r45
            r3 = r46
            fn6 r6 = defpackage.udd.e
            r7 = 0
            if (r6 != 0) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            boolean r8 = r6.c()
            if (r8 == 0) goto L_0x001d
            tn7 r8 = tn7.X
            java.lang.String r9 = "o6a"
            java.lang.String r10 = "transformMedia"
            r6.d(r8, r9, r10, r7)
        L_0x001d:
            java.io.File r6 = new java.io.File
            r8 = r42
            r6.<init>(r8)
            android.net.Uri r6 = android.net.Uri.fromFile(r6)
            android.content.Context r8 = r1.a
            int r9 = r3.b
            int r10 = r3.c
            int r3 = r3.d
            r7e r11 = r1.l
            java.lang.Object r11 = r11.getValue()
            ag8 r11 = (defpackage.ag8) r11
            r7e r11 = r11.e
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r7e r12 = r1.l
            java.lang.Object r12 = r12.getValue()
            ag8 r12 = (defpackage.ag8) r12
            r7e r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            e98 r13 = new e98
            r14 = 9
            r15 = r48
            r13.<init>(r14, r15)
            if (r43 == 0) goto L_0x006c
            java.lang.CharSequence r14 = defpackage.h0e.B0(r43)
            java.lang.String r14 = r14.toString()
            goto L_0x006d
        L_0x006c:
            r14 = r7
        L_0x006d:
            if (r6 == 0) goto L_0x047f
            if (r14 == 0) goto L_0x047f
            int r15 = r14.length()
            if (r15 == 0) goto L_0x047f
            r15 = 0
            int r15 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x045d
            r15 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x045d
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x045d
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = (double) r2
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x045d
            if (r9 <= 0) goto L_0x044e
            if (r10 <= 0) goto L_0x044e
            jg8 r4 = new jg8
            yf8 r5 = new yf8
            r5.<init>(r8)
            r5.b = r6
            r5.c = r14
            r5.d = r9
            r5.e = r10
            r5.f = r3
            r3 = r47
            r5.i = r3
            r5.h = r2
            r5.g = r0
            r5.j = r12
            r5.k = r11
            r5.l = r13
            r4.<init>(r5)
            java.lang.String r2 = "execute, failed to transform media"
            gg8 r3 = new gg8
            r3.<init>(r5)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r8 = r6.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r9 = "(media_transformer)"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r6.setName(r0)
            o58 r9 = new o58
            java.lang.Object r0 = r4.o
            android.content.Context r0 = (android.content.Context) r0
            r10 = 0
            r9.<init>(r0, r10)
            android.net.Uri r5 = r5.b
            java.lang.String r0 = "Failed to find a suitable extractor for "
            m58 r12 = r9.a(r5)     // Catch:{ all -> 0x0157 }
            if (r12 == 0) goto L_0x0160
            wjf r0 = new wjf     // Catch:{ all -> 0x0109 }
            r0.<init>(r12)     // Catch:{ all -> 0x0109 }
            java.lang.Object r13 = r0.a     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x0109 }
            xu5[] r13 = ek8.N(r13)     // Catch:{ all -> 0x0109 }
            int r14 = r13.length     // Catch:{ all -> 0x0109 }
            r15 = 0
        L_0x00f9:
            if (r15 >= r14) goto L_0x010c
            r10 = r13[r15]     // Catch:{ all -> 0x0109 }
            z23 r11 = r10.A     // Catch:{ all -> 0x0109 }
            boolean r11 = defpackage.z23.g(r11)     // Catch:{ all -> 0x0109 }
            if (r11 == 0) goto L_0x0106
            goto L_0x010d
        L_0x0106:
            r10 = 1
            int r15 = r15 + r10
            goto L_0x00f9
        L_0x0109:
            r0 = move-exception
            r7 = r0
            goto L_0x0159
        L_0x010c:
            r10 = r7
        L_0x010d:
            k58 r11 = new k58     // Catch:{ all -> 0x0109 }
            java.lang.Object r14 = r0.X     // Catch:{ all -> 0x0109 }
            vtc r14 = (defpackage.vtc) r14     // Catch:{ all -> 0x0109 }
            if (r14 == 0) goto L_0x011e
            long r14 = r14.f()     // Catch:{ all -> 0x0109 }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0109 }
            goto L_0x011f
        L_0x011e:
            r14 = r7
        L_0x011f:
            if (r14 == 0) goto L_0x0126
            long r14 = r14.longValue()     // Catch:{ all -> 0x0109 }
            goto L_0x012b
        L_0x0126:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x012b:
            if (r10 == 0) goto L_0x012f
            r10 = 1
            goto L_0x0130
        L_0x012f:
            r10 = 0
        L_0x0130:
            java.lang.Object r7 = r0.c     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0109 }
            xu5[] r7 = ek8.N(r7)     // Catch:{ all -> 0x0109 }
            java.lang.Object r0 = r0.o     // Catch:{ all -> 0x0109 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0109 }
            xu5[] r0 = ek8.N(r0)     // Catch:{ all -> 0x0109 }
            r42 = r11
            r43 = r14
            r45 = r10
            r46 = r13
            r47 = r7
            r48 = r0
            r42.<init>(r43, r45, r46, r47, r48)     // Catch:{ all -> 0x0109 }
            r7 = 0
            defpackage.urd.l(r12, r7)     // Catch:{ all -> 0x0157 }
            r44 = r6
            goto L_0x02a2
        L_0x0157:
            r0 = move-exception
            goto L_0x0172
        L_0x0159:
            throw r7     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            r10 = r0
            defpackage.urd.l(r12, r7)     // Catch:{ all -> 0x0157 }
            throw r10     // Catch:{ all -> 0x0157 }
        L_0x0160:
            one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException r7 = new one.me.sdk.media.transformer.impl.MediaInfoRetriever$DexiExtractorNotFoundException     // Catch:{ all -> 0x0157 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0157 }
            r10.<init>(r0)     // Catch:{ all -> 0x0157 }
            r10.append(r5)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0157 }
            r7.<init>(r0)     // Catch:{ all -> 0x0157 }
            throw r7     // Catch:{ all -> 0x0157 }
        L_0x0172:
            java.lang.String r7 = r9.b
            java.lang.String r10 = "Failed to retrieve media info"
            defpackage.udd.s(r7, r10, r0)
            java.lang.String r0 = "mime"
            java.lang.String r10 = "durationUs"
            android.media.MediaExtractor r11 = new android.media.MediaExtractor     // Catch:{ all -> 0x0293 }
            r11.<init>()     // Catch:{ all -> 0x0293 }
            android.content.Context r9 = r9.a     // Catch:{ all -> 0x028f }
            r12 = 0
            r11.setDataSource(r9, r5, r12)     // Catch:{ all -> 0x028f }
            int r5 = r11.getTrackCount()     // Catch:{ all -> 0x028f }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x01b7 }
            r9.<init>()     // Catch:{ all -> 0x01b7 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01b7 }
            r12.<init>()     // Catch:{ all -> 0x01b7 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x01b7 }
            r13.<init>()     // Catch:{ all -> 0x01b7 }
            r14 = 0
            r15 = 0
        L_0x019d:
            if (r15 >= r5) goto L_0x0207
            r42 = r5
            android.media.MediaFormat r5 = r11.getTrackFormat(r15)     // Catch:{ all -> 0x01f8 }
            xu5 r1 = defpackage.iu7.k(r5)     // Catch:{ all -> 0x01b7 }
            java.lang.String r19 = r5.getString(r0)     // Catch:{ all -> 0x01b7 }
            boolean r19 = defpackage.c49.k(r19)     // Catch:{ all -> 0x01b7 }
            if (r19 == 0) goto L_0x01bc
            r9.add(r1)     // Catch:{ all -> 0x01b7 }
            goto L_0x01cd
        L_0x01b7:
            r0 = move-exception
            r44 = r6
            goto L_0x027f
        L_0x01bc:
            java.lang.String r19 = r5.getString(r0)     // Catch:{ all -> 0x01b7 }
            boolean r19 = defpackage.c49.h(r19)     // Catch:{ all -> 0x01b7 }
            if (r19 == 0) goto L_0x01ca
            r12.add(r1)     // Catch:{ all -> 0x01b7 }
            goto L_0x01cd
        L_0x01ca:
            r13.add(r1)     // Catch:{ all -> 0x01b7 }
        L_0x01cd:
            boolean r1 = r5.containsKey(r10)     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x01f8
            if (r14 == 0) goto L_0x01e9
            r43 = r0
            long r0 = r14.longValue()     // Catch:{ all -> 0x01b7 }
            r44 = r6
            long r5 = r5.getLong(r10)     // Catch:{ all -> 0x01e6 }
            long r0 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x01e6 }
            goto L_0x01f1
        L_0x01e6:
            r0 = move-exception
            goto L_0x027f
        L_0x01e9:
            r43 = r0
            r44 = r6
            long r0 = r5.getLong(r10)     // Catch:{ all -> 0x01e6 }
        L_0x01f1:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r14 = r0
        L_0x01f6:
            r1 = 1
            goto L_0x01fd
        L_0x01f8:
            r43 = r0
            r44 = r6
            goto L_0x01f6
        L_0x01fd:
            int r15 = r15 + r1
            r1 = r41
            r5 = r42
            r0 = r43
            r6 = r44
            goto L_0x019d
        L_0x0207:
            r44 = r6
            r1 = 1
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01e6 }
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0222
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x01e6 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0220
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x01e6 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0220
            goto L_0x0222
        L_0x0220:
            r0 = 0
            goto L_0x027b
        L_0x0222:
            java.util.Iterator r0 = r9.iterator()     // Catch:{ all -> 0x01e6 }
        L_0x0226:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x01e6 }
            if (r1 == 0) goto L_0x023c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x01e6 }
            r5 = r1
            xu5 r5 = (defpackage.xu5) r5     // Catch:{ all -> 0x01e6 }
            z23 r5 = r5.A     // Catch:{ all -> 0x01e6 }
            boolean r5 = defpackage.z23.g(r5)     // Catch:{ all -> 0x01e6 }
            if (r5 == 0) goto L_0x0226
            goto L_0x023d
        L_0x023c:
            r1 = 0
        L_0x023d:
            xu5 r1 = (defpackage.xu5) r1     // Catch:{ all -> 0x01e6 }
            k58 r0 = new k58     // Catch:{ all -> 0x01e6 }
            if (r14 == 0) goto L_0x024a
            long r5 = r14.longValue()     // Catch:{ all -> 0x01e6 }
            r20 = r5
            goto L_0x024f
        L_0x024a:
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x024f:
            if (r1 == 0) goto L_0x0255
            r1 = 0
            r22 = 1
            goto L_0x0258
        L_0x0255:
            r1 = 0
            r22 = 0
        L_0x0258:
            xu5[] r5 = new defpackage.xu5[r1]     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r5 = r9.toArray(r5)     // Catch:{ all -> 0x01e6 }
            r23 = r5
            xu5[] r23 = (defpackage.xu5[]) r23     // Catch:{ all -> 0x01e6 }
            xu5[] r5 = new defpackage.xu5[r1]     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r5 = r12.toArray(r5)     // Catch:{ all -> 0x01e6 }
            r24 = r5
            xu5[] r24 = (defpackage.xu5[]) r24     // Catch:{ all -> 0x01e6 }
            xu5[] r5 = new defpackage.xu5[r1]     // Catch:{ all -> 0x01e6 }
            java.lang.Object[] r1 = r13.toArray(r5)     // Catch:{ all -> 0x01e6 }
            r25 = r1
            xu5[] r25 = (defpackage.xu5[]) r25     // Catch:{ all -> 0x01e6 }
            r19 = r0
            r19.<init>(r20, r22, r23, r24, r25)     // Catch:{ all -> 0x01e6 }
        L_0x027b:
            r11.release()
            goto L_0x0288
        L_0x027f:
            java.lang.String r1 = "Failed to extract media"
            defpackage.udd.s(r7, r1, r0)     // Catch:{ all -> 0x028a }
            r11.release()
            r0 = 0
        L_0x0288:
            r11 = r0
            goto L_0x02a2
        L_0x028a:
            r0 = move-exception
            r11.release()
            throw r0
        L_0x028f:
            r0 = move-exception
            r44 = r6
            goto L_0x0297
        L_0x0293:
            r0 = move-exception
            r44 = r6
            r11 = 0
        L_0x0297:
            java.lang.String r1 = "Failed to open media extractor"
            defpackage.udd.s(r7, r1, r0)
            if (r11 == 0) goto L_0x02a1
            r11.release()
        L_0x02a1:
            r11 = 0
        L_0x02a2:
            if (r11 == 0) goto L_0x02b3
            fg8 r0 = r3.c
            long r5 = java.lang.System.currentTimeMillis()
            r0.a = r5
            fg8 r0 = r3.c
            java.util.concurrent.atomic.AtomicReference r0 = r0.b
            r0.set(r11)
        L_0x02b3:
            java.lang.Object r0 = r4.b
            java.lang.String r0 = (java.lang.String) r0
            fn6 r1 = defpackage.udd.e
            if (r1 != 0) goto L_0x02bc
            goto L_0x02d6
        L_0x02bc:
            boolean r5 = r1.c()
            if (r5 == 0) goto L_0x02d6
            tn7 r5 = tn7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "execute, "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r7 = 0
            r1.d(r5, r0, r6, r7)
        L_0x02d6:
            l68 r0 = r4.o(r11)     // Catch:{ MediaTransformException -> 0x0305, all -> 0x0302 }
            gs4 r0 = r4.m(r0)     // Catch:{ MediaTransformException -> 0x0305, all -> 0x0302 }
            hs4 r1 = new hs4     // Catch:{ MediaTransformException -> 0x0305, all -> 0x0302 }
            r5 = 0
            gs4[] r6 = new defpackage.gs4[r5]     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            r1.<init>(r0, r6)     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            j93 r0 = r4.l(r3, r1)     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            r7e r1 = bf4.c     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            to1 r1 = new to1     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            r6 = 6
            r1.<init>(r4, r3, r0, r6)     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            boolean r1 = defpackage.kjd.Q(r1)     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
            if (r1 != 0) goto L_0x02fb
            r4.q(r3, r0)     // Catch:{ MediaTransformException -> 0x0300, all -> 0x02fe }
        L_0x02fb:
            r1 = r44
            goto L_0x0325
        L_0x02fe:
            r0 = move-exception
            goto L_0x0308
        L_0x0300:
            r0 = move-exception
            goto L_0x031a
        L_0x0302:
            r0 = move-exception
            r5 = 0
            goto L_0x0308
        L_0x0305:
            r0 = move-exception
            r5 = 0
            goto L_0x031a
        L_0x0308:
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            defpackage.udd.s(r1, r2, r0)
            one.me.sdk.media.transformer.MediaTransformException r1 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r2 = "Failed to transform media"
            r1.<init>(r2, r0)
            r3.a(r1)
            goto L_0x02fb
        L_0x031a:
            java.lang.Object r1 = r4.b
            java.lang.String r1 = (java.lang.String) r1
            defpackage.udd.s(r1, r2, r0)
            r3.a(r0)
            goto L_0x02fb
        L_0x0325:
            r1.setName(r8)
            long r20 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r0 = r3.f
            java.lang.Object r0 = r0.get()
            o55 r0 = (defpackage.o55) r0
            java.util.concurrent.atomic.AtomicReference r1 = r3.g
            java.lang.Object r1 = r1.get()
            one.me.sdk.media.transformer.MediaTransformException r1 = (one.me.sdk.media.transformer.MediaTransformException) r1
            if (r0 == 0) goto L_0x0392
            if (r1 != 0) goto L_0x0392
            long r1 = r3.b
            r18 = r1
            yf8 r1 = r3.a
            r22 = r1
            fg8 r1 = r3.c
            r23 = r1
            long r1 = r0.a
            r24 = r1
            long r1 = r0.b
            r26 = r1
            int r1 = r0.o
            r28 = r1
            java.lang.String r1 = r0.f
            r29 = r1
            int r1 = r0.d
            r30 = r1
            int r1 = r0.e
            r31 = r1
            int r1 = r0.c
            r32 = r1
            java.lang.String r1 = r0.m
            r33 = r1
            int r1 = r0.k
            r34 = r1
            int r1 = r0.j
            r35 = r1
            int r1 = r0.h
            r36 = r1
            int r1 = r3.e
            r39 = r1
            int r1 = r3.d
            r37 = r1
            int r1 = r0.l
            r38 = r1
            z23 r0 = r0.i
            boolean r40 = defpackage.z23.g(r0)
            dg8 r0 = new dg8
            r17 = r0
            r17.<init>(r18, r20, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x03b1
        L_0x0392:
            cg8 r0 = new cg8
            long r6 = r3.b
            yf8 r2 = r3.a
            fg8 r3 = r3.c
            if (r1 != 0) goto L_0x03a4
            one.me.sdk.media.transformer.MediaTransformException r1 = new one.me.sdk.media.transformer.MediaTransformException
            java.lang.String r8 = "Unknown media transform error occured"
            r9 = 0
            r1.<init>(r8, r9)
        L_0x03a4:
            r24 = r1
            r17 = r0
            r18 = r6
            r22 = r2
            r23 = r3
            r17.<init>(r18, r20, r22, r23, r24)
        L_0x03b1:
            boolean r1 = r0 instanceof dg8
            if (r1 == 0) goto L_0x03d9
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x03be
            goto L_0x0422
        L_0x03be:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0422
            tn7 r4 = tn7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "execute, completed with "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7 = 0
            r3.d(r4, r2, r6, r7)
            goto L_0x0422
        L_0x03d9:
            boolean r2 = r0 instanceof cg8
            if (r2 == 0) goto L_0x0448
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "execute, failed with "
            r3.<init>(r6)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r6 = r0
            cg8 r6 = (cg8) r6
            one.me.sdk.media.transformer.MediaTransformException r6 = r6.e
            defpackage.udd.s(r2, r3, r6)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x0400
            goto L_0x040e
        L_0x0400:
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x040e
            tn7 r6 = tn7.X
            java.lang.String r7 = "cleanup"
            r8 = 0
            r3.d(r6, r2, r7, r8)
        L_0x040e:
            java.io.File r2 = new java.io.File
            java.lang.Object r3 = r4.c
            yf8 r3 = (yf8) r3
            java.lang.String r3 = r3.c
            r2.<init>(r3)
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L_0x0422
            r2.delete()
        L_0x0422:
            if (r1 == 0) goto L_0x0426
            r4 = 1
            goto L_0x0441
        L_0x0426:
            boolean r1 = r0 instanceof cg8
            if (r1 == 0) goto L_0x0442
            r1 = r41
            g15 r1 = r1.h
            ru.ok.tamtam.ExceptionHandler$HandledException r2 = new ru.ok.tamtam.ExceptionHandler$HandledException
            cg8 r0 = (cg8) r0
            one.me.sdk.media.transformer.MediaTransformException r0 = r0.e
            java.lang.String r3 = "ONEME-9916"
            r4 = 0
            r6 = 1
            r2.<init>(r4, r0, r6, r3)
            r4a r1 = (defpackage.r4a) r1
            r1.c(r2, r6)
            r4 = r5
        L_0x0441:
            return r4
        L_0x0442:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0448:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x044e:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.String r1 = "Illegal requested size="
            java.lang.String r2 = "x"
            java.lang.String r1 = me4.g(r1, r9, r10, r2)
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L_0x045d:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r1 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Illegal requested position range=["
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        L_0x047f:
            one.me.sdk.media.transformer.impl.IllegalMediaTransformException r0 = new one.me.sdk.media.transformer.impl.IllegalMediaTransformException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal input/output="
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6a.g(java.lang.String, java.lang.String, float, float, rjb, boolean, are):boolean");
    }
}
