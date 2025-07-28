package defpackage;

import android.view.View;

/* renamed from: sx0  reason: default package */
public final /* synthetic */ class sx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ sx0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [tx0, b7c] */
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n7d n7d = ((tx0) this.b).a;
                t97 t97 = n7d.T0;
                boolean z = !(!t97.a() ? false : ((eda) t97.getValue()).isChecked());
                n7d.setEndView(new z6d(z, true));
                ((u5g) this.c).k(((pg7) this.o).o, z);
                return;
            case 1:
                y75 y75 = (y75) this.b;
                long j = y75.a;
                if (y75.Z) {
                    ((u16) this.c).invoke(Long.valueOf(j));
                    return;
                } else {
                    ((u16) this.o).invoke(Long.valueOf(j));
                    return;
                }
            default:
                pea.d((pea) this.b, (u16) this.c, (kea) this.o);
                return;
        }
    }
}
