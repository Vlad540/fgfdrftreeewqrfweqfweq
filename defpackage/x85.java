package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: x85  reason: default package */
public final /* synthetic */ class x85 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ x85(ha5 ha5, List list, int i) {
        this.a = i;
        this.b = ha5;
        this.c = list;
    }

    public final void run() {
        pec a2;
        Cursor o;
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                return;
            default:
                List list = this.c;
                ha5 ha5 = this.b;
                aec aec = ha5.a;
                aec.c();
                try {
                    ha5.getClass();
                    int i = 0;
                    a2 = pec.a(0, "SELECT MAX(`index`) FROM favorite_stickers");
                    aec aec2 = ha5.a;
                    aec2.b();
                    o = aec2.o(a2, (CancellationSignal) null);
                    if (o.moveToFirst()) {
                        i = o.getInt(0);
                    }
                    o.close();
                    a2.m();
                    ha5.b(i + 1, list);
                    aec.r();
                    aec.l();
                    return;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
        }
    }
}
