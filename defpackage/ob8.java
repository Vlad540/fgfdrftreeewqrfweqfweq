package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: ob8  reason: default package */
public abstract class ob8 {
    public va8 X;
    public boolean Y;
    public pb8 Z;
    public final Context a;
    public final lv1 b;
    public final fx c = new fx(11, (Object) this);
    public e3 o;
    public boolean w0;

    public ob8(Context context, lv1 lv1) {
        if (context != null) {
            this.a = context;
            if (lv1 == null) {
                this.b = new lv1(22, new ComponentName(context, getClass()));
            } else {
                this.b = lv1;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public mb8 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract nb8 d(String str);

    public nb8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return d(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public abstract void f(va8 va8);

    public final void g(pb8 pb8) {
        yb8.b();
        if (this.Z != pb8) {
            this.Z = pb8;
            if (!this.w0) {
                this.w0 = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public final void h(va8 va8) {
        yb8.b();
        if (!Objects.equals(this.X, va8)) {
            this.X = va8;
            if (!this.Y) {
                this.Y = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }
}
