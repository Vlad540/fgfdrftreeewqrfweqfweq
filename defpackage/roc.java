package defpackage;

import android.view.View;

/* renamed from: roc  reason: default package */
public final /* synthetic */ class roc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zoc b;

    public /* synthetic */ roc(zoc zoc, int i) {
        this.a = i;
        this.b = zoc;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a.invoke();
                return;
            case 1:
                this.b.c.invoke();
                return;
            default:
                this.b.w0.invoke();
                return;
        }
    }
}
