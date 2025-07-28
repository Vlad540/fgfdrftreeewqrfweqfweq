package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zr4  reason: default package */
public final class zr4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bs4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr4(bs4 bs4, Continuation continuation) {
        super(2, continuation);
        this.Y = bs4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((es4) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zr4 zr4 = new zr4(this.Y, continuation);
        zr4.X = obj;
        return zr4;
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        x7b x7b;
        grd grd2;
        Object value2;
        wx3.H(obj);
        es4 es4 = (es4) this.X;
        bs4 bs4 = this.Y;
        es4 es42 = (es4) bs4.i.getValue();
        boolean z = false;
        boolean z2 = es42 != null && es42.a(es4);
        es4 es43 = bs4.k;
        if (es43 != null && es43.b(es4)) {
            z = true;
        }
        bs4.k = es4;
        do {
            grd = bs4.b;
            value = grd.getValue();
            x7b x7b2 = (x7b) value;
            x7b x7b3 = (x7b) grd.getValue();
            x7b = null;
            if (x7b3 != null) {
                x7b = x7b.a(x7b3, (String) null, z2, 111);
            }
        } while (!grd.b(value, x7b));
        if (z) {
            do {
                grd2 = bs4.c;
                value2 = grd2.getValue();
                List list = (List) value2;
            } while (!grd2.b(value2, bs4.f().a(bs4)));
        }
        return jue.a;
    }
}
