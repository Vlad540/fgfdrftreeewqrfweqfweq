package defpackage;

import java.util.LinkedList;
import java.util.Locale;

/* renamed from: kr0  reason: default package */
public class kr0 {
    public final int a;
    public final int b;
    public final LinkedList c;
    public final boolean d;
    public int e;

    public kr0(int i, int i2, int i3) {
        boolean z = true;
        ez3.o(i > 0);
        ez3.o(i2 >= 0);
        ez3.o(i3 < 0 ? false : z);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.e = i3;
        this.d = false;
    }

    public void a(Object obj) {
        this.c.add(obj);
    }

    public Object b() {
        return this.c.poll();
    }

    public final void c(Object obj) {
        obj.getClass();
        if (this.d) {
            ez3.o(this.e > 0);
            this.e--;
            a(obj);
            return;
        }
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
            a(obj);
            return;
        }
        Object[] objArr = {obj};
        if (m75.a.i(6)) {
            m75.a.e("BUCKET", String.format((Locale) null, "Tried to release value %s from an empty bucket!", objArr));
        }
    }
}
