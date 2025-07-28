package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: adc  reason: default package */
public final class adc extends r2 {
    public final List a;

    public adc(List list) {
        this.a = list;
    }

    public final Object a(int i) {
        return this.a.remove(o23.P(i, this));
    }

    public final void add(int i, Object obj) {
        this.a.add(o23.Q(i, this), obj);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object get(int i) {
        return this.a.get(o23.P(i, this));
    }

    public final int getSize() {
        return this.a.size();
    }

    public final Iterator iterator() {
        return new zcc(this, 0);
    }

    public final ListIterator listIterator() {
        return new zcc(this, 0);
    }

    public final Object set(int i, Object obj) {
        return this.a.set(o23.P(i, this), obj);
    }

    public final ListIterator listIterator(int i) {
        return new zcc(this, i);
    }
}
