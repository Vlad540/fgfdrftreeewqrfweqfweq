package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xp7  reason: default package */
public final class xp7 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq7 b;

    public /* synthetic */ xp7(kq7 kq7, int i) {
        this.a = i;
        this.b = kq7;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object M = udd.M(new wp7(this.b, (List) obj, 0), continuation);
                return M == pu3.a ? M : jue.a;
            default:
                Object M2 = udd.M(new wp7(this.b, (List) obj, 1), continuation);
                return M2 == pu3.a ? M2 : jue.a;
        }
    }
}
