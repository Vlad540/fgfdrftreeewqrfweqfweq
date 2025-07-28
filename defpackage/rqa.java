package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: rqa  reason: default package */
public final class rqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rqa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rqa rqa = new rqa(this.Y, continuation);
        rqa.X = obj;
        return rqa;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b9, code lost:
        r0 = defpackage.ek8.x(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            wx3.H(r11)
            java.lang.Object r11 = r10.X
            java.util.Set r11 = (java.util.Set) r11
            int r11 = r11.size()
            k77[] r2 = one.me.startconversation.channel.PickSubscribersScreen.D0
            one.me.startconversation.channel.PickSubscribersScreen r10 = r10.Y
            one.me.sdk.uikit.common.button.OneMeButton r2 = r10.w0()
            r3 = 20000(0x4e20, float:2.8026E-41)
            r4 = 0
            r7e r5 = r10.z0
            if (r11 != 0) goto L_0x0030
            int r6 = defpackage.lca.d
            r2.setText((int) r6)
            r2.c(r4, r0)
            qqa r6 = new qqa
            r6.<init>(r10, r1)
            a24.a0(r2, r6)
            r2.setEnabled(r0)
            goto L_0x0061
        L_0x0030:
            java.lang.Object r6 = r5.getValue()
            xzc r6 = (defpackage.xzc) r6
            vqc r6 = (defpackage.vqc) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f66maxparticipants
            long r8 = (long) r3
            long r6 = r6.o(r7, r8)
            int r6 = (int) r6
            if (r11 <= r6) goto L_0x0049
            r2.setEnabled(r1)
            goto L_0x0061
        L_0x0049:
            int r6 = h2a.Q
            r2.setText((int) r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            r2.c(r6, r0)
            r2.setEnabled(r0)
            qqa r6 = new qqa
            r6.<init>(r10, r0)
            a24.a0(r2, r6)
        L_0x0061:
            java.lang.Object r0 = r5.getValue()
            xzc r0 = (defpackage.xzc) r0
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f66maxparticipants
            long r6 = (long) r3
            long r8 = r0.o(r2, r6)
            int r0 = (int) r8
            if (r11 <= r0) goto L_0x00f4
            gba r11 = r10.A0
            if (r11 == 0) goto L_0x007d
            r11.a()
        L_0x007d:
            hba r11 = new hba
            r11.<init>((one.me.sdk.arch.Widget) r10)
            int r0 = defpackage.lca.c
            java.lang.Object r3 = r5.getValue()
            xzc r3 = (defpackage.xzc) r3
            vqc r3 = (defpackage.vqc) r3
            r3.getClass()
            long r2 = r3.o(r2, r6)
            int r2 = (int) r2
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            jge r3 = new jge
            java.util.List r2 = cs.g0(r2)
            r3.<init>(r0, r2)
            r11.h(r3)
            vba r0 = new vba
            int r2 = defpackage.phc.t1
            r0.<init>(r2)
            r11.f(r0)
            android.view.View r0 = r10.getView()
            if (r0 == 0) goto L_0x00c4
            java.lang.Integer r0 = defpackage.ek8.x(r0)
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.intValue()
            goto L_0x00c5
        L_0x00c4:
            r0 = r1
        L_0x00c5:
            pba r2 = new pba
            one.me.sdk.uikit.common.button.OneMeButton r3 = r10.w0()
            int r3 = r3.getMeasuredHeight()
            if (r0 != 0) goto L_0x00e5
            one.me.sdk.uikit.common.button.OneMeButton r0 = r10.w0()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r5 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x00e0
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x00e0:
            if (r4 == 0) goto L_0x00e5
            int r0 = r4.bottomMargin
            goto L_0x00e6
        L_0x00e5:
            r0 = r1
        L_0x00e6:
            int r3 = r3 + r0
            r0 = 3
            r2.<init>(r1, r3, r0)
            r11.c(r2)
            gba r11 = r11.j()
            r10.A0 = r11
        L_0x00f4:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqa.o(java.lang.Object):java.lang.Object");
    }
}
