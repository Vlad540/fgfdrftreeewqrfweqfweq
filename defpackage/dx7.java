package defpackage;

/* renamed from: dx7  reason: default package */
public final class dx7 extends an5 {
    public final /* synthetic */ int b;
    public final ay7[] c;

    public /* synthetic */ dx7(ay7[] ay7Arr, int i) {
        this.b = i;
        this.c = ay7Arr;
    }

    public final void g(b1e b1e) {
        switch (this.b) {
            case 0:
                cx7 cx7 = new cx7(b1e, this.c);
                b1e.e(cx7);
                cx7.c();
                return;
            default:
                ay7[] ay7Arr = this.c;
                int length = ay7Arr.length;
                rx7 rx7 = new rx7(b1e, length, length <= an5.a ? new sx7(length) : new qx7());
                b1e.e(rx7);
                ey eyVar = rx7.X;
                int length2 = ay7Arr.length;
                int i = 0;
                while (i < length2) {
                    ay7 ay7 = ay7Arr[i];
                    if (!rx7.Z && eyVar.get() == null) {
                        ay7.a(rx7);
                        i++;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
