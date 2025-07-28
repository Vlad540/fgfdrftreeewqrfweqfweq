package defpackage;

/* renamed from: v9  reason: default package */
public final class v9 implements y4b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ v9(y4b y4b, int i) {
        this.a = i;
        this.b = y4b;
    }

    public final void a(ah0 ah0, z4b z4b) {
        switch (this.a) {
            case 0:
                ((y4b) this.b).a(new u9(ah0, 0), z4b);
                return;
            case 1:
                ((y4b) this.b).a(new u9(ah0, 2), z4b);
                return;
            case 2:
                ((y4b) this.b).a(new u9(ah0, 3), z4b);
                return;
            default:
                if (((ji0) z4b).a.i == null) {
                    ah0.g(1, (Object) null);
                    return;
                } else if (!c(0, ah0, z4b)) {
                    ah0.g(1, (Object) null);
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean c(int i, ah0 ah0, z4b z4b) {
        wie[] wieArr;
        hbc hbc = ((ji0) z4b).a.i;
        while (true) {
            wieArr = (wie[]) this.b;
            if (i >= wieArr.length) {
                i = -1;
                break;
            } else if (wieArr[i].b(hbc)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return false;
        }
        wieArr[i].a(new vie(this, ah0, z4b, i), z4b);
        return true;
    }

    public v9(wie[] wieArr) {
        this.a = 3;
        wie[] wieArr2 = wieArr;
        this.b = wieArr2;
        ez3.m(0, wieArr2.length);
    }
}
