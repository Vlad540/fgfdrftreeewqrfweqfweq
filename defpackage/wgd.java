package defpackage;

import javax.inject.Provider;

/* renamed from: wgd  reason: default package */
public final class wgd implements Provider {
    public final Object a;

    public wgd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgd) && hhd.f(this.a, ((wgd) obj).a);
    }

    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ')';
    }
}
