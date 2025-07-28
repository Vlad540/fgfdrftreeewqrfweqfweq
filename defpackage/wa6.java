package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: wa6  reason: default package */
public final class wa6 {
    public static void a(Context context, om7 om7) {
        int i = nm7.a;
        la6 la6 = new la6(context, l0g.A0, nk.d, ka6.c);
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest();
        kjd.W(100);
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        pm7 pm7 = new pm7(arrayList, false, false);
        bq0 bq0 = new bq0();
        bq0.c = true;
        bq0.d = new ple(pm7);
        bq0.b = 2426;
        n6g c = la6.c(0, bq0.a());
        c.i(new va6(om7));
        Objects.requireNonNull(om7);
        c.c(cee.a, new va6(om7));
    }
}
