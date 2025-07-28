package defpackage;

import java.util.Locale;
import ru.ok.tamtam.nano.b;

/* renamed from: j2c  reason: default package */
public abstract class j2c {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [c2c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [wu4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, le4] */
    public static c2c a(f2c f2c, long j) {
        ? obj = new Object();
        r2c r2c = f2c.a;
        obj.b = r2c;
        obj.d = f2c.b;
        obj.c = j;
        int ordinal = r2c.ordinal();
        if (ordinal == 1) {
            ? obj2 = new Object();
            obj2.a = ((vu4) f2c).c;
            obj.f = obj2;
        } else if (ordinal == 2) {
            ? obj3 = new Object();
            obj3.a = ((utd) f2c).c;
            obj.e = obj3;
        } else if (ordinal == 3) {
            a10 a10 = ((c96) f2c).c;
            byte[] byteArray = gr8.toByteArray(b.n(a10));
            xw2 xw2 = new xw2(6);
            xw2.c = byteArray;
            xw2.b = a10.w0;
            obj.g = xw2;
        } else if (ordinal != 4) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + f2c.a);
        }
        return obj;
    }
}
