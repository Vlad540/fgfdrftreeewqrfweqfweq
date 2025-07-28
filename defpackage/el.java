package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: el  reason: default package */
public final class el {
    public final ArrayList a = new ArrayList();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(dl dlVar) {
        this.a.add(dlVar);
        this.b &= dlVar.a();
        this.c |= dlVar.c();
        this.d |= !dlVar.b();
        this.e = dlVar.b() | this.e;
    }

    public final void b(String str, String str2) {
        a(new f0e(str, str2));
    }

    public final void c(t67 t67) {
        if (this.d) {
            ArrayList arrayList = this.a;
            if (arrayList.size() > 1) {
                t23.J(arrayList, new zo4(8));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dl dlVar = (dl) it.next();
                if (!dlVar.b()) {
                    dlVar.d(t67);
                }
            }
        }
    }

    public final void d(t67 t67) {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                dl dlVar = (dl) it.next();
                if (dlVar.b()) {
                    dlVar.d(t67);
                }
            }
        }
    }
}
