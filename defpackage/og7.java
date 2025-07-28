package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: og7  reason: default package */
public final class og7 implements ch7 {
    public final vn1 X = hwf.f(new mv4(17, this));
    public sn1 Y;
    public List a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger o;

    public og7(ArrayList arrayList, boolean z, mh4 mh4) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.o = new AtomicInteger(arrayList.size());
        c(new vp6(5, this), pa2.j());
        if (this.a.isEmpty()) {
            this.Y.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add((Object) null);
        }
        List list = this.a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ch7 ch7 = (ch7) list.get(i2);
            ch7.c(new fo((Object) this, i2, (Object) ch7, 3), mh4);
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        this.X.b.c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        List<ch7> list = this.a;
        if (list != null) {
            for (ch7 cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.X.cancel(z);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.X.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    public final boolean isDone() {
        return this.X.b.isDone();
    }

    public final Object get() {
        List<ch7> list = this.a;
        if (list != null && !isDone()) {
            loop0:
            for (ch7 ch7 : list) {
                while (true) {
                    if (!ch7.isDone()) {
                        try {
                            ch7.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.c) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.X.b.get();
    }
}
