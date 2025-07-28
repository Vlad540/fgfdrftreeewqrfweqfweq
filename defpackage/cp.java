package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: cp  reason: default package */
public final /* synthetic */ class cp implements s16 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cp(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = 4;
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                fp fpVar = (fp) this.o;
                return new rm4((Context) this.c, (j2b) fpVar.l.getValue(), fpVar.a(), (o54) this.X, (t52) ((t97) this.b).getValue());
            case 1:
                j2b j2b = (j2b) ((g2b) this.c);
                return new r78((Context) i6b.a.getAccessor().c(Context.class), j2b.a, (hb2) this.o, (t97) this.b, (t97) this.X, j2b.e);
            case 2:
                return new ue5((File) this.c, (ve5) this.o, (we5) this.X, (e3) this.b);
            case 3:
                ym8 ym8 = (ym8) this.o;
                long j = ym8.a;
                to8 to8 = (to8) this.c;
                to8.A(j, ym8.c);
                bp8 bp8 = bp8.SENT;
                vo8 vo8 = (vo8) this.X;
                to8.x(vo8, bp8);
                pl plVar = ((p89) this.b).c;
                if (plVar == null) {
                    plVar = null;
                }
                to8.w(vo8, fu7.g(ym8.w0, (zpc) plVar.E.getValue()));
                return jue.a;
            default:
                return new s49((t97) this.b, (t97) this.c, (t97) this.o, (t97) this.X);
        }
    }

    public /* synthetic */ cp(g2b g2b, hb2 hb2, t97 t97, t97 t972) {
        this.a = 1;
        this.c = g2b;
        this.o = hb2;
        this.b = t97;
        this.X = t972;
    }

    public /* synthetic */ cp(Context context, fp fpVar, o54 o54, mtf mtf, t97 t97) {
        this.a = 0;
        this.c = context;
        this.o = fpVar;
        this.X = o54;
        this.b = t97;
    }

    public /* synthetic */ cp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = obj4;
    }
}
