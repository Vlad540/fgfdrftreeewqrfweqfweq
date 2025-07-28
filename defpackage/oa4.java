package defpackage;

import java.util.ArrayList;

/* renamed from: oa4  reason: default package */
public final /* synthetic */ class oa4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa4 b;
    public final /* synthetic */ jmd c;

    public /* synthetic */ oa4(xa4 xa4, jmd jmd, int i) {
        this.a = i;
        this.b = xa4;
        this.c = jmd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                return;
            case 1:
                xa4 xa4 = this.b;
                ArrayList arrayList = xa4.b;
                jmd jmd = this.c;
                if (arrayList.contains(jmd)) {
                    c3d.a(jmd.a, jmd.c.Y0, xa4.a);
                    return;
                }
                return;
            default:
                xa4 xa42 = this.b;
                ArrayList arrayList2 = xa42.b;
                jmd jmd2 = this.c;
                arrayList2.remove(jmd2);
                xa42.c.remove(jmd2);
                return;
        }
    }
}
