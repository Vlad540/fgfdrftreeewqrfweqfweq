package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ox  reason: default package */
public final class ox extends rx {
    public final ArrayList X = new ArrayList();
    public final long c;
    public final ArrayList o = new ArrayList();

    public ox(int i, long j) {
        super(i, 1);
        this.c = j;
    }

    public final String toString() {
        return rx.e(this.b) + " leaves: " + Arrays.toString(this.o.toArray()) + " containers: " + Arrays.toString(this.X.toArray());
    }

    public final ox v(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ox oxVar = (ox) arrayList.get(i2);
            if (oxVar.b == i) {
                return oxVar;
            }
        }
        return null;
    }

    public final qx w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qx qxVar = (qx) arrayList.get(i2);
            if (qxVar.b == i) {
                return qxVar;
            }
        }
        return null;
    }
}
