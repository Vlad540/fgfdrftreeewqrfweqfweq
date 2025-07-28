package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: oj  reason: default package */
public final class oj {
    public final aec a;
    public final sh b;
    public final th c;

    public oj(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 1);
        this.c = new th(oneMeRoomDatabase, 1);
    }
}
