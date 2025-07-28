package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

public final class j0 {
    static long u = -1;
    private final String[] a = new String[1];
    private final f b = new f();
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;
    private final SQLiteStatement g;
    private final SQLiteStatement h;
    private final SQLiteStatement i;
    private final SQLiteStatement j;
    private final SQLiteStatement k;
    private final SQLiteStatement l;
    private final SQLiteStatement m;
    private final SQLiteStatement n;
    private final SQLiteStatement o;
    private final SQLiteStatement p;
    private final SQLiteStatement q;
    private final SQLiteStatement r;
    private final n0 s;
    protected final SQLiteDatabase t;

    public static abstract class a implements Closeable {
        final Cursor a;

        public a(Cursor cursor) {
            this.a = cursor;
        }

        public final boolean a() {
            return this.a.moveToNext();
        }

        public final void close() {
            try {
                this.a.close();
            } catch (Throwable th) {
                y0.b("AbstractReader error: error while closing cursor", th);
            }
        }

        public void finalize() {
            super.finalize();
            close();
        }
    }

    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.a.getLong(4);
        }

        public long c() {
            return this.a.getLong(0);
        }

        public long f() {
            return this.a.getLong(1);
        }

        public byte[] l() {
            return this.a.getBlob(3);
        }
    }

    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        public long k() {
            return this.a.getLong(1);
        }
    }

    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.a.getLong(3);
        }

        public long c() {
            return this.a.getLong(0);
        }

        public String j() {
            return this.a.getString(1);
        }

        public long m() {
            return this.a.isNull(2) ? j0.u : this.a.getLong(2);
        }
    }

    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        public long m() {
            return this.a.getLong(2);
        }

        public long n() {
            return this.a.getLong(1);
        }

        public boolean o() {
            return this.a.isNull(2);
        }
    }

    public static final class f implements SQLiteDatabase.CursorFactory {
        long a;
        byte[] b;

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private j0(SQLiteDatabase sQLiteDatabase) {
        this.t = sQLiteDatabase;
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.h = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.i = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.j = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.k = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.l = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.p = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.m = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.n = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.o = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.r = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.s = new n0(sQLiteDatabase);
    }

    public static j0 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
            if (openOrCreateDatabase == null) {
                y0.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (openOrCreateDatabase.getVersion() != 10) {
                openOrCreateDatabase.close();
                context.deleteDatabase(str2);
                openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, (SQLiteDatabase.CursorFactory) null);
                openOrCreateDatabase.setVersion(10);
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                openOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                n0.a(openOrCreateDatabase);
            }
            return new j0(openOrCreateDatabase);
        } catch (Throwable th) {
            y0.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    public Long b(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        Cursor rawQuery = this.t.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (rawQuery.moveToNext()) {
                Long valueOf = Long.valueOf(rawQuery.getLong(0));
                rawQuery.close();
                return valueOf;
            }
            rawQuery.close();
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public c c(long j2) {
        this.a[0] = String.valueOf(j2);
        return new c(this.t.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.a));
    }

    public long d(long j2) {
        this.a[0] = String.valueOf(j2);
        Cursor rawQuery = this.t.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.a);
        try {
            if (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public e e(long j2) {
        this.a[0] = String.valueOf(j2);
        return new e(this.t.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.a));
    }

    public void f(long j2) {
        this.s.b(j2);
    }

    public b g() {
        return new b(this.t.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", (String[]) null));
    }

    public long h() {
        Cursor rawQuery = this.t.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", (String[]) null);
        try {
            if (rawQuery.moveToNext()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public b f() {
        return this.s.a();
    }

    public void c(long j2, long j3) {
        this.d.bindLong(1, j2);
        this.d.bindLong(2, j3);
        this.d.execute();
    }

    public void e() {
        this.o.execute();
    }

    public void c() {
        this.m.execute();
    }

    public long b(long j2) {
        this.a[0] = String.valueOf(j2);
        Cursor rawQuery = this.t.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.a);
        try {
            if (rawQuery.moveToNext()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return 0;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void d(long j2, long j3) {
        this.h.bindLong(1, j3);
        this.h.bindLong(2, j2);
        this.h.execute();
    }

    public void d() {
        this.n.execute();
    }

    public void b() {
        this.l.execute();
    }

    public long b(long j2, long j3) {
        this.q.bindLong(1, j2);
        this.q.bindLong(2, j3);
        return (long) this.q.executeUpdateDelete();
    }

    public b a(long j2, byte[] bArr) {
        f fVar = this.b;
        fVar.a = j2;
        fVar.b = bArr;
        return new b(this.t.rawQueryWithFactory(fVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", (String[]) null, (String) null));
    }

    public d a(String str) {
        String[] strArr = this.a;
        strArr[0] = str;
        return new d(this.t.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    public long a(int i2, byte[] bArr, boolean z) {
        this.c.bindLong(1, (long) i2);
        this.c.bindLong(2, z ? 1 : 0);
        this.c.bindBlob(3, bArr);
        return this.c.executeInsert();
    }

    public long a(String str, long j2) {
        this.e.bindString(1, str);
        this.e.bindLong(2, j2);
        return this.e.executeInsert();
    }

    public void a(long j2, long j3, boolean z, long j4) {
        this.f.bindLong(1, j2);
        this.f.bindLong(2, j3);
        if (z) {
            this.f.bindNull(3);
        } else {
            this.f.bindLong(3, j4);
        }
        this.f.execute();
    }

    public void a(long j2, long j3, long j4) {
        if (j3 != u) {
            this.i.bindLong(1, j3);
        } else {
            this.i.bindNull(1);
        }
        this.i.bindLong(2, j4);
        this.i.bindLong(3, j2);
        this.i.execute();
    }

    public void a() {
        this.k.execute();
    }

    public void a(String str, Long l2) {
        if (l2 == null) {
            this.r.bindString(1, str);
            this.r.execute();
            return;
        }
        long longValue = l2.longValue();
        this.g.bindString(1, str);
        this.g.bindLong(2, longValue);
        if (this.g.executeInsert() == u) {
            this.j.bindLong(1, longValue);
            this.j.bindString(2, str);
            this.j.execute();
        }
    }

    public long a(long j2, long j3) {
        this.p.bindLong(1, j2);
        this.p.bindLong(2, j3);
        return (long) this.p.executeUpdateDelete();
    }

    public void a(byte[] bArr) {
        this.s.a(bArr);
    }

    public void a(long j2) {
        this.s.a(j2);
    }
}
