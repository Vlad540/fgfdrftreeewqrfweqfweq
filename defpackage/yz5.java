package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: yz5  reason: default package */
public final class yz5 extends xz5 implements e4e {
    public final SQLiteStatement b;

    public yz5(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long m() {
        return this.b.executeInsert();
    }

    public final int n() {
        return this.b.executeUpdateDelete();
    }
}
