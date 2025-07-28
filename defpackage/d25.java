package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: d25  reason: default package */
public final class d25 implements Callable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object o;

    public d25(Callable callable, z15 z15, a25 a25) {
        this.b = callable;
        this.c = z15;
        this.o = a25;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                a25 a25 = (a25) this.o;
                long a2 = ((z15) this.c).a();
                try {
                    return ((Callable) this.b).call();
                } finally {
                    a25.a(a2);
                }
            default:
                StringBuilder l = hr1.l("DELETE FROM folder_and_chats WHERE folderId = ? AND chatId IN (");
                List<Long> list = (List) this.b;
                a06.e(l, list.size());
                l.append(")");
                String sb = l.toString();
                udc udc = (udc) this.o;
                yz5 d = udc.a.d(sb);
                String str = (String) this.c;
                if (str == null) {
                    d.W(1);
                } else {
                    d.f(1, str);
                }
                int i = 2;
                for (Long l2 : list) {
                    if (l2 == null) {
                        d.W(i);
                    } else {
                        d.j(i, l2.longValue());
                    }
                    i++;
                }
                aec aec = udc.a;
                aec.c();
                try {
                    d.n();
                    aec.r();
                    aec.l();
                    return jue.a;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
        }
    }

    public d25(udc udc, List list, String str) {
        this.o = udc;
        this.b = list;
        this.c = str;
    }
}
