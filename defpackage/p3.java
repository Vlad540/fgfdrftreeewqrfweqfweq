package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* renamed from: p3  reason: default package */
public abstract class p3 {
    public q3[] a;
    public int b;
    public int c;
    public e1e o;

    public final q3 e() {
        q3 q3Var;
        e1e e1e;
        synchronized (this) {
            try {
                q3[] q3VarArr = this.a;
                if (q3VarArr == null) {
                    q3VarArr = j();
                    this.a = q3VarArr;
                } else if (this.b >= q3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(q3VarArr, q3VarArr.length * 2);
                    this.a = (q3[]) copyOf;
                    q3VarArr = (q3[]) copyOf;
                }
                int i = this.c;
                do {
                    q3Var = q3VarArr[i];
                    if (q3Var == null) {
                        q3Var = h();
                        q3VarArr[i] = q3Var;
                    }
                    i++;
                    if (i >= q3VarArr.length) {
                        i = 0;
                    }
                } while (!q3Var.a(this));
                this.c = i;
                this.b++;
                e1e = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e1e != null) {
            e1e.y(1);
        }
        return q3Var;
    }

    public abstract q3 h();

    /* JADX WARNING: type inference failed for: r0v3, types: [hcd, e1e] */
    public final zqd i() {
        e1e e1e;
        synchronized (this) {
            e1e e1e2 = this.o;
            e1e = e1e2;
            if (e1e2 == null) {
                int i = this.b;
                ? hcd = new hcd(1, Integer.MAX_VALUE, 2);
                hcd.g(Integer.valueOf(i));
                this.o = hcd;
                e1e = hcd;
            }
        }
        return e1e;
    }

    public abstract q3[] j();

    public final void k(q3 q3Var) {
        e1e e1e;
        int i;
        Continuation[] b2;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                e1e = this.o;
                if (i2 == 0) {
                    this.c = 0;
                }
                b2 = q3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b2) {
            if (continuation != null) {
                continuation.resumeWith(jue.a);
            }
        }
        if (e1e != null) {
            e1e.y(-1);
        }
    }
}
