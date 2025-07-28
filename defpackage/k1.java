package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: k1  reason: default package */
public abstract class k1 extends rz6 implements ch7 {
    public static final fq3 X;
    public static final hhd Y;
    public static final Object Z = new Object();
    public static final boolean o;
    public volatile Object a;
    public volatile v0 b;
    public volatile i1 c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: x0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: x0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: x0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: x0} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<i1> r2 = defpackage.i1.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)     // Catch:{ SecurityException -> 0x0013 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ SecurityException -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            o = r3
            fq3 r3 = new fq3
            java.lang.Class<k1> r4 = defpackage.k1.class
            r3.<init>((java.lang.Class) r4)
            X = r3
            r3 = 0
            h1 r5 = new h1     // Catch:{ Error | Exception -> 0x0028 }
            r5.<init>()     // Catch:{ Error | Exception -> 0x0028 }
            r0 = r5
            r5 = r3
            goto L_0x0054
        L_0x0028:
            r5 = move-exception
            x0 r12 = new x0     // Catch:{ Error | Exception -> 0x004d }
            java.lang.Class<java.lang.Thread> r6 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r6, r1)     // Catch:{ Error | Exception -> 0x004d }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ Error | Exception -> 0x004d }
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r2, r6)     // Catch:{ Error | Exception -> 0x004d }
            java.lang.Class<v0> r2 = defpackage.v0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r2, r0)     // Catch:{ Error | Exception -> 0x004d }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r0, r1)     // Catch:{ Error | Exception -> 0x004d }
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Error | Exception -> 0x004d }
            r0 = r12
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            r3 = r0
            b1 r0 = new b1
            r0.<init>()
        L_0x0054:
            Y = r0
            if (r3 == 0) goto L_0x006e
            fq3 r0 = X
            java.util.logging.Logger r1 = r0.b()
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "UnsafeAtomicHelper is broken!"
            r1.log(r2, r4, r5)
            java.util.logging.Logger r0 = r0.b()
            java.lang.String r1 = "SafeAtomicHelper is broken!"
            r0.log(r2, r1, r3)
        L_0x006e:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.<clinit>():void");
    }

    public static void e(k1 k1Var, boolean z) {
        v0 v0Var = null;
        while (true) {
            k1Var.getClass();
            for (i1 x = Y.x(k1Var); x != null; x = x.b) {
                Thread thread = x.a;
                if (thread != null) {
                    x.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            k1Var.b();
            v0 v0Var2 = v0Var;
            v0 w = Y.w(k1Var);
            v0 v0Var3 = v0Var2;
            while (w != null) {
                v0 v0Var4 = w.c;
                w.c = v0Var3;
                v0Var3 = w;
                w = v0Var4;
            }
            while (true) {
                if (v0Var3 != null) {
                    v0Var = v0Var3.c;
                    Runnable runnable = v0Var3.a;
                    Objects.requireNonNull(runnable);
                    if (runnable instanceof z0) {
                        z0 z0Var = (z0) runnable;
                        k1Var = z0Var.a;
                        if (k1Var.a == z0Var) {
                            if (Y.l(k1Var, z0Var, h(z0Var.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = v0Var3.b;
                        Objects.requireNonNull(executor);
                        f(runnable, executor);
                    }
                    v0Var3 = v0Var;
                } else {
                    return;
                }
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger b2 = X.b();
            Level level = Level.SEVERE;
            b2.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof q0) {
            Throwable th = ((q0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof t0) {
            throw new ExecutionException(((t0) obj).a);
        } else if (obj == Z) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object h(defpackage.ch7 r6) {
        /*
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r6 instanceof defpackage.d1
            r2 = 0
            if (r1 == 0) goto L_0x002a
            k1 r6 = (defpackage.k1) r6
            java.lang.Object r6 = r6.a
            boolean r0 = r6 instanceof defpackage.q0
            if (r0 == 0) goto L_0x0026
            r0 = r6
            q0 r0 = (defpackage.q0) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x0026
            java.lang.Throwable r6 = r0.b
            if (r6 == 0) goto L_0x0024
            q0 r6 = new q0
            java.lang.Throwable r0 = r0.b
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            r6.<init>(r2, r0)
            goto L_0x0026
        L_0x0024:
            q0 r6 = defpackage.q0.d
        L_0x0026:
            java.util.Objects.requireNonNull(r6)
            return r6
        L_0x002a:
            boolean r1 = r6 instanceof defpackage.rz6
            if (r1 == 0) goto L_0x004e
            r1 = r6
            rz6 r1 = (defpackage.rz6) r1
            k1 r1 = (defpackage.k1) r1
            r1.getClass()
            boolean r3 = r1 instanceof defpackage.d1
            if (r3 == 0) goto L_0x0045
            java.lang.Object r1 = r1.a
            boolean r3 = r1 instanceof defpackage.t0
            if (r3 == 0) goto L_0x0045
            t0 r1 = (defpackage.t0) r1
            java.lang.Throwable r1 = r1.a
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x004e
            t0 r6 = new t0
            r6.<init>(r1)
            return r6
        L_0x004e:
            boolean r1 = r6.isCancelled()
            boolean r3 = o
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L_0x005f
            q0 r6 = defpackage.q0.d
            java.util.Objects.requireNonNull(r6)
            return r6
        L_0x005f:
            java.lang.Object r3 = i(r6)     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            if (r1 == 0) goto L_0x0082
            q0 r3 = new q0     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            r5.<init>(r0)     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            r5.append(r6)     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            java.lang.String r5 = r5.toString()     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            r4.<init>(r5)     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            r3.<init>(r2, r4)     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
            return r3
        L_0x007c:
            r6 = move-exception
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            goto L_0x008d
        L_0x0080:
            r3 = move-exception
            goto L_0x00ae
        L_0x0082:
            if (r3 != 0) goto L_0x0086
            java.lang.Object r3 = Z     // Catch:{ ExecutionException -> 0x0080, CancellationException -> 0x007e, Error | Exception -> 0x007c }
        L_0x0086:
            return r3
        L_0x0087:
            t0 r0 = new t0
            r0.<init>(r6)
            return r0
        L_0x008d:
            if (r1 != 0) goto L_0x00a8
            t0 r1 = new t0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r0)
            r1.<init>(r2)
            return r1
        L_0x00a8:
            q0 r6 = new q0
            r6.<init>(r2, r0)
            return r6
        L_0x00ae:
            if (r1 == 0) goto L_0x00c7
            q0 r1 = new q0
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r4.<init>(r6, r3)
            r1.<init>(r2, r4)
            return r1
        L_0x00c7:
            t0 r6 = new t0
            java.lang.Throwable r0 = r3.getCause()
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.h(ch7):java.lang.Object");
    }

    public static Object i(Future future) {
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
            Object i = i(this);
            sb.append("SUCCESS, result=[");
            d(sb, i);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public void b() {
    }

    public void c(Runnable runnable, Executor executor) {
        v0 v0Var;
        v0 v0Var2;
        a06.m(executor, "Executor was null.");
        if (isDone() || (v0Var = this.b) == (v0Var2 = v0.d)) {
            f(runnable, executor);
        }
        v0 v0Var3 = new v0(runnable, executor);
        do {
            v0Var3.c = v0Var;
            if (!Y.k(this, v0Var, v0Var3)) {
                v0Var = this.b;
            } else {
                return;
            }
        } while (v0Var != v0Var2);
        f(runnable, executor);
    }

    public boolean cancel(boolean z) {
        q0 q0Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof z0)) {
            return false;
        }
        if (o) {
            q0Var = new q0(z, new CancellationException("Future.cancel() was called."));
        } else {
            q0Var = z ? q0.c : q0.d;
            Objects.requireNonNull(q0Var);
        }
        boolean z2 = false;
        while (true) {
            if (Y.l(this, obj, q0Var)) {
                e(this, z);
                if (!(obj instanceof z0)) {
                    return true;
                }
                ch7 ch7 = ((z0) obj).b;
                if (ch7 instanceof d1) {
                    this = (k1) ch7;
                    obj = this.a;
                    if (!(obj == null) && !(obj instanceof z0)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    ch7.cancel(z);
                    return true;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof z0)) {
                    return z2;
                }
            }
        }
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x016b
            java.lang.Object r6 = r0.a
            r8 = 1
            if (r6 == 0) goto L_0x0017
            r9 = r8
            goto L_0x0018
        L_0x0017:
            r9 = 0
        L_0x0018:
            boolean r10 = r6 instanceof defpackage.z0
            r10 = r10 ^ r8
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0023
            java.lang.Object r0 = g(r6)
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
            if (r6 < 0) goto L_0x0097
            i1 r6 = r0.c
            i1 r15 = defpackage.i1.c
            if (r6 == r15) goto L_0x008d
            i1 r7 = new i1
            r7.<init>()
        L_0x0041:
            hhd r9 = Y
            r9.K(r7, r6)
            boolean r6 = r9.m(r0, r6, r7)
            if (r6 == 0) goto L_0x0089
        L_0x004c:
            r9 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r4 = java.lang.Math.min(r4, r9)
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0080
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x0064
            r5 = r8
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            boolean r6 = r4 instanceof defpackage.z0
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0070
            java.lang.Object r0 = g(r4)
            return r0
        L_0x0070:
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.k(r7)
        L_0x007d:
            r6 = 0
            goto L_0x0098
        L_0x0080:
            r0.k(r7)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0089:
            i1 r6 = r0.c
            if (r6 != r15) goto L_0x0041
        L_0x008d:
            java.lang.Object r0 = r0.a
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = g(r0)
            return r0
        L_0x0097:
            r6 = r9
        L_0x0098:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c1
            java.lang.Object r4 = r0.a
            if (r4 == 0) goto L_0x00a2
            r5 = r8
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            boolean r6 = r4 instanceof defpackage.z0
            r6 = r6 ^ r8
            r5 = r5 & r6
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r0 = g(r4)
            return r0
        L_0x00ae:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x00bb
            long r4 = java.lang.System.nanoTime()
            long r4 = r11 - r4
            goto L_0x007d
        L_0x00bb:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00c1:
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
            if (r2 >= 0) goto L_0x014d
            java.lang.String r2 = " (plus "
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
            long r4 = -r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r3.convert(r4, r2)
            long r2 = r3.toNanos(r9)
            long r4 = r4 - r2
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x010c
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r16 = 0
            goto L_0x010e
        L_0x010c:
            r16 = r8
        L_0x010e:
            if (r2 <= 0) goto L_0x0131
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            r2.append(r11)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            if (r16 == 0) goto L_0x012d
            java.lang.String r2 = ","
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
        L_0x012d:
            java.lang.String r1 = defpackage.hr1.g(r1, r11)
        L_0x0131:
            if (r16 == 0) goto L_0x0147
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " nanoseconds "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0147:
            java.lang.String r2 = "delay)"
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
        L_0x014d:
            boolean r0 = r19.isDone()
            if (r0 == 0) goto L_0x015f
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " but future completed as timeout expired"
            java.lang.String r1 = defpackage.hr1.g(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = " for "
            java.lang.String r1 = me4.i(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x016b:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.a instanceof q0;
    }

    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof z0)) & (obj != null);
    }

    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(i1 i1Var) {
        i1Var.a = null;
        while (true) {
            i1 i1Var2 = this.c;
            if (i1Var2 != i1.c) {
                i1 i1Var3 = null;
                while (i1Var2 != null) {
                    i1 i1Var4 = i1Var2.b;
                    if (i1Var2.a != null) {
                        i1Var3 = i1Var2;
                    } else if (i1Var3 != null) {
                        i1Var3.b = i1Var4;
                        if (i1Var3.a == null) {
                        }
                    } else if (!Y.m(this, i1Var2, i1Var4)) {
                    }
                    i1Var2 = i1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = Z;
        }
        if (!Y.l(this, (Object) null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        if (!Y.l(this, (Object) null, new t0(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof z0) {
                sb.append(", setFuture=[");
                ch7 ch7 = ((z0) obj).b;
                if (ch7 == this) {
                    try {
                        sb.append("this future");
                    } catch (Exception | StackOverflowError e) {
                        sb.append("Exception thrown from implementation: ");
                        sb.append(e.getClass());
                    }
                } else {
                    sb.append(ch7);
                }
                sb.append("]");
            } else {
                try {
                    str = j();
                    if (str == null || str.isEmpty()) {
                        str = null;
                    }
                } catch (Exception | StackOverflowError e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) && (!(obj2 instanceof z0))) {
                return g(obj2);
            }
            i1 i1Var = this.c;
            i1 i1Var2 = i1.c;
            if (i1Var != i1Var2) {
                i1 i1Var3 = new i1();
                do {
                    hhd hhd = Y;
                    hhd.K(i1Var3, i1Var);
                    if (hhd.m(this, i1Var, i1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(i1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof z0))));
                        return g(obj);
                    }
                    i1Var = this.c;
                } while (i1Var != i1Var2);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
