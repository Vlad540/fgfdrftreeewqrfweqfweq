package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: a40  reason: default package */
public final class a40 implements rj5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public a40(i7c i7c, rj5 rj5, ComplaintBottomSheet complaintBottomSheet) {
        this.a = 4;
        this.c = i7c;
        this.o = complaintBottomSheet;
        this.b = rj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = 0
            r4 = 2
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = r1.a
            switch(r9) {
                case 0: goto L_0x0430;
                case 1: goto L_0x03c5;
                case 2: goto L_0x0354;
                case 3: goto L_0x0263;
                case 4: goto L_0x018b;
                case 5: goto L_0x0128;
                case 6: goto L_0x00f8;
                case 7: goto L_0x0089;
                case 8: goto L_0x0029;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.Object r3 = r1.b
            hu3 r3 = (hu3) r3
            java.lang.Object r4 = r1.c
            java.lang.Object r1 = r1.o
            due r1 = (due) r1
            java.lang.Object r0 = am7.E(r3, r0, r4, r1, r2)
            pu3 r1 = pu3.a
            if (r0 != r1) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            jue r0 = jue.a
        L_0x0028:
            return r0
        L_0x0029:
            boolean r3 = r2 instanceof defpackage.w19
            if (r3 == 0) goto L_0x003a
            r3 = r2
            w19 r3 = (defpackage.w19) r3
            int r4 = r3.X
            r5 = r4 & r8
            if (r5 == 0) goto L_0x003a
            int r4 = r4 - r8
            r3.X = r4
            goto L_0x003f
        L_0x003a:
            w19 r3 = new w19
            r3.<init>(r1, r2)
        L_0x003f:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0053
            if (r5 != r7) goto L_0x004d
            wx3.H(r2)
            goto L_0x0086
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0053:
            wx3.H(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            java.lang.Object r0 = r1.c
            x19 r0 = (defpackage.x19) r0
            grd r0 = r0.z0
            java.lang.Object r0 = r0.getValue()
            wna r0 = (wna) r0
            dk r0 = r0.a()
            java.lang.Object r2 = r1.o
            aqc r2 = (defpackage.aqc) r2
            java.lang.String r2 = r2.toString()
            r0.Z = r2
            wna r0 = r0.a()
            r3.X = r7
            java.lang.Object r1 = r1.b
            rj5 r1 = (rj5) r1
            java.lang.Object r0 = r1.a(r0, r3)
            if (r0 != r4) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            jue r4 = jue.a
        L_0x0088:
            return r4
        L_0x0089:
            boolean r3 = r2 instanceof tm5
            if (r3 == 0) goto L_0x009a
            r3 = r2
            tm5 r3 = (tm5) r3
            int r9 = r3.w0
            r10 = r9 & r8
            if (r10 == 0) goto L_0x009a
            int r9 = r9 - r8
            r3.w0 = r9
            goto L_0x009f
        L_0x009a:
            tm5 r3 = new tm5
            r3.<init>(r1, r2)
        L_0x009f:
            java.lang.Object r2 = r3.Y
            pu3 r8 = pu3.a
            int r9 = r3.w0
            if (r9 == 0) goto L_0x00bd
            if (r9 == r7) goto L_0x00b5
            if (r9 != r4) goto L_0x00af
            wx3.H(r2)
            goto L_0x00f5
        L_0x00af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x00b5:
            l7c r0 = r3.X
            a40 r1 = r3.o
            wx3.H(r2)
            goto L_0x00dc
        L_0x00bd:
            wx3.H(r2)
            java.lang.Object r2 = r1.c
            l7c r2 = (l7c) r2
            java.lang.Object r6 = r2.a
            r3.o = r1
            r3.X = r2
            r3.w0 = r7
            java.lang.Object r7 = r1.o
            k26 r7 = (k26) r7
            java.lang.Object r0 = r7.invoke(r6, r0, r3)
            if (r0 != r8) goto L_0x00d7
            goto L_0x00f7
        L_0x00d7:
            r18 = r2
            r2 = r0
            r0 = r18
        L_0x00dc:
            r0.a = r2
            java.lang.Object r0 = r1.b
            rj5 r0 = (rj5) r0
            java.lang.Object r1 = r1.c
            l7c r1 = (l7c) r1
            java.lang.Object r1 = r1.a
            r3.o = r5
            r3.X = r5
            r3.w0 = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r8) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            jue r8 = jue.a
        L_0x00f7:
            return r8
        L_0x00f8:
            java.lang.Object r2 = r1.b
            l7c r2 = (l7c) r2
            java.lang.Object r3 = r2.a
            mc9 r3 = (mc9) r3
            if (r3 == 0) goto L_0x0106
            r3.setValue(r0)
            goto L_0x0125
        L_0x0106:
            grd r0 = hrd.a(r20)
            t0c r3 = new t0c
            java.lang.Object r4 = r1.c
            ou3 r4 = (ou3) r4
            hu3 r4 = r4.getCoroutineContext()
            lp.q(r4)
            r3.<init>(r0)
            java.lang.Object r1 = r1.o
            z63 r1 = (z63) r1
            a73 r1 = (a73) r1
            r1.makeCompleting$kotlinx_coroutines_core(r3)
            r2.a = r0
        L_0x0125:
            jue r0 = jue.a
            return r0
        L_0x0128:
            boolean r3 = r2 instanceof fj4
            if (r3 == 0) goto L_0x0139
            r3 = r2
            fj4 r3 = (fj4) r3
            int r4 = r3.Y
            r5 = r4 & r8
            if (r5 == 0) goto L_0x0139
            int r4 = r4 - r8
            r3.Y = r4
            goto L_0x013e
        L_0x0139:
            fj4 r3 = new fj4
            r3.<init>(r1, r2)
        L_0x013e:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.Y
            jue r8 = jue.a
            if (r5 == 0) goto L_0x0154
            if (r5 != r7) goto L_0x014e
            wx3.H(r2)
            goto L_0x017a
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0154:
            wx3.H(r2)
            java.lang.Object r2 = r1.c
            gj4 r2 = (gj4) r2
            u16 r5 = r2.b
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Object r6 = r1.o
            l7c r6 = (l7c) r6
            java.lang.Object r9 = r6.a
            kotlinx.coroutines.internal.Symbol r10 = wr9.a
            if (r9 == r10) goto L_0x017c
            i26 r2 = r2.c
            java.lang.Object r2 = r2.invoke(r9, r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r4 = r8
            goto L_0x018a
        L_0x017c:
            r6.a = r5
            r3.Y = r7
            java.lang.Object r1 = r1.b
            rj5 r1 = (rj5) r1
            java.lang.Object r0 = r1.a(r0, r3)
            if (r0 != r4) goto L_0x017a
        L_0x018a:
            return r4
        L_0x018b:
            boolean r4 = r2 instanceof m63
            if (r4 == 0) goto L_0x019c
            r4 = r2
            m63 r4 = (m63) r4
            int r9 = r4.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x019c
            int r9 = r9 - r8
            r4.X = r9
            goto L_0x01a1
        L_0x019c:
            m63 r4 = new m63
            r4.<init>(r1, r2)
        L_0x01a1:
            java.lang.Object r2 = r4.o
            pu3 r8 = pu3.a
            int r9 = r4.X
            if (r9 == 0) goto L_0x01b6
            if (r9 != r7) goto L_0x01b0
            wx3.H(r2)
            goto L_0x0260
        L_0x01b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x01b6:
            wx3.H(r2)
            java.lang.Object r2 = r1.c
            i7c r2 = (i7c) r2
            boolean r6 = r2.a
            if (r6 != 0) goto L_0x0253
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            boolean r9 = r6.isEmpty()
            r9 = r9 ^ r7
            if (r9 == 0) goto L_0x0253
            k77[] r9 = one.me.complaintbottomsheet.ComplaintBottomSheet.X
            java.lang.Object r9 = r1.o
            one.me.complaintbottomsheet.ComplaintBottomSheet r9 = (one.me.complaintbottomsheet.ComplaintBottomSheet) r9
            r9.getClass()
            k77[] r10 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            int r10 = d4a.c
            r11 = 6
            jc3 r10 = defpackage.rf0.c(r10, r11, r5)
            int r11 = d4a.a
            hge r12 = new hge
            r12.<init>(r11)
            r10.f(r12)
            java.util.Iterator r6 = r6.iterator()
        L_0x01eb:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r6.next()
            kc3 r11 = (defpackage.kc3) r11
            kc3[] r11 = new defpackage.kc3[]{r11}
            r10.a(r11)
            goto L_0x01eb
        L_0x01ff:
            r7e r6 = r9.c
            java.lang.Object r6 = r6.getValue()
            kc3 r6 = (defpackage.kc3) r6
            kc3[] r6 = new defpackage.kc3[]{r6}
            r10.a(r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r12 = r10.e()
            o63 r6 = new o63
            r6.<init>(r3, r9)
            r12.addLifecycleListener(r6)
            r12.setTargetController(r9)
            r6 = r9
        L_0x021e:
            rr3 r10 = r6.getParentController()
            if (r10 == 0) goto L_0x0229
            rr3 r6 = r6.getParentController()
            goto L_0x021e
        L_0x0229:
            boolean r10 = r6 instanceof defpackage.ygc
            if (r10 == 0) goto L_0x0230
            ygc r6 = (defpackage.ygc) r6
            goto L_0x0231
        L_0x0230:
            r6 = r5
        L_0x0231:
            if (r6 == 0) goto L_0x0237
            sgc r5 = r6.S()
        L_0x0237:
            r12.y0(r9)
            if (r5 == 0) goto L_0x0251
            vgc r6 = new vgc
            r14 = 0
            r17 = -1
            r13 = 0
            r15 = 0
            r16 = 0
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.String r9 = "BottomSheetWidget"
            defpackage.rf0.k(r3, r6, r7, r9)
            r5.G(r6)
        L_0x0251:
            r2.a = r7
        L_0x0253:
            r4.X = r7
            java.lang.Object r1 = r1.b
            rj5 r1 = (rj5) r1
            java.lang.Object r0 = r1.a(r0, r4)
            if (r0 != r8) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            jue r8 = jue.a
        L_0x0262:
            return r8
        L_0x0263:
            boolean r4 = r2 instanceof en2
            if (r4 == 0) goto L_0x0274
            r4 = r2
            en2 r4 = (en2) r4
            int r9 = r4.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x0274
            int r9 = r9 - r8
            r4.X = r9
            goto L_0x0279
        L_0x0274:
            en2 r4 = new en2
            r4.<init>(r1, r2)
        L_0x0279:
            java.lang.Object r2 = r4.o
            pu3 r8 = pu3.a
            int r9 = r4.X
            if (r9 == 0) goto L_0x028e
            if (r9 != r7) goto L_0x0288
            wx3.H(r2)
            goto L_0x0351
        L_0x0288:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x028e:
            wx3.H(r2)
            mte r0 = (defpackage.mte) r0
            java.lang.Object r2 = r1.c
            nn2 r2 = (nn2) r2
            t0c r2 = r2.Z0
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 == 0) goto L_0x0344
            uq7 r0 = r0.a
            long r9 = r2.a
            java.lang.Object r0 = r0.c(r9)
            ip2 r0 = (defpackage.ip2) r0
            if (r0 != 0) goto L_0x02b1
            goto L_0x0344
        L_0x02b1:
            java.lang.Object r2 = r1.o
            t97 r2 = (t97) r2
            java.lang.Object r2 = r2.getValue()
            jte r2 = (defpackage.jte) r2
            ma2 r2 = (ma2) r2
            r2.getClass()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r0 = r0.b
            r6.<init>(r0)
            int r0 = r6.length()
            r9 = 33
            r10 = 8203(0x200b, float:1.1495E-41)
            if (r0 != 0) goto L_0x02d2
            goto L_0x0322
        L_0x02d2:
            int r0 = r6.length()     // Catch:{ all -> 0x02e8 }
            int r0 = r0 - r7
            int r11 = r6.length()     // Catch:{ all -> 0x02e8 }
            java.lang.Class<wld> r12 = defpackage.wld.class
            java.lang.Object[] r0 = r6.getSpans(r0, r11, r12)     // Catch:{ all -> 0x02e8 }
            java.lang.Object r0 = cs.Z(r3, r0)     // Catch:{ all -> 0x02e8 }
            wld r0 = (defpackage.wld) r0     // Catch:{ all -> 0x02e8 }
            goto L_0x02ef
        L_0x02e8:
            r0 = move-exception
            kcc r3 = new kcc
            r3.<init>(r0)
            r0 = r3
        L_0x02ef:
            boolean r3 = r0 instanceof kcc
            if (r3 == 0) goto L_0x02f4
            goto L_0x02f5
        L_0x02f4:
            r5 = r0
        L_0x02f5:
            wld r5 = (defpackage.wld) r5
            if (r5 == 0) goto L_0x02fd
            r6.removeSpan(r5)
            goto L_0x0300
        L_0x02fd:
            r6.append(r10)
        L_0x0300:
            wld r0 = new wld
            r3 = 4
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = a24.X(r3)
            r0.<init>(r3)
            int r3 = r6.length()
            int r3 = r3 - r7
            int r5 = r6.length()
            r6.setSpan(r0, r3, r5, r9)
        L_0x0322:
            r6.append(r10)
            r7e r0 = r2.s
            java.lang.Object r0 = r0.getValue()
            bi5 r0 = (defpackage.bi5) r0
            int r2 = r6.length()
            int r2 = r2 - r7
            int r3 = r6.length()
            r6.setSpan(r0, r2, r3, r9)
            int r0 = defpackage.bmd.a
            bmd r0 = defpackage.oa2.F(r6, r7)
            lge r5 = new lge
            r5.<init>(r0)
        L_0x0344:
            r4.X = r7
            java.lang.Object r0 = r1.b
            rj5 r0 = (rj5) r0
            java.lang.Object r0 = r0.a(r5, r4)
            if (r0 != r8) goto L_0x0351
            goto L_0x0353
        L_0x0351:
            jue r8 = jue.a
        L_0x0353:
            return r8
        L_0x0354:
            boolean r3 = r2 instanceof cn2
            if (r3 == 0) goto L_0x0365
            r3 = r2
            cn2 r3 = (cn2) r3
            int r9 = r3.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x0365
            int r9 = r9 - r8
            r3.X = r9
            goto L_0x036a
        L_0x0365:
            cn2 r3 = new cn2
            r3.<init>(r1, r2)
        L_0x036a:
            java.lang.Object r2 = r3.o
            pu3 r8 = pu3.a
            int r9 = r3.X
            if (r9 == 0) goto L_0x0386
            if (r9 == r7) goto L_0x0380
            if (r9 != r4) goto L_0x037a
            wx3.H(r2)
            goto L_0x03c2
        L_0x037a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0380:
            rj5 r0 = r3.Y
            wx3.H(r2)
            goto L_0x03b7
        L_0x0386:
            wx3.H(r2)
            pda r0 = (defpackage.pda) r0
            java.lang.Object r0 = r1.b
            rj5 r0 = (rj5) r0
            r3.Y = r0
            r3.X = r7
            java.lang.Object r2 = r1.c
            stf r2 = (stf) r2
            java.lang.Object r6 = r2.c
            t97 r6 = (t97) r6
            java.lang.Object r6 = r6.getValue()
            pae r6 = (defpackage.pae) r6
            n3a r6 = (n3a) r6
            ju3 r6 = r6.b()
            bj7 r7 = new bj7
            java.lang.Object r1 = r1.o
            android.content.Context r1 = (android.content.Context) r1
            r7.<init>(r2, r1, r5)
            java.lang.Object r2 = xs7.U(r6, r7, r3)
            if (r2 != r8) goto L_0x03b7
            goto L_0x03c4
        L_0x03b7:
            r3.Y = r5
            r3.X = r4
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r8) goto L_0x03c2
            goto L_0x03c4
        L_0x03c2:
            jue r8 = jue.a
        L_0x03c4:
            return r8
        L_0x03c5:
            boolean r3 = r2 instanceof u11
            if (r3 == 0) goto L_0x03d6
            r3 = r2
            u11 r3 = (u11) r3
            int r9 = r3.X
            r10 = r9 & r8
            if (r10 == 0) goto L_0x03d6
            int r9 = r9 - r8
            r3.X = r9
            goto L_0x03db
        L_0x03d6:
            u11 r3 = new u11
            r3.<init>(r1, r2)
        L_0x03db:
            java.lang.Object r2 = r3.o
            pu3 r8 = pu3.a
            int r9 = r3.X
            if (r9 == 0) goto L_0x03f7
            if (r9 == r7) goto L_0x03f1
            if (r9 != r4) goto L_0x03eb
            wx3.H(r2)
            goto L_0x042d
        L_0x03eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x03f1:
            rj5 r0 = r3.Y
            wx3.H(r2)
            goto L_0x0422
        L_0x03f7:
            wx3.H(r2)
            lj3 r0 = (defpackage.lj3) r0
            k77[] r0 = x11.p
            java.lang.Object r0 = r1.c
            x11 r0 = (x11) r0
            t97 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (defpackage.bv2) r0
            java.lang.Object r2 = r1.o
            i22 r2 = (defpackage.i22) r2
            long r9 = r2.a
            java.lang.Object r1 = r1.b
            rj5 r1 = (rj5) r1
            r3.Y = r1
            r3.X = r7
            aw2 r0 = (defpackage.aw2) r0
            java.lang.Comparable r2 = r0.j(r9, r3)
            if (r2 != r8) goto L_0x0421
            goto L_0x042f
        L_0x0421:
            r0 = r1
        L_0x0422:
            r3.Y = r5
            r3.X = r4
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r8) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            jue r8 = jue.a
        L_0x042f:
            return r8
        L_0x0430:
            boolean r3 = r2 instanceof defpackage.z30
            if (r3 == 0) goto L_0x0441
            r3 = r2
            z30 r3 = (defpackage.z30) r3
            int r4 = r3.X
            r5 = r4 & r8
            if (r5 == 0) goto L_0x0441
            int r4 = r4 - r8
            r3.X = r4
            goto L_0x0446
        L_0x0441:
            z30 r3 = new z30
            r3.<init>(r1, r2)
        L_0x0446:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x045a
            if (r5 != r7) goto L_0x0454
            wx3.H(r2)
            goto L_0x0491
        L_0x0454:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x045a:
            wx3.H(r2)
            java.lang.Object r2 = r1.b
            rj5 r2 = (rj5) r2
            r5 = r0
            java.lang.Number r5 = (java.lang.Number) r5
            r5.floatValue()
            java.lang.Object r5 = r1.c
            e40 r5 = (defpackage.e40) r5
            java.lang.Long r5 = r5.e
            java.lang.Object r1 = r1.o
            t97 r1 = (t97) r1
            java.lang.Object r1 = r1.getValue()
            va9 r1 = (defpackage.va9) r1
            nb9 r1 = (defpackage.nb9) r1
            long r8 = r1.l()
            if (r5 != 0) goto L_0x0480
            goto L_0x0491
        L_0x0480:
            long r5 = r5.longValue()
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0491
            r3.X = r7
            java.lang.Object r0 = r2.a(r0, r3)
            if (r0 != r4) goto L_0x0491
            goto L_0x0493
        L_0x0491:
            jue r4 = jue.a
        L_0x0493:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a40.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ a40(Object obj, Object obj2, rj5 rj5, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = rj5;
    }

    public /* synthetic */ a40(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public a40(rj5 rj5, hu3 hu3) {
        this.a = 9;
        this.b = hu3;
        this.c = ThreadContextKt.threadContextElements(hu3);
        this.o = new due(rj5, (Continuation) null);
    }
}
