package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: lu4  reason: default package */
public final /* synthetic */ class lu4 implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu4 b;

    public /* synthetic */ lu4(mu4 mu4, int i) {
        this.a = i;
        this.b = mu4;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        mu4 mu4 = this.b;
        mu4.d = list;
        mu4.a.c(list);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                au4 au4 = (au4) obj;
                mu4 mu4 = this.b;
                mu4.getClass();
                return new au9(ms9.j(au4.a), new lu4(mu4, 2), 1).v().h(new r34(8, au4));
            default:
                gt4 gt4 = (gt4) obj;
                mu4 mu42 = this.b;
                mu42.getClass();
                n73 j = ms9.j(gt4.d);
                nu4 nu4 = mu42.c;
                Objects.requireNonNull(nu4);
                return new au9(j, new r34(9, nu4), 3).v().h(new e44(mu42, 8, gt4));
        }
    }
}
