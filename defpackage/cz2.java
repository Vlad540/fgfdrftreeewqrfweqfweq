package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: cz2  reason: default package */
public final class cz2 {
    public static final cz2 b = new cz2(0);
    public final /* synthetic */ int a;

    public /* synthetic */ cz2(int i) {
        this.a = i;
    }

    public final void a(sz5 sz5) {
        switch (this.a) {
            case 0:
                sz5.m();
                try {
                    sz5.U("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - xsf.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    sz5.r0();
                    return;
                } finally {
                    sz5.S();
                }
            default:
                if (((SQLiteDatabase) sz5.b).isWriteAheadLoggingEnabled()) {
                    sz5.U("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}
