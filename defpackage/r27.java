package defpackage;

import java.util.Iterator;

/* renamed from: r27  reason: default package */
public final class r27 implements Iterable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r27(Iterable iterable, Object obj, int i) {
        this.a = i;
        this.b = iterable;
        this.c = obj;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new q27(this, this.b.iterator());
            default:
                return new s27(this, this.b.iterator());
        }
    }
}
