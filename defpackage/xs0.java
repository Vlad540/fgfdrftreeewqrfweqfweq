package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xs0  reason: default package */
public final /* synthetic */ class xs0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ xs0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                if (!((AtomicBoolean) this.b).get()) {
                    ys0 ys0 = (ys0) this.c;
                    mod mod = ys0.g;
                    ov0 ov0 = (ov0) this.o;
                    ax4 A = mod.A((ngd) ov0);
                    Class<ys0> cls = ys0.class;
                    kk9 kk9 = ys0.f;
                    if (A != null) {
                        m75.d(cls, ov0.c(), "Found image for %s in staging area");
                        kk9.getClass();
                    } else {
                        m75.d(cls, ov0.c(), "Did not find image for %s in staging area");
                        kk9.getClass();
                        A = null;
                        jl8 e = ys0.e((ngd) ov0);
                        if (e == null) {
                            return A;
                        }
                        t54 o0 = e13.o0(e);
                        try {
                            ax4 ax4 = new ax4(o0);
                            e13.S(o0);
                            A = ax4;
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            e13.S(o0);
                            throw th;
                        }
                    }
                    if (Thread.interrupted()) {
                        if (m75.a.i(2)) {
                            m75.a.b(cls.getSimpleName());
                        }
                        A.close();
                        throw new InterruptedException();
                    }
                    return A;
                }
                throw new CancellationException();
            case 1:
                ae4 ae4 = (ae4) this.b;
                ae4.getClass();
                return ae4.a.submit(new dr1((Callable) this.c, 28, (c9) this.o));
            default:
                WorkDatabase workDatabase = ((t4b) this.b).X;
                duf z = workDatabase.z();
                String str = (String) this.o;
                ((ArrayList) this.c).addAll(z.m(str));
                return workDatabase.y().l(str);
        }
    }
}
