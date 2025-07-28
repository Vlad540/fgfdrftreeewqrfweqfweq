package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;

/* renamed from: la2  reason: default package */
public final class la2 extends kr7 {
    public final /* synthetic */ t97 g;
    public final /* synthetic */ t97 h;
    public final /* synthetic */ ma2 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public la2(t97 t97, t97 t972, ma2 ma2) {
        super(100);
        this.g = t97;
        this.h = t972;
        this.i = ma2;
    }

    public final Object a(Object obj) {
        Object obj2;
        ia2 ia2 = (ia2) obj;
        t97 t97 = this.g;
        t97 t972 = this.h;
        ma2 ma2 = this.i;
        CharSequence charSequence = null;
        try {
            String d = ((iv6) t97.getValue()).d(ia2.a);
            if (d != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(((w6a) t972.getValue()).j.e(p0e.I(d)), new whe(km4.y0.n(ma2.a).g(), new hd1(14)), 33);
                udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 20) * dh4.c().getDisplayMetrics().density) + a24.X(((float) 4) * dh4.c().getDisplayMetrics().density)), 33);
                obj2 = new SpannedString(spannableStringBuilder);
            } else {
                obj2 = null;
            }
        } catch (Throwable th) {
            obj2 = new kcc(th);
        }
        Throwable a = mcc.a(obj2);
        if (a != null) {
            udd.s(ma2.u, "Fail process typing", a);
        }
        if (!(obj2 instanceof kcc)) {
            charSequence = obj2;
        }
        return charSequence;
    }
}
