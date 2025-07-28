package defpackage;

import android.view.View;

/* renamed from: fm3  reason: default package */
public final /* synthetic */ class fm3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm3 b;
    public final /* synthetic */ ag3 c;

    public /* synthetic */ fm3(hm3 hm3, ag3 ag3, int i) {
        this.a = i;
        this.b = hm3;
        this.c = ag3;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ag3 ag3 = this.c;
                this.b.o.invoke(new rv8(ag3.k, ag3));
                return;
            default:
                ag3 ag32 = this.c;
                this.b.o.invoke(new sv8(ag32.k, ag32));
                return;
        }
    }
}
