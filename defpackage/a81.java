package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: a81  reason: default package */
public final class a81 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d81 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a81(d81 d81, Continuation continuation) {
        super(2, continuation);
        this.Y = d81;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((a81) n((Long) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a81 a81 = new a81(this.Y, continuation);
        a81.X = obj;
        return a81;
    }

    public final Object o(Object obj) {
        Object value;
        String str;
        wx3.H(obj);
        Long l = (Long) this.X;
        d81 d81 = this.Y;
        grd grd = d81.Z;
        do {
            value = grd.getValue();
            String str2 = (String) value;
            if (l != null) {
                d81.o.getClass();
                str = rf0.h("· ", xk1.d(l));
            } else {
                str = null;
            }
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
        } while (!grd.b(value, str));
        return jue.a;
    }
}
