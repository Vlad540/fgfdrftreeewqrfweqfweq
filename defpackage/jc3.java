package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jc3  reason: default package */
public final class jc3 {
    public final Bundle a;

    public jc3(mge mge, Bundle bundle, mnc mnc) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", mge);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (mnc != null) {
            bundle2.putString("stat_screen", mnc.name());
        }
    }

    public final void a(kc3... kc3Arr) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        u23.M(parcelableArrayList, kc3Arr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, hge hge) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new kc3(i, hge, 1, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, hge hge) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new kc3(i, hge, 2, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, hge hge) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new kc3(i, hge, 3, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e() {
        return new ConfirmationBottomSheet(this.a);
    }

    public final void f(mge mge) {
        Bundle bundle = this.a;
        if (mge == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", mge);
        }
    }
}
