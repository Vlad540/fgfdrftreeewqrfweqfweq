package defpackage;

import android.view.View;

/* renamed from: n40  reason: default package */
public final /* synthetic */ class n40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;
    public final /* synthetic */ m40 c;

    public /* synthetic */ n40(r40 r40, m40 m40, int i) {
        this.a = i;
        this.b = r40;
        this.c = m40;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m40 m40 = this.c;
                this.b.a.invoke(new qv8(m40.b, m40));
                return;
            default:
                m40 m402 = this.c;
                this.b.a.invoke(new qv8(m402.b, m402));
                return;
        }
    }
}
