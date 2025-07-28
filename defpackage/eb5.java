package defpackage;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: eb5  reason: default package */
public final class eb5 implements pp7 {
    public final aec a;
    public final sh b;
    public final th c;

    public eb5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 10);
        this.c = new th(oneMeRoomDatabase, 23);
    }

    public final void a() {
        xs7.N(new db5(this, (Continuation) null));
    }

    public final Object b(List list, Continuation continuation) {
        StringBuilder l = hr1.l("SELECT * FROM fcm_notifications_history WHERE chat_id IN (");
        int size = list.size();
        a06.e(l, size);
        l.append(")");
        pec a2 = pec.a(size, l.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 == null) {
                a2.W(i);
            } else {
                a2.j(i, l2.longValue());
            }
            i++;
        }
        return r1g.g(this.a, new CancellationSignal(), new uh(this, 11, a2), continuation);
    }
}
