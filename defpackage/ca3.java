package defpackage;

import java.util.Map;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: ca3  reason: default package */
public final class ca3 implements Map.Entry, c77 {
    public final Object a;
    public final Object b;

    public ca3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        Symbol symbol = fa3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
