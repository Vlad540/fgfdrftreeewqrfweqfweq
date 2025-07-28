package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mi4  reason: default package */
public abstract class mi4 extends sde {
    public int resumeMode;

    public mi4(int i) {
        super(0, oee.g);
        this.resumeMode = i;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        r73 r73 = obj instanceof r73 ? (r73) obj : null;
        if (r73 != null) {
            return r73.a;
        }
        return null;
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                jjd.d(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            gwf.x(getDelegate$kotlinx_coroutines_core().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r5.H() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r5.H() != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            jue r0 = defpackage.jue.a
            xde r1 = r11.taskContext
            kotlin.coroutines.Continuation r2 = r11.getDelegate$kotlinx_coroutines_core()     // Catch:{ all -> 0x0020 }
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2     // Catch:{ all -> 0x0020 }
            kotlin.coroutines.Continuation<T> r3 = r2.continuation     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = r2.countOrElement     // Catch:{ all -> 0x0020 }
            hu3 r4 = r3.getContext()     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch:{ all -> 0x0020 }
            r6 = 0
            if (r2 == r5) goto L_0x0023
            eue r5 = defpackage.xie.L(r3, r4, r2)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r2 = move-exception
            goto L_0x009a
        L_0x0023:
            r5 = r6
        L_0x0024:
            hu3 r7 = r3.getContext()     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r11.takeState$kotlinx_coroutines_core()     // Catch:{ all -> 0x0043 }
            java.lang.Throwable r9 = r11.getExceptionalResult$kotlinx_coroutines_core(r8)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x0045
            int r10 = r11.resumeMode     // Catch:{ all -> 0x0043 }
            boolean r10 = defpackage.ete.I(r10)     // Catch:{ all -> 0x0043 }
            if (r10 == 0) goto L_0x0045
            xhd r10 = xhd.c     // Catch:{ all -> 0x0043 }
            fu3 r7 = r7.get(r10)     // Catch:{ all -> 0x0043 }
            g37 r7 = (defpackage.g37) r7     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r3 = move-exception
            goto L_0x008e
        L_0x0045:
            r7 = r6
        L_0x0046:
            if (r7 == 0) goto L_0x005e
            boolean r10 = r7.isActive()     // Catch:{ all -> 0x0043 }
            if (r10 != 0) goto L_0x005e
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()     // Catch:{ all -> 0x0043 }
            r11.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch:{ all -> 0x0043 }
            kcc r8 = new kcc     // Catch:{ all -> 0x0043 }
            r8.<init>(r7)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r8)     // Catch:{ all -> 0x0043 }
            goto L_0x0070
        L_0x005e:
            if (r9 == 0) goto L_0x0069
            kcc r7 = new kcc     // Catch:{ all -> 0x0043 }
            r7.<init>(r9)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0070
        L_0x0069:
            java.lang.Object r7 = r11.getSuccessfulResult$kotlinx_coroutines_core(r8)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0043 }
        L_0x0070:
            if (r5 == 0) goto L_0x0078
            boolean r3 = r5.H()     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x007b
        L_0x0078:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
        L_0x007b:
            r1.getClass()     // Catch:{ all -> 0x007f }
            goto L_0x0086
        L_0x007f:
            r0 = move-exception
            kcc r1 = new kcc
            r1.<init>(r0)
            r0 = r1
        L_0x0086:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)
            r11.handleFatalException$kotlinx_coroutines_core(r6, r0)
            goto L_0x00ac
        L_0x008e:
            if (r5 == 0) goto L_0x0096
            boolean r5 = r5.H()     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0099
        L_0x0096:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
        L_0x0099:
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x009a:
            r1.getClass()     // Catch:{ all -> 0x009e }
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            kcc r1 = new kcc
            r1.<init>(r0)
            r0 = r1
        L_0x00a5:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)
            r11.handleFatalException$kotlinx_coroutines_core(r2, r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi4.run():void");
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
