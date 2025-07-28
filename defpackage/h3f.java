package defpackage;

import java.util.Locale;

/* renamed from: h3f  reason: default package */
public final /* synthetic */ class h3f implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2f b;

    public /* synthetic */ h3f(z2f z2f, int i) {
        this.a = i;
        this.b = z2f;
    }

    public void accept(Object obj) {
        z2f z2f = this.b;
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                Locale locale = Locale.ENGLISH;
                udd.s("j3f", "putConversionInRepository: failed, videoConversion=" + z2f, th);
                return;
            default:
                zl3.j(z2f.d);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [c3f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [b3f, java.lang.Object] */
    public Object apply(Object obj) {
        e3f e3f = (e3f) obj;
        z2f z2f = this.b;
        b3f b3f = null;
        if (z2f != null) {
            ? obj2 = new Object();
            a3f a3f = z2f.a;
            if (a3f != null) {
                ? obj3 = new Object();
                obj3.a = a3f.a;
                f3f f3f = a3f.b;
                obj3.b = f3f.a;
                obj3.c = f3f.b;
                obj3.d = f3f.c;
                obj3.e = f3f.d;
                b3f = obj3;
            }
            obj2.a = b3f;
            obj2.c = z2f.c;
            obj2.d = z2f.d;
            obj2.b = z2f.b;
            b3f = obj2;
        }
        e3f.getClass();
        return new y63(2, new uh(e3f, 28, b3f));
    }
}
