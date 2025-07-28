package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: tr9  reason: default package */
public final class tr9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ur9 c;

    public /* synthetic */ tr9(ur9 ur9, ArrayList arrayList, int i) {
        this.a = i;
        this.c = ur9;
        this.b = arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                ur9 ur9 = this.c;
                aec aec = ur9.a;
                aec.c();
                try {
                    ur9.b.B(this.b);
                    aec.r();
                    aec.l();
                    return jue.a;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
            default:
                StringBuilder l = hr1.l("DELETE FROM notifications_tracker_messages WHERE chat_id||'_'||message_id in (");
                List<String> list = this.b;
                a06.e(l, list.size());
                l.append(")");
                String sb = l.toString();
                ur9 ur92 = this.c;
                yz5 d = ur92.a.d(sb);
                int i = 1;
                for (String str : list) {
                    if (str == null) {
                        d.W(i);
                    } else {
                        d.f(i, str);
                    }
                    i++;
                }
                aec aec2 = ur92.a;
                aec2.c();
                try {
                    Integer valueOf = Integer.valueOf(d.n());
                    aec2.r();
                    return valueOf;
                } finally {
                    aec2.l();
                }
        }
    }
}
