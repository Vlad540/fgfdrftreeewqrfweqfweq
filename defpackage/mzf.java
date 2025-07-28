package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* renamed from: mzf  reason: default package */
public final /* synthetic */ class mzf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mzf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jh7 jh7 = (jh7) this.c;
                Object obj = ((lt4) this.b).b;
                if (obj == null) {
                    jh7.getClass();
                    return;
                }
                try {
                    jh7.a(obj);
                    return;
                } catch (RuntimeException e) {
                    jh7.getClass();
                    throw e;
                }
            case 1:
                if (((n6g) ((Task) this.b)).d) {
                    ((i2g) this.c).o.o();
                    return;
                }
                try {
                    ((i2g) this.c).o.n(((i2g) this.c).c.l((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e2) {
                    if (e2.getCause() instanceof Exception) {
                        ((i2g) this.c).o.m((Exception) e2.getCause());
                        return;
                    } else {
                        ((i2g) this.c).o.m(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((i2g) this.c).o.m(e3);
                    return;
                }
            case 2:
                w4g w4g = (w4g) this.b;
                Context context = (Context) w4g.b;
                String string = w4g.y(context).getString("app_set_id", (String) null);
                long j = -1;
                long j2 = w4g.y((Context) w4g.b).getLong("app_set_id_last_used_time", -1);
                if (j2 != -1) {
                    j = 33696000000L + j2;
                }
                vde vde = (vde) this.c;
                if (string == null || System.currentTimeMillis() > j) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            if (valueOf.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(valueOf);
                            }
                            throw new Exception("Failed to store the app set ID.");
                        }
                        w4g.z(context);
                        SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                        if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            if (valueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(valueOf2);
                            }
                            throw new Exception("Failed to store the app set ID creation time.");
                        }
                    } catch (q4g e4) {
                        vde.a(e4);
                        return;
                    }
                } else {
                    try {
                        w4g.z(context);
                    } catch (q4g e5) {
                        vde.a(e5);
                        return;
                    }
                }
                vde.b(new np(string, 1));
                return;
            case 3:
                synchronized (((z3g) this.c).c) {
                    try {
                        hx9 hx9 = (hx9) ((z3g) this.c).o;
                        if (hx9 != null) {
                            hx9.l((Task) this.b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                synchronized (((z3g) this.c).c) {
                    try {
                        tx9 tx9 = (tx9) ((z3g) this.c).o;
                        if (tx9 != null) {
                            tx9.a(((Task) this.b).f());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                z3g z3g = (z3g) this.c;
                try {
                    n6g o = ((y1e) z3g.c).o(((Task) this.b).f());
                    mh4 mh4 = cee.b;
                    o.d(mh4, z3g);
                    o.c(mh4, z3g);
                    o.a(mh4, z3g);
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        z3g.onFailure((Exception) e6.getCause());
                        return;
                    } else {
                        z3g.onFailure(e6);
                        return;
                    }
                } catch (CancellationException unused) {
                    z3g.d();
                    return;
                } catch (Exception e7) {
                    z3g.onFailure(e7);
                    return;
                }
        }
    }

    public /* synthetic */ mzf(s5g s5g, Task task, int i) {
        this.a = i;
        this.c = s5g;
        this.b = task;
    }
}
