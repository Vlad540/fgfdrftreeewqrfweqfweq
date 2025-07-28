package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: uqe  reason: default package */
public final class uqe implements Iterator, z67 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public uqe(u1 u1Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = u1Var;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                return ((vqe) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                View view = (View) next;
                u1 u1Var = null;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    u1Var = new u1(4, viewGroup);
                }
                ArrayList arrayList = (ArrayList) this.c;
                if (u1Var == null || !u1Var.hasNext()) {
                    while (!this.b.hasNext() && (!arrayList.isEmpty())) {
                        this.b = (Iterator) o23.e0(arrayList);
                        u23.O(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = u1Var;
                }
                return next;
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public uqe(vqe vqe) {
        this.a = 0;
        this.c = vqe;
        this.b = vqe.a.iterator();
    }
}
