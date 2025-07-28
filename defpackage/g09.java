package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: g09  reason: default package */
public final class g09 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ AtomicInteger Z;
    public final /* synthetic */ MessagesListWidget w0;
    public final /* synthetic */ l7c x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g09(Continuation continuation, AtomicInteger atomicInteger, MessagesListWidget messagesListWidget, l7c l7c) {
        super(2, continuation);
        this.Z = atomicInteger;
        this.w0 = messagesListWidget;
        this.x0 = l7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n(obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g09 g09 = new g09(continuation, this.Z, this.w0, this.x0);
        g09.Y = obj;
        return g09;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: jpc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.X
            one.me.messages.list.ui.MessagesListWidget r2 = r10.w0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            java.lang.Object r10 = r10.Y
            jpc r10 = (defpackage.jpc) r10
            wx3.H(r11)
            goto L_0x0065
        L_0x0013:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001b:
            wx3.H(r11)
            java.lang.Object r11 = r10.Y
            r8 = r11
            jpc r8 = (defpackage.jpc) r8
            java.util.concurrent.atomic.AtomicInteger r11 = r10.Z
            int r7 = r11.incrementAndGet()
            k77[] r11 = one.me.messages.list.ui.MessagesListWidget.b1
            one.me.messages.list.ui.recycler.MessagesLayoutManager r11 = r2.n0()
            int r11 = r11.w()
            l7c r1 = r10.x0
            if (r11 != 0) goto L_0x0051
            a73 r11 = z3d.a()
            r1.a = r11
            one.me.messages.list.ui.recycler.MessagesLayoutManager r11 = r2.n0()
            h09 r0 = new h09
            l7c r9 = r10.x0
            one.me.messages.list.ui.MessagesListWidget r5 = r10.w0
            java.util.concurrent.atomic.AtomicInteger r6 = r10.Z
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.t1(r0)
            goto L_0x0069
        L_0x0051:
            java.lang.Object r11 = r1.a
            z63 r11 = (z63) r11
            if (r11 == 0) goto L_0x0066
            r10.Y = r8
            r10.X = r3
            a73 r11 = (a73) r11
            java.lang.Object r10 = r11.awaitInternal(r10)
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r10 = r8
        L_0x0065:
            r8 = r10
        L_0x0066:
            one.me.messages.list.ui.MessagesListWidget.l0(r2, r8)
        L_0x0069:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g09.o(java.lang.Object):java.lang.Object");
    }
}
