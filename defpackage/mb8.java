package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: mb8  reason: default package */
public abstract class mb8 extends nb8 {
    public final Object a = new Object();
    public Executor b;
    public ea6 c;
    public ta8 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(ta8 ta8, ArrayList arrayList) {
        if (ta8 != null) {
            synchronized (this.a) {
                try {
                    Executor executor = this.b;
                    if (executor != null) {
                        executor.execute(new kb8(this, this.c, ta8, arrayList, 1));
                    } else {
                        this.d = ta8;
                        this.e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
