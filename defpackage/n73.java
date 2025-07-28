package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: n73  reason: default package */
public final class n73 extends ms9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void q(bw9 bw9) {
        switch (this.a) {
            case 0:
                ((v63) this.b).i(new eu9(bw9));
                return;
            case 1:
                ((ay7) this.b).a(new dy7(bw9, 0));
                return;
            case 2:
                at9 at9 = new at9(bw9);
                bw9.d(at9);
                try {
                    ((ou9) this.b).d(at9);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    if (!at9.e(th)) {
                        xs7.F(th);
                        return;
                    }
                    return;
                }
            case 3:
                Object[] objArr = (Object[]) this.b;
                cu9 cu9 = new cu9(bw9, objArr);
                bw9.d(cu9);
                if (!cu9.o) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length && !cu9.X) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            cu9.a.onError(new NullPointerException(rf0.f(i, "The element at index ", " is null")));
                            return;
                        } else {
                            cu9.a.c(obj);
                            i++;
                        }
                    }
                    if (!cu9.X) {
                        cu9.a.b();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                try {
                    Iterator it = ((Iterable) this.b).iterator();
                    try {
                        if (!it.hasNext()) {
                            cw4.a(bw9);
                            return;
                        }
                        fu9 fu9 = new fu9(bw9, it);
                        bw9.d(fu9);
                        if (!fu9.o) {
                            while (!fu9.c) {
                                try {
                                    Object next = fu9.b.next();
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    fu9.a.c(next);
                                    if (!fu9.c) {
                                        try {
                                            if (!fu9.b.hasNext()) {
                                                if (!fu9.c) {
                                                    fu9.a.b();
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th2) {
                                            ek8.a0(th2);
                                            fu9.a.onError(th2);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    ek8.a0(th3);
                                    fu9.a.onError(th3);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        ek8.a0(th4);
                        cw4.b(th4, bw9);
                        return;
                    }
                } catch (Throwable th5) {
                    ek8.a0(th5);
                    cw4.b(th5, bw9);
                    return;
                }
            case 5:
                ((bjb) this.b).f(new gu9(bw9));
                return;
            case 6:
                ((dhd) this.b).k(new dy7(bw9, 1));
                return;
            default:
                if (!hhd.f(Looper.myLooper(), Looper.getMainLooper())) {
                    bw9.d(new a7(1, z3d.h));
                    bw9.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
                    return;
                }
                View view = (View) this.b;
                n9f n9f = new n9f(view, bw9);
                bw9.d(n9f);
                view.setOnClickListener(n9f);
                return;
        }
    }
}
