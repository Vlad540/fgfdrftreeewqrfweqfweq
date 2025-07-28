package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: l1  reason: default package */
public abstract class l1 implements ch7 {
    public static final Logger X;
    public static final urd Y;
    public static final Object Z = new Object();
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile Object a;
    public volatile w0 b;
    public volatile j1 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: y0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: y0} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<j1> r2 = defpackage.j1.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            o = r3
            java.lang.Class<l1> r3 = defpackage.l1.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            X = r4
            y0 r4 = new y0     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<w0> r2 = defpackage.w0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            c1 r4 = new c1
            r4.<init>()
        L_0x004a:
            Y = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = X
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1.<clinit>():void");
    }

    public static void b(l1 l1Var) {
        w0 w0Var;
        w0 w0Var2;
        w0 w0Var3 = null;
        while (true) {
            j1 j1Var = l1Var.c;
            if (Y.i(l1Var, j1Var, j1.c)) {
                while (j1Var != null) {
                    Thread thread = j1Var.a;
                    if (thread != null) {
                        j1Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    j1Var = j1Var.b;
                }
                do {
                    w0Var = l1Var.b;
                } while (!Y.g(l1Var, w0Var, w0.d));
                while (true) {
                    w0Var2 = w0Var3;
                    w0Var3 = w0Var;
                    if (w0Var3 == null) {
                        break;
                    }
                    w0Var = w0Var3.c;
                    w0Var3.c = w0Var2;
                }
                while (w0Var2 != null) {
                    w0Var3 = w0Var2.c;
                    Runnable runnable = w0Var2.a;
                    if (runnable instanceof a1) {
                        a1 a1Var = (a1) runnable;
                        l1Var = a1Var.a;
                        if (l1Var.a == a1Var) {
                            if (Y.h(l1Var, a1Var, f(a1Var.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, w0Var2.b);
                    }
                    w0Var2 = w0Var3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Level level = Level.SEVERE;
            X.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof r0) {
            Throwable th = ((r0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof u0) {
            throw new ExecutionException(((u0) obj).a);
        } else if (obj == Z) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object f(ch7 ch7) {
        if (ch7 instanceof l1) {
            Object obj = ((l1) ch7).a;
            if (!(obj instanceof r0)) {
                return obj;
            }
            r0 r0Var = (r0) obj;
            return r0Var.a ? r0Var.b != null ? new r0(false, (CancellationException) r0Var.b) : r0.d : obj;
        }
        boolean isCancelled = ch7.isCancelled();
        if ((!o) && isCancelled) {
            return r0.d;
        }
        try {
            Object g = g(ch7);
            return g == null ? Z : g;
        } catch (ExecutionException e) {
            return new u0(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new r0(false, e2);
            }
            return new u0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ch7, e2));
        } catch (Throwable th) {
            return new u0(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g == this ? "this future" : String.valueOf(g));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        w0 w0Var = this.b;
        w0 w0Var2 = w0.d;
        if (w0Var != w0Var2) {
            w0 w0Var3 = new w0(runnable, executor);
            do {
                w0Var3.c = w0Var;
                if (!Y.g(this, w0Var, w0Var3)) {
                    w0Var = this.b;
                } else {
                    return;
                }
            } while (w0Var != w0Var2);
        }
        d(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof a1)) {
            return false;
        }
        r0 r0Var = o ? new r0(z, new CancellationException("Future.cancel() was called.")) : z ? r0.c : r0.d;
        boolean z2 = false;
        while (true) {
            if (Y.h(this, obj, r0Var)) {
                b(this);
                if (!(obj instanceof a1)) {
                    return true;
                }
                ch7 ch7 = ((a1) obj).b;
                if (ch7 instanceof l1) {
                    this = (l1) ch7;
                    obj = this.a;
                    if (!(obj == null) && !(obj instanceof a1)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    ch7.cancel(z);
                    return true;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof a1)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x015f
            java.lang.Object r6 = r0.a
            r8 = 1
            if (r6 == 0) goto L_0x0017
            r9 = r8
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            boolean r10 = r6 instanceof defpackage.a1
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0023
            java.lang.Object r0 = e(r6)
            return r0
        L_0x0023:
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 + r4
            goto L_0x0030
        L_0x002f:
            r11 = r9
        L_0x0030:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x008b
            j1 r6 = r0.c
            j1 r15 = defpackage.j1.c
            if (r6 == r15) goto L_0x0084
            j1 r7 = new j1
            r7.<init>()
        L_0x0041:
            urd r9 = Y
            r9.F(r7, r6)
            boolean r6 = r9.i(r0, r6, r7)
            if (r6 == 0) goto L_0x0080
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0077
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x005b
            r5 = r8
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            boolean r6 = r4 instanceof defpackage.a1
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0067
            java.lang.Object r0 = e(r4)
            return r0
        L_0x0067:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.i(r7)
        L_0x0074:
            r6 = 0
            goto L_0x008c
        L_0x0077:
            r0.i(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0080:
            j1 r6 = r0.c
            if (r6 != r15) goto L_0x0041
        L_0x0084:
            java.lang.Object r0 = r0.a
            java.lang.Object r0 = e(r0)
            return r0
        L_0x008b:
            r6 = r9
        L_0x008c:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x00b5
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x0096
            r5 = r8
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            boolean r6 = r4 instanceof defpackage.a1
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00a2
            java.lang.Object r0 = e(r4)
            return r0
        L_0x00a2:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x00af
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L_0x0074
        L_0x00af:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00b5:
            java.lang.String r6 = r19.toString()
            java.lang.String r7 = r22.toString()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r10 = "Waited "
            java.lang.String r11 = " "
            java.lang.StringBuilder r1 = defpackage.hr1.k(r1, r10, r11)
            java.lang.String r2 = r22.toString()
            java.lang.String r2 = r2.toLowerCase(r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r9 = r4 + r13
            r17 = 0
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
            java.lang.String r2 = " (plus "
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
            long r4 = -r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r3.convert(r4, r2)
            long r2 = r3.toNanos(r9)
            long r4 = r4 - r2
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0100
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r16 = 0
            goto L_0x0102
        L_0x0100:
            r16 = r8
        L_0x0102:
            if (r2 <= 0) goto L_0x0125
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r11)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            if (r16 == 0) goto L_0x0121
            java.lang.String r2 = ","
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
        L_0x0121:
            java.lang.String r1 = defpackage.hr1.g(r1, r11)
        L_0x0125:
            if (r16 == 0) goto L_0x013b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " nanoseconds "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x013b:
            java.lang.String r2 = "delay)"
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
        L_0x0141:
            boolean r0 = r19.isDone()
            if (r0 == 0) goto L_0x0153
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " but future completed as timeout expired"
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0153:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " for "
            java.lang.String r1 = me4.i(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final String h() {
        Object obj = this.a;
        if (obj instanceof a1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ch7 ch7 = ((a1) obj).b;
            return wn6.l(sb, ch7 == this ? "this future" : String.valueOf(ch7), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void i(j1 j1Var) {
        j1Var.a = null;
        while (true) {
            j1 j1Var2 = this.c;
            if (j1Var2 != j1.c) {
                j1 j1Var3 = null;
                while (j1Var2 != null) {
                    j1 j1Var4 = j1Var2.b;
                    if (j1Var2.a != null) {
                        j1Var3 = j1Var2;
                    } else if (j1Var3 != null) {
                        j1Var3.b = j1Var4;
                        if (j1Var3.a == null) {
                        }
                    } else if (!Y.i(this, j1Var2, j1Var4)) {
                    }
                    j1Var2 = j1Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.a instanceof r0;
    }

    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof a1)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof r0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && (!(obj2 instanceof a1))) {
                return e(obj2);
            }
            j1 j1Var = this.c;
            j1 j1Var2 = j1.c;
            if (j1Var != j1Var2) {
                j1 j1Var3 = new j1();
                do {
                    urd urd = Y;
                    urd.F(j1Var3, j1Var);
                    if (urd.i(this, j1Var, j1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(j1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof a1))));
                        return e(obj);
                    }
                    j1Var = this.c;
                } while (j1Var != j1Var2);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
