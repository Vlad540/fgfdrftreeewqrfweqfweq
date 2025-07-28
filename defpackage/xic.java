package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* renamed from: xic  reason: default package */
public final class xic implements a15, m7e, a03 {
    public static final cy4 Y = new cy4("proto");
    public final Provider X;
    public final fnc a;
    public final eye b;
    public final eye c;
    public final j90 o;

    public xic(eye eye, eye eye2, j90 j90, fnc fnc, Provider provider) {
        this.a = fnc;
        this.b = eye;
        this.c = eye2;
        this.o = j90;
        this.X = provider;
    }

    public static String m0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((fa0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Long n(SQLiteDatabase sQLiteDatabase, hb0 hb0) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{hb0.a, String.valueOf(w3b.a(hb0.c))}));
        byte[] bArr = hb0.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static Object n0(Cursor cursor, vic vic) {
        try {
            return vic.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final ArrayList S(SQLiteDatabase sQLiteDatabase, hb0 hb0, int i) {
        ArrayList arrayList = new ArrayList();
        Long n = n(sQLiteDatabase, hb0);
        if (n == null) {
            return arrayList;
        }
        n0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{n.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new xz(this, arrayList, hb0, 26));
        return arrayList;
    }

    public final void U(long j, qn7 qn7, String str) {
        o(new b52(str, qn7, j, 10));
    }

    public final void close() {
        this.a.close();
    }

    public final Object e0(l7e l7e) {
        SQLiteDatabase m = m();
        eye eye = this.c;
        long a2 = eye.a();
        while (true) {
            try {
                m.beginTransaction();
                try {
                    Object a3 = l7e.a();
                    m.setTransactionSuccessful();
                    return a3;
                } finally {
                    m.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (eye.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    public final SQLiteDatabase m() {
        fnc fnc = this.a;
        Objects.requireNonNull(fnc);
        eye eye = this.c;
        long a2 = eye.a();
        while (true) {
            try {
                return fnc.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (eye.a() < ((long) this.o.c) + a2) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final Object o(vic vic) {
        SQLiteDatabase m = m();
        m.beginTransaction();
        try {
            Object apply = vic.apply(m);
            m.setTransactionSuccessful();
            return apply;
        } finally {
            m.endTransaction();
        }
    }
}
