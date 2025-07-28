package defpackage;

import java.lang.reflect.Method;

/* renamed from: zy2  reason: default package */
public final class zy2 {
    public final int a;
    public final Method b;

    public zy2(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2)) {
            return false;
        }
        zy2 zy2 = (zy2) obj;
        return this.a == zy2.a && this.b.getName().equals(zy2.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
