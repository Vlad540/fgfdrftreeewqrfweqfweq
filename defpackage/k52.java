package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: k52  reason: default package */
public final /* synthetic */ class k52 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z52 b;

    public /* synthetic */ k52(z52 z52, int i) {
        this.a = i;
        this.b = z52;
    }

    public final void accept(Object obj) {
        y52 y52 = (y52) obj;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(y52.c());
                arrayList.remove(this.b);
                List list = y52.B;
                if (list != null) {
                    list.clear();
                }
                if (y52.B == null) {
                    y52.B = new ArrayList();
                }
                y52.B.addAll(arrayList);
                return;
            default:
                y52.a(this.b);
                return;
        }
    }
}
