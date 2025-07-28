package defpackage;

import android.location.Location;
import android.view.MenuItem;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* renamed from: vle  reason: default package */
public final class vle implements tle, jh7 {
    public final Object a;

    public /* synthetic */ vle(Object obj) {
        this.a = obj;
    }

    public void a(Object obj) {
        ta6 ta6 = (ta6) obj;
        ta6.getClass();
        List list = ((LocationResult) this.a).a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        ta6.a.c.p1(new dm7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((wle) this.a).g.onMenuItemSelected(0, menuItem);
    }
}
