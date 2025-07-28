package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.deeplink.LinkInterceptorWidget;

/* renamed from: if7  reason: default package */
public final class if7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinkInterceptorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if7(LinkInterceptorWidget linkInterceptorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = linkInterceptorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((if7) n((ne7) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        if7 if7 = new if7(this.Y, continuation);
        if7.X = obj;
        return if7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: be7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = 2
            r2 = 12
            defpackage.wx3.H(r26)
            java.lang.Object r3 = r0.X
            ne7 r3 = (ne7) r3
            int r4 = one.me.android.deeplink.LinkInterceptorWidget.o
            one.me.android.deeplink.LinkInterceptorWidget r0 = r0.Y
            im r4 = r0.requireActivity()
            boolean r5 = r4 instanceof defpackage.efc
            r6 = 1
            r5 = r5 ^ r6
            java.lang.String r7 = r3.m()
            uy1 r8 = new uy1
            r8.<init>(r7, r1)
            ee7 r9 = ee7.a
            boolean r9 = r3.equals(r9)
            r10 = 6
            r11 = 0
            if (r9 == 0) goto L_0x0047
            hba r2 = new hba
            r2.<init>(r0)
            fca r0 = new fca
            yba r3 = yba.a
            pba r4 = new pba
            r4.<init>(r1, r11, r10)
            java.lang.String r1 = "Ждите"
            java.lang.String r6 = "ждите"
            r0.<init>(r3, r1, r6, r4)
            r2.b = r0
            r2.j()
            goto L_0x0486
        L_0x0047:
            boolean r9 = r3 instanceof xd7
            r12 = 10
            r13 = 0
            if (r9 == 0) goto L_0x0081
            fca r2 = new fca
            vba r3 = new vba
            int r6 = phc.f1
            r3.<init>(r6)
            int r6 = defpackage.ysb.snackbar_link_info_error
            android.content.Context r8 = r0.getContext()
            java.lang.String r6 = defpackage.d8.u(r8, r6)
            pba r8 = new pba
            r8.<init>(r1, r11, r10)
            r2.<init>(r3, r6, r13, r8)
            if (r5 == 0) goto L_0x0075
            int r0 = one.me.android.MainActivity.e1
            smc.m(r4, r13, r2, r13, r12)
            r4.finish()
            goto L_0x0486
        L_0x0075:
            hba r1 = new hba
            r1.<init>(r0)
            r1.b = r2
            r1.j()
            goto L_0x0486
        L_0x0081:
            boolean r9 = r3 instanceof ae7
            if (r9 == 0) goto L_0x009d
            if (r5 == 0) goto L_0x0093
            int r0 = one.me.android.MainActivity.e1
            r0 = 14
            smc.m(r4, r13, r13, r13, r0)
            r4.finish()
            goto L_0x0486
        L_0x0093:
            sr7 r0 = defpackage.sr7.c
            r0.getClass()
            defpackage.sr7.a2(r13, r11)
            goto L_0x0486
        L_0x009d:
            boolean r9 = r3 instanceof be7
            if (r9 == 0) goto L_0x00b4
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2)
            be7 r3 = (be7) r3
            android.net.Uri r2 = r3.a
            r1.setData(r2)
            r0.startActivity(r1)
            goto L_0x0486
        L_0x00b4:
            boolean r9 = r3 instanceof wd7
            java.lang.String r14 = "id"
            java.lang.String r15 = "link"
            if (r9 == 0) goto L_0x012a
            if (r5 == 0) goto L_0x00e7
            sgc r0 = r0.getRouter()
            one.me.android.join.JoinChatWidget r1 = new one.me.android.join.JoinChatWidget
            wd7 r3 = (wd7) r3
            java.lang.String r2 = r3.b
            boolean r4 = r3.c
            long r8 = r3.a
            java.lang.String r3 = r3.o
            r14 = r1
            r15 = r8
            r17 = r3
            r18 = r2
            r19 = r4
            r14.<init>(r15, r17, r18, r19)
            vgc r1 = defpackage.n06.f(r1, r13, r13)
            java.lang.String r2 = "join_chat"
            r1.d(r2)
            r0.R(r1)
            goto L_0x0486
        L_0x00e7:
            r47 r0 = defpackage.r47.c
            wd7 r3 = (wd7) r3
            d34 r0 = r0.P1()
            mn r1 = new mn
            r1.<init>((int) r2)
            java.lang.String r2 = ":join"
            r1.b = r2
            long r8 = r3.a
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.T(r2, r14)
            java.lang.String r2 = r3.o
            r1.T(r2, r15)
            boolean r2 = r3.c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "channel"
            r1.T(r2, r4)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r4 = "no_anim"
            r1.T(r2, r4)
            java.lang.String r2 = r3.b
            if (r2 == 0) goto L_0x0121
            java.lang.String r3 = "title"
            r1.T(r2, r3)
        L_0x0121:
            android.net.Uri r1 = r1.u()
            r0.c(r1, r13)
            goto L_0x0486
        L_0x012a:
            boolean r9 = r3 instanceof fe7
            r12 = 4
            if (r9 == 0) goto L_0x0194
            r0 = 0
            if (r5 == 0) goto L_0x016a
            int r2 = one.me.android.MainActivity.e1
            zu2 r14 = defpackage.zu2.c
            fe7 r3 = (fe7) r3
            java.lang.Long r2 = new java.lang.Long
            long r9 = r3.b
            r2.<init>(r9)
            long r9 = r2.longValue()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014b
            r19 = r2
            goto L_0x014d
        L_0x014b:
            r19 = r13
        L_0x014d:
            r22 = 0
            r23 = 1
            long r0 = r3.a
            java.lang.String r17 = "local"
            r18 = 0
            r20 = 0
            r21 = 0
            r24 = 244(0xf4, float:3.42E-43)
            r15 = r0
            android.net.Uri r0 = defpackage.zu2.Z1(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            smc.m(r4, r0, r13, r8, r12)
            r4.finish()
            goto L_0x0486
        L_0x016a:
            zu2 r14 = defpackage.zu2.c
            fe7 r3 = (fe7) r3
            java.lang.Long r2 = new java.lang.Long
            long r8 = r3.b
            r2.<init>(r8)
            long r8 = r2.longValue()
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0180
            r19 = r2
            goto L_0x0182
        L_0x0180:
            r19 = r13
        L_0x0182:
            r20 = 0
            r21 = 0
            long r0 = r3.a
            java.lang.String r17 = "local"
            r18 = 0
            r22 = 116(0x74, float:1.63E-43)
            r15 = r0
            defpackage.zu2.b2(r14, r15, r17, r18, r19, r20, r21, r22)
            goto L_0x0486
        L_0x0194:
            boolean r9 = r3 instanceof ge7
            if (r9 == 0) goto L_0x01d3
            if (r5 == 0) goto L_0x01c8
            int r0 = one.me.android.MainActivity.e1
            kdb r0 = kdb.c
            ge7 r3 = (ge7) r3
            r0.getClass()
            mn r0 = new mn
            r0.<init>((int) r2)
            java.lang.String r1 = ":profile"
            r0.b = r1
            long r1 = r3.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.T(r1, r14)
            java.lang.String r1 = "type"
            java.lang.String r2 = "contact"
            r0.T(r2, r1)
            android.net.Uri r0 = r0.u()
            smc.m(r4, r0, r13, r8, r12)
            r4.finish()
            goto L_0x0486
        L_0x01c8:
            kdb r0 = kdb.c
            ge7 r3 = (ge7) r3
            long r1 = r3.a
            r0.e2(r1)
            goto L_0x0486
        L_0x01d3:
            boolean r9 = r3 instanceof he7
            if (r9 == 0) goto L_0x021a
            if (r5 == 0) goto L_0x0200
            int r0 = one.me.android.MainActivity.e1
            zu2 r14 = defpackage.zu2.c
            he7 r3 = (he7) r3
            r22 = 0
            r23 = 0
            long r0 = r3.a
            java.lang.String r17 = "local"
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r2 = r3.b
            r24 = 476(0x1dc, float:6.67E-43)
            r15 = r0
            r21 = r2
            android.net.Uri r0 = defpackage.zu2.Z1(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            smc.m(r4, r0, r13, r8, r12)
            r4.finish()
            goto L_0x0486
        L_0x0200:
            zu2 r14 = defpackage.zu2.c
            he7 r3 = (he7) r3
            r20 = 0
            java.lang.String r0 = r3.b
            long r1 = r3.a
            java.lang.String r17 = "local"
            r18 = 0
            r19 = 0
            r22 = 92
            r15 = r1
            r21 = r0
            defpackage.zu2.b2(r14, r15, r17, r18, r19, r20, r21, r22)
            goto L_0x0486
        L_0x021a:
            boolean r9 = r3 instanceof ke7
            if (r9 == 0) goto L_0x026a
            java.lang.String r0 = "set_id"
            java.lang.String r1 = ":stickers/set"
            if (r5 == 0) goto L_0x0249
            int r6 = one.me.android.MainActivity.e1
            zu2 r6 = defpackage.zu2.c
            ke7 r3 = (ke7) r3
            r6.getClass()
            mn r6 = new mn
            r6.<init>((int) r2)
            r6.b = r1
            long r8 = r3.a
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r6.T(r1, r0)
            android.net.Uri r0 = r6.u()
            smc.m(r4, r0, r13, r13, r2)
            r4.finish()
            goto L_0x0486
        L_0x0249:
            zu2 r4 = defpackage.zu2.c
            ke7 r3 = (ke7) r3
            d34 r4 = r4.P1()
            mn r6 = new mn
            r6.<init>((int) r2)
            r6.b = r1
            long r1 = r3.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.T(r1, r0)
            android.net.Uri r0 = r6.u()
            r4.c(r0, r13)
            goto L_0x0486
        L_0x026a:
            boolean r9 = r3 instanceof je7
            if (r9 == 0) goto L_0x033d
            t97 r0 = r0.b
            if (r5 == 0) goto L_0x0322
            java.lang.Object r0 = r0.getValue()
            we1 r0 = (defpackage.we1) r0
            je7 r3 = (je7) r3
            r0.c()
            r7e r1 = r0.n
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0318
            java.lang.String r1 = r3.a
            boolean r3 = defpackage.h0e.c0(r1)
            if (r3 == 0) goto L_0x0295
            goto L_0x0318
        L_0x0295:
            cpd r3 = new cpd
            r3.<init>(r1, r6)
            so1 r0 = r0.d()
            ep1 r0 = (defpackage.ep1) r0
            boolean r0 = r0.f(r3)
            if (r0 != 0) goto L_0x02fd
            xe1 r0 = defpackage.xe1.c
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = ":"
            java.lang.String r3 = ":call-active"
            boolean r1 = defpackage.p0e.Q(r3, r1, r11)
            if (r1 == 0) goto L_0x02f7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r3 = 63
            r1.append(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x02cb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e0
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.append(r3)
            r3 = 38
            r1.append(r3)
            goto L_0x02cb
        L_0x02e0:
            int r0 = defpackage.h0e.V(r1)
            r1.deleteCharAt(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "max"
            android.net.Uri r0 = defpackage.am7.d(r0, r1, r13)
            int r1 = one.me.android.MainActivity.e1
            smc.m(r4, r0, r13, r13, r2)
            goto L_0x031d
        L_0x02f7:
            one.me.deeplink.InvalidDeeplinkNamingException r0 = new one.me.deeplink.InvalidDeeplinkNamingException
            r0.<init>(r3)
            throw r0
        L_0x02fd:
            xe1 r0 = defpackage.xe1.c
            r0.getClass()
            mn r0 = new mn
            r0.<init>((int) r2)
            java.lang.String r3 = ":call-join-preview"
            r0.b = r3
            r0.T(r1, r15)
            android.net.Uri r0 = r0.u()
            int r1 = one.me.android.MainActivity.e1
            smc.m(r4, r0, r13, r13, r2)
            goto L_0x031d
        L_0x0318:
            jrf r0 = r0.a
            r0.a()
        L_0x031d:
            r4.finish()
            goto L_0x0486
        L_0x0322:
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            we1 r8 = (defpackage.we1) r8
            r0 = r3
            je7 r0 = (je7) r0
            gz3 r13 = new gz3
            r1 = 25
            r13.<init>(r1, r3)
            r11 = 0
            r12 = 0
            java.lang.String r9 = r0.a
            r10 = 1
            r8.j(r9, r10, r11, r12, r13)
            goto L_0x0486
        L_0x033d:
            zd7 r6 = zd7.a
            boolean r6 = r3.equals(r6)
            wba r9 = wba.a
            if (r6 == 0) goto L_0x0375
            fca r2 = new fca
            int r3 = defpackage.ysb.snackbar_self_contact_open
            android.content.Context r6 = r0.getContext()
            java.lang.String r3 = defpackage.d8.u(r6, r3)
            pba r6 = new pba
            r6.<init>(r1, r11, r10)
            r2.<init>(r9, r3, r13, r6)
            if (r5 == 0) goto L_0x0369
            int r0 = one.me.android.MainActivity.e1
            r0 = 10
            smc.m(r4, r13, r2, r13, r0)
            r4.finish()
            goto L_0x0486
        L_0x0369:
            hba r1 = new hba
            r1.<init>(r0)
            r1.b = r2
            r1.j()
            goto L_0x0486
        L_0x0375:
            boolean r6 = r3 instanceof yd7
            if (r6 == 0) goto L_0x03a0
            if (r5 == 0) goto L_0x0389
            int r0 = one.me.android.MainActivity.e1
            yd7 r3 = (yd7) r3
            android.net.Uri r0 = r3.a
            smc.m(r4, r0, r13, r8, r12)
            r4.finish()
            goto L_0x0486
        L_0x0389:
            o2a r0 = defpackage.o2a.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<d34> r1 = defpackage.d34.class
            java.lang.Object r0 = r0.c(r1)
            d34 r0 = (defpackage.d34) r0
            yd7 r3 = (yd7) r3
            android.net.Uri r1 = r3.a
            r0.c(r1, r13)
            goto L_0x0486
        L_0x03a0:
            ie7 r6 = ie7.a
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x03d6
            fca r2 = new fca
            int r3 = defpackage.ysb.snackbar_contact_removed
            android.content.Context r6 = r0.getContext()
            java.lang.String r3 = defpackage.d8.u(r6, r3)
            pba r6 = new pba
            r6.<init>(r1, r11, r10)
            r2.<init>(r9, r3, r13, r6)
            if (r5 == 0) goto L_0x03ca
            int r0 = one.me.android.MainActivity.e1
            r0 = 10
            smc.m(r4, r13, r2, r13, r0)
            r4.finish()
            goto L_0x0486
        L_0x03ca:
            hba r1 = new hba
            r1.<init>(r0)
            r1.b = r2
            r1.j()
            goto L_0x0486
        L_0x03d6:
            boolean r6 = r3 instanceof ce7
            if (r6 == 0) goto L_0x0417
            if (r5 == 0) goto L_0x040a
            int r0 = one.me.android.MainActivity.e1
            sr7 r0 = defpackage.sr7.c
            ce7 r3 = (ce7) r3
            r0.getClass()
            mn r0 = new mn
            r0.<init>((int) r2)
            java.lang.String r1 = ":chat-list"
            r0.b = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r6 = "message_push"
            r0.T(r1, r6)
            java.lang.String r1 = r3.a
            if (r1 == 0) goto L_0x03fe
            java.lang.String r3 = "folder_id"
            r0.T(r1, r3)
        L_0x03fe:
            android.net.Uri r0 = r0.u()
            smc.m(r4, r0, r13, r13, r2)
            r4.finish()
            goto L_0x0486
        L_0x040a:
            sr7 r0 = defpackage.sr7.c
            ce7 r3 = (ce7) r3
            r0.getClass()
            java.lang.String r0 = r3.a
            defpackage.sr7.a2(r0, r11)
            goto L_0x0486
        L_0x0417:
            boolean r6 = r3 instanceof me7
            if (r6 == 0) goto L_0x0451
            fca r2 = new fca
            int r3 = defpackage.ysb.snackbar_folder_link_error_title
            android.content.Context r6 = r0.getContext()
            java.lang.String r3 = defpackage.d8.u(r6, r3)
            int r6 = defpackage.ysb.snackbar_folder_link_error_caption
            android.content.Context r8 = r0.getContext()
            java.lang.String r6 = defpackage.d8.u(r8, r6)
            pba r8 = new pba
            r8.<init>(r1, r11, r10)
            r2.<init>(r9, r3, r6, r8)
            if (r5 == 0) goto L_0x0446
            int r0 = one.me.android.MainActivity.e1
            r0 = 10
            smc.m(r4, r13, r2, r13, r0)
            r4.finish()
            goto L_0x0486
        L_0x0446:
            hba r1 = new hba
            r1.<init>(r0)
            r1.b = r2
            r1.j()
            goto L_0x0486
        L_0x0451:
            boolean r0 = r3 instanceof de7
            if (r0 == 0) goto L_0x04a7
            if (r5 == 0) goto L_0x0471
            int r0 = one.me.android.MainActivity.e1
            sr7 r0 = defpackage.sr7.c
            de7 r3 = (de7) r3
            qr4 r1 = bff.c
            r0.getClass()
            long r0 = r3.a
            java.lang.String r3 = r3.b
            android.net.Uri r0 = defpackage.sr7.b2(r0, r3)
            smc.m(r4, r0, r13, r13, r2)
            r4.finish()
            goto L_0x0486
        L_0x0471:
            sr7 r0 = defpackage.sr7.c
            de7 r3 = (de7) r3
            qr4 r1 = bff.c
            d34 r0 = r0.P1()
            long r1 = r3.a
            java.lang.String r3 = r3.b
            android.net.Uri r1 = defpackage.sr7.b2(r1, r3)
            r0.c(r1, r13)
        L_0x0486:
            if (r5 != 0) goto L_0x04a4
            if (r7 == 0) goto L_0x04a4
            sr7 r0 = defpackage.sr7.c
            d34 r0 = r0.P1()
            wia r1 = new wia
            java.lang.String r2 = "params"
            r1.<init>(r2, r7)
            wia[] r1 = new defpackage.wia[]{r1}
            android.os.Bundle r1 = defpackage.jjd.j(r1)
            java.lang.String r2 = ":external_callback"
            r0.b(r2, r1)
        L_0x04a4:
            jue r0 = defpackage.jue.a
            return r0
        L_0x04a7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if7.o(java.lang.Object):java.lang.Object");
    }
}
