package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ld9  reason: default package */
public final /* synthetic */ class ld9 implements of3, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md9 b;

    public /* synthetic */ ld9(md9 md9, int i) {
        this.a = i;
        this.b = md9;
    }

    public void accept(Object obj) {
        md9 md9 = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                md9.Z1();
                return;
            case 2:
                List list = (List) obj;
                md9.getClass();
                udd.p("md9", "Loaded %d", new Object[]{Integer.valueOf(list.size())});
                te9 te9 = (te9) ((ge9) md9.b);
                te9.A(false);
                te9.B(list);
                if (!md9.A0) {
                    md9.A0 = true;
                    md9.Z.v();
                    return;
                }
                return;
            default:
                Throwable th = (Throwable) obj;
                md9.getClass();
                udd.r("md9", "Can't load locations");
                te9 te92 = (te9) ((ge9) md9.b);
                te92.A(false);
                te92.B(Collections.emptyList());
                return;
        }
    }

    public Object apply(Object obj) {
        hr1.r(obj);
        this.b.getClass();
        throw null;
    }
}
