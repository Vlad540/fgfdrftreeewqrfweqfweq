package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* renamed from: gt7  reason: default package */
public abstract class gt7 {
    public int a;
    public int b;
    public int c;
    public Object o;

    public gt7() {
        if (dr9.Z == null) {
            dr9.Z = new dr9(18);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.o).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((ht7) this.o).w0 != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return c(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.o).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void f() {
        while (true) {
            int i = this.a;
            ht7 ht7 = (ht7) this.o;
            if (i < ht7.Y && ht7.c[i] < 0) {
                this.a = i + 1;
            } else {
                return;
            }
        }
    }

    public void g(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
        } else if (h(e(view), obj)) {
            WeakHashMap weakHashMap = eaf.a;
            View.AccessibilityDelegate a2 = z9f.a(view);
            b4 b4Var = a2 == null ? null : a2 instanceof a4 ? ((a4) a2).a : new b4(a2);
            if (b4Var == null) {
                b4Var = new b4();
            }
            eaf.j(view, b4Var);
            view.setTag(this.a, obj);
            eaf.e(view, this.c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((ht7) this.o).Y;
    }

    public void remove() {
        b();
        if (this.b != -1) {
            ht7 ht7 = (ht7) this.o;
            ht7.c();
            ht7.j(this.b);
            this.b = -1;
            this.c = ht7.w0;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }
}
