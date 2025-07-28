package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: xp9  reason: default package */
public final class xp9 implements pp7 {
    public final aec a;
    public final sh b;
    public final yv8 c;
    public final yv8 o;

    public xp9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 12);
        new yv8(oneMeRoomDatabase, 11);
        new yv8(oneMeRoomDatabase, 12);
        this.c = new yv8(oneMeRoomDatabase, 13);
        this.o = new yv8(oneMeRoomDatabase, 14);
    }

    public final void a() {
        xs7.N(new wp9(this, (Continuation) null));
    }

    public final Object b(long j, Continuation continuation) {
        pec a2 = pec.a(1, "SELECT * FROM fcm_notifications where time > ? ORDER BY time ASC");
        a2.j(1, j);
        return r1g.g(this.a, new CancellationSignal(), new uh(this, 14, a2), continuation);
    }
}
