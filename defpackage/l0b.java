package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: l0b  reason: default package */
public abstract class l0b {
    public static final int a = hqb.pooling_container_listener_holder_tag;
    public static final int b = hqb.is_pooling_container_tag;

    public static final void a(View view) {
        gyc r = r1g.r((i26) pfa.o(view).b);
        while (r.hasNext()) {
            View view2 = (View) r.next();
            int i = a;
            m0b m0b = (m0b) view2.getTag(i);
            if (m0b == null) {
                m0b = new m0b();
                view2.setTag(i, m0b);
            }
            ArrayList arrayList = m0b.a;
            int A = p23.A(arrayList);
            if (-1 < A) {
                hr1.r(arrayList.get(A));
                throw null;
            }
        }
    }
}
