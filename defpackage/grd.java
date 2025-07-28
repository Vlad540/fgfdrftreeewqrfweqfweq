package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: grd  reason: default package */
public final class grd extends p3 implements mc9, cw1, g36 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(grd.class, Object.class, "_state$volatile");
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public grd(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a(Object obj, Continuation continuation) {
        setValue(obj);
        return jue.a;
    }

    public final boolean b(Object obj, Object obj2) {
        if (obj == null) {
            obj = wr9.a;
        }
        if (obj2 == null) {
            obj2 = wr9.a;
        }
        return m(obj, obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[Catch:{ all -> 0x0038 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.frd
            if (r0 == 0) goto L_0x0013
            r0 = r15
            frd r0 = (defpackage.frd) r0
            int r1 = r0.z0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z0 = r1
            goto L_0x0018
        L_0x0013:
            frd r0 = new frd
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.x0
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.z0
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r6) goto L_0x0052
            if (r2 == r5) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            java.lang.Object r13 = r0.w0
            g37 r14 = r0.Z
            ird r2 = r0.Y
            rj5 r7 = r0.X
            grd r8 = r0.o
            defpackage.wx3.H(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x0079
        L_0x0038:
            r13 = move-exception
            goto L_0x00f3
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0043:
            java.lang.Object r13 = r0.w0
            g37 r14 = r0.Z
            ird r2 = r0.Y
            rj5 r7 = r0.X
            grd r8 = r0.o
            defpackage.wx3.H(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x00b0
        L_0x0052:
            ird r2 = r0.Y
            rj5 r14 = r0.X
            grd r13 = r0.o
            defpackage.wx3.H(r15)     // Catch:{ all -> 0x005c }
            goto L_0x006b
        L_0x005c:
            r14 = move-exception
            r8 = r13
            r13 = r14
            goto L_0x00f3
        L_0x0061:
            defpackage.wx3.H(r15)
            q3 r15 = r13.e()
            ird r15 = (defpackage.ird) r15
            r2 = r15
        L_0x006b:
            hu3 r15 = r0.b     // Catch:{ all -> 0x005c }
            xhd r7 = xhd.c     // Catch:{ all -> 0x005c }
            fu3 r15 = r15.get(r7)     // Catch:{ all -> 0x005c }
            g37 r15 = (defpackage.g37) r15     // Catch:{ all -> 0x005c }
            r8 = r13
            r7 = r14
            r14 = r15
            r13 = r3
        L_0x0079:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = Y     // Catch:{ all -> 0x0038 }
            java.lang.Object r15 = r15.get(r8)     // Catch:{ all -> 0x0038 }
            if (r14 == 0) goto L_0x008d
            boolean r9 = r14.isActive()     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            java.util.concurrent.CancellationException r13 = r14.getCancellationException()     // Catch:{ all -> 0x0038 }
            throw r13     // Catch:{ all -> 0x0038 }
        L_0x008d:
            if (r13 == 0) goto L_0x0095
            boolean r9 = r13.equals(r15)     // Catch:{ all -> 0x0038 }
            if (r9 != 0) goto L_0x00b0
        L_0x0095:
            kotlinx.coroutines.internal.Symbol r13 = defpackage.wr9.a     // Catch:{ all -> 0x0038 }
            if (r15 != r13) goto L_0x009b
            r13 = r3
            goto L_0x009c
        L_0x009b:
            r13 = r15
        L_0x009c:
            r0.o = r8     // Catch:{ all -> 0x0038 }
            r0.X = r7     // Catch:{ all -> 0x0038 }
            r0.Y = r2     // Catch:{ all -> 0x0038 }
            r0.Z = r14     // Catch:{ all -> 0x0038 }
            r0.w0 = r15     // Catch:{ all -> 0x0038 }
            r0.z0 = r5     // Catch:{ all -> 0x0038 }
            java.lang.Object r13 = r7.a(r13, r0)     // Catch:{ all -> 0x0038 }
            if (r13 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r13 = r15
        L_0x00b0:
            java.util.concurrent.atomic.AtomicReference r15 = r2.a     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r9 = defpackage.hrd.a     // Catch:{ all -> 0x0038 }
            java.lang.Object r15 = r15.getAndSet(r9)     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r10 = defpackage.hrd.b     // Catch:{ all -> 0x0038 }
            if (r15 != r10) goto L_0x00bd
            goto L_0x0079
        L_0x00bd:
            r0.o = r8     // Catch:{ all -> 0x0038 }
            r0.X = r7     // Catch:{ all -> 0x0038 }
            r0.Y = r2     // Catch:{ all -> 0x0038 }
            r0.Z = r14     // Catch:{ all -> 0x0038 }
            r0.w0 = r13     // Catch:{ all -> 0x0038 }
            r0.z0 = r4     // Catch:{ all -> 0x0038 }
            zv1 r15 = new zv1     // Catch:{ all -> 0x0038 }
            kotlin.coroutines.Continuation r10 = defpackage.urd.y(r0)     // Catch:{ all -> 0x0038 }
            r15.<init>(r6, r10)     // Catch:{ all -> 0x0038 }
            r15.n()     // Catch:{ all -> 0x0038 }
            java.util.concurrent.atomic.AtomicReference r10 = r2.a     // Catch:{ all -> 0x0038 }
        L_0x00d7:
            boolean r11 = r10.compareAndSet(r9, r15)     // Catch:{ all -> 0x0038 }
            jue r12 = defpackage.jue.a     // Catch:{ all -> 0x0038 }
            if (r11 == 0) goto L_0x00e0
            goto L_0x00e9
        L_0x00e0:
            java.lang.Object r11 = r10.get()     // Catch:{ all -> 0x0038 }
            if (r11 == r9) goto L_0x00d7
            r15.resumeWith(r12)     // Catch:{ all -> 0x0038 }
        L_0x00e9:
            java.lang.Object r15 = r15.m()     // Catch:{ all -> 0x0038 }
            if (r15 != r1) goto L_0x00f0
            r12 = r15
        L_0x00f0:
            if (r12 != r1) goto L_0x0079
            return r1
        L_0x00f3:
            r8.k(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grd.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pj5 d(hu3 hu3, int i, int i2) {
        Symbol symbol = hrd.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? icd.e(this, hu3, i, i2) : this;
    }

    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final boolean g(Object obj) {
        setValue(obj);
        return true;
    }

    public final Object getValue() {
        Symbol symbol = wr9.a;
        Object obj = Y.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    public final q3 h() {
        return new ird();
    }

    public final q3[] j() {
        return new ird[2];
    }

    public final List l() {
        return Collections.singletonList(getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r11 = (defpackage.ird[]) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r11 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        r0 = r11.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r3 >= r0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        r4 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r4 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        r4 = r4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r5 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r6 = defpackage.hrd.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        if (r5 != r6) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        r7 = defpackage.hrd.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        if (r5 != r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r4.compareAndSet(r5, r6) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        if (r4.get() == r5) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (r4.compareAndSet(r5, r7) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005f, code lost:
        ((defpackage.zv1) r5).resumeWith(defpackage.jue.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        if (r4.get() == r5) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11 = r9.X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        if (r11 != r10) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0076, code lost:
        r9.X = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0079, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r10 = r9.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007f, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        r8 = r11;
        r11 = r10;
        r10 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r10 == 0) goto L_0x0015
            boolean r10 = defpackage.hhd.f(r1, r10)     // Catch:{ all -> 0x0012 }
            if (r10 != 0) goto L_0x0015
            monitor-exit(r9)
            return r2
        L_0x0012:
            r10 = move-exception
            goto L_0x008c
        L_0x0015:
            boolean r10 = defpackage.hhd.f(r1, r11)     // Catch:{ all -> 0x0012 }
            r1 = 1
            if (r10 == 0) goto L_0x001e
            monitor-exit(r9)
            return r1
        L_0x001e:
            r0.set(r9, r11)     // Catch:{ all -> 0x0012 }
            int r10 = r9.X     // Catch:{ all -> 0x0012 }
            r11 = r10 & 1
            if (r11 != 0) goto L_0x0086
            int r10 = r10 + r1
            r9.X = r10     // Catch:{ all -> 0x0012 }
            q3[] r11 = r9.a     // Catch:{ all -> 0x0012 }
            monitor-exit(r9)
        L_0x002d:
            ird[] r11 = (defpackage.ird[]) r11
            if (r11 == 0) goto L_0x0071
            int r0 = r11.length
            r3 = r2
        L_0x0033:
            if (r3 >= r0) goto L_0x0071
            r4 = r11[r3]
            if (r4 == 0) goto L_0x006e
            java.util.concurrent.atomic.AtomicReference r4 = r4.a
        L_0x003b:
            java.lang.Object r5 = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(r4)
            if (r5 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            kotlinx.coroutines.internal.Symbol r6 = defpackage.hrd.b
            if (r5 != r6) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            kotlinx.coroutines.internal.Symbol r7 = defpackage.hrd.a
            if (r5 != r7) goto L_0x0059
        L_0x004b:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L_0x0052
            goto L_0x006e
        L_0x0052:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L_0x004b
            goto L_0x003b
        L_0x0059:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L_0x0067
            zv1 r5 = (defpackage.zv1) r5
            jue r4 = defpackage.jue.a
            r5.resumeWith(r4)
            goto L_0x006e
        L_0x0067:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L_0x0059
            goto L_0x003b
        L_0x006e:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0071:
            monitor-enter(r9)
            int r11 = r9.X     // Catch:{ all -> 0x007b }
            if (r11 != r10) goto L_0x007d
            int r10 = r10 + r1
            r9.X = r10     // Catch:{ all -> 0x007b }
            monitor-exit(r9)
            return r1
        L_0x007b:
            r10 = move-exception
            goto L_0x0084
        L_0x007d:
            q3[] r10 = r9.a     // Catch:{ all -> 0x007b }
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x002d
        L_0x0084:
            monitor-exit(r9)
            throw r10
        L_0x0086:
            int r10 = r10 + 2
            r9.X = r10     // Catch:{ all -> 0x0012 }
            monitor-exit(r9)
            return r1
        L_0x008c:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grd.m(java.lang.Object, java.lang.Object):boolean");
    }

    public final void setValue(Object obj) {
        if (obj == null) {
            obj = wr9.a;
        }
        m((Object) null, obj);
    }
}
