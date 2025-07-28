package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: mna  reason: default package */
public final class mna {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final pna d;
    public final pna e;
    public final pna f;
    public final pna g;
    public final pna h;
    public final pna i;
    public final pna j;

    public mna(t97 t97, t97 t972, t97 t973, pae pae) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        ContextScope a2 = n1g.a(((n3a) pae).b());
        pna pna = new pna(qna.k);
        this.d = pna;
        pna pna2 = new pna(qna.f);
        this.e = pna2;
        pna pna3 = new pna(qna.m);
        this.f = pna3;
        pna pna4 = new pna(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.g = pna4;
        pna pna5 = new pna(qna.l);
        this.h = pna5;
        pna pna6 = new pna(qna.h);
        this.i = pna6;
        pna pna7 = new pna(qna.j);
        this.j = pna7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            ez3.N(new ck5(pna, new gna(this, (Continuation) null), 5), a2);
        }
        ez3.N(new ck5(pna2, new hna(this, (Continuation) null), 5), a2);
        if (i2 >= 34) {
            ez3.N(new v11(pna3, pna4, new c3(this, (Continuation) null, 20), 4), a2);
        } else {
            ez3.N(new ck5(pna3, new ina(this, (Continuation) null), 5), a2);
        }
        ez3.N(new ck5(pna5, new jna(this, (Continuation) null), 5), a2);
        ez3.N(new ck5(pna6, new kna(this, (Continuation) null), 5), a2);
        ez3.N(new ck5(pna7, new lna(this, (Continuation) null), 5), a2);
    }

    public static final void a(mna mna, String str, String str2) {
        Integer d2 = ((xg9) mna.c.getValue()).d();
        if (d2 != null) {
            ht7 ht7 = new ht7();
            ht7.put("pType", str);
            ht7.put("screen", d2);
            ht7.put("pStatus", str2);
            mna.d("permission_changed_state", ht7.b());
        }
    }

    public static final String b(mna mna, nna nna) {
        mna.getClass();
        return nna == nna.a ? "allowed" : "denied";
    }

    public static String c(pna pna) {
        return pna.h() ? "allowed" : "denied";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a07, java.lang.Object] */
    public final void d(String str, ht7 ht7) {
        ? obj = new Object();
        obj.c = "PERMISSION";
        t97 t97 = this.b;
        obj.b = ((lqc) ((f03) t97.getValue())).s();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.c(ht7);
        obj.X = ((i03) ((f03) t97.getValue())).D();
        ((bd) this.a.getValue()).j(obj.d());
    }
}
