package defpackage;

import android.view.View;
import java.util.Collections;

/* renamed from: rr2  reason: default package */
public final class rr2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr2 b;

    public /* synthetic */ rr2(View view, sr2 sr2, int i) {
        this.a = i;
        this.b = sr2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tp2.a.b().b(Collections.singletonList(new pma(1)));
                sr2 sr2 = this.b;
                sr2.a.q0(sr2);
                return;
            default:
                sr2 sr22 = this.b;
                if (((Boolean) sr22.b.invoke()).booleanValue()) {
                    tp2.a.b().b(Collections.singletonList(new pma(1)));
                    sr22.a.q0(sr22);
                    return;
                }
                return;
        }
    }
}
