package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: o95  reason: default package */
public final /* synthetic */ class o95 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y95 b;
    public final /* synthetic */ List c;

    public /* synthetic */ o95(y95 y95, List list, int i) {
        this.a = i;
        this.b = y95;
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
                y95 y95 = this.b;
                aec aec = y95.a;
                aec.c();
                try {
                    y95.getClass();
                    int i = 0;
                    a2 = pec.a(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                    aec aec2 = y95.a;
                    aec2.b();
                    o = aec2.o(a2, (CancellationSignal) null);
                    if (o.moveToFirst()) {
                        i = o.getInt(0);
                    }
                    o.close();
                    a2.m();
                    y95.b((long) (i + 1), list);
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
