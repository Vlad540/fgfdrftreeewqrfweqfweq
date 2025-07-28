package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: da3  reason: default package */
public final class da3 extends t2 {
    public final i26 a;
    public final /* synthetic */ ea3 b;

    public da3(ea3 ea3, i26 i26) {
        this.b = ea3;
        this.a = i26;
    }

    public final boolean add(Object obj) {
        Symbol symbol = fa3.a;
        throw new UnsupportedOperationException("not implemented");
    }

    public final int getSize() {
        return this.b.size();
    }

    public final Iterator iterator() {
        ba3 ba3 = (ba3) ea3.c.get(this.b);
        ba3.getClass();
        return new aa3(ba3, this.a);
    }
}
