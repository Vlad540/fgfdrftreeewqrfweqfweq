package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0015\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lmcc;", "result", "Lkotlin/Function1;", "", "Ljue;", "onCancellation", "resumeCancellableWith", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lu16;)V", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "", "yieldUndispatched", "(Lkotlinx/coroutines/internal/DispatchedContinuation;)Z", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "executeUnconfined", "(Lkotlinx/coroutines/internal/DispatchedContinuation;Ljava/lang/Object;IZLs16;)Z", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class DispatchedContinuationKt {
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");
    /* access modifiers changed from: private */
    public static final Symbol UNDEFINED = new Symbol("UNDEFINED");

    private static final boolean executeUnconfined(DispatchedContinuation<?> dispatchedContinuation, Object obj, int i, boolean z, s16 s16) {
        t05 a = die.a();
        if (z) {
            lr lrVar = a.c;
            if (lrVar != null ? lrVar.isEmpty() : true) {
                return false;
            }
        }
        if (a.U()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            a.n(dispatchedContinuation);
            return true;
        }
        a.S(true);
        try {
            s16.invoke();
            do {
            } while (a.m0());
        } catch (Throwable th) {
            a.d(true);
            throw th;
        }
        a.d(true);
        return false;
    }

    public static boolean executeUnconfined$default(DispatchedContinuation dispatchedContinuation, Object obj, int i, boolean z, s16 s16, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        t05 a = die.a();
        if (z) {
            lr lrVar = a.c;
            if (lrVar != null ? lrVar.isEmpty() : true) {
                return false;
            }
        }
        if (a.U()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            a.n(dispatchedContinuation);
            return true;
        }
        a.S(true);
        try {
            s16.invoke();
            do {
            } while (a.m0());
        } catch (Throwable th) {
            a.d(true);
            throw th;
        }
        a.d(true);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r8.H() != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.H() != false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7, defpackage.u16 r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L_0x00a9
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = ct0.L(r7, r8)
            ju3 r0 = r6.dispatcher
            hu3 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6._state = r8
            r6.resumeMode = r1
            ju3 r7 = r6.dispatcher
            hu3 r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto L_0x00ac
        L_0x0026:
            t05 r0 = defpackage.die.a()
            boolean r2 = r0.U()
            if (r2 == 0) goto L_0x0039
            r6._state = r8
            r6.resumeMode = r1
            r0.n(r6)
            goto L_0x00ac
        L_0x0039:
            r0.S(r1)
            r2 = 0
            hu3 r3 = r6.getContext()     // Catch:{ all -> 0x0061 }
            xhd r4 = xhd.c     // Catch:{ all -> 0x0061 }
            fu3 r3 = r3.get(r4)     // Catch:{ all -> 0x0061 }
            g37 r3 = (defpackage.g37) r3     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0063
            boolean r4 = r3.isActive()     // Catch:{ all -> 0x0061 }
            if (r4 != 0) goto L_0x0063
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch:{ all -> 0x0061 }
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch:{ all -> 0x0061 }
            kcc r8 = new kcc     // Catch:{ all -> 0x0061 }
            r8.<init>(r7)     // Catch:{ all -> 0x0061 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x0061 }
            goto L_0x0089
        L_0x0061:
            r7 = move-exception
            goto L_0x00a0
        L_0x0063:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch:{ all -> 0x0061 }
            java.lang.Object r3 = r6.countOrElement     // Catch:{ all -> 0x0061 }
            hu3 r4 = r8.getContext()     // Catch:{ all -> 0x0061 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch:{ all -> 0x0061 }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch:{ all -> 0x0061 }
            if (r3 == r5) goto L_0x0078
            eue r8 = defpackage.xie.L(r8, r4, r3)     // Catch:{ all -> 0x0061 }
            goto L_0x0079
        L_0x0078:
            r8 = r2
        L_0x0079:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch:{ all -> 0x0093 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x0086
            boolean r7 = r8.H()     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0089
        L_0x0086:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x0061 }
        L_0x0089:
            boolean r7 = r0.m0()     // Catch:{ all -> 0x0061 }
            if (r7 != 0) goto L_0x0089
        L_0x008f:
            r0.d(r1)
            goto L_0x00ac
        L_0x0093:
            r7 = move-exception
            if (r8 == 0) goto L_0x009c
            boolean r8 = r8.H()     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x009f
        L_0x009c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x0061 }
        L_0x009f:
            throw r7     // Catch:{ all -> 0x0061 }
        L_0x00a0:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x008f
        L_0x00a4:
            r6 = move-exception
            r0.d(r1)
            throw r6
        L_0x00a9:
            r6.resumeWith(r7)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.Continuation, java.lang.Object, u16):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation continuation, Object obj, u16 u16, int i, Object obj2) {
        if ((i & 2) != 0) {
            u16 = null;
        }
        resumeCancellableWith(continuation, obj, u16);
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super jue> dispatchedContinuation) {
        jue jue = jue.a;
        t05 a = die.a();
        lr lrVar = a.c;
        boolean z = true;
        if (lrVar != null ? lrVar.isEmpty() : true) {
            return false;
        }
        if (a.U()) {
            dispatchedContinuation._state = jue;
            dispatchedContinuation.resumeMode = 1;
            a.n(dispatchedContinuation);
        } else {
            a.S(true);
            try {
                dispatchedContinuation.run();
                do {
                } while (a.m0());
            } catch (Throwable th) {
                a.d(true);
                throw th;
            }
            a.d(true);
            z = false;
        }
        return z;
    }
}
