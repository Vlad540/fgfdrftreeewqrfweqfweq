package defpackage;

import java.util.Collections;

/* renamed from: dye  reason: default package */
public final class dye implements zxe {
    public final /* synthetic */ int a;
    public final Object b;

    public dye() {
        this.a = 0;
        this.b = Collections.synchronizedMap(new q16(1000));
    }

    public final v63 a(wve wve) {
        switch (this.a) {
            case 0:
                return new y63(0, new joc(this, 18, wve));
            default:
                return new w63(g(), 2, new bwe(wve, 4));
        }
    }

    public final v63 b(long j) {
        switch (this.a) {
            case 0:
                return new y63(0, new joc(this, 19, new f00(j, 28)));
            default:
                return new w63(g(), 2, new f00(j, 29));
        }
    }

    public final v63 c(fwe fwe) {
        switch (this.a) {
            case 0:
                return new y63(0, new cye(this, fwe));
            default:
                return new w63(g(), 2, new dwe(fwe, 3));
        }
    }

    public final v63 clear() {
        switch (this.a) {
            case 0:
                return new y63(0, new xle(8, (Object) this));
            default:
                return new w63(g(), 2, new are(15));
        }
    }

    public final ax7 d(fwe fwe) {
        switch (this.a) {
            case 0:
                return new fx7(new cye(this, fwe));
            default:
                return new nx7(new jx7(g(), 2, new dwe(fwe, 2)), new are(16), 1);
        }
    }

    public final v63 e(String str) {
        switch (this.a) {
            case 0:
                return new y63(0, new joc(this, 19, new q52(str, 9)));
            default:
                return new w63(g(), 2, new q52(str, 10));
        }
    }

    public final ax7 f() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                rxe rxe = rxe.UNKNOWN;
                return new jx7(new au9(new lx7(new jx7(g(), 2, new xle()), new dd9(3), 0), new are(16), 3).v(), 2, new are(17));
        }
    }

    public phd g() {
        return ((bec) this.b).n().h(new are(18));
    }

    public dye(bec bec) {
        this.a = 1;
        this.b = bec;
    }
}
