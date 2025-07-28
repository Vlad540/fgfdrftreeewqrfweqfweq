package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: wq1  reason: default package */
public final class wq1 extends ps1 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ wq1() {
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    ps1 ps1 = (ps1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(ps1)).execute(new n30(i, 4, ps1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void b(int i, ws1 ws1) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    ps1 ps1 = (ps1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(ps1)).execute(new wg1((Object) ps1, i, (Object) ws1, 2));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                ((sn1) this.b).b((Object) null);
                ((fu1) this.c).s(this);
                return;
        }
    }

    public void c(int i, bqc bqc) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    ps1 ps1 = (ps1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(ps1)).execute(new wg1((Object) ps1, i, (Object) bqc, 1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public wq1(sn1 sn1, fu1 fu1) {
        this.b = sn1;
        this.c = fu1;
    }
}
