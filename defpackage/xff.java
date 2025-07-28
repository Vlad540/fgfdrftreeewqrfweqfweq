package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: xff  reason: default package */
public final class xff {
    public final aec a;
    public final sh b;
    public final f74 c;
    public final tdc d;
    public final tdc e;

    public xff(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 28);
        this.c = new f74(oneMeRoomDatabase, 6);
        this.d = new tdc(oneMeRoomDatabase, 25);
        this.e = new tdc(oneMeRoomDatabase, 26);
        new tdc(oneMeRoomDatabase, 27);
        new tdc(oneMeRoomDatabase, 28);
    }

    public final Object a(long j, long j2, Continuation continuation) {
        pec a2 = pec.a(2, "SELECT * FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
        a2.j(1, j);
        a2.j(2, j2);
        return r1g.g(this.a, new CancellationSignal(), new vff(this, a2, 1), continuation);
    }
}
