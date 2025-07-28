package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* renamed from: z84  reason: default package */
public final class z84 implements dc7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ z84(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        switch (this.a) {
            case 0:
                int i = y84.$EnumSwitchMapping$0[nb7.ordinal()];
                x84 x84 = (x84) this.b;
                switch (i) {
                    case 1:
                        x84.getClass();
                        break;
                    case 2:
                        x84.onStart(nc7);
                        break;
                    case 3:
                        x84.onResume(nc7);
                        break;
                    case 4:
                        x84.onPause(nc7);
                        break;
                    case 5:
                        x84.onStop(nc7);
                        break;
                    case 6:
                        x84.onDestroy(nc7);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                dc7 dc7 = (dc7) this.c;
                if (dc7 != null) {
                    dc7.m(nc7, nb7);
                    return;
                }
                return;
            case 1:
                o88 o88 = (o88) this.c;
                if (!o88.X.Q()) {
                    nc7.R().f(this);
                    ey5 ey5 = (ey5) this.b;
                    if (((FrameLayout) ey5.a).isAttachedToWindow()) {
                        o88.H(ey5);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (nb7 == nb7.ON_DESTROY) {
                    ((Handler) this.b).removeCallbacks((Runnable) this.c);
                    nc7.R().f(this);
                    return;
                }
                return;
            case 3:
                if (nb7 == nb7.ON_START) {
                    ((pc7) this.b).f(this);
                    ((mm) this.c).g();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((yy2) this.c).a;
                Object obj = this.b;
                yy2.a((List) hashMap.get(nb7), nc7, nb7, obj);
                yy2.a((List) hashMap.get(nb7.ON_ANY), nc7, nb7, obj);
                return;
        }
    }

    public z84(Object obj) {
        this.a = 4;
        this.b = obj;
        az2 az2 = az2.c;
        Class<?> cls = obj.getClass();
        yy2 yy2 = (yy2) az2.a.get(cls);
        this.c = yy2 == null ? az2.a(cls, (Method[]) null) : yy2;
    }

    public z84(o88 o88, ey5 ey5) {
        this.a = 1;
        this.c = o88;
        this.b = ey5;
    }
}
