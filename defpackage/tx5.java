package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* renamed from: tx5  reason: default package */
public final class tx5 implements sx5 {
    public final int a;
    public final int b;
    public final /* synthetic */ c c;

    public tx5(c cVar, int i, int i2) {
        this.c = cVar;
        this.a = i;
        this.b = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.c;
        a aVar = cVar.z;
        int i = this.a;
        if (aVar == null || i >= 0 || !aVar.d0().U(-1, 0)) {
            return cVar.V(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
