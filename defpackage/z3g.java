package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: z3g  reason: default package */
public final class z3g implements s5g, tx9, kx9, gx9 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object o;

    public z3g(Executor executor, gx9 gx9) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.o = gx9;
    }

    public void a(Object obj) {
        ((n6g) this.o).n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                if (((n6g) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((gx9) this.o) != null) {
                                this.b.execute(new lde(18, (Object) this));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 1:
                synchronized (this.c) {
                    try {
                        if (((hx9) this.o) != null) {
                            this.b.execute(new mzf((s5g) this, task, 3));
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
            case 2:
                if (!task.h() && !((n6g) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((kx9) this.o) != null) {
                                this.b.execute(new c4g(this, task));
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 3:
                if (task.h()) {
                    synchronized (this.c) {
                        try {
                            if (((tx9) this.o) != null) {
                                this.b.execute(new mzf((s5g) this, task, 4));
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            while (true) {
                                throw th4;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            default:
                this.b.execute(new mzf((s5g) this, task, 5));
                return;
        }
    }

    public void d() {
        ((n6g) this.o).o();
    }

    public void onFailure(Exception exc) {
        ((n6g) this.o).m(exc);
    }

    public z3g(Executor executor, hx9 hx9) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.o = hx9;
    }

    public z3g(Executor executor, kx9 kx9) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.o = kx9;
    }

    public z3g(Executor executor, tx9 tx9) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.o = tx9;
    }

    public z3g(Executor executor, y1e y1e, n6g n6g) {
        this.a = 4;
        this.b = executor;
        this.c = y1e;
        this.o = n6g;
    }
}
