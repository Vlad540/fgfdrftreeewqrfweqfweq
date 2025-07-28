package defpackage;

import java.util.List;

/* renamed from: iee  reason: default package */
public final /* synthetic */ class iee implements j26, v1b {
    public final /* synthetic */ jee a;
    public final /* synthetic */ List b;

    public /* synthetic */ iee(jee jee, List list) {
        this.a = jee;
        this.b = list;
    }

    public Object apply(Object obj) {
        jee jee = this.a;
        jee.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return c73.a;
        }
        iee iee = new iee(jee, this.b);
        ajb ajb = jee.c;
        ajb.getClass();
        return new iu9(new ps9(ajb, iee, 3));
    }

    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        jee jee = this.a;
        jee.getClass();
        List list = this.b;
        return !((Boolean) new mhd(new mv9(2, new rz3(jee, 7, list)), new d52(28, list), 2).h(new kce(8)).e()).booleanValue();
    }
}
