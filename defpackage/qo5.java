package defpackage;

import java.util.Iterator;

/* renamed from: qo5  reason: default package */
public final class qo5 extends ro5 {
    public final /* synthetic */ Iterable[] a;

    public qo5(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Iterator, java.lang.Object, w27] */
    public final Iterator iterator() {
        po5 po5 = new po5(this, this.a.length);
        ? obj = new Object();
        obj.b = v27.X;
        obj.c = po5;
        return obj;
    }
}
