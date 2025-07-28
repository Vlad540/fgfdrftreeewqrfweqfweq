package defpackage;

import kotlinx.coroutines.internal.Segment;

/* renamed from: wvc  reason: default package */
public final class wvc {
    public final Object a;
    public final k26 b;
    public final k26 c;
    public final Object d;
    public final Object e;
    public final k26 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ yvc i;

    public wvc(yvc yvc, Object obj, k26 k26, k26 k262, Object obj2, l5e l5e, k26 k263) {
        this.i = yvc;
        this.a = obj;
        this.b = k26;
        this.c = k262;
        this.d = obj2;
        this.e = l5e;
        this.f = k263;
    }

    public final void a() {
        Object obj = this.g;
        aj4 aj4 = null;
        if (obj instanceof Segment) {
            ((Segment) obj).onCancellation(this.h, (Throwable) null, this.i.a);
            return;
        }
        if (obj instanceof aj4) {
            aj4 = (aj4) obj;
        }
        if (aj4 != null) {
            aj4.dispose();
        }
    }
}
