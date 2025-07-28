package defpackage;

import java.util.ListIterator;

/* renamed from: xw9  reason: default package */
public final class xw9 extends b97 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw9(ex9 ex9, int i) {
        super(1);
        this.a = i;
        this.b = ex9;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                gd0 gd0 = (gd0) obj;
                ex9 ex9 = this.b;
                lr lrVar = ex9.b;
                ListIterator listIterator = lrVar.listIterator(lrVar.getSize());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((ww9) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ww9 ww9 = (ww9) obj2;
                if (ex9.c != null) {
                    ex9.c();
                }
                ex9.c = ww9;
                if (ww9 != null) {
                    ww9.d();
                }
                return jue.a;
            default:
                gd0 gd02 = (gd0) obj;
                ex9 ex92 = this.b;
                ww9 ww92 = ex92.c;
                if (ww92 == null) {
                    lr lrVar2 = ex92.b;
                    ListIterator listIterator2 = lrVar2.listIterator(lrVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((ww9) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    ww92 = (ww9) obj3;
                }
                if (ww92 != null) {
                    ww92.c(gd02);
                }
                return jue.a;
        }
    }
}
