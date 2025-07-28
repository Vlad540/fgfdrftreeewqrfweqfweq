package defpackage;

import android.view.View;
import java.util.Set;

/* renamed from: cf9  reason: default package */
public final /* synthetic */ class cf9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef9 b;

    public /* synthetic */ cf9(ef9 ef9, int i) {
        this.a = i;
        this.b = ef9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                for (af9 o : (Set) this.b.a) {
                    o.o(new ai0(5));
                }
                return;
            default:
                for (af9 o2 : (Set) this.b.a) {
                    o2.o(new ai0(4));
                }
                return;
        }
    }
}
