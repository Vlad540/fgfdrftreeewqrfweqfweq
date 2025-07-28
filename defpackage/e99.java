package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: e99  reason: default package */
public final class e99 extends ol implements qce, tna {
    public final String X;
    public final long Y;
    public final long Z;
    public final String o;
    public final eu0 w0;
    public final hu0 x0;

    public e99(long j, String str, String str2, long j2, long j3, eu0 eu0, hu0 hu0) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = j2;
        this.Z = j3;
        this.w0 = eu0;
        this.x0 = hu0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.lbe r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = 1
            r2 = r27
            f99 r2 = (defpackage.f99) r2
            pl r3 = r0.c
            if (r3 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            to8 r3 = r3.d()
            long r5 = r0.Z
            vo8 r3 = r3.q(r5)
            if (r3 == 0) goto L_0x01ba
            ls8 r5 = defpackage.ls8.DELETED
            ls8 r6 = r3.z0
            if (r6 != r5) goto L_0x0021
            goto L_0x01ba
        L_0x0021:
            ym8 r5 = r2.c
            if (r5 == 0) goto L_0x0106
            pl r6 = r0.c
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            t52 r6 = r6.c()
            long r7 = r3.x0
            i22 r3 = r6.B(r7)
            pl r6 = r0.c
            if (r6 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            t97 r6 = r6.C
            java.lang.Object r6 = r6.getValue()
            bkc r6 = (defpackage.bkc) r6
            xm8 r7 = r3.c
            vo8 r7 = r7.a
            long r10 = r7.c
            r6.getClass()
            java.lang.String r15 = "bkc"
            java.lang.String r7 = "onSaveMessage: insert new message"
            udd.q(r15, r7)
            boolean r7 = r3.D()
            if (r7 != 0) goto L_0x0066
            g2b r7 = r6.e
            j2b r7 = (defpackage.j2b) r7
            i03 r7 = r7.a
            long r7 = r7.s()
            r16 = r7
            goto L_0x0068
        L_0x0066:
            r16 = 0
        L_0x0068:
            to8 r7 = r6.a
            long r8 = r3.a
            r21 = r10
            r10 = r16
            r12 = r5
            long r7 = r7.f(r8, r10, r12)
            to8 r9 = r6.a
            vo8 r7 = r9.q(r7)
            if (r7 != 0) goto L_0x007f
            goto L_0x0106
        L_0x007f:
            n1b r8 = r6.b
            r8.b(r3, r7)
            o62 r8 = r3.b
            i62 r8 = r8.n
            md4 r9 = r7.Y0
            int r8 = r8.c(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r10 = "onSaveMessage: chunks count = %d"
            udd.p(r15, r10, r8)
            r18 = 1
            r20 = 0
            t52 r8 = r6.c
            long r11 = r3.a
            r3 = r15
            r15 = r8
            r16 = r11
            r19 = r7
            i22 r8 = r15.T(r16, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x0106
            o62 r11 = r8.b
            i62 r11 = r11.n
            java.util.ArrayList r9 = r11.d(r9)
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            udd.p(r3, r10, r9)
            mw2 r3 = new mw2
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r3.<init>(r9, r1)
            tt0 r9 = r6.d
            r9.c(r3)
            yga r3 = new yga
            long r10 = r7.b
            r22 = 0
            long r13 = r8.a
            long r4 = r5.Y
            r12 = r2
            long r1 = r7.Y
            md4 r15 = r7.Y0
            r25 = r15
            r15 = r3
            r16 = r13
            r18 = r4
            r20 = r10
            r23 = r1
            r15.<init>(r16, r18, r20, r22, r23, r25)
            r9.c(r3)
            boolean r1 = r7.m()
            if (r1 == 0) goto L_0x0107
            gy r1 = r6.f
            r1.a(r7)
            goto L_0x0107
        L_0x0106:
            r12 = r2
        L_0x0107:
            r1 = 0
            r0.u(r1)
            j22 r2 = r12.o
            java.lang.String r3 = r12.X
            if (r2 == 0) goto L_0x01bd
            boolean r3 = r1g.p(r3)
            if (r3 != 0) goto L_0x01bd
            pl r3 = r0.c
            if (r3 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r3 = 0
        L_0x011d:
            t52 r3 = r3.c()
            java.util.List r4 = java.util.Collections.singletonList(r2)
            zb9 r3 = r3.c0(r4)
            boolean r4 = r3.j()
            if (r4 == 0) goto L_0x0179
            long[] r2 = r3.b
            long[] r3 = r3.a
            int r4 = r3.length
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x0171
            r5 = r1
        L_0x0139:
            r6 = r3[r5]
            long r9 = ~r6
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x016c
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r1
        L_0x0153:
            if (r11 >= r9) goto L_0x0168
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r6
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0164
            int r1 = r5 << 3
            int r1 = r1 + r11
            r1 = r2[r1]
            goto L_0x0190
        L_0x0164:
            long r6 = r6 >> r10
            r8 = 1
            int r11 = r11 + r8
            goto L_0x0153
        L_0x0168:
            r8 = 1
            if (r9 != r10) goto L_0x0171
            goto L_0x016d
        L_0x016c:
            r8 = 1
        L_0x016d:
            if (r5 == r4) goto L_0x0171
            int r5 = r5 + r8
            goto L_0x0139
        L_0x0171:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The LongSet is empty"
            r0.<init>(r1)
            throw r0
        L_0x0179:
            pl r1 = r0.c
            if (r1 == 0) goto L_0x017e
            goto L_0x017f
        L_0x017e:
            r1 = 0
        L_0x017f:
            t52 r1 = r1.c()
            long r2 = r2.a
            i22 r1 = r1.y(r2)
            if (r1 == 0) goto L_0x018e
            long r1 = r1.a
            goto L_0x0190
        L_0x018e:
            r1 = 0
        L_0x0190:
            pl r3 = r0.c
            if (r3 == 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r3 = 0
        L_0x0196:
            t52 r3 = r3.c()
            r4 = 1
            r3.Y(r1, r4)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01bd
            pl r0 = r0.c
            if (r0 == 0) goto L_0x01aa
            r4 = r0
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            tt0 r0 = r4.b()
            wt r1 = new wt
            r2 = 9
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x01bd
        L_0x01ba:
            r26.f()
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e99.c(lbe):void");
    }

    public final void d(uae uae) {
        if (!iu7.F(uae.b)) {
            f();
            u(false);
            pl plVar = this.c;
            pl plVar2 = null;
            if (plVar == null) {
                plVar = null;
            }
            vo8 q = plVar.d().q(this.Z);
            if (q == null || q.z0 == ls8.DELETED) {
                f();
                return;
            }
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar2 = plVar3;
            }
            plVar2.b().c(new jh0(uae));
            return;
        }
        u(true);
    }

    public final int e() {
        return 1;
    }

    public final void f() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
    }

    public final byte[] g() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.o;
        msgSendCallback.payload = this.X;
        msgSendCallback.timestamp = this.Y;
        msgSendCallback.messageId = this.Z;
        msgSendCallback.buttonType = this.x0.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        eu0 eu0 = this.w0;
        buttonPosition.row = eu0.a;
        buttonPosition.column = eu0.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return gr8.toByteArray(msgSendCallback);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_MSG_SEND_CALLBACK;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        Long valueOf = Long.valueOf(this.Y);
        String str = this.x0.a;
        pn2 pn2 = new pn2((dfa) null, 27);
        pn2.s("callbackId", this.o);
        pn2.s(ApiProtocol.PARAM_PAYLOAD, this.X);
        ((HashMap) pn2.b).put("timestamp", valueOf);
        if (str != null) {
            pn2.s("type", str);
        }
        return pn2;
    }

    public final void u(boolean z) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        vo8 q = plVar.d().q(this.Z);
        if (q == null || q.z0 == ls8.DELETED) {
            f();
            return;
        }
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        to8 d = plVar3.d();
        eu0 eu0 = this.w0;
        int i = eu0.a;
        d.getClass();
        ((hz3) d.a).c.n(q.b, new hy5(28, new po8(this.o, i, eu0.b, z)));
        pl plVar4 = this.c;
        if (plVar4 != null) {
            plVar2 = plVar4;
        }
        plVar2.b().c(new ove(q.x0, q.b, 0));
    }
}
