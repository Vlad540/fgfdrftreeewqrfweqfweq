package defpackage;

import java.util.NoSuchElementException;

/* renamed from: xj0  reason: default package */
public final class xj0 {
    public final nu7[] a;

    public xj0(nu7[] nu7Arr) {
        this.a = nu7Arr;
    }

    public final Object a(nj0 nj0) {
        for (nu7 nu7 : this.a) {
            if (nu7.b == nj0) {
                Object obj = nu7.a;
                if (!(obj instanceof jl)) {
                    return obj;
                }
                return null;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
