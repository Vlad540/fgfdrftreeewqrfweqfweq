package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.Iterator;

/* renamed from: wg  reason: default package */
public final class wg extends ibe {
    public static final wg A0 = new wg(vg.START_OFFSET, 0L, 7);
    public static final wg B0 = new wg(vg.VALUE_TYPE, new ih(0.0f), 8);
    public static final wg X = new wg(vg.DURATION, 300L, 0);
    public static final wg Y = new wg(vg.PATH_DATA, "", 1);
    public static final wg Z = new wg(vg.PROPERTY_NAME, "", 2);
    public static final wg w0 = new wg(vg.PROPERTY_X_NAME, "", 3);
    public static final wg x0 = new wg(vg.PROPERTY_Y_NAME, "", 4);
    public static final wg y0 = new wg(vg.REPEAT_COUNT, 0, 5);
    public static final wg z0 = new wg(vg.REPEAT_MODE, 1, 6);
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(vg vgVar, Object obj, int i) {
        super(vgVar, 1, obj);
        this.o = i;
    }

    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        String str;
        Integer num;
        switch (this.o) {
            case 0:
                Long H = o0e.H(xmlResourceParser.getAttributeValue(i));
                return Long.valueOf(H != null ? H.longValue() : 0);
            case 1:
                return xmlResourceParser.getAttributeValue(i);
            case 2:
                return xmlResourceParser.getAttributeValue(i);
            case 3:
                return xmlResourceParser.getAttributeValue(i);
            case 4:
                return xmlResourceParser.getAttributeValue(i);
            case 5:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 6:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 7:
                return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i)));
            default:
                Iterator it = p23.B(new vg[]{vg.VALUE_FROM, vg.VALUE_TO}).iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        num = (Integer) at7.b(xmlResourceParser).get(((vg) it.next()).a);
                        if (num != null) {
                        }
                    } else {
                        num = null;
                    }
                }
                if (num != null) {
                    str = xmlResourceParser.getAttributeValue(num.intValue());
                }
                int parseInt = (str == null || !h0e.s0(str, '#')) ? Integer.parseInt(xmlResourceParser.getAttributeValue(i)) : 3;
                if (parseInt == 0) {
                    return new ih(0.0f);
                }
                if (parseInt == 1) {
                    return new jh(0);
                }
                if (parseInt == 2) {
                    return new kh("");
                }
                if (parseInt == 3) {
                    return new hh(0);
                }
                if (parseInt == 4) {
                    return lh.a;
                }
                throw new IllegalStateException(rf0.h("unknown value type ", xmlResourceParser.getAttributeValue(i)));
        }
    }
}
