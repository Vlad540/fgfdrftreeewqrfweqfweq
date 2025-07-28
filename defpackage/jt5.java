package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: jt5  reason: default package */
public final class jt5 implements h9e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jt5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(j9e j9e) {
        sz9 tabItem;
        Object obj;
        String str = null;
        switch (this.a) {
            case 0:
                View view = j9e.e;
                gda gda = view instanceof gda ? (gda) view : null;
                if (!(gda == null || (tabItem = gda.getTabItem()) == null)) {
                    str = tabItem.a;
                }
                ((a30) this.b).y0 = str;
                return;
            case 1:
                int i = 0;
                if (j9e.d > 0) {
                    k77[] k77Arr = NeuroAvatarsScreen.Q0;
                    ((NeuroAvatarsScreen) this.b).l0().setExpanded(false);
                }
                k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
                rj9 q0 = ((NeuroAvatarsScreen) this.b).q0();
                int i2 = j9e.d;
                if (i2 != q0.Y) {
                    Set keySet = ((Map) q0.C0.getValue()).keySet();
                    boolean z = keySet instanceof List;
                    if (z) {
                        obj = ((List) keySet).get(i2);
                    } else {
                        v23 v23 = new v23(i2);
                        if (z) {
                            List list = (List) keySet;
                            if (i2 < 0 || i2 >= list.size()) {
                                v23.invoke(Integer.valueOf(i2));
                                throw null;
                            }
                            obj = list.get(i2);
                        } else if (i2 >= 0) {
                            int i3 = 0;
                            for (Object next : keySet) {
                                int i4 = i3 + 1;
                                if (i2 == i3) {
                                    obj = next;
                                } else {
                                    i3 = i4;
                                }
                            }
                            v23.invoke(Integer.valueOf(i2));
                            throw null;
                        } else {
                            v23.invoke(Integer.valueOf(i2));
                            throw null;
                        }
                    }
                    int intValue = ((Number) obj).intValue();
                    Iterator it = ((List) q0.X.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (((mi9) it.next()).c != intValue) {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    q0.Y = i2;
                    q0.z0.g(new ni9(i2, valueOf));
                    return;
                }
                return;
            case 2:
                ((ViewPager) this.b).setCurrentItem(j9e.d);
                return;
            default:
                ((ViewPager2) this.b).e(j9e.d, true);
                return;
        }
    }
}
