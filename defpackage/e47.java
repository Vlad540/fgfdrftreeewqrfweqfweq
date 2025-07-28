package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;

/* renamed from: e47  reason: default package */
public final class e47 extends icc implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i47 Z;
    public LockFreeLinkedListHead c;
    public ww2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e47(i47 i47, Continuation continuation) {
        super(2, continuation);
        this.Z = i47;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e47) n((gyc) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e47 e47 = new e47(this.Z, continuation);
        e47.Y = obj;
        return e47;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            ww2 r1 = r6.o
            kotlinx.coroutines.internal.LockFreeLinkedListHead r3 = r6.c
            java.lang.Object r4 = r6.Y
            gyc r4 = (defpackage.gyc) r4
            defpackage.wx3.H(r7)
            goto L_0x0072
        L_0x0018:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0020:
            defpackage.wx3.H(r7)
            goto L_0x0077
        L_0x0024:
            defpackage.wx3.H(r7)
            java.lang.Object r7 = r6.Y
            gyc r7 = (defpackage.gyc) r7
            i47 r1 = r6.Z
            java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
            boolean r4 = r1 instanceof defpackage.ww2
            if (r4 == 0) goto L_0x003f
            ww2 r1 = (defpackage.ww2) r1
            yw2 r1 = r1.b
            r6.X = r3
            r7.b(r1, r6)
            return r0
        L_0x003f:
            boolean r3 = r1 instanceof defpackage.jv6
            if (r3 == 0) goto L_0x0077
            jv6 r1 = (defpackage.jv6) r1
            ok9 r1 = r1.b()
            if (r1 == 0) goto L_0x0077
            java.lang.Object r3 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L_0x0055:
            boolean r7 = defpackage.hhd.f(r1, r3)
            if (r7 != 0) goto L_0x0077
            boolean r7 = r1 instanceof defpackage.ww2
            if (r7 == 0) goto L_0x0072
            r7 = r1
            ww2 r7 = (defpackage.ww2) r7
            yw2 r7 = r7.b
            r6.Y = r4
            r6.c = r3
            ww2 r1 = (defpackage.ww2) r1
            r6.o = r1
            r6.X = r2
            r4.b(r7, r6)
            return r0
        L_0x0072:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L_0x0055
        L_0x0077:
            jue r6 = defpackage.jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.o(java.lang.Object):java.lang.Object");
    }
}
