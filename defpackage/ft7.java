package defpackage;

import java.util.Map;

/* renamed from: ft7  reason: default package */
public final class ft7 implements Map.Entry, c77 {
    public final ht7 a;
    public final int b;

    public ft7(int i, ht7 ht7) {
        this.a = ht7;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return hhd.f(entry.getKey(), getKey()) && hhd.f(entry.getValue(), getValue());
        }
    }

    public final Object getKey() {
        return this.a.a[this.b];
    }

    public final Object getValue() {
        return this.a.b[this.b];
    }

    public final int hashCode() {
        Object key = getKey();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        ht7 ht7 = this.a;
        ht7.c();
        Object[] objArr = ht7.b;
        if (objArr == null) {
            int length = ht7.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                ht7.b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
