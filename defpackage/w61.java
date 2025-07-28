package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: w61  reason: default package */
public final class w61 extends taf {
    public final grd A0;
    public final grd B0;
    public Long C0;
    public final rp1 X;
    public final t97 Y;
    public final t97 Z;
    public final g71 b;
    public final we1 c;
    public final j60 o;
    public final b2b w0;
    public final t97 x0;
    public final grd y0;
    public final grd z0;

    public w61(Context context, g71 g71, we1 we1) {
        nqc nqc = nqc.a;
        j60 j60 = new j60(((f03) nqc.getAccessor().c(f03.class)).s());
        rp1 rp1 = (rp1) nqc.getAccessor().c(rp1.class);
        t97 t97 = mqc.i;
        t97 t972 = mqc.j;
        b2b b2b = new b2b(new yha(context));
        r7e d = c61.a.getAccessor().d(iq1.class);
        this.b = g71;
        this.c = we1;
        this.o = j60;
        this.X = rp1;
        this.Y = t97;
        this.Z = t972;
        this.w0 = b2b;
        this.x0 = d;
        grd a = hrd.a(qia.a);
        this.y0 = a;
        this.z0 = a;
        grd a2 = hrd.a(Boolean.FALSE);
        this.A0 = a2;
        this.B0 = a2;
        s();
        rp1.getClass();
        rp1.g(new pp1(rp1, 5));
    }

    public final wg6 q(long j) {
        eh6 eh6;
        ria ria = (ria) this.y0.getValue();
        if (!(ria instanceof pia) || (eh6 = (eh6) ((pia) ria).a.get(Long.valueOf(j))) == null) {
            return null;
        }
        return eh6.z0;
    }

    public final boolean r() {
        j60 j60 = this.o;
        lk9 lk9 = g71.b;
        g71 g71 = this.b;
        lk9.getClass();
        if (!((ArrayList) (g71 == g71.MISSING ? j60.X : j60.o)).isEmpty()) {
            rp1 rp1 = this.X;
            if (rp1.c == null || rp1.c.o || !rp1.b) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        udd.p("CallHistoryPageViewModel", "register load history callbacks for type=" + this.b, new Object[0]);
        rp1 rp1 = this.X;
        rp1.getClass();
        rp1.D0.b(new pp1(rp1, 3));
        rp1.Y.add(this);
        t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: vg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: sg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: tg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: sg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: tg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: ug6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: tg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: sg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: tg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: sg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r40 = this;
            r0 = r40
            r1 = 1
            grd r2 = r0.y0
        L_0x0005:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            ria r4 = (defpackage.ria) r4
            j60 r5 = r0.o
            t97 r6 = r0.Z
            java.lang.Object r6 = r6.getValue()
            t52 r6 = (t52) r6
            rp1 r7 = r0.X
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.o
            java.lang.Object r8 = r5.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.clear()
            int r9 = r8.size()
            java.util.Iterator r7 = r7.iterator()
        L_0x0029:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x005d
            java.lang.Object r10 = r7.next()
            xm8 r10 = (xm8) r10
            vo8 r11 = r10.a
            long r11 = r11.x0
            i22 r11 = r6.B(r11)
            if (r11 == 0) goto L_0x0029
            boolean r12 = r11.J()
            if (r12 == 0) goto L_0x0054
            tf3 r11 = r11.k()
            if (r11 == 0) goto L_0x0029
            lp1 r12 = new lp1
            r12.<init>(r10, r11)
            r8.add(r12)
            goto L_0x0029
        L_0x0054:
            lp1 r12 = new lp1
            r12.<init>(r11, r10)
            r8.add(r12)
            goto L_0x0029
        L_0x005d:
            int r6 = r8.size()
            int r6 = r6 - r1
            r5.a(r8, r9, r6)
            lk9 r5 = defpackage.g71.b
            g71 r6 = r0.b
            r5.getClass()
            g71 r5 = defpackage.g71.MISSING
            r7 = 0
            if (r6 != r5) goto L_0x0073
            r5 = r1
            goto L_0x0074
        L_0x0073:
            r5 = r7
        L_0x0074:
            if (r5 == 0) goto L_0x00ff
            j60 r6 = r0.o
            t97 r8 = r0.Y
            java.lang.Object r8 = r8.getValue()
            di3 r8 = (di3) r8
            rp1 r9 = r0.X
            java.util.concurrent.CopyOnWriteArrayList r9 = r9.o
            b2b r10 = r0.w0
            r10.getClass()
            java.lang.Object r10 = r6.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
            if (r9 == 0) goto L_0x0098
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x009c
        L_0x0098:
            r15 = r2
            r16 = r3
            goto L_0x00ef
        L_0x009c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00a5:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00eb
            java.lang.Object r12 = r9.next()
            r13 = r12
            xm8 r13 = (xm8) r13     // Catch:{ all -> 0x00dc }
            boolean r13 = defpackage.n1g.B(r13)     // Catch:{ all -> 0x00dc }
            if (r13 == 0) goto L_0x00de
            xm8 r12 = (xm8) r12     // Catch:{ all -> 0x00dc }
            vo8 r13 = r12.a     // Catch:{ all -> 0x00dc }
            o00 r13 = r13.d()     // Catch:{ all -> 0x00dc }
            java.util.List r13 = r13.f     // Catch:{ all -> 0x00dc }
            lp1 r14 = new lp1     // Catch:{ all -> 0x00dc }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x00dc }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x00dc }
            r15 = r2
            r16 = r3
            long r2 = r13.longValue()     // Catch:{ all -> 0x00dc }
            tf3 r2 = r8.i(r2, r1)     // Catch:{ all -> 0x00dc }
            r14.<init>(r12, r2)     // Catch:{ all -> 0x00dc }
            r11.add(r14)     // Catch:{ all -> 0x00dc }
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e5
        L_0x00de:
            r15 = r2
            r16 = r3
        L_0x00e1:
            r2 = r15
            r3 = r16
            goto L_0x00a5
        L_0x00e5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00eb:
            r15 = r2
            r16 = r3
            goto L_0x00f3
        L_0x00ef:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x00f3:
            r10.addAll(r11)
            int r2 = r10.size()
            int r2 = r2 - r1
            r6.a(r10, r7, r2)
            goto L_0x0102
        L_0x00ff:
            r15 = r2
            r16 = r3
        L_0x0102:
            j60 r2 = r0.o
            if (r5 == 0) goto L_0x010b
            java.lang.Object r2 = r2.X
        L_0x0108:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L_0x010e
        L_0x010b:
            java.lang.Object r2 = r2.o
            goto L_0x0108
        L_0x010e:
            r3 = 10
            int r3 = defpackage.q23.H(r2, r3)
            int r3 = defpackage.ju7.S(r3)
            r5 = 16
            if (r3 >= r5) goto L_0x011d
            r3 = r5
        L_0x011d:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0126:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0526
            java.lang.Object r3 = r2.next()
            lp1 r3 = (lp1) r3
            oa1 r6 = r3.d
            if (r6 == 0) goto L_0x013e
            java.lang.String r6 = r6.b
            int r6 = r6.hashCode()
            long r8 = (long) r6
            goto L_0x0144
        L_0x013e:
            xm8 r6 = r3.c
            vo8 r6 = r6.a
            long r8 = r6.b
        L_0x0144:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            b2b r8 = r0.w0
            r8.getClass()
            xm8 r9 = r3.c
            i22 r10 = r3.a
            java.lang.Object r11 = r8.b
            yha r11 = (yha) r11
            r11.getClass()
            java.util.List r12 = r3.e
            if (r12 != 0) goto L_0x015e
            r12 = r7
            goto L_0x0162
        L_0x015e:
            int r12 = r12.size()
        L_0x0162:
            tf3 r13 = r3.b
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0187
            if (r12 <= 0) goto L_0x0187
            int r12 = r12 + r1
            java.lang.Object r11 = r11.a
            android.content.Context r11 = (android.content.Context) r11
            int r7 = defpackage.ctb.call_history_item_call_call_title_with_count_calls
            java.lang.String r13 = r13.d()
            if (r13 != 0) goto L_0x0178
            r13 = r14
        L_0x0178:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r13, r12}
            java.lang.String r7 = r11.getString(r7, r12)
        L_0x0184:
            r25 = r7
            goto L_0x01ab
        L_0x0187:
            if (r13 == 0) goto L_0x0192
            java.lang.String r7 = r13.d()
            if (r7 != 0) goto L_0x0184
            r25 = r14
            goto L_0x01ab
        L_0x0192:
            i22 r7 = r3.a
            if (r7 == 0) goto L_0x01a0
            r7.h0()
            java.lang.CharSequence r7 = r7.y0
            java.lang.String r7 = r7.toString()
            goto L_0x0184
        L_0x01a0:
            java.lang.Object r7 = r11.a
            android.content.Context r7 = (android.content.Context) r7
            int r11 = defpackage.ctb.call_history_item_call_unknown_call_title
            java.lang.String r7 = r7.getString(r11)
            goto L_0x0184
        L_0x01ab:
            xm8 r7 = r3.c
            tf3 r11 = r3.b
            if (r11 == 0) goto L_0x01cd
            ug6 r13 = new ug6
            long r18 = r11.n()
            vo8 r7 = r7.a
            r31 = r2
            long r1 = r7.x0
            java.util.ArrayList r22 = r3.a()
            r17 = r13
            r20 = r1
            r17.<init>(r18, r20, r22)
            r2 = r13
        L_0x01c9:
            r24 = r14
            goto L_0x0286
        L_0x01cd:
            r31 = r2
            i22 r1 = r3.a
            if (r1 == 0) goto L_0x0229
            boolean r2 = r1.O()
            if (r2 == 0) goto L_0x0229
            vo8 r2 = r7.a
            if (r2 == 0) goto L_0x01e2
            o00 r2 = r2.d()
            goto L_0x01e3
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            if (r2 == 0) goto L_0x0229
            vo8 r2 = r7.a
            if (r2 == 0) goto L_0x01f2
            o00 r2 = r2.d()
            if (r2 == 0) goto L_0x01f2
            java.lang.String r2 = r2.b
            goto L_0x01f3
        L_0x01f2:
            r2 = 0
        L_0x01f3:
            if (r2 != 0) goto L_0x01f8
            r18 = r14
            goto L_0x01fa
        L_0x01f8:
            r18 = r2
        L_0x01fa:
            vo8 r2 = r7.a
            if (r2 == 0) goto L_0x0209
            o00 r2 = r2.d()
            if (r2 == 0) goto L_0x0209
            java.lang.String r2 = r2.a
            r22 = r2
            goto L_0x020b
        L_0x0209:
            r22 = 0
        L_0x020b:
            tg6 r2 = new tg6
            o62 r1 = r1.b
            long r11 = r1.a
            if (r22 == 0) goto L_0x021d
            r17 = r2
            r19 = r11
            r21 = r25
            r17.<init>(r18, r19, r21, r22)
            goto L_0x01c9
        L_0x021d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0229:
            if (r1 == 0) goto L_0x0264
            boolean r2 = r1.O()
            if (r2 != 0) goto L_0x0264
            sg6 r2 = new sg6
            o62 r11 = r1.b
            long r11 = r11.a
            r24 = r14
            long r13 = r1.a
            boolean r37 = r1.M()
            java.util.ArrayList r38 = r3.a()
            if (r7 == 0) goto L_0x0252
            vo8 r1 = r7.a
            if (r1 == 0) goto L_0x0252
            o00 r1 = r1.d()
            if (r1 == 0) goto L_0x0252
            java.lang.String r1 = r1.b
            goto L_0x0253
        L_0x0252:
            r1 = 0
        L_0x0253:
            if (r1 != 0) goto L_0x0258
            r39 = r24
            goto L_0x025a
        L_0x0258:
            r39 = r1
        L_0x025a:
            r32 = r2
            r33 = r11
            r35 = r13
            r32.<init>(r33, r35, r37, r38, r39)
            goto L_0x0286
        L_0x0264:
            r24 = r14
            oa1 r2 = r3.d
            if (r2 == 0) goto L_0x0283
            tg6 r7 = new tg6
            java.lang.String r11 = r2.b
            o62 r1 = r1.b
            long r12 = r1.a
            java.lang.String r1 = r2.a
            r17 = r7
            r18 = r11
            r19 = r12
            r21 = r25
            r22 = r1
            r17.<init>(r18, r19, r21, r22)
            r2 = r7
            goto L_0x0286
        L_0x0283:
            vg6 r1 = defpackage.vg6.a
            r2 = r1
        L_0x0286:
            oa1 r1 = r3.d
            if (r1 == 0) goto L_0x0294
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            long r11 = (long) r1
        L_0x0291:
            r18 = r11
            goto L_0x029b
        L_0x0294:
            xm8 r1 = r3.c
            vo8 r1 = r1.a
            long r11 = r1.b
            goto L_0x0291
        L_0x029b:
            tf3 r1 = r3.b
            if (r1 == 0) goto L_0x02a6
            long r11 = r1.n()
        L_0x02a3:
            r20 = r11
            goto L_0x02b5
        L_0x02a6:
            i22 r1 = r3.a
            if (r1 == 0) goto L_0x02af
            o62 r1 = r1.b
            long r11 = r1.a
            goto L_0x02a3
        L_0x02af:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02a3
        L_0x02b5:
            fj0 r1 = fj0.b
            tf3 r7 = r3.b
            if (r7 == 0) goto L_0x02c0
            java.lang.String r1 = r7.p(r1)
            goto L_0x02cc
        L_0x02c0:
            i22 r7 = r3.a
            if (r7 == 0) goto L_0x02cb
            ej0 r11 = ej0.a
            java.lang.String r1 = r7.f(r1, r11)
            goto L_0x02cc
        L_0x02cb:
            r1 = 0
        L_0x02cc:
            if (r9 == 0) goto L_0x02dd
            boolean r7 = defpackage.n1g.B(r9)
            if (r7 == 0) goto L_0x02dd
            boolean r7 = r9.d()
            if (r7 == 0) goto L_0x02dd
            r27 = 1
            goto L_0x02df
        L_0x02dd:
            r27 = 0
        L_0x02df:
            r7 = 2
            if (r9 == 0) goto L_0x02f7
            vo8 r11 = r9.a
            o00 r11 = r11.d()
            if (r11 == 0) goto L_0x02f3
            boolean r11 = r11.d()
            r12 = 1
            if (r11 != r12) goto L_0x02f3
            r12 = r7
            goto L_0x02f4
        L_0x02f3:
            r12 = 1
        L_0x02f4:
            r29 = r12
            goto L_0x02f9
        L_0x02f7:
            r29 = 1
        L_0x02f9:
            java.lang.Object r12 = r8.b
            yha r12 = (yha) r12
            java.lang.Object r13 = r12.a
            android.content.Context r13 = (android.content.Context) r13
            r22 = 0
            if (r9 == 0) goto L_0x036f
            if (r10 == 0) goto L_0x036f
            boolean r10 = r10.O()
            if (r10 == 0) goto L_0x036f
            vo8 r7 = r9.a
            o00 r7 = r7.d()
            r10 = r15
            if (r7 == 0) goto L_0x0319
            long r14 = r7.e
            goto L_0x031b
        L_0x0319:
            r14 = r22
        L_0x031b:
            java.lang.Object r7 = r12.w0
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            int r12 = r7.getIntrinsicWidth()
            int r11 = r7.getIntrinsicWidth()
            r32 = r10
            r10 = 0
            r7.setBounds(r10, r10, r12, r11)
            bi5 r11 = new bi5
            r12 = 6
            r10 = 0
            r11.<init>(r7, r10, r12)
            android.content.res.Resources r7 = r13.getResources()
            int r12 = defpackage.j1a.l
            java.lang.String r7 = r7.getString(r12)
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            java.lang.String r13 = "  "
            java.lang.String r7 = r13.concat(r7)
            r12.<init>(r7)
            r7 = 0
            r10 = 1
            r13 = 17
            r12.setSpan(r11, r7, r10, r13)
            int r7 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r7 == 0) goto L_0x0369
            java.lang.String[] r7 = dhe.b
            java.lang.String r7 = defpackage.d8.a(r14)
            java.lang.String r10 = " · "
            java.lang.String r7 = r10.concat(r7)
            r12.append(r7)
        L_0x0369:
            r28 = r12
            r11 = 1
            r14 = 0
            goto L_0x04b6
        L_0x036f:
            r32 = r15
            if (r9 == 0) goto L_0x04b2
            vo8 r10 = r9.a
            o00 r10 = r10.d()
            if (r10 == 0) goto L_0x0384
            boolean r10 = r10.d()
            r11 = 1
            if (r10 != r11) goto L_0x0384
            r10 = r7
            goto L_0x0385
        L_0x0384:
            r10 = 1
        L_0x0385:
            vo8 r14 = r9.a
            o00 r15 = r14.d()
            r28 = r12
            if (r15 == 0) goto L_0x03a9
            long r11 = r15.e
            java.lang.Long r15 = java.lang.Long.valueOf(r11)
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 == 0) goto L_0x039a
            goto L_0x039b
        L_0x039a:
            r15 = 0
        L_0x039b:
            if (r15 == 0) goto L_0x03a9
            long r11 = r15.longValue()
            java.lang.String[] r15 = dhe.b
            java.lang.String r11 = defpackage.d8.a(r11)
            r12 = r11
            goto L_0x03aa
        L_0x03a9:
            r12 = 0
        L_0x03aa:
            boolean r11 = defpackage.n1g.B(r9)
            if (r11 == 0) goto L_0x03b9
            boolean r11 = r9.d()
            if (r11 == 0) goto L_0x03b9
            r23 = 1
            goto L_0x03bb
        L_0x03b9:
            r23 = 0
        L_0x03bb:
            boolean r11 = r9.d()
            if (r11 == 0) goto L_0x03d5
            o00 r11 = r14.d()
            if (r11 == 0) goto L_0x03d5
            r14 = 4
            int r15 = r11.d
            if (r15 != r14) goto L_0x03cd
            goto L_0x03d3
        L_0x03cd:
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x03d5
        L_0x03d3:
            r14 = 1
            goto L_0x03d6
        L_0x03d5:
            r14 = 0
        L_0x03d6:
            if (r10 != r7) goto L_0x03df
            if (r14 != 0) goto L_0x03dc
            if (r23 == 0) goto L_0x03df
        L_0x03dc:
            r15 = r28
            goto L_0x03e2
        L_0x03df:
            r15 = r28
            goto L_0x03ed
        L_0x03e2:
            java.lang.Object r7 = r15.b
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            goto L_0x0444
        L_0x03ed:
            if (r10 != r7) goto L_0x0400
            boolean r11 = r9.d()
            if (r11 == 0) goto L_0x0400
            java.lang.Object r7 = r15.o
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            goto L_0x0444
        L_0x0400:
            if (r10 != r7) goto L_0x040d
            java.lang.Object r7 = r15.Y
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            goto L_0x0444
        L_0x040d:
            r7 = 1
            if (r10 != r7) goto L_0x0422
            if (r14 != 0) goto L_0x0417
            if (r23 == 0) goto L_0x0415
            goto L_0x0417
        L_0x0415:
            r7 = 1
            goto L_0x0422
        L_0x0417:
            java.lang.Object r7 = r15.c
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            goto L_0x0444
        L_0x0422:
            if (r10 != r7) goto L_0x0436
            boolean r11 = r9.d()
            if (r11 == 0) goto L_0x0436
            java.lang.Object r10 = r15.X
            t97 r10 = (defpackage.t97) r10
            java.lang.Object r10 = r10.getValue()
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r7 = r10
            goto L_0x0444
        L_0x0436:
            if (r10 != r7) goto L_0x0443
            java.lang.Object r7 = r15.Z
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            goto L_0x0444
        L_0x0443:
            r7 = 0
        L_0x0444:
            if (r23 == 0) goto L_0x044d
            int r10 = defpackage.ctb.call_history_item_call_missed
            java.lang.String r10 = r13.getString(r10)
            goto L_0x0485
        L_0x044d:
            if (r14 == 0) goto L_0x0456
            int r10 = defpackage.ctb.call_history_item_call_reject
            java.lang.String r10 = r13.getString(r10)
            goto L_0x0485
        L_0x0456:
            boolean r10 = r9.d()
            if (r10 == 0) goto L_0x0471
            if (r12 == 0) goto L_0x046a
            int r10 = defpackage.ctb.call_history_item_call_incoming_with_time
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r10 = r13.getString(r10, r12)
            if (r10 != 0) goto L_0x0485
        L_0x046a:
            int r10 = defpackage.ctb.call_history_item_call_incoming
            java.lang.String r10 = r13.getString(r10)
            goto L_0x0485
        L_0x0471:
            if (r12 == 0) goto L_0x047f
            int r10 = defpackage.ctb.call_history_item_call_outgoing_with_time
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r10 = r13.getString(r10, r12)
            if (r10 != 0) goto L_0x0485
        L_0x047f:
            int r10 = defpackage.ctb.call_history_item_call_outgoing
            java.lang.String r10 = r13.getString(r10)
        L_0x0485:
            if (r7 == 0) goto L_0x049a
            int r12 = r7.getIntrinsicWidth()
            int r13 = r7.getIntrinsicHeight()
            r14 = 0
            r7.setBounds(r14, r14, r12, r13)
            android.text.style.ImageSpan r12 = new android.text.style.ImageSpan
            r11 = 1
            r12.<init>(r7, r11)
            goto L_0x049d
        L_0x049a:
            r11 = 1
            r14 = 0
            r12 = 0
        L_0x049d:
            android.text.SpannableString r7 = new android.text.SpannableString
            java.lang.String r13 = "  "
            java.lang.String r10 = rf0.h(r13, r10)
            r7.<init>(r10)
            if (r12 == 0) goto L_0x04af
            r10 = 17
            r7.setSpan(r12, r14, r11, r10)
        L_0x04af:
            r28 = r7
            goto L_0x04b6
        L_0x04b2:
            r11 = 1
            r14 = 0
            r28 = r24
        L_0x04b6:
            if (r9 == 0) goto L_0x04e5
            java.lang.Object r7 = r8.c
            t97 r7 = (defpackage.t97) r7
            java.lang.Object r7 = r7.getValue()
            go2 r7 = (go2) r7
            vo8 r8 = r9.a
            long r8 = r8.o
            nj4 r7 = r7.b
            java.lang.Object r7 = r7.get()
            w6a r7 = (defpackage.w6a) r7
            i03 r10 = r7.c
            java.util.Locale r34 = r10.u()
            long r37 = r10.m()
            android.content.Context r7 = r7.a
            r39 = 1
            r33 = r7
            r35 = r8
            java.lang.String r12 = defpackage.xs7.o(r33, r34, r35, r37, r39)
            goto L_0x04e6
        L_0x04e5:
            r12 = 0
        L_0x04e6:
            if (r12 != 0) goto L_0x04eb
            r26 = r24
            goto L_0x04ed
        L_0x04eb:
            r26 = r12
        L_0x04ed:
            tf3 r7 = r3.b
            if (r7 == 0) goto L_0x04f8
            java.lang.CharSequence r3 = r7.m()
        L_0x04f5:
            r22 = r3
            goto L_0x050c
        L_0x04f8:
            i22 r7 = r3.a
            if (r7 == 0) goto L_0x050a
            boolean r7 = r7.O()
            if (r7 != 0) goto L_0x050a
            i22 r3 = r3.a
            r3.i0()
            java.lang.CharSequence r3 = r3.B0
            goto L_0x04f5
        L_0x050a:
            r22 = r24
        L_0x050c:
            boolean r3 = r2 instanceof defpackage.tg6
            eh6 r7 = new eh6
            r17 = r7
            r23 = r1
            r24 = r3
            r30 = r2
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.put(r6, r7)
            r1 = r11
            r7 = r14
            r2 = r31
            r15 = r32
            goto L_0x0126
        L_0x0526:
            r11 = r1
            r32 = r15
            lk9 r1 = defpackage.g71.b
            g71 r2 = r0.b
            r1.getClass()
            g71 r1 = defpackage.g71.ALL
            if (r2 != r1) goto L_0x054e
            grd r1 = r0.A0
        L_0x0536:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.getClass()
            boolean r3 = r5.isEmpty()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = r1.b(r2, r3)
            if (r2 == 0) goto L_0x0536
        L_0x054e:
            boolean r1 = r4 instanceof defpackage.pia
            if (r1 == 0) goto L_0x0561
            pia r4 = (defpackage.pia) r4
            r4.getClass()
            pia r1 = new pia
            r1.<init>(r5)
        L_0x055c:
            r3 = r16
            r2 = r32
            goto L_0x0567
        L_0x0561:
            pia r1 = new pia
            r1.<init>(r5)
            goto L_0x055c
        L_0x0567:
            boolean r1 = r2.b(r3, r1)
            if (r1 == 0) goto L_0x056e
            return
        L_0x056e:
            r1 = r11
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.t():void");
    }
}
