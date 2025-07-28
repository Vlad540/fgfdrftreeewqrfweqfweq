package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: ur9  reason: default package */
public final class ur9 implements pp7 {
    public final aec a;
    public final sh b;
    public final yv8 c;
    public final yv8 o;

    public ur9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 14);
        this.c = new yv8(oneMeRoomDatabase, 16);
        this.o = new yv8(oneMeRoomDatabase, 17);
    }

    public final void a() {
        xs7.N(new sr9(this, (Continuation) null));
    }

    public final Object b(long j, long j2, fr9 fr9) {
        pec a2 = pec.a(2, "SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=?");
        a2.j(1, j);
        a2.j(2, j2);
        return r1g.g(this.a, new CancellationSignal(), new uh(this, 17, a2), fr9);
    }
}
