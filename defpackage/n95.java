package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: n95  reason: default package */
public final /* synthetic */ class n95 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y95 b;

    public /* synthetic */ n95(y95 y95, int i) {
        this.a = i;
        this.b = y95;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i = this.a;
        y95 y95 = this.b;
        switch (i) {
            case 0:
                y95.getClass();
                pec a2 = pec.a(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                aec aec = y95.a;
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    long j = o.moveToFirst() ? o.getLong(0) : 0;
                    o.close();
                    a2.m();
                    return Long.valueOf(j);
                } catch (Throwable th) {
                    o.close();
                    a2.m();
                    throw th;
                }
            default:
                return y95.c();
        }
    }
}
