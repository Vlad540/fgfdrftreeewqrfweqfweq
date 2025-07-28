package defpackage;

import android.view.View;

/* renamed from: gh3  reason: default package */
public final /* synthetic */ class gh3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ gh3(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.FALSE);
                return;
            case 1:
                this.b.invoke(Boolean.FALSE);
                return;
            case 2:
                this.b.invoke(Boolean.TRUE);
                return;
            default:
                this.b.invoke(Boolean.TRUE);
                return;
        }
    }
}
