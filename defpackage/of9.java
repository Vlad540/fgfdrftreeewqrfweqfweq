package defpackage;

/* renamed from: of9  reason: default package */
public final class of9 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public of9(i7c i7c, rj5 rj5) {
        this.a = 10;
        this.c = i7c;
        this.b = rj5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: wsc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v63, types: [java.lang.Object, pxe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:379:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 3
            r4 = 2
            r6 = 0
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x0666;
                case 1: goto L_0x060f;
                case 2: goto L_0x05b0;
                case 3: goto L_0x0569;
                case 4: goto L_0x0522;
                case 5: goto L_0x04c9;
                case 6: goto L_0x03d3;
                case 7: goto L_0x036a;
                case 8: goto L_0x02d3;
                case 9: goto L_0x0255;
                case 10: goto L_0x024a;
                case 11: goto L_0x01be;
                case 12: goto L_0x0149;
                case 13: goto L_0x0070;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r3 = r2 instanceof xge
            if (r3 == 0) goto L_0x0024
            r3 = r2
            xge r3 = (xge) r3
            int r5 = r3.X
            r6 = r5 & r9
            if (r6 == 0) goto L_0x0024
            int r5 = r5 - r9
            r3.X = r5
            goto L_0x0029
        L_0x0024:
            xge r3 = new xge
            r3.<init>(r0, r2)
        L_0x0029:
            java.lang.Object r2 = r3.o
            pu3 r5 = defpackage.pu3.a
            int r6 = r3.X
            if (r6 == 0) goto L_0x003d
            if (r6 != r8) goto L_0x0037
            defpackage.wx3.H(r2)
            goto L_0x006d
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x003d:
            defpackage.wx3.H(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r2 = r0.c
            yge r2 = (yge) r2
            android.widget.TextView r2 = r2.b
            r2.getContext()
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r2)
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r5) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            jue r5 = defpackage.jue.a
        L_0x006f:
            return r5
        L_0x0070:
            boolean r4 = r2 instanceof x5e
            if (r4 == 0) goto L_0x0081
            r4 = r2
            x5e r4 = (x5e) r4
            int r10 = r4.X
            r11 = r10 & r9
            if (r11 == 0) goto L_0x0081
            int r10 = r10 - r9
            r4.X = r10
            goto L_0x0086
        L_0x0081:
            x5e r4 = new x5e
            r4.<init>(r0, r2)
        L_0x0086:
            java.lang.Object r2 = r4.o
            pu3 r9 = defpackage.pu3.a
            int r10 = r4.X
            if (r10 == 0) goto L_0x009b
            if (r10 != r8) goto L_0x0095
            defpackage.wx3.H(r2)
            goto L_0x013e
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x009b:
            defpackage.wx3.H(r2)
            ixe r1 = (ixe) r1
            float r2 = r1.a
            r7 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00aa
            r2 = r8
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            java.lang.Object r7 = r0.c
            wve r7 = (wve) r7
            fwe r10 = r7.a
            int r10 = r10.c
            if (r2 == 0) goto L_0x00ec
            if (r10 != r3) goto L_0x00b8
            goto L_0x00c8
        L_0x00b8:
            boolean r3 = sxe.a(r10)
            if (r3 != 0) goto L_0x00c8
            r3 = 7
            if (r10 != r3) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            boolean r3 = sxe.b(r10)
            if (r3 == 0) goto L_0x00ec
        L_0x00c8:
            java.lang.String r3 = r1.c
            if (r3 == 0) goto L_0x00d5
            int r10 = r3.length()
            if (r10 != 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r5 = 0
            goto L_0x00d6
        L_0x00d5:
            r5 = r8
        L_0x00d6:
            r5 = r5 ^ r8
            if (r5 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r3 = r6
        L_0x00db:
            if (r3 == 0) goto L_0x00ea
            pxe r5 = new pxe
            r5.<init>()
            r5.a = r3
            qxe r3 = new qxe
            r3.<init>(r5)
            goto L_0x00ee
        L_0x00ea:
            r3 = r6
            goto L_0x00ee
        L_0x00ec:
            qxe r3 = r7.h
        L_0x00ee:
            r10 = 0
            if (r2 == 0) goto L_0x0111
            if (r3 == 0) goto L_0x00f6
            java.lang.String r6 = r3.a
        L_0x00f6:
            if (r6 == 0) goto L_0x00fe
            int r5 = r6.length()
            if (r5 != 0) goto L_0x0111
        L_0x00fe:
            if (r3 == 0) goto L_0x0103
            long r5 = r3.b
            goto L_0x0104
        L_0x0103:
            r5 = r10
        L_0x0104:
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0109
            goto L_0x0111
        L_0x0109:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = "upload failed. token and attachId are empty"
            r0.<init>(r1)
            throw r0
        L_0x0111:
            long r5 = r1.b
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x0141
            vve r7 = r7.b()
            r7.h = r3
            if (r2 == 0) goto L_0x0122
            rxe r2 = rxe.o
            goto L_0x0124
        L_0x0122:
            rxe r2 = rxe.c
        L_0x0124:
            r7.g = r2
            float r1 = r1.a
            r7.e = r1
            r7.f = r5
            wve r1 = new wve
            r1.<init>(r7)
            r4.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r4)
            if (r0 != r9) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            jue r9 = defpackage.jue.a
        L_0x0140:
            return r9
        L_0x0141:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = "upload failed. file has zero size"
            r0.<init>(r1)
            throw r0
        L_0x0149:
            boolean r3 = r2 instanceof cyd
            if (r3 == 0) goto L_0x015a
            r3 = r2
            cyd r3 = (cyd) r3
            int r4 = r3.X
            r6 = r4 & r9
            if (r6 == 0) goto L_0x015a
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x015f
        L_0x015a:
            cyd r3 = new cyd
            r3.<init>(r0, r2)
        L_0x015f:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r6 = r3.X
            if (r6 == 0) goto L_0x0173
            if (r6 != r8) goto L_0x016d
            defpackage.wx3.H(r2)
            goto L_0x01bb
        L_0x016d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0173:
            defpackage.wx3.H(r2)
            wia r1 = (defpackage.wia) r1
            java.lang.Object r2 = r1.a
            xtd r2 = (xtd) r2
            java.lang.Object r1 = r1.b
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            wxd r6 = new wxd
            java.lang.String r7 = r2.b
            if (r7 != 0) goto L_0x0188
            java.lang.String r7 = ""
        L_0x0188:
            lge r9 = new lge
            r9.<init>(r7)
            java.util.List r7 = r2.h
            if (r7 == 0) goto L_0x0196
            int r5 = r7.size()
            goto L_0x0197
        L_0x0196:
            r5 = 0
        L_0x0197:
            k77[] r7 = kyd.G0
            java.lang.Object r7 = r0.c
            kyd r7 = (kyd) r7
            java.lang.String r5 = r7.s(r5)
            boolean r1 = r1.booleanValue()
            lg7 r1 = r7.q(r1)
            java.lang.String r2 = r2.g
            r6.<init>(r9, r5, r2, r1)
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r4) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            jue r4 = defpackage.jue.a
        L_0x01bd:
            return r4
        L_0x01be:
            boolean r4 = r2 instanceof kwd
            if (r4 == 0) goto L_0x01cf
            r4 = r2
            kwd r4 = (kwd) r4
            int r5 = r4.X
            r10 = r5 & r9
            if (r10 == 0) goto L_0x01cf
            int r5 = r5 - r9
            r4.X = r5
            goto L_0x01d4
        L_0x01cf:
            kwd r4 = new kwd
            r4.<init>(r0, r2)
        L_0x01d4:
            java.lang.Object r2 = r4.o
            pu3 r5 = defpackage.pu3.a
            int r9 = r4.X
            if (r9 == 0) goto L_0x01e8
            if (r9 != r8) goto L_0x01e2
            defpackage.wx3.H(r2)
            goto L_0x0247
        L_0x01e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x01e8:
            defpackage.wx3.H(r2)
            java.lang.Object r2 = r0.b
            rj5 r2 = (defpackage.rj5) r2
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r0.c
            lwd r7 = (lwd) r7
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            fn6 r9 = defpackage.udd.e
            if (r9 != 0) goto L_0x0202
            goto L_0x0217
        L_0x0202:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0217
            tn7 r10 = tn7.X
            int r11 = r1.size()
            java.lang.String r12 = "Sets loader. Sections, size:"
            java.lang.String r11 = wn6.h(r11, r12)
            r9.d(r10, r7, r11, r6)
        L_0x0217:
            java.util.Iterator r1 = r1.iterator()
        L_0x021b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x023e
            java.lang.Object r7 = r1.next()
            r9 = r7
            wsc r9 = (wsc) r9
            java.lang.Object r10 = r0.c
            lwd r10 = (lwd) r10
            r10.getClass()
            int r10 = r9.a
            if (r10 != r3) goto L_0x021b
            java.lang.String r9 = r9.b
            java.lang.String r10 = "NEW_STICKER_SETS"
            boolean r9 = defpackage.p0e.M(r9, r10, r8)
            if (r9 == 0) goto L_0x021b
            r6 = r7
        L_0x023e:
            r4.X = r8
            java.lang.Object r0 = r2.a(r6, r4)
            if (r0 != r5) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            jue r5 = defpackage.jue.a
        L_0x0249:
            return r5
        L_0x024a:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.c(r1, r2)
            return r0
        L_0x0255:
            boolean r3 = r2 instanceof ekd
            if (r3 == 0) goto L_0x0266
            r3 = r2
            ekd r3 = (ekd) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0266
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x026b
        L_0x0266:
            ekd r3 = new ekd
            r3.<init>(r0, r2)
        L_0x026b:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x027f
            if (r5 != r8) goto L_0x0279
            defpackage.wx3.H(r2)
            goto L_0x02d0
        L_0x0279:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x027f:
            defpackage.wx3.H(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x02c3
            int r2 = r1.length()
            if (r2 != 0) goto L_0x028d
            goto L_0x02c3
        L_0x028d:
            java.lang.Object r2 = r0.c
            fkd r2 = (fkd) r2
            t0c r5 = r2.l
            zqd r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x02a4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c3
            java.lang.Object r7 = r5.next()
            r9 = r7
            tf3 r9 = (tf3) r9
            t97 r10 = r2.g
            java.lang.Object r10 = r10.getValue()
            gsc r10 = (gsc) r10
            boolean r9 = r10.g(r9, r1)
            if (r9 == 0) goto L_0x02a4
            r6.add(r7)
            goto L_0x02a4
        L_0x02c3:
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r4) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            jue r4 = defpackage.jue.a
        L_0x02d2:
            return r4
        L_0x02d3:
            boolean r3 = r2 instanceof ued
            if (r3 == 0) goto L_0x02e4
            r3 = r2
            ued r3 = (ued) r3
            int r5 = r3.X
            r10 = r5 & r9
            if (r10 == 0) goto L_0x02e4
            int r5 = r5 - r9
            r3.X = r5
            goto L_0x02e9
        L_0x02e4:
            ued r3 = new ued
            r3.<init>(r0, r2)
        L_0x02e9:
            java.lang.Object r2 = r3.o
            pu3 r5 = defpackage.pu3.a
            int r9 = r3.X
            if (r9 == 0) goto L_0x0306
            if (r9 == r8) goto L_0x0300
            if (r9 != r4) goto L_0x02fa
            defpackage.wx3.H(r2)
            goto L_0x0367
        L_0x02fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0300:
            rj5 r0 = r3.Y
            defpackage.wx3.H(r2)
            goto L_0x035c
        L_0x0306:
            defpackage.wx3.H(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x030f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032b
            java.lang.Object r2 = r1.next()
            r7 = r2
            wsc r7 = (wsc) r7
            int r9 = r7.a
            if (r9 != r4) goto L_0x030f
            java.lang.String r7 = r7.b
            java.lang.String r9 = "TOP"
            boolean r7 = defpackage.hhd.f(r7, r9)
            if (r7 == 0) goto L_0x030f
            goto L_0x032c
        L_0x032b:
            r2 = r6
        L_0x032c:
            boolean r1 = r2 instanceof dwd
            if (r1 == 0) goto L_0x0333
            dwd r2 = (dwd) r2
            goto L_0x0334
        L_0x0333:
            r2 = r6
        L_0x0334:
            if (r2 == 0) goto L_0x033b
            java.util.ArrayList r1 = r2.c
            if (r1 == 0) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            hw4 r1 = defpackage.hw4.a
        L_0x033d:
            java.lang.Object r2 = r0.c
            wed r2 = (wed) r2
            t97 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            zsd r2 = (zsd) r2
            phd r1 = r2.b(r1)
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            r3.Y = r0
            r3.X = r8
            java.lang.Object r2 = defpackage.e07.d(r1, r3)
            if (r2 != r5) goto L_0x035c
            goto L_0x0369
        L_0x035c:
            r3.Y = r6
            r3.X = r4
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r5) goto L_0x0367
            goto L_0x0369
        L_0x0367:
            jue r5 = defpackage.jue.a
        L_0x0369:
            return r5
        L_0x036a:
            ne7 r1 = (ne7) r1
            boolean r2 = r1 instanceof xd7
            java.lang.Object r3 = r0.b
            fgb r3 = (fgb) r3
            if (r2 == 0) goto L_0x0388
            l05 r0 = r3.E0
            yeb r2 = new yeb
            int r4 = cic.l0
            hge r5 = new hge
            r5.<init>(r4)
            int r4 = zhc.v0
            r2.<init>(r4, r5)
            taf.o(r0, r2)
            goto L_0x03c0
        L_0x0388:
            boolean r2 = r1 instanceof be7
            if (r2 == 0) goto L_0x039b
            l05 r2 = r3.F0
            wdb r4 = new wdb
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r4.<init>(r0)
            taf.o(r2, r4)
            goto L_0x03c0
        L_0x039b:
            boolean r0 = r1 instanceof he7
            if (r0 == 0) goto L_0x03c0
            h5b r0 = r3.T0
            long r4 = r0.m()
            r0 = r1
            he7 r0 = (he7) r0
            long r6 = r0.a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            l05 r2 = r3.F0
            if (r0 != 0) goto L_0x03b6
            xdb r0 = xdb.b
            taf.o(r2, r0)
            goto L_0x03c0
        L_0x03b6:
            vdb r0 = new vdb
            r6b r4 = r6b.c
            r0.<init>(r6, r4)
            taf.o(r2, r0)
        L_0x03c0:
            java.lang.String r0 = r1.m()
            if (r0 == 0) goto L_0x03d0
            l05 r1 = r3.F0
            sdb r2 = new sdb
            r2.<init>(r0)
            taf.o(r1, r2)
        L_0x03d0:
            jue r0 = defpackage.jue.a
            return r0
        L_0x03d3:
            boolean r10 = r2 instanceof j7b
            if (r10 == 0) goto L_0x03e4
            r10 = r2
            j7b r10 = (j7b) r10
            int r11 = r10.X
            r12 = r11 & r9
            if (r12 == 0) goto L_0x03e4
            int r11 = r11 - r9
            r10.X = r11
            goto L_0x03e9
        L_0x03e4:
            j7b r10 = new j7b
            r10.<init>(r0, r2)
        L_0x03e9:
            java.lang.Object r2 = r10.o
            pu3 r9 = defpackage.pu3.a
            int r11 = r10.X
            if (r11 == 0) goto L_0x041f
            if (r11 == r8) goto L_0x0411
            if (r11 == r4) goto L_0x0402
            if (r11 != r3) goto L_0x03fc
            defpackage.wx3.H(r2)
            goto L_0x04c6
        L_0x03fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0402:
            rj5 r0 = r10.w0
            of9 r1 = r10.Y
            defpackage.wx3.H(r2)
            r18 = r2
            r2 = r0
            r0 = r1
            r1 = r18
            goto L_0x048c
        L_0x0411:
            rj5 r0 = r10.w0
            of9 r1 = r10.Y
            defpackage.wx3.H(r2)
            r18 = r2
            r2 = r0
            r0 = r1
            r1 = r18
            goto L_0x0471
        L_0x041f:
            defpackage.wx3.H(r2)
            r14 = r1
            z6b r14 = (z6b) r14
            k77[] r1 = q7b.J0
            java.lang.Object r1 = r0.c
            q7b r1 = (q7b) r1
            tf3 r12 = r1.t()
            java.lang.Object r2 = r0.b
            rj5 r2 = (defpackage.rj5) r2
            if (r12 != 0) goto L_0x043d
            f7b r0 = new f7b
            r0.<init>()
        L_0x043a:
            r1 = r6
            goto L_0x04b9
        L_0x043d:
            i22 r13 = r1.s()
            if (r13 != 0) goto L_0x0449
            f7b r0 = new f7b
            r0.<init>()
            goto L_0x043a
        L_0x0449:
            long r5 = r12.n()
            java.lang.Long r16 = r13.c(r5)
            boolean r5 = r13.G()
            t97 r6 = r1.w0
            if (r5 == 0) goto L_0x0474
            java.lang.Object r4 = r6.getValue()
            r11 = r4
            i5b r11 = (i5b) r11
            r10.Y = r0
            r10.w0 = r2
            r10.X = r8
            b7b r15 = r1.o
            r17 = r10
            java.lang.Object r1 = r11.a(r12, r13, r14, r15, r16, r17)
            if (r1 != r9) goto L_0x0471
            goto L_0x04c8
        L_0x0471:
            java.util.List r1 = (java.util.List) r1
            goto L_0x048e
        L_0x0474:
            java.lang.Object r5 = r6.getValue()
            r11 = r5
            i5b r11 = (i5b) r11
            r10.Y = r0
            r10.w0 = r2
            r10.X = r4
            b7b r15 = r1.o
            r17 = r10
            java.lang.Object r1 = r11.b(r12, r13, r14, r15, r16, r17)
            if (r1 != r9) goto L_0x048c
            goto L_0x04c8
        L_0x048c:
            java.util.List r1 = (java.util.List) r1
        L_0x048e:
            f7b r4 = new f7b
            java.lang.Object r5 = r0.c
            q7b r5 = (q7b) r5
            b7b r6 = r5.o
            b7b r7 = b7b.c
            if (r6 == r7) goto L_0x04b3
            grd r5 = r5.C0
            java.lang.Object r5 = r5.getValue()
            java.lang.Object r0 = r0.c
            q7b r0 = (q7b) r0
            grd r0 = r0.B0
            java.lang.Object r0 = r0.getValue()
            boolean r0 = defpackage.hhd.f(r5, r0)
            if (r0 != 0) goto L_0x04b1
            goto L_0x04b3
        L_0x04b1:
            r5 = 0
            goto L_0x04b4
        L_0x04b3:
            r5 = r8
        L_0x04b4:
            r4.<init>(r1, r5)
            r0 = r4
            r1 = 0
        L_0x04b9:
            r10.Y = r1
            r10.w0 = r1
            r10.X = r3
            java.lang.Object r0 = r2.a(r0, r10)
            if (r0 != r9) goto L_0x04c6
            goto L_0x04c8
        L_0x04c6:
            jue r9 = defpackage.jue.a
        L_0x04c8:
            return r9
        L_0x04c9:
            boolean r3 = r2 instanceof ava
            if (r3 == 0) goto L_0x04da
            r3 = r2
            ava r3 = (ava) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x04da
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x04df
        L_0x04da:
            ava r3 = new ava
            r3.<init>(r0, r2)
        L_0x04df:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x04f3
            if (r5 != r8) goto L_0x04ed
            defpackage.wx3.H(r2)
            goto L_0x051f
        L_0x04ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x04f3:
            defpackage.wx3.H(r2)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.floatValue()
            int r2 = one.me.pinbars.PinBarsWidget.x0
            java.lang.Object r2 = r0.c
            one.me.pinbars.PinBarsWidget r2 = (one.me.pinbars.PinBarsWidget) r2
            sua r2 = r2.l0()
            t0c r2 = r2.B0
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r2 instanceof u49
            if (r2 == 0) goto L_0x051f
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x051f
            goto L_0x0521
        L_0x051f:
            jue r4 = defpackage.jue.a
        L_0x0521:
            return r4
        L_0x0522:
            boolean r3 = r2 instanceof defpackage.jua
            if (r3 == 0) goto L_0x0533
            r3 = r2
            jua r3 = (defpackage.jua) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0533
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x0538
        L_0x0533:
            jua r3 = new jua
            r3.<init>(r0, r2)
        L_0x0538:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x054c
            if (r5 != r8) goto L_0x0546
            defpackage.wx3.H(r2)
            goto L_0x0566
        L_0x0546:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x054c:
            defpackage.wx3.H(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.c
            kua r2 = (defpackage.kua) r2
            java.util.ArrayList r1 = defpackage.kua.q(r2, r1)
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0566
            goto L_0x0568
        L_0x0566:
            jue r4 = defpackage.jue.a
        L_0x0568:
            return r4
        L_0x0569:
            boolean r3 = r2 instanceof defpackage.vta
            if (r3 == 0) goto L_0x057a
            r3 = r2
            vta r3 = (defpackage.vta) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x057a
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x057f
        L_0x057a:
            vta r3 = new vta
            r3.<init>(r0, r2)
        L_0x057f:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0593
            if (r5 != r8) goto L_0x058d
            defpackage.wx3.H(r2)
            goto L_0x05ad
        L_0x058d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0593:
            defpackage.wx3.H(r2)
            bk3 r1 = (defpackage.bk3) r1
            java.lang.Object r2 = r0.c
            wta r2 = (defpackage.wta) r2
            java.util.List r1 = defpackage.wta.q(r2, r1)
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x05ad
            goto L_0x05af
        L_0x05ad:
            jue r4 = defpackage.jue.a
        L_0x05af:
            return r4
        L_0x05b0:
            boolean r3 = r2 instanceof defpackage.zra
            if (r3 == 0) goto L_0x05c1
            r3 = r2
            zra r3 = (defpackage.zra) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x05c1
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x05c6
        L_0x05c1:
            zra r3 = new zra
            r3.<init>(r0, r2)
        L_0x05c6:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x05da
            if (r5 != r8) goto L_0x05d4
            defpackage.wx3.H(r2)
            goto L_0x060c
        L_0x05d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x05da:
            defpackage.wx3.H(r2)
            r2 = r1
            hq2 r2 = (defpackage.hq2) r2
            java.lang.Object r5 = r0.c
            lsa r5 = (defpackage.lsa) r5
            r5.getClass()
            hq2 r6 = defpackage.hq2.c
            boolean r2 = defpackage.hhd.f(r2, r6)
            if (r2 != 0) goto L_0x05f1
            r5 = 0
            goto L_0x05fd
        L_0x05f1:
            grd r2 = r5.c
            java.lang.Object r2 = r2.getValue()
            boolean r2 = defpackage.hhd.f(r2, r6)
            r5 = r2 ^ 1
        L_0x05fd:
            if (r5 != 0) goto L_0x060c
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x060c
            goto L_0x060e
        L_0x060c:
            jue r4 = defpackage.jue.a
        L_0x060e:
            return r4
        L_0x060f:
            boolean r3 = r2 instanceof defpackage.ura
            if (r3 == 0) goto L_0x0620
            r3 = r2
            ura r3 = (defpackage.ura) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0620
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x0625
        L_0x0620:
            ura r3 = new ura
            r3.<init>(r0, r2)
        L_0x0625:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0639
            if (r5 != r8) goto L_0x0633
            defpackage.wx3.H(r2)
            goto L_0x0663
        L_0x0633:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0639:
            defpackage.wx3.H(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.c
            xra r5 = (defpackage.xra) r5
            t0c r5 = r5.E0
            zqd r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            tra r5 = (defpackage.tra) r5
            java.lang.String r5 = r5.a
            boolean r2 = defpackage.hhd.f(r2, r5)
            r2 = r2 ^ r8
            if (r2 == 0) goto L_0x0663
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0663
            goto L_0x0665
        L_0x0663:
            jue r4 = defpackage.jue.a
        L_0x0665:
            return r4
        L_0x0666:
            boolean r3 = r2 instanceof defpackage.nf9
            if (r3 == 0) goto L_0x0677
            r3 = r2
            nf9 r3 = (defpackage.nf9) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0677
            int r4 = r4 - r9
            r3.X = r4
            goto L_0x067c
        L_0x0677:
            nf9 r3 = new nf9
            r3.<init>(r0, r2)
        L_0x067c:
            java.lang.Object r2 = r3.o
            pu3 r4 = defpackage.pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0690
            if (r5 != r8) goto L_0x068a
            defpackage.wx3.H(r2)
            goto L_0x06af
        L_0x068a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0690:
            defpackage.wx3.H(r2)
            to7 r1 = (to7) r1
            java.lang.Object r1 = r0.c
            lqc r1 = (lqc) r1
            long r1 = r1.s()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            r3.X = r8
            java.lang.Object r0 = r0.b
            rj5 r0 = (defpackage.rj5) r0
            java.lang.Object r0 = r0.a(r5, r3)
            if (r0 != r4) goto L_0x06af
            goto L_0x06b1
        L_0x06af:
            jue r4 = defpackage.jue.a
        L_0x06b1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of9.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(int r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oqd
            if (r0 == 0) goto L_0x0013
            r0 = r7
            oqd r0 = (defpackage.oqd) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            oqd r0 = new oqd
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            jue r3 = defpackage.jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            defpackage.wx3.H(r7)
            goto L_0x004f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            defpackage.wx3.H(r7)
            if (r6 <= 0) goto L_0x004f
            java.lang.Object r6 = r5.c
            i7c r6 = (defpackage.i7c) r6
            boolean r7 = r6.a
            if (r7 != 0) goto L_0x004f
            r6.a = r4
            tcd r6 = defpackage.tcd.a
            r0.Y = r4
            java.lang.Object r5 = r5.b
            rj5 r5 = (defpackage.rj5) r5
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of9.c(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ of9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
