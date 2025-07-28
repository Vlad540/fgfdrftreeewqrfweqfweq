package defpackage;

import java.util.Locale;

/* renamed from: g3f  reason: default package */
public final /* synthetic */ class g3f implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3f b;

    public /* synthetic */ g3f(a3f a3f, int i) {
        this.a = i;
        this.b = a3f;
    }

    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        udd.s("j3f", "removeFromRepository: failed conversionData = " + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                e3f e3f = (e3f) obj;
                a3f a3f = this.b;
                String str = a3f.a;
                f3f f3f = a3f.b;
                qjb qjb = f3f.a;
                e3f.getClass();
                pec a2 = pec.a(5, "SELECT * FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?");
                if (str == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str);
                }
                a2.j(2, (long) qjb.b);
                a2.h(3, (double) f3f.b);
                a2.h(4, (double) f3f.c);
                a2.j(5, f3f.d ? 1 : 0);
                return new ox7(new auf(e3f, a2, 1));
            default:
                e3f e3f2 = (e3f) obj;
                a3f a3f2 = this.b;
                String str2 = a3f2.a;
                f3f f3f2 = a3f2.b;
                qjb qjb2 = f3f2.a;
                e3f2.getClass();
                return new y63(2, new d3f(e3f2, str2, qjb2, f3f2.b, f3f2.c, f3f2.d));
        }
    }
}
