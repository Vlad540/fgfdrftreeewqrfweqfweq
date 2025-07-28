package defpackage;

import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: ns0  reason: default package */
public final /* synthetic */ class ns0 implements k26 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ us0 b;
    public final /* synthetic */ zvc c;

    public /* synthetic */ ns0(Object obj, us0 us0, zvc zvc) {
        this.a = obj;
        this.b = us0;
        this.c = zvc;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        hu3 hu3 = (hu3) obj3;
        Symbol symbol = ws0.l;
        Object obj4 = this.a;
        if (obj4 != symbol) {
            OnUndeliveredElementKt.callUndeliveredElement(this.b.b, obj4, ((yvc) this.c).a);
        }
        return jue.a;
    }
}
