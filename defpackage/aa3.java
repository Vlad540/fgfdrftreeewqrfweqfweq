package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: aa3  reason: default package */
public final class aa3 implements Iterator, z67 {
    public final /* synthetic */ ba3 X;
    public final i26 a;
    public int b = -1;
    public Object c;
    public Object o;

    public aa3(ba3 ba3, i26 i26) {
        this.X = ba3;
        this.a = i26;
        a();
    }

    public final void a() {
        Object obj;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            ba3 ba3 = this.X;
            if (i < ba3.a) {
                qe6 qe6 = (qe6) ba3.d.get(i);
                if (!(qe6 == null || (obj = qe6.get()) == null)) {
                    this.c = obj;
                    Object obj2 = ba3.e.get(this.b);
                    if (obj2 instanceof wu7) {
                        obj2 = ((wu7) obj2).a;
                    }
                    if (obj2 != null) {
                        this.o = obj2;
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.X.a;
    }

    public final Object next() {
        if (this.b < this.X.a) {
            Object obj = this.c;
            Object obj2 = jue.a;
            if (obj == null) {
                obj = obj2;
            }
            Object obj3 = this.o;
            if (obj3 != null) {
                obj2 = obj3;
            }
            Object invoke = this.a.invoke(obj, obj2);
            a();
            return invoke;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        Symbol symbol = fa3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
