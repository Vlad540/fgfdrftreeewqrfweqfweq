package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ig9  reason: default package */
public final class ig9 {
    public final n7a a;
    public final r94 b;
    public final ExecutorService c;
    public final String d;
    public volatile boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayList());
    public volatile Future g;

    public ig9(n7a n7a, r94 r94, ExecutorService executorService, String str, boolean z) {
        this.a = n7a;
        this.b = r94;
        this.c = executorService;
        this.d = str;
        this.e = z;
    }

    public final void a(jg9 jg9) {
        AtomicReference atomicReference;
        boolean z = false;
        loop0:
        while (true) {
            atomicReference = this.f;
            ArrayList arrayList = (ArrayList) atomicReference.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == jg9) {
                    z = true;
                    break;
                }
            }
            while (true) {
                if (atomicReference.compareAndSet(arrayList, arrayList2)) {
                    break loop0;
                } else if (atomicReference.get() != arrayList) {
                }
            }
        }
        if (!z) {
            while (true) {
                ArrayList arrayList3 = (ArrayList) atomicReference.get();
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList4.add(new WeakReference(jg9));
                while (true) {
                    if (!atomicReference.compareAndSet(arrayList3, arrayList4)) {
                        if (atomicReference.get() != arrayList3) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void b(mg9 mg9, jg9 jg9) {
        if (mg9 != null) {
            try {
                if (mg9.b.exists()) {
                    if (mg9.b.canRead()) {
                        jg9.onFinished(this.d, mg9.b, mg9.a);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        jg9.onFailed(cause);
                    }
                } else {
                    jg9.onFailed(th);
                }
                if (this.e) {
                    a(jg9);
                    d();
                    return;
                }
                return;
            }
        }
        if (this.e) {
            a(jg9);
            d();
        }
    }

    public final void c(File file, String str) {
        for (WeakReference weakReference : (Iterable) this.f.get()) {
            jg9 jg9 = (jg9) weakReference.get();
            if (jg9 != null) {
                jg9.onFinished(this.d, file, str);
            }
            weakReference.clear();
        }
    }

    public final void d() {
        Future future = this.g;
        if (future == null || future.isDone()) {
            this.g = this.c.submit(new m5(10, this));
        }
    }

    public final void e(jg9 jg9) {
        Future future;
        if (this.g == null || ((future = this.g) != null && !future.isDone())) {
            a(jg9);
        } else {
            this.c.execute(new hg9(this, 0, jg9));
        }
    }
}
