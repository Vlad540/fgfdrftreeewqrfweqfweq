package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: p02  reason: default package */
public abstract class p02 implements g36 {
    public final hu3 a;
    public final int b;
    public final int c;

    public p02(hu3 hu3, int i, int i2) {
        this.a = hu3;
        this.b = i;
        this.c = i2;
    }

    public Object c(rj5 rj5, Continuation continuation) {
        Object f = n1g.f(new n02(rj5, this, (Continuation) null), continuation);
        return f == pu3.a ? f : jue.a;
    }

    public final pj5 d(hu3 hu3, int i, int i2) {
        hu3 hu32 = this.a;
        hu3 plus = hu3.plus(hu32);
        int i3 = this.c;
        int i4 = this.b;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i != -3) {
                    if (i4 != -2) {
                        if (i != -2) {
                            i += i4;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i4;
            }
            i2 = i3;
        }
        return (hhd.f(plus, hu32) && i == i4 && i2 == i3) ? this : j(plus, i, i2);
    }

    public String e() {
        return null;
    }

    public abstract Object h(d5b d5b, Continuation continuation);

    public abstract p02 j(hu3 hu3, int i, int i2);

    public pj5 k() {
        return null;
    }

    public n1c l(ou3 ou3) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        ru3 ru3 = ru3.c;
        o02 o02 = new o02(this, (Continuation) null);
        a5b a5b = new a5b(xie.x(ou3, this.a), xs7.a(i, this.c, 4));
        a5b.start(ru3, a5b, o02);
        return a5b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        bw4 bw4 = bw4.a;
        hu3 hu3 = this.a;
        if (hu3 != bw4) {
            arrayList.add("context=" + hu3);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(rf0.o(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return me4.l(sb, o23.c0(arrayList, ", ", (String) null, (String) null, (u16) null, 62), ']');
    }
}
