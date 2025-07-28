package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: mud  reason: default package */
public final class mud {
    public final aec a;
    public final sh b;
    public final tdc c;

    public mud(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 23);
        this.c = new tdc(oneMeRoomDatabase, 8);
    }
}
