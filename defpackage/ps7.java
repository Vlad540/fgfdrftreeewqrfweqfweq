package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException;

/* renamed from: ps7  reason: default package */
public final /* synthetic */ class ps7 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ps7(vs7 vs7, String str, int i) {
        this.a = i;
        this.b = vs7;
        this.c = str;
    }

    public final void accept(Object obj) {
        String str = this.c;
        vs7 vs7 = this.b;
        switch (this.a) {
            case 0:
                on2 on2 = (on2) obj;
                vs7.getClass();
                List<ds8> list = on2.c;
                ArrayList arrayList = new ArrayList(list.size());
                for (ds8 ds8 : list) {
                    try {
                        ym8 ym8 = ds8.b;
                        List list2 = ds8.o;
                        arrayList.add(new prc(3, ds8.c, (ArrayList) list2, (i22) null, (tf3) null, ym8, ds8.a, (yib) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                vs7.m.addAll(arrayList);
                ArrayList arrayList2 = vs7.p;
                arrayList2.addAll(arrayList);
                String str2 = on2.X;
                if (str2 == null || !str2.equals("0")) {
                    vs7.r = on2.X;
                } else {
                    vs7.r = null;
                }
                ms7 ms7 = vs7.h;
                if (ms7 != null) {
                    ms7.g(str, vs7.m);
                    ms7 ms72 = vs7.h;
                    new ArrayList(arrayList2);
                    ms72.getClass();
                    return;
                }
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                vs7.getClass();
                udd.s("vs7", "searchChatsAndMessages: exception", th2);
                vs7.g.a(new MainSearchLoaderImpl$NotFoundException(str, th2));
                return;
            default:
                Throwable th3 = (Throwable) obj;
                vs7.getClass();
                udd.s("vs7", "searchChats: exception", th3);
                vs7.g.a(new MainSearchLoaderImpl$NotFoundException(str, th3));
                return;
        }
    }
}
