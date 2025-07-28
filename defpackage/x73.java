package defpackage;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: x73  reason: default package */
public final /* synthetic */ class x73 implements jx9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e83 b;

    public /* synthetic */ x73(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                e83 e83 = this.b;
                Bundle c = ((mm) e83.o.o).c("android:support:activity-result");
                if (c != null) {
                    c83 c83 = e83.w0;
                    c83.getClass();
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            c83.d.addAll(stringArrayList2);
                        }
                        Bundle bundle = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c83.g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            LinkedHashMap linkedHashMap = c83.b;
                            boolean containsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = c83.a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    ete.f(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            linkedHashMap2.put(Integer.valueOf(intValue), str2);
                            linkedHashMap.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                hx5 hx5 = (hx5) ((b) this.b).I0.b;
                hx5.D0.b(hx5, hx5, (a) null);
                return;
        }
    }
}
