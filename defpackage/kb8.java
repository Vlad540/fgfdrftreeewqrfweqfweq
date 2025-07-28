package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: kb8  reason: default package */
public final class kb8 implements Runnable {
    public final /* synthetic */ mb8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ ea6 b;
    public final /* synthetic */ ta8 c;
    public final /* synthetic */ Collection o;

    public /* synthetic */ kb8(mb8 mb8, ea6 ea6, ta8 ta8, ArrayList arrayList, int i) {
        this.a = i;
        this.X = mb8;
        this.b = ea6;
        this.c = ta8;
        this.o = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.O(this.X, this.c, (ArrayList) this.o);
                return;
            default:
                this.b.O(this.X, this.c, (ArrayList) this.o);
                return;
        }
    }
}
