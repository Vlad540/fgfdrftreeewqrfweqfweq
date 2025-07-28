package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* renamed from: ii5  reason: default package */
public final class ii5 implements sm0, xde {
    public static final ii5 c = new ii5(0, 1);
    public static final ii5 d = new ii5(0, 2);
    public static final ii5 e = new ii5(0, 3);
    public static final ii5 f = new ii5(1, 3);
    public static final ii5 g = new ii5(2, 3);
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ ii5(int i) {
        this.a = i;
    }

    public int a(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i2 + i3;
    }

    public boolean b(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    public void n() {
    }

    public void o(j54 j54, rm0 rm0, vf vfVar, int i, s16 s16) {
        int i2 = this.b;
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                int c2 = (i + i3) % vfVar.c();
                if (m75.a.i(2)) {
                    m75.e(ii5.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(c2), Integer.valueOf(i));
                }
                int hashCode = (vfVar.hashCode() * 31) + c2;
                synchronized (((SparseArray) j54.X)) {
                    if (((SparseArray) j54.X).get(hashCode) != null) {
                        m75.d(j54.class, Integer.valueOf(c2), "Already scheduled decode job for frame %d");
                    } else if (rm0.p(c2)) {
                        m75.d(j54.class, Integer.valueOf(c2), "Frame %d is cached already.");
                    } else {
                        i54 i54 = new i54(j54, vfVar, rm0, c2, hashCode);
                        ((SparseArray) j54.X).put(hashCode, i54);
                        ((ExecutorService) j54.o).execute(i54);
                    }
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (s16 != null) {
            s16.invoke();
        }
    }

    public e13 p(int i, int i2, int i3) {
        return null;
    }

    public void q() {
    }

    public void r(int i, int i2) {
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Restrictions{restrictions=" + this.b + ", cannotInvite=" + b(1) + ", cannotModifyIcon=" + b(2) + ", cannotModifyTitle=" + b(4) + ", cannotLeave=" + b(8) + ", cannotPin=" + b(16) + ", cannotLiveLocation=" + b(32) + ", cannotInput=" + b(64) + ", cannotStopBot=" + b(128) + ", cannotComplain=" + b(256) + '}';
            case 3:
                return wn6.j(new StringBuilder("{value="), this.b, "}");
            case 7:
                return String.format((Locale) null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ii5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ ii5(boolean z) {
        this.a = 9;
    }
}
