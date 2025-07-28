package defpackage;

import android.view.View;

/* renamed from: ba2  reason: default package */
public final /* synthetic */ class ba2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i26 b;
    public final /* synthetic */ ph8 c;
    public final /* synthetic */ ca2 o;

    public /* synthetic */ ba2(i26 i26, ph8 ph8, ca2 ca2, int i) {
        this.a = i;
        this.b = i26;
        this.c = ph8;
        this.o = ca2;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.o.a);
                return true;
            default:
                this.b.invoke(this.c, this.o.a);
                return true;
        }
    }
}
