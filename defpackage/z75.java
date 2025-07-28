package defpackage;

import android.view.View;

/* renamed from: z75  reason: default package */
public final /* synthetic */ class z75 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a85 b;
    public final /* synthetic */ y75 c;

    public /* synthetic */ z75(a85 a85, y75 y75, int i) {
        this.a = i;
        this.b = a85;
        this.c = y75;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u16 u16 = this.b.J0;
                if (u16 != null) {
                    u16.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 1:
                u16 u162 = this.b.K0;
                if (u162 != null) {
                    u162.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            case 2:
                u16 u163 = this.b.J0;
                if (u163 != null) {
                    u163.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
            default:
                u16 u164 = this.b.K0;
                if (u164 != null) {
                    u164.invoke(Long.valueOf(this.c.a));
                    return;
                }
                return;
        }
    }
}
