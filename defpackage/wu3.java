package defpackage;

import java.util.Set;

/* renamed from: wu3  reason: default package */
public final class wu3 extends n07 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu3(String[] strArr, Object obj, int i) {
        super(strArr);
        this.b = i;
        this.c = obj;
    }

    public final void a(Set set) {
        switch (this.b) {
            case 0:
                ((i02) this.c).n(jue.a);
                return;
            case 1:
                hr U = hr.U();
                cfc cfc = ((dfc) this.c).u;
                if (U.V()) {
                    cfc.run();
                    return;
                } else {
                    U.W(cfc);
                    return;
                }
            default:
                ((at9) ((qt9) this.c)).c(js.c);
                return;
        }
    }
}
