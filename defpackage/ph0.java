package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageWriter;
import android.text.Spannable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ph0  reason: default package */
public final /* synthetic */ class ph0 implements bid, au, of3, v37, kh7, lh7, m48, ld8, j26, l7e {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ph0(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.o = obj2;
    }

    public Object a() {
        ((vxe) this.c).d.a((hb0) this.o, this.b + 1, false);
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [w52, java.lang.Object] */
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                y52 y52 = (y52) obj;
                ((t52) this.c).getClass();
                kgd kgd = new kgd(0);
                for (Long l : (List) this.o) {
                    ? obj2 = new Object();
                    obj2.b = l.longValue();
                    obj2.a = this.b;
                    kgd.put(l, new x52(obj2));
                }
                y52.R.putAll(kgd);
                return;
            case 3:
                y52 y522 = (y52) obj;
                a62 a2 = ((b62) this.c).a();
                a2.a = this.b;
                b62 a3 = a2.a();
                HashSet hashSet = e00.G0;
                Set set = (Set) this.o;
                if (hhd.f(hashSet, set)) {
                    y522.q = a3;
                    return;
                } else if (hhd.f(e00.H0, set)) {
                    y522.r = a3;
                    return;
                } else if (hhd.f(e00.I0, set)) {
                    y522.s = a3;
                    return;
                } else if (hhd.f(e00.J0, set)) {
                    y522.t = a3;
                    return;
                } else if (hhd.f(e00.K0, set)) {
                    y522.u = a3;
                    return;
                } else if (hhd.f(e00.L0, set)) {
                    y522.v = a3;
                    return;
                } else if (hhd.f(e00.M0, set)) {
                    y522.w = a3;
                    return;
                } else {
                    return;
                }
            default:
                bhe bhe = (bhe) obj;
                int ordinal = ((sf7) this.o).ordinal();
                Spannable spannable = (Spannable) this.c;
                int i = this.b;
                if (ordinal == 1) {
                    spannable.setSpan(new pe6(bhe.c, i), bhe.a, bhe.b, 33);
                    return;
                } else if (ordinal == 2) {
                    spannable.setSpan(new yo0(bhe.c, i), bhe.a, bhe.b, 33);
                    return;
                } else if (ordinal == 3) {
                    spannable.setSpan(new efb(bhe.c, i), bhe.a, bhe.b, 33);
                    return;
                } else {
                    return;
                }
        }
    }

    public ch7 apply(Object obj) {
        lr6 lr6;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        yr1 yr1 = (yr1) this.c;
        yr1.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) this.o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zq1 zq1 = yr1.d;
            if (hasNext) {
                pw1 pw1 = (pw1) it.next();
                w30 w30 = new w30(pw1);
                ws1 ws1 = null;
                int i = pw1.c;
                if (i == 5) {
                    ewf ewf = zq1.l;
                    if (!ewf.d && !ewf.c) {
                        try {
                            lr6 = (lr6) ewf.b.d();
                        } catch (NoSuchElementException unused) {
                            lr6 = null;
                        }
                        if (lr6 != null) {
                            ewf ewf2 = zq1.l;
                            ewf2.getClass();
                            Image Z = lr6.Z();
                            ImageWriter imageWriter = ewf2.j;
                            if (!(imageWriter == null || Z == null)) {
                                try {
                                    imageWriter.queueInputImage(Z);
                                    xs1 imageInfo = lr6.getImageInfo();
                                    if (imageInfo instanceof xs1) {
                                        ws1 = imageInfo.a;
                                    }
                                } catch (IllegalStateException e) {
                                    e.getMessage();
                                }
                            }
                        }
                    }
                }
                if (ws1 != null) {
                    w30.h = ws1;
                } else {
                    int i2 = (yr1.a != 3 || yr1.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                    if (i2 != -1) {
                        w30.c = i2;
                    }
                }
                kp0 kp0 = yr1.e;
                if (kp0.b && this.b == 0 && kp0.a) {
                    fc9 c2 = fc9.c();
                    c2.j(js1.Q(CaptureRequest.CONTROL_AE_MODE), 3);
                    w30.c(new mv4(7, hga.a(c2)));
                }
                arrayList.add(hwf.f(new j9(yr1, 11, w30)));
                arrayList2.add(w30.d());
            } else {
                zq1.z(arrayList2);
                return ct0.b(arrayList);
            }
        }
    }

    public void b(ic8 ic8) {
        md8 md8 = (md8) this.c;
        md8.getClass();
        c58 c58 = (c58) this.o;
        if (TextUtils.isEmpty(c58.a)) {
            ez3.j0("onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        ch7 k = md8.f.k(ic8, ws6.n(qa7.h(c58)));
        jn jnVar = new jn(md8, ic8, this.b);
        k.c(new p36(k, 0, jnVar), lh4.a);
    }

    public void f(nn6 nn6, int i) {
        switch (this.a) {
            case 7:
                o48 o48 = (o48) this.c;
                m3d m3d = o48.k;
                m3d.getClass();
                int f = m3d.a.f();
                int i2 = this.b;
                l68 l68 = (l68) this.o;
                z48 z48 = o48.c;
                if (f >= 2) {
                    nn6.D0(z48, i, i2, l68.d(true));
                    return;
                }
                nn6.E(z48, i, i2 + 1, l68.d(true));
                nn6.L(z48, i, i2);
                return;
            default:
                o48 o482 = (o48) this.c;
                o482.getClass();
                ts6 i3 = ws6.i();
                int i4 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i4 < list.size()) {
                        i3.a(((l68) list.get(i4)).d(true));
                        i4++;
                    } else {
                        nn6.U(o482.c, i, this.b, new it0(i3.j()));
                        return;
                    }
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0177 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b4 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b6 A[Catch:{ all -> 0x01dd, all -> 0x016e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(ax4 r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x022e
            java.lang.Object r3 = r0.c
            h24 r3 = (h24) r3
            z4b r14 = r3.c
            r4 = r14
            ji0 r4 = (ji0) r4
            tr6 r5 = r4.a
            r21.n0()
            lq6 r6 = r1.c
            java.lang.String r6 = r6.a
            java.lang.String r7 = "image_format"
            r4.putExtra(r7, r6)
            android.net.Uri r6 = r5.b
            r15 = 0
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = r6.toString()
            goto L_0x002a
        L_0x0029:
            r6 = r15
        L_0x002a:
            r1.z0 = r6
            java.lang.Object r6 = r0.o
            i24 r6 = (i24) r6
            vl4 r7 = r5.t
            if (r7 != 0) goto L_0x0036
            vl4 r7 = r6.e
        L_0x0036:
            r8 = 16
            boolean r8 = ah0.l(r2, r8)
            vl4 r9 = vl4.a
            if (r7 == r9) goto L_0x0046
            vl4 r9 = vl4.b
            if (r7 != r9) goto L_0x005e
            if (r8 != 0) goto L_0x005e
        L_0x0046:
            boolean r6 = r6.f
            if (r6 != 0) goto L_0x0052
            android.net.Uri r6 = r5.b
            boolean r6 = fye.e(r6)
            if (r6 != 0) goto L_0x005e
        L_0x0052:
            hbc r6 = r5.i
            rfc r5 = r5.j
            int r0 = r0.b
            int r0 = n1g.i(r5, r6, r1, r0)
            r1.w0 = r0
        L_0x005e:
            hr6 r0 = r4.A0
            di9 r0 = r0.v
            r0.getClass()
            int r0 = r3.h
            r21.n0()
            lq6 r5 = r1.c
            lq6 r6 = o84.a
            if (r5 == r6) goto L_0x0078
            boolean r5 = ah0.b(r22)
            if (r5 == 0) goto L_0x0078
            goto L_0x022e
        L_0x0078:
            boolean r5 = r3.f
            if (r5 != 0) goto L_0x022e
            boolean r5 = ax4.m0(r21)
            if (r5 != 0) goto L_0x0084
            goto L_0x022e
        L_0x0084:
            r21.n0()
            lq6 r5 = r1.c
            lq6 r6 = o84.c
            boolean r5 = hhd.f(r5, r6)
            java.lang.String r13 = "DecodeProducer"
            c5b r12 = r3.d
            if (r5 == 0) goto L_0x00e2
            r21.n0()
            int r5 = r1.Y
            long r5 = (long) r5
            r21.n0()
            int r7 = r1.Z
            long r7 = (long) r7
            gq6 r9 = r3.e
            android.graphics.Bitmap$Config r10 = r9.a
            int r10 = mn0.b(r10)
            long r5 = r5 * r7
            long r7 = (long) r10
            long r5 = r5 * r7
            r7 = 104857600(0x6400000, double:5.1806538E-316)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r21.n0()
            int r2 = r1.Y
            r21.n0()
            int r1 = r1.Z
            java.lang.String r4 = "Image is too big to attempt decoding: w = "
            java.lang.String r5 = ", h = "
            java.lang.String r6 = ", pixel config = "
            java.lang.StringBuilder r1 = defpackage.rf0.i(r4, r2, r5, r1, r6)
            android.graphics.Bitmap$Config r2 = r9.a
            r1.append(r2)
            java.lang.String r2 = ", max bitmap size = 104857600"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r12.d(r14, r13, r0, r15)
            r3.q(r0)
            goto L_0x022e
        L_0x00e2:
            r21.n0()
            lq6 r5 = r1.c
            java.lang.String r5 = r5.a
            java.lang.String r6 = "unknown"
            if (r5 != 0) goto L_0x00ef
            r10 = r6
            goto L_0x00f0
        L_0x00ef:
            r10 = r5
        L_0x00f0:
            r21.n0()
            int r5 = r1.Y
            r21.n0()
            int r7 = r1.Z
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "x"
            r8.append(r5)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            int r7 = r1.w0
            java.lang.String r16 = java.lang.String.valueOf(r7)
            boolean r9 = ah0.a(r22)
            if (r9 == 0) goto L_0x0124
            r8 = 8
            boolean r8 = ah0.l(r2, r8)
            if (r8 != 0) goto L_0x0124
            r8 = 1
            goto L_0x0125
        L_0x0124:
            r8 = 0
        L_0x0125:
            r15 = 4
            boolean r15 = ah0.l(r2, r15)
            tr6 r4 = r4.a
            hbc r4 = r4.i
            if (r4 == 0) goto L_0x0149
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r4.a
            r6.append(r7)
            r6.append(r5)
            int r4 = r4.b
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r17 = r4
            goto L_0x014b
        L_0x0149:
            r17 = r6
        L_0x014b:
            w37 r4 = r3.g     // Catch:{ all -> 0x016e }
            monitor-enter(r4)     // Catch:{ all -> 0x016e }
            long r5 = r4.i     // Catch:{ all -> 0x0227 }
            r18 = r10
            r19 = r11
            long r10 = r4.h     // Catch:{ all -> 0x0227 }
            long r6 = r5 - r10
            monitor-exit(r4)     // Catch:{ all -> 0x016e }
            r4 = r14
            ji0 r4 = (ji0) r4     // Catch:{ all -> 0x016e }
            tr6 r4 = r4.a     // Catch:{ all -> 0x016e }
            android.net.Uri r4 = r4.b     // Catch:{ all -> 0x016e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x016e }
            if (r8 != 0) goto L_0x0171
            if (r15 == 0) goto L_0x0169
            goto L_0x0171
        L_0x0169:
            int r5 = r3.n(r1)     // Catch:{ all -> 0x016e }
            goto L_0x0175
        L_0x016e:
            r0 = move-exception
            goto L_0x022a
        L_0x0171:
            int r5 = r21.o()     // Catch:{ all -> 0x016e }
        L_0x0175:
            if (r8 != 0) goto L_0x017f
            if (r15 == 0) goto L_0x017a
            goto L_0x017f
        L_0x017a:
            et6 r8 = r3.o()     // Catch:{ all -> 0x016e }
            goto L_0x0181
        L_0x017f:
            et6 r8 = et6.d     // Catch:{ all -> 0x016e }
        L_0x0181:
            r12.j(r14, r13)     // Catch:{ all -> 0x016e }
            b13 r15 = r3.r(r1, r5, r8)     // Catch:{ DecodeException -> 0x01ee, Exception -> 0x01ea }
            int r4 = r1.w0     // Catch:{ Exception -> 0x01e6 }
            r5 = 1
            if (r4 == r5) goto L_0x018f
            r2 = r2 | 16
        L_0x018f:
            r4 = r3
            r5 = r15
            r10 = r18
            r11 = r19
            r20 = r2
            r2 = r12
            r12 = r17
            r1 = r13
            r13 = r16
            at6 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01e2 }
            r2.a(r14, r1, r4)     // Catch:{ all -> 0x01e2 }
            r1 = r21
            r3.t(r1, r15, r0)     // Catch:{ all -> 0x016e }
            i24 r0 = r3.i     // Catch:{ all -> 0x016e }
            lv1 r0 = r0.j     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x016e }
            r10 = r0
            nfc r10 = (nfc) r10     // Catch:{ all -> 0x016e }
            if (r15 != 0) goto L_0x01b6
            r15 = 0
            goto L_0x01c8
        L_0x01b6:
            jk9 r9 = e13.X     // Catch:{ all -> 0x016e }
            r10.j()     // Catch:{ all -> 0x016e }
            boolean r0 = r15 instanceof android.graphics.Bitmap     // Catch:{ all -> 0x016e }
            t54 r0 = new t54     // Catch:{ all -> 0x016e }
            r12 = 1
            r7 = r0
            r8 = r15
            r5 = 0
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x016e }
            r15 = r0
        L_0x01c8:
            boolean r0 = ah0.a(r20)     // Catch:{ all -> 0x01dd }
            r3.s(r0)     // Catch:{ all -> 0x01dd }
            ah0 r0 = r3.b     // Catch:{ all -> 0x01dd }
            r2 = r20
            r0.g(r2, r15)     // Catch:{ all -> 0x01dd }
            e13.S(r15)     // Catch:{ all -> 0x016e }
        L_0x01d9:
            ax4.d(r21)
            goto L_0x022e
        L_0x01dd:
            r0 = move-exception
            e13.S(r15)     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x01e2:
            r0 = move-exception
            r1 = r21
            goto L_0x022a
        L_0x01e6:
            r0 = move-exception
            r2 = r12
            r5 = r15
            goto L_0x0212
        L_0x01ea:
            r0 = move-exception
            r2 = r12
        L_0x01ec:
            r5 = 0
            goto L_0x0212
        L_0x01ee:
            r0 = move-exception
            r2 = r12
            r5 = 0
            r10 = r0
            ax4 r0 = r10.a     // Catch:{ Exception -> 0x0210 }
            java.lang.String r11 = "ProgressiveDecoder"
            java.lang.String r12 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
            java.lang.String r15 = r10.getMessage()     // Catch:{ Exception -> 0x0210 }
            java.lang.String r5 = r0.m()     // Catch:{ Exception -> 0x0210 }
            int r0 = r0.o()     // Catch:{ Exception -> 0x0210 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0210 }
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r4, r5, r0}     // Catch:{ Exception -> 0x0210 }
            m75.m(r11, r12, r0)     // Catch:{ Exception -> 0x0210 }
            throw r10     // Catch:{ Exception -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            goto L_0x01ec
        L_0x0212:
            r4 = r3
            r10 = r18
            r11 = r19
            r12 = r17
            r15 = r13
            r13 = r16
            at6 r4 = r4.m(r5, r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x016e }
            r2.d(r14, r15, r0, r4)     // Catch:{ all -> 0x016e }
            r3.q(r0)     // Catch:{ all -> 0x016e }
            goto L_0x01d9
        L_0x0227:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0227 }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x022a:
            ax4.d(r21)
            throw r0
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph0.g(ax4, int):void");
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 5:
                gya gya = (gya) obj;
                gya.getClass();
                gya.C((iya) this.c, (iya) this.o, this.b);
                return;
            default:
                hya hya = (hya) obj;
                int i = this.b;
                hya.p(i);
                hya.q((jya) this.c, (jya) this.o, i);
                return;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:38|(2:49|50)|51|52|53|54) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:39|40|41|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00f0=Splitter:B:53:0x00f0, B:43:0x00cd=Splitter:B:43:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(ihd r8) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x0099;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.c
            k3e r0 = (defpackage.k3e) r0
            java.util.ArrayList r1 = r0.p
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0075
            boolean r2 = r0.e()
            if (r2 == 0) goto L_0x0075
            i22 r2 = r0.n
            long r2 = r2.a
            zo0 r4 = r0.d
            r4.getClass()
            bf5 r4 = r4.a     // Catch:{ Exception -> 0x0031 }
            mg5 r4 = (defpackage.mg5) r4     // Catch:{ Exception -> 0x0031 }
            java.io.File r4 = r4.e(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r4 = lp.y(r4)     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x0045
            ap0 r4 = (defpackage.ap0) r4     // Catch:{ Exception -> 0x0031 }
            goto L_0x0046
        L_0x0031:
            r4 = move-exception
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r4.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "zo0"
            java.lang.String r4 = "Failed to load botCommands, chatId = %d, exception message = %s"
            udd.p(r3, r4, r2)
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 != 0) goto L_0x0049
            goto L_0x0075
        L_0x0049:
            java.util.List r2 = r4.a
            java.util.Map r3 = r4.b
            gvf r4 = r0.f
            java.util.HashMap r3 = (java.util.HashMap) r3
            r4.getClass()
            if (r2 != 0) goto L_0x005b
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0065
        L_0x005b:
            j9 r5 = new j9
            r6 = 3
            r5.<init>(r4, r6, r3)
            java.util.ArrayList r2 = defpackage.ek8.M(r2, r5)
        L_0x0065:
            monitor-enter(r0)
            java.util.ArrayList r3 = r0.p     // Catch:{ all -> 0x0072 }
            r3.clear()     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r3 = r0.p     // Catch:{ all -> 0x0072 }
            r3.addAll(r2)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            goto L_0x0075
        L_0x0072:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r7
        L_0x0075:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            j2e r1 = r0.c()
            k2e r0 = r0.e
            java.lang.Object r3 = r7.o
            java.lang.String r3 = (java.lang.String) r3
            int r7 = r7.b
            java.util.List r7 = r0.f(r3, r7, r2, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            boolean r7 = r8.h()
            if (r7 != 0) goto L_0x0098
            r8.a(r0)
        L_0x0098:
            return
        L_0x0099:
            java.lang.Object r0 = r7.c
            nt7 r0 = (defpackage.nt7) r0
            zl3 r0 = r0.i
            r0.getClass()
            java.lang.Object r0 = r7.o
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = r0.getResources()
            int r7 = r7.b
            java.io.InputStream r0 = r0.openRawResource(r7)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00e6 }
            r1.<init>()     // Catch:{ IOException -> 0x00e6 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x00e6 }
        L_0x00b9:
            r4 = 0
            int r5 = r0.read(r3, r4, r2)     // Catch:{ all -> 0x00c5 }
            r6 = -1
            if (r5 == r6) goto L_0x00c7
            r1.write(r3, r4, r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x00b9
        L_0x00c5:
            r8 = move-exception
            goto L_0x00e8
        L_0x00c7:
            r0.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r1.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x00e6 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x00e6 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00e6 }
            tt7 r0 = new tt7     // Catch:{ IOException -> 0x00e6 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00e6 }
            ut7 r7 = new ut7
            r7.<init>(r0)
            r8.a(r7)
            return
        L_0x00e6:
            r8 = move-exception
            goto L_0x00f1
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            r0.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            r1.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            throw r8     // Catch:{ IOException -> 0x00e6 }
        L_0x00f1:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read resource "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ": "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph0.j(ihd):void");
    }

    public /* synthetic */ ph0(b62 b62, int i, aw2 aw2, Set set) {
        this.a = 3;
        this.c = b62;
        this.b = i;
        this.o = set;
    }

    public /* synthetic */ ph0(i2c i2c, List list) {
        this.a = 11;
        this.c = i2c;
        this.b = 10;
        this.o = list;
    }

    public /* synthetic */ ph0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ ph0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, pxe] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, pxe] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m32apply(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            java.lang.Object r2 = r7.o
            int r3 = r7.b
            java.lang.Object r4 = r7.c
            r5 = 3
            int r7 = r7.a
            switch(r7) {
                case 11: goto L_0x00c1;
                default: goto L_0x000e;
            }
        L_0x000e:
            pm6 r8 = (defpackage.pm6) r8
            ewe r4 = (defpackage.ewe) r4
            r4.getClass()
            boolean r7 = r8.a
            r0 = 0
            wve r2 = (defpackage.wve) r2
            java.lang.String r1 = r8.b
            if (r7 == 0) goto L_0x0042
            if (r3 != r5) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            boolean r4 = defpackage.sxe.a(r3)
            if (r4 != 0) goto L_0x002a
            r4 = 7
            if (r3 != r4) goto L_0x0042
        L_0x002a:
            java.lang.String r1 = z3d.v(r1)
            boolean r3 = r1g.p(r1)
            if (r3 != 0) goto L_0x0070
            pxe r0 = new pxe
            r0.<init>()
            r0.a = r1
            qxe r1 = new qxe
            r1.<init>(r0)
        L_0x0040:
            r0 = r1
            goto L_0x0070
        L_0x0042:
            if (r7 == 0) goto L_0x006e
            boolean r3 = defpackage.sxe.b(r3)
            if (r3 == 0) goto L_0x006e
            boolean r3 = r1g.p(r1)
            if (r3 == 0) goto L_0x0051
            goto L_0x0070
        L_0x0051:
            java.lang.String r3 = z3d.B(r1)
            boolean r4 = r1g.p(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = "ewe"
            udd.s(r3, r1, r0)
            goto L_0x0070
        L_0x0061:
            pxe r0 = new pxe
            r0.<init>()
            r0.a = r3
            qxe r1 = new qxe
            r1.<init>(r0)
            goto L_0x0040
        L_0x006e:
            qxe r0 = r2.h
        L_0x0070:
            if (r7 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. no upload result on finished upload"
            r7.<init>(r8)
            throw r7
        L_0x007d:
            r3 = 0
            if (r7 == 0) goto L_0x0098
            java.lang.String r1 = r0.a
            boolean r1 = r1g.p(r1)
            if (r1 == 0) goto L_0x0098
            long r5 = r0.b
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. token and attachId are empty"
            r7.<init>(r8)
            throw r7
        L_0x0098:
            long r5 = r8.d
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00b9
            vve r1 = r2.b()
            r1.h = r0
            if (r7 == 0) goto L_0x00a9
            rxe r7 = defpackage.rxe.UPLOADED
            goto L_0x00ab
        L_0x00a9:
            rxe r7 = defpackage.rxe.UPLOADING
        L_0x00ab:
            r1.g = r7
            float r7 = r8.c
            r1.e = r7
            r1.f = r5
            wve r7 = new wve
            r7.<init>(r1)
            return r7
        L_0x00b9:
            one.me.sdk.transfer.domain.UploadException r7 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r8 = "upload failed. file has zero size"
            r7.<init>(r8)
            throw r7
        L_0x00c1:
            java.util.List r8 = (java.util.List) r8
            i2c r4 = (defpackage.i2c) r4
            r4.getClass()
            int r7 = r8.size()
            n73 r8 = ms9.j(r8)
            if (r7 != r3) goto L_0x00d3
            goto L_0x011d
        L_0x00d3:
            java.lang.String r7 = "i2c"
            java.lang.String r6 = "getRecentContactsOldWay"
            udd.q(r7, r6)
            java.util.List r2 = (java.util.List) r2
            n73 r7 = ms9.j(r2)
            h2c r2 = new h2c
            r2.<init>(r4, r5)
            ps9 r4 = new ps9
            r4.<init>(r7, r2, r1)
            lpa r7 = new lpa
            r2 = 9
            r7.<init>(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            ms9 r7 = r4.i(r7, r2)
            nv9[] r2 = new nv9[r0]
            r4 = 0
            r2[r4] = r8
            r2[r1] = r7
            ys9 r7 = new ys9
            n73 r8 = new n73
            r8.<init>(r5, r2)
            ns7 r1 = z3d.g
            int r2 = an5.a
            r7.<init>(r8, r1, r2, r0)
            lpa r8 = new lpa
            r0 = 5
            r8.<init>(r0)
            ts9 r0 = new ts9
            r0.<init>(r7, r8)
            long r7 = (long) r3
            qv9 r8 = r0.s(r7)
        L_0x011d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ph0.m32apply(java.lang.Object):java.lang.Object");
    }
}
