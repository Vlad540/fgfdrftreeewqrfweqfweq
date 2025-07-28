package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: tv1  reason: default package */
public final class tv1 extends uv1 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ itf c;
    public final /* synthetic */ String o;

    public tv1(itf itf, String str, boolean z) {
        this.c = itf;
        this.o = str;
        this.X = z;
    }

    public final void c() {
        itf itf = this.c;
        WorkDatabase workDatabase = itf.c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().k(this.o).iterator();
            while (it.hasNext()) {
                uv1.b(itf, (String) it.next());
            }
            workDatabase.r();
            workDatabase.l();
            if (this.X) {
                dnc.a(itf.b, itf.c, itf.e);
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}
