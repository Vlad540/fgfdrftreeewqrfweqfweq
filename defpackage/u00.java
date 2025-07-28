package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: u00  reason: default package */
public final class u00 {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public v00 a() {
        return new v00(this);
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        ArrayList arrayList;
        f25 f25 = (f25) this.e;
        if (!f25.a.isTerminated() && !f25.a.isShutdown()) {
            boolean z = true;
            if (((AtomicBoolean) this.c).compareAndSet(true, false)) {
                this.b = f25.c(f25.g(), this.a);
                try {
                    f25.execute((oc4) this.d);
                } catch (RejectedExecutionException unused) {
                }
            } else if (zp4.c(f25.g(), this.b) > 0) {
                this.b = zp4.b;
                oq7 oq7 = f25.Z;
                ReentrantReadWriteLock.ReadLock readLock = f25.w0.readLock();
                readLock.lock();
                try {
                    if (oq7.f != 0) {
                        z = false;
                    }
                    if (z) {
                        arrayList = hw4.a;
                    } else {
                        Object[] objArr = oq7.d;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : objArr) {
                            pef pef = obj instanceof pef ? (pef) obj : null;
                            if (pef != null) {
                                arrayList2.add(pef);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    readLock.unlock();
                    f25.b.d(arrayList);
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
        }
    }

    public qpf c(boolean z) {
        return z ? (kpf) ((r7e) this.e).getValue() : (jpf) ((r7e) this.d).getValue();
    }
}
