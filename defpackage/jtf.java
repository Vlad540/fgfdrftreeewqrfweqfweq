package defpackage;

import java.util.Collections;

/* renamed from: jtf  reason: default package */
public final /* synthetic */ class jtf implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ jtf(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return wn6.i("worker_class_name LIKE '", (String) obj, "%'");
            default:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
        }
    }
}
