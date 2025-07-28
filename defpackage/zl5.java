package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zl5  reason: default package */
public final class zl5 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ Object x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl5(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.w0 = obj;
        this.x0 = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                zl5 zl5 = new zl5((Object) (i26) this.x0, (Continuation) obj3, 0);
                zl5.Z = (rj5) obj;
                zl5.w0 = obj2;
                return zl5.o(jue.a);
            case 1:
                zl5 zl52 = new zl5((Continuation) obj3, (Object) (m26) this.x0, 1);
                zl52.Z = (rj5) obj;
                zl52.w0 = (Object[]) obj2;
                return zl52.o(jue.a);
            case 2:
                zl5 zl53 = new zl5((Continuation) obj3, (Object) (o26) this.x0, 2);
                zl53.Z = (rj5) obj;
                zl53.w0 = (Object[]) obj2;
                return zl53.o(jue.a);
            case 3:
                zl5 zl54 = new zl5((Continuation) obj3, (Object) (p26) this.x0, 3);
                zl54.Z = (rj5) obj;
                zl54.w0 = (Object[]) obj2;
                return zl54.o(jue.a);
            case 4:
                zl5 zl55 = new zl5((Object) (k26) this.x0, (Continuation) obj3, 4);
                zl55.Z = (rj5) obj;
                zl55.w0 = (Object[]) obj2;
                return zl55.o(jue.a);
            case 5:
                zl5 zl56 = new zl5((Object) (ef7) this.x0, (Continuation) obj3, 5);
                zl56.Z = (rj5) obj;
                zl56.w0 = (Throwable) obj2;
                return zl56.o(jue.a);
            case 6:
                zl5 zl57 = new zl5((Object) (uj8) this.x0, (Continuation) obj3, 6);
                zl57.Z = (List) obj;
                zl57.w0 = (si8) obj2;
                return zl57.o(jue.a);
            case 7:
                zl5 zl58 = new zl5((Continuation) obj3, (Object) (uj8) this.x0, 7);
                zl58.Z = (rj5) obj;
                zl58.w0 = obj2;
                return zl58.o(jue.a);
            case 8:
                zl5 zl59 = new zl5((Continuation) obj3, (Object) (fkd) this.x0, 8);
                zl59.Z = (rj5) obj;
                zl59.w0 = obj2;
                return zl59.o(jue.a);
            case 9:
                rj5 rj5 = (rj5) obj;
                zl5 zl510 = new zl5((h6e) this.w0, (fwe) this.x0, (Continuation) obj3, 9);
                zl510.Z = (Throwable) obj2;
                zl510.o(jue.a);
                return pu3.a;
            case 10:
                rj5 rj52 = (rj5) obj;
                zl5 zl511 = new zl5((h6e) this.w0, (wve) this.x0, (Continuation) obj3, 10);
                zl511.Z = (Throwable) obj2;
                zl511.o(jue.a);
                return pu3.a;
            default:
                rj5 rj53 = (rj5) obj;
                zl5 zl512 = new zl5((n6e) this.w0, (ys8) this.x0, (Continuation) obj3, 11);
                zl512.Z = (Throwable) obj2;
                zl512.o(jue.a);
                return pu3.a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: rj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: rj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: rj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: rj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: ru.ok.tamtam.errors.TamErrorException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: ru.ok.tamtam.errors.TamErrorException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            switch(r0) {
                case 0: goto L_0x03c8;
                case 1: goto L_0x0377;
                case 2: goto L_0x0321;
                case 3: goto L_0x02c7;
                case 4: goto L_0x0278;
                case 5: goto L_0x0238;
                case 6: goto L_0x0201;
                case 7: goto L_0x01ac;
                case 8: goto L_0x0132;
                case 9: goto L_0x00f1;
                case 10: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r2) goto L_0x0016
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0016:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.wx3.H(r14)
            goto L_0x005b
        L_0x001e:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r1 = r13.w0
            n6e r1 = (n6e) r1
            r1.getClass()
            boolean r3 = r14 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x005c
            r3 = r14
            ru.ok.tamtam.errors.TamErrorException r3 = (ru.ok.tamtam.errors.TamErrorException) r3
            uae r3 = r3.a
            java.lang.String r3 = r3.b
            java.lang.String r4 = "invalid.token"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r13.x0
            ys8 r3 = (ys8) r3
            fwe r3 = n6e.a(r1, r3)
            t97 r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            h6e r1 = (h6e) r1
            r13.Z = r14
            r13.Y = r2
            java.lang.Object r13 = r1.d(r3, r13)
            if (r13 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r13 = r14
        L_0x005b:
            r14 = r13
        L_0x005c:
            throw r14
        L_0x005d:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0076
            if (r1 == r2) goto L_0x006e
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x006e:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.wx3.H(r14)
            goto L_0x00b0
        L_0x0076:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            boolean r1 = r14 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            java.lang.Object r3 = r13.x0
            wve r3 = (wve) r3
            java.lang.Object r4 = r13.w0
            h6e r4 = (h6e) r4
            if (r1 == 0) goto L_0x00b1
            r13.Z = r14
            r13.Y = r2
            java.lang.String r1 = r4.b
            java.lang.String r2 = "Url is expired, reset it in repository"
            defpackage.udd.T(r1, r2, new java.lang.Object[0])
            vve r1 = r3.b()
            r2 = 0
            r1.d = r2
            r2 = 0
            r1.e = r2
            wve r2 = new wve
            r2.<init>(r1)
            java.lang.Object r13 = r4.f(r2, r13)
            if (r13 != r0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            jue r13 = defpackage.jue.a
        L_0x00ac:
            if (r13 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r13 = r14
        L_0x00b0:
            throw r13
        L_0x00b1:
            t97 r13 = r4.d
            java.lang.Object r13 = r13.getValue()
            f03 r13 = (f03) r13
            i03 r13 = (i03) r13
            r13.getClass()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r5 = r13.toMillis(r0)
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r3.i
            long r5 = r5 - r2
            t97 r2 = r4.d
            java.lang.Object r2 = r2.getValue()
            f03 r2 = (f03) r2
            i03 r2 = (i03) r2
            r2.getClass()
            long r0 = r13.toMillis(r0)
            int r13 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x00f0
            ru.ok.tamtam.rx.TamTamObservables$TamObservableException r13 = new ru.ok.tamtam.rx.TamTamObservables$TamObservableException
            java.lang.String r0 = "timeout reached"
            r13.<init>(r0, r14)
            throw r13
        L_0x00f0:
            throw r14
        L_0x00f1:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x010a
            if (r1 == r2) goto L_0x0102
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0102:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.wx3.H(r14)
            goto L_0x0131
        L_0x010a:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r1 = r13.w0
            h6e r1 = (h6e) r1
            java.lang.String r3 = r1.b
            java.lang.String r4 = "Got error during upload"
            defpackage.udd.s(r3, r4, r14)
            zpe r3 = r1.a
            r3.e(r14)
            r13.Z = r14
            r13.Y = r2
            java.lang.Object r2 = r13.x0
            fwe r2 = (fwe) r2
            java.lang.Object r13 = r1.h(r2, r13)
            if (r13 != r0) goto L_0x0130
            return r0
        L_0x0130:
            r13 = r14
        L_0x0131:
            throw r13
        L_0x0132:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0147
            if (r1 != r2) goto L_0x013f
            defpackage.wx3.H(r14)
            goto L_0x01a9
        L_0x013f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0147:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            rj5 r14 = (defpackage.rj5) r14
            java.lang.Object r1 = r13.w0
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            java.lang.Object r1 = r13.x0
            fkd r1 = (fkd) r1
            t97 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            bv2 r3 = (bv2) r3
            long r4 = r1.a
            aw2 r3 = (aw2) r3
            t0c r3 = r3.m(r4)
            ik5 r4 = new ik5
            r5 = 2
            r4.<init>(r3, r5)
            t97 r3 = r1.f
            java.lang.Object r3 = r3.getValue()
            ap3 r3 = (ap3) r3
            long r5 = r1.d
            t0c r3 = r3.c(r5)
            ik5 r5 = new ik5
            r6 = 2
            r5.<init>(r3, r6)
            f5c r3 = new f5c
            r6 = 0
            r7 = 4
            r3.<init>((java.lang.Object) r1, (kotlin.coroutines.Continuation) r6, (int) r7)
            v11 r6 = new v11
            r7 = 4
            r6.<init>(r4, r5, r3, r7)
            pj5 r3 = defpackage.ez3.z(r6)
            pae r1 = r1.c
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.b()
            pj5 r1 = defpackage.ez3.J(r3, r1)
            r13.Y = r2
            java.lang.Object r13 = defpackage.ez3.C(r1, r14, r13)
            if (r13 != r0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            jue r0 = defpackage.jue.a
        L_0x01ab:
            return r0
        L_0x01ac:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x01c1
            if (r1 != r2) goto L_0x01b9
            defpackage.wx3.H(r14)
            goto L_0x01fe
        L_0x01b9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x01c1:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            rj5 r14 = (defpackage.rj5) r14
            java.lang.Object r1 = r13.w0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r13.x0
            uj8 r3 = (uj8) r3
            xi8 r4 = r3.Y
            hcd r4 = r4.a
            s0c r5 = new s0c
            r5.<init>(r4)
            zl5 r4 = new zl5
            r6 = 0
            r7 = 6
            r4.<init>((java.lang.Object) r3, (kotlin.coroutines.Continuation) r6, (int) r7)
            v11 r3 = new v11
            r3.<init>(r1, r5, r4)
            pj8 r4 = new pj8
            r4.<init>(r1, r6)
            ck5 r1 = new ck5
            r1.<init>(r3, r4)
            r3 = 200(0xc8, double:9.9E-322)
            pj5 r1 = defpackage.ez3.x(r1, r3)
            r13.Y = r2
            java.lang.Object r13 = defpackage.ez3.C(r1, r14, r13)
            if (r13 != r0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            jue r0 = defpackage.jue.a
        L_0x0200:
            return r0
        L_0x0201:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0216
            if (r1 != r2) goto L_0x020e
            defpackage.wx3.H(r14)
            goto L_0x0231
        L_0x020e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0216:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r1 = r13.w0
            si8 r1 = (si8) r1
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r2 = r13.x0
            uj8 r2 = (uj8) r2
            java.lang.Object r14 = uj8.q(r1, r2, r14, r13)
            if (r14 != r0) goto L_0x0231
            goto L_0x0237
        L_0x0231:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r0 = defpackage.o23.s0(r14)
        L_0x0237:
            return r0
        L_0x0238:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x024d
            if (r1 != r2) goto L_0x0245
            defpackage.wx3.H(r14)
            goto L_0x0275
        L_0x0245:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x024d:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            rj5 r14 = (defpackage.rj5) r14
            java.lang.Object r1 = r13.w0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x0275
            java.lang.Object r3 = r13.x0
            ef7 r3 = (ef7) r3
            java.lang.String r3 = r3.r
            java.lang.String r4 = "fail"
            defpackage.udd.s(r3, r4, r1)
            xd7 r1 = xd7.a
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r14.a(r1, r13)
            if (r13 != r0) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            jue r0 = defpackage.jue.a
        L_0x0277:
            return r0
        L_0x0278:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0298
            if (r1 == r3) goto L_0x0290
            if (r1 != r2) goto L_0x0288
            defpackage.wx3.H(r14)
            goto L_0x02c4
        L_0x0288:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0290:
            java.lang.Object r1 = r13.Z
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r14)
            goto L_0x02b8
        L_0x0298:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            rj5 r1 = (defpackage.rj5) r1
            java.lang.Object r14 = r13.w0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r4 = r14[r4]
            r14 = r14[r3]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.x0
            k26 r3 = (defpackage.k26) r3
            java.lang.Object r14 = r3.invoke(r4, r14, r13)
            if (r14 != r0) goto L_0x02b8
            goto L_0x02c6
        L_0x02b8:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x02c4
            goto L_0x02c6
        L_0x02c4:
            jue r0 = defpackage.jue.a
        L_0x02c6:
            return r0
        L_0x02c7:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            jue r2 = defpackage.jue.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x02e9
            if (r1 == r4) goto L_0x02e1
            if (r1 != r3) goto L_0x02d9
            defpackage.wx3.H(r14)
            goto L_0x031f
        L_0x02d9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x02e1:
            java.lang.Object r1 = r13.Z
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r14)
            goto L_0x0313
        L_0x02e9:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            rj5 r1 = (defpackage.rj5) r1
            java.lang.Object r14 = r13.w0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r5 = 0
            r7 = r14[r5]
            r8 = r14[r4]
            r9 = r14[r3]
            r5 = 3
            r10 = r14[r5]
            r5 = 4
            r11 = r14[r5]
            r13.Z = r1
            r13.Y = r4
            java.lang.Object r14 = r13.x0
            r6 = r14
            p26 r6 = (defpackage.p26) r6
            r12 = r13
            r6.k(r7, r8, r9, r10, r11, r12)
            if (r2 != r0) goto L_0x0312
            goto L_0x0320
        L_0x0312:
            r14 = r2
        L_0x0313:
            r4 = 0
            r13.Z = r4
            r13.Y = r3
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x031f
            goto L_0x0320
        L_0x031f:
            r0 = r2
        L_0x0320:
            return r0
        L_0x0321:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0341
            if (r1 == r3) goto L_0x0339
            if (r1 != r2) goto L_0x0331
            defpackage.wx3.H(r14)
            goto L_0x0374
        L_0x0331:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0339:
            java.lang.Object r1 = r13.Z
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r14)
            goto L_0x0368
        L_0x0341:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            rj5 r1 = (defpackage.rj5) r1
            java.lang.Object r14 = r13.w0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r6 = r14[r4]
            r7 = r14[r3]
            r8 = r14[r2]
            r4 = 3
            r9 = r14[r4]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r14 = r13.x0
            r5 = r14
            o26 r5 = (defpackage.o26) r5
            r10 = r13
            java.lang.Object r14 = r5.m(r6, r7, r8, r9, r10)
            if (r14 != r0) goto L_0x0368
            goto L_0x0376
        L_0x0368:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x0374
            goto L_0x0376
        L_0x0374:
            jue r0 = defpackage.jue.a
        L_0x0376:
            return r0
        L_0x0377:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0397
            if (r1 == r3) goto L_0x038f
            if (r1 != r2) goto L_0x0387
            defpackage.wx3.H(r14)
            goto L_0x03c5
        L_0x0387:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x038f:
            java.lang.Object r1 = r13.Z
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r14)
            goto L_0x03b9
        L_0x0397:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            rj5 r1 = (defpackage.rj5) r1
            java.lang.Object r14 = r13.w0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r4 = r14[r4]
            r5 = r14[r3]
            r14 = r14[r2]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.x0
            m26 r3 = (defpackage.m26) r3
            java.lang.Object r14 = r3.h(r4, r5, r14, r13)
            if (r14 != r0) goto L_0x03b9
            goto L_0x03c7
        L_0x03b9:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x03c5
            goto L_0x03c7
        L_0x03c5:
            jue r0 = defpackage.jue.a
        L_0x03c7:
            return r0
        L_0x03c8:
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x03e8
            if (r1 == r3) goto L_0x03e0
            if (r1 != r2) goto L_0x03d8
            defpackage.wx3.H(r14)
            goto L_0x040d
        L_0x03d8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x03e0:
            java.lang.Object r1 = r13.Z
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r14)
            goto L_0x0401
        L_0x03e8:
            defpackage.wx3.H(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            rj5 r1 = (defpackage.rj5) r1
            java.lang.Object r14 = r13.w0
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.x0
            i26 r3 = (defpackage.i26) r3
            java.lang.Object r14 = r3.invoke(r14, r13)
            if (r14 != r0) goto L_0x0401
            goto L_0x040f
        L_0x0401:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x040d
            goto L_0x040f
        L_0x040d:
            jue r0 = defpackage.jue.a
        L_0x040f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl5.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl5(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.x0 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl5(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.X = i;
        this.x0 = obj;
    }
}
