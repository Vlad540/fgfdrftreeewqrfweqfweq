package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: oy1  reason: default package */
public final class oy1 extends j36 implements Runnable {
    public final CountDownLatch X = new CountDownLatch(1);
    public ch7 Y;
    public volatile ch7 Z;
    public au c;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue(1);

    public oy1(au auVar, ch7 ch7) {
        this.c = auVar;
        ch7.getClass();
        this.Y = ch7;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
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
        return take;
    }

    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.o.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ch7 ch7 = this.Y;
        if (ch7 != null) {
            ch7.cancel(z);
        }
        ch7 ch72 = this.Z;
        if (ch72 != null) {
            ch72.cancel(z);
        }
        return true;
    }

    public final Object get() {
        if (!this.a.isDone()) {
            ch7 ch7 = this.Y;
            if (ch7 != null) {
                ch7.get();
            }
            this.X.await();
            ch7 ch72 = this.Z;
            if (ch72 != null) {
                ch72.get();
            }
        }
        return this.a.get();
    }

    public final void run() {
        try {
            try {
                ch7 apply = this.c.apply(ct0.s(this.Y));
                this.Z = apply;
                if (this.a.isCancelled()) {
                    apply.cancel(((Boolean) b(this.o)).booleanValue());
                    this.Z = null;
                    this.c = null;
                    this.Y = null;
                    this.X.countDown();
                    return;
                }
                apply.c(new p36((Object) this, (Object) apply, false, 3), pa2.j());
                this.c = null;
                this.Y = null;
                this.X.countDown();
            } catch (UndeclaredThrowableException e) {
                Throwable cause = e.getCause();
                sn1 sn1 = this.b;
                if (sn1 != null) {
                    sn1.d(cause);
                }
            } catch (Exception e2) {
                sn1 sn12 = this.b;
                if (sn12 != null) {
                    sn12.d(e2);
                }
            } catch (Error e3) {
                sn1 sn13 = this.b;
                if (sn13 != null) {
                    sn13.d(e3);
                }
            } catch (Throwable th) {
                this.c = null;
                this.Y = null;
                this.X.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            Throwable cause2 = e4.getCause();
            sn1 sn14 = this.b;
            if (sn14 != null) {
                sn14.d(cause2);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ch7 ch7 = this.Y;
            if (ch7 != null) {
                long nanoTime = System.nanoTime();
                ch7.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.X.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                ch7 ch72 = this.Z;
                if (ch72 != null) {
                    ch72.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
