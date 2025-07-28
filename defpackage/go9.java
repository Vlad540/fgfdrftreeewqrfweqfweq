package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: go9  reason: default package */
public final class go9 {
    public final CharSequence a;
    public final long b;
    public final wna c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public go9(CharSequence charSequence, long j, wna wna) {
        this.a = charSequence;
        this.b = j;
        this.c = wna;
    }

    public static Bundle[] a(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            go9 go9 = (go9) list.get(i);
            go9.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = go9.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", go9.b);
            wna wna = go9.c;
            if (wna != null) {
                bundle.putCharSequence("sender", wna.a);
                bundle.putParcelable("sender_person", fo9.a(vna.b(wna)));
            }
            String str = go9.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = go9.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = go9.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
