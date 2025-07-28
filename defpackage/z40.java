package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: z40  reason: default package */
public final class z40 {
    public boolean a;
    public boolean b;
    public boolean c;

    public z40(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public a50 a() {
        if (this.a || (!this.b && !this.c)) {
            return new a50(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public void b(List list) {
        if ((this.a || this.b || this.c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((xc4) it.next()).a();
            }
        }
    }
}
