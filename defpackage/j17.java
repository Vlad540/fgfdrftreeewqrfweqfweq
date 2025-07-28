package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: j17  reason: default package */
public final class j17 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j17(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((j17) n((f17) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j17 j17 = new j17(continuation, this.Y);
        j17.X = obj;
        return j17;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [sgc] */
    /* JADX WARNING: type inference failed for: r3v3, types: [sgc] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.wx3.H(r15)
            java.lang.Object r15 = r14.X
            f17 r15 = (defpackage.f17) r15
            k77[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.F0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r14 = r14.Y
            one.me.sdk.uikit.common.button.OneMeButton r0 = r14.m0()
            r1 = 0
            r0.setProgressEnabled(r1)
            r2 = 1
            r0.setClickable(r2)
            boolean r0 = r15 instanceof defpackage.b17
            if (r0 == 0) goto L_0x002c
            b17 r15 = (defpackage.b17) r15
            mge r15 = r15.a
            android.content.Context r0 = r14.getContext()
            java.lang.CharSequence r15 = r15.a(r0)
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.l0(r14, r15)
            goto L_0x012d
        L_0x002c:
            boolean r0 = r15 instanceof defpackage.c17
            r3 = 0
            if (r0 == 0) goto L_0x0065
            c17 r15 = (defpackage.c17) r15
            mge r0 = r15.a
            lu7 r1 = r14.a
            r1.getClass()
            android.content.Context r1 = r14.getContext()
            java.lang.CharSequence r0 = r0.a(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x012d
        L_0x0046:
            mge r15 = r15.b
            if (r15 == 0) goto L_0x0052
            android.content.Context r1 = r14.getContext()
            java.lang.CharSequence r3 = r15.a(r1)
        L_0x0052:
            hba r15 = new hba
            r15.<init>(r14)
            r15.i(r0)
            r15.b(r3)
            r15.e(r2)
            r15.j()
            goto L_0x012d
        L_0x0065:
            boolean r0 = r15 instanceof defpackage.d17
            java.lang.String r4 = "BottomSheetWidget"
            r5 = 6
            if (r0 == 0) goto L_0x00ce
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            int r15 = defpackage.v5a.d
            jc3 r15 = rf0.c(r15, r5, r3)
            int r0 = defpackage.v5a.c
            hge r5 = new hge
            r5.<init>(r0)
            r15.f(r5)
            int r0 = defpackage.u5a.b
            int r5 = defpackage.v5a.b
            hge r6 = new hge
            r6.<init>(r5)
            r15.d(r0, r6)
            int r0 = defpackage.u5a.a
            int r5 = defpackage.v5a.a
            hge r6 = new hge
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x009e:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x00a9
            rr3 r15 = r15.getParentController()
            goto L_0x009e
        L_0x00a9:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x00b0
            ygc r15 = (ygc) r15
            goto L_0x00b1
        L_0x00b0:
            r15 = r3
        L_0x00b1:
            if (r15 == 0) goto L_0x00b7
            sgc r3 = r15.S()
        L_0x00b7:
            r8.y0(r14)
            if (r3 == 0) goto L_0x012d
            vgc r14 = new vgc
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x012d
        L_0x00ce:
            boolean r0 = r15 instanceof defpackage.e17
            if (r0 == 0) goto L_0x0128
            k77[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            int r15 = i9a.c
            jc3 r15 = rf0.c(r15, r5, r3)
            int r0 = i9a.b
            hge r5 = new hge
            r5.<init>(r0)
            r15.f(r5)
            int r0 = h9a.d
            int r5 = i9a.a
            hge r6 = new hge
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x00f8:
            rr3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x0103
            rr3 r15 = r15.getParentController()
            goto L_0x00f8
        L_0x0103:
            boolean r0 = r15 instanceof ygc
            if (r0 == 0) goto L_0x010a
            ygc r15 = (ygc) r15
            goto L_0x010b
        L_0x010a:
            r15 = r3
        L_0x010b:
            if (r15 == 0) goto L_0x0111
            sgc r3 = r15.S()
        L_0x0111:
            r8.y0(r14)
            if (r3 == 0) goto L_0x012d
            vgc r14 = new vgc
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            rf0.k(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x012d
        L_0x0128:
            if (r15 != 0) goto L_0x0130
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.l0(r14, r3)
        L_0x012d:
            jue r14 = defpackage.jue.a
            return r14
        L_0x0130:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j17.o(java.lang.Object):java.lang.Object");
    }
}
