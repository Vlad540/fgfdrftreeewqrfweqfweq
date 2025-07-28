package defpackage;

import java.util.List;

/* renamed from: aa9  reason: default package */
public final /* synthetic */ class aa9 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca9 b;

    public /* synthetic */ aa9(ca9 ca9, int i) {
        this.a = i;
        this.b = ca9;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                num.getClass();
                w99 w99 = this.b.c;
                List s0 = o23.s0(((q99) w99.d.getValue()).b);
                if (s0.isEmpty()) {
                    w99.a();
                } else {
                    w99.c.invoke(s0, num);
                }
                return jue.a;
            default:
                int intValue = num.intValue();
                ca9 ca9 = this.b;
                cpf cpf = ca9.b;
                return Boolean.valueOf((cpf.j() < intValue || intValue < 0) ? false : ((q99) ca9.c.e.a.getValue()).b.contains(Long.valueOf(((ktd) ((pg7) cpf.C(intValue))).a)));
        }
    }
}
