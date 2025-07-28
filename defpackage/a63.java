package defpackage;

import java.util.Map;

/* renamed from: a63  reason: default package */
public final class a63 extends m2 {
    public final Object a;
    public int b;
    public final /* synthetic */ b63 c;

    public a63(b63 b63, int i) {
        this.c = b63;
        Object obj = b63.y0;
        this.a = b63.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        b63 b63 = this.c;
        if (i != -1 && i < b63.size()) {
            if (am7.j(obj, b63.i()[this.b])) {
                return;
            }
        }
        Object obj2 = b63.y0;
        this.b = b63.d(obj);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        b63 b63 = this.c;
        Map b2 = b63.b();
        if (b2 != null) {
            return b2.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return b63.j()[i];
    }

    public final Object setValue(Object obj) {
        b63 b63 = this.c;
        Map b2 = b63.b();
        Object obj2 = this.a;
        if (b2 != null) {
            return b2.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            b63.put(obj2, obj);
            return null;
        }
        Object obj3 = b63.j()[i];
        b63.j()[this.b] = obj;
        return obj3;
    }
}
