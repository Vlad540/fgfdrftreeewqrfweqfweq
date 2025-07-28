package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: zef  reason: default package */
public final class zef implements xi4, yi4 {
    public final n83 a = new Object();
    public final HashSet b = new HashSet();

    public final synchronized boolean a(xi4 xi4) {
        boolean a2;
        WeakReference weakReference = new WeakReference(xi4);
        a2 = this.a.a(weakReference);
        if (a2) {
            this.b.add(weakReference);
        }
        return a2;
    }

    public final synchronized boolean b(xi4 xi4) {
        boolean z;
        z = false;
        try {
            n83 n83 = this.a;
            Objects.requireNonNull(n83);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aff aff = (aff) it.next();
                if (((xi4) aff.get()) == xi4) {
                    it.remove();
                    z = n83.b(aff);
                    break;
                }
            }
        } catch (Throwable th) {
            udd.s("zef", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized boolean c(xi4 xi4) {
        boolean z;
        z = false;
        try {
            n83 n83 = this.a;
            Objects.requireNonNull(n83);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aff aff = (aff) it.next();
                if (((xi4) aff.get()) == xi4) {
                    it.remove();
                    z = n83.c(aff);
                    break;
                }
            }
        } catch (Throwable th) {
            udd.s("zef", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized void d() {
        this.a.d();
        this.b.clear();
    }

    public final synchronized void f() {
        this.a.f();
        this.b.clear();
    }

    public final boolean h() {
        return this.a.b;
    }
}
