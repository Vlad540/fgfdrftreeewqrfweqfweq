package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: xzb  reason: default package */
public final class xzb {
    public final aec a;
    public final sh b;
    public final yv8 c;

    public xzb(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 17);
        this.c = new yv8(oneMeRoomDatabase, 21);
    }

    public final Object a(Continuation continuation) {
        pec a2 = pec.a(1, "SELECT * FROM reactions_section WHERE id = ?");
        a2.f(1, "POPULAR");
        return r1g.g(this.a, new CancellationSignal(), new uh(this, 19, a2), continuation);
    }
}
