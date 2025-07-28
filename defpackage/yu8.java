package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: yu8  reason: default package */
public final class yu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yu8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yu8 yu8 = new yu8(continuation, this.Y);
        yu8.X = obj;
        return yu8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r8 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (hhd.f(r3.b, r1) == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            wx3.H(r12)
            java.lang.Object r12 = r11.X
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            k77[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            one.me.sdk.messagewrite.MessageWriteWidget r11 = r11.Y
            e3e r0 = r11.v0()
            grd r1 = r0.K0
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            grd r0 = r0.L0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = ""
        L_0x0026:
            e3e r0 = r11.v0()
            nu7 r0 = r0.o
            jq8 r2 = r11.p0()
            r0.getClass()
            java.lang.CharSequence r3 = r2.getText()
            zqd r4 = r2.getMessagePosition()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r5 = h0e.c0(r1)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x004f
            goto L_0x00fb
        L_0x004f:
            if (r3 == 0) goto L_0x00fb
            boolean r5 = h0e.c0(r3)
            if (r5 == 0) goto L_0x0059
            goto L_0x00fb
        L_0x0059:
            int r1 = r1.length()
            int r5 = r3.length()
            if (r1 > r5) goto L_0x0065
            goto L_0x00fb
        L_0x0065:
            java.lang.Object r0 = r0.b
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            r0.clear()
            r0.clearSpans()
            r0.append(r3)
            int r1 = r0.length()
            java.lang.Class<s2e> r3 = defpackage.s2e.class
            java.lang.Object[] r1 = r0.getSpans(r6, r1, r3)
            s2e[] r1 = (defpackage.s2e[]) r1
            if (r1 == 0) goto L_0x009d
            int r3 = r1.length
            r5 = r6
        L_0x0082:
            if (r5 >= r3) goto L_0x0099
            r8 = r1[r5]
            int r9 = r0.getSpanStart(r8)
            int r10 = r0.getSpanEnd(r8)
            if (r9 > r4) goto L_0x0096
            if (r4 > r10) goto L_0x0096
            int r10 = r10 - r9
            if (r10 <= 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0099:
            r8 = r7
        L_0x009a:
            if (r8 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r7
        L_0x009e:
            if (r8 == 0) goto L_0x00fb
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            r4 = -1
            if (r1 == r4) goto L_0x00cb
            if (r3 == r4) goto L_0x00cb
            if (r1 <= r3) goto L_0x00b0
            goto L_0x00cb
        L_0x00b0:
            java.lang.CharSequence r1 = r0.subSequence(r1, r3)
            java.lang.String r1 = r1.toString()
            x2e r3 = r8.a
            java.lang.CharSequence r5 = r3.o
            boolean r5 = hhd.f(r5, r1)
            if (r5 != 0) goto L_0x00fb
            java.lang.CharSequence r3 = r3.b
            boolean r1 = hhd.f(r3, r1)
            if (r1 == 0) goto L_0x00cb
            goto L_0x00fb
        L_0x00cb:
            int r1 = r0.getSpanStart(r8)
            int r3 = r0.getSpanEnd(r8)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            mt0.C(r0, r5, r1, r3)
            android.text.SpannableStringBuilder r0 = r0.delete(r1, r3)
            r2.setText(r0)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x00ea
            int r0 = r0.length()
            goto L_0x00eb
        L_0x00ea:
            r0 = r6
        L_0x00eb:
            if (r1 <= r4) goto L_0x00f0
            if (r1 > r0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r1 = r0
        L_0x00f1:
            n30 r0 = new n30
            r3 = 12
            r0.<init>(r1, r3, r2)
            r2.post(r0)
        L_0x00fb:
            e3e r0 = r11.v0()
            jq8 r1 = r11.p0()
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x010e
            java.lang.String r1 = r1.toString()
            goto L_0x010f
        L_0x010e:
            r1 = r7
        L_0x010f:
            grd r0 = r0.K0
        L_0x0111:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r0.b(r2, r1)
            if (r2 == 0) goto L_0x0111
            e3e r0 = r11.v0()
            grd r0 = r0.O0
            r0.setValue(r7)
            nu8 r11 = r11.u0()
            t97 r0 = r11.y0
            java.lang.Object r0 = r0.getValue()
            pae r0 = (defpackage.pae) r0
            n3a r0 = (n3a) r0
            ju3 r0 = r0.a()
            ru3 r1 = ru3.b
            gu8 r2 = new gu8
            r2.<init>(r11, r12, r7)
            kotlinx.coroutines.internal.ContextScope r12 = r11.a
            qod r12 = xs7.D(r12, r0, r1, r2)
            k77[] r0 = defpackage.nu8.Z0
            r0 = r0[r6]
            e3 r1 = r11.C0
            r1.o1(r11, r0, r12)
            jue r11 = jue.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu8.o(java.lang.Object):java.lang.Object");
    }
}
