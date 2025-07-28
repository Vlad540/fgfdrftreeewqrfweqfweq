package defpackage;

import android.content.ContentResolver;
import java.util.concurrent.ExecutorService;

/* renamed from: e5b  reason: default package */
public final /* synthetic */ class e5b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5b b;

    public /* synthetic */ e5b(f5b f5b, int i) {
        this.a = i;
        this.b = f5b;
    }

    public final Object invoke() {
        f5b f5b = this.b;
        switch (this.a) {
            case 0:
                n06.s();
                return new v9((y4b) f5b.p.getValue(), 1);
            case 1:
                n06.s();
                return new v9((y4b) f5b.u.getValue(), 1);
            case 2:
                n06.s();
                return f5b.i((y4b) f5b.r.getValue());
            case 3:
                n06.s();
                v4b v4b = f5b.e;
                f5b.b.getClass();
                return new bie((y4b) f5b.r.getValue(), v4b, 0);
            case 4:
                n06.s();
                f5b.b.getClass();
                return new v9((y4b) f5b.p.getValue(), 2);
            case 5:
                n06.s();
                return f5b.k(f5b.c);
            case 6:
                n06.s();
                f5b.b.getClass();
                return new v9((y4b) f5b.t.getValue(), 2);
            case 7:
                n06.s();
                v4b v4b2 = f5b.e;
                b5b b5b = f5b.b;
                return new bie(f5b.l(new fz3(b5b.j.f(), b5b.k, 1)), v4b2, 0);
            case 8:
                n06.s();
                v4b v4b3 = f5b.e;
                b5b b5b2 = f5b.b;
                return new bie(f5b.l(new zj7(b5b2.j.f(), b5b2.k, b5b2.a, 0)), v4b3, 0);
            case 9:
                b5b b5b3 = f5b.b;
                fz3 fz3 = new fz3(b5b3.j.f(), b5b3.k, 1);
                b5b b5b4 = f5b.b;
                return f5b.j(fz3, new wie[]{new gk7(b5b4.j.i(), b5b4.k, b5b4.a)});
            case 10:
                b5b b5b5 = f5b.b;
                return f5b.h(new sl7(b5b5.j.f(), b5b5.a, 1));
            case 11:
                b5b b5b6 = f5b.b;
                ExecutorService f = b5b6.j.f();
                ContentResolver contentResolver = b5b6.a;
                qe4 qe4 = b5b6.k;
                zj7 zj7 = new zj7(f, qe4, contentResolver, 0);
                h25 h25 = b5b6.j;
                return f5b.j(zj7, new wie[]{new ak7(h25.f(), qe4, b5b6.a), new gk7(h25.i(), qe4, b5b6.a)});
            case 12:
                b5b b5b7 = f5b.b;
                return f5b.h(new sl7(b5b7.j.c(), b5b7.a, 0));
            case 13:
                b5b b5b8 = f5b.b;
                zj7 zj72 = new zj7(b5b8.j.f(), b5b8.k, b5b8.a, 1);
                b5b b5b9 = f5b.b;
                return f5b.j(zj72, new wie[]{new gk7(b5b9.j.i(), b5b9.k, b5b9.a)});
            case 14:
                b5b b5b10 = f5b.b;
                sj7 sj7 = new sj7(b5b10.j.f(), b5b10.k, b5b10.b, 1);
                b5b b5b11 = f5b.b;
                return f5b.j(sj7, new wie[]{new gk7(b5b11.j.i(), b5b11.k, b5b11.a)});
            case 15:
                b5b b5b12 = f5b.b;
                sj7 sj72 = new sj7(b5b12.j.f(), b5b12.k, b5b12.c, 0);
                b5b b5b13 = f5b.b;
                return f5b.j(sj72, new wie[]{new gk7(b5b13.j.i(), b5b13.k, b5b13.a)});
            case 16:
                b5b b5b14 = f5b.b;
                b5b14.getClass();
                return f5b.i(b5b14.b(new v9(new fz3(xn1.a, b5b14.k, 0), 0), true, f5b.h));
            default:
                n06.s();
                return new v9((y4b) f5b.t.getValue(), 1);
        }
    }
}
