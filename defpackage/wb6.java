package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: wb6  reason: default package */
public final class wb6 extends ArrayList {
    public final Class a;
    public final Class b;

    public wb6(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final w4g a() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        return new w4g(objArr, objArr2);
    }
}
