package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* renamed from: c83  reason: default package */
public final class c83 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ e83 h;

    public c83(b bVar) {
        this.h = bVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        k8 k8Var = (k8) this.e.get(str);
        if ((k8Var != null ? k8Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                k8Var.a.w(k8Var.b.y(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new h8(intent, i2));
        return true;
    }

    public final void b(int i, r1g r1g, Object obj) {
        Bundle bundle;
        e83 e83 = this.h;
        gvf m = r1g.m(e83, obj);
        if (m != null) {
            new Handler(Looper.getMainLooper()).post(new wg1((Object) this, i, (Object) m, 3));
            return;
        }
        Intent f2 = r1g.f(obj);
        if (f2.getExtras() != null && f2.getExtras().getClassLoader() == null) {
            f2.setExtrasClassLoader(e83.getClassLoader());
        }
        if (f2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = f2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            f2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(f2.getAction())) {
            String[] stringArrayExtra = f2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            d8.B(e83, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(f2.getAction())) {
            jz6 jz6 = (jz6) f2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                e83.startIntentSenderForResult(jz6.a, i, jz6.b, jz6.c, jz6.o, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new wg1((Object) this, i, (Object) e2, 4));
            }
        } else {
            e83.startActivityForResult(f2, i, bundle);
        }
    }

    public final jg8 c(String str, r1g r1g, i8 i8Var) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new le3(new ij4(l8.b, 1, new c0())).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new k8(i8Var, r1g));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            i8Var.w(obj);
        }
        Bundle bundle = this.g;
        h8 h8Var = (h8) ek8.E(bundle, str, h8.class);
        if (h8Var != null) {
            bundle.remove(str);
            i8Var.w(r1g.y(h8Var.b, h8Var.a));
        }
        return new jg8(this, str, r1g, 1);
    }
}
