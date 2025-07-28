package defpackage;

import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* renamed from: nl0  reason: default package */
public final class nl0 implements n0c, t97 {
    public WeakReference X;
    public final ml0 Y;
    public final u16 a;
    public final i26 b;
    public final u16 c;
    public Object o;

    public nl0(rr3 rr3, u16 u16, i26 i26, u16 u162) {
        this.a = u16;
        this.b = i26;
        this.c = u162;
        this.Y = new ml0(this, rr3);
    }

    public final Object T0(Object obj, k77 k77) {
        Widget widget = (Widget) obj;
        return getValue();
    }

    public final boolean a() {
        return this.o != null;
    }

    public final Object getValue() {
        Object obj = this.o;
        if (obj == null) {
            WeakReference weakReference = this.X;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object invoke = this.a.invoke(obj);
            this.o = invoke;
            ml0 ml0 = this.Y;
            ml0.a = false;
            i26 i26 = this.b;
            if (i26 != null) {
                i26.invoke(invoke, ml0);
            }
            return invoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException(th, 1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl0(rr3 rr3, u16 u16, i26 i26, int i) {
        this(rr3, u16, (i & 4) != 0 ? null : i26, (u16) new o8(14));
    }
}
