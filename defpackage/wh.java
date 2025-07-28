package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: wh  reason: default package */
public final class wh {
    public final aec a;
    public final sh b;
    public final th c;

    public wh(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 0);
        this.c = new th(oneMeRoomDatabase, 0);
    }

    public final Object a(Collection collection, Continuation continuation) {
        StringBuilder l = hr1.l("SELECT * FROM animoji WHERE id IN (");
        int size = collection.size();
        a06.e(l, size);
        l.append(")");
        pec a2 = pec.a(size, l.toString());
        Iterator it = collection.iterator();
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
        return r1g.g(this.a, new CancellationSignal(), new vh(this, a2, 1), continuation);
    }
}
