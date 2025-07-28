package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u0004\u0018\u00010\u001e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0010¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0004\b,\u0010-J6\u00102\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0016\b\b\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010.H\b¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\u001eH\u0010¢\u0006\u0004\b4\u00105J\u001a\u0010:\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010&H\b¢\u0006\u0004\b8\u00109J\u001e\u0010<\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\b¢\u0006\u0004\b;\u0010-J\u001f\u0010B\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00028\u0000H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010\u0015R\u0014\u0010K\u001a\u00020&8\u0000X\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001bR\u001c\u0010P\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0T8\u0002X\u0004R\u000b\u0010>\u001a\u00020=8\u0016X\u0005¨\u0006V"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lmi4;", "Lqu3;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lju3;", "dispatcher", "continuation", "<init>", "(Lju3;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable$kotlinx_coroutines_core", "()Z", "isReusable", "Ljue;", "awaitReusability$kotlinx_coroutines_core", "()V", "awaitReusability", "release$kotlinx_coroutines_core", "release", "Lzv1;", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "()Lzv1;", "claimReusableCancellableContinuation", "Lyv1;", "", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "(Lyv1;)Ljava/lang/Throwable;", "tryReleaseClaimedContinuation", "cause", "postponeCancellation$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Z", "postponeCancellation", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "Lmcc;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "onCancellation", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lu16;)V", "resumeCancellableWith", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "state", "resumeCancelled$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "resumeCancelled", "resumeUndispatchedWith$kotlinx_coroutines_core", "resumeUndispatchedWith", "Lhu3;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lhu3;Ljava/lang/Object;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "Lju3;", "Lkotlin/coroutines/Continuation;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "countOrElement", "getReusableCancellableContinuation", "reusableCancellableContinuation", "getCallerFrame", "()Lqu3;", "callerFrame", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class DispatchedContinuation<T> extends mi4 implements qu3, Continuation<T> {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state = DispatchedContinuationKt.UNDEFINED;
    public final Continuation<T> continuation;
    public final Object countOrElement = ThreadContextKt.threadContextElements(getContext());
    public final ju3 dispatcher;

    public DispatchedContinuation(ju3 ju3, Continuation<? super T> continuation2) {
        super(-1);
        this.dispatcher = ju3;
        this.continuation = continuation2;
    }

    private final zv1 getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof zv1) {
            return (zv1) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, u16 u16) {
        while (true) {
            u16.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        do {
        } while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED);
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        if (obj instanceof s73) {
            ((s73) obj).b.invoke(th);
        }
    }

    public final zv1 claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            } else if (obj instanceof zv1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return (zv1) obj;
            } else if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(hu3 hu3, T t) {
        this._state = t;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(hu3, this);
    }

    public qu3 getCallerFrame() {
        Continuation<T> continuation2 = this.continuation;
        if (continuation2 instanceof qu3) {
            return (qu3) continuation2;
        }
        return null;
    }

    public hu3 getContext() {
        return this.continuation.getContext();
    }

    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (hhd.f(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, th)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                    }
                }
                return true;
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, (Object) null)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    }
                }
                return false;
            }
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        zv1 reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (r8.H() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r8.H() != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object r7, defpackage.u16 r8) {
        /*
            r6 = this;
            java.lang.Object r8 = ct0.L(r7, r8)
            ju3 r0 = r6.dispatcher
            hu3 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0020
            r6._state = r8
            r6.resumeMode = r1
            ju3 r7 = r6.dispatcher
            hu3 r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto L_0x009e
        L_0x0020:
            t05 r0 = defpackage.die.a()
            boolean r2 = r0.U()
            if (r2 == 0) goto L_0x0033
            r6._state = r8
            r6.resumeMode = r1
            r0.n(r6)
            goto L_0x009e
        L_0x0033:
            r0.S(r1)
            r2 = 0
            hu3 r3 = r6.getContext()     // Catch:{ all -> 0x005b }
            xhd r4 = xhd.c     // Catch:{ all -> 0x005b }
            fu3 r3 = r3.get(r4)     // Catch:{ all -> 0x005b }
            g37 r3 = (defpackage.g37) r3     // Catch:{ all -> 0x005b }
            if (r3 == 0) goto L_0x005d
            boolean r4 = r3.isActive()     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x005d
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch:{ all -> 0x005b }
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch:{ all -> 0x005b }
            kcc r8 = new kcc     // Catch:{ all -> 0x005b }
            r8.<init>(r7)     // Catch:{ all -> 0x005b }
            r6.resumeWith(r8)     // Catch:{ all -> 0x005b }
            goto L_0x0083
        L_0x005b:
            r7 = move-exception
            goto L_0x009a
        L_0x005d:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = r6.countOrElement     // Catch:{ all -> 0x005b }
            hu3 r4 = r8.getContext()     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch:{ all -> 0x005b }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch:{ all -> 0x005b }
            if (r3 == r5) goto L_0x0072
            eue r8 = defpackage.xie.L(r8, r4, r3)     // Catch:{ all -> 0x005b }
            goto L_0x0073
        L_0x0072:
            r8 = r2
        L_0x0073:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch:{ all -> 0x008d }
            r5.resumeWith(r7)     // Catch:{ all -> 0x008d }
            if (r8 == 0) goto L_0x0080
            boolean r7 = r8.H()     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0083
        L_0x0080:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x005b }
        L_0x0083:
            boolean r7 = r0.m0()     // Catch:{ all -> 0x005b }
            if (r7 != 0) goto L_0x0083
        L_0x0089:
            r0.d(r1)
            goto L_0x009e
        L_0x008d:
            r7 = move-exception
            if (r8 == 0) goto L_0x0096
            boolean r8 = r8.H()     // Catch:{ all -> 0x005b }
            if (r8 == 0) goto L_0x0099
        L_0x0096:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch:{ all -> 0x005b }
        L_0x0099:
            throw r7     // Catch:{ all -> 0x005b }
        L_0x009a:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch:{ all -> 0x009f }
            goto L_0x0089
        L_0x009e:
            return
        L_0x009f:
            r6 = move-exception
            r0.d(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object, u16):void");
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object obj) {
        g37 g37 = (g37) getContext().get(xhd.c);
        if (g37 == null || g37.isActive()) {
            return false;
        }
        CancellationException cancellationException = g37.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        resumeWith(new kcc(cancellationException));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object obj) {
        Continuation<T> continuation2 = this.continuation;
        Object obj2 = this.countOrElement;
        hu3 context = continuation2.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
        eue L = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? xie.L(continuation2, context, updateThreadContext) : null;
        try {
            this.continuation.resumeWith(obj);
        } finally {
            if (L == null || L.H()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }

    public void resumeWith(Object obj) {
        hu3 context;
        Object updateThreadContext;
        hu3 context2 = this.continuation.getContext();
        Object L = ct0.L(obj, (u16) null);
        if (this.dispatcher.isDispatchNeeded(context2)) {
            this._state = L;
            this.resumeMode = 0;
            this.dispatcher.dispatch(context2, this);
            return;
        }
        t05 a = die.a();
        if (a.U()) {
            this._state = L;
            this.resumeMode = 0;
            a.n(this);
            return;
        }
        a.S(true);
        try {
            context = getContext();
            updateThreadContext = ThreadContextKt.updateThreadContext(context, this.countOrElement);
            this.continuation.resumeWith(obj);
            ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            do {
            } while (a.m0());
        } catch (Throwable th) {
            a.d(true);
            throw th;
        }
        a.d(true);
    }

    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + a24.f0(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(yv1 yv1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, symbol, yv1)) {
                        return null;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, (Object) null)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                return (Throwable) obj;
            } else {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }
}
