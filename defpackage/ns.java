package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* renamed from: ns  reason: default package */
public final class ns implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public ns(ui2 ui2, ui2 ui22) {
        this.b = ui2;
        this.c = ui22;
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (float) rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (((float) rational.getDenominator()) * ((float) rational2.getNumerator())) / ((float) rational.getNumerator())) : new RectF(0.0f, 0.0f, (((float) rational.getNumerator()) * ((float) rational2.getDenominator())) / ((float) rational.getDenominator()), (float) rational2.getDenominator());
    }

    public final int compare(Object obj, Object obj2) {
        Long l;
        Long l2;
        switch (this.a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                boolean z = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b2 = b(rational);
                RectF b3 = b(rational2);
                RectF rectF = (RectF) this.b;
                boolean z2 = b2.width() >= rectF.width() && b2.height() >= rectF.height();
                if (b3.width() >= rectF.width() && b3.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((b2.height() * b2.width()) - (b3.height() * b3.width()));
                } else if (z2) {
                    return -1;
                } else {
                    if (z) {
                        return 1;
                    }
                    return -((int) Math.signum(a(b2, rectF) - a(b3, rectF)));
                }
            default:
                long longValue = ((Number) obj2).longValue();
                ui2 ui2 = (ui2) this.b;
                si2 si2 = (si2) ui2.a.get(Long.valueOf(longValue));
                ui2 ui22 = (ui2) this.c;
                si2 si22 = (si2) ui22.a.get(Long.valueOf(longValue));
                long j = 0;
                if ((si2 != null ? si2.l : 0) >= (si22 != null ? si22.l : 0)) {
                    l = Long.valueOf(si2 != null ? si2.l : 0);
                } else {
                    l = Long.valueOf(si22 != null ? si22.l : 0);
                }
                long longValue2 = ((Number) obj).longValue();
                si2 si23 = (si2) ui2.a.get(Long.valueOf(longValue2));
                si2 si24 = (si2) ui22.a.get(Long.valueOf(longValue2));
                if ((si23 != null ? si23.l : 0) >= (si24 != null ? si24.l : 0)) {
                    if (si23 != null) {
                        j = si23.l;
                    }
                    l2 = Long.valueOf(j);
                } else {
                    if (si24 != null) {
                        j = si24.l;
                    }
                    l2 = Long.valueOf(j);
                }
                return gp0.f(l, l2);
        }
    }

    public ns(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }
}
