package defpackage;

import java.util.List;

/* renamed from: kud  reason: default package */
public final /* synthetic */ class kud implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nud b;

    public /* synthetic */ kud(nud nud, int i) {
        this.a = i;
        this.b = nud;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        switch (this.a) {
            case 0:
                nud nud = this.b;
                nud.getClass();
                return new w63(new au9(ms9.j(list), new xsd(25), 3).v(), 2, new kud(nud, 1));
            default:
                return new w63(this.b.a.n().h(new xsd(24)), 2, new d52(27, list));
        }
    }
}
