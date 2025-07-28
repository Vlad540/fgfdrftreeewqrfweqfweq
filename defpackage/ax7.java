package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: ax7  reason: default package */
public abstract class ax7 implements ay7 {
    public static px7 e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new px7(obj);
    }

    public final void a(wx7 wx7) {
        Objects.requireNonNull(wx7, "observer is null");
        try {
            g(wx7);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, wx7, io0] */
    public final Object b() {
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        return countDownLatch.c();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.CountDownLatch, wx7, io0] */
    public final Object d(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        ? countDownLatch = new CountDownLatch(1);
        a(countDownLatch);
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                countDownLatch.o = true;
                xi4 xi4 = countDownLatch.c;
                if (xi4 != null) {
                    xi4.f();
                }
                throw i15.f(e);
            }
        }
        Throwable th = countDownLatch.b;
        if (th == null) {
            Object obj2 = countDownLatch.a;
            return obj2 != null ? obj2 : obj;
        }
        throw i15.f(th);
    }

    public final vx7 f(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new vx7(this, qmc, 0);
    }

    public abstract void g(wx7 wx7);

    public final vx7 h(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new vx7(this, qmc, 1);
    }
}
