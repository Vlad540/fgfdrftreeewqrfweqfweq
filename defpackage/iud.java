package defpackage;

import java.util.List;

/* renamed from: iud  reason: default package */
public final /* synthetic */ class iud implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lud b;

    public /* synthetic */ iud(lud lud, int i) {
        this.a = i;
        this.b = lud;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        nud nud = this.b.a;
        nud.getClass();
        iu7.a0(new w63(new au9(ms9.j(list), new xsd(25), 3).v(), 2, new kud(nud, 1)).l(), z3d.j, new d52(26, list), new b95(6, list));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return lud.e((ytd) obj);
            default:
                bud bud = (bud) obj;
                lud lud = this.b;
                lud.getClass();
                return ((zsd) lud.b).b(bud.h).h(new joc(lud, 3, bud));
        }
    }
}
