package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.SM;

/* renamed from: it3  reason: default package */
public final class it3 {
    public static final xhd a = new Object();

    public static void a(ds dsVar) {
        Object obj;
        List<HttpCookie> list;
        ArrayList arrayList = new ArrayList();
        u1 it = dsVar.iterator();
        while (true) {
            u1 u1Var = it;
            if (!u1Var.hasNext()) {
                break;
            }
            Object next = u1Var.next();
            if (SM.SET_COOKIE.equals(((hm6) next).a)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list = HttpCookie.parse(((hm6) it2.next()).b);
            } catch (Exception unused) {
                list = hw4.a;
            }
            arrayList2.add(list);
        }
        ArrayList I = q23.I(arrayList2);
        ArrayList arrayList3 = new ArrayList(q23.H(I, 10));
        Iterator it3 = I.iterator();
        while (it3.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it3.next();
            httpCookie.toString();
            arrayList3.add(httpCookie);
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            if ("vdt".equals(((HttpCookie) obj).getName())) {
                break;
            }
        }
        HttpCookie httpCookie2 = (HttpCookie) obj;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
