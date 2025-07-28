package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: r61  reason: default package */
public final class r61 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryPageScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r61(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callHistoryPageScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((r61) n((ria) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r61 r61 = new r61(this.Y, continuation);
        r61.X = obj;
        return r61;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [ig7, java.lang.Object, o61] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0062, code lost:
        if ((!((java.util.ArrayList) r2.o.o).isEmpty()) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r3) {
        /*
            r2 = this;
            defpackage.wx3.H(r3)
            java.lang.Object r3 = r2.X
            ria r3 = (defpackage.ria) r3
            qia r0 = defpackage.qia.a
            boolean r0 = defpackage.hhd.f(r3, r0)
            if (r0 != 0) goto L_0x0070
            boolean r0 = r3 instanceof defpackage.pia
            if (r0 == 0) goto L_0x006a
            pia r3 = (defpackage.pia) r3
            kk9 r0 = one.me.calllist.ui.page.CallHistoryPageScreen.y0
            one.me.calllist.ui.page.CallHistoryPageScreen r2 = r2.Y
            r7e r0 = r2.Z
            java.lang.Object r0 = r0.getValue()
            o61 r0 = (defpackage.o61) r0
            java.util.Map r3 = r3.a
            java.util.Collection r3 = r3.values()
            r0.getClass()
            java.util.List r3 = defpackage.o23.s0(r3)
            r0.E(r3)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.m0()
            w61 r0 = r2.o0()
            boolean r0 = r0.r()
            r3.setRefreshingNext(r0)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.m0()
            w61 r2 = r2.o0()
            r2.getClass()
            lk9 r0 = defpackage.g71.b
            r0.getClass()
            g71 r0 = defpackage.g71.ALL
            g71 r1 = r2.b
            if (r1 != r0) goto L_0x0065
            j60 r2 = r2.o
            java.lang.Object r2 = r2.o
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            r0 = 1
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            r3.setRefreshingPrev(r0)
            goto L_0x0070
        L_0x006a:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0070:
            jue r2 = defpackage.jue.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r61.o(java.lang.Object):java.lang.Object");
    }
}
