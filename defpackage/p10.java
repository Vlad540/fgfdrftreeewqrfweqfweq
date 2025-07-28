package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: p10  reason: default package */
public final class p10 {
    public List a;
    public vw6 b;
    public v9c c;

    public final void a(o10 o10) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(o10);
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final jj7 c() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return new jj7(this);
    }

    public final o10 d(int i) {
        if (i >= 0 && i < b()) {
            return (o10) this.a.get(i);
        }
        throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
    }

    public final void e(int i, o10 o10) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        this.a.set(i, o10);
    }
}
