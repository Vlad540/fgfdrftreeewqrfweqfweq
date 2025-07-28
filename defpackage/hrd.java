package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: hrd  reason: default package */
public abstract class hrd {
    public static final Symbol a = new Symbol("NONE");
    public static final Symbol b = new Symbol("PENDING");

    public static final grd a(Object obj) {
        if (obj == null) {
            obj = wr9.a;
        }
        return new grd(obj);
    }
}
