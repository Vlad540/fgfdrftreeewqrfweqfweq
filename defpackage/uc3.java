package defpackage;

/* renamed from: uc3  reason: default package */
public final /* synthetic */ class uc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd8 b;
    public final /* synthetic */ ic8 c;

    public /* synthetic */ uc3(cd8 cd8, ic8 ic8, int i) {
        this.a = i;
        this.b = cd8;
        this.c = ic8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cd8 cd8 = this.b;
                if (!cd8.i()) {
                    if (cd8.z) {
                        ic8 ic8 = this.c;
                        if (!cd8.j(ic8)) {
                            if (cd8.h(ic8)) {
                                cd8.z = false;
                            }
                        } else {
                            return;
                        }
                    }
                    cd8.e.getClass();
                    return;
                }
                return;
            case 1:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 12, me8.N0(new x48(21)));
                return;
            case 2:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 11, me8.N0(new x48(16)));
                return;
            case 3:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 3, me8.N0(new x48(28)));
                return;
            case 4:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, me8.N0(new x48(13)));
                return;
            case 5:
                me8 me8 = this.b.g;
                me8.getClass();
                ic8 ic82 = this.c;
                me8.L0(ic82, Integer.MIN_VALUE, 1, me8.N0(new w48((Object) me8, 4, (Object) ic82)));
                return;
            case 6:
                me8 me82 = this.b.g;
                me82.getClass();
                ic8 ic83 = this.c;
                me82.L0(ic83, Integer.MIN_VALUE, 1, me8.N0(new w48((Object) me82, 4, (Object) ic83)));
                return;
            case 7:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, me8.N0(new x48(13)));
                return;
            case 8:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 9, me8.N0(new x48(22)));
                return;
            default:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 7, me8.N0(new x48(18)));
                return;
        }
    }
}
