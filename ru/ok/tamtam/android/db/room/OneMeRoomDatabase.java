package ru.ok.tamtam.android.db.room;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import kotlin.Metadata;
import one.me.android.OneMeApplication;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/db/room/OneMeRoomDatabase;", "Laec;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class OneMeRoomDatabase extends aec {
    public static volatile dd9 m;

    public abstract y95 A();

    public abstract ha5 B();

    public abstract na5 C();

    public abstract eb5 D();

    public abstract et8 E();

    public abstract cw8 F();

    public abstract xp9 G();

    public abstract dq9 H();

    public abstract ur9 I();

    public abstract dpa J();

    public abstract xzb K();

    public abstract b2c L();

    public abstract udc M();

    public abstract pkc N();

    public abstract wwc O();

    public abstract dsd P();

    public abstract mud Q();

    public abstract zud R();

    public abstract mee S();

    public abstract yxe T();

    public abstract e3f U();

    public abstract xff V();

    public abstract WorkersQueueDao W();

    public final void a() {
        if (m != null && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            boolean k = k();
            boolean n = n();
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            String valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
            StringBuilder sb = new StringBuilder("NotMainThreadException(isOpenInternal=");
            sb.append(n);
            sb.append(", isInTransaction=");
            sb.append(k);
            sb.append(", curThread=");
            IllegalStateException illegalStateException = new IllegalStateException(wn6.l(sb, valueOf, ")"));
            int i = OneMeApplication.w0;
            y0f.a.c().a("ONEME-8045", illegalStateException);
        }
    }

    public abstract wh t();

    public abstract oj u();

    public abstract kb1 v();

    public abstract yp2 w();

    public abstract do3 x();

    public abstract h74 y();

    public abstract nm4 z();
}
