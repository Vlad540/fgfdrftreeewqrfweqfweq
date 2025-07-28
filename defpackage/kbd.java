package defpackage;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* renamed from: kbd  reason: default package */
public final class kbd {
    public final bd a;
    public final tt0 b;
    public final lk9 c;
    public final g15 d;
    public final luf e;

    public kbd(bd bdVar, tt0 tt0, lk9 lk9, g15 g15, luf luf) {
        this.a = bdVar;
        this.b = tt0;
        this.c = lk9;
        this.d = g15;
        this.e = luf;
    }

    public final ArrayList a(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null || r1g.p(uri.toString())) {
                udd.s("kbd", "Failed to send media, uri is empty or null", (Throwable) null);
            } else {
                if (i == 7) {
                    this.a.g("ACTION_FILE_SEND", "share");
                }
                ugd ugd = new ugd(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ugd);
                c1d c1d = new c1d(0, arrayList2);
                c1d.o = true;
                c1d.m = str;
                c1d.n = null;
                arrayList.add(c1d);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [e1d, java.lang.Object, v0d] */
    public final void b(b9 b9Var, List list, String str, List list2) {
        List list3;
        b9 b9Var2 = b9Var;
        String str2 = str;
        udd.q("kbd", "share");
        if (b9Var2 != null) {
            ArrayList arrayList = new ArrayList();
            int i = b9Var2.b;
            List list4 = hw4.a;
            if (i == 0 && !r1g.p((String) b9Var2.c)) {
                arrayList.add(new h1d(0, ((String) b9Var2.c).trim(), true, list4));
            }
            if (((ArrayList) b9Var2.o) != null) {
                if (b9Var.E()) {
                    arrayList.addAll(a(1, (String) b9Var2.c, (ArrayList) b9Var2.o));
                } else {
                    if (!r1g.p((String) b9Var2.c)) {
                        arrayList.add(new h1d(0, ((String) b9Var2.c).trim(), true, list4));
                    }
                    arrayList.addAll(a(1, (String) null, (ArrayList) b9Var2.o));
                }
            }
            if (((ArrayList) b9Var2.X) != null) {
                if (b9Var.E()) {
                    arrayList.addAll(a(3, (String) b9Var2.c, (ArrayList) b9Var2.X));
                } else {
                    if (!r1g.p((String) b9Var2.c)) {
                        arrayList.add(new h1d(0, ((String) b9Var2.c).trim(), true, list4));
                    }
                    arrayList.addAll(a(3, (String) null, (ArrayList) b9Var2.X));
                }
            }
            if (((ArrayList) b9Var2.Y) != null) {
                if (!r1g.p((String) b9Var2.c)) {
                    arrayList.add(new h1d(0, ((String) b9Var2.c).trim(), true, list4));
                }
                arrayList.addAll(a(7, (String) null, (ArrayList) b9Var2.Y));
            }
            if (!r1g.p((String) b9Var2.Z)) {
                String str3 = (String) b9Var2.Z;
                if (!r1g.p(str3)) {
                    ? e1d = new e1d(0);
                    e1d.l = str3;
                    list3 = Collections.singletonList(e1d);
                } else {
                    list3 = Collections.emptyList();
                }
                arrayList.addAll(list3);
            }
            if (str2 != null) {
                String trim = str.trim();
                if (!arrayList.isEmpty() && !r1g.p(trim)) {
                    arrayList.add(0, new h1d(0, trim, true, list2 == null ? list4 : list2));
                }
            }
            udd.p("kbd", "share: queue size = %d; chats count = %d", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(list.size())});
            if (arrayList.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Long) it.next()).getClass();
                    this.b.c(new nh0("file.local.unknown.error"));
                }
                this.d.c(new HandledException("Try to share empty queue. Description = %s chats size = %d, shareData = %s", str2, Integer.valueOf(list.size()), b9Var2), true);
                return;
            }
            this.c.getClass();
            ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayDeque.add(((e1d) it2.next()).a());
            }
            udd.p("lk9", "tasks size = %d", new Object[]{Integer.valueOf(arrayDeque.size())});
            for (int i2 = 0; i2 < list.size(); i2++) {
                g0d g0d = new g0d(((Long) list.get(i2)).longValue(), new ArrayDeque(arrayDeque), 2);
                g0d.h = null;
                this.e.a(new g1d(g0d));
            }
        }
    }
}
