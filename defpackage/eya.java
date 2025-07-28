package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* renamed from: eya  reason: default package */
public final class eya {
    public static final eya b;
    public static final String c = Integer.toString(0, 36);
    public final wi5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        oyb.k(!false);
        b = new eya(new wi5(sparseBooleanArray));
        int i = oze.a;
    }

    public eya(wi5 wi5) {
        this.a = wi5;
    }

    public static eya c(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int intValue = integerArrayList.get(i).intValue();
            oyb.k(!false);
            sparseBooleanArray.append(intValue, true);
        }
        oyb.k(!false);
        return new eya(new wi5(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final boolean b(int... iArr) {
        return this.a.a(iArr);
    }

    public final int d(int i) {
        return this.a.b(i);
    }

    public final int e() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eya)) {
            return false;
        }
        return this.a.equals(((eya) obj).a);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            wi5 wi5 = this.a;
            if (i < wi5.a.size()) {
                arrayList.add(Integer.valueOf(wi5.b(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
