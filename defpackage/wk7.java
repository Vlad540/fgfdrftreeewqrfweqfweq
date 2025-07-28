package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: wk7  reason: default package */
public final class wk7 {
    public static final /* synthetic */ int h = 0;
    public final tt0 a;
    public final ku3 b;
    public final gl7 c;
    public final pae d;
    public final ContextScope e;
    public final pwc f;
    public Map g = iw4.a;

    public wk7(tt0 tt0, ku3 ku3, g2b g2b, gl7 gl7, pae pae, ContentResolver contentResolver, bf5 bf5) {
        this.a = tt0;
        this.b = ku3;
        this.c = gl7;
        this.d = pae;
        n3a n3a = (n3a) pae;
        ContextScope a2 = n1g.a(n3a.a());
        this.e = a2;
        j2b j2b = (j2b) g2b;
        this.f = new pwc(j2b.c, j2b.e, new otf(contentResolver, bf5));
        ez3.N(ez3.J(new ck5(((bv6) gl7).A0, new uk7(this, (Continuation) null), 5), n3a.a()), n1g.M(a2, ku3));
    }

    public final List a(String str) {
        hw4 hw4 = hw4.a;
        if (str == null) {
            return hw4;
        }
        if (str.equals("SELECTED_MEDIA_ALBUM")) {
            pwc pwc = this.f;
            pwc.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = pwc.a.iterator();
            while (it.hasNext()) {
                rwc rwc = (rwc) it.next();
                if (rwc.f) {
                    arrayList.add(rwc.a);
                }
            }
            return arrayList;
        }
        o46 o46 = (o46) this.g.get(str);
        if (o46 == null) {
            return hw4;
        }
        List<yk7> c2 = ((bv6) this.c).c(o46.a);
        ArrayList arrayList2 = new ArrayList(q23.H(c2, 10));
        for (yk7 N : c2) {
            arrayList2.add(kjd.N(N));
        }
        return arrayList2;
    }
}
