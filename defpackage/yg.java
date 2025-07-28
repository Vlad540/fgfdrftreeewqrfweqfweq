package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: yg  reason: default package */
public abstract class yg extends ibe {
    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        float f;
        Object obj = (mh) wg.B0.C(context, xmlResourceParser);
        if (!(obj instanceof hh) && h0e.s0(xmlResourceParser.getAttributeValue(i), '#')) {
            obj = new hh(0);
        }
        if (obj instanceof hh) {
            return new hh(at7.F(xmlResourceParser.getAttributeValue(i)));
        }
        if (obj instanceof ih) {
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            try {
                f = bh4.a(context, attributeValue);
            } catch (NumberFormatException unused) {
                f = Float.parseFloat(attributeValue);
            }
            return new ih(f);
        } else if (obj instanceof jh) {
            return new jh(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        } else {
            if (obj instanceof kh) {
                return new kh(xmlResourceParser.getAttributeValue(i));
            }
            if (hhd.f(obj, lh.a)) {
                throw new IllegalStateException(wn6.i("Undefined ", ((vg) this.b).a, " type"));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
