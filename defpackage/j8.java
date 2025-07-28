package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: j8  reason: default package */
public final class j8 extends r1g {
    public final /* synthetic */ int k;

    public /* synthetic */ j8(int i) {
        this.k = i;
    }

    public final Intent f(Object obj) {
        Bundle bundleExtra;
        switch (this.k) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            default:
                jz6 jz6 = (jz6) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = jz6.b;
                if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        jz6 = new jz6(jz6.a, (Intent) null, jz6.c, jz6.o);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jz6);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    public gvf m(Context context, Object obj) {
        switch (this.k) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new gvf(1, (Object) iw4.a);
                }
                for (String d : strArr) {
                    if (d8.d(context, d) != 0) {
                        return null;
                    }
                }
                int S = ju7.S(strArr.length);
                if (S < 16) {
                    S = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                for (String put : strArr) {
                    linkedHashMap.put(put, Boolean.TRUE);
                }
                return new gvf(1, (Object) linkedHashMap);
            default:
                return super.m(context, obj);
        }
    }

    public final Object y(Intent intent, int i) {
        switch (this.k) {
            case 0:
                iw4 iw4 = iw4.a;
                if (i != -1 || intent == null) {
                    return iw4;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return iw4;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                int length = intArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return ju7.V(o23.y0(cs.X(stringArrayExtra), arrayList));
            case 1:
                return new h8(intent, i);
            default:
                return new h8(intent, i);
        }
    }
}
