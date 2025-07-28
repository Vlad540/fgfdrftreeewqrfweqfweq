package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: vbe  reason: default package */
public final class vbe implements iae, of3 {
    public Object a;

    public /* synthetic */ vbe(Object obj) {
        this.a = obj;
    }

    public static void a(HashSet hashSet, String str) {
        if (!r1g.p(str)) {
            hashSet.add(new File(str));
        }
    }

    public void accept(Object obj) {
        ((Number) obj).longValue();
        ew ewVar = (ew) this.a;
        ydc ydc = (ydc) ewVar.b;
        v4b v4b = (v4b) ydc.b;
        lv3 lv3 = null;
        if (((Number) ((r7e) v4b.c).getValue()).longValue() > 0 && ((Number) ((r7e) v4b.b).getValue()).longValue() > 0) {
            twf twf = (twf) ydc.o;
            u4b m = v4b.m();
            twf twf2 = m == null ? null : new twf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), m);
            u4b m2 = v4b.m();
            ydc.o = m2 == null ? null : new twf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), m2);
            if (!(twf == null || twf2 == null)) {
                u4b u4b = twf2.b;
                long j = u4b.b + u4b.c + u4b.d;
                r7e r7e = (r7e) ydc.c;
                float floatValue = ((float) (u4b.a + j)) / ((Number) r7e.getValue()).floatValue();
                u4b u4b2 = twf.b;
                float floatValue2 = floatValue - (((float) (u4b2.a + (u4b2.b + (u4b2.c + u4b2.d)))) / ((Number) r7e.getValue()).floatValue());
                float floatValue3 = (((float) twf2.a) - (((float) u4b.e) / ((Number) r7e.getValue()).floatValue())) - (((float) twf.a) - (((float) u4b2.e) / ((Number) r7e.getValue()).floatValue()));
                if (!Float.isInfinite(floatValue3) && !Float.isNaN(floatValue3) && floatValue3 != 0.0f) {
                    float longValue = (floatValue2 / floatValue3) / ((float) ((Number) ((r7e) v4b.b).getValue()).longValue());
                    if (0.0f <= longValue && longValue <= 1.0f) {
                        lv3 = new lv3(longValue);
                    }
                }
            }
        }
        ewVar.o = lv3;
    }

    public void c(lbe lbe) {
        qce qce = (qce) this.a;
        qce.b().a(new sbc(qce, 29, lbe));
    }

    public void d(uae uae) {
        qce qce = (qce) this.a;
        qce.b().a(new rbe(qce, uae, 2));
    }

    public long f() {
        return 0;
    }
}
