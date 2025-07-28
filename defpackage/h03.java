package defpackage;

import java.util.function.BiConsumer;
import one.me.android.OneMeApplication;

/* renamed from: h03  reason: default package */
public final /* synthetic */ class h03 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h03(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj, Object obj2) {
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ((i03) obj3).l((String) obj, (String) obj2);
                return;
            case 1:
                Long l = (Long) obj;
                tf3 tf3 = (tf3) obj2;
                di3 di3 = (di3) obj3;
                if (tf3 != null) {
                    ydc ydc = ((hz3) ((a04) di3.f.get())).d;
                    l.getClass();
                    ydc.x().c(tf3.a.c, ((l16) ((r7e) ydc.o).getValue()).a);
                    return;
                }
                di3.getClass();
                return;
            default:
                int i = OneMeApplication.w0;
                ((i26) obj3).invoke(obj, obj2);
                return;
        }
    }
}
