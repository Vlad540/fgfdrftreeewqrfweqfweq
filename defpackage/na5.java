package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: na5  reason: default package */
public final class na5 implements pp7 {
    public final th X;
    public final aec a;
    public final sh b;
    public final th c;
    public final th o;

    public na5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 9);
        this.c = new th(oneMeRoomDatabase, 20);
        this.o = new th(oneMeRoomDatabase, 21);
        this.X = new th(oneMeRoomDatabase, 22);
    }

    public final void a() {
        xs7.N(new ka5(this, (Continuation) null));
    }

    public final Object b(List list, er9 er9) {
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qr9 qr9 = (qr9) it.next();
            long j = qr9.a;
            arrayList.add(j + "_" + qr9.b);
        }
        StringBuilder l = hr1.l("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||msg_id IN (");
        int size = arrayList.size();
        a06.e(l, size);
        l.append(") AND analytics_status = (");
        l.append("?");
        l.append(")");
        int i = 1;
        int i2 = size + 1;
        pec a2 = pec.a(i2, l.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                a2.W(i);
            } else {
                a2.f(i, str);
            }
            i++;
        }
        a2.j(i2, (long) hr1.t(2));
        return r1g.g(this.a, new CancellationSignal(), new uh(this, 9, a2), er9);
    }
}
