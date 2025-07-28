package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: lm4  reason: default package */
public final class lm4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ lm4(Object obj, long j, String str, int i) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = str;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                nm4 nm4 = (nm4) this.o;
                th thVar = nm4.c;
                aec aec = nm4.a;
                yz5 f = thVar.f();
                f.j(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    f.W(2);
                } else {
                    f.f(2, str);
                }
                try {
                    aec.c();
                    f.n();
                    aec.r();
                    aec.l();
                    thVar.u(f);
                    return null;
                } catch (Throwable th) {
                    thVar.u(f);
                    throw th;
                }
            case 1:
                StringBuilder l = hr1.l("DELETE FROM messages WHERE chat_id = ? AND id in (");
                List<Long> list = (List) this.c;
                a06.e(l, list.size());
                l.append(")");
                String sb = l.toString();
                cw8 cw8 = (cw8) this.o;
                yz5 d = cw8.a.d(sb);
                d.j(1, this.b);
                int i = 2;
                for (Long l2 : list) {
                    if (l2 == null) {
                        d.W(i);
                    } else {
                        d.j(i, l2.longValue());
                    }
                    i++;
                }
                aec aec2 = cw8.a;
                aec2.c();
                try {
                    d.n();
                    aec2.r();
                    aec2.l();
                    return jue.a;
                } catch (Throwable th2) {
                    aec2.l();
                    throw th2;
                }
            case 2:
                udc udc = (udc) this.o;
                tdc tdc = udc.f;
                aec aec3 = udc.a;
                yz5 f2 = tdc.f();
                f2.j(1, this.b);
                String str2 = (String) this.c;
                if (str2 == null) {
                    f2.W(2);
                } else {
                    f2.f(2, str2);
                }
                try {
                    aec3.c();
                    f2.m();
                    aec3.r();
                    aec3.l();
                    tdc.u(f2);
                    return jue.a;
                } catch (Throwable th3) {
                    tdc.u(f2);
                    throw th3;
                }
            default:
                StringBuilder l3 = hr1.l("DELETE FROM folder_and_chats WHERE folderId IN (");
                Collection<String> collection = (Collection) this.c;
                int size = collection.size();
                a06.e(l3, size);
                l3.append(") AND chatId = ");
                l3.append("?");
                String sb2 = l3.toString();
                udc udc2 = (udc) this.o;
                yz5 d2 = udc2.a.d(sb2);
                int i2 = 1;
                for (String str3 : collection) {
                    if (str3 == null) {
                        d2.W(i2);
                    } else {
                        d2.f(i2, str3);
                    }
                    i2++;
                }
                d2.j(size + 1, this.b);
                aec aec4 = udc2.a;
                aec4.c();
                try {
                    d2.n();
                    aec4.r();
                    aec4.l();
                    return jue.a;
                } catch (Throwable th4) {
                    aec4.l();
                    throw th4;
                }
        }
    }

    public /* synthetic */ lm4(Object obj, Collection collection, long j, int i) {
        this.a = i;
        this.o = obj;
        this.c = collection;
        this.b = j;
    }
}
