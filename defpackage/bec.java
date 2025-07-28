package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: bec  reason: default package */
public abstract class bec implements Closeable {
    public final Object[] X;
    public final r7e Y;
    public final Context a;
    public final Class b = OneMeRoomDatabase.class;
    public final String c = "cache.db";
    public final x4a o;

    public bec(Context context, x4a x4a, Object[] objArr) {
        this.a = context;
        this.o = x4a;
        this.X = objArr;
        this.Y = new r7e(new u5b(9, this));
    }

    public final void close() {
        if (this.Y.a()) {
            aec aec = (aec) this.Y.getValue();
            sz5 sz5 = aec.a;
            Boolean bool = null;
            if (sz5 != null) {
                bool = Boolean.valueOf(sz5.isOpen());
            }
            if (hhd.f(bool, Boolean.TRUE)) {
                ReentrantReadWriteLock.WriteLock writeLock = aec.i.writeLock();
                writeLock.lock();
                try {
                    q07 q07 = aec.e;
                    q07.getClass();
                    q07.getClass();
                    aec.h().close();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public final aec m() {
        return (aec) this.Y.getValue();
    }

    public final mv9 n() {
        return new mv9(2, new m5(13, this));
    }
}
