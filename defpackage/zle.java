package defpackage;

import android.view.View;

/* renamed from: zle  reason: default package */
public final /* synthetic */ class zle implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bea b;

    public /* synthetic */ zle(bea bea, int i) {
        this.a = i;
        this.b = bea;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((vda) this.b).a.invoke(view);
                return;
            case 1:
                ((wda) this.b).a.invoke(view);
                return;
            default:
                ((gea) ((zda) this.b).a).b.invoke(view);
                return;
        }
    }
}
