package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

/* renamed from: o57  reason: default package */
public abstract class o57 {
    public int a;
    public final Object b;
    public final Object c;

    public o57(String str, int i, p57 p57) {
        this.b = str;
        this.a = i;
        this.c = p57;
    }

    public static o57 b(a aVar, int i) {
        if (i == 0) {
            return new mga(aVar, 0);
        }
        if (i == 1) {
            return new mga(aVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(((String) this.b) + ".");
        sb.append(str);
        p57 l = l();
        if (!(l == null || (str2 = l.a) == null)) {
            sb.append(".".concat(str2));
        }
        return sb.toString();
    }

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public p57 l() {
        return (p57) this.c;
    }

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public o57(a aVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = aVar;
    }
}
