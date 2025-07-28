package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i3c  reason: default package */
public final class i3c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y3c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i3c(y3c y3c, Continuation continuation) {
        super(2, continuation);
        this.Y = y3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((p3c) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i3c i3c = new i3c(this.Y, continuation);
        i3c.X = obj;
        return i3c;
    }

    public final Object o(Object obj) {
        Object value;
        grd grd;
        Object value2;
        grd grd2;
        Object value3;
        wx3.H(obj);
        p3c p3c = (p3c) this.X;
        y3c y3c = this.Y;
        h3c h3c = y3c.c;
        boolean z = (p3c instanceof n3c) || (p3c instanceof m3c);
        grd grd3 = h3c.o;
        do {
            value = grd3.getValue();
            ((Boolean) value).getClass();
        } while (!grd3.b(value, Boolean.valueOf(z)));
        boolean w = y3c.w();
        do {
            grd = h3c.Y;
            value2 = grd.getValue();
            ((Boolean) value2).getClass();
        } while (!grd.b(value2, Boolean.valueOf(w)));
        if (y3c.b == z2c.a) {
            boolean z2 = !(p3c instanceof o3c);
            do {
                grd2 = h3c.Z;
                value3 = grd2.getValue();
                ((Boolean) value3).getClass();
            } while (!grd2.b(value3, Boolean.valueOf(z2)));
        }
        return jue.a;
    }
}
