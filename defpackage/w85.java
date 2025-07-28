package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: w85  reason: default package */
public final /* synthetic */ class w85 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha5 b;

    public /* synthetic */ w85(ha5 ha5, int i) {
        this.a = i;
        this.b = ha5;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i = this.a;
        ha5 ha5 = this.b;
        switch (i) {
            case 0:
                ha5.getClass();
                pec a2 = pec.a(0, "SELECT COUNT(*) FROM favorite_stickers");
                aec aec = ha5.a;
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
                return ha5.c();
        }
    }
}
