package defpackage;

import android.view.View;

/* renamed from: ame  reason: default package */
public final /* synthetic */ class ame implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dea b;

    public /* synthetic */ ame(dea dea, int i) {
        this.a = i;
        this.b = dea;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((cea) this.b).a.invoke(view);
                return;
            case 1:
                ((xda) this.b).a.invoke(view);
                return;
            default:
                ((wda) this.b).a.invoke(view);
                return;
        }
    }
}
