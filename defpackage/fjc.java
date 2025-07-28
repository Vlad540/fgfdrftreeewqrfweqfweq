package defpackage;

import java.util.Map;

/* renamed from: fjc  reason: default package */
public final class fjc implements Map.Entry {
    public final Object a;
    public final Object b;
    public fjc c;
    public fjc o;

    public fjc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjc)) {
            return false;
        }
        fjc fjc = (fjc) obj;
        return this.a.equals(fjc.a) && this.b.equals(fjc.b);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
