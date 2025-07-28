package defpackage;

import android.text.SpannableString;
import android.text.style.URLSpan;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: g22  reason: default package */
public final /* synthetic */ class g22 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ i22 b;

    public /* synthetic */ g22(i22 i22, int i) {
        this.a = i;
        this.b = i22;
    }

    public final Object apply(Object obj) {
        i22 i22 = this.b;
        switch (this.a) {
            case 0:
                yia yia = (yia) obj;
                xm8 xm8 = i22.X;
                bmd bmd = null;
                if (xm8 == null) {
                    return null;
                }
                vo8 vo8 = xm8.a;
                if (yia != null && ((Long) yia.a).longValue() == vo8.b) {
                    return yia;
                }
                ma2 ma2 = xm8.w0;
                ma2.getClass();
                xm8 xm82 = i22.X;
                SpannableString e = xm82 == null ? null : ma2.e(ma2, i22, xm82, 1);
                if (r1g.q(e)) {
                    int i = bmd.a;
                    e = oa2.F(e, true);
                    for (Object obj2 : e.getSpans(0, e.length(), Object.class)) {
                        if ((obj2 instanceof URLSpan) || (obj2 instanceof uu7)) {
                            e.removeSpan(obj2);
                        }
                    }
                }
                Long valueOf = Long.valueOf(vo8.b);
                if (!r1g.p(e)) {
                    int i2 = bmd.a;
                    bmd = oa2.F(e, true);
                }
                return new yia(valueOf, bmd);
            default:
                Set set = (Set) obj;
                set.add(i22);
                return set;
        }
    }
}
