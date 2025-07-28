package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: eue  reason: default package */
public final class eue extends ScopeCoroutine {
    public final ThreadLocal a;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public eue(defpackage.hu3 r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            fue r0 = defpackage.fue.a
            fu3 r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            hu3 r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.a = r0
            hu3 r4 = r4.getContext()
            cqc r0 = cqc.c
            fu3 r4 = r4.get(r0)
            boolean r4 = r4 instanceof defpackage.ju3
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)
            r2.I(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eue.<init>(hu3, kotlin.coroutines.Continuation):void");
    }

    public final boolean H() {
        boolean z = this.threadLocalIsSet && this.a.get() == null;
        this.a.remove();
        return !z;
    }

    public final void I(hu3 hu3, Object obj) {
        this.threadLocalIsSet = true;
        this.a.set(new wia(hu3, obj));
    }

    public final void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            wia wia = (wia) this.a.get();
            if (wia != null) {
                ThreadContextKt.restoreThreadContext((hu3) wia.a, wia.b);
            }
            this.a.remove();
        }
        Object G = ct0.G(obj);
        Continuation<T> continuation = this.uCont;
        hu3 context = continuation.getContext();
        eue eue = null;
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, eue);
        if (updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS) {
            eue = xie.L(continuation, context, updateThreadContext);
        }
        try {
            this.uCont.resumeWith(G);
        } finally {
            if (eue == null || eue.H()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }
}
