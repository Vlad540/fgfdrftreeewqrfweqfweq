package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* renamed from: ms0  reason: default package */
public final /* synthetic */ class ms0 implements k26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ms0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                OnUndeliveredElementKt.callUndeliveredElement((u16) this.b, this.c, (hu3) obj3);
                return jue.a;
            default:
                jue jue = (jue) obj2;
                hu3 hu3 = (hu3) obj3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tc9.h;
                sc9 sc9 = (sc9) this.c;
                Object obj4 = sc9.b;
                tc9 tc9 = (tc9) this.b;
                atomicReferenceFieldUpdater.set(tc9, obj4);
                tc9.e(sc9.b);
                return jue.a;
        }
    }
}
