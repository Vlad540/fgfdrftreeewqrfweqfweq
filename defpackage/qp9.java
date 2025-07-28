package defpackage;

import android.content.Context;

/* renamed from: qp9  reason: default package */
public final class qp9 {
    public final w6a a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;

    public qp9(w6a w6a, nj4 nj4, nj4 nj42, nj4 nj43) {
        this.a = w6a;
        this.b = nj4;
        this.c = nj42;
        this.d = nj43;
    }

    public final ns8 a(Context context, xm8 xm8, i22 i22) {
        xm8 xm82 = xm8;
        vo8 vo8 = xm82.a;
        String str = vo8.w0;
        boolean v = vo8.v();
        nj4 nj4 = this.c;
        if (v) {
            nj4 nj42 = this.b;
            boolean G = i22.G();
            tf3 i = ((di3) nj42.get()).i(vo8.Y, true);
            long s = ((lqc) ((f03) nj4.get())).s();
            Context context2 = context;
            str = dhe.k(context2, this.a, (di3) nj42.get(), G, xm82.a, i, true, true, s).toString();
        } else if (str == null || str.length() == 0) {
            Context context3 = context;
            str = ((dhe) this.d.get()).f(context3, this.a, xm82.a, true, false, true, false, ((lqc) ((f03) nj4.get())).s(), true);
        } else {
            this.a.getClass();
            vo8.B();
        }
        if (vo8.o()) {
            str = context.getString(avb.tt_forwarded_message_patten, new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        return new ns8(str, true, 0);
    }
}
