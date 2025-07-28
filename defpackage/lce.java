package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: lce  reason: default package */
public final class lce {
    public static final /* synthetic */ int b = 0;
    public final t97 a;

    public lce(t97 t97) {
        this.a = t97;
    }

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(Throwable th) {
        return (th instanceof TamErrorException) && iu7.F(((TamErrorException) th).a.b);
    }

    public static boolean d(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public final qv9 b() {
        jk0 jk0 = ((h3d) ((f3d) this.a.getValue())).e;
        kce kce = new kce(1);
        jk0.getClass();
        return new ps9(jk0, kce, 1).s(1);
    }
}
