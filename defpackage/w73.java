package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: w73  reason: default package */
public final /* synthetic */ class w73 implements ykc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Bundle a() {
        b bVar;
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                c83 c83 = ((e83) this.b).w0;
                c83.getClass();
                LinkedHashMap linkedHashMap = c83.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(c83.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c83.g));
                return bundle;
            case 1:
                break;
            case 2:
                return ((c) this.b).a0();
            default:
                return tkc.a((tkc) this.b);
        }
        do {
            bVar = (b) this.b;
        } while (b.T(bVar.P()));
        bVar.J0.d(nb7.ON_STOP);
        return new Bundle();
    }
}
