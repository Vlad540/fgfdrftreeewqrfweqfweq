package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: vl  reason: default package */
public final class vl extends ContextWrapper implements ug, the {
    public static vl o;
    public final Application a;
    public final t97 b;
    public final t97 c;

    public vl(Application application, t97 t97, r7e r7e, q0a q0a) {
        super(application);
        at7.y0 = q0a;
        this.b = t97;
        this.a = application;
        this.c = r7e;
        o = this;
    }

    public static k93 b() {
        return (k93) o.c.getValue();
    }

    public final j2b a() {
        return (j2b) this.b.getValue();
    }

    public final Context getBaseContext() {
        return this.a.getBaseContext();
    }

    public final wce t() {
        return ((xce) b().getAccessor().c(xce.class)).c();
    }
}
