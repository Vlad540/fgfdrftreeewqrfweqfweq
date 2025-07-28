package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: bv8  reason: default package */
public final class bv8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bv8 bv8 = new bv8(continuation, this.Y);
        bv8.X = obj;
        return bv8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            wx3.H(r4)
            java.lang.Object r4 = r3.X
            i05 r4 = (defpackage.i05) r4
            if (r4 == 0) goto L_0x000f
            java.lang.Object r4 = r4.a
            jt8 r4 = (defpackage.jt8) r4
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            k77[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            one.me.sdk.messagewrite.MessageWriteWidget r3 = r3.Y
            if (r4 == 0) goto L_0x001d
            r3.getClass()
            zp8 r4 = r4.a
            if (r4 != 0) goto L_0x001f
        L_0x001d:
            zp8 r4 = defpackage.zp8.a
        L_0x001f:
            jq8 r1 = r3.p0()
            r1.setEmojiExpandableState(r4)
            zp8 r1 = defpackage.zp8.b
            if (r4 != r1) goto L_0x0041
            jq8 r4 = r3.p0()
            qu8 r1 = new qu8
            r2 = 3
            r1.<init>(r3, r2)
            hq8 r3 = r4.c
            r3.setShowSoftInputOnFocus(r0)
            xp8 r4 = new xp8
            r4.<init>(r0, r1)
            r3.setOnFocusChangeListener(r4)
        L_0x0041:
            jue r3 = jue.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv8.o(java.lang.Object):java.lang.Object");
    }
}
