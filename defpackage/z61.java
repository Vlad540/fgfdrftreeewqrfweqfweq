package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: z61  reason: default package */
public final class z61 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z61(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.Y = callHistoryScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((z61) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z61 z61 = new z61(continuation, this.Y);
        z61.X = obj;
        return z61;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [f6c, p61, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            defpackage.wx3.H(r18)
            java.lang.Object r2 = r0.X
            sp1 r2 = (defpackage.sp1) r2
            k77[] r3 = one.me.calllist.ui.CallHistoryScreen.G0
            one.me.calllist.ui.CallHistoryScreen r0 = r0.Y
            r0.getClass()
            k77[] r3 = one.me.calllist.ui.CallHistoryScreen.G0
            r4 = 4
            r4 = r3[r4]
            n0c r5 = r0.x0
            java.lang.Object r4 = r5.T0(r0, r4)
            hx0 r4 = (defpackage.hx0) r4
            boolean r5 = r2.b
            r13 = 0
            if (r5 == 0) goto L_0x0025
            r5 = r13
            goto L_0x0027
        L_0x0025:
            r5 = 8
        L_0x0027:
            r4.setVisibility(r5)
            r4 = 5
            r5 = r3[r4]
            n0c r6 = r0.y0
            java.lang.Object r5 = r6.T0(r0, r5)
            hx0 r5 = (defpackage.hx0) r5
            boolean r6 = r2.b
            java.util.List r15 = r2.a
            if (r6 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            boolean r6 = r15.isEmpty()
            if (r6 != 0) goto L_0x0044
        L_0x0042:
            r6 = r13
            goto L_0x0046
        L_0x0044:
            r6 = 8
        L_0x0046:
            r5.setVisibility(r6)
            f71 r5 = r0.B0
            r5.a = r15
            androidx.viewpager2.widget.ViewPager2 r5 = r0.l0()
            p61 r7 = r0.C0
            java.util.List r6 = r7.B0
            boolean r6 = r6.isEmpty()
            r12 = 1
            if (r6 == 0) goto L_0x006e
            boolean r6 = r15.isEmpty()
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x006e
            r7.B0 = r15
            int r5 = r15.size()
            r7.p(r13, r5)
            r1 = r12
            goto L_0x00a1
        L_0x006e:
            l61 r6 = new l61
            java.util.List r8 = r7.B0
            r6.<init>(r1, r8, r15)
            ug4 r6 = defpackage.iu7.e(r6)
            k61 r10 = new k61
            r10.<init>(r7, r15, r6, r1)
            c6 r11 = new c6
            r6 = 19
            r11.<init>(r6, r7)
            boolean r6 = r5.isInLayout()
            if (r6 == 0) goto L_0x009d
            tw0 r9 = new tw0
            r16 = 1
            r6 = r9
            r8 = r5
            r14 = r9
            r9 = r13
            r1 = r12
            r12 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.post(r14)
            goto L_0x00a1
        L_0x009d:
            r1 = r12
            r10.invoke()
        L_0x00a1:
            r5 = 2
            r6 = r3[r5]
            n0c r7 = r0.Z
            java.lang.Object r6 = r7.T0(r0, r6)
            hda r6 = (defpackage.hda) r6
            boolean r7 = r15.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x00b5
            r7 = r13
            goto L_0x00b7
        L_0x00b5:
            r7 = 8
        L_0x00b7:
            r6.setVisibility(r7)
            androidx.viewpager2.widget.ViewPager2 r6 = r0.l0()
            boolean r7 = r15.isEmpty()
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x00c7
            r7 = r13
            goto L_0x00c9
        L_0x00c7:
            r7 = 8
        L_0x00c9:
            r6.setVisibility(r7)
            boolean r6 = r15.isEmpty()
            android.view.View r7 = r0.requireView()
            int r8 = defpackage.sob.call_history_empty
            android.view.View r7 = r7.findViewById(r8)
            if (r7 == 0) goto L_0x00de
            r12 = r1
            goto L_0x00df
        L_0x00de:
            r12 = r13
        L_0x00df:
            r7 = 7
            n0c r8 = r0.A0
            if (r6 == 0) goto L_0x0172
            if (r12 != 0) goto L_0x0164
            r6 = r3[r13]
            n0c r9 = r0.X
            java.lang.Object r6 = r9.T0(r0, r6)
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            p4a r9 = new p4a
            android.content.Context r10 = r0.getContext()
            r11 = 0
            r9.<init>(r10, r11)
            int r10 = defpackage.sob.call_history_empty
            r9.setId(r10)
            nt3 r10 = new nt3
            r12 = -1
            r10.<init>((int) r12, (int) r12)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r12 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r12.<init>()
            r10.b(r12)
            r9.setLayoutParams(r10)
            int r10 = phc.f0
            r9.setIcon(r10)
            int r10 = defpackage.ctb.call_history_call_history_empty_title
            hge r12 = new hge
            r12.<init>(r10)
            r9.setTitle(r12)
            int r10 = defpackage.ctb.call_history_call_history_empty_subtitle
            hge r12 = new hge
            r12.<init>(r10)
            r9.setSubtitle(r12)
            e71 r10 = r0.m0()
            t97 r10 = r10.Y
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x014e
            android.content.Context r10 = r9.getContext()
            int r12 = defpackage.ctb.call_history_call_contact_action
            java.lang.String r10 = r10.getString(r12)
            b20 r12 = new b20
            r14 = 3
            r12.<init>(r14)
            r9.x(r10, r12)
        L_0x014e:
            sy6 r10 = new sy6
            up0 r12 = new up0
            r12.<init>(r4, r5, r1)
            r4 = 0
            r10.<init>(r4, r12, r1)
            ek8.g(r9, r10, r11)
            r1 = 8
            r9.setVisibility(r1)
            ek8.e(r9, r6)
        L_0x0164:
            r1 = r3[r7]
            java.lang.Object r1 = r8.T0(r0, r1)
            p4a r1 = (p4a) r1
            r1.setVisibility(r13)
        L_0x016f:
            r4 = 8
            goto L_0x0181
        L_0x0172:
            if (r12 == 0) goto L_0x016f
            r1 = r3[r7]
            java.lang.Object r1 = r8.T0(r0, r1)
            p4a r1 = (p4a) r1
            r4 = 8
            r1.setVisibility(r4)
        L_0x0181:
            r1 = 6
            r1 = r3[r1]
            n0c r3 = r0.z0
            java.lang.Object r0 = r3.T0(r0, r1)
            n2a r0 = (n2a) r0
            boolean r1 = r2.c
            if (r1 == 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r13 = r4
        L_0x0192:
            r0.setVisibility(r13)
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.o(java.lang.Object):java.lang.Object");
    }
}
