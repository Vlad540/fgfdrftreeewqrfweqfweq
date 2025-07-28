package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: nx  reason: default package */
public final class nx extends rx {
    public final ArrayList X = new ArrayList();
    public final long c;
    public final ArrayList o = new ArrayList();

    public nx(int i, long j) {
        super(i, 0);
        this.c = j;
    }

    public final String toString() {
        String d = rx.d(this.b);
        String arrays = Arrays.toString(this.o.toArray());
        String arrays2 = Arrays.toString(this.X.toArray());
        StringBuilder sb = new StringBuilder(me4.e(me4.e(me4.e(22, d), arrays), arrays2));
        sb.append(d);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final nx v(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nx nxVar = (nx) arrayList.get(i2);
            if (nxVar.b == i) {
                return nxVar;
            }
        }
        return null;
    }

    public final px w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            px pxVar = (px) arrayList.get(i2);
            if (pxVar.b == i) {
                return pxVar;
            }
        }
        return null;
    }
}
