package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: yd1  reason: default package */
public final class yd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yd1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yd1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yd1 yd1 = new yd1(continuation, this.Y);
        yd1.X = obj;
        return yd1;
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [gd1, ig7] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x008a, code lost:
        if (ek8.K((android.view.ViewStub) r3.getValue()) == false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            defpackage.wx3.H(r8)
            java.lang.Object r8 = r7.X
            be1 r8 = (defpackage.be1) r8
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r7 = r7.Y
            r7.getClass()
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            r1 = 4
            r1 = r0[r1]
            nl0 r1 = r7.A0
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r2 = r8.e
            r1.setText(r2)
            nea r1 = r7.o0()
            java.lang.CharSequence r2 = r8.e
            r1.setTitle(r2)
            r1 = 2
            r1 = r0[r1]
            nl0 r1 = r7.y0
            java.lang.Object r1 = r1.getValue()
            f1a r1 = (f1a) r1
            java.util.List r2 = r8.c
            boolean r3 = r8.d
            java.util.List r4 = r8.b
            r1.b(r4, r2, r3)
            boolean r1 = r8.f
            if (r1 == 0) goto L_0x0051
            nea r1 = r7.o0()
            t97 r2 = r7.w0
            java.lang.Object r2 = r2.getValue()
            aea r2 = (aea) r2
            r1.setRightActions(r2)
            goto L_0x005a
        L_0x0051:
            nea r1 = r7.o0()
            yda r2 = yda.a
            r1.setRightActions(r2)
        L_0x005a:
            lg7 r1 = defpackage.hwf.c()
            java.util.List r8 = r8.a
            r1.addAll(r8)
            lg7 r8 = defpackage.hwf.a(r1)
            r7e r1 = r7.H0
            java.lang.Object r1 = r1.getValue()
            gd1 r1 = (defpackage.gd1) r1
            r1.E(r8)
            boolean r8 = r8.isEmpty()
            r1 = r8 ^ 1
            r2 = 9
            nl0 r3 = r7.F0
            if (r1 == 0) goto L_0x008d
            r4 = r0[r2]
            java.lang.Object r4 = r3.getValue()
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            boolean r4 = ek8.K(r4)
            if (r4 != 0) goto L_0x008d
            goto L_0x00c9
        L_0x008d:
            r2 = r0[r2]
            java.lang.Object r2 = r3.getValue()
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r3 = 10
            r4 = r0[r3]
            nl0 r4 = r7.G0
            java.lang.Object r5 = r4.getValue()
            p4a r5 = (p4a) r5
            r6 = 0
            ek8.I(r2, r5, r6)
            r2 = r0[r3]
            java.lang.Object r2 = r4.getValue()
            p4a r2 = (p4a) r2
            r3 = 8
            r4 = 0
            if (r8 == 0) goto L_0x00b4
            r8 = r4
            goto L_0x00b5
        L_0x00b4:
            r8 = r3
        L_0x00b5:
            r2.setVisibility(r8)
            r8 = 3
            r8 = r0[r8]
            nl0 r7 = r7.z0
            java.lang.Object r7 = r7.getValue()
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r1 == 0) goto L_0x00c6
            r3 = r4
        L_0x00c6:
            r7.setVisibility(r3)
        L_0x00c9:
            jue r7 = defpackage.jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd1.o(java.lang.Object):java.lang.Object");
    }
}
