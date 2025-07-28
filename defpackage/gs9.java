package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: gs9  reason: default package */
public final class gs9 extends kr0 {
    public LinkedList f;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, fs9] */
    public final void a(Object obj) {
        fs9 fs9 = (fs9) this.f.poll();
        fs9 fs92 = fs9;
        if (fs9 == null) {
            ? obj2 = new Object();
            obj2.a = null;
            obj2.b = null;
            obj2.c = null;
            fs92 = obj2;
        }
        fs92.a = new SoftReference(obj);
        fs92.b = new SoftReference(obj);
        fs92.c = new SoftReference(obj);
        this.c.add(fs92);
    }

    public final Object b() {
        fs9 fs9 = (fs9) this.c.poll();
        fs9.getClass();
        SoftReference softReference = fs9.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = fs9.a;
        if (softReference2 != null) {
            softReference2.clear();
            fs9.a = null;
        }
        SoftReference softReference3 = fs9.b;
        if (softReference3 != null) {
            softReference3.clear();
            fs9.b = null;
        }
        SoftReference softReference4 = fs9.c;
        if (softReference4 != null) {
            softReference4.clear();
            fs9.c = null;
        }
        this.f.add(fs9);
        return obj;
    }
}
