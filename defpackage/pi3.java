package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pi3  reason: default package */
public final class pi3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pi3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sr4) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pi3 pi3 = new pi3(this.Y, continuation);
        pi3.X = obj;
        return pi3;
    }

    public final Object o(Object obj) {
        Object value;
        sr4 sr4;
        grd grd;
        Object value2;
        grd grd2;
        Object value3;
        wx3.H(obj);
        sr4 sr42 = (sr4) this.X;
        hj3 hj3 = this.Y;
        grd grd3 = hj3.j;
        do {
            value = grd3.getValue();
            sr4 = (sr4) value;
        } while (!grd3.b(value, sr4 != null ? sr4.c(sr4, (String) null, (r33) null, (String) null, (r33) null, (String) null, sr42.i, (fze) null, false, (Long) null, 7935) : null));
        boolean z = hj3.B.get();
        String str = sr42.a;
        sr4 sr43 = (sr4) hj3.i.getValue();
        x7b x7b = new x7b(str, sr42.b, sr42.c, sr42.d, sr43 != null && sr43.a((es4) hj3.j.getValue()), z, z ? 2 : 1);
        List a = hj3.f().a(hj3);
        do {
            grd = hj3.b;
            value2 = grd.getValue();
            x7b x7b2 = (x7b) value2;
        } while (!grd.b(value2, x7b));
        do {
            grd2 = hj3.c;
            value3 = grd2.getValue();
            List list = (List) value3;
        } while (!grd2.b(value3, a));
        return jue.a;
    }
}
