package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: pb2  reason: default package */
public final /* synthetic */ class pb2 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ pb2(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ob2 ob2 = (ob2) obj;
                return null;
            case 1:
                ob2 ob22 = (ob2) obj;
                if (ob22 == null) {
                    return null;
                }
                return new ob2(ob22.a, ob22.b, ob22.c, ob22.d, true);
            case 2:
                Set set = (Set) obj;
                return new LinkedHashSet();
            case 3:
                Set set2 = (Set) obj;
                return new LinkedHashSet();
            case 4:
                zb9 zb9 = (zb9) obj;
                return tq7.a();
            case 5:
                Set set3 = (Set) obj;
                return new LinkedHashSet();
            case 6:
                zb9 zb92 = (zb9) obj;
                return tq7.a();
            case 7:
                String str = (String) obj;
                return String.valueOf(System.currentTimeMillis());
            case 8:
                Set set4 = (Set) obj;
                return qw4.a;
            case 9:
                xvd xvd = (xvd) obj;
                return new xvd((String) null, 3);
            default:
                u1d u1d = (u1d) obj;
                if (u1d == null) {
                    return null;
                }
                u1d.d(true);
                return null;
        }
    }
}
